import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "Lclient!td;")
	public static final Class191 aClass191_4 = new Class191();

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "Lclient!ik;")
	public static final Class103 aClass103_33 = new Class103(8);

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lclient!ig;I)V")
	public static void method3412(@OriginalArg(0) Class101 arg0) {
		Static169.aClass101_1 = arg0;
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBLjava/awt/Component;Lclient!bd;I)Lclient!aq;")
	public static Class15 method3414(@OriginalArg(0) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) Class21 arg2, @OriginalArg(4) int arg3) {
		if (Static172.anInt2667 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class15 local36 = (Class15) Class.forName("Class15_Sub2").getDeclaredConstructor().newInstance();
			local36.anIntArray674 = new int[(Static103.aBoolean170 ? 2 : 1) * 256];
			local36.anInt5248 = arg3;
			local36.method4469(arg1);
			local36.anInt5249 = (arg3 & 0xFFFFFC00) + 1024;
			if (local36.anInt5249 > 16384) {
				local36.anInt5249 = 16384;
			}
			local36.method4470(local36.anInt5249);
			if (Static164.anInt3419 > 0 && Static202.aClass133_1 == null) {
				Static202.aClass133_1 = new Class133();
				Static202.aClass133_1.aClass21_5 = arg2;
				arg2.method375(Static164.anInt3419, Static202.aClass133_1);
			}
			if (Static202.aClass133_1 != null) {
				if (Static202.aClass133_1.aClass15Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static202.aClass133_1.aClass15Array1[arg0] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class15_Sub1 local117 = new Class15_Sub1(arg2, arg0);
				local117.anInt5248 = arg3;
				local117.anIntArray674 = new int[(Static103.aBoolean170 ? 2 : 1) * 256];
				local117.method4469(arg1);
				local117.anInt5249 = 16384;
				local117.method4470(local117.anInt5249);
				if (Static164.anInt3419 > 0 && Static202.aClass133_1 == null) {
					Static202.aClass133_1 = new Class133();
					Static202.aClass133_1.aClass21_5 = arg2;
					arg2.method375(Static164.anInt3419, Static202.aClass133_1);
				}
				if (Static202.aClass133_1 != null) {
					if (Static202.aClass133_1.aClass15Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static202.aClass133_1.aClass15Array1[arg0] = local117;
				}
				return local117;
			} catch (@Pc(179) Throwable local179) {
				return new Class15();
			}
		}
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V")
	public static void method3415() {
		if (Static62.anInt1605 > 1) {
			Static62.anInt1605--;
			Static320.anInt6129 = Static34.anInt776;
		}
		if (Static108.anInt1315 > 0) {
			Static108.anInt1315--;
		}
		if (Static168.aBoolean259) {
			Static168.aBoolean259 = false;
			Static141.method2850();
			return;
		}
		if (!Static169.aBoolean260) {
			Static223.method3942();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static140.method2823(); local35++) {
		}
		if (Static85.anInt2215 != 30) {
			return;
		}
		Static9.method150(Static29.aClass7_Sub3_Sub2_1);
		@Pc(59) Object local59 = Static339.aClass158_1.anObject7;
		@Pc(86) int local86;
		@Pc(88) int local88;
		@Pc(90) int local90;
		@Pc(105) int local105;
		@Pc(126) int local126;
		@Pc(191) int local191;
		@Pc(198) int local198;
		synchronized (Static339.aClass158_1.anObject7) {
			if (!Static217.aBoolean482) {
				Static339.aClass158_1.anInt4704 = 0;
			} else if (Static354.anInt6682 != 0 || Static339.aClass158_1.anInt4704 >= 40) {
				Static29.aClass7_Sub3_Sub2_1.method2799(146);
				Static29.aClass7_Sub3_Sub2_1.method2735(0);
				local86 = Static29.aClass7_Sub3_Sub2_1.anInt3005;
				local88 = 0;
				for (local90 = 0; Static339.aClass158_1.anInt4704 > local90 && Static29.aClass7_Sub3_Sub2_1.anInt3005 - local86 < 240; local90++) {
					local88++;
					local105 = Static339.aClass158_1.anIntArray627[local90];
					if (local105 < 0) {
						local105 = 0;
					} else if (local105 > 65534) {
						local105 = 65534;
					}
					local126 = Static339.aClass158_1.anIntArray628[local90];
					if (local126 < 0) {
						local126 = 0;
					} else if (local126 > 65534) {
						local126 = 65534;
					}
					@Pc(144) boolean local144 = false;
					if (Static339.aClass158_1.anIntArray627[local90] == -1 && Static339.aClass158_1.anIntArray628[local90] == -1) {
						local105 = -1;
						local144 = true;
						local126 = -1;
					}
					if (Static122.anInt2753 != local126 || local105 != Static299.anInt5776) {
						local191 = local126 - Static122.anInt2753;
						Static122.anInt2753 = local126;
						local198 = local105 - Static299.anInt5776;
						Static299.anInt5776 = local105;
						if (Static299.anInt5778 < 8 && local191 >= -32 && local191 <= 31 && local198 >= -32 && local198 <= 31) {
							local191 += 32;
							local198 += 32;
							Static29.aClass7_Sub3_Sub2_1.method2788((local191 << 6) + (Static299.anInt5778 << 12) + local198);
							Static299.anInt5778 = 0;
						} else if (Static299.anInt5778 < 32 && local191 >= -128 && local191 <= 127 && local198 >= -128 && local198 <= 127) {
							Static29.aClass7_Sub3_Sub2_1.method2735(Static299.anInt5778 + 128);
							local198 += 128;
							local191 += 128;
							Static29.aClass7_Sub3_Sub2_1.method2788(local198 + (local191 << 8));
							Static299.anInt5778 = 0;
						} else if (Static299.anInt5778 < 32) {
							Static29.aClass7_Sub3_Sub2_1.method2735(Static299.anInt5778 + 192);
							if (local144) {
								Static29.aClass7_Sub3_Sub2_1.method2765(Integer.MIN_VALUE);
							} else {
								Static29.aClass7_Sub3_Sub2_1.method2765(local105 << 16 | local126);
							}
							Static299.anInt5778 = 0;
						} else {
							Static29.aClass7_Sub3_Sub2_1.method2788(Static299.anInt5778 + 57344);
							if (local144) {
								Static29.aClass7_Sub3_Sub2_1.method2765(Integer.MIN_VALUE);
							} else {
								Static29.aClass7_Sub3_Sub2_1.method2765(local126 | local105 << 16);
							}
							Static299.anInt5778 = 0;
						}
					} else if (Static299.anInt5778 < 2047) {
						Static299.anInt5778++;
					}
				}
				Static29.aClass7_Sub3_Sub2_1.method2768(Static29.aClass7_Sub3_Sub2_1.anInt3005 - local86);
				if (local88 >= Static339.aClass158_1.anInt4704) {
					Static339.aClass158_1.anInt4704 = 0;
				} else {
					Static339.aClass158_1.anInt4704 -= local88;
					for (local105 = 0; local105 < Static339.aClass158_1.anInt4704; local105++) {
						Static339.aClass158_1.anIntArray628[local105] = Static339.aClass158_1.anIntArray628[local105 + local88];
						Static339.aClass158_1.anIntArray627[local105] = Static339.aClass158_1.anIntArray627[local88 + local105];
					}
				}
			}
		}
		if (Static354.anInt6682 != 0) {
			@Pc(421) long local421 = (Static169.aLong124 - Static147.aLong109) / 50L;
			if (local421 > 32767L) {
				local421 = 32767L;
			}
			Static147.aLong109 = Static169.aLong124;
			local86 = Static108.anInt1312;
			if (local86 < 0) {
				local86 = 0;
			} else if (local86 > 65535) {
				local86 = 65535;
			}
			local88 = Static169.anInt3518;
			if (local88 < 0) {
				local88 = 0;
			} else if (local88 > 65535) {
				local88 = 65535;
			}
			@Pc(466) byte local466 = 0;
			if (Static354.anInt6682 == 2) {
				local466 = 1;
			}
			local105 = (int) local421;
			Static29.aClass7_Sub3_Sub2_1.method2799(59);
			Static29.aClass7_Sub3_Sub2_1.method2788(local466 << 15 | local105);
			Static29.aClass7_Sub3_Sub2_1.method2746(local88 | local86 << 16);
		}
		if (Static210.anInt4202 > 0) {
			Static210.anInt4202--;
		}
		if (Static13.aBoolean10 && Static210.anInt4202 <= 0) {
			Static13.aBoolean10 = false;
			Static210.anInt4202 = 20;
			Static29.aClass7_Sub3_Sub2_1.method2799(103);
			Static29.aClass7_Sub3_Sub2_1.method2780((int) Static18.aFloat7 >> 3);
			Static29.aClass7_Sub3_Sub2_1.method2788((int) Static351.aFloat80 >> 3);
		}
		if (Static71.aBoolean130 && !Static196.aBoolean299) {
			Static196.aBoolean299 = true;
			Static29.aClass7_Sub3_Sub2_1.method2799(92);
			Static29.aClass7_Sub3_Sub2_1.method2735(1);
		}
		if (!Static71.aBoolean130 && Static196.aBoolean299) {
			Static196.aBoolean299 = false;
			Static29.aClass7_Sub3_Sub2_1.method2799(92);
			Static29.aClass7_Sub3_Sub2_1.method2735(0);
		}
		if (!Static35.aBoolean77) {
			Static29.aClass7_Sub3_Sub2_1.method2799(50);
			Static29.aClass7_Sub3_Sub2_1.method2765(Static180.method3312());
			Static35.aBoolean77 = true;
		}
		if (Static74.aBoolean141) {
			Static74.aBoolean141 = false;
		} else {
			Static321.aFloat76 /= 2.0F;
		}
		if (Static142.aBoolean235) {
			Static142.aBoolean235 = false;
		} else {
			Static290.aFloat73 /= 2.0F;
		}
		Static85.method1791();
		if (Static85.anInt2215 != 30) {
			return;
		}
		Static122.method2570();
		Static130.method2639();
		Static347.method5579();
		Static229.anInt4565++;
		if (Static229.anInt4565 > 750) {
			Static141.method2850();
			return;
		}
		Static73.method1455();
		Static13.method196();
		Static231.method4055();
		for (@Pc(660) int local660 = Static80.method1709(true); local660 != -1; local660 = Static80.method1709(false)) {
			Static75.method1501(local660);
			Static235.anIntArray626[Static88.anInt3953++ & 0x1F] = local660;
		}
		@Pc(736) Class26 local736;
		@Pc(1120) int local1120;
		for (@Pc(686) Class7_Sub1_Sub15 local686 = Static127.method2610(); local686 != null; local686 = Static127.method2610()) {
			local88 = local686.method4792();
			local90 = local686.method4793();
			if (local88 == 1) {
				Static165.anIntArray464[local90] = local686.anInt5687;
				Static261.aBoolean372 |= Static120.aBooleanArray17[local90];
				Static225.anIntArray605[Static184.anInt3750++ & 0x1F] = local90;
			} else if (local88 == 2) {
				Static210.aStringArray38[local90] = local686.aString363;
				Static42.anIntArray192[Static237.anInt4702++ & 0x1F] = local90;
			} else if (local88 == 3) {
				local736 = Static245.method4231(local90);
				if (!local686.aString363.equals(local736.aString42)) {
					local736.aString42 = local686.aString363;
					Static245.method4226(local736);
				}
			} else if (local88 == 4) {
				local736 = Static245.method4231(local90);
				local126 = local686.anInt5687;
				local1120 = local686.anInt5696;
				local191 = local686.anInt5692;
				if (local736.anInt564 != local126 || local736.anInt516 != local1120 || local736.anInt511 != local191) {
					local736.anInt516 = local1120;
					local736.anInt511 = local191;
					local736.anInt564 = local126;
					Static245.method4226(local736);
				}
			} else if (local88 == 5) {
				local736 = Static245.method4231(local90);
				if (local736.anInt488 != local686.anInt5687 || local686.anInt5687 == -1) {
					local736.anInt567 = 0;
					local736.anInt488 = local686.anInt5687;
					local736.anInt541 = 0;
					local736.anInt554 = 1;
					Static245.method4226(local736);
				}
			} else if (local88 == 6) {
				local105 = local686.anInt5687;
				local126 = local105 >> 10 & 0x1F;
				local1120 = local105 >> 5 & 0x1F;
				local191 = local105 & 0x1F;
				local198 = (local191 << 3) + (local1120 << 11) + (local126 << 19);
				@Pc(1140) Class26 local1140 = Static245.method4231(local90);
				if (local198 != local1140.anInt527) {
					local1140.anInt527 = local198;
					Static245.method4226(local1140);
				}
			} else if (local88 == 7) {
				local736 = Static245.method4231(local90);
				@Pc(785) boolean local785 = local686.anInt5687 == 1;
				if (local736.aBoolean39 != local785) {
					local736.aBoolean39 = local785;
					Static245.method4226(local736);
				}
			} else if (local88 == 8) {
				local736 = Static245.method4231(local90);
				if (local686.anInt5687 != local736.anInt525 || local736.anInt565 != local686.anInt5696 || local686.anInt5692 != local736.anInt531) {
					local736.anInt531 = local686.anInt5692;
					local736.anInt565 = local686.anInt5696;
					local736.anInt525 = local686.anInt5687;
					if (local736.anInt526 != -1) {
						if (local736.anInt563 > 0) {
							local736.anInt531 = local736.anInt531 * 32 / local736.anInt563;
						} else if (local736.anInt483 > 0) {
							local736.anInt531 = local736.anInt531 * 32 / local736.anInt483;
						}
					}
					Static245.method4226(local736);
				}
			} else if (local88 == 9) {
				local736 = Static245.method4231(local90);
				if (local736.anInt526 != local686.anInt5687 || local736.anInt510 != local686.anInt5696) {
					local736.anInt510 = local686.anInt5696;
					local736.anInt526 = local686.anInt5687;
					Static245.method4226(local736);
				}
			} else if (local88 == 10) {
				local736 = Static245.method4231(local90);
				if (local736.anInt528 != local686.anInt5687 || local686.anInt5696 != local736.anInt505 || local686.anInt5692 != local736.anInt482) {
					local736.anInt482 = local686.anInt5692;
					local736.anInt505 = local686.anInt5696;
					local736.anInt528 = local686.anInt5687;
					Static245.method4226(local736);
				}
			} else if (local88 == 11) {
				local736 = Static245.method4231(local90);
				local736.anInt540 = local736.anInt562 = local686.anInt5687;
				local736.aByte11 = 0;
				local736.aByte10 = 0;
				local736.anInt519 = local736.anInt514 = local686.anInt5696;
				Static245.method4226(local736);
			} else if (local88 == 12) {
				local736 = Static245.method4231(local90);
				local126 = local686.anInt5687;
				if (local736 != null && local736.anInt520 == 0) {
					if (local736.anInt548 - local736.anInt515 < local126) {
						local126 = local736.anInt548 - local736.anInt515;
					}
					if (local126 < 0) {
						local126 = 0;
					}
					if (local736.anInt499 != local126) {
						local736.anInt499 = local126;
						Static245.method4226(local736);
					}
				}
			} else if (local88 == 13) {
				local736 = Static245.method4231(local90);
				local736.anInt536 = local686.anInt5687;
			} else if (local88 == 14) {
				local736 = Static245.method4231(local90);
				local736.anInt573 = local686.anInt5687;
			} else if (local88 == 15) {
				Static35.anInt1025 = local686.anInt5687;
				Static259.anInt5013 = local686.anInt5696;
				Static35.aBoolean78 = true;
			}
		}
		Static105.anInt6011++;
		if (Static154.anInt3271 != 0) {
			Static342.anInt6494 += 20;
			if (Static342.anInt6494 >= 400) {
				Static154.anInt3271 = 0;
			}
		}
		if (Static41.aClass26_10 != null) {
			Static271.anInt5363++;
			if (Static271.anInt5363 >= 15) {
				Static245.method4226(Static41.aClass26_10);
				Static41.aClass26_10 = null;
			}
		}
		@Pc(1286) Class26 local1286 = Static337.aClass26_30;
		@Pc(1288) Class26 local1288 = Static58.aClass26_11;
		Static337.aClass26_30 = null;
		Static76.aClass26_14 = null;
		Static250.aBoolean359 = false;
		Static58.aClass26_11 = null;
		Static263.aBoolean381 = false;
		Static126.anInt2794 = 0;
		while (Static294.method5318() && Static126.anInt2794 < 128) {
			if (!Static258.method4342() || Static59.aChar2 != '`' && Static59.aChar2 != '§') {
				Static175.anIntArray492[Static126.anInt2794] = Static113.anInt2572;
				Static286.anIntArray713[Static126.anInt2794] = Static59.aChar2;
				Static126.anInt2794++;
			} else if (Static116.method2472()) {
				Static123.method5685();
			} else {
				Static14.method202();
			}
		}
		if (Static116.method2472()) {
			Static184.method3385();
		}
		Static116.aClass26_18 = null;
		Static296.method5032(-1, -1, null);
		Static153.method2990(-1, -1, null);
		if (Static161.anInt3337 != -1) {
			Static185.method3389(Static214.anInt4266, Static161.anInt3337, 0, 0, 0, 0, Static128.anInt2823);
		}
		Static34.anInt776++;
		if (Static116.aClass26_18 != null) {
			Static23.method4816();
		}
		if (Static312.aBoolean433) {
			Static29.aClass7_Sub3_Sub2_1.method2799(144);
			Static29.aClass7_Sub3_Sub2_1.method2733(Static138.anInt3017 | Static91.anInt5965 << 14 | Static182.anInt3698 << 28);
			Static312.aBoolean433 = false;
		}
		while (true) {
			@Pc(1428) Class26 local1428;
			@Pc(1417) Class26 local1417;
			@Pc(1412) Class7_Sub25 local1412;
			do {
				local1412 = (Class7_Sub25) Static129.aClass74_19.method1792();
				if (local1412 == null) {
					while (true) {
						do {
							local1412 = (Class7_Sub25) Static255.aClass74_28.method1792();
							if (local1412 == null) {
								while (true) {
									do {
										local1412 = (Class7_Sub25) Static247.aClass74_34.method1792();
										if (local1412 == null) {
											if (Static116.aClass26_18 == null) {
												Static108.anInt1313 = 0;
											}
											if (Static60.aClass26_13 != null) {
												Static206.method3668();
											}
											if (Static244.anInt4842 > 0 && Static17.aBooleanArray24[82] && Static17.aBooleanArray24[81] && Static111.anInt2544 != 0) {
												local105 = Static168.anInt3508 - Static111.anInt2544;
												if (local105 < 0) {
													local105 = 0;
												} else if (local105 > 3) {
													local105 = 3;
												}
												Static262.method4384(local105, Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray666[0] + Static350.anInt6609, Static237.anInt4696 + Static252.aClass22_Sub2_Sub1_Sub1_4.anIntArray665[0]);
											}
											Static301.method4876();
											if (Static169.aClass26_20 != null) {
												Static245.method4226(Static169.aClass26_20);
												Static197.anInt3885++;
												if (Static226.anInt4551 + 5 < Static240.anInt6396 || Static226.anInt4551 - 5 > Static240.anInt6396 || Static354.anInt6688 + 5 < Static100.anInt2436 || Static100.anInt2436 < Static354.anInt6688 - 5) {
													Static97.aBoolean164 = true;
												}
												if (Static180.anInt3668 == 0) {
													if (Static97.aBoolean164 && Static197.anInt3885 >= 5) {
														if (Static162.aClass26_17 == Static169.aClass26_20 && Static26.anInt501 != Static69.anInt1714) {
															local736 = Static169.aClass26_20;
															@Pc(1660) byte local1660 = 0;
															if (Static57.anInt1470 == 1 && local736.anInt557 == 206) {
																local1660 = 1;
															}
															if (local736.anIntArray72[Static26.anInt501] <= 0) {
																local1660 = 0;
															}
															if (local1660 == 1) {
																local1120 = Static69.anInt1714;
																local191 = Static26.anInt501;
																while (local1120 != local191) {
																	if (local1120 > local191) {
																		local736.method432(local1120, local1120 - 1);
																		local1120--;
																	} else if (local191 > local1120) {
																		local736.method432(local1120, local1120 + 1);
																		local1120++;
																	}
																}
															} else {
																local736.method432(Static69.anInt1714, Static26.anInt501);
															}
															Static29.aClass7_Sub3_Sub2_1.method2799(49);
															Static29.aClass7_Sub3_Sub2_1.method2765(Static169.aClass26_20.anInt492);
															Static29.aClass7_Sub3_Sub2_1.method2785(Static26.anInt501);
															Static29.aClass7_Sub3_Sub2_1.method2788(Static69.anInt1714);
															Static29.aClass7_Sub3_Sub2_1.method2735(local1660);
														}
													} else if ((Static214.anInt4265 == 1 || Static46.method1057()) && Static33.anInt735 > 2) {
														Static73.method1453();
													} else if (Static252.method5170()) {
														Static330.method5267();
													}
													Static354.anInt6682 = 0;
													Static169.aClass26_20 = null;
													Static271.anInt5363 = 10;
												}
											}
											if (local1286 != Static337.aClass26_30) {
												if (local1286 != null) {
													Static245.method4226(local1286);
												}
												if (Static337.aClass26_30 != null) {
													Static245.method4226(Static337.aClass26_30);
												}
											}
											if (Static58.aClass26_11 != local1288 && Static299.anInt5777 == Static97.anInt2397) {
												if (local1288 != null) {
													Static245.method4226(local1288);
												}
												if (Static58.aClass26_11 != null) {
													Static245.method4226(Static58.aClass26_11);
												}
											}
											if (Static58.aClass26_11 == null) {
												if (Static97.anInt2397 > 0) {
													Static97.anInt2397--;
												}
											} else if (Static299.anInt5777 > Static97.anInt2397) {
												Static97.anInt2397++;
												if (Static97.anInt2397 == Static299.anInt5777) {
													Static245.method4226(Static58.aClass26_11);
												}
											}
											for (local105 = 0; local105 < 5; local105++) {
												@Pc(1851) int local1851 = Static14.anIntArray35[local105]++;
											}
											local126 = Static154.method2992();
											local1120 = Static27.method480();
											if (local126 > 15000 && local1120 > 15000) {
												Static108.anInt1315 = 250;
												Static49.method1086(14500);
												Static29.aClass7_Sub3_Sub2_1.method2799(84);
											}
											if (Static261.aBoolean372 && Static153.aLong112 < Static335.method5308() - 60000L) {
												Static288.method1007();
											}
											Static26.anInt521++;
											if (Static26.anInt521 > 500) {
												Static26.anInt521 = 0;
												local191 = (int) (Math.random() * 8.0D);
												if ((local191 & 0x1) == 1) {
													Static302.anInt6436 += Static105.anInt6016;
												}
												if ((local191 & 0x2) == 2) {
													Static254.anInt4937 += Static243.anInt4797;
												}
												if ((local191 & 0x4) == 4) {
													Static91.anInt5969 += Static171.anInt3573;
												}
											}
											if (Static302.anInt6436 < -50) {
												Static105.anInt6016 = 2;
											}
											if (Static254.anInt4937 < -55) {
												Static243.anInt4797 = 2;
											}
											if (Static302.anInt6436 > 50) {
												Static105.anInt6016 = -2;
											}
											if (Static254.anInt4937 > 55) {
												Static243.anInt4797 = -2;
											}
											if (Static91.anInt5969 < -40) {
												Static171.anInt3573 = 1;
											}
											if (Static91.anInt5969 > 40) {
												Static171.anInt3573 = -1;
											}
											Static157.anInt3287++;
											if (Static157.anInt3287 > 500) {
												Static157.anInt3287 = 0;
												local191 = (int) (Math.random() * 8.0D);
												if ((local191 & 0x2) == 2) {
													Static49.anInt1359 += Static160.anInt3335;
												}
												if ((local191 & 0x1) == 1) {
													Static218.anInt4347 += Static218.anInt4344;
												}
											}
											if (Static218.anInt4347 < -60) {
												Static218.anInt4344 = 2;
											}
											if (Static218.anInt4347 > 60) {
												Static218.anInt4344 = -2;
											}
											if (Static49.anInt1359 < -20) {
												Static160.anInt3335 = 1;
											}
											Static68.anInt1704++;
											if (Static49.anInt1359 > 10) {
												Static160.anInt3335 = -1;
											}
											if (Static68.anInt1704 > 50) {
												Static29.aClass7_Sub3_Sub2_1.method2799(210);
											}
											if (Static262.aBoolean373) {
												Static75.method1498();
												Static262.aBoolean373 = false;
											}
											try {
												if (Static193.aClass61_1 != null && Static29.aClass7_Sub3_Sub2_1.anInt3005 > 0) {
													Static193.aClass61_1.method1377(Static29.aClass7_Sub3_Sub2_1.aByteArray33, Static29.aClass7_Sub3_Sub2_1.anInt3005);
													Static29.aClass7_Sub3_Sub2_1.anInt3005 = 0;
													Static68.anInt1704 = 0;
													return;
												}
												return;
											} catch (@Pc(2083) IOException local2083) {
												Static141.method2850();
												return;
											}
										}
										local1417 = local1412.aClass26_22;
										if (local1417.anInt550 < 0) {
											break;
										}
										local1428 = Static245.method4231(local1417.anInt530);
									} while (local1428 == null || local1428.aClass26Array1 == null || local1417.anInt550 >= local1428.aClass26Array1.length || local1417 != local1428.aClass26Array1[local1417.anInt550]);
									Static83.method1766(local1412);
								}
							}
							local1417 = local1412.aClass26_22;
							if (local1417.anInt550 < 0) {
								break;
							}
							local1428 = Static245.method4231(local1417.anInt530);
						} while (local1428 == null || local1428.aClass26Array1 == null || local1428.aClass26Array1.length <= local1417.anInt550 || local1417 != local1428.aClass26Array1[local1417.anInt550]);
						Static83.method1766(local1412);
					}
				}
				local1417 = local1412.aClass26_22;
				if (local1417.anInt550 < 0) {
					break;
				}
				local1428 = Static245.method4231(local1417.anInt530);
			} while (local1428 == null || local1428.aClass26Array1 == null || local1428.aClass26Array1.length <= local1417.anInt550 || local1428.aClass26Array1[local1417.anInt550] != local1417);
			Static83.method1766(local1412);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static175.anInt3624++;
		Static109.anInt63 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static54.anInt1423; local7 < Static41.anInt1075; local7++) {
			@Pc(12) Class49[][] local12 = Static229.aClass49ArrayArrayArray6[local7];
			for (local14 = Static350.anInt6599; local14 < Static63.anInt5457; local14++) {
				for (@Pc(17) int local17 = Static220.anInt4388; local17 < Static35.anInt1035; local17++) {
					@Pc(24) Class49 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static65.aBooleanArrayArray1[local14 + Static52.anInt1395 - Static314.anInt6028][local17 + Static52.anInt1395 - Static206.anInt4117] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean117 = true;
							local24.aBoolean116 = true;
							if (local24.aClass47_3 == null) {
								local24.aBoolean118 = false;
							} else {
								local24.aBoolean118 = true;
							}
							Static109.anInt63++;
						} else {
							local24.aBoolean117 = false;
							local24.aBoolean116 = false;
							local24.aByte30 = 0;
							if (local14 >= Static314.anInt6028 - 16 && local14 <= Static314.anInt6028 + 16 && local17 >= Static206.anInt4117 - 16 && local17 <= Static206.anInt4117 + 16 && (local24.aClass22_Sub4_1 != null || local24.aClass22_Sub4_2 != null || local24.aClass22_Sub5_2 != null || local24.aClass22_Sub5_1 != null || local24.aClass22_Sub1_1 != null || local24.aClass47_3 != null)) {
								Static220.aClass11_1.method2943(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static251.aClass8Array6 == Static331.aClass8Array5;
		for (local14 = Static54.anInt1423; local14 < Static41.anInt1075; local14++) {
			@Pc(161) float local161 = local145 ? 202.0F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static331.aClass89_8.method5393() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static65.aBooleanArrayArray1.length;
				if (Static350.anInt6599 + Static65.aBooleanArrayArray1.length > Static346.anInt6536) {
					local172 -= Static350.anInt6599 + Static65.aBooleanArrayArray1.length - Static346.anInt6536;
				}
				@Pc(192) int local192 = Static65.aBooleanArrayArray1[0].length;
				if (Static220.anInt4388 + Static65.aBooleanArrayArray1[0].length > Static174.anInt3604) {
					local192 -= Static220.anInt4388 + Static65.aBooleanArrayArray1[0].length - Static174.anInt3604;
				}
				@Pc(213) int local213 = Static100.anInt2437;
				while (true) {
					if (local213 >= local172) {
						Static220.aClass11_1.method2938(local161, true, local14, Static331.aClass8Array5[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static350.anInt6599 - Static100.anInt2437;
					for (@Pc(222) int local222 = Static338.anInt6378; local222 < local192; local222++) {
						Static86.aBooleanArrayArray2[local213][local222] = false;
						if (Static65.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static220.anInt4388 - Static338.anInt6378;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static229.aClass49ArrayArrayArray6[local243][local220][local241] != null && Static229.aClass49ArrayArrayArray6[local243][local220][local241].aByte24 == local14) {
									Static86.aBooleanArrayArray2[local213][local222] = Static229.aClass49ArrayArrayArray6[local243][local220][local241].aBoolean117;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static220.aClass11_1.method2938(local161, false, local14, Static331.aClass8Array5[local14]);
			}
			Static220.aClass11_1.method2942();
		}
		if (!Static192.method3460(true)) {
			Static192.method3460(false);
		}
	}
}
