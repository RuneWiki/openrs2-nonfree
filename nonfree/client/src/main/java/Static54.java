import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "I")
	public static int anInt974;

	@OriginalMember(owner = "client!cl", name = "p", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray8;

	@OriginalMember(owner = "client!cl", name = "j", descriptor = "Lclient!ao;")
	public static final Class12 aClass12_33 = new Class12(48, 2);

	@OriginalMember(owner = "client!cl", name = "l", descriptor = "I")
	public static int anInt973 = -1;

	@OriginalMember(owner = "client!cl", name = "n", descriptor = "I")
	public static int anInt975 = 0;

	@OriginalMember(owner = "client!cl", name = "o", descriptor = "Lclient!jk;")
	public static Class124 aClass124_2 = null;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIBII[Lclient!jk;III)V")
	public static void method921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class124[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(19) Class124 local19 = arg5[local13];
			if (local19 != null && (local19.anInt3344 == arg4 || arg4 == -1412584499 && Static371.aClass124_10 == local19)) {
				@Pc(40) int local40;
				if (arg8 == -1) {
					Class129.aRectangleArray2[Static250.anInt4507].setBounds(local19.anInt3370 + arg6, arg0 + local19.anInt3414, local19.anInt3376, local19.anInt3356);
					local40 = Static250.anInt4507++;
				} else {
					local40 = arg8;
				}
				local19.anInt3396 = local40;
				local19.anInt3387 = Static236.anInt4213;
				if (!Static55.method966(local19)) {
					if (local19.anInt3413 != 0) {
						Static185.method2668(local19);
					}
					@Pc(84) int local84 = local19.anInt3370 + arg6;
					@Pc(89) int local89 = arg0 + local19.anInt3414;
					@Pc(92) int local92 = local19.anInt3342;
					if (Static239.aBoolean665 && (Static55.method970(local19).anInt3464 != 0 || local19.anInt3417 == 0) && local92 > 127) {
						local92 = 127;
					}
					@Pc(139) int local139;
					@Pc(143) int local143;
					if (local19 == Static371.aClass124_10) {
						if (arg4 != -1412584499 && (local19.anInt3367 == Static344.anInt5931 || local19.anInt3367 == Static103.anInt1912)) {
							Static441.anInt7358 = arg0;
							Static121.anInt2247 = arg6;
							Static313.aClass124Array2 = arg5;
							continue;
						}
						if (Static109.aBoolean554 && Static310.aBoolean608) {
							local139 = Static62.aClass96_1.method3872();
							local143 = Static62.aClass96_1.method3870();
							local143 -= Static237.anInt4218;
							local139 -= Static148.anInt2545;
							if (local139 < Static209.anInt3757) {
								local139 = Static209.anInt3757;
							}
							if (local19.anInt3376 + local139 > Static209.anInt3757 - -Static401.aClass124_12.anInt3376) {
								local139 = Static401.aClass124_12.anInt3376 + Static209.anInt3757 - local19.anInt3376;
							}
							if (Static159.anInt2655 > local143) {
								local143 = Static159.anInt2655;
							}
							if (local143 + local19.anInt3356 > Static159.anInt2655 - -Static401.aClass124_12.anInt3356) {
								local143 = Static159.anInt2655 + Static401.aClass124_12.anInt3356 - local19.anInt3356;
							}
							local84 = local139;
							local89 = local143;
						}
						if (Static103.anInt1912 == local19.anInt3367) {
							local92 = 128;
						}
					}
					@Pc(215) int local215;
					@Pc(217) int local217;
					@Pc(228) int local228;
					@Pc(233) int local233;
					if (local19.anInt3417 == 2) {
						local215 = arg2;
						local217 = arg3;
						local143 = arg1;
						local139 = arg7;
					} else {
						local228 = local19.anInt3376 + local84;
						local233 = local89 + local19.anInt3356;
						if (local19.anInt3417 == 9) {
							local228++;
							local233++;
						}
						local143 = local89 > arg1 ? local89 : arg1;
						local139 = arg7 < local84 ? local84 : arg7;
						local217 = local233 >= arg3 ? arg3 : local233;
						local215 = local228 < arg2 ? local228 : arg2;
					}
					if (local215 > local139 && local217 > local143) {
						@Pc(555) int local555;
						@Pc(579) int local579;
						@Pc(581) int local581;
						@Pc(503) int local503;
						@Pc(505) int local505;
						if (local19.anInt3413 != 0) {
							if (Static4.anInt67 == local19.anInt3413 || Static431.anInt7287 == local19.anInt3413) {
								Static259.method3687(local89, local19.anInt3413 == Static431.anInt7287, local84, local19.anInt3376, local19.anInt3356);
								Static369.aBooleanArray23[local40] = true;
								Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
								continue;
							}
							if (Static177.anInt2894 == local19.anInt3413) {
								if (local19.method2782(Static185.aClass34_7) != null) {
									Static111.method1777();
									Static331.method4435(Static185.aClass34_7, local19, local84, local89);
									Static408.aBooleanArray25[local40] = true;
									Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
								}
								continue;
							}
							if (local19.anInt3413 == Static172.anInt2814) {
								if (local19.method2782(Static185.aClass34_7) != null) {
									Static154.method2268(local19, local84, local89);
									Static408.aBooleanArray25[local40] = true;
									Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
								}
								continue;
							}
							if (local19.anInt3413 == Static347.anInt5947) {
								Static4.method57(local84, Static310.anInterface6_4, local19.anInt3376, local19.anInt3356, local89, Static185.aClass34_7);
								Static369.aBooleanArray23[local40] = true;
								Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
								continue;
							}
							if (Static169.anInt2769 == local19.anInt3413) {
								Static249.method3547(local19.anInt3356, Static185.aClass34_7, local84, local89, local19.anInt3376);
								Static369.aBooleanArray23[local40] = true;
								Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
								continue;
							}
							if (local19.anInt3413 == Static216.anInt3856) {
								if (!Static303.aBoolean817 && !Static372.aBoolean702) {
									continue;
								}
								local228 = local19.anInt3376 + local84;
								local233 = local89 + 15;
								if (Static303.aBoolean817) {
									Static437.aClass76_4.method4586(local228, "Fps:" + Static37.anInt673, local233, -256);
									local233 += 15;
									@Pc(493) Runtime local493 = Runtime.getRuntime();
									local503 = (int) ((local493.totalMemory() - local493.freeMemory()) / 1024L);
									local505 = -256;
									if (local503 > 65536) {
										local505 = -65536;
									}
									Static437.aClass76_4.method4586(local228, "Mem:" + local503 + "k", local233, local505);
									local233 += 15;
									Static437.aClass76_4.method4586(local228, "In:" + Static396.anInt6616 + "B/s Out:" + Static174.anInt2864 + "B/s", local233, -256);
									local233 += 15;
									local555 = Static185.aClass34_7.pa() / 1024;
									Static437.aClass76_4.method4586(local228, "Offheap:" + local555 + "k", local233, local555 <= 65536 ? -256 : -65536);
									local233 += 15;
									local579 = 0;
									local581 = 0;
									@Pc(583) int local583 = 0;
									for (@Pc(585) int local585 = 0; local585 < 30; local585++) {
										local579 += Static97.aClass85_Sub1Array1[local585].method1903();
										local581 += Static97.aClass85_Sub1Array1[local585].method1901();
										local583 += Static97.aClass85_Sub1Array1[local585].method1907();
									}
									@Pc(623) int local623 = local583 * 100 / local579;
									@Pc(629) int local629 = local581 * 10000 / local579;
									@Pc(649) String local649 = "Cache:" + Static177.method2496((long) local629, true, 2, 0) + "% (" + local623 + "%)";
									Static80.aClass76_1.method4586(local228, local649, local233, -256);
									local233 += 12;
								}
								if (Static359.anInt6120 > 0) {
									Static80.aClass76_1.method4586(local228, "Particles: " + Static101.anInt1841 + " / " + Static359.anInt6120, local233, -256);
								}
								local233 += 12;
								if (Static372.aBoolean702) {
									Static80.aClass76_1.method4586(local228, "Polys: " + Static185.aClass34_7.OA() + " Models: " + Static185.aClass34_7.Y(), local233, -256);
									local233 += 12;
									Static80.aClass76_1.method4586(local228, "Ls: " + Static311.anInt5407 + " La: " + Static102.anInt1848 + " NPC: " + Static287.anInt5027 + " Pl: " + Static374.anInt6309, local233, -256);
									local233 += 12;
									Static272.method3801();
								}
								Static369.aBooleanArray23[local40] = true;
								continue;
							}
						}
						if (local19.anInt3417 == 0) {
							if (Static199.anInt3481 == local19.anInt3413 && Static185.aClass34_7.method5734()) {
								Static185.aClass34_7.method5779(local84, local89, local19.anInt3376, local19.anInt3356);
							}
							method921(local89 - local19.anInt3418, local143, local215, local217, local19.anInt3348, arg5, local84 - local19.anInt3390, local139, local40);
							if (local19.aClass124Array1 != null) {
								method921(local89 - local19.anInt3418, local143, local215, local217, local19.anInt3348, local19.aClass124Array1, local84 - local19.anInt3390, local139, local40);
							}
							@Pc(813) Class1_Sub14 local813 = (Class1_Sub14) Static94.aClass199_54.method4387((long) local19.anInt3348);
							if (local813 != null) {
								Static416.method5405(local139, local84, local40, local89, local143, local813.anInt1425, local217, local215);
							}
							if (local19.anInt3413 == Static199.anInt3481 && Static185.aClass34_7.method5734()) {
								Static185.aClass34_7.method5780();
								Static332.aBoolean646 = true;
							}
							Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
						}
						if (Static10.aBooleanArray1[local40] || Static231.anInt4065 > 1) {
							if (local19.anInt3417 == 3) {
								if (local92 == 0) {
									if (local19.aBoolean398) {
										Static185.aClass34_7.P(local84, local89, local19.anInt3376, local19.anInt3356, local19.anInt3399, 0);
									} else {
										Static185.aClass34_7.method5769(local84, local89, local19.anInt3376, local19.anInt3356, local19.anInt3399, 0);
									}
								} else if (local19.aBoolean398) {
									Static185.aClass34_7.P(local84, local89, local19.anInt3376, local19.anInt3356, 255 - (local92 & 0xFF) << 24 | local19.anInt3399 & 0xFFFFFF, 1);
								} else {
									Static185.aClass34_7.method5769(local84, local89, local19.anInt3376, local19.anInt3356, local19.anInt3399 & 0xFFFFFF | 255 - (local92 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt3417 == 4) {
								@Pc(951) Class76 local951 = local19.method2775(Static185.aClass34_7);
								if (local951 != null) {
									local233 = local19.anInt3399;
									@Pc(966) String local966 = local19.aString42;
									if (local19.anInt3405 != -1) {
										@Pc(976) Class162 local976 = Static342.aClass155_2.method3548(local19.anInt3405);
										local966 = local976.aString55;
										if (local966 == null) {
											local966 = "null";
										}
										if ((local976.anInt4715 == 1 || local19.anInt3351 != 1) && local19.anInt3351 != -1) {
											local966 = "<col=ff9040>" + local966 + "</col> x" + Static440.method5810(local19.anInt3351);
										}
									}
									if (Static395.aClass124_11 == local19) {
										local966 = Static373.aClass119_154.method2673(Static394.anInt6582);
										local233 = local19.anInt3399;
									}
									if (Static456.aBoolean820) {
										Static185.aClass34_7.HA(local84, local89, local84 + local19.anInt3376, local89 + local19.anInt3356);
									}
									local951.method4590(local19.anInt3347, local966, local89, local19.anInt3376, 0, null, local19.anInt3419, Static352.aClass6Array11, 255 - (local92 & 0xFF) << 24 | local233, local19.anInt3356, 0, local84, null, local19.aBoolean392 ? 255 - (local92 & 0xFF) << 24 : -1, local19.anInt3421, local19.anInt3409);
									if (Static456.aBoolean820) {
										Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
									}
								} else if (Static250.aBoolean516) {
									Static160.method2323(local19);
								}
							} else {
								@Pc(1181) int local1181;
								if (local19.anInt3417 == 5) {
									if (local19.anInt3361 >= 0) {
										local19.method2772(Static55.aClass187_1, Static130.aClass164_1).method56(local89, local19.anInt3357 << 3, 0, local19.anInt3345 << 3, Static185.aClass34_7, local19.anInt3376, local19.anInt3356, 0, local84);
									} else {
										@Pc(1138) Class6 local1138;
										if (local19.anInt3405 == -1) {
											local1138 = local19.method2783(Static185.aClass34_7);
										} else {
											@Pc(1148) Class173 local1148 = local19.aBoolean390 ? Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 : null;
											local1138 = Static342.aClass155_2.method3550(local1148, local19.anInt3410, local19.anInt3412 | 0xFF000000, local19.anInt3405, local19.anInt3351, Static185.aClass34_7, local19.anInt3420);
										}
										if (local1138 != null) {
											local233 = local1138.RA();
											local1181 = local1138.Q();
											local503 = 255 - (local92 & 0xFF) << 24 | (local19.anInt3399 == 0 ? 16777215 : local19.anInt3399 & 0xFFFFFF);
											if (local19.aBoolean391) {
												Static185.aClass34_7.HA(local84, local89, local19.anInt3376 + local84, local19.anInt3356 + local89);
												if (local19.anInt3360 != 0) {
													local505 = (local233 + local19.anInt3376 - 1) / local233;
													local555 = (local19.anInt3356 + local1181 - 1) / local1181;
													for (local579 = 0; local579 < local505; local579++) {
														for (local581 = 0; local581 < local555; local581++) {
															if (local19.anInt3399 == 0) {
																local1138.method5890((float) local233 / 2.0F + (float) (local579 * local233 + local84), (float) (local89 + local581 * local1181) + (float) local1181 / 2.0F, 4096, local19.anInt3360);
															} else {
																local1138.method5895((float) (local84 + local233 * local579) + (float) local233 / 2.0F, (float) (local89 + local581 * local1181) + (float) local1181 / 2.0F, 4096, local19.anInt3360, local503);
															}
														}
													}
												} else if (local19.anInt3399 == 0 && local92 == 0) {
													local1138.method5893(local84, local89, local19.anInt3376, local19.anInt3356);
												} else {
													local1138.la(local84, local89, local19.anInt3376, local19.anInt3356, 0, local503, 1);
												}
												Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
											} else if (local19.anInt3399 == 0 && local92 == 0) {
												if (local19.anInt3360 != 0) {
													local1138.method5890((float) local84 + (float) local19.anInt3376 / 2.0F, (float) local89 + (float) local19.anInt3356 / 2.0F, local19.anInt3376 * 4096 / local233, local19.anInt3360);
												} else if (local233 == local19.anInt3376 && local19.anInt3356 == local1181) {
													local1138.method5894(local84, local89);
												} else {
													local1138.method5891(local84, local89, local19.anInt3376, local19.anInt3356);
												}
											} else if (local19.anInt3360 != 0) {
												local1138.method5895((float) local19.anInt3376 / 2.0F + (float) local84, (float) local89 + (float) local19.anInt3356 / 2.0F, local19.anInt3376 * 4096 / local233, local19.anInt3360, local503);
											} else if (local233 == local19.anInt3376 && local1181 == local19.anInt3356) {
												local1138.W(local84, local89, 0, local503, 1);
											} else {
												local1138.ya(local84, local89, local19.anInt3376, local19.anInt3356, 0, local503, 1);
											}
										} else if (Static250.aBoolean516) {
											Static160.method2323(local19);
										}
									}
								} else if (local19.anInt3417 == 6) {
									Static305.method4179();
									@Pc(1496) Class57 local1496 = null;
									local233 = 0;
									@Pc(1530) Class177 local1530;
									@Pc(1538) Class173 local1538;
									if (local19.anInt3405 != -1) {
										@Pc(1509) Class162 local1509 = Static342.aClass155_2.method3548(local19.anInt3405);
										if (local1509 != null) {
											local1509 = local1509.method3707(local19.anInt3351);
											local1530 = local19.anInt3429 == -1 ? null : Static174.aClass254_1.method5670(local19.anInt3429);
											local1538 = local19.aBoolean390 ? Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 : null;
											local1496 = local1509.method3702(1, 2048, local19.anInt3359, local1530, local19.anInt3358, local19.anInt3365, Static185.aClass34_7, local1538);
											if (local1496 == null) {
												Static160.method2323(local19);
											} else {
												local233 = -local1496.B() >> 1;
											}
										}
									} else if (local19.anInt3401 == 5) {
										local1181 = local19.anInt3422;
										if (local1181 >= 0 && local1181 < 2048) {
											@Pc(1714) Class25_Sub5_Sub1_Sub2 local1714 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local1181];
											@Pc(1727) Class177 local1727 = local19.anInt3429 == -1 ? null : Static174.aClass254_1.method5670(local19.anInt3429);
											if (local1714 != null && (Static296.anInt5181 == local1181 || Static8.method94(local1714.aString51) == local19.anInt3363)) {
												local1496 = local1714.aClass173_1.method3916(null, Static320.aClass249_2, local19.anInt3359, -1, local1727, Static185.aClass34_7, 0, Static174.aClass254_1, Static342.aClass155_2, local19.anInt3358, local19.anInt3365, 0, Static291.aClass21_1, Static339.aClass215_2, null, 2048, Static161.aClass231_2);
											}
										}
									} else if (local19.anInt3401 == 8 || local19.anInt3401 == 9) {
										@Pc(1585) Class1_Sub43 local1585 = Static346.method4702(local19.anInt3422, false);
										local1530 = local19.anInt3429 == -1 ? null : Static174.aClass254_1.method5670(local19.anInt3429);
										if (local1585 != null) {
											local1538 = local19.aBoolean390 ? Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1 : null;
											local1496 = local1585.method5853(local1530, local19.anInt3363, local19.anInt3358, local19.anInt3359, Static185.aClass34_7, local19.anInt3365, local1538, local19.anInt3401 == 9);
										}
									} else if (local19.anInt3429 == -1) {
										local1496 = local19.method2786(-1, Static174.aClass254_1, Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1, 0, Static185.aClass34_7, null, Static320.aClass249_2, Static161.aClass231_2, 2048, -1, Static291.aClass21_1, Static339.aClass215_2, Static342.aClass155_2);
										if (local1496 == null && Static250.aBoolean516) {
											Static160.method2323(local19);
										}
									} else {
										@Pc(1642) Class177 local1642 = Static174.aClass254_1.method5670(local19.anInt3429);
										local1496 = local19.method2786(local19.anInt3359, Static174.aClass254_1, Static447.aClass25_Sub5_Sub1_Sub2_4.aClass173_1, local19.anInt3365, Static185.aClass34_7, local1642, Static320.aClass249_2, Static161.aClass231_2, 2048, local19.anInt3358, Static291.aClass21_1, Static339.aClass215_2, Static342.aClass155_2);
										if (local1496 == null && Static250.aBoolean516) {
											Static160.method2323(local19);
										}
									}
									if (local1496 != null) {
										if (local19.anInt3352 <= 0) {
											local1181 = 512;
										} else {
											local1181 = (local19.anInt3376 << 9) / local19.anInt3352;
										}
										if (local19.anInt3381 <= 0) {
											local503 = 512;
										} else {
											local503 = (local19.anInt3356 << 9) / local19.anInt3381;
										}
										local505 = (local19.anInt3426 * local1181 >> 9) + (local84 + (local19.anInt3376 / 2));
										local555 = local19.anInt3356 / 2 + local89 + (local503 * local19.anInt3371 >> 9);
										Static148.aClass32_6.v();
										Static185.aClass34_7.SA(Static148.aClass32_6);
										Static185.aClass34_7.GA(local505, local555, local1181, local503);
										Static185.aClass34_7.da((float) (local19.anInt3354 << 0), local19.aBoolean387 ? (float) (local19.anInt3402 << 0) : (float) (local19.anInt3402 << 0) * 1.5F);
										if (arg4 == -1412584499 || Static332.aBoolean646) {
											Static185.aClass34_7.va();
											Static185.aClass34_7.method5788();
											Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
											Static332.aBoolean646 = false;
										}
										if (local19.aBoolean386) {
											Static185.aClass34_7.method5745(false);
										}
										local579 = (local19.anInt3406 << 0) * Class1_Sub4_Sub8_Sub1.anIntArray50[local19.anInt3379 << 3] >> 15;
										local581 = (local19.anInt3406 << 0) * Class1_Sub4_Sub8_Sub1.anIntArray49[local19.anInt3379 << 3] >> 15;
										Static281.aClass32_4.A(-local19.anInt3372 << 3);
										Static281.aClass32_4.EA(local19.anInt3428 << 3);
										Static281.aClass32_4.W(local19.anInt3355 << 0, (local19.anInt3369 << 0) + local579 + local233, (local19.anInt3369 << 0) + local581);
										Static281.aClass32_4.ea(local19.anInt3379 << 3);
										if (Static456.aBoolean820) {
											Static185.aClass34_7.HA(local84, local89, local84 + local19.anInt3376, local89 + local19.anInt3356);
										}
										if (local19.aBoolean387) {
											local1496.method5967(Static281.aClass32_4, null, local19.anInt3406 << 0);
										} else {
											local1496.method5953(Static281.aClass32_4, null, 1);
										}
										if (Static456.aBoolean820) {
											Static185.aClass34_7.ba(arg7, arg1, arg2, arg3);
										}
										if (local19.aBoolean386) {
											Static185.aClass34_7.method5745(true);
										}
										Static185.aClass34_7.da(0.0F, 0.0F);
									}
								} else if (local19.anInt3417 == 9) {
									if (local19.aBoolean395) {
										local1181 = local19.anInt3376 + local84;
										local503 = local89;
										local233 = local89 + local19.anInt3356;
									} else {
										local1181 = local19.anInt3376 + local84;
										local233 = local89;
										local503 = local89 + local19.anInt3356;
									}
									if (local19.anInt3380 == 1) {
										Static185.aClass34_7.method5752(local84, local233, local1181, local503, local19.anInt3399, 0);
									} else {
										Static185.aClass34_7.method5801(local84, local233, local1181, local503, local19.anInt3399, local19.anInt3380);
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
