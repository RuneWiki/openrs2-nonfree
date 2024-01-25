import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static225 {

	@OriginalMember(owner = "client!oj", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString133 = "purple:";

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIII[Lclient!rg;I)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class177[] arg7, @OriginalArg(9) int arg8) {
		Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
		for (@Pc(17) int local17 = 0; local17 < arg7.length; local17++) {
			@Pc(23) Class177 local23 = arg7[local17];
			if (local23 != null && (local23.anInt5236 == arg4 || arg4 == -1412584499 && local23 == Static317.aClass177_22)) {
				@Pc(43) int local43;
				if (arg0 == -1) {
					Class1_Sub2_Sub3.aRectangleArray1[Static118.anInt4791].setBounds(local23.anInt5201 + arg3, local23.anInt5177 - -arg2, local23.anInt5179, local23.anInt5209);
					local43 = Static118.anInt4791++;
				} else {
					local43 = arg0;
				}
				local23.anInt5242 = local43;
				local23.anInt5248 = Static215.anInt4246;
				if (!local23.aBoolean445 || !Static47.method1090(local23)) {
					if (local23.anInt5204 > 0) {
						Static68.method1382(local23);
					}
					@Pc(91) int local91 = arg3 + local23.anInt5201;
					@Pc(96) int local96 = arg2 + local23.anInt5177;
					@Pc(99) int local99 = local23.anInt5264;
					if (Static25.aBoolean62 && (Static47.method1096(local23).anInt5507 != 0 || local23.anInt5208 == 0) && local99 > 127) {
						local99 = 127;
					}
					@Pc(138) int local138;
					@Pc(140) int local140;
					if (Static317.aClass177_22 == local23) {
						if (arg4 != -1412584499 && !local23.aBoolean441) {
							Static332.anInt6360 = arg2;
							Static137.aClass177Array1 = arg7;
							Static222.anInt4388 = arg3;
							continue;
						}
						if (Static119.aBoolean174 && Static313.aBoolean531) {
							local138 = Static179.anInt3693;
							local140 = Static295.anInt5742;
							local138 -= Static318.anInt6103;
							local140 -= Static313.anInt6037;
							if (Static194.anInt3964 > local138) {
								local138 = Static194.anInt3964;
							}
							if (local140 < Static111.anInt2273) {
								local140 = Static111.anInt2273;
							}
							if (Static194.anInt3964 + Static66.aClass177_3.anInt5179 < local138 - -local23.anInt5179) {
								local138 = Static194.anInt3964 + Static66.aClass177_3.anInt5179 - local23.anInt5179;
							}
							local91 = local138;
							if (local140 + local23.anInt5209 > Static66.aClass177_3.anInt5209 + Static111.anInt2273) {
								local140 = Static66.aClass177_3.anInt5209 + Static111.anInt2273 - local23.anInt5209;
							}
							local96 = local140;
						}
						if (!local23.aBoolean441) {
							local99 = 128;
						}
					}
					@Pc(265) int local265;
					@Pc(276) int local276;
					@Pc(225) int local225;
					@Pc(230) int local230;
					if (local23.anInt5208 == 2) {
						local276 = arg6;
						local265 = arg5;
						local140 = arg1;
						local138 = arg8;
					} else {
						local225 = local91 + local23.anInt5179;
						local230 = local23.anInt5209 + local96;
						if (local23.anInt5208 == 9) {
							local230++;
							local225++;
						}
						local138 = arg8 < local91 ? local91 : arg8;
						local140 = local96 > arg1 ? local96 : arg1;
						local265 = local225 < arg5 ? local225 : arg5;
						local276 = arg6 > local230 ? local230 : arg6;
					}
					if (!local23.aBoolean445 || local138 < local265 && local276 > local140) {
						@Pc(511) int local511;
						@Pc(566) int local566;
						@Pc(568) int local568;
						@Pc(570) int local570;
						@Pc(572) int local572;
						@Pc(614) int local614;
						@Pc(540) int local540;
						@Pc(513) int local513;
						if (local23.anInt5204 != 0) {
							if (local23.anInt5204 == 1337 || local23.anInt5204 == 1403) {
								Static347.method4027(local23.anInt5179, local96, local23.anInt5204 == 1403, local91, local23.anInt5209);
								Static313.aBooleanArray30[local43] = true;
								Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
								continue;
							}
							if (local23.anInt5204 == 1338) {
								if (local23.method4686(Static34.aClass2_6) != null) {
									Static278.method4804();
									Static269.method4688(local91, Static34.aClass2_6, local23, local96);
									Static253.aBooleanArray27[local43] = true;
									Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
								}
								continue;
							}
							if (local23.anInt5204 == 1339) {
								if (local23.method4686(Static34.aClass2_6) != null) {
									Static121.method2169(local23, local96, local91);
									Static253.aBooleanArray27[local43] = true;
									Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
								}
								continue;
							}
							if (local23.anInt5204 == 1400) {
								Static244.method4319(Static62.anInterface7_1, local23.anInt5209, local23.anInt5179, local96, Static34.aClass2_6, local91);
								Static313.aBooleanArray30[local43] = true;
								Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
								continue;
							}
							if (local23.anInt5204 == 1401) {
								Static183.method3562(local91, local23.anInt5209, local23.anInt5179, Static34.aClass2_6, local96);
								Static313.aBooleanArray30[local43] = true;
								Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
								continue;
							}
							if (local23.anInt5204 == 1405) {
								if (!Static118.aBoolean403 && !Static89.aBoolean157) {
									continue;
								}
								local225 = local91 + local23.anInt5179;
								local230 = local96 + 15;
								if (Static118.aBoolean403) {
									Static9.aClass13_1.method4452("Fps:" + Static50.anInt1156, local225, -256, local230);
									local230 += 15;
									@Pc(502) Runtime local502 = Runtime.getRuntime();
									local511 = (int) ((local502.totalMemory() - local502.freeMemory()) / 1024L);
									local513 = -256;
									if (local511 > 65536) {
										local513 = -65536;
									}
									Static9.aClass13_1.method4452("Mem:" + local511 + "k", local225, local513, local230);
									local230 += 15;
									local540 = Static34.aClass2_6.method3262() / 1024;
									Static9.aClass13_1.method4452("Offheap:" + local540 + "k", local225, local540 <= 65536 ? -256 : -65536, local230);
									local230 += 15;
									local566 = 0;
									local568 = 0;
									local570 = 0;
									for (local572 = 0; local572 < 29; local572++) {
										local566 += Static111.aClass56_Sub1Array1[local572].method1648();
										local568 += Static111.aClass56_Sub1Array1[local572].method1652();
										local570 += Static111.aClass56_Sub1Array1[local572].method1647();
									}
									@Pc(608) int local608 = local570 * 100 / local566;
									local614 = local568 * 10000 / local566;
									@Pc(634) String local634 = "Cache:" + Static102.method1912(true, (long) local614, 2, 0) + "% (" + local608 + "%)";
									Static105.aClass13_4.method4452(local634, local225, -256, local230);
									local230 += 12;
								}
								if (Static291.anInt5656 > 0) {
									Static105.aClass13_4.method4452("Particles: " + Static19.anInt397 + " / " + Static291.anInt5656, local225, -256, local230);
								}
								local230 += 12;
								if (Static89.aBoolean157) {
									Static105.aClass13_4.method4452("Polys: " + Static34.aClass2_6.method3253() + " Models: " + Static34.aClass2_6.method3265(), local225, -256, local230);
									local230 += 12;
									Static105.aClass13_4.method4452("Ls: " + Static267.anInt5160 + " La: " + Static244.anInt4762 + " NPC: " + Static187.anInt3904 + " Pl: " + Static259.anInt5034, local225, -256, local230);
									Static85.method1626();
									local230 += 12;
								}
								Static313.aBooleanArray30[local43] = true;
								continue;
							}
						}
						if (local23.anInt5208 == 0) {
							if (!local23.aBoolean445 && Static47.method1090(local23) && Static118.aClass177_17 != local23) {
								continue;
							}
							if (!local23.aBoolean445) {
								if (local23.anInt5182 > local23.anInt5262 - local23.anInt5209) {
									local23.anInt5182 = local23.anInt5262 - local23.anInt5209;
								}
								if (local23.anInt5182 < 0) {
									local23.anInt5182 = 0;
								}
							}
							if (local23.anInt5204 == 1407 && Static34.aClass2_6.method3295()) {
								Static34.aClass2_6.method3246(local91, local96, local23.anInt5179, local23.anInt5209);
							}
							method3158(local43, local140, local96 - local23.anInt5182, -local23.anInt5221 + local91, local23.anInt5219, local265, local276, arg7, local138);
							if (local23.aClass177Array2 != null) {
								method3158(local43, local140, local96 - local23.anInt5182, -local23.anInt5221 + local91, local23.anInt5219, local265, local276, local23.aClass177Array2, local138);
							}
							@Pc(830) Class1_Sub9 local830 = (Class1_Sub9) Static348.aClass26_20.method870((long) local23.anInt5219);
							if (local830 != null) {
								Static105.method1978(local276, local265, local43, local830.anInt1104, local96, local91, local138, local140);
							}
							if (local23.anInt5204 == 1407 && Static34.aClass2_6.method3295()) {
								Static34.aClass2_6.method3328();
								Static61.aBoolean124 = true;
							}
							Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
						}
						if (Static30.aBooleanArray4[local43] || Static142.anInt3156 > 1) {
							if (local23.anInt5208 == 0 && !local23.aBoolean445 && local23.anInt5262 > local23.anInt5209) {
								Static112.method3713(local23.anInt5179 + local91, local23.anInt5209, local23.anInt5262, local96, local23.anInt5182);
							}
							if (local23.anInt5208 != 1) {
								@Pc(912) int local912;
								if (local23.anInt5208 == 2) {
									local225 = 0;
									for (local230 = 0; local230 < local23.anInt5191; local230++) {
										for (local912 = 0; local912 < local23.anInt5211; local912++) {
											local511 = (local23.anInt5175 + 32) * local912 + local91;
											local513 = local96 + local230 * (local23.anInt5263 + 32);
											if (local225 < 20) {
												local513 += local23.anIntArray656[local225];
												local511 += local23.anIntArray654[local225];
											}
											if (local23.anIntArray668[local225] > 0) {
												local568 = local23.anIntArray668[local225] - 1;
												if (arg8 < local511 + 32 && arg5 > local511 && arg1 < local513 + 32 && local513 < arg6 || Static46.aClass177_2 == local23 && Static255.anInt5009 == local225) {
													@Pc(1068) Class90 local1068;
													if (Static243.anInt4739 == 1 && Static114.anInt2289 == local225 && local23.anInt5219 == Static84.anInt1651) {
														local1068 = Static37.method945(local23.anIntArray667[local225], Static34.aClass2_6, 2, local568, null, 0, local23.anInt5178);
													} else {
														local1068 = Static37.method945(local23.anIntArray667[local225], Static34.aClass2_6, 1, local568, null, -13623264, local23.anInt5178);
													}
													if (local1068 == null) {
														Static133.method2517(local23);
													} else if (Static46.aClass177_2 == local23 && local225 == Static255.anInt5009) {
														local566 = Static295.anInt5742 - Static154.anInt3087;
														local540 = Static179.anInt3693 - Static127.anInt2492;
														if (local566 < 5 && local566 > -5) {
															local566 = 0;
														}
														if (local540 < 5 && local540 > -5) {
															local540 = 0;
														}
														if (Static304.anInt5855 < 5) {
															local540 = 0;
															local566 = 0;
														}
														local1068.method5455(local511 + local540, local566 + local513, 0, -2013265920);
														if (arg4 != -1) {
															@Pc(1181) Class177 local1181 = arg7[arg4 & 0xFFFF];
															@Pc(1184) int[] local1184 = new int[4];
															Static34.aClass2_6.method3311(local1184);
															local614 = local1184[1];
															@Pc(1195) int local1195 = local1184[3];
															@Pc(1217) int local1217;
															if (local614 > local566 + local513 && local1181.anInt5182 > 0) {
																local1217 = Static78.anInt1579 * (local614 - local513 - local566) / 3;
																if (local1217 > Static78.anInt1579 * 10) {
																	local1217 = Static78.anInt1579 * 10;
																}
																if (local1217 > local1181.anInt5182) {
																	local1217 = local1181.anInt5182;
																}
																Static154.anInt3087 += local1217;
																local1181.anInt5182 -= local1217;
																Static133.method2517(local1181);
															}
															if (local566 + local513 + 32 > local1195 && local1181.anInt5262 - local1181.anInt5209 > local1181.anInt5182) {
																local1217 = (local566 + local513 + 32 - local1195) * Static78.anInt1579 / 3;
																if (local1217 > Static78.anInt1579 * 10) {
																	local1217 = Static78.anInt1579 * 10;
																}
																if (local1181.anInt5262 - local1181.anInt5182 - local1181.anInt5209 < local1217) {
																	local1217 = local1181.anInt5262 - local1181.anInt5182 - local1181.anInt5209;
																}
																local1181.anInt5182 += local1217;
																Static154.anInt3087 -= local1217;
																Static133.method2517(local1181);
															}
														}
													} else if (local23 == Static309.aClass177_21 && Static171.anInt3577 == local225) {
														local1068.method5455(local511, local513, 0, -2013265920);
													} else {
														local1068.method5454(local511, local513);
													}
												}
											} else if (local23.anIntArray655 != null && local225 < 20) {
												@Pc(974) Class90 local974 = local23.method4694(Static34.aClass2_6, local225);
												if (local974 != null) {
													local974.method5454(local511, local513);
												} else if (Static244.aBoolean398) {
													Static133.method2517(local23);
												}
											}
											local225++;
										}
									}
								} else if (local23.anInt5208 == 3) {
									if (Static179.method3489(local23)) {
										local225 = local23.anInt5246;
										if (local23 == Static118.aClass177_17 && local23.anInt5230 != 0) {
											local225 = local23.anInt5230;
										}
									} else {
										local225 = local23.anInt5199;
										if (local23 == Static118.aClass177_17 && local23.anInt5240 != 0) {
											local225 = local23.anInt5240;
										}
									}
									if (local99 == 0) {
										if (local23.aBoolean442) {
											Static34.aClass2_6.method3300(local91, local96, local23.anInt5179, local23.anInt5209, local225, 0);
										} else {
											Static34.aClass2_6.method3263(local91, local96, local23.anInt5179, local23.anInt5209, local225, 0);
										}
									} else if (local23.aBoolean442) {
										Static34.aClass2_6.method3300(local91, local96, local23.anInt5179, local23.anInt5209, local225 & 0xFFFFFF | 255 - (local99 & 0xFF) << 24, 1);
									} else {
										Static34.aClass2_6.method3263(local91, local96, local23.anInt5179, local23.anInt5209, 255 - (local99 & 0xFF) << 24 | local225 & 0xFFFFFF, 1);
									}
								} else {
									@Pc(1478) Class13 local1478;
									if (local23.anInt5208 == 4) {
										local1478 = local23.method4695(Static34.aClass2_6);
										if (local1478 != null) {
											@Pc(1490) String local1490 = local23.aString205;
											if (Static179.method3489(local23)) {
												local230 = local23.anInt5246;
												if (local23 == Static118.aClass177_17 && local23.anInt5230 != 0) {
													local230 = local23.anInt5230;
												}
												if (local23.aString210.length() > 0) {
													local1490 = local23.aString210;
												}
											} else {
												local230 = local23.anInt5199;
												if (local23 == Static118.aClass177_17 && local23.anInt5240 != 0) {
													local230 = local23.anInt5240;
												}
											}
											if (local23.aBoolean445 && local23.anInt5252 != -1) {
												@Pc(1542) Class61 local1542 = Static241.method4285(local23.anInt5252);
												local1490 = local1542.aString74;
												if (local1490 == null) {
													local1490 = "null";
												}
												if ((local1542.anInt1803 == 1 || local23.anInt5253 != 1) && local23.anInt5253 != -1) {
													local1490 = "<col=ff9040>" + local1490 + "</col> x" + Static102.method1913(local23.anInt5253);
												}
											}
											if (local23 == Static297.aClass177_20) {
												local230 = local23.anInt5199;
												local1490 = Static185.aString34;
											}
											if (!local23.aBoolean445) {
												local1490 = Static61.method1286(local23, local1490);
											}
											if (Static201.aBoolean345) {
												Static34.aClass2_6.method3291(local91, local96, local91 + local23.anInt5179, local23.anInt5209 + local96);
											}
											local1478.method4442(local1490, local23.anInt5247, 0, local23.anInt5271, Static233.aClass90Array12, local23.anInt5215, local23.anInt5179, 0, local23.aBoolean437 ? -16777216 : -1, local91, local230 | 0xFF000000, local96, null, local23.anInt5209, null);
											if (Static201.aBoolean345) {
												Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
											}
										} else if (Static244.aBoolean398) {
											Static133.method2517(local23);
										}
									} else if (local23.anInt5208 == 5) {
										@Pc(1666) Class90 local1666;
										if (!local23.aBoolean445) {
											local1666 = local23.method4699(Static34.aClass2_6, Static179.method3489(local23));
											if (local1666 != null) {
												local1666.method5454(local91, local96);
											} else if (Static244.aBoolean398) {
												Static133.method2517(local23);
											}
										} else if (local23.anInt5216 >= 0) {
											local23.method4692().method1035(Static34.aClass2_6, local91, local23.anInt5179, local23.anInt5267 << 3, 0, local23.anInt5209, local96, 0, local23.anInt5207 << 3);
										} else {
											if (local23.anInt5252 == -1) {
												local1666 = local23.method4699(Static34.aClass2_6, false);
											} else {
												@Pc(1729) Class31 local1729 = local23.aBoolean435 ? Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 : null;
												local1666 = Static37.method945(local23.anInt5253, Static34.aClass2_6, local23.anInt5220, local23.anInt5252, local1729, local23.anInt5227 | 0xFF000000, local23.anInt5178);
											}
											if (local1666 != null) {
												local230 = local1666.method5464();
												local912 = local1666.method5467();
												if (local23.aBoolean447) {
													Static34.aClass2_6.method3291(local91, local96, local23.anInt5179 + local91, local96 - -local23.anInt5209);
													if (local23.anInt5212 != 0) {
														local511 = (local23.anInt5179 + local230 - 1) / local230;
														local513 = (local912 + local23.anInt5209 - 1) / local912;
														for (local540 = 0; local540 < local511; local540++) {
															for (local566 = 0; local566 < local513; local566++) {
																local1666.method5461((float) local230 / 2.0F + (float) (local91 + local540 * local230), (float) (local912 * local566 + local96) + (float) local912 / 2.0F, 4096, local23.anInt5212);
															}
														}
													} else if (local99 == 0) {
														local1666.method5465(local91, local96, local23.anInt5179, local23.anInt5209, 0, 0);
													} else {
														local1666.method5465(local91, local96, local23.anInt5179, local23.anInt5209, 1, 255 - (local99 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
												} else if (local99 != 0) {
													local511 = 255 - (local99 & 0xFF) << 24 | 0xFFFFFF;
													if (local23.anInt5212 != 0) {
														local1666.method5459((float) local91 + (float) local23.anInt5179 / 2.0F, (float) local23.anInt5209 / 2.0F + (float) local96, local23.anInt5179 * 4096 / local230, local23.anInt5212, local511);
													} else if (local230 == local23.anInt5179 && local23.anInt5209 == local912) {
														local1666.method5455(local91, local96, 1, local511);
													} else {
														local1666.method5458(local91, local96, local23.anInt5179, local23.anInt5209, 1, local511, 1);
													}
												} else if (local23.anInt5212 != 0) {
													local1666.method5461((float) local91 + (float) local23.anInt5179 / 2.0F, (float) local23.anInt5209 / 2.0F + (float) local96, local23.anInt5179 * 4096 / local230, local23.anInt5212);
												} else if (local230 == local23.anInt5179 && local23.anInt5209 == local912) {
													local1666.method5454(local91, local96);
												} else {
													local1666.method5462(local91, local96, local23.anInt5179, local23.anInt5209);
												}
											} else if (Static244.aBoolean398) {
												Static133.method2517(local23);
											}
										}
									} else {
										@Pc(2292) Class61 local2292;
										if (local23.anInt5208 == 6) {
											@Pc(2064) boolean local2064 = Static179.method3489(local23);
											if (local2064) {
												local230 = local23.anInt5256;
											} else {
												local230 = local23.anInt5243;
											}
											Static279.method4817();
											@Pc(2078) Class78 local2078 = null;
											local511 = 0;
											@Pc(2123) Class31 local2123;
											@Pc(2113) Class121 local2113;
											if (local23.anInt5252 != -1) {
												local2292 = Static241.method4285(local23.anInt5252);
												if (local2292 != null) {
													local2292 = local2292.method1729(local23.anInt5253);
													local2113 = local230 == -1 ? null : Static133.method2520(local230);
													local2123 = local23.aBoolean435 ? Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 : null;
													local2078 = local2292.method1734(local23.anInt5187, local2113, 1024, local23.anInt5176, Static34.aClass2_6, local2123, local23.anInt5238, 1);
													if (local2078 == null) {
														Static133.method2517(local23);
													} else {
														local511 = -local2078.method4388() / 2;
													}
												}
											} else if (local23.anInt5192 == 5) {
												if (local23.anInt5245 == -1) {
													local2078 = Static253.aClass31_2.method1013(0, null, -1, 1024, -1, Static34.aClass2_6, -1, -1, 0, null, null);
												} else {
													local513 = local23.anInt5245;
													@Pc(2217) Class5_Sub3_Sub3_Sub1 local2217;
													if (local513 == Static69.anInt1424) {
														local2217 = Static130.aClass5_Sub3_Sub3_Sub1_1;
													} else {
														local2217 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local513];
													}
													@Pc(2231) Class121 local2231 = local230 == -1 ? null : Static133.method2520(local230);
													if (local2217 != null && (local513 == 2047 || Static352.method5703(local2217.aString130) == local23.anInt5183)) {
														local2078 = local2217.aClass31_1.method1013(local23.anInt5187, null, local23.anInt5176, 1024, local23.anInt5238, Static34.aClass2_6, -1, 0, 0, null, local2231);
													}
												}
											} else if (local23.anInt5192 == 8 || local23.anInt5192 == 9) {
												@Pc(2103) Class1_Sub38 local2103 = Static47.method1093(local23.anInt5245);
												local2113 = local230 == -1 ? null : Static133.method2520(local230);
												if (local2103 != null) {
													local2123 = local23.aBoolean435 ? Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1 : null;
													local2078 = local2103.method5325(local23.anInt5238, local2113, local23.anInt5187, local23.anInt5183, Static34.aClass2_6, local23.anInt5176, local23.anInt5192 == 9, local2123);
												}
											} else if (local230 == -1) {
												local2078 = local23.method4687(1024, Static34.aClass2_6, -1, local2064, 0, null, Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1, -1);
												if (local2078 == null && Static244.aBoolean398) {
													Static133.method2517(local23);
												}
											} else {
												@Pc(2157) Class121 local2157 = Static133.method2520(local230);
												local2078 = local23.method4687(1024, Static34.aClass2_6, local23.anInt5176, local2064, local23.anInt5187, local2157, Static130.aClass5_Sub3_Sub3_Sub1_1.aClass31_1, local23.anInt5238);
												if (local2078 == null && Static244.aBoolean398) {
													Static133.method2517(local23);
												}
											}
											if (local2078 != null) {
												if (local23.anInt5228 <= 0) {
													local513 = 512;
												} else {
													local513 = (local23.anInt5179 << 9) / local23.anInt5228;
												}
												if (local23.anInt5214 <= 0) {
													local540 = 512;
												} else {
													local540 = (local23.anInt5209 << 9) / local23.anInt5214;
												}
												local566 = (local23.anInt5200 * local513 >> 9) + local23.anInt5179 / 2 + local91;
												local568 = local96 + local23.anInt5209 / 2 + (local23.anInt5196 * local540 >> 9);
												Static302.aClass21_6.method2800();
												Static34.aClass2_6.method3239(Static302.aClass21_6);
												local570 = local23.anInt5217 * Class1_Sub1_Sub16.anIntArray587[local23.anInt5260 << 3] >> 15;
												local572 = Class1_Sub1_Sub16.anIntArray586[local23.anInt5260 << 3] * local23.anInt5217 >> 15;
												Static34.aClass2_6.method3278(local566, local568, local513, local540);
												Static34.aClass2_6.method3320((float) local23.aShort80, local23.aBoolean439 ? (float) local23.aShort81 : (float) local23.aShort81 * 1.5F);
												if (Static61.aBoolean124) {
													Static34.aClass2_6.method3327();
													Static34.aClass2_6.method3294();
													Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
													Static61.aBoolean124 = false;
												}
												if (local23.aBoolean440) {
													Static34.aClass2_6.method3337(false);
												}
												if (local23.aBoolean445) {
													Static158.aClass21_5.method2798(-local23.anInt5203 << 3);
													Static158.aClass21_5.method2802(local23.anInt5268 << 3);
													Static158.aClass21_5.method2810(local23.anInt5180, local23.anInt5261 + local570 + local511, local572 + local23.anInt5261);
												} else {
													Static158.aClass21_5.method2809(local23.anInt5268 << 3);
													Static158.aClass21_5.method2810(0, local570, local572);
												}
												Static158.aClass21_5.method2815(local23.anInt5260 << 3);
												if (Static201.aBoolean345) {
													Static34.aClass2_6.method3291(local91, local96, local91 + local23.anInt5179, local23.anInt5209 + local96);
												}
												if (local23.aBoolean439) {
													local2078.method4384(Static158.aClass21_5, null, local23.anInt5217);
												} else {
													local2078.method4379(Static158.aClass21_5, null, 1);
												}
												if (Static201.aBoolean345) {
													Static34.aClass2_6.method3250(arg8, arg1, arg5, arg6);
												}
												if (local23.aBoolean440) {
													Static34.aClass2_6.method3337(true);
												}
											}
										} else {
											if (local23.anInt5208 == 7) {
												local1478 = local23.method4695(Static34.aClass2_6);
												if (local1478 == null) {
													if (Static244.aBoolean398) {
														Static133.method2517(local23);
													}
													continue;
												}
												local230 = 0;
												for (local912 = 0; local912 < local23.anInt5191; local912++) {
													for (local511 = 0; local511 < local23.anInt5211; local511++) {
														if (local23.anIntArray668[local230] > 0) {
															local2292 = Static241.method4285(local23.anIntArray668[local230] - 1);
															@Pc(2649) String local2649;
															if (local2292.anInt1803 != 1 && local23.anIntArray667[local230] == 1) {
																local2649 = "<col=ff9040>" + local2292.aString74 + "</col>";
															} else {
																local2649 = "<col=ff9040>" + local2292.aString74 + "</col> x" + Static102.method1913(local23.anIntArray667[local230]);
															}
															local566 = local91 + local511 * (local23.anInt5175 + 115);
															local568 = local96 + local912 * (local23.anInt5263 + 12);
															if (local23.anInt5247 == 0) {
																local1478.method4451(local23.aBoolean437 ? -16777216 : -1, local566, local2649, local23.anInt5199 | 0xFF000000, local568, Static233.aClass90Array12, null);
															} else if (local23.anInt5247 == 1) {
																local1478.method4463(null, local566 + 57, local23.anInt5199 | 0xFF000000, local23.aBoolean437 ? -16777216 : -1, local2649, local568, Static233.aClass90Array12);
															} else {
																local1478.method4460(local566 + 115 - 1, local2649, local23.anInt5199 | 0xFF000000, null, local568, Static233.aClass90Array12, local23.aBoolean437 ? -16777216 : -1);
															}
														}
														local230++;
													}
												}
											}
											if (local23.anInt5208 == 8 && local23 == Static232.aClass177_23 && Static338.anInt6422 == Static133.anInt2592) {
												local225 = 0;
												local230 = 0;
												@Pc(2787) Class13 local2787 = Static9.aClass13_1;
												@Pc(2790) String local2790 = local23.aString205;
												local2790 = Static61.method1286(local23, local2790);
												@Pc(2809) String local2809;
												while (local2790.length() > 0) {
													local540 = local2790.indexOf("<br>");
													if (local540 == -1) {
														local2809 = local2790;
														local2790 = "";
													} else {
														local2809 = local2790.substring(0, local540);
														local2790 = local2790.substring(local540 + 4);
													}
													local566 = Static273.aClass38_8.method1316(local2809);
													if (local225 < local566) {
														local225 = local566;
													}
													local230 += Static273.aClass38_8.anInt1353 + 1;
												}
												local230 += 7;
												local225 += 6;
												local540 = local23.anInt5179 + local91 - local225 - 5;
												if (local540 < local91 + 5) {
													local540 = local91 + 5;
												}
												local566 = local96 + local23.anInt5209 + 5;
												if (local225 + local540 > arg5) {
													local540 = arg5 - local225;
												}
												if (local230 + local566 > arg6) {
													local566 = arg6 - local230;
												}
												Static34.aClass2_6.method3300(local540, local566, local225, local230, -96, 0);
												Static34.aClass2_6.method3263(local540, local566, local225, local230, -16777216, 0);
												local2790 = local23.aString205;
												local568 = Static273.aClass38_8.anInt1353 + local566 + 2;
												local2790 = Static61.method1286(local23, local2790);
												while (local2790.length() > 0) {
													local570 = local2790.indexOf("<br>");
													if (local570 == -1) {
														local2809 = local2790;
														local2790 = "";
													} else {
														local2809 = local2790.substring(0, local570);
														local2790 = local2790.substring(local570 + 4);
													}
													local2787.method4456(-16777216, local568, -1, local2809, local540 + 3);
													local568 += Static273.aClass38_8.anInt1353 + 1;
												}
											}
											if (local23.anInt5208 == 9) {
												if (local23.aBoolean431) {
													local511 = local96;
													local230 = local96 + local23.anInt5209;
													local912 = local91 + local23.anInt5179;
												} else {
													local511 = local96 + local23.anInt5209;
													local230 = local96;
													local912 = local23.anInt5179 + local91;
												}
												if (local23.anInt5190 == 1) {
													Static34.aClass2_6.method3267(local91, local230, local912, local511, local23.anInt5199, 0);
												} else {
													Static34.aClass2_6.method3273(local91, local230, local912, local511, local23.anInt5199, local23.anInt5190);
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
}
