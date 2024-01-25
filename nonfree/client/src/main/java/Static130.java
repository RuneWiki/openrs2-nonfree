import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!io", name = "K", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!io", name = "L", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray25 = new String[100];

	@OriginalMember(owner = "client!io", name = "N", descriptor = "I")
	public static int anInt2868 = 0;

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(B)J")
	public static long method2651() {
		return Static172.aClass62_1.method3917();
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)V")
	public static void method2652() {
		if (Static324.anInt6225 > 1) {
			Static324.anInt6225--;
			Static260.anInt5590 = Static314.anInt6116;
		}
		if (Static111.anInt2599 > 0) {
			Static111.anInt2599--;
		}
		if (Static225.aBoolean459) {
			Static225.aBoolean459 = false;
			Static198.method886();
			return;
		}
		if (!Static146.aBoolean308) {
			Static98.method2066();
		}
		for (@Pc(38) int local38 = 0; local38 < 100 && Static309.method5163(); local38++) {
		}
		if (Static295.anInt5811 != 30) {
			return;
		}
		Static93.method2019(Static342.aClass1_Sub8_Sub1_7);
		@Pc(73) int local73;
		@Pc(94) int local94;
		@Pc(112) int local112;
		@Pc(128) boolean local128;
		@Pc(175) int local175;
		@Pc(181) int local181;
		@Pc(192) int local192;
		if (Static305.aClass1_Sub21_1 != null || Static162.method3252() - 2000L > Static176.aLong122) {
			@Pc(70) boolean local70 = false;
			local73 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
			for (@Pc(78) Class1_Sub21 local78 = (Class1_Sub21) Static185.aClass16_21.method410(); local78 != null && Static342.aClass1_Sub8_Sub1_7.anInt5182 - local73 < 240; local78 = (Class1_Sub21) Static185.aClass16_21.method419()) {
				local78.method5628();
				local94 = local78.method2703();
				if (local94 < 0) {
					local94 = 0;
				} else if (local94 > 65534) {
					local94 = 65534;
				}
				local112 = local78.method2704();
				if (local112 < 0) {
					local112 = 0;
				} else if (local112 > 65534) {
					local112 = 65534;
				}
				local128 = false;
				if (local78.method2703() == -1 && local78.method2704() == -1) {
					local94 = -1;
					local112 = -1;
					local128 = true;
				}
				if (Static40.anInt1283 != local112 || local94 != Static287.anInt5744) {
					if (!local70) {
						Static342.aClass1_Sub8_Sub1_7.method3229(114);
						Static342.aClass1_Sub8_Sub1_7.method4562(0);
						local73 = Static342.aClass1_Sub8_Sub1_7.anInt5182;
						local70 = true;
					}
					local175 = local112 - Static40.anInt1283;
					Static40.anInt1283 = local112;
					local181 = local94 - Static287.anInt5744;
					Static287.anInt5744 = local94;
					local192 = (int) ((local78.method2700() - Static176.aLong122) / 20L);
					if (local192 < 8 && local175 >= -32 && local175 <= 31 && local181 >= -32 && local181 <= 31) {
						local181 += 32;
						local175 += 32;
						Static342.aClass1_Sub8_Sub1_7.method4542((local175 << 6) + (local192 << 12) + local181);
					} else if (local192 < 32 && local175 >= -128 && local175 <= 127 && local181 >= -128 && local181 <= 127) {
						local175 += 128;
						local181 += 128;
						Static342.aClass1_Sub8_Sub1_7.method4562(local192 + 128);
						Static342.aClass1_Sub8_Sub1_7.method4542((local175 << 8) + local181);
					} else if (local192 >= 32) {
						Static342.aClass1_Sub8_Sub1_7.method4542(local192 + 57344);
						if (local128) {
							Static342.aClass1_Sub8_Sub1_7.method4529(Integer.MIN_VALUE);
						} else {
							Static342.aClass1_Sub8_Sub1_7.method4529(local94 << 16 | local112);
						}
					} else {
						Static342.aClass1_Sub8_Sub1_7.method4562(local192 + 192);
						if (local128) {
							Static342.aClass1_Sub8_Sub1_7.method4529(Integer.MIN_VALUE);
						} else {
							Static342.aClass1_Sub8_Sub1_7.method4529(local94 << 16 | local112);
						}
					}
					Static176.aLong122 = local78.method2700();
				}
			}
			if (local70) {
				Static342.aClass1_Sub8_Sub1_7.method4566(Static342.aClass1_Sub8_Sub1_7.anInt5182 - local73);
			}
		}
		@Pc(367) int local367;
		@Pc(415) int local415;
		if (Static305.aClass1_Sub21_1 != null) {
			@Pc(351) long local351 = (Static305.aClass1_Sub21_1.method2700() - Static180.aLong125) / 50L;
			if (local351 > 32767L) {
				local351 = 32767L;
			}
			Static180.aLong125 = Static305.aClass1_Sub21_1.method2700();
			local367 = Static305.aClass1_Sub21_1.method2703();
			if (local367 < 0) {
				local367 = 0;
			} else if (local367 > 65535) {
				local367 = 65535;
			}
			local94 = Static305.aClass1_Sub21_1.method2704();
			if (local94 < 0) {
				local94 = 0;
			} else if (local94 > 65535) {
				local94 = 65535;
			}
			@Pc(395) byte local395 = 0;
			if (Static305.aClass1_Sub21_1.method2701() == 2) {
				local395 = 1;
			}
			Static342.aClass1_Sub8_Sub1_7.method3229(65);
			local415 = (int) local351;
			Static342.aClass1_Sub8_Sub1_7.method4564(local367 << 16 | local94);
			Static342.aClass1_Sub8_Sub1_7.method4561(local395 << 15 | local415);
		}
		@Pc(435) int local435;
		if (Static111.anInt2598 > 0) {
			local435 = 0;
			for (local73 = 0; local73 < Static111.anInt2598; local73++) {
				if (Static256.aClass85Array1[local73].method2449()) {
					local435++;
				}
			}
			if (local435 > 0) {
				Static342.aClass1_Sub8_Sub1_7.method3229(119);
				if (local435 > 75) {
					local435 = 75;
				}
				Static342.aClass1_Sub8_Sub1_7.method4562(local435 * 3);
				for (local367 = 0; local367 < Static111.anInt2598; local367++) {
					@Pc(488) Class85 local488 = Static256.aClass85Array1[local367];
					if (local488.method2449()) {
						@Pc(500) long local500 = (local488.method2446() - Static354.aLong215) / 50L;
						Static354.aLong215 = local488.method2446();
						if (local500 > 65535L) {
							local500 = 65535L;
						}
						Static342.aClass1_Sub8_Sub1_7.method4562(local488.method2448());
						Static342.aClass1_Sub8_Sub1_7.method4542((int) local500);
					}
				}
			}
		}
		if (Static202.anInt4253 > 0) {
			Static202.anInt4253--;
		}
		if (Static329.aBoolean614 && Static202.anInt4253 <= 0) {
			Static329.aBoolean614 = false;
			Static202.anInt4253 = 20;
			Static342.aClass1_Sub8_Sub1_7.method3229(84);
			Static342.aClass1_Sub8_Sub1_7.method4557((int) Static75.aFloat13 >> 3);
			Static342.aClass1_Sub8_Sub1_7.method4557((int) Static36.aFloat5 >> 3);
		}
		if (Static179.aBoolean359 && !Static175.aBoolean350) {
			Static175.aBoolean350 = true;
			Static342.aClass1_Sub8_Sub1_7.method3229(118);
			Static342.aClass1_Sub8_Sub1_7.method4562(1);
		}
		if (!Static179.aBoolean359 && Static175.aBoolean350) {
			Static175.aBoolean350 = false;
			Static342.aClass1_Sub8_Sub1_7.method3229(118);
			Static342.aClass1_Sub8_Sub1_7.method4562(0);
		}
		if (!Static269.aBoolean537) {
			Static342.aClass1_Sub8_Sub1_7.method3229(228);
			Static342.aClass1_Sub8_Sub1_7.method4523(Static286.method4905());
			Static269.aBoolean537 = true;
		}
		if (Static77.aClass194ArrayArrayArray1 != null) {
			if (Static147.anInt3204 == 2) {
				Static213.method4102();
			} else if (Static147.anInt3204 == 3) {
				Static340.method5487();
			}
		}
		if (Static253.aBoolean507) {
			Static253.aBoolean507 = false;
		} else {
			Static146.aFloat40 /= 2.0F;
		}
		if (Static119.aBoolean262) {
			Static119.aBoolean262 = false;
		} else {
			Static356.aFloat79 /= 2.0F;
		}
		Static225.method4220();
		if (Static295.anInt5811 != 30) {
			return;
		}
		Static95.method2047();
		Static202.method3831();
		Static355.method5668();
		Static314.anInt6117++;
		if (Static314.anInt6117 > 750) {
			Static198.method886();
			return;
		}
		Static50.method1305();
		Static263.method4657();
		Static295.method4967();
		for (local435 = Static168.method3364(true); local435 != -1; local435 = Static168.method3364(false)) {
			Static166.method3354(local435);
			Static157.anIntArray437[Static170.anInt3655++ & 0x1F] = local435;
		}
		@Pc(780) Class12 local780;
		for (@Pc(727) Class1_Sub4_Sub9 local727 = Static161.method3247(); local727 != null; local727 = Static161.method3247()) {
			local367 = local727.method1870();
			local94 = local727.method1865();
			if (local367 == 1) {
				Static183.anIntArray351[local94] = local727.anInt2142;
				Static7.aBoolean29 |= Static197.aBooleanArray20[local94];
				Static315.anIntArray498[Static137.anInt3036++ & 0x1F] = local94;
			} else if (local367 == 2) {
				Static95.aStringArray21[local94] = local727.aString23;
				Static351.anIntArray530[Static93.anInt2300++ & 0x1F] = local94;
			} else if (local367 == 3) {
				local780 = Static9.method319(local94);
				if (!local727.aString23.equals(local780.aString6)) {
					local780.aString6 = local727.aString23;
					Static6.method247(local780);
				}
			} else if (local367 == 4) {
				local780 = Static9.method319(local94);
				local415 = local727.anInt2142;
				local175 = local727.anInt2148;
				local181 = local727.anInt2145;
				if (local780.anInt433 != local415 || local175 != local780.anInt448 || local780.anInt394 != local181) {
					local780.anInt448 = local175;
					local780.anInt433 = local415;
					local780.anInt394 = local181;
					Static6.method247(local780);
				}
			} else if (local367 == 5) {
				local780 = Static9.method319(local94);
				if (local780.anInt441 != local727.anInt2142 || local727.anInt2142 == -1) {
					local780.anInt388 = 0;
					local780.anInt395 = 1;
					local780.anInt441 = local727.anInt2142;
					local780.anInt450 = 0;
					Static6.method247(local780);
				}
			} else if (local367 == 6) {
				local112 = local727.anInt2142;
				local415 = local112 >> 10 & 0x1F;
				local175 = local112 >> 5 & 0x1F;
				local181 = local112 & 0x1F;
				local192 = (local181 << 3) + (local415 << 19) + (local175 << 11);
				@Pc(862) Class12 local862 = Static9.method319(local94);
				if (local192 != local862.anInt405) {
					local862.anInt405 = local192;
					Static6.method247(local862);
				}
			} else if (local367 == 7) {
				local780 = Static9.method319(local94);
				local128 = local727.anInt2142 == 1;
				if (local128 != local780.aBoolean50) {
					local780.aBoolean50 = local128;
					Static6.method247(local780);
				}
			} else if (local367 == 8) {
				local780 = Static9.method319(local94);
				if (local727.anInt2142 != local780.anInt468 || local727.anInt2148 != local780.anInt396 || local780.anInt434 != local727.anInt2145) {
					local780.anInt468 = local727.anInt2142;
					local780.anInt396 = local727.anInt2148;
					local780.anInt434 = local727.anInt2145;
					if (local780.anInt406 != -1) {
						if (local780.anInt426 > 0) {
							local780.anInt434 = local780.anInt434 * 32 / local780.anInt426;
						} else if (local780.anInt420 > 0) {
							local780.anInt434 = local780.anInt434 * 32 / local780.anInt420;
						}
					}
					Static6.method247(local780);
				}
			} else if (local367 == 9) {
				local780 = Static9.method319(local94);
				if (local727.anInt2142 != local780.anInt406 || local727.anInt2148 != local780.anInt454) {
					local780.anInt454 = local727.anInt2148;
					local780.anInt406 = local727.anInt2142;
					Static6.method247(local780);
				}
			} else if (local367 == 10) {
				local780 = Static9.method319(local94);
				if (local780.anInt456 != local727.anInt2142 || local727.anInt2148 != local780.anInt403 || local727.anInt2145 != local780.anInt467) {
					local780.anInt467 = local727.anInt2145;
					local780.anInt403 = local727.anInt2148;
					local780.anInt456 = local727.anInt2142;
					Static6.method247(local780);
				}
			} else if (local367 == 11) {
				local780 = Static9.method319(local94);
				local780.anInt423 = local780.anInt464 = local727.anInt2142;
				local780.aByte5 = 0;
				local780.aByte4 = 0;
				local780.anInt447 = local780.anInt414 = local727.anInt2148;
				Static6.method247(local780);
			} else if (local367 == 12) {
				local780 = Static9.method319(local94);
				local415 = local727.anInt2142;
				if (local780 != null && local780.anInt416 == 0) {
					if (local415 > local780.anInt436 - local780.anInt446) {
						local415 = local780.anInt436 - local780.anInt446;
					}
					if (local415 < 0) {
						local415 = 0;
					}
					if (local780.anInt419 != local415) {
						local780.anInt419 = local415;
						Static6.method247(local780);
					}
				}
			} else if (local367 == 14) {
				local780 = Static9.method319(local94);
				local780.anInt458 = local727.anInt2142;
			} else if (local367 == 15) {
				Static266.anInt5402 = local727.anInt2148;
				Static99.anInt2377 = local727.anInt2142;
				Static47.aBoolean146 = true;
			} else if (local367 == 16) {
				local780 = Static9.method319(local94);
				local780.anInt430 = local727.anInt2142;
			}
		}
		Static303.anInt2311++;
		if (Static290.anInt5761 != 0) {
			Static44.anInt1403 += 20;
			if (Static44.anInt1403 >= 400) {
				Static290.anInt5761 = 0;
			}
		}
		if (Static226.aClass12_13 != null) {
			Static338.anInt6485++;
			if (Static338.anInt6485 >= 15) {
				Static6.method247(Static226.aClass12_13);
				Static226.aClass12_13 = null;
			}
		}
		Static315.aBoolean594 = false;
		Static244.aClass12_15 = null;
		Static198.aBoolean118 = false;
		Static72.aClass12_4 = null;
		Static163.method3262(null, -1, -1);
		Static13.method382(null, -1, -1);
		Static216.method4128();
		Static314.anInt6116++;
		if (Static129.aBoolean271) {
			Static342.aClass1_Sub8_Sub1_7.method3229(185);
			Static342.aClass1_Sub8_Sub1_7.method4564(Static72.anInt1932 << 14 | Static5.anInt194 << 28 | Static192.anInt4116);
			Static129.aBoolean271 = false;
		}
		while (true) {
			@Pc(1361) Class1_Sub16 local1361;
			@Pc(1366) Class12 local1366;
			do {
				local1361 = (Class1_Sub16) Static230.aClass16_27.method408();
				if (local1361 == null) {
					while (true) {
						do {
							local1361 = (Class1_Sub16) Static197.aClass16_25.method408();
							if (local1361 == null) {
								while (true) {
									do {
										local1361 = (Class1_Sub16) Static247.aClass16_28.method408();
										if (local1361 == null) {
											if (Static72.aClass12_4 == null) {
												Static174.anInt3787 = 0;
											}
											if (Static28.aClass12_3 != null) {
												Static23.method661();
											}
											if (Static342.anInt2998 > 0 && Static57.aClass171_1.method4638(82) && Static57.aClass171_1.method4638(81) && Static195.anInt4169 != 0) {
												local367 = Static242.anInt6745 - Static195.anInt4169;
												if (local367 < 0) {
													local367 = 0;
												} else if (local367 > 3) {
													local367 = 3;
												}
												Static88.method1916(Static32.anInt2224 + Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0], local367, Static234.anInt4783 + Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0]);
											}
											Static349.method5587();
											for (local367 = 0; local367 < 5; local367++) {
												@Pc(1556) int local1556 = Static238.anIntArray442[local367]++;
											}
											if (Static7.aBoolean29 && Static264.aLong202 < Static162.method3252() - 60000L) {
												Static119.method2550();
											}
											Static264.anInt6556++;
											if (Static264.anInt6556 > 500) {
												Static264.anInt6556 = 0;
												local94 = (int) (Math.random() * 8.0D);
												if ((local94 & 0x4) == 4) {
													Static36.anInt1199 += Static187.anInt4035;
												}
												if ((local94 & 0x2) == 2) {
													Static123.anInt2804 += Static309.anInt6064;
												}
												if ((local94 & 0x1) == 1) {
													Static148.anInt3244 += Static192.anInt4114;
												}
											}
											if (Static148.anInt3244 < -50) {
												Static192.anInt4114 = 2;
											}
											if (Static123.anInt2804 < -55) {
												Static309.anInt6064 = 2;
											}
											if (Static148.anInt3244 > 50) {
												Static192.anInt4114 = -2;
											}
											if (Static123.anInt2804 > 55) {
												Static309.anInt6064 = -2;
											}
											if (Static36.anInt1199 < -40) {
												Static187.anInt4035 = 1;
											}
											if (Static36.anInt1199 > 40) {
												Static187.anInt4035 = -1;
											}
											Static299.anInt1377++;
											if (Static299.anInt1377 > 500) {
												Static299.anInt1377 = 0;
												local94 = (int) (Math.random() * 8.0D);
												if ((local94 & 0x2) == 2) {
													Static287.anInt5748 += Static121.anInt2761;
												}
												if ((local94 & 0x1) == 1) {
													Static337.anInt6461 += Static41.anInt1306;
												}
											}
											if (Static337.anInt6461 < -60) {
												Static41.anInt1306 = 2;
											}
											if (Static337.anInt6461 > 60) {
												Static41.anInt1306 = -2;
											}
											if (Static287.anInt5748 < -20) {
												Static121.anInt2761 = 1;
											}
											if (Static287.anInt5748 > 10) {
												Static121.anInt2761 = -1;
											}
											Static46.anInt1508++;
											if (Static46.anInt1508 > 50) {
												Static342.aClass1_Sub8_Sub1_7.method3229(95);
											}
											if (Static239.aBoolean479) {
												Static343.method5445();
												Static239.aBoolean479 = false;
											}
											try {
												if (Static7.aClass148_1 != null && Static342.aClass1_Sub8_Sub1_7.anInt5182 > 0) {
													Static7.aClass148_1.method4122(Static342.aClass1_Sub8_Sub1_7.anInt5182, Static342.aClass1_Sub8_Sub1_7.aByteArray81);
													Static342.aClass1_Sub8_Sub1_7.anInt5182 = 0;
													Static46.anInt1508 = 0;
													return;
												}
												return;
											} catch (@Pc(1767) IOException local1767) {
												Static198.method886();
												return;
											}
										}
										local1366 = local1361.aClass12_5;
										if (local1366.anInt410 < 0) {
											break;
										}
										local780 = Static9.method319(local1366.anInt459);
									} while (local780 == null || local780.aClass12Array3 == null || local1366.anInt410 >= local780.aClass12Array3.length || local780.aClass12Array3[local1366.anInt410] != local1366);
									Static196.method3777(local1361);
								}
							}
							local1366 = local1361.aClass12_5;
							if (local1366.anInt410 < 0) {
								break;
							}
							local780 = Static9.method319(local1366.anInt459);
						} while (local780 == null || local780.aClass12Array3 == null || local780.aClass12Array3.length <= local1366.anInt410 || local780.aClass12Array3[local1366.anInt410] != local1366);
						Static196.method3777(local1361);
					}
				}
				local1366 = local1361.aClass12_5;
				if (local1366.anInt410 < 0) {
					break;
				}
				local780 = Static9.method319(local1366.anInt459);
			} while (local780 == null || local780.aClass12Array3 == null || local1366.anInt410 >= local780.aClass12Array3.length || local780.aClass12Array3[local1366.anInt410] != local1366);
			Static196.method3777(local1361);
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IZ)V")
	public static void method2653(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static79.aClass1_Sub4_Sub1_3 != null) {
			Static137.anInt3038 = Static79.aClass1_Sub4_Sub1_3.anInt361;
		} else {
			Static137.anInt3038 = -1;
		}
		Static79.aClass1_Sub4_Sub1_3 = null;
		Static243.anInt4977 = 0;
		Static72.aClass12_4 = null;
		Static280.aClass16_32 = null;
		Static79.method3751();
		Static79.aClass16_24.method421();
		Static322.aClass106_8 = null;
		Static212.aClass106_6 = null;
		Static102.aClass106_2 = null;
		Static231.anInt4758 = -1;
		Static141.aClass5_29 = null;
		Static351.aClass106_9 = null;
		Static52.aClass106_1 = null;
		Static68.anInt1821 = -1;
		Static79.aClass207_2 = null;
		Static199.aClass106_5 = null;
		Static259.aClass106_4 = null;
		Static296.aClass106_7 = null;
		Static84.method1824();
		Static136.method2777(128, 64);
		Static125.method2611(64, 64);
		Static195.method3772(64);
		Static244.method4388(64);
	}
}
