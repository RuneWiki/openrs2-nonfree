import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "I")
	public static int anInt5856 = 0;

	@OriginalMember(owner = "client!tb", name = "P", descriptor = "J")
	public static long aLong181 = 0L;

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V")
	public static void method5112() {
		if (Static127.anInt2393 > 0) {
			Static127.anInt2393--;
		}
		if (Static90.anInt1710 > 1) {
			Static173.anInt3081 = Static180.anInt3216;
			Static90.anInt1710--;
		}
		if (Static226.aBoolean325) {
			Static226.aBoolean325 = false;
			Static4.method188();
			return;
		}
		if (!Static48.aBoolean87) {
			Static347.method5296();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static10.method371(); local38++) {
		}
		if (Static344.anInt6327 != 30) {
			return;
		}
		Static360.method5466(Static39.aClass2_Sub13_Sub2_4, Static312.aClass41_166.method919());
		if (Static231.aClass2_Sub18_2 == null) {
			if (Static51.method979() >= Static92.aLong59) {
				Static231.aClass2_Sub18_2 = Static237.aClass193_1.method4677(Static329.aString57);
			}
		} else if (Static231.aClass2_Sub18_2.anInt2669 != -1) {
			Static19.method552(Static198.aClass41_114);
			Static39.aClass2_Sub13_Sub2_4.method4199(Static231.aClass2_Sub18_2.anInt2669);
			Static231.aClass2_Sub18_2 = null;
			Static92.aLong59 = Static51.method979() + 30000L;
		}
		@Pc(117) int local117;
		@Pc(138) int local138;
		@Pc(153) int local153;
		@Pc(168) boolean local168;
		@Pc(216) int local216;
		@Pc(223) int local223;
		@Pc(234) int local234;
		if (Static345.aClass2_Sub10_1 != null || Static51.method979() - 2000L > Static176.aLong103) {
			@Pc(114) boolean local114 = false;
			local117 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
			for (@Pc(122) Class2_Sub10 local122 = (Class2_Sub10) Static272.aClass210_33.method5035(); local122 != null && Static39.aClass2_Sub13_Sub2_4.anInt4788 - local117 < 240; local122 = (Class2_Sub10) Static272.aClass210_33.method5037()) {
				local122.method5745();
				local138 = local122.method1116();
				if (local138 < 0) {
					local138 = 0;
				} else if (local138 > 65534) {
					local138 = 65534;
				}
				local153 = local122.method1124();
				if (local153 < 0) {
					local153 = 0;
				} else if (local153 > 65534) {
					local153 = 65534;
				}
				local168 = false;
				if (local122.method1116() == -1 && local122.method1124() == -1) {
					local153 = -1;
					local138 = -1;
					local168 = true;
				}
				if (Static193.anInt6665 != local153 || local138 != Static37.anInt766) {
					if (!local114) {
						Static19.method552(Static358.aClass41_191);
						Static39.aClass2_Sub13_Sub2_4.method4207(0);
						local117 = Static39.aClass2_Sub13_Sub2_4.anInt4788;
						local114 = true;
					}
					local216 = local153 - Static193.anInt6665;
					Static193.anInt6665 = local153;
					local223 = local138 - Static37.anInt766;
					Static37.anInt766 = local138;
					local234 = (int) ((local122.method1122() - Static176.aLong103) / 20L);
					if (local234 < 8 && local216 >= -32 && local216 <= 31 && local223 >= -32 && local223 <= 31) {
						local216 += 32;
						local223 += 32;
						Static39.aClass2_Sub13_Sub2_4.method4199((local234 << 12) + (local216 << 6) + local223);
					} else if (local234 < 32 && local216 >= -128 && local216 <= 127 && local223 >= -128 && local223 <= 127) {
						local223 += 128;
						Static39.aClass2_Sub13_Sub2_4.method4207(local234 + 128);
						local216 += 128;
						Static39.aClass2_Sub13_Sub2_4.method4199(local223 + (local216 << 8));
					} else if (local234 >= 32) {
						Static39.aClass2_Sub13_Sub2_4.method4199(local234 + 57344);
						if (local168) {
							Static39.aClass2_Sub13_Sub2_4.method4218(Integer.MIN_VALUE);
						} else {
							Static39.aClass2_Sub13_Sub2_4.method4218(local153 | local138 << 16);
						}
					} else {
						Static39.aClass2_Sub13_Sub2_4.method4207(local234 + 192);
						if (local168) {
							Static39.aClass2_Sub13_Sub2_4.method4218(Integer.MIN_VALUE);
						} else {
							Static39.aClass2_Sub13_Sub2_4.method4218(local138 << 16 | local153);
						}
					}
					Static176.aLong103 = local122.method1122();
				}
			}
			if (local114) {
				Static39.aClass2_Sub13_Sub2_4.method4241(Static39.aClass2_Sub13_Sub2_4.anInt4788 - local117);
			}
		}
		@Pc(409) int local409;
		@Pc(453) int local453;
		if (Static345.aClass2_Sub10_1 != null) {
			@Pc(395) long local395 = (Static345.aClass2_Sub10_1.method1122() - Static267.aLong156) / 50L;
			if (local395 > 32767L) {
				local395 = 32767L;
			}
			Static267.aLong156 = Static345.aClass2_Sub10_1.method1122();
			local409 = Static345.aClass2_Sub10_1.method1116();
			if (local409 < 0) {
				local409 = 0;
			} else if (local409 > 65535) {
				local409 = 65535;
			}
			local138 = Static345.aClass2_Sub10_1.method1124();
			if (local138 < 0) {
				local138 = 0;
			} else if (local138 > 65535) {
				local138 = 65535;
			}
			@Pc(440) byte local440 = 0;
			if (Static345.aClass2_Sub10_1.method1120() == 2) {
				local440 = 1;
			}
			Static19.method552(Static168.aClass41_81);
			local453 = (int) local395;
			Static39.aClass2_Sub13_Sub2_4.method4224(local409 << 16 | local138);
			Static39.aClass2_Sub13_Sub2_4.method4199(local440 << 15 | local453);
		}
		@Pc(477) int local477;
		if (Static267.anInt4715 > 0) {
			local477 = 0;
			for (local117 = 0; local117 < Static267.anInt4715; local117++) {
				if (Static93.aClass15Array1[local117].method3590()) {
					local477++;
				}
			}
			if (local477 > 0) {
				Static19.method552(Static169.aClass41_82);
				if (local477 > 75) {
					local477 = 75;
				}
				Static39.aClass2_Sub13_Sub2_4.method4207(local477 * 3);
				for (local409 = 0; local409 < Static267.anInt4715; local409++) {
					@Pc(524) Class15 local524 = Static93.aClass15Array1[local409];
					if (local524.method3590()) {
						@Pc(537) long local537 = (local524.method3595() - Static123.aLong74) / 50L;
						Static123.aLong74 = local524.method3595();
						if (local537 > 65535L) {
							local537 = 65535L;
						}
						Static39.aClass2_Sub13_Sub2_4.method4207(local524.method3594());
						Static39.aClass2_Sub13_Sub2_4.method4199((int) local537);
					}
				}
			}
		}
		if (Static148.anInt2699 > 0) {
			Static148.anInt2699--;
		}
		if (Static92.aBoolean149 && Static148.anInt2699 <= 0) {
			Static148.anInt2699 = 20;
			Static92.aBoolean149 = false;
			Static19.method552(Static195.aClass41_107);
			Static39.aClass2_Sub13_Sub2_4.method4238((int) Static295.aFloat73 >> 3);
			Static39.aClass2_Sub13_Sub2_4.method4190((int) Static18.aFloat8 >> 3);
		}
		if (Static144.aBoolean199 && !Static267.aBoolean346) {
			Static267.aBoolean346 = true;
			Static19.method552(Static155.aClass41_80);
			Static39.aClass2_Sub13_Sub2_4.method4207(1);
		}
		if (!Static144.aBoolean199 && Static267.aBoolean346) {
			Static267.aBoolean346 = false;
			Static19.method552(Static155.aClass41_80);
			Static39.aClass2_Sub13_Sub2_4.method4207(0);
		}
		if (!Static218.aBoolean305) {
			Static19.method552(Static170.aClass41_85);
			Static39.aClass2_Sub13_Sub2_4.method4218(Static14.method435());
			Static218.aBoolean305 = true;
		}
		if (Static297.aClass227ArrayArrayArray7 != null) {
			if (Static283.anInt5017 == 2) {
				Static170.method2763();
			} else if (Static283.anInt5017 == 3) {
				Static144.method2461();
			}
		}
		if (Static73.aBoolean116) {
			Static73.aBoolean116 = false;
		} else {
			Static375.aFloat45 /= 2.0F;
		}
		if (Static66.aBoolean430) {
			Static66.aBoolean430 = false;
		} else {
			Static85.aFloat18 /= 2.0F;
		}
		Static301.method4728();
		if (Static344.anInt6327 != 30) {
			return;
		}
		Static94.method4860();
		Static142.method3054();
		Static318.method4088();
		Static9.method300();
		Static130.anInt2453++;
		if (Static130.anInt2453 > 750) {
			Static4.method188();
			return;
		}
		Static46.method910();
		Static233.method3811();
		Static165.method2711();
		for (local477 = Static248.aClass125_1.method2742(true); local477 != -1; local477 = Static248.aClass125_1.method2742(false)) {
			Static286.method4394(local477);
			Static197.anIntArray435[Static92.anInt1742++ & 0x1F] = local477;
		}
		@Pc(794) Class155 local794;
		for (@Pc(767) Class2_Sub1_Sub2 local767 = Static267.method4132(); local767 != null; local767 = Static267.method4132()) {
			local409 = local767.method407();
			local138 = local767.method411();
			if (local409 == 1) {
				Static61.anIntArray162[local138] = local767.anInt348;
				Static243.aBoolean331 |= Static267.aBooleanArray110[local138];
				Static242.anIntArray538[Static189.anInt5187++ & 0x1F] = local138;
			} else if (local409 == 2) {
				Static211.aStringArray22[local138] = local767.aString1;
				Static245.anIntArray543[Static297.anInt5975++ & 0x1F] = local138;
			} else if (local409 == 3) {
				local794 = Static240.method3886(local138);
				if (!local767.aString1.equals(local794.aString37)) {
					local794.aString37 = local767.aString1;
					Static295.method4664(local794);
				}
			} else if (local409 == 4) {
				local794 = Static240.method3886(local138);
				local453 = local767.anInt348;
				local216 = local767.anInt341;
				local223 = local767.anInt343;
				if (local453 != local794.anInt4188 || local216 != local794.anInt4193 || local794.anInt4140 != local223) {
					local794.anInt4193 = local216;
					local794.anInt4140 = local223;
					local794.anInt4188 = local453;
					Static295.method4664(local794);
				}
			} else if (local409 == 5) {
				local794 = Static240.method3886(local138);
				if (local794.anInt4178 != local767.anInt348 || local767.anInt348 == -1) {
					local794.anInt4203 = 0;
					local794.anInt4178 = local767.anInt348;
					local794.anInt4192 = 1;
					local794.anInt4133 = 0;
					Static295.method4664(local794);
				}
			} else if (local409 == 6) {
				local153 = local767.anInt348;
				local453 = local153 >> 10 & 0x1F;
				local216 = local153 >> 5 & 0x1F;
				local223 = local153 & 0x1F;
				local234 = (local223 << 3) + (local453 << 19) + (local216 << 11);
				@Pc(1218) Class155 local1218 = Static240.method3886(local138);
				if (local234 != local1218.anInt4165) {
					local1218.anInt4165 = local234;
					Static295.method4664(local1218);
				}
			} else if (local409 == 7) {
				local794 = Static240.method3886(local138);
				local168 = local767.anInt348 == 1;
				if (local168 != local794.aBoolean320) {
					local794.aBoolean320 = local168;
					Static295.method4664(local794);
				}
			} else if (local409 == 8) {
				local794 = Static240.method3886(local138);
				if (local767.anInt348 != local794.anInt4151 || local794.lb != local767.anInt341 || local767.anInt343 != local794.anInt4180) {
					local794.anInt4180 = local767.anInt343;
					local794.lb = local767.anInt341;
					local794.anInt4151 = local767.anInt348;
					if (local794.anInt4212 != -1) {
						if (local794.anInt4143 > 0) {
							local794.anInt4180 = local794.anInt4180 * 32 / local794.anInt4143;
						} else if (local794.anInt4181 > 0) {
							local794.anInt4180 = local794.anInt4180 * 32 / local794.anInt4181;
						}
					}
					Static295.method4664(local794);
				}
			} else if (local409 == 9) {
				local794 = Static240.method3886(local138);
				if (local794.anInt4212 != local767.anInt348 || local794.anInt4204 != local767.anInt341) {
					local794.anInt4204 = local767.anInt341;
					local794.anInt4212 = local767.anInt348;
					Static295.method4664(local794);
				}
			} else if (local409 == 10) {
				local794 = Static240.method3886(local138);
				if (local794.anInt4167 != local767.anInt348 || local794.anInt4134 != local767.anInt341 || local767.anInt343 != local794.anInt4199) {
					local794.anInt4167 = local767.anInt348;
					local794.anInt4134 = local767.anInt341;
					local794.anInt4199 = local767.anInt343;
					Static295.method4664(local794);
				}
			} else if (local409 == 11) {
				local794 = Static240.method3886(local138);
				local794.aByte41 = 0;
				local794.aByte43 = 0;
				local794.anInt4206 = local794.anInt4200 = local767.anInt341;
				local794.anInt4189 = local794.anInt4169 = local767.anInt348;
				Static295.method4664(local794);
			} else if (local409 == 12) {
				local794 = Static240.method3886(local138);
				local453 = local767.anInt348;
				if (local794 != null && local794.anInt4164 == 0) {
					if (local453 > local794.anInt4176 - local794.anInt4214) {
						local453 = local794.anInt4176 - local794.anInt4214;
					}
					if (local453 < 0) {
						local453 = 0;
					}
					if (local453 != local794.anInt4207) {
						local794.anInt4207 = local453;
						Static295.method4664(local794);
					}
				}
			} else if (local409 == 14) {
				local794 = Static240.method3886(local138);
				local794.anInt4168 = local767.anInt348;
			} else if (local409 == 15) {
				Static19.aBoolean29 = true;
				Static204.anInt3770 = local767.anInt341;
				Static292.anInt5161 = local767.anInt348;
			} else if (local409 == 16) {
				local794 = Static240.method3886(local138);
				local794.anInt4194 = local767.anInt348;
			}
		}
		Static346.anInt6113++;
		if (Static185.anInt3302 != 0) {
			Static258.anInt4003 += 20;
			if (Static258.anInt4003 >= 400) {
				Static185.anInt3302 = 0;
			}
		}
		if (Static335.aClass155_35 != null) {
			Static198.anInt3657++;
			if (Static198.anInt3657 >= 15) {
				Static295.method4664(Static335.aClass155_35);
				Static335.aClass155_35 = null;
			}
		}
		Static360.aClass155_37 = null;
		Static365.aClass155_13 = null;
		Static291.aBoolean382 = false;
		Static330.aBoolean447 = false;
		Static54.method1042(null, -1, -1);
		Static179.method2925(-1, -1, null);
		Static14.method433();
		Static180.anInt3216++;
		if (Static364.aBoolean380) {
			Static19.method552(Static271.aClass41_146);
			Static39.aClass2_Sub13_Sub2_4.method4210(Static290.anInt5135 << 28 | Static306.anInt5447 << 14 | Static360.anInt6350);
			Static364.aBoolean380 = false;
		}
		while (true) {
			@Pc(1394) Class2_Sub24 local1394;
			@Pc(1399) Class155 local1399;
			do {
				local1394 = (Class2_Sub24) Static194.aClass210_26.method5039();
				if (local1394 == null) {
					while (true) {
						do {
							local1394 = (Class2_Sub24) Static283.aClass210_34.method5039();
							if (local1394 == null) {
								while (true) {
									do {
										local1394 = (Class2_Sub24) Static351.aClass210_15.method5039();
										if (local1394 == null) {
											if (Static360.aClass155_37 == null) {
												Static388.anInt4033 = 0;
											}
											if (Static243.aClass155_26 != null) {
												Static384.method5703();
											}
											if (Static287.anInt5112 > 0 && Static129.aClass149_1.method3685(82) && Static129.aClass149_1.method3685(81) && Static32.anInt6038 != 0) {
												local409 = Static267.aClass12_Sub1_Sub2_Sub2_1.aByte74 - Static32.anInt6038;
												if (local409 < 0) {
													local409 = 0;
												} else if (local409 > 3) {
													local409 = 3;
												}
												Static278.method1452(Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray659[0] + Static376.anInt6607, Static133.anInt2474 + Static267.aClass12_Sub1_Sub2_Sub2_1.anIntArray658[0], local409);
											}
											Static72.method1297();
											for (local409 = 0; local409 < 5; local409++) {
												@Pc(1593) int local1593 = Static84.anIntArray214[local409]++;
											}
											if (Static243.aBoolean331 && Static51.method979() - 60000L > Static317.aLong174) {
												Static367.method5541();
											}
											Static357.anInt886++;
											if (Static357.anInt886 > 500) {
												Static357.anInt886 = 0;
												local138 = (int) (Math.random() * 8.0D);
												if ((local138 & 0x4) == 4) {
													Static303.anInt5443 += Static74.anInt4011;
												}
												if ((local138 & 0x1) == 1) {
													Static289.anInt5124 += Static284.anInt5041;
												}
												if ((local138 & 0x2) == 2) {
													Static77.anInt1491 += Static42.anInt917;
												}
											}
											if (Static289.anInt5124 < -50) {
												Static284.anInt5041 = 2;
											}
											if (Static289.anInt5124 > 50) {
												Static284.anInt5041 = -2;
											}
											if (Static77.anInt1491 < -55) {
												Static42.anInt917 = 2;
											}
											if (Static303.anInt5443 < -40) {
												Static74.anInt4011 = 1;
											}
											if (Static77.anInt1491 > 55) {
												Static42.anInt917 = -2;
											}
											Static392.anInt6750++;
											if (Static303.anInt5443 > 40) {
												Static74.anInt4011 = -1;
											}
											if (Static392.anInt6750 > 500) {
												Static392.anInt6750 = 0;
												local138 = (int) (Math.random() * 8.0D);
												if ((local138 & 0x1) == 1) {
													Static232.anInt4267 += Static362.anInt6404;
												}
												if ((local138 & 0x2) == 2) {
													Static48.anInt942 += Static60.anInt1210;
												}
											}
											if (Static232.anInt4267 < -60) {
												Static362.anInt6404 = 2;
											}
											if (Static48.anInt942 < -20) {
												Static60.anInt1210 = 1;
											}
											if (Static232.anInt4267 > 60) {
												Static362.anInt6404 = -2;
											}
											if (Static48.anInt942 > 10) {
												Static60.anInt1210 = -1;
											}
											Static69.anInt1312++;
											if (Static69.anInt1312 > 50) {
												Static19.method552(Static76.aClass41_37);
											}
											if (Static88.aBoolean145) {
												Static387.method5195();
												Static88.aBoolean145 = false;
											}
											try {
												if (Static169.aClass124_3 != null && Static39.aClass2_Sub13_Sub2_4.anInt4788 > 0) {
													Static333.anInt5834 += Static39.aClass2_Sub13_Sub2_4.anInt4788;
													Static169.aClass124_3.method2717(Static39.aClass2_Sub13_Sub2_4.anInt4788, Static39.aClass2_Sub13_Sub2_4.aByteArray77);
													Static69.anInt1312 = 0;
													Static39.aClass2_Sub13_Sub2_4.anInt4788 = 0;
													return;
												}
												return;
											} catch (@Pc(1803) IOException local1803) {
												Static4.method188();
												return;
											}
										}
										local1399 = local1394.aClass155_23;
										if (local1399.anInt4135 < 0) {
											break;
										}
										local794 = Static240.method3886(local1399.anInt4144);
									} while (local794 == null || local794.aClass155Array2 == null || local1399.anInt4135 >= local794.aClass155Array2.length || local794.aClass155Array2[local1399.anInt4135] != local1399);
									Static157.method2604(local1394);
								}
							}
							local1399 = local1394.aClass155_23;
							if (local1399.anInt4135 < 0) {
								break;
							}
							local794 = Static240.method3886(local1399.anInt4144);
						} while (local794 == null || local794.aClass155Array2 == null || local794.aClass155Array2.length <= local1399.anInt4135 || local794.aClass155Array2[local1399.anInt4135] != local1399);
						Static157.method2604(local1394);
					}
				}
				local1399 = local1394.aClass155_23;
				if (local1399.anInt4135 < 0) {
					break;
				}
				local794 = Static240.method3886(local1399.anInt4144);
			} while (local794 == null || local794.aClass155Array2 == null || local1399.anInt4135 >= local794.aClass155Array2.length || local1399 != local794.aClass155Array2[local1399.anInt4135]);
			Static157.method2604(local1394);
		}
	}
}
