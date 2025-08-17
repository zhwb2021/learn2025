package com.wbz.learn2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String sayHello(String name) {
        return "Hello From SpringBoot";
    }
}
