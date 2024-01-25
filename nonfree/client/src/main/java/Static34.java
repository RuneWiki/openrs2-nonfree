import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
	public static int anInt4373;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Z")
	public static final boolean aBoolean282 = false;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "[I")
	public static final int[] anIntArray392 = new int[4096];

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Ljava/lang/String;")
	public static final String aString157 = "flash3:";

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!mo;)V")
	public static void method3918(@OriginalArg(1) Class143 arg0) {
		Static92.aClass143_52 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIII[Lclient!ne;IIII)V")
	public static void method3919(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class146[] arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
		for (@Pc(19) int local19 = 0; local19 < arg5.length; local19++) {
			@Pc(25) Class146 local25 = arg5[local19];
			if (local25 != null && (local25.anInt4146 == arg3 || arg3 == -1412584499 && local25 == Static94.aClass146_21)) {
				@Pc(51) int local51;
				if (arg0 == -1) {
					Class14_Sub2_Sub17.aRectangleArray4[Static304.anInt5859].setBounds(local25.anInt4161 + arg7, local25.anInt4140 - -arg2, local25.anInt4133, local25.anInt4199);
					local51 = Static304.anInt5859++;
				} else {
					local51 = arg0;
				}
				local25.anInt4171 = local51;
				local25.anInt4167 = Static153.anInt3257;
				if (!local25.aBoolean260 || !Static42.method1037(local25)) {
					if (local25.anInt4198 > 0) {
						Static70.method1720(local25);
					}
					@Pc(104) int local104 = local25.anInt4161 + arg7;
					@Pc(110) int local110 = local25.anInt4140 + arg2;
					@Pc(113) int local113 = local25.anInt4208;
					if (Static195.aBoolean248 && (Static42.method1040(local25).anInt2702 != 0 || local25.anInt4135 == 0) && local113 > 127) {
						local113 = 127;
					}
					@Pc(158) int local158;
					@Pc(160) int local160;
					if (local25 == Static94.aClass146_21) {
						if (arg3 != -1412584499 && !local25.aBoolean263) {
							Static37.anInt894 = arg2;
							Static31.anInt737 = arg7;
							Static15.aClass146Array3 = arg5;
							continue;
						}
						if (Static293.aBoolean371 && Static111.aBoolean173) {
							local158 = Static63.anInt1529;
							local160 = Static328.anInt6333;
							local158 -= Static282.anInt5380;
							if (Static105.anInt2334 > local158) {
								local158 = Static105.anInt2334;
							}
							local160 -= Static200.anInt4041;
							if (local160 < Static164.anInt3457) {
								local160 = Static164.anInt3457;
							}
							if (local25.anInt4133 + local158 > Static30.aClass146_8.anInt4133 + Static105.anInt2334) {
								local158 = Static105.anInt2334 + Static30.aClass146_8.anInt4133 - local25.anInt4133;
							}
							if (Static164.anInt3457 + Static30.aClass146_8.anInt4199 < local25.anInt4199 + local160) {
								local160 = Static30.aClass146_8.anInt4199 + Static164.anInt3457 - local25.anInt4199;
							}
							local104 = local158;
							local110 = local160;
						}
						if (!local25.aBoolean263) {
							local113 = 128;
						}
					}
					@Pc(278) int local278;
					@Pc(285) int local285;
					@Pc(238) int local238;
					@Pc(243) int local243;
					if (local25.anInt4135 == 2) {
						local158 = arg4;
						local285 = arg6;
						local278 = arg8;
						local160 = arg1;
					} else {
						local238 = local25.anInt4133 + local104;
						local243 = local25.anInt4199 + local110;
						local158 = arg4 < local104 ? local104 : arg4;
						if (local25.anInt4135 == 9) {
							local238++;
							local243++;
						}
						local160 = local110 > arg1 ? local110 : arg1;
						local278 = arg8 <= local238 ? arg8 : local238;
						local285 = arg6 <= local243 ? arg6 : local243;
					}
					if (!local25.aBoolean260 || local158 < local278 && local160 < local285) {
						@Pc(521) int local521;
						@Pc(576) int local576;
						@Pc(578) int local578;
						@Pc(580) int local580;
						@Pc(582) int local582;
						@Pc(626) int local626;
						@Pc(523) int local523;
						@Pc(552) int local552;
						if (local25.anInt4198 != 0) {
							if (local25.anInt4198 == 1337 || local25.anInt4198 == 1403) {
								method3920(local104, local25.anInt4133, local25.anInt4198 == 1403, local110, local25.anInt4199);
								Static338.aBooleanArray29[local51] = true;
								Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
								continue;
							}
							if (local25.anInt4198 == 1338) {
								if (local25.method3798(Static218.aClass46_5) != null) {
									Static151.method3006();
									Static332.method5725(local25, Static218.aClass46_5, local110, local104);
									Static194.aBooleanArray17[local51] = true;
									Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
								}
								continue;
							}
							if (local25.anInt4198 == 1339) {
								if (local25.method3798(Static218.aClass46_5) != null) {
									Static258.method4435(local25, local104, local110);
									Static194.aBooleanArray17[local51] = true;
									Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
								}
								continue;
							}
							if (local25.anInt4198 == 1400) {
								Static60.method1349(local25.anInt4133, local110, local104, Static220.anInterface2_4, Static218.aClass46_5, local25.anInt4199);
								Static338.aBooleanArray29[local51] = true;
								Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
								continue;
							}
							if (local25.anInt4198 == 1401) {
								Static116.method2456(local25.anInt4133, local110, local25.anInt4199, local104, Static218.aClass46_5);
								Static338.aBooleanArray29[local51] = true;
								Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
								continue;
							}
							if (local25.anInt4198 == 1405) {
								if (!Static66.aBoolean104 && !Static266.aBoolean337) {
									continue;
								}
								local238 = local104 + local25.anInt4133;
								local243 = local110 + 15;
								if (Static66.aBoolean104) {
									Static245.aClass30_7.method5587("Fps:" + Static116.anInt2558, local243, local238, -256);
									local243 += 15;
									@Pc(511) Runtime local511 = Runtime.getRuntime();
									local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
									local523 = -256;
									if (local521 > 65536) {
										local523 = -65536;
									}
									Static245.aClass30_7.method5587("Mem:" + local521 + "k", local243, local238, local523);
									local243 += 15;
									local552 = Static218.aClass46_5.method5174() / 1024;
									Static245.aClass30_7.method5587("Offheap:" + local552 + "k", local243, local238, local552 > 65536 ? -65536 : -256);
									local243 += 15;
									local576 = 0;
									local578 = 0;
									local580 = 0;
									for (local582 = 0; local582 < 29; local582++) {
										local576 += Static329.aClass121_Sub1Array2[local582].method3323();
										local578 += Static329.aClass121_Sub1Array2[local582].method3331();
										local580 += Static329.aClass121_Sub1Array2[local582].method3328();
									}
									@Pc(620) int local620 = local580 * 100 / local576;
									local626 = local578 * 10000 / local576;
									@Pc(646) String local646 = "Cache:" + Static131.method1790(true, 2, 0, (long) local626) + "% (" + local620 + "%)";
									Static170.aClass30_6.method5587(local646, local243, local238, -256);
									local243 += 12;
								}
								if (Static228.anInt4498 > 0) {
									Static170.aClass30_6.method5587("Particles: " + Static115.anInt2547 + " / " + Static228.anInt4498, local243, local238, -256);
								}
								local243 += 12;
								if (Static266.aBoolean337) {
									Static170.aClass30_6.method5587("Polys: " + Static218.aClass46_5.method5146() + " Models: " + Static218.aClass46_5.method5129(), local243, local238, -256);
									local243 += 12;
									Static170.aClass30_6.method5587("Ls: " + Static267.anInt5096 + " La: " + Static123.anInt5900 + " NPC: " + Static69.anInt1671 + " Pl: " + Static249.anInt4820, local243, local238, -256);
									Static189.method5493();
									local243 += 12;
								}
								Static338.aBooleanArray29[local51] = true;
								continue;
							}
						}
						if (local25.anInt4135 == 0) {
							if (!local25.aBoolean260 && Static42.method1037(local25) && local25 != Static86.aClass146_19) {
								continue;
							}
							if (!local25.aBoolean260) {
								if (local25.anInt4128 > local25.anInt4197 - local25.anInt4199) {
									local25.anInt4128 = local25.anInt4197 - local25.anInt4199;
								}
								if (local25.anInt4128 < 0) {
									local25.anInt4128 = 0;
								}
							}
							if (local25.anInt4198 == 1407 && Static218.aClass46_5.method5151()) {
								Static218.aClass46_5.method5188(local104, local110, local25.anInt4133, local25.anInt4199);
							}
							method3919(local51, local160, local110 - local25.anInt4128, local25.anInt4214, local158, arg5, local285, local104 - local25.anInt4176, local278);
							if (local25.aClass146Array2 != null) {
								method3919(local51, local160, local110 - local25.anInt4128, local25.anInt4214, local158, local25.aClass146Array2, local285, local104 - local25.anInt4176, local278);
							}
							@Pc(845) Class14_Sub27 local845 = (Class14_Sub27) Static198.aClass25_20.method691((long) local25.anInt4214);
							if (local845 != null) {
								Static220.method3965(local158, local285, local51, local845.anInt5186, local160, local278, local110, local104);
							}
							if (local25.anInt4198 == 1407 && Static218.aClass46_5.method5151()) {
								Static218.aClass46_5.method5183();
								Static1.aBoolean433 = true;
							}
							Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
						}
						if (Static127.aBooleanArray14[local51] || Static9.anInt209 > 1) {
							if (local25.anInt4135 == 0 && !local25.aBoolean260 && local25.anInt4199 < local25.anInt4197) {
								Static75.method1894(local25.anInt4128, local104 + local25.anInt4133, local25.anInt4197, local25.anInt4199, local110);
							}
							if (local25.anInt4135 != 1) {
								@Pc(935) int local935;
								if (local25.anInt4135 == 2) {
									local238 = 0;
									for (local243 = 0; local243 < local25.anInt4129; local243++) {
										for (local935 = 0; local935 < local25.anInt4125; local935++) {
											local521 = local104 + local935 * (local25.anInt4172 + 32);
											local523 = local110 + (local25.anInt4212 + 32) * local243;
											if (local238 < 20) {
												local523 += local25.anIntArray363[local238];
												local521 += local25.anIntArray371[local238];
											}
											if (local25.anIntArray374[local238] > 0) {
												local578 = local25.anIntArray374[local238] - 1;
												if (arg4 < local521 + 32 && arg8 > local521 && arg1 < local523 + 32 && local523 < arg6 || Static176.aClass146_40 == local25 && Static354.anInt6717 == local238) {
													@Pc(1081) Class2 local1081;
													if (Static312.anInt6025 == 1 && local238 == Static228.anInt4500 && Static247.anInt4790 == local25.anInt4214) {
														local1081 = Static280.method5744(null, Static218.aClass46_5, local578, local25.anIntArray361[local238], 2, local25.anInt4145, 0);
													} else {
														local1081 = Static280.method5744(null, Static218.aClass46_5, local578, local25.anIntArray361[local238], 1, local25.anInt4145, -13623264);
													}
													if (local1081 == null) {
														Static166.method3295(local25);
													} else if (local25 == Static176.aClass146_40 && Static354.anInt6717 == local238) {
														local576 = Static328.anInt6333 - Static44.anInt1107;
														local552 = Static63.anInt1529 - Static302.anInt5839;
														if (local552 < 5 && local552 > -5) {
															local552 = 0;
														}
														if (local576 < 5 && local576 > -5) {
															local576 = 0;
														}
														if (Static193.anInt3955 < 5) {
															local552 = 0;
															local576 = 0;
														}
														local1081.method2643(local552 + local521, local523 + local576, 0, -2013265920);
														if (arg3 != -1) {
															@Pc(1162) Class146 local1162 = arg5[arg3 & 0xFFFF];
															@Pc(1165) int[] local1165 = new int[4];
															Static218.aClass46_5.method5133(local1165);
															local626 = local1165[1];
															@Pc(1176) int local1176 = local1165[3];
															@Pc(1203) int local1203;
															if (local576 + local523 < local626 && local1162.anInt4128 > 0) {
																local1203 = (local626 - local576 - local523) * Static71.anInt5636 / 3;
																if (Static71.anInt5636 * 10 < local1203) {
																	local1203 = Static71.anInt5636 * 10;
																}
																if (local1162.anInt4128 < local1203) {
																	local1203 = local1162.anInt4128;
																}
																local1162.anInt4128 -= local1203;
																Static44.anInt1107 += local1203;
																Static166.method3295(local1162);
															}
															if (local523 + local576 + 32 > local1176 && local1162.anInt4128 < local1162.anInt4197 - local1162.anInt4199) {
																local1203 = Static71.anInt5636 * (local523 + local576 + 32 - local1176) / 3;
																if (local1203 > Static71.anInt5636 * 10) {
																	local1203 = Static71.anInt5636 * 10;
																}
																if (local1203 > local1162.anInt4197 - local1162.anInt4128 - local1162.anInt4199) {
																	local1203 = local1162.anInt4197 - local1162.anInt4199 - local1162.anInt4128;
																}
																Static44.anInt1107 -= local1203;
																local1162.anInt4128 += local1203;
																Static166.method3295(local1162);
															}
														}
													} else if (local25 == Static72.aClass146_17 && local238 == Static109.anInt2426) {
														local1081.method2643(local521, local523, 0, -2013265920);
													} else {
														local1081.method2642(local521, local523);
													}
												}
											} else if (local25.anIntArray372 != null && local238 < 20) {
												@Pc(995) Class2 local995 = local25.method3801(local238, Static218.aClass46_5);
												if (local995 != null) {
													local995.method2642(local521, local523);
												} else if (Static242.aBoolean316) {
													Static166.method3295(local25);
												}
											}
											local238++;
										}
									}
								} else if (local25.anInt4135 == 3) {
									if (Static51.method1232(local25)) {
										local238 = local25.anInt4152;
										if (Static86.aClass146_19 == local25 && local25.anInt4138 != 0) {
											local238 = local25.anInt4138;
										}
									} else {
										local238 = local25.anInt4166;
										if (Static86.aClass146_19 == local25 && local25.anInt4134 != 0) {
											local238 = local25.anInt4134;
										}
									}
									if (local113 == 0) {
										if (local25.aBoolean259) {
											Static218.aClass46_5.method5110(local104, local110, local25.anInt4133, local25.anInt4199, local238, 0);
										} else {
											Static218.aClass46_5.method5143(local104, local110, local25.anInt4133, local25.anInt4199, local238, 0);
										}
									} else if (local25.aBoolean259) {
										Static218.aClass46_5.method5110(local104, local110, local25.anInt4133, local25.anInt4199, local238 & 0xFFFFFF | 255 - (local113 & 0xFF) << 24, 1);
									} else {
										Static218.aClass46_5.method5143(local104, local110, local25.anInt4133, local25.anInt4199, local238 & 0xFFFFFF | 255 - (local113 & 0xFF) << 24, 1);
									}
								} else {
									@Pc(1483) Class30 local1483;
									if (local25.anInt4135 == 4) {
										local1483 = local25.method3806(Static218.aClass46_5);
										if (local1483 != null) {
											@Pc(1495) String local1495 = local25.aString149;
											if (Static51.method1232(local25)) {
												local243 = local25.anInt4152;
												if (Static86.aClass146_19 == local25 && local25.anInt4138 != 0) {
													local243 = local25.anInt4138;
												}
												if (local25.aString145.length() > 0) {
													local1495 = local25.aString145;
												}
											} else {
												local243 = local25.anInt4166;
												if (local25 == Static86.aClass146_19 && local25.anInt4134 != 0) {
													local243 = local25.anInt4134;
												}
											}
											if (local25.aBoolean260 && local25.anInt4124 != -1) {
												@Pc(1544) Class220 local1544 = Static296.method5066(local25.anInt4124);
												local1495 = local1544.aString251;
												if (local1495 == null) {
													local1495 = "null";
												}
												if ((local1544.anInt6659 == 1 || local25.anInt4206 != 1) && local25.anInt4206 != -1) {
													local1495 = "<col=ff9040>" + local1495 + "</col> x" + Static148.method2973(local25.anInt4206);
												}
											}
											if (Static278.aClass146_51 == local25) {
												local1495 = Static259.aString186;
												local243 = local25.anInt4166;
											}
											if (!local25.aBoolean260) {
												local1495 = Static156.method5349(local25, local1495);
											}
											if (Static205.aBoolean255) {
												Static218.aClass46_5.method5107(local104, local110, local25.anInt4133 + local104, local25.anInt4199 + local110);
											}
											local1483.method5577(local110, Static18.aClass2Array3, local25.anInt4184, null, null, local25.anInt4199, local25.anInt4123, local25.anInt4133, local243 | 0xFF000000, local25.anInt4192, 0, local1495, local104, 0, local25.aBoolean275 ? -16777216 : -1);
											if (Static205.aBoolean255) {
												Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
											}
										} else if (Static242.aBoolean316) {
											Static166.method3295(local25);
										}
									} else if (local25.anInt4135 == 5) {
										@Pc(1664) Class2 local1664;
										if (!local25.aBoolean260) {
											local1664 = local25.method3803(Static51.method1232(local25), Static218.aClass46_5);
											if (local1664 != null) {
												local1664.method2642(local104, local110);
											} else if (Static242.aBoolean316) {
												Static166.method3295(local25);
											}
										} else if (local25.anInt4142 < 0) {
											if (local25.anInt4124 == -1) {
												local1664 = local25.method3803(false, Static218.aClass46_5);
											} else {
												@Pc(1698) Class83 local1698 = local25.aBoolean271 ? Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 : null;
												local1664 = Static280.method5744(local1698, Static218.aClass46_5, local25.anInt4124, local25.anInt4206, local25.anInt4210, local25.anInt4145, local25.anInt4203 | 0xFF000000);
											}
											if (local1664 != null) {
												local243 = local1664.method2630();
												local935 = local1664.method2627();
												if (local25.aBoolean265) {
													Static218.aClass46_5.method5107(local104, local110, local25.anInt4133 + local104, local25.anInt4199 + local110);
													if (local25.anInt4180 != 0) {
														local521 = (local25.anInt4133 + local243 - 1) / local243;
														local523 = (local935 + local25.anInt4199 - 1) / local935;
														for (local552 = 0; local552 < local521; local552++) {
															for (local576 = 0; local576 < local523; local576++) {
																local1664.method2629((float) local243 / 2.0F + (float) (local104 + local243 * local552), (float) local935 / 2.0F + (float) (local110 + local576 * local935), 4096, local25.anInt4180);
															}
														}
													} else if (local113 == 0) {
														local1664.method2641(local104, local110, local25.anInt4133, local25.anInt4199, 0, 0);
													} else {
														local1664.method2641(local104, local110, local25.anInt4133, local25.anInt4199, 1, 255 - (local113 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
												} else if (local113 != 0) {
													local521 = 255 - (local113 & 0xFF) << 24 | 0xFFFFFF;
													if (local25.anInt4180 != 0) {
														local1664.method2626((float) local104 + (float) local25.anInt4133 / 2.0F, (float) local25.anInt4199 / 2.0F + (float) local110, local25.anInt4133 * 4096 / local243, local25.anInt4180, local521);
													} else if (local25.anInt4133 == local243 && local25.anInt4199 == local935) {
														local1664.method2643(local104, local110, 1, local521);
													} else {
														local1664.method2637(local104, local110, local25.anInt4133, local25.anInt4199, 1, local521, 1);
													}
												} else if (local25.anInt4180 != 0) {
													local1664.method2629((float) local25.anInt4133 / 2.0F + (float) local104, (float) local25.anInt4199 / 2.0F + (float) local110, local25.anInt4133 * 4096 / local243, local25.anInt4180);
												} else if (local25.anInt4133 == local243 && local935 == local25.anInt4199) {
													local1664.method2642(local104, local110);
												} else {
													local1664.method2632(local104, local110, local25.anInt4133, local25.anInt4199);
												}
											} else if (Static242.aBoolean316) {
												Static166.method3295(local25);
											}
										} else {
											local25.method3802().method5823(local25.anInt4199, Static218.aClass46_5, local25.anInt4207 << 3, local25.anInt4188 << 3, 0, 0, local104, local25.anInt4133, local110);
										}
									} else {
										@Pc(2277) Class220 local2277;
										if (local25.anInt4135 == 6) {
											@Pc(2052) boolean local2052 = Static51.method1232(local25);
											if (local2052) {
												local243 = local25.anInt4191;
											} else {
												local243 = local25.anInt4202;
											}
											Static312.method5392();
											@Pc(2066) Class45 local2066 = null;
											local521 = 0;
											@Pc(2248) Class83 local2248;
											@Pc(2238) Class79 local2238;
											if (local25.anInt4124 != -1) {
												local2277 = Static296.method5066(local25.anInt4124);
												if (local2277 != null) {
													local2277 = local2277.method5967(local25.anInt4206);
													local2238 = local243 == -1 ? null : Static233.method4080(local243);
													local2248 = local25.aBoolean271 ? Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 : null;
													local2066 = local2277.method5964(local2238, 1024, Static218.aClass46_5, local2248, 1, local25.anInt4155, local25.anInt4147, local25.anInt4201);
													if (local2066 == null) {
														Static166.method3295(local25);
													} else {
														local521 = -local2066.method1781() / 2;
													}
												}
											} else if (local25.anInt4169 == 5) {
												if (local25.anInt4179 == -1) {
													local2066 = Static189.aClass83_5.method2453(null, -1, 0, -1, -1, null, 0, 1024, Static218.aClass46_5, -1, null);
												} else {
													local523 = local25.anInt4179;
													@Pc(2097) Class10_Sub3_Sub3_Sub2 local2097;
													if (Static266.anInt5054 == local523) {
														local2097 = Static173.aClass10_Sub3_Sub3_Sub2_1;
													} else {
														local2097 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local523];
													}
													@Pc(2111) Class79 local2111 = local243 == -1 ? null : Static233.method4080(local243);
													if (local2097 != null && (local523 == 2047 || Static164.method3267(local2097.aString224) == local25.anInt4204)) {
														local2066 = local2097.aClass83_4.method2453(null, local25.anInt4147, local25.anInt4201, 0, -1, null, 0, 1024, Static218.aClass46_5, local25.anInt4155, local2111);
													}
												}
											} else if (local25.anInt4169 == 8 || local25.anInt4169 == 9) {
												@Pc(2226) Class14_Sub37 local2226 = Static33.method835(local25.anInt4179);
												local2238 = local243 == -1 ? null : Static233.method4080(local243);
												if (local2226 != null) {
													local2248 = local25.aBoolean271 ? Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4 : null;
													local2066 = local2226.method5730(local25.anInt4147, local25.anInt4201, local2248, local25.anInt4155, Static218.aClass46_5, local25.anInt4204, local25.anInt4169 == 9, local2238);
												}
											} else if (local243 == -1) {
												local2066 = local25.method3795(1024, -1, Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4, Static218.aClass46_5, null, 0, -1, local2052);
												if (local2066 == null && Static242.aBoolean316) {
													Static166.method3295(local25);
												}
											} else {
												@Pc(2176) Class79 local2176 = Static233.method4080(local243);
												local2066 = local25.method3795(1024, local25.anInt4147, Static173.aClass10_Sub3_Sub3_Sub2_1.aClass83_4, Static218.aClass46_5, local2176, local25.anInt4201, local25.anInt4155, local2052);
												if (local2066 == null && Static242.aBoolean316) {
													Static166.method3295(local25);
												}
											}
											if (local2066 != null) {
												if (local25.anInt4173 <= 0) {
													local523 = 512;
												} else {
													local523 = (local25.anInt4133 << 9) / local25.anInt4173;
												}
												if (local25.anInt4130 > 0) {
													local552 = (local25.anInt4199 << 9) / local25.anInt4130;
												} else {
													local552 = 512;
												}
												local576 = local104 + local25.anInt4133 / 2 + (local25.anInt4205 * local523 >> 9);
												local578 = local25.anInt4199 / 2 + local110 + (local25.anInt4158 * local552 >> 9);
												Static197.aClass51_3.method3560();
												Static218.aClass46_5.method5144(Static197.aClass51_3);
												local580 = local25.anInt4211 * Class14_Sub3_Sub34.anIntArray547[local25.anInt4165 << 3] >> 15;
												local582 = Class14_Sub3_Sub34.anIntArray546[local25.anInt4165 << 3] * local25.anInt4211 >> 15;
												Static218.aClass46_5.method5178(local576, local578, local523, local552);
												Static218.aClass46_5.method5161((float) local25.aShort62, local25.aBoolean267 ? (float) local25.aShort63 : (float) local25.aShort63 * 1.5F);
												if (Static1.aBoolean433) {
													Static218.aClass46_5.method5139();
													Static218.aClass46_5.method5153();
													Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
													Static1.aBoolean433 = false;
												}
												if (local25.aBoolean262) {
													Static218.aClass46_5.method5156(false);
												}
												if (local25.aBoolean260) {
													Static74.aClass51_4.method3549(-local25.anInt4139 << 3);
													Static74.aClass51_4.method3554(local25.anInt4190 << 3);
													Static74.aClass51_4.method3561(local25.anInt4177, local25.anInt4175 + local521 + local580, local582 + local25.anInt4175);
												} else {
													Static74.aClass51_4.method3559(local25.anInt4190 << 3);
													Static74.aClass51_4.method3561(0, local580, local582);
												}
												Static74.aClass51_4.method3557(local25.anInt4165 << 3);
												if (Static205.aBoolean255) {
													Static218.aClass46_5.method5107(local104, local110, local104 + local25.anInt4133, local25.anInt4199 + local110);
												}
												if (local25.aBoolean267) {
													local2066.method1799(Static74.aClass51_4, null, local25.anInt4211);
												} else {
													local2066.method1794(Static74.aClass51_4, null, 1);
												}
												if (Static205.aBoolean255) {
													Static218.aClass46_5.method5172(arg4, arg1, arg8, arg6);
												}
												if (local25.aBoolean262) {
													Static218.aClass46_5.method5156(true);
												}
											}
										} else {
											if (local25.anInt4135 == 7) {
												local1483 = local25.method3806(Static218.aClass46_5);
												if (local1483 == null) {
													if (Static242.aBoolean316) {
														Static166.method3295(local25);
													}
													continue;
												}
												local243 = 0;
												for (local935 = 0; local935 < local25.anInt4129; local935++) {
													for (local521 = 0; local521 < local25.anInt4125; local521++) {
														if (local25.anIntArray374[local243] > 0) {
															local2277 = Static296.method5066(local25.anIntArray374[local243] - 1);
															@Pc(2640) String local2640;
															if (local2277.anInt6659 != 1 && local25.anIntArray361[local243] == 1) {
																local2640 = "<col=ff9040>" + local2277.aString251 + "</col>";
															} else {
																local2640 = "<col=ff9040>" + local2277.aString251 + "</col> x" + Static148.method2973(local25.anIntArray361[local243]);
															}
															local576 = local521 * (local25.anInt4172 + 115) + local104;
															local578 = local110 + local935 * (local25.anInt4212 + 12);
															if (local25.anInt4184 == 0) {
																local1483.method5575(local578, local2640, null, local25.aBoolean275 ? -16777216 : -1, local25.anInt4166 | 0xFF000000, local576, Static18.aClass2Array3);
															} else if (local25.anInt4184 == 1) {
																local1483.method5586(null, local25.aBoolean275 ? -16777216 : -1, local578, local25.anInt4166 | 0xFF000000, local2640, Static18.aClass2Array3, local576 + 57);
															} else {
																local1483.method5590(local2640, local578, local576 + 115 - 1, null, Static18.aClass2Array3, local25.aBoolean275 ? -16777216 : -1, local25.anInt4166 | 0xFF000000);
															}
														}
														local243++;
													}
												}
											}
											if (local25.anInt4135 == 8 && local25 == Static2.aClass146_1 && Static53.anInt1331 == Static175.anInt3622) {
												local238 = 0;
												local243 = 0;
												@Pc(2774) Class30 local2774 = Static245.aClass30_7;
												@Pc(2777) String local2777 = local25.aString149;
												local2777 = Static156.method5349(local25, local2777);
												@Pc(2796) String local2796;
												while (local2777.length() > 0) {
													local552 = local2777.indexOf("<br>");
													if (local552 == -1) {
														local2796 = local2777;
														local2777 = "";
													} else {
														local2796 = local2777.substring(0, local552);
														local2777 = local2777.substring(local552 + 4);
													}
													local576 = Static108.aClass76_5.method2256(local2796);
													if (local576 > local238) {
														local238 = local576;
													}
													local243 += Static108.aClass76_5.anInt2280 + 1;
												}
												local243 += 7;
												local238 += 6;
												local552 = local104 + local25.anInt4133 - local238 - 5;
												if (local104 + 5 > local552) {
													local552 = local104 + 5;
												}
												local576 = local25.anInt4199 + local110 + 5;
												if (local238 + local552 > arg8) {
													local552 = arg8 - local238;
												}
												if (arg6 < local576 + local243) {
													local576 = arg6 - local243;
												}
												Static218.aClass46_5.method5110(local552, local576, local238, local243, -96, 0);
												Static218.aClass46_5.method5143(local552, local576, local238, local243, -16777216, 0);
												local2777 = local25.aString149;
												local578 = Static108.aClass76_5.anInt2280 + local576 + 2;
												local2777 = Static156.method5349(local25, local2777);
												while (local2777.length() > 0) {
													local580 = local2777.indexOf("<br>");
													if (local580 == -1) {
														local2796 = local2777;
														local2777 = "";
													} else {
														local2796 = local2777.substring(0, local580);
														local2777 = local2777.substring(local580 + 4);
													}
													local2774.method5572(local552 + 3, -1, -16777216, local578, local2796);
													local578 += Static108.aClass76_5.anInt2280 + 1;
												}
											}
											if (local25.anInt4135 == 9) {
												if (local25.aBoolean266) {
													local935 = local25.anInt4133 + local104;
													local243 = local110 + local25.anInt4199;
													local521 = local110;
												} else {
													local935 = local104 + local25.anInt4133;
													local243 = local110;
													local521 = local25.anInt4199 + local110;
												}
												if (local25.anInt4178 == 1) {
													Static218.aClass46_5.method5189(local104, local243, local935, local521, local25.anInt4166, 0);
												} else {
													Static218.aClass46_5.method5092(local104, local243, local935, local521, local25.anInt4166, local25.anInt4178);
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
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIZIII)V")
	private static void method3920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (Static98.aClass213ArrayArrayArray2 == null) {
			Static218.aClass46_5.method5108(arg1, arg0, arg4, -16777216, arg3);
			return;
		}
		Static295.anInt5671++;
		if (Static173.aClass10_Sub3_Sub3_Sub2_1 != null && Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 - (Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() - 1) * 64 >> 7 == Static140.anInt2984 && Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 + 64 - Static173.aClass10_Sub3_Sub3_Sub2_1.method5353() * 64 >> 7 == Static213.anInt4250) {
			Static140.anInt2984 = -1;
			Static213.anInt4250 = -1;
			Static297.method5073();
		}
		Static162.method3228();
		if (!arg2) {
			Static313.method5400();
		}
		Static334.method5748();
		Static273.method4627(arg3, arg4, arg0, arg1, true);
		@Pc(78) int local78 = Static275.anInt5240;
		@Pc(80) int local80 = Static76.anInt1855;
		@Pc(82) int local82 = Static210.anInt4219;
		@Pc(84) int local84 = Static21.anInt1369;
		@Pc(93) int local93;
		@Pc(124) int local124;
		if (Static205.anInt4115 == 1) {
			local93 = (int) Static274.aFloat100;
			if (Static313.anInt6043 >> 8 > local93) {
				local93 = Static313.anInt6043 >> 8;
			}
			if (Static189.aBooleanArray24[4] && Static325.anIntArray600[4] + 128 > local93) {
				local93 = Static325.anIntArray600[4] + 128;
			}
			local124 = (int) Static94.aFloat42 + Static70.anInt1688 & 0x3FFF;
			Static38.method914((local93 >> 3) * 3 + 600, local93, Static279.method4730(Static219.anInt4400, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908) - 50, Static340.anInt6526, local80, Static17.anInt349, local124);
		} else if (Static205.anInt4115 == 4) {
			local93 = (int) Static274.aFloat100;
			if (local93 < Static313.anInt6043 >> 8) {
				local93 = Static313.anInt6043 >> 8;
			}
			if (Static189.aBooleanArray24[4] && local93 < Static325.anIntArray600[4] + 128) {
				local93 = Static325.anIntArray600[4] + 128;
			}
			local124 = (int) Static94.aFloat42 & 0x3FFF;
			Static38.method914((local93 >> 3) * 3 + 600, local93, Static279.method4730(Static219.anInt4400, Static41.anInt982, Static141.anInt2992) - 50, Static340.anInt6526, local80, Static17.anInt349, local124);
		} else if (Static205.anInt4115 == 5) {
			Static278.method4714(local80);
		}
		local93 = Static124.anInt2717;
		local124 = Static103.anInt2301;
		@Pc(222) int local222 = Static141.anInt2986;
		@Pc(224) int local224 = Static112.anInt2486;
		@Pc(226) int local226 = Static249.anInt4824;
		@Pc(270) int local270;
		for (@Pc(228) int local228 = 0; local228 < 5; local228++) {
			if (Static189.aBooleanArray24[local228]) {
				local270 = (int) ((double) -Static282.anIntArray488[local228] + (double) (Static282.anIntArray488[local228] * 2 + 1) * Math.random() + Math.sin((double) Static102.anIntArray210[local228] * ((double) Static271.anIntArray469[local228] / 100.0D)) * (double) Static325.anIntArray600[local228]);
				if (local228 == 2) {
					Static141.anInt2986 += local270;
				}
				if (local228 == 1) {
					Static103.anInt2301 += local270;
				}
				if (local228 == 4) {
					Static112.anInt2486 += local270;
					if (Static112.anInt2486 < 1024) {
						Static112.anInt2486 = 1024;
					} else if (Static112.anInt2486 > 3072) {
						Static112.anInt2486 = 3072;
					}
				}
				if (local228 == 3) {
					Static249.anInt4824 = Static249.anInt4824 + local270 & 0x3FFF;
				}
				if (local228 == 0) {
					Static124.anInt2717 += local270;
				}
			}
		}
		if (Static124.anInt2717 < 0) {
			Static124.anInt2717 = 0;
		}
		if ((Static233.anInt4556 << 7) - 1 < Static124.anInt2717) {
			Static124.anInt2717 = (Static233.anInt4556 << 7) - 1;
		}
		if (Static141.anInt2986 < 0) {
			Static141.anInt2986 = 0;
		}
		if ((Static180.anInt3712 << 7) - 1 < Static141.anInt2986) {
			Static141.anInt2986 = (Static180.anInt3712 << 7) - 1;
		}
		Static229.method4042();
		Static348.method4748();
		Static218.aClass46_5.method5172(local84, local82, local78 + local84, local80 + local82);
		Static218.aClass46_5.method5153();
		local270 = Static39.anInt977;
		if (Static253.aClass208_2 == null) {
			Static218.aClass46_5.method5100(local270);
		} else {
			Static253.aClass208_2.method5823(local80, Static218.aClass46_5, Static112.anInt2486, Static249.anInt4824, Static58.anInt1407 << 3, local270, local84, local78, local82);
		}
		Static151.method3006();
		Static197.aClass51_3.method3552(Static124.anInt2717, Static103.anInt2301, Static141.anInt2986, -Static112.anInt2486 & 0x3FFF, -Static249.anInt4824 & 0x3FFF, -Static295.anInt5672 & 0x3FFF);
		Static218.aClass46_5.method5144(Static197.aClass51_3);
		Static218.aClass46_5.method5178(local84 + local78 / 2, local82 + local80 / 2, Static61.anInt1458 << 1, Static61.anInt1458 << 1);
		Static206.method5996(local82 + local80 / 2, Static61.anInt1458 << 1, Static61.anInt1458 << 1, local78 / 2 + local84);
		Static231.method4073(-Static249.anInt4824 & 0x3FFF, Static103.anInt2301, Static141.anInt2986, Static124.anInt2717, -Static295.anInt5672 & 0x3FFF, -Static112.anInt2486 & 0x3FFF);
		@Pc(507) byte local507 = Static276.method4686() == 2 ? (byte) Static295.anInt5671 : 1;
		Static281.method4773(Static218.aClass46_5, Static153.anInt3257, Static202.anInt4074, Static197.aClass51_3, Static124.anInt2717, Static103.anInt2301, Static141.anInt2986, Static124.aByteArrayArrayArray6, Static118.anIntArray230, Static63.anIntArray110, Static167.anIntArray487, Static353.anIntArray644, Static9.anIntArray12, Static219.anInt4400 + 1, local507, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5910 >> 7, Static173.aClass10_Sub3_Sub3_Sub2_1.anInt5908 >> 7, !Static281.aBoolean353);
		Static151.method3006();
		if (Static302.anInt5842 == 30) {
			Static174.method3397(local82, local84, local78, local80);
			Static166.method3293(local78, local80, local82, local84);
			Static116.method2454(local82, local80, local84, local78);
			Static321.method5535(local80, local84, local78, local82);
		}
		Static132.method2704();
		Static112.anInt2486 = local224;
		Static141.anInt2986 = local222;
		Static249.anInt4824 = local226;
		Static124.anInt2717 = local93;
		Static103.anInt2301 = local124;
		if (Static222.aBoolean294 && Static155.aClass35_2.method1157() == 0) {
			Static222.aBoolean294 = false;
		}
		if (Static222.aBoolean294) {
			Static218.aClass46_5.method5108(local78, local84, local80, -16777216, local82);
			Static162.method3226(Static84.aString78, false, Static245.aClass30_7);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ap;Ljava/awt/Frame;)V")
	public static void method3923(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class205 local10 = arg0.method273(arg1);
			while (local10.anInt6370 == 0) {
				Static15.method5425(10L);
			}
			if (local10.anInt6370 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static15.method5425(100L);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "()V")
	public static void method3924() {
		Static104.method2278(Static125.anInt2719);
	}
}
