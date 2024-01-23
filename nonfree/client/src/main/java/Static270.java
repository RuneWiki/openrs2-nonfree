import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static270 {

	@OriginalMember(owner = "client!tf", name = "m", descriptor = "Lclient!ph;")
	public static Class138 aClass138_72;

	@OriginalMember(owner = "client!tf", name = "n", descriptor = "I")
	public static int anInt5143;

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
	public static int anInt5144;

	@OriginalMember(owner = "client!tf", name = "d", descriptor = "Lclient!th;")
	public static Class169 aClass169_140 = new Class169(64);

	@OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
	public static int anInt5141 = 0;

	@OriginalMember(owner = "client!tf", name = "k", descriptor = "Lclient!th;")
	public static Class169 aClass169_141 = new Class169(2);

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public static void method3982() {
		if (Static212.anInt4177 > 0) {
			Static212.anInt4177--;
		}
		if (Static122.anInt2466 > 1) {
			Static122.anInt2466--;
			Static220.anInt5820 = Static314.anInt5908;
		}
		if (Static67.aBoolean109) {
			Static67.aBoolean109 = false;
			Static274.method4065();
			return;
		}
		@Pc(34) int local34;
		for (local34 = 0; local34 < 100 && Static212.method3355(); local34++) {
		}
		if (Static258.anInt5016 != 30) {
			return;
		}
		Static6.method95(Static137.aClass1_Sub14_Sub1_6);
		@Pc(57) Object local57 = Static190.aClass145_1.anObject6;
		@Pc(82) int local82;
		@Pc(91) int local91;
		@Pc(119) int local119;
		@Pc(114) int local114;
		@Pc(195) int local195;
		@Pc(190) int local190;
		synchronized (Static190.aClass145_1.anObject6) {
			if (!Static215.aBoolean289) {
				Static190.aClass145_1.anInt4336 = 0;
			} else if (Static86.anInt1565 != 0 || Static190.aClass145_1.anInt4336 >= 40) {
				Static137.aClass1_Sub14_Sub1_6.method2661(209);
				local82 = 0;
				Static137.aClass1_Sub14_Sub1_6.method2631(0);
				@Pc(89) int local89 = Static137.aClass1_Sub14_Sub1_6.anInt3290;
				for (local91 = 0; local91 < Static190.aClass145_1.anInt4336 && Static137.aClass1_Sub14_Sub1_6.anInt3290 - local89 < 240; local91++) {
					local82++;
					local114 = Static190.aClass145_1.anIntArray351[local91];
					local119 = Static190.aClass145_1.anIntArray350[local91];
					if (local114 < 0) {
						local114 = 0;
					} else if (local114 > 65534) {
						local114 = 65534;
					}
					@Pc(136) boolean local136 = false;
					if (local119 < 0) {
						local119 = 0;
					} else if (local119 > 65534) {
						local119 = 65534;
					}
					if (Static190.aClass145_1.anIntArray350[local91] == -1 && Static190.aClass145_1.anIntArray351[local91] == -1) {
						local136 = true;
						local119 = -1;
						local114 = -1;
					}
					if (Static261.anInt5044 != local114 || local119 != Static39.anInt788) {
						local190 = local119 - Static39.anInt788;
						local195 = local114 - Static261.anInt5044;
						Static39.anInt788 = local119;
						Static261.anInt5044 = local114;
						if (Static123.anInt2497 < 8 && local195 >= -32 && local195 <= 31 && local190 >= -32 && local190 <= 31) {
							local190 += 32;
							local195 += 32;
							Static137.aClass1_Sub14_Sub1_6.method2637((local195 << 6) + (Static123.anInt2497 << 12) + local190);
							Static123.anInt2497 = 0;
						} else if (Static123.anInt2497 < 32 && local195 >= -128 && local195 <= 127 && local190 >= -128 && local190 <= 127) {
							local195 += 128;
							local190 += 128;
							Static137.aClass1_Sub14_Sub1_6.method2631(Static123.anInt2497 + 128);
							Static137.aClass1_Sub14_Sub1_6.method2637((local195 << 8) + local190);
							Static123.anInt2497 = 0;
						} else if (Static123.anInt2497 >= 32) {
							Static137.aClass1_Sub14_Sub1_6.method2637(Static123.anInt2497 + 57344);
							if (local136) {
								Static137.aClass1_Sub14_Sub1_6.method2630(Integer.MIN_VALUE);
							} else {
								Static137.aClass1_Sub14_Sub1_6.method2630(local114 | local119 << 16);
							}
							Static123.anInt2497 = 0;
						} else {
							Static137.aClass1_Sub14_Sub1_6.method2631(Static123.anInt2497 + 192);
							if (local136) {
								Static137.aClass1_Sub14_Sub1_6.method2630(Integer.MIN_VALUE);
							} else {
								Static137.aClass1_Sub14_Sub1_6.method2630(local119 << 16 | local114);
							}
							Static123.anInt2497 = 0;
						}
					} else if (Static123.anInt2497 < 2047) {
						Static123.anInt2497++;
					}
				}
				Static137.aClass1_Sub14_Sub1_6.method2650(Static137.aClass1_Sub14_Sub1_6.anInt3290 - local89);
				if (local82 < Static190.aClass145_1.anInt4336) {
					Static190.aClass145_1.anInt4336 -= local82;
					for (local91 = 0; local91 < Static190.aClass145_1.anInt4336; local91++) {
						Static190.aClass145_1.anIntArray351[local91] = Static190.aClass145_1.anIntArray351[local91 + local82];
						Static190.aClass145_1.anIntArray350[local91] = Static190.aClass145_1.anIntArray350[local91 + local82];
					}
				} else {
					Static190.aClass145_1.anInt4336 = 0;
				}
			}
		}
		if (Static86.anInt1565 != 0) {
			@Pc(428) long local428 = (Static95.aLong195 - Static45.aLong44) / 50L;
			local91 = Static84.anInt1530;
			if (local91 < 0) {
				local91 = 0;
			} else if (local91 > 65535) {
				local91 = 65535;
			}
			Static45.aLong44 = Static95.aLong195;
			if (local428 > 32767L) {
				local428 = 32767L;
			}
			@Pc(454) byte local454 = 0;
			local82 = Static46.anInt894;
			local114 = (int) local428;
			if (local82 < 0) {
				local82 = 0;
			} else if (local82 > 65535) {
				local82 = 65535;
			}
			if (Static86.anInt1565 == 2) {
				local454 = 1;
			}
			Static137.aClass1_Sub14_Sub1_6.method2661(112);
			Static137.aClass1_Sub14_Sub1_6.method2644(local91 | local82 << 16);
			Static137.aClass1_Sub14_Sub1_6.method2618(local114 | local454 << 15);
		}
		if (Static263.anInt5078 > 0) {
			Static263.anInt5078--;
		}
		if (Static104.aBoolean149 && Static263.anInt5078 <= 0) {
			Static263.anInt5078 = 20;
			Static104.aBoolean149 = false;
			Static137.aClass1_Sub14_Sub1_6.method2661(79);
			Static137.aClass1_Sub14_Sub1_6.method2606((int) Static2.aFloat1);
			Static137.aClass1_Sub14_Sub1_6.method2637((int) Static15.aFloat2);
		}
		if (Static162.aBoolean235 && !Static283.aBoolean386) {
			Static283.aBoolean386 = true;
			Static137.aClass1_Sub14_Sub1_6.method2661(39);
			Static137.aClass1_Sub14_Sub1_6.method2631(1);
		}
		if (!Static162.aBoolean235 && Static283.aBoolean386) {
			Static283.aBoolean386 = false;
			Static137.aClass1_Sub14_Sub1_6.method2661(39);
			Static137.aClass1_Sub14_Sub1_6.method2631(0);
		}
		if (!Static152.aBoolean228) {
			Static137.aClass1_Sub14_Sub1_6.method2661(203);
			Static137.aClass1_Sub14_Sub1_6.method2597(Static27.method484());
			Static152.aBoolean228 = true;
		}
		if (Static17.aBoolean17) {
			Static17.aBoolean17 = false;
		} else {
			Static60.aFloat10 /= 2.0F;
		}
		if (Static245.aBoolean177) {
			Static245.aBoolean177 = false;
		} else {
			Static287.aFloat54 /= 2.0F;
		}
		Static104.method1644();
		if (Static258.anInt5016 != 30) {
			return;
		}
		Static16.method216();
		Static237.method2931();
		Static247.method3814();
		Static52.anInt1095++;
		if (Static52.anInt1095 > 750) {
			Static274.method4065();
			return;
		}
		Static152.method2501();
		Static280.method4153();
		Static68.method1144();
		for (local34 = Static83.method1244(true); local34 != -1; local34 = Static83.method1244(false)) {
			Static255.method3876(local34);
			Static148.anIntArray241[Static250.anInt3291++ & 0x1F] = local34;
		}
		@Pc(759) int local759;
		for (@Pc(686) Class1_Sub1_Sub2 local686 = Static68.method1141(); local686 != null; local686 = Static68.method1141()) {
			local82 = local686.method297();
			local91 = local686.method293();
			if (local82 == 1) {
				Static246.anIntArray443[local91] = local686.anInt293;
				Static157.anIntArray269[Static91.anInt1746++ & 0x1F] = local91;
			} else if (local82 == 2) {
				Static161.aStringArray28[local91] = local686.aString12;
				Static311.anIntArray532[Static272.anInt5177++ & 0x1F] = local91;
			} else {
				@Pc(750) Class146 local750;
				if (local82 == 3) {
					local750 = Static259.method3908(local91);
					if (!local686.aString12.equals(local750.aString146)) {
						local750.aString146 = local686.aString12;
						Static237.method2927(local750);
					}
				} else if (local82 == 4) {
					local750 = Static259.method3908(local91);
					local114 = local686.anInt293;
					local195 = local686.anInt294;
					local759 = local686.anInt296;
					if (local750.anInt4409 != local114 || local759 != local750.anInt4389 || local750.anInt4397 != local195) {
						local750.anInt4397 = local195;
						local750.anInt4389 = local759;
						local750.anInt4409 = local114;
						Static237.method2927(local750);
					}
				} else if (local82 == 5) {
					local750 = Static259.method3908(local91);
					if (local750.anInt4367 != local686.anInt293 || local686.anInt293 == -1) {
						local750.anInt4388 = 0;
						local750.anInt4367 = local686.anInt293;
						local750.anInt4353 = 0;
						local750.anInt4408 = 1;
						Static237.method2927(local750);
					}
				} else if (local82 == 6) {
					local119 = local686.anInt293;
					local114 = local119 >> 10 & 0x1F;
					local759 = local119 >> 5 & 0x1F;
					local195 = local119 & 0x1F;
					local190 = (local195 << 3) + (local759 << 11) + (local114 << 19);
					@Pc(1147) Class146 local1147 = Static259.method3908(local91);
					if (local190 != local1147.anInt4422) {
						local1147.anInt4422 = local190;
						Static237.method2927(local1147);
					}
				} else if (local82 == 7) {
					local750 = Static259.method3908(local91);
					@Pc(1092) boolean local1092 = local686.anInt293 == 1;
					if (local750.aBoolean312 != local1092) {
						local750.aBoolean312 = local1092;
						Static237.method2927(local750);
					}
				} else if (local82 == 8) {
					local750 = Static259.method3908(local91);
					if (local750.anInt4351 != local686.anInt293 || local686.anInt296 != local750.anInt4400 || local686.anInt294 != local750.anInt4366) {
						local750.anInt4400 = local686.anInt296;
						local750.anInt4351 = local686.anInt293;
						local750.anInt4366 = local686.anInt294;
						if (local750.anInt4405 != -1) {
							if (local750.anInt4402 > 0) {
								local750.anInt4366 = local750.anInt4366 * 32 / local750.anInt4402;
							} else if (local750.anInt4357 > 0) {
								local750.anInt4366 = local750.anInt4366 * 32 / local750.anInt4357;
							}
						}
						Static237.method2927(local750);
					}
				} else if (local82 == 9) {
					local750 = Static259.method3908(local91);
					if (local686.anInt293 != local750.anInt4405 || local750.anInt4344 != local686.anInt296) {
						local750.anInt4405 = local686.anInt293;
						local750.anInt4344 = local686.anInt296;
						Static237.method2927(local750);
					}
				} else if (local82 == 10) {
					local750 = Static259.method3908(local91);
					if (local750.anInt4343 != local686.anInt293 || local686.anInt296 != local750.anInt4432 || local686.anInt294 != local750.anInt4427) {
						local750.anInt4432 = local686.anInt296;
						local750.anInt4427 = local686.anInt294;
						local750.anInt4343 = local686.anInt293;
						Static237.method2927(local750);
					}
				} else if (local82 == 11) {
					local750 = Static259.method3908(local91);
					local750.anInt4340 = local750.anInt4413 = local686.anInt293;
					local750.aByte23 = 0;
					local750.aByte21 = 0;
					local750.anInt4385 = local750.anInt4382 = local686.anInt296;
					Static237.method2927(local750);
				} else if (local82 == 12) {
					local750 = Static259.method3908(local91);
					local114 = local686.anInt293;
					if (local750 != null && local750.anInt4370 == 0) {
						if (local114 > local750.anInt4383 - local750.anInt4371) {
							local114 = local750.anInt4383 - local750.anInt4371;
						}
						if (local114 < 0) {
							local114 = 0;
						}
						if (local750.anInt4418 != local114) {
							local750.anInt4418 = local114;
							Static237.method2927(local750);
						}
					}
				} else if (local82 == 13) {
					local750 = Static259.method3908(local91);
					local750.anInt4338 = local686.anInt293;
				} else if (local82 == 14) {
					local750 = Static259.method3908(local91);
					local750.anInt4406 = local686.anInt293;
				}
			}
		}
		if (Static195.anInt3969 != 0) {
			Static171.anInt3597 += 20;
			if (Static171.anInt3597 >= 400) {
				Static195.anInt3969 = 0;
			}
		}
		Static147.anInt2946++;
		if (Static97.aClass146_8 != null) {
			Static105.anInt2010++;
			if (Static105.anInt2010 >= 15) {
				Static237.method2927(Static97.aClass146_8);
				Static97.aClass146_8 = null;
			}
		}
		@Pc(1350) Class146 local1350;
		if (Static70.aClass146_5 != null) {
			Static237.method2927(Static70.aClass146_5);
			Static208.anInt4109++;
			if (Static152.anInt3132 > Static130.anInt2573 + 5 || Static130.anInt2573 - 5 > Static152.anInt3132 || Static137.anInt2717 + 5 < Static300.anInt5678 || Static300.anInt5678 < Static137.anInt2717 - 5) {
				Static107.aBoolean160 = true;
			}
			if (Static191.anInt3909 == 0) {
				if (Static107.aBoolean160 && Static208.anInt4109 >= 5) {
					if (Static70.aClass146_5 == Static173.aClass146_13 && Static49.anInt935 != Static61.anInt1206) {
						local1350 = Static70.aClass146_5;
						@Pc(1352) byte local1352 = 0;
						if (Static203.anInt4053 == 1 && local1350.anInt4350 == 206) {
							local1352 = 1;
						}
						if (local1350.anIntArray358[Static49.anInt935] <= 0) {
							local1352 = 0;
						}
						if (Static36.method643(local1350).method3232()) {
							local119 = Static61.anInt1206;
							local114 = Static49.anInt935;
							local1350.anIntArray358[local114] = local1350.anIntArray358[local119];
							local1350.anIntArray353[local114] = local1350.anIntArray353[local119];
							local1350.anIntArray358[local119] = -1;
							local1350.anIntArray353[local119] = 0;
						} else if (local1352 == 1) {
							local119 = Static61.anInt1206;
							local114 = Static49.anInt935;
							while (local119 != local114) {
								if (local119 > local114) {
									local1350.method3513(local119 - 1, local119);
									local119--;
								} else if (local119 < local114) {
									local1350.method3513(local119 + 1, local119);
									local119++;
								}
							}
						} else {
							local1350.method3513(Static49.anInt935, Static61.anInt1206);
						}
						Static137.aClass1_Sub14_Sub1_6.method2661(232);
						Static137.aClass1_Sub14_Sub1_6.method2637(Static49.anInt935);
						Static137.aClass1_Sub14_Sub1_6.method2639(local1352);
						Static137.aClass1_Sub14_Sub1_6.method2644(Static70.aClass146_5.anInt4355);
						Static137.aClass1_Sub14_Sub1_6.method2606(Static61.anInt1206);
					}
				} else if ((Static287.anInt5451 == 1 || Static277.method4117(Static316.anInt5941 - 1)) && Static316.anInt5941 > 2) {
					Static35.method598();
				} else if (Static316.anInt5941 > 0) {
					Static300.method4499();
				}
				Static86.anInt1565 = 0;
				Static70.aClass146_5 = null;
				Static105.anInt2010 = 10;
			}
		}
		Static19.aBoolean25 = false;
		Static265.anInt5102 = 0;
		local1350 = Static56.aClass146_4;
		@Pc(1499) Class146 local1499 = Static292.aClass146_18;
		Static292.aClass146_18 = null;
		Static26.aBoolean32 = false;
		Static173.aClass146_12 = null;
		Static56.aClass146_4 = null;
		while (Static154.method2655() && Static265.anInt5102 < 128) {
			Static301.anIntArray521[Static265.anInt5102] = Static137.anInt2718;
			Static20.anIntArray30[Static265.anInt5102] = Static243.aChar6;
			Static265.anInt5102++;
		}
		Static106.aClass146_9 = null;
		if (Static287.anInt5450 != -1) {
			Static15.method212(0, 0, Static159.anInt3348, 0, Static136.anInt2696, Static287.anInt5450, 0);
		}
		Static314.anInt5908++;
		if (Static106.aClass146_9 != null) {
			Static282.method4198();
		}
		while (true) {
			@Pc(1577) Class146 local1577;
			@Pc(1566) Class146 local1566;
			@Pc(1560) Class1_Sub29 local1560;
			do {
				local1560 = (Class1_Sub29) Static85.aClass24_13.method469();
				if (local1560 == null) {
					while (true) {
						do {
							local1560 = (Class1_Sub29) Static263.aClass24_25.method469();
							if (local1560 == null) {
								while (true) {
									do {
										local1560 = (Class1_Sub29) Static250.aClass24_19.method469();
										if (local1560 == null) {
											if (Static106.aClass146_9 == null) {
												Static119.anInt5879 = 0;
											}
											if (Static9.aClass146_11 != null) {
												Static209.method3312();
											}
											if (Static95.anInt5251 > 0 && Static88.aBooleanArray16[82] && Static88.aBooleanArray16[81] && Static26.anInt498 != 0) {
												local119 = Static295.anInt5586 - Static26.anInt498;
												if (local119 < 0) {
													local119 = 0;
												} else if (local119 > 3) {
													local119 = 3;
												}
												Static267.method3978(Static118.anInt2409 + Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local119, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0] + Static290.anInt5497);
											}
											if (Static95.anInt5251 > 0 && Static88.aBooleanArray16[82] && Static88.aBooleanArray16[81]) {
												if (Static211.anInt4150 != -1) {
													Static267.method3978(Static127.anInt2547 + Static118.anInt2409, Static295.anInt5586, Static290.anInt5497 + Static211.anInt4150);
												}
												Static73.anInt1412 = 0;
												Static183.anInt3702 = 0;
											} else if (Static183.anInt3702 == 2) {
												if (Static211.anInt4150 != -1) {
													Static137.aClass1_Sub14_Sub1_6.method2661(149);
													Static137.aClass1_Sub14_Sub1_6.method2637(Static81.anInt1490);
													Static137.aClass1_Sub14_Sub1_6.method2597(Static10.anInt180);
													Static137.aClass1_Sub14_Sub1_6.method2618(Static127.anInt2547 + Static118.anInt2409);
													Static137.aClass1_Sub14_Sub1_6.method2637(Static211.anInt4150 + Static290.anInt5497);
													Static171.anInt3597 = 0;
													anInt5141 = Static46.anInt894;
													Static195.anInt3969 = 1;
													Static225.anInt4442 = Static84.anInt1530;
												}
												Static183.anInt3702 = 0;
											} else if (Static73.anInt1412 == 2) {
												if (Static211.anInt4150 != -1) {
													Static137.aClass1_Sub14_Sub1_6.method2661(53);
													Static137.aClass1_Sub14_Sub1_6.method2606(Static118.anInt2409 + Static127.anInt2547);
													Static137.aClass1_Sub14_Sub1_6.method2606(Static290.anInt5497 + Static211.anInt4150);
													Static171.anInt3597 = 0;
													Static225.anInt4442 = Static84.anInt1530;
													Static195.anInt3969 = 1;
													anInt5141 = Static46.anInt894;
												}
												Static73.anInt1412 = 0;
											} else if (Static211.anInt4150 != -1 && Static183.anInt3702 == 0 && Static73.anInt1412 == 0) {
												local119 = (Static211.anInt4150 << 1) + 1 - Static229.aClass22_Sub3_Sub2_2.method3660() >> 1;
												local114 = (Static127.anInt2547 << 1) - (Static229.aClass22_Sub3_Sub2_2.method3660() - 1) >> 1;
												Static134.method2184(local119, 0, local114);
												Static171.anInt3597 = 0;
												anInt5141 = Static46.anInt894;
												Static225.anInt4442 = Static84.anInt1530;
												Static195.anInt3969 = 1;
												Static234.method3703(0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray427[0], 0, 0, 0, Static229.aClass22_Sub3_Sub2_2.anIntArray424[0], local119, local114);
											}
											Static211.anInt4150 = -1;
											Static108.method1779();
											if (local1350 != Static56.aClass146_4) {
												if (local1350 != null) {
													Static237.method2927(local1350);
												}
												if (Static56.aClass146_4 != null) {
													Static237.method2927(Static56.aClass146_4);
												}
											}
											if (local1499 != Static292.aClass146_18 && Static208.anInt4106 == Static121.anInt2450) {
												if (local1499 != null) {
													Static237.method2927(local1499);
												}
												if (Static292.aClass146_18 != null) {
													Static237.method2927(Static292.aClass146_18);
												}
											}
											if (Static292.aClass146_18 == null) {
												if (Static121.anInt2450 > 0) {
													Static121.anInt2450--;
												}
											} else if (Static121.anInt2450 < Static208.anInt4106) {
												Static121.anInt2450++;
												if (Static121.anInt2450 == Static208.anInt4106) {
													Static237.method2927(Static292.aClass146_18);
												}
											}
											for (local119 = 0; local119 < 5; local119++) {
												@Pc(2033) int local2033 = Static236.anIntArray432[local119]++;
											}
											local119 = Static81.method1234();
											local114 = Static88.method1305();
											if (local119 > 15000 && local114 > 15000) {
												Static212.anInt4177 = 250;
												Static286.method4254(14500);
												Static137.aClass1_Sub14_Sub1_6.method2661(143);
											}
											if (Static238.aClass10_10 != null && Static238.aClass10_10.anInt151 == 1) {
												if (Static238.aClass10_10.anObject1 != null) {
													Static183.method3027(Static68.aString43, Static207.aBoolean281);
												}
												Static238.aClass10_10 = null;
												Static68.aString43 = null;
												Static207.aBoolean281 = false;
											}
											Static273.anInt5203++;
											Static305.anInt5777++;
											Static76.anInt1429++;
											if (Static273.anInt5203 > 500) {
												local759 = (int) (Math.random() * 8.0D);
												if ((local759 & 0x2) == 2) {
													Static34.anInt617 += Static19.anInt387;
												}
												if ((local759 & 0x1) == 1) {
													Static89.anInt1629 += Static57.anInt1129;
												}
												if ((local759 & 0x4) == 4) {
													Static295.anInt5584 += Static38.anInt765;
												}
												Static273.anInt5203 = 0;
											}
											if (Static34.anInt617 < -55) {
												Static19.anInt387 = 2;
											}
											if (Static89.anInt1629 < -50) {
												Static57.anInt1129 = 2;
											}
											if (Static76.anInt1429 > 500) {
												Static76.anInt1429 = 0;
												local759 = (int) (Math.random() * 8.0D);
												if ((local759 & 0x1) == 1) {
													Static39.anInt794 += Static233.anInt4707;
												}
												if ((local759 & 0x2) == 2) {
													Static54.anInt1055 += Static276.anInt3470;
												}
											}
											if (Static39.anInt794 < -60) {
												Static233.anInt4707 = 2;
											}
											if (Static89.anInt1629 > 50) {
												Static57.anInt1129 = -2;
											}
											if (Static295.anInt5584 < -40) {
												Static38.anInt765 = 1;
											}
											if (Static34.anInt617 > 55) {
												Static19.anInt387 = -2;
											}
											if (Static54.anInt1055 < -20) {
												Static276.anInt3470 = 1;
											}
											if (Static39.anInt794 > 60) {
												Static233.anInt4707 = -2;
											}
											if (Static54.anInt1055 > 10) {
												Static276.anInt3470 = -1;
											}
											if (Static295.anInt5584 > 40) {
												Static38.anInt765 = -1;
											}
											if (Static305.anInt5777 > 50) {
												Static137.aClass1_Sub14_Sub1_6.method2661(122);
											}
											if (Static44.aBoolean70) {
												Static57.method978();
												Static44.aBoolean70 = false;
											}
											try {
												if (Static81.aClass7_2 != null && Static137.aClass1_Sub14_Sub1_6.anInt3290 > 0) {
													Static81.aClass7_2.method108(Static137.aClass1_Sub14_Sub1_6.aByteArray34, Static137.aClass1_Sub14_Sub1_6.anInt3290);
													Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
													Static305.anInt5777 = 0;
												}
											} catch (@Pc(2290) IOException local2290) {
												Static274.method4065();
											}
											return;
										}
										local1566 = local1560.aClass146_16;
										if (local1566.anInt4407 < 0) {
											break;
										}
										local1577 = Static259.method3908(local1566.anInt4416);
									} while (local1577 == null || local1577.aClass146Array2 == null || local1577.aClass146Array2.length <= local1566.anInt4407 || local1577.aClass146Array2[local1566.anInt4407] != local1566);
									Static171.method2886(local1560);
								}
							}
							local1566 = local1560.aClass146_16;
							if (local1566.anInt4407 < 0) {
								break;
							}
							local1577 = Static259.method3908(local1566.anInt4416);
						} while (local1577 == null || local1577.aClass146Array2 == null || local1566.anInt4407 >= local1577.aClass146Array2.length || local1577.aClass146Array2[local1566.anInt4407] != local1566);
						Static171.method2886(local1560);
					}
				}
				local1566 = local1560.aClass146_16;
				if (local1566.anInt4407 < 0) {
					break;
				}
				local1577 = Static259.method3908(local1566.anInt4416);
			} while (local1577 == null || local1577.aClass146Array2 == null || local1566.anInt4407 >= local1577.aClass146Array2.length || local1566 != local1577.aClass146Array2[local1566.anInt4407]);
			Static171.method2886(local1560);
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)Lclient!vk;")
	public static Class1_Sub1_Sub24 method3983(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub24 local10 = (Class1_Sub1_Sub24) Static299.aClass169_159.method4017((long) arg0);
		if (local10 != null) {
			return local10;
		}
		local10 = Static269.method419(arg0, Static277.aClass138_78, Static302.aClass138_87);
		if (local10 != null) {
			Static299.aClass169_159.method4016(local10, (long) arg0);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V")
	public static void method3987() {
		for (@Pc(11) Class1_Sub19 local11 = (Class1_Sub19) Static114.aClass24_16.method460(); local11 != null; local11 = (Class1_Sub19) Static114.aClass24_16.method464()) {
			if (local11.anInt3726 == -1) {
				local11.anInt3715 = 0;
				Static7.method109(local11);
			} else {
				local11.method4616();
			}
		}
	}
}
