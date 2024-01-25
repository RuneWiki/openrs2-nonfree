import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static240 {

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "Lclient!ar;")
	public static final Class14 aClass14_25 = new Class14();

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(I)V")
	public static void method4375() {
		@Pc(1) Class37 local1 = Static239.aClass37_46;
		synchronized (Static239.aClass37_46) {
			Static239.aClass37_46.method919();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!ni;ILclient!fp;Lclient!ii;)V")
	public static void method4377(@OriginalArg(0) Class1_Sub29 arg0, @OriginalArg(2) Class74 arg1, @OriginalArg(3) Class105 arg2) {
		@Pc(20) Class8 local20 = arg1.method1446(arg2);
		if (local20 == null) {
			return;
		}
		@Pc(26) int local26 = local20.method4383();
		if (local26 < local20.method4382()) {
			local26 = local20.method4382();
		}
		@Pc(38) int local38 = arg0.anInt4240;
		@Pc(41) int local41 = arg0.anInt4244;
		@Pc(43) int local43 = 0;
		@Pc(45) int local45 = 0;
		@Pc(47) int local47 = 0;
		@Pc(61) int local61;
		@Pc(84) int local84;
		if (arg1.aString71 != null) {
			local43 = Static273.aClass34_8.method797(Static200.aStringArray29, arg1.aString71, null, null);
			for (local61 = 0; local61 < local43; local61++) {
				@Pc(67) String local67 = Static200.aStringArray29[local61];
				if (local61 < local43 - 1) {
					local67 = local67.substring(0, local67.length() - 4);
				}
				local84 = Static342.aClass90_6.method1718(local67);
				if (local84 > local45) {
					local45 = local84;
				}
			}
			local47 = Static342.aClass90_6.method1717() * local43 + Static342.aClass90_6.method1714() / 2;
		}
		local61 = local26 / 2 + arg0.anInt4240;
		if (local26 + Static150.anInt2642 > local38) {
			local61 = local45 / 2 + Static150.anInt2642 + local26 / 2 + 10 + 5;
			local38 = Static150.anInt2642;
		} else if (local38 > Static150.anInt2640 - local26) {
			local38 = Static150.anInt2640 - local26;
			local61 = Static150.anInt2640 - local26 / 2 - local45 / 2 - 10 - 5;
		}
		@Pc(174) int local174 = arg0.anInt4244;
		if (local41 < Static150.anInt2635 + local26) {
			local41 = Static150.anInt2635;
			local174 = local26 / 2 + Static150.anInt2635 + 10;
		} else if (Static150.anInt2641 - local26 < local41) {
			local174 = Static150.anInt2641 - local26 / 2 - local47 - 10;
			local41 = Static150.anInt2641 - local26;
		}
		local84 = (int) (Math.atan2((double) (local38 - arg0.anInt4240), (double) (local41 - arg0.anInt4244)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local20.method4379((float) local38 + (float) local26 / 2.0F, (float) local26 / 2.0F + (float) local41, 4096, local84);
		@Pc(260) int local260 = -2;
		@Pc(262) int local262 = -2;
		@Pc(264) int local264 = -2;
		@Pc(266) int local266 = -2;
		local26 >>= 0x1;
		if (arg1.aString71 != null) {
			local262 = local174;
			local260 = local61 - local45 / 2 - 5;
			local266 = Static342.aClass90_6.method1717() * local43 + local174 + 3;
			local264 = local260 + local45 + 10;
			if (arg1.anInt1751 != 0) {
				arg2.method4225(local266 - local174, arg1.anInt1751, local264 - local260, local260, local174);
			}
			if (arg1.anInt1733 != 0) {
				arg2.method4293(local266 - local174, local260, local264 - local260, arg1.anInt1733, local174);
			}
			for (@Pc(337) int local337 = 0; local337 < local43; local337++) {
				@Pc(343) String local343 = Static200.aStringArray29[local337];
				if (local43 - 1 > local337) {
					local343 = local343.substring(0, local343.length() - 4);
				}
				Static342.aClass90_6.method1720(arg2, local343, local61, local174, arg1.anInt1723);
				local174 += Static342.aClass90_6.method1717();
			}
		}
		if ((Static208.anInt4358 <= local38 - local26 || Static208.anInt4358 >= local38 + local26 || local41 - local26 >= Static28.anInt538 || local41 + local26 <= Static28.anInt538) && (local260 >= Static208.anInt4358 || Static208.anInt4358 >= local264 || Static28.anInt538 <= local262 || Static28.anInt538 >= local266)) {
			return;
		}
		if (arg1.aStringArray14[4] != null) {
			Static169.method2996(0, -1, arg1.aStringArray14[4], (long) arg0.anInt4242, arg1.aString70, 1001, 0);
		}
		if (arg1.aStringArray14[3] != null) {
			Static169.method2996(0, -1, arg1.aStringArray14[3], (long) arg0.anInt4242, arg1.aString70, 1012, 0);
		}
		if (arg1.aStringArray14[2] != null) {
			Static169.method2996(0, -1, arg1.aStringArray14[2], (long) arg0.anInt4242, arg1.aString70, 1002, 0);
		}
		if (arg1.aStringArray14[1] != null) {
			Static169.method2996(0, -1, arg1.aStringArray14[1], (long) arg0.anInt4242, arg1.aString70, 1010, 0);
		}
		if (arg1.aStringArray14[0] != null) {
			Static169.method2996(0, -1, arg1.aStringArray14[0], (long) arg0.anInt4242, arg1.aString70, 1007, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBIII)V")
	public static void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		Static291.anInt5860 = 0;
		@Pc(167) int local167;
		@Pc(210) int local210;
		@Pc(378) int local378;
		@Pc(490) int local490;
		@Pc(265) int local265;
		@Pc(610) int local610;
		@Pc(433) int local433;
		for (@Pc(9) int local9 = -1; local9 < Static271.anInt5578 + Static167.anInt3454; local9++) {
			@Pc(13) Class60 local13 = null;
			@Pc(17) Class10_Sub1_Sub2 local17;
			if (local9 < 0) {
				local17 = Static127.aClass10_Sub1_Sub2_Sub2_1;
			} else if (local9 >= Static167.anInt3454) {
				local17 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local9 - Static167.anInt3454]];
				local13 = ((Class10_Sub1_Sub2_Sub1) local17).aClass60_1;
				if (local13.anIntArray109 != null) {
					local13 = local13.method1274();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local17 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local9]];
			}
			if (local17.anInt4052 >= 0) {
				Static192.method3378(local17.method3400(), arg0 >> 1, local17, arg2 >> 1);
				if (Static49.anIntArray493[0] >= 0) {
					if (local17.aString150 != null && (Static167.anInt3454 <= local9 || Static230.anInt4806 == 0 || Static230.anInt4806 == 3 || Static230.anInt4806 == 1 && Static251.method4513(((Class10_Sub1_Sub2_Sub2) local17).aString152)) && Static291.anInt5860 < Static86.anInt1646) {
						Static86.anIntArray132[Static291.anInt5860] = Static81.aClass34_4.method796(local17.aString150) / 2;
						Static86.anIntArray131[Static291.anInt5860] = Static49.anIntArray493[0];
						Static86.anIntArray133[Static291.anInt5860] = Static49.anIntArray493[1];
						Static86.anIntArray130[Static291.anInt5860] = local17.anInt4032;
						Static86.anIntArray129[Static291.anInt5860] = local17.anInt4055;
						Static86.anIntArray134[Static291.anInt5860] = local17.anInt4043;
						Static86.aStringArray10[Static291.anInt5860] = local17.aString150;
						Static291.anInt5860++;
					}
					@Pc(154) Class8 local154 = Static211.aClass8Array11[0];
					local167 = arg1 + Static49.anIntArray493[1] - Math.max(Static81.aClass34_4.anInt1003, local154.method4382());
					@Pc(178) Class8 local178;
					@Pc(277) int local277;
					if (!local17.aBoolean308 && local17.anInt4048 > Static282.anInt3516) {
						local178 = Static211.aClass8Array11[1];
						if (local17 instanceof Class10_Sub1_Sub2_Sub1) {
							@Pc(184) Class10_Sub1_Sub2_Sub1 local184 = (Class10_Sub1_Sub2_Sub1) local17;
							@Pc(193) Class8[] local193 = (Class8[]) Static9.aClass37_2.method915((long) local184.aClass60_1.lb);
							if (local193 == null) {
								@Pc(202) Class201[] local202 = Static369.method5470(Static125.aClass134_55, local184.aClass60_1.lb);
								if (local202 != null) {
									local193 = new Class8[local202.length];
									for (local210 = 0; local210 < local202.length; local210++) {
										local193[local210] = Static217.aClass105_5.method4238(local202[local210]);
									}
									Static9.aClass37_2.method922((long) local184.aClass60_1.lb, local193);
								}
							}
							if (local193 != null && local193.length == 2) {
								local178 = local193[1];
								local154 = local193[0];
							}
						}
						local265 = Static49.anIntArray493[0] + arg3 - (local154.method4383() >> 1);
						local154.method4393(local265, local167);
						local277 = local154.method4383() * local17.anInt4007 / 255;
						Static217.aClass105_5.method4265(local265, local167, local277 + local265, local154.method4382() + local167);
						local178.method4393(local265, local167);
						Static217.aClass105_5.method4268(arg3, arg1, arg3 + arg2, arg1 - -arg0);
					}
					local167 -= 2;
					if (!local17.aBoolean308) {
						if (Static282.anInt3516 < local17.anInt4045) {
							local178 = Static188.aClass8Array9[local17.aBoolean309 ? 2 : 0];
							@Pc(329) Class8 local329 = Static188.aClass8Array9[local17.aBoolean309 ? 3 : 1];
							if (local17 instanceof Class10_Sub1_Sub2_Sub1) {
								local277 = local13.anInt1514;
								if (local277 == -1) {
									local277 = local17.method3408().anInt2955;
								}
							} else {
								local277 = local17.method3408().anInt2955;
							}
							if (local277 != -1) {
								@Pc(363) Class8[] local363 = (Class8[]) Static89.aClass37_33.method915((long) local277);
								if (local363 == null) {
									@Pc(370) Class201[] local370 = Static369.method5470(Static125.aClass134_55, local277);
									if (local370 != null) {
										local363 = new Class8[local370.length];
										for (local378 = 0; local378 < local370.length; local378++) {
											local363[local378] = Static217.aClass105_5.method4238(local370[local378]);
										}
										Static89.aClass37_33.method922((long) local277, local363);
									}
								}
								if (local363 != null && local363.length == 4) {
									local178 = local363[local17.aBoolean309 ? 2 : 0];
									local329 = local363[local17.aBoolean309 ? 3 : 1];
								}
							}
							local433 = local17.anInt4045 - Static282.anInt3516;
							if (local17.anInt4017 >= local433) {
								local210 = local178.method4383();
							} else {
								local433 -= local17.anInt4017;
								local378 = local17.anInt4025 == 0 ? 0 : (local17.anInt4065 - local433) / local17.anInt4025 * local17.anInt4025;
								local210 = local378 * local178.method4383() / local17.anInt4065;
							}
							local378 = local178.method4382();
							local167 -= local378;
							local490 = Static49.anIntArray493[0] + arg3 - (local178.method4383() >> 1);
							local178.method4393(local490, local167);
							Static217.aClass105_5.method4265(local490, local167, local490 + local210, local378 + local167);
							local329.method4393(local490, local167);
							local167 -= 2;
							Static217.aClass105_5.method4268(arg3, arg1, arg2 + arg3, arg0 + arg1);
						}
						if (local9 < Static167.anInt3454) {
							@Pc(529) Class10_Sub1_Sub2_Sub2 local529 = (Class10_Sub1_Sub2_Sub2) local17;
							if (local529.anInt4094 != -1) {
								local167 -= 25;
								Static180.aClass8Array8[local529.anInt4094].method4393(arg3 + Static49.anIntArray493[0] - 12, local167);
								local167 -= 2;
							}
							if (local529.anInt4091 != -1) {
								local167 -= 25;
								Static28.aClass8Array2[local529.anInt4091].method4393(Static49.anIntArray493[0] + arg3 - 12, local167);
								local167 -= 2;
							}
						} else if (local13.anInt1519 >= 0 && Static28.aClass8Array2.length > local13.anInt1519) {
							local178 = Static28.aClass8Array2[local13.anInt1519];
							local167 -= 25;
							local178.method4393(arg3 + Static49.anIntArray493[0] - (local178.method4383() >> 1), local167);
							local167 -= 2;
						}
					}
					@Pc(612) Class65[] local612;
					@Pc(620) Class65 local620;
					@Pc(641) Class8 local641;
					if (!(local17 instanceof Class10_Sub1_Sub2_Sub2)) {
						local610 = 0;
						local612 = Static11.aClass65Array4;
						for (local277 = 0; local277 < local612.length; local277++) {
							local620 = local612[local277];
							if (local620 != null && local620.anInt1591 == 1 && local620.anInt1595 == Static79.anIntArray672[local9 - Static167.anInt3454]) {
								local641 = Static54.aClass8Array3[local620.anInt1587];
								if (local641.method4382() > local610) {
									local610 = local641.method4382();
								}
								if (Static282.anInt3516 % 20 < 10) {
									local641.method4393(arg3 + Static49.anIntArray493[0] - 12, local167 + -local641.method4382());
								}
							}
						}
						if (local610 > 0) {
						}
					} else if (local9 >= 0) {
						local610 = 0;
						local612 = Static11.aClass65Array4;
						for (local277 = 0; local277 < local612.length; local277++) {
							local620 = local612[local277];
							if (local620 != null && local620.anInt1591 == 10 && local620.anInt1595 == Static212.anIntArray415[local9]) {
								local641 = Static54.aClass8Array3[local620.anInt1587];
								if (local610 < local641.method4382()) {
									local610 = local641.method4382();
								}
								local641.method4393(Static49.anIntArray493[0] + arg3 - 12, local167 - local641.method4382());
							}
						}
						if (local610 > 0) {
						}
					}
					for (local610 = 0; local610 < 4; local610++) {
						if (local17.anIntArray384[local610] > Static282.anInt3516) {
							local265 = local17.method3400() / 2;
							Static192.method3378(local265, arg0 >> 1, local17, arg2 >> 1);
							if (Static49.anIntArray493[0] > -1) {
								if (local610 == 1) {
									Static49.anIntArray493[1] -= 20;
								}
								if (local610 == 2) {
									Static49.anIntArray493[1] -= 10;
									Static49.anIntArray493[0] -= 15;
								}
								if (local610 == 3) {
									Static49.anIntArray493[0] += 15;
									Static49.anIntArray493[1] -= 10;
								}
								Static352.aClass8Array16[local17.anIntArray385[local610]].method4393(Static49.anIntArray493[0] + arg3 - 12, arg1 + -12 + Static49.anIntArray493[1]);
								Static294.aClass29_4.method3746(arg3 + Static49.anIntArray493[0] - 1, Integer.toString(local17.anIntArray386[local610]), Static49.anIntArray493[1] + arg1 + 3, 0, -1);
							}
						}
					}
				}
			}
		}
		@Pc(906) int local906;
		for (@Pc(900) int local900 = 0; local900 < Static214.anInt4552; local900++) {
			local906 = Static319.anIntArray321[local900];
			@Pc(915) Class10_Sub1_Sub2 local915;
			if (local906 >= 2048) {
				local915 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local906 - 2048];
			} else {
				local915 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local906];
			}
			local167 = Static326.anIntArray554[local900];
			@Pc(932) Class10_Sub1_Sub2 local932;
			if (local167 < 2048) {
				local932 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local167];
			} else {
				local932 = Static178.aClass10_Sub1_Sub2_Sub1Array1[local167 - 2048];
			}
			Static350.method3752(arg0, arg1, local915, --local915.anInt4042, arg2, local932, arg3);
		}
		local906 = Static81.aClass34_4.anInt1003 + Static81.aClass34_4.anInt1017 + 2;
		for (@Pc(976) int local976 = 0; local976 < Static291.anInt5860; local976++) {
			local167 = Static86.anIntArray131[local976];
			local610 = Static86.anIntArray133[local976];
			local265 = Static86.anIntArray132[local976];
			@Pc(992) boolean local992 = true;
			while (local992) {
				local992 = false;
				for (local433 = 0; local433 < local976; local433++) {
					if (local610 + 2 > Static86.anIntArray133[local433] - local906 && Static86.anIntArray133[local433] + 2 > local610 + -local906 && Static86.anIntArray132[local433] + Static86.anIntArray131[local433] > local167 - local265 && Static86.anIntArray131[local433] - Static86.anIntArray132[local433] < local265 + local167 && Static86.anIntArray133[local433] - local906 < local610) {
						local992 = true;
						local610 = Static86.anIntArray133[local433] - local906;
					}
				}
			}
			Static86.anIntArray133[local976] = local610;
			@Pc(1077) String local1077 = Static86.aStringArray10[local976];
			if (Static174.anInt5775 == 0) {
				local210 = 16776960;
				if (Static86.anIntArray130[local976] < 6) {
					local210 = Static129.anIntArray266[Static86.anIntArray130[local976]];
				}
				if (Static86.anIntArray130[local976] == 6) {
					local210 = Static2.anInt30 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static86.anIntArray130[local976] == 7) {
					local210 = Static2.anInt30 % 20 >= 10 ? 65535 : 255;
				}
				if (Static86.anIntArray130[local976] == 8) {
					local210 = Static2.anInt30 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static86.anIntArray130[local976] == 9) {
					local378 = 150 - Static86.anIntArray134[local976];
					if (local378 < 50) {
						local210 = local378 * 1280 + 16711680;
					} else if (local378 < 100) {
						local210 = 16776960 - (local378 - 50) * 327680;
					} else if (local378 < 150) {
						local210 = local378 * 5 + 65280 - 500;
					}
				}
				if (Static86.anIntArray130[local976] == 10) {
					local378 = 150 - Static86.anIntArray134[local976];
					if (local378 < 50) {
						local210 = local378 * 5 + 16711680;
					} else if (local378 < 100) {
						local210 = 16384000 + 16711935 - local378 * 327680;
					} else if (local378 < 150) {
						local210 = local378 * 327680 + 255 - (local378 - 100) * 5 - 32768000;
					}
				}
				if (Static86.anIntArray130[local976] == 11) {
					local378 = 150 - Static86.anIntArray134[local976];
					if (local378 < 50) {
						local210 = 16777215 - local378 * 327685;
					} else if (local378 < 100) {
						local210 = (local378 - 50) * 327685 + 65280;
					} else if (local378 < 150) {
						local210 = 16777215 + 32768000 - local378 * 327680;
					}
				}
				local378 = local210 | 0xFF000000;
				if (Static86.anIntArray129[local976] == 0) {
					Static286.aClass29_3.method3746(arg3 + local167, local1077, arg1 + local610, -16777216, local378);
				}
				if (Static86.anIntArray129[local976] == 1) {
					Static286.aClass29_3.method3743(local378, local610 + arg1, local1077, local167 + arg3, Static2.anInt30);
				}
				if (Static86.anIntArray129[local976] == 2) {
					Static286.aClass29_3.method3756(local1077, local610 + arg1, local167 + arg3, local378, Static2.anInt30);
				}
				if (Static86.anIntArray129[local976] == 3) {
					Static286.aClass29_3.method3739(Static2.anInt30, local378, local167 + arg3, local610 + arg1, 150 - Static86.anIntArray134[local976], local1077);
				}
				if (Static86.anIntArray129[local976] == 4) {
					local490 = (150 - Static86.anIntArray134[local976]) * (Static81.aClass34_4.method796(local1077) + 100) / 150;
					Static217.aClass105_5.method4265(local167 + arg3 - 50, arg1, local167 + arg3 + 50, arg0 + arg1);
					Static286.aClass29_3.method3742(local610 + arg1, -16777216, local378, local1077, local167 + arg3 + 50 - local490);
					Static217.aClass105_5.method4268(arg3, arg1, arg2 + arg3, arg1 - -arg0);
				}
				if (Static86.anIntArray129[local976] == 5) {
					local490 = 150 - Static86.anIntArray134[local976];
					@Pc(1490) int local1490 = 0;
					if (local490 < 25) {
						local1490 = local490 - 25;
					} else if (local490 > 125) {
						local1490 = local490 - 125;
					}
					@Pc(1513) int local1513 = Static81.aClass34_4.anInt1003 + Static81.aClass34_4.anInt1017;
					Static217.aClass105_5.method4265(arg3, arg1 + local610 - local1513 - 1, arg3 + arg2, local610 + arg1 + 5);
					Static286.aClass29_3.method3746(local167 + arg3, local1077, local1490 + arg1 + local610, -16777216, local378);
					Static217.aClass105_5.method4268(arg3, arg1, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static286.aClass29_3.method3746(arg3 + local167, local1077, local610 + arg1, -16777216, -256);
			}
		}
	}
}
