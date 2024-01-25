import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bf", name = "x", descriptor = "Lclient!ae;")
	public static Class4 aClass4_26;

	@OriginalMember(owner = "client!bf", name = "y", descriptor = "Lclient!ct;")
	public static Class30 aClass30_104;

	@OriginalMember(owner = "client!bf", name = "t", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_225 = new Class18(55, 4);

	@OriginalMember(owner = "client!bf", name = "u", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_230 = new Class106("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!bf", name = "v", descriptor = "Z")
	public static boolean aBoolean498 = true;

	@OriginalMember(owner = "client!bf", name = "w", descriptor = "I")
	public static int anInt6732 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZI)V")
	public static void method5875() {
		Static29.aClass21_28.method844(5);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;")
	public static String[] method5876(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			local8[local15] = local15 + ": ";
			if (arg0 != null && arg0[local15] != null) {
				local8[local15] = local8[local15] + arg0[local15];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIII[Lclient!kg;III)V")
	public static void method5878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class112[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
		for (@Pc(18) int local18 = 0; local18 < arg6.length; local18++) {
			@Pc(24) Class112 local24 = arg6[local18];
			if (local24 != null && (arg7 == local24.anInt3428 || arg7 == -1412584499 && local24 == Static243.aClass112_15)) {
				@Pc(49) int local49;
				if (arg8 == -1) {
					Class11_Sub1_Sub2.aRectangleArray2[Static77.anInt1698].setBounds(arg2 + local24.anInt3408, arg1 + local24.anInt3450, local24.anInt3381, local24.anInt3444);
					local49 = Static77.anInt1698++;
				} else {
					local49 = arg8;
				}
				local24.anInt3397 = Static51.anInt1301;
				local24.anInt3452 = local49;
				if (!Static44.method1077(local24)) {
					if (local24.anInt3446 != 0) {
						Static218.method4033(local24);
					}
					@Pc(96) int local96 = local24.anInt3408 + arg2;
					@Pc(101) int local101 = arg1 + local24.anInt3450;
					@Pc(104) int local104 = local24.anInt3378;
					if (Static339.aBoolean444 && (Static44.method1079(local24).anInt6536 != 0 || local24.anInt3373 == 0) && local104 > 127) {
						local104 = 127;
					}
					@Pc(156) int local156;
					@Pc(160) int local160;
					if (Static243.aClass112_15 == local24) {
						if (arg7 != -1412584499 && (local24.anInt3394 == Static160.anInt3293 || local24.anInt3394 == Static210.anInt4190)) {
							Static247.anInt5073 = arg1;
							Static245.anInt5054 = arg2;
							Static31.aClass112Array1 = arg6;
							continue;
						}
						if (Static359.aBoolean506 && Static224.aBoolean333) {
							local156 = Static164.aClass142_1.method4911();
							local160 = Static164.aClass142_1.method4915();
							local156 -= Static8.anInt235;
							local160 -= Static325.anInt5184;
							if (Static353.anInt6596 > local156) {
								local156 = Static353.anInt6596;
							}
							if (Static293.anInt4950 > local160) {
								local160 = Static293.anInt4950;
							}
							if (local156 + local24.anInt3381 > Static353.anInt6596 - -Static110.aClass112_8.anInt3381) {
								local156 = Static110.aClass112_8.anInt3381 + Static353.anInt6596 - local24.anInt3381;
							}
							if (Static110.aClass112_8.anInt3444 + Static293.anInt4950 < local24.anInt3444 + local160) {
								local160 = Static293.anInt4950 + Static110.aClass112_8.anInt3444 - local24.anInt3444;
							}
							local96 = local156;
							local101 = local160;
						}
						if (local24.anInt3394 == Static210.anInt4190) {
							local104 = 128;
						}
					}
					@Pc(244) int local244;
					@Pc(242) int local242;
					@Pc(255) int local255;
					@Pc(260) int local260;
					if (local24.anInt3373 == 2) {
						local242 = arg5;
						local244 = arg4;
						local160 = arg0;
						local156 = arg3;
					} else {
						local255 = local24.anInt3381 + local96;
						local260 = local24.anInt3444 + local101;
						local160 = local101 <= arg0 ? arg0 : local101;
						if (local24.anInt3373 == 9) {
							local255++;
							local260++;
						}
						local156 = arg3 >= local96 ? arg3 : local96;
						local244 = local255 < arg4 ? local255 : arg4;
						local242 = local260 >= arg5 ? arg5 : local260;
					}
					if (local156 < local244 && local242 > local160) {
						@Pc(541) int local541;
						@Pc(565) int local565;
						@Pc(567) int local567;
						@Pc(512) int local512;
						@Pc(514) int local514;
						if (local24.anInt3446 != 0) {
							if (Static145.anInt3088 == local24.anInt3446 || Static71.anInt1629 == local24.anInt3446) {
								Static223.method4138(local24.anInt3444, local24.anInt3381, local101, local96, local24.anInt3446 == Static71.anInt1629);
								Static207.aBooleanArray21[local49] = true;
								Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
								continue;
							}
							if (local24.anInt3446 == Static299.anInt4034) {
								if (local24.method3110(Static9.aClass63_1) != null) {
									Static82.method1769();
									Static149.method2885(Static9.aClass63_1, local101, local24, local96);
									Static149.aBooleanArray16[local49] = true;
									Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
								}
								continue;
							}
							if (Static38.anInt943 == local24.anInt3446) {
								if (local24.method3110(Static9.aClass63_1) != null) {
									Static129.method2661(local101, local96, local24);
									Static149.aBooleanArray16[local49] = true;
									Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
								}
								continue;
							}
							if (local24.anInt3446 == Static177.anInt3690) {
								Static211.method3898(local24.anInt3381, local24.anInt3444, Static314.anInterface3_7, Static9.aClass63_1, local101, local96);
								Static207.aBooleanArray21[local49] = true;
								Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
								continue;
							}
							if (Static10.anInt276 == local24.anInt3446) {
								Static192.method3612(local96, Static9.aClass63_1, local24.anInt3444, local101, local24.anInt3381);
								Static207.aBooleanArray21[local49] = true;
								Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
								continue;
							}
							if (local24.anInt3446 == Static75.anInt3285) {
								if (!Static291.aBoolean428 && !Static134.aBoolean207) {
									continue;
								}
								local255 = local24.anInt3381 + local96;
								local260 = local101 + 15;
								if (Static291.aBoolean428) {
									Static24.aClass33_1.method6025(local260, local255, -256, "Fps:" + Static45.anInt1172);
									local260 += 15;
									@Pc(502) Runtime local502 = Runtime.getRuntime();
									local512 = (int) ((local502.totalMemory() - local502.freeMemory()) / 1024L);
									local514 = -256;
									if (local512 > 65536) {
										local514 = -65536;
									}
									Static24.aClass33_1.method6025(local260, local255, local514, "Mem:" + local512 + "k");
									local260 += 15;
									local541 = Static9.aClass63_1.method4642() / 1024;
									Static24.aClass33_1.method6025(local260, local255, local541 <= 65536 ? -256 : -65536, "Offheap:" + local541 + "k");
									local260 += 15;
									local565 = 0;
									local567 = 0;
									@Pc(569) int local569 = 0;
									for (@Pc(571) int local571 = 0; local571 < 29; local571++) {
										local565 += Static14.aClass51_Sub1Array2[local571].method1736();
										local567 += Static14.aClass51_Sub1Array2[local571].method1740();
										local569 += Static14.aClass51_Sub1Array2[local571].method1738();
									}
									@Pc(607) int local607 = local569 * 100 / local565;
									@Pc(613) int local613 = local567 * 10000 / local565;
									@Pc(633) String local633 = "Cache:" + Static354.method5850(true, 2, 0, (long) local613) + "% (" + local607 + "%)";
									Static364.aClass33_4.method6025(local260, local255, -256, local633);
									local260 += 12;
								}
								if (Static240.anInt4900 > 0) {
									Static364.aClass33_4.method6025(local260, local255, -256, "Particles: " + Static199.anInt4042 + " / " + Static240.anInt4900);
								}
								local260 += 12;
								if (Static134.aBoolean207) {
									Static364.aClass33_4.method6025(local260, local255, -256, "Polys: " + Static9.aClass63_1.method4580() + " Models: " + Static9.aClass63_1.method4601());
									local260 += 12;
									Static364.aClass33_4.method6025(local260, local255, -256, "Ls: " + Static264.anInt5203 + " La: " + Static56.anInt1434 + " NPC: " + Static102.anInt7002 + " Pl: " + Static153.anInt3172);
									Static112.method2383();
									local260 += 12;
								}
								Static207.aBooleanArray21[local49] = true;
								continue;
							}
						}
						if (local24.anInt3373 == 0) {
							if (Static110.anInt2478 == local24.anInt3446 && Static9.aClass63_1.method4657()) {
								Static9.aClass63_1.method4641(local96, local101, local24.anInt3381, local24.anInt3444);
							}
							method5878(local160, local101 - local24.anInt3419, local96 - local24.anInt3372, local156, local244, local242, arg6, local24.anInt3376, local49);
							if (local24.aClass112Array2 != null) {
								method5878(local160, local101 - local24.anInt3419, -local24.anInt3372 + local96, local156, local244, local242, local24.aClass112Array2, local24.anInt3376, local49);
							}
							@Pc(800) Class1_Sub15 local800 = (Class1_Sub15) Static281.aClass38_30.method1475((long) local24.anInt3376);
							if (local800 != null) {
								Static239.method4430(local800.anInt1496, local160, local156, local101, local96, local244, local242, local49);
							}
							if (local24.anInt3446 == Static110.anInt2478 && Static9.aClass63_1.method4657()) {
								Static9.aClass63_1.method4614();
								Static165.aBoolean242 = true;
							}
							Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
						}
						if (Static240.aBooleanArray26[local49] || Static332.anInt6250 > 1) {
							if (local24.anInt3373 == 3) {
								if (local104 == 0) {
									if (local24.aBoolean235) {
										Static9.aClass63_1.method4653(local96, local101, local24.anInt3381, local24.anInt3444, local24.anInt3415, 0);
									} else {
										Static9.aClass63_1.method4645(local96, local101, local24.anInt3381, local24.anInt3444, local24.anInt3415, 0);
									}
								} else if (local24.aBoolean235) {
									Static9.aClass63_1.method4653(local96, local101, local24.anInt3381, local24.anInt3444, local24.anInt3415 & 0xFFFFFF | 255 - (local104 & 0xFF) << 24, 1);
								} else {
									Static9.aClass63_1.method4645(local96, local101, local24.anInt3381, local24.anInt3444, local24.anInt3415 & 0xFFFFFF | 255 - (local104 & 0xFF) << 24, 1);
								}
							} else if (local24.anInt3373 == 4) {
								@Pc(935) Class33 local935 = local24.method3106(Static9.aClass63_1);
								if (local935 != null) {
									local260 = local24.anInt3415;
									@Pc(950) String local950 = local24.aString28;
									if (local24.anInt3451 != -1) {
										@Pc(961) Class22 local961 = Static243.aClass220_2.method5972(local24.anInt3451);
										local950 = local961.aString2;
										if (local950 == null) {
											local950 = "null";
										}
										if ((local961.anInt880 == 1 || local24.anInt3432 != 1) && local24.anInt3432 != -1) {
											local950 = "<col=ff9040>" + local950 + "</col> x" + Static16.method447(local24.anInt3432);
										}
									}
									if (Static323.aClass112_13 == local24) {
										local950 = Static229.aClass106_159.method2927(Static254.anInt5172);
										local260 = local24.anInt3415;
									}
									if (Static259.aBoolean384) {
										Static9.aClass63_1.method4659(local96, local101, local96 + local24.anInt3381, local24.anInt3444 + local101);
									}
									local935.method6026(local24.aBoolean234 ? 255 - (local104 & 0xFF) << 24 : -1, local101, 0, local24.anInt3424, local24.anInt3430, null, local260 | 255 - (local104 & 0xFF) << 24, 0, Static240.aClass4Array16, local96, local24.anInt3381, null, local24.anInt3444, local950, local24.anInt3386);
									if (Static259.aBoolean384) {
										Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
									}
								} else if (Static82.aBoolean133) {
									Static133.method2725(local24);
								}
							} else {
								@Pc(1136) int local1136;
								if (local24.anInt3373 == 5) {
									if (local24.anInt3377 < 0) {
										@Pc(1114) Class4 local1114;
										if (local24.anInt3451 == -1) {
											local1114 = local24.method3102(Static9.aClass63_1);
										} else {
											@Pc(1096) Class200 local1096 = local24.aBoolean241 ? Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 : null;
											local1114 = Static243.aClass220_2.method5978(local24.anInt3432, Static9.aClass63_1, local24.anInt3442, local1096, local24.anInt3451, local24.anInt3389, local24.anInt3380 | 0xFF000000);
										}
										if (local1114 != null) {
											local260 = local1114.method5961();
											local1136 = local1114.method5963();
											if (local24.aBoolean229) {
												Static9.aClass63_1.method4659(local96, local101, local24.anInt3381 + local96, local24.anInt3444 + local101);
												if (local24.anInt3404 != 0) {
													local512 = (local24.anInt3381 + local260 - 1) / local260;
													local514 = (local24.anInt3444 + local1136 - 1) / local1136;
													for (local541 = 0; local541 < local512; local541++) {
														for (local565 = 0; local565 < local514; local565++) {
															local1114.method5967((float) (local541 * local260 + local96) + (float) local260 / 2.0F, (float) (local101 - -(local565 * local1136)) + (float) local1136 / 2.0F, 4096, local24.anInt3404);
														}
													}
												} else if (local104 == 0) {
													local1114.method5950(local96, local101, local24.anInt3381, local24.anInt3444, 0, 0);
												} else {
													local1114.method5950(local96, local101, local24.anInt3381, local24.anInt3444, 1, 255 - (local104 & 0xFF) << 24 | 0xFFFFFF);
												}
												Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
											} else if (local104 != 0) {
												local512 = 255 - (local104 & 0xFF) << 24 | 0xFFFFFF;
												if (local24.anInt3404 != 0) {
													local1114.method5956((float) local24.anInt3381 / 2.0F + (float) local96, (float) local24.anInt3444 / 2.0F + (float) local101, local24.anInt3381 * 4096 / local260, local24.anInt3404, local512);
												} else if (local260 == local24.anInt3381 && local24.anInt3444 == local1136) {
													local1114.method5957(local96, local101, 1, local512);
												} else {
													local1114.method5955(local96, local101, local24.anInt3381, local24.anInt3444, 1, local512, 1);
												}
											} else if (local24.anInt3404 != 0) {
												local1114.method5967((float) local24.anInt3381 / 2.0F + (float) local96, (float) local101 + (float) local24.anInt3444 / 2.0F, local24.anInt3381 * 4096 / local260, local24.anInt3404);
											} else if (local260 == local24.anInt3381 && local24.anInt3444 == local1136) {
												local1114.method5948(local96, local101);
											} else {
												local1114.method5964(local96, local101, local24.anInt3381, local24.anInt3444);
											}
										} else if (Static82.aBoolean133) {
											Static133.method2725(local24);
										}
									} else {
										local24.method3103().method2728(local24.anInt3381, local24.anInt3444, 0, local24.anInt3406 << 3, 0, local24.anInt3435 << 3, local101, local96, Static9.aClass63_1);
									}
								} else if (local24.anInt3373 == 6) {
									Static238.method4401();
									@Pc(1435) Class3 local1435 = null;
									local260 = 0;
									@Pc(1466) Class199 local1466;
									@Pc(1474) Class200 local1474;
									if (local24.anInt3451 != -1) {
										@Pc(1447) Class22 local1447 = Static243.aClass220_2.method5972(local24.anInt3451);
										if (local1447 != null) {
											local1447 = local1447.method892(local24.anInt3432);
											local1466 = local24.anInt3387 == -1 ? null : Static161.method3066(local24.anInt3387);
											local1474 = local24.aBoolean241 ? Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 : null;
											local1435 = local1447.method897(local24.anInt3441, local1474, Static9.aClass63_1, 1, local24.anInt3407, local24.anInt3409, local1466, 1024);
											if (local1435 == null) {
												Static133.method2725(local24);
											} else {
												local260 = -local1435.method1245() / 2;
											}
										}
									} else if (local24.anInt3438 == 5) {
										local1136 = local24.anInt3440;
										if (local1136 >= 0 && local1136 < 2048) {
											@Pc(1641) Class11_Sub2_Sub6_Sub1 local1641 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local1136];
											@Pc(1653) Class199 local1653 = local24.anInt3387 == -1 ? null : Static161.method3066(local24.anInt3387);
											if (local1641 != null && (Static352.anInt1802 == local1136 || Static171.method3208(local1641.aString63) == local24.anInt3384)) {
												local1435 = local1641.aClass200_1.method5419(null, local1653, local24.anInt3441, local24.anInt3407, Static9.aClass63_1, -1, local24.anInt3409, null, 0, Static243.aClass220_2, 1024, 0);
											}
										}
									} else if (local24.anInt3438 == 8 || local24.anInt3438 == 9) {
										@Pc(1582) Class1_Sub26 local1582 = Static65.method5281(local24.anInt3440, false);
										local1466 = local24.anInt3387 == -1 ? null : Static161.method3066(local24.anInt3387);
										if (local1582 != null) {
											local1474 = local24.aBoolean241 ? Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1 : null;
											local1435 = local1582.method3123(local24.anInt3384, local24.anInt3438 == 9, local1474, local1466, local24.anInt3407, local24.anInt3441, local24.anInt3409, Static9.aClass63_1);
										}
									} else if (local24.anInt3387 == -1) {
										local1435 = local24.method3108(1024, 0, null, Static9.aClass63_1, -1, -1, Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1, Static243.aClass220_2);
										if (local1435 == null && Static82.aBoolean133) {
											Static133.method2725(local24);
										}
									} else {
										@Pc(1531) Class199 local1531 = Static161.method3066(local24.anInt3387);
										local1435 = local24.method3108(1024, local24.anInt3407, local1531, Static9.aClass63_1, local24.anInt3441, local24.anInt3409, Static191.aClass11_Sub2_Sub6_Sub1_4.aClass200_1, Static243.aClass220_2);
										if (local1435 == null && Static82.aBoolean133) {
											Static133.method2725(local24);
										}
									}
									if (local1435 != null) {
										if (local24.anInt3431 > 0) {
											local1136 = (local24.anInt3381 << 9) / local24.anInt3431;
										} else {
											local1136 = 512;
										}
										if (local24.anInt3410 <= 0) {
											local512 = 512;
										} else {
											local512 = (local24.anInt3444 << 9) / local24.anInt3410;
										}
										local514 = (local24.anInt3401 * local1136 >> 9) + local96 + local24.anInt3381 / 2;
										local541 = local101 + local24.anInt3444 / 2 + (local512 * local24.anInt3392 >> 9);
										Static341.aClass129_5.method5779();
										Static9.aClass63_1.method4596(Static341.aClass129_5);
										local565 = local24.anInt3445 * Class208.anIntArray479[local24.anInt3367 << 3] >> 15;
										local567 = local24.anInt3445 * Class208.anIntArray478[local24.anInt3367 << 3] >> 15;
										Static9.aClass63_1.method4590(local514, local541, local1136, local512);
										Static9.aClass63_1.method4570((float) local24.aShort48, local24.aBoolean233 ? (float) local24.aShort47 : (float) local24.aShort47 * 1.5F);
										if (arg7 == -1412584499 || Static165.aBoolean242) {
											Static9.aClass63_1.method4651();
											Static9.aClass63_1.method4620();
											Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
											Static165.aBoolean242 = false;
										}
										if (local24.aBoolean238) {
											Static9.aClass63_1.method4635(false);
										}
										Static312.aClass129_4.method5778(-local24.anInt3426 << 3);
										Static312.aClass129_4.method5783(local24.anInt3371 << 3);
										Static312.aClass129_4.method5776(local24.anInt3425, local565 + local260 + local24.anInt3391, local567 + local24.anInt3391);
										Static312.aClass129_4.method5781(local24.anInt3367 << 3);
										if (Static259.aBoolean384) {
											Static9.aClass63_1.method4659(local96, local101, local96 + local24.anInt3381, local24.anInt3444 + local101);
										}
										if (local24.aBoolean233) {
											local1435.method1244(Static312.aClass129_4, null, local24.anInt3445);
										} else {
											local1435.method1242(Static312.aClass129_4, null, 1);
										}
										if (Static259.aBoolean384) {
											Static9.aClass63_1.method4566(arg3, arg0, arg4, arg5);
										}
										if (local24.aBoolean238) {
											Static9.aClass63_1.method4635(true);
										}
									}
								} else if (local24.anInt3373 == 9) {
									if (local24.aBoolean237) {
										local260 = local101 + local24.anInt3444;
										local1136 = local96 + local24.anInt3381;
										local512 = local101;
									} else {
										local512 = local24.anInt3444 + local101;
										local1136 = local96 + local24.anInt3381;
										local260 = local101;
									}
									if (local24.anInt3399 == 1) {
										Static9.aClass63_1.method4626(local96, local260, local1136, local512, local24.anInt3415, 0);
									} else {
										Static9.aClass63_1.method4623(local96, local260, local1136, local512, local24.anInt3415, local24.anInt3399);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
