package com.example.demo.controller;

import com.example.demo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xmaster
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/user/ok")
    public User getInfo() {
        User user = new User();
        user.setCode("11");
        user.setId("55");
        return user;
    }

    @RequestMapping(value = "/user/sleep50")
    public User sleep50() {
        User user = new User();
        user.setCode("11");

        user.setId("55");
        try {
            Thread.sleep(50000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @RequestMapping(value = "/user/sleep5")
    public User sleep5() {
        User user = new User();
        user.setCode("11");
        user.setId("55");
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }

    @RequestMapping(value = "/user/sleep10")
    public User sleep10() {
        User user = new User();
        user.setCode("11");
        user.setId("55");
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user;
    }
}
