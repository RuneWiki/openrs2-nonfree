import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fh", name = "q", descriptor = "Lclient!ofa;")
	public static Class265 aClass265_5;

	@OriginalMember(owner = "client!fh", name = "m", descriptor = "[[I")
	public static final int[][] anIntArrayArray15 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fh", name = "D", descriptor = "[I")
	public static final int[] anIntArray157 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!fh", name = "F", descriptor = "I")
	public static int anInt3059 = -1;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V")
	public static void method2648() {
		for (@Pc(7) int local7 = 0; local7 < Static358.anInt6116; local7++) {
			@Pc(18) int local18 = Static13.method352(Static521.anInt8234 + local7, Static358.anInt6116) * Static620.anInt10280;
			for (@Pc(20) int local20 = 0; local20 < Static620.anInt10280; local20++) {
				@Pc(32) int local32 = local18 + Static13.method352(local20 + Static342.anInt5876, Static620.anInt10280);
				if (Static170.anInt3112 == Static42.anIntArray52[local32]) {
					Static354.anInterface10Array1[local32].method8746(0, 0, Static141.anInt2656, Static456.anInt7325, local20 * Static141.anInt2656, local7 * Static456.anInt7325);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ZIIIII[Lclient!ofa;IIII)V")
	public static void method2650(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class265[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
		for (@Pc(17) int local17 = 0; local17 < arg5.length; local17++) {
			@Pc(23) Class265 local23 = arg5[local17];
			if (local23 != null && (arg3 == local23.anInt6985 || arg3 == -1412584499 && Static264.aClass265_8 == local23)) {
				@Pc(45) int local45 = local23.anInt6993 + arg8;
				@Pc(51) int local51 = local23.anInt6968 + arg6;
				@Pc(59) int local59 = local45 + local23.anInt7024 + 1;
				@Pc(67) int local67 = local51 + local23.anInt6997 + 1;
				@Pc(92) int local92;
				if (arg7 == -1) {
					Class167_Sub2.aRectangleArray2[Static514.anInt8102].setBounds(arg8 + local23.anInt6993, arg6 + local23.anInt6968, local23.anInt7024, local23.anInt6997);
					local92 = Static514.anInt8102++;
				} else {
					local92 = arg7;
				}
				local23.anInt7018 = local92;
				local23.anInt7046 = Static122.anInt2190;
				if (!Static86.method1367(local23)) {
					if (local23.anInt7015 != 0) {
						Static81.method8384(local23);
					}
					@Pc(120) int local120 = local23.anInt6993 + arg8;
					@Pc(125) int local125 = local23.anInt6968 + arg6;
					@Pc(127) int local127 = 0;
					@Pc(129) int local129 = 0;
					if (Static498.aBoolean757) {
						local127 = Static84.method1336();
						local129 = Static614.method8324();
					}
					@Pc(140) int local140 = local23.anInt6965;
					if (Static97.aBoolean153 && (Static86.method1383(local23).anInt7824 != 0 || local23.anInt6967 == 0) && local140 > 127) {
						local140 = 127;
					}
					@Pc(192) int local192;
					@Pc(198) int local198;
					if (Static264.aClass265_8 == local23) {
						if (arg3 != -1412584499 && (Static58.anInt9437 == local23.anInt7007 || Static178.anInt3276 == local23.anInt7007)) {
							Static343.anInt5886 = arg8;
							Static313.aClass265Array6 = arg5;
							Static332.anInt5505 = arg6;
							continue;
						}
						if (Static479.aBoolean676 && Static52.aBoolean75) {
							local192 = Static627.aClass48_1.method7512() + local127;
							local198 = local129 + Static627.aClass48_1.method7511();
							local198 -= Static260.anInt4561;
							local192 -= Static548.anInt8559;
							if (local192 < Static381.anInt6391) {
								local192 = Static381.anInt6391;
							}
							if (local198 < Static450.anInt7241) {
								local198 = Static450.anInt7241;
							}
							if (Static381.anInt6391 + Static478.aClass265_12.anInt7024 < local192 + local23.anInt7024) {
								local192 = Static381.anInt6391 + Static478.aClass265_12.anInt7024 - local23.anInt7024;
							}
							local120 = local192;
							if (local23.anInt6997 + local198 > Static450.anInt7241 + Static478.aClass265_12.anInt6997) {
								local198 = Static478.aClass265_12.anInt6997 + Static450.anInt7241 - local23.anInt6997;
							}
							local125 = local198;
						}
						if (local23.anInt7007 == Static178.anInt3276) {
							local140 = 128;
						}
					}
					@Pc(330) int local330;
					@Pc(341) int local341;
					@Pc(290) int local290;
					@Pc(295) int local295;
					if (local23.anInt6967 == 2) {
						local192 = arg2;
						local330 = arg9;
						local198 = arg1;
						local341 = arg4;
					} else {
						local290 = local23.anInt7024 + local120;
						local295 = local23.anInt6997 + local125;
						local198 = arg1 >= local125 ? arg1 : local125;
						local192 = arg2 >= local120 ? arg2 : local120;
						if (local23.anInt6967 == 9) {
							local295++;
							local290++;
						}
						local330 = arg9 <= local290 ? arg9 : local290;
						local341 = local295 >= arg4 ? arg4 : local295;
					}
					if (local330 > local192 && local198 < local341) {
						@Pc(629) int local629;
						@Pc(674) int local674;
						@Pc(768) int local768;
						@Pc(770) int local770;
						@Pc(661) int local661;
						@Pc(663) int local663;
						if (local23.anInt7015 != 0) {
							if (local23.anInt7015 == Static377.anInt7881 || Static652.anInt10661 == local23.anInt7015) {
								Static103.method1672(local23, local125, local120);
								if (!Static498.aBoolean757) {
									Static162.method2586(local23.anInt6997, local125, local120, local23.anInt7015 == Static652.anInt10661, local23.anInt7024);
									Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
								}
								Static89.aBooleanArray7[local92] = true;
								continue;
							}
							if (local23.anInt7015 == Static210.anInt3654) {
								if (local23.method5906(Static119.aClass95_4) != null) {
									Static333.method4737();
									Static55.method1038(local125, local120, Static119.aClass95_4, local23);
									Static170.aBooleanArray10[local92] = true;
									Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
									if (Static498.aBoolean757) {
										if (arg0) {
											Static63.method1147(local51, local59, local45, local67);
										} else {
											Static515.method6716(local67, local45, local59, local51);
										}
									}
								}
								continue;
							}
							if (local23.anInt7015 == Static159.anInt2964) {
								Static544.method6989(local23, local125, local120, Static119.aClass95_4);
								continue;
							}
							if (Static584.anInt9492 == local23.anInt7015) {
								Static413.method5632(local120, local23.anInt6999 % 64, local23, Static119.aClass95_4, local125);
								continue;
							}
							if (Static615.anInt10214 == local23.anInt7015) {
								if (local23.method5906(Static119.aClass95_4) != null) {
									Static140.method2323(local120, local125, local23);
									Static170.aBooleanArray10[local92] = true;
									Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
									if (Static498.aBoolean757) {
										if (arg0) {
											Static63.method1147(local51, local59, local45, local67);
										} else {
											Static515.method6716(local67, local45, local59, local51);
										}
									}
								}
								continue;
							}
							if (Static97.anInt1960 == local23.anInt7015) {
								Static51.method1003(local23.anInt6997, local125, Static119.aClass95_4, Static559.anInterface2_11, local23.anInt7024, local120);
								Static89.aBooleanArray7[local92] = true;
								Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
								continue;
							}
							if (Static527.anInt8310 == local23.anInt7015) {
								Static457.method6148(local23.anInt7024, local23.anInt6997, local125, local120, Static119.aClass95_4);
								Static89.aBooleanArray7[local92] = true;
								Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
								continue;
							}
							if (local23.anInt7015 == Static156.anInt2893) {
								if (!Static421.aBoolean485 && !Static122.aBoolean166) {
									continue;
								}
								local290 = local23.anInt7024 + local120;
								if (Static498.aBoolean757) {
									if (arg0) {
										Static63.method1147(local51, local59, local45, local67);
									} else {
										Static515.method6716(local67, local45, local59, local51);
									}
								}
								local295 = local125 + 15;
								if (Static421.aBoolean485) {
									local629 = -256;
									if (Static451.anInt7260 < 20) {
										local629 = -65536;
									}
									Static184.aClass67_3.method7675(local295, local290, -1, local629, "Fps:" + Static451.anInt7260);
									local295 += 15;
									@Pc(651) Runtime local651 = Runtime.getRuntime();
									local661 = (int) ((local651.totalMemory() - local651.freeMemory()) / 1024L);
									local663 = -256;
									if (local661 > 98304) {
										if (Static591.aBoolean662) {
											Static379.method5355();
											for (local674 = 0; local674 < 10; local674++) {
												System.gc();
											}
											local661 = (int) ((local651.totalMemory() - local651.freeMemory()) / 1024L);
											if (local661 > 65536) {
												Static342.method4988("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
										local663 = -65536;
									}
									Static184.aClass67_3.method7675(local295, local290, -1, local663, "Mem:" + local661 + "k");
									local295 += 15;
									Static184.aClass67_3.method7675(local295, local290, -1, -256, "In:" + Static128.anInt2274 + "B/s Out:" + Static50.anInt1078 + "B/s");
									local295 += 15;
									local674 = Static119.aClass95_4.E() / 1024;
									Static184.aClass67_3.method7675(local295, local290, -1, ~local674 >= -65537 ? -256 : -65536, "Offheap:" + local674 + "k");
									local295 += 15;
									local768 = 0;
									local770 = 0;
									@Pc(772) int local772 = 0;
									for (@Pc(774) int local774 = 0; local774 < 37; local774++) {
										if (Static84.aClass229_Sub1Array1[local774] != null) {
											local768 += Static84.aClass229_Sub1Array1[local774].method5283();
											local770 += Static84.aClass229_Sub1Array1[local774].method5284();
											local772 += Static84.aClass229_Sub1Array1[local774].method5288();
										}
									}
									@Pc(816) int local816 = local772 * 100 / local768;
									@Pc(822) int local822 = local770 * 10000 / local768;
									@Pc(842) String local842 = "Cache:" + Static106.method1696(0, 2, (long) local822, true) + "% (" + local816 + "%)";
									Static261.aClass67_5.method7675(local295, local290, -1, -256, local842);
									local295 += 12;
								}
								if (Static567.anInt6323 > 0) {
									Static261.aClass67_5.method7675(local295, local290, -1, -256, "Particles: " + Static211.anInt3662 + " / " + Static567.anInt6323);
								}
								local295 += 12;
								if (Static122.aBoolean166) {
									Static261.aClass67_5.method7675(local295, local290, -1, -256, "Polys: " + Static119.aClass95_4.I() + " Models: " + Static119.aClass95_4.M());
									local295 += 12;
									Static261.aClass67_5.method7675(local295, local290, -1, -256, "Ls: " + Static155.anInt2871 + " La: " + Static413.anInt6707 + " NPC: " + Static598.anInt9806 + " Pl: " + Static311.anInt5200);
									Static373.method5314();
									local295 += 12;
								}
								Static89.aBooleanArray7[local92] = true;
								continue;
							}
						}
						@Pc(1005) Class3_Sub25 local1005;
						if (local23.anInt6967 == 0) {
							if (local23.anInt7015 == Static483.anInt7690 && Static119.aClass95_4.method8011()) {
								Static119.aClass95_4.method8023(local120, local125, local23.anInt7024, local23.anInt6997);
							}
							method2650(arg0, local198, local192, local23.anInt7032, local341, arg5, local125 - local23.anInt7002, local92, local120 - local23.anInt7033, local330);
							if (local23.aClass265Array4 != null) {
								method2650(arg0, local198, local192, local23.anInt7032, local341, local23.aClass265Array4, local125 - local23.anInt7002, local92, local120 - local23.anInt7033, local330);
							}
							local1005 = (Class3_Sub25) Static513.aClass333_33.method7489((long) local23.anInt7032);
							if (local1005 != null) {
								Static299.method4366(local198, local341, local192, local125, local120, local92, local330, local1005.anInt3959);
							}
							if (local23.anInt7015 == Static483.anInt7690 && Static119.aClass95_4.method8011()) {
								Static119.aClass95_4.method8052();
							}
							Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
						}
						if (Static68.aBooleanArray4[local92] || Static594.anInt9604 > 1) {
							if (local23.anInt6967 == 3) {
								if (local140 == 0) {
									if (local23.aBoolean490) {
										Static119.aClass95_4.aa(local120, local125, local23.anInt7024, local23.anInt6997, local23.anInt6999, 0);
									} else {
										Static119.aClass95_4.method8062(local120, local125, local23.anInt7024, local23.anInt6997, local23.anInt6999, 0);
									}
								} else if (local23.aBoolean490) {
									Static119.aClass95_4.aa(local120, local125, local23.anInt7024, local23.anInt6997, 255 - (local140 & 0xFF) << 24 | local23.anInt6999 & 0xFFFFFF, 1);
								} else {
									Static119.aClass95_4.method8062(local120, local125, local23.anInt7024, local23.anInt6997, local23.anInt6999 & 0xFFFFFF | 255 - (local140 & 0xFF) << 24, 1);
								}
								if (Static498.aBoolean757) {
									if (arg0) {
										Static63.method1147(local51, local59, local45, local67);
									} else {
										Static515.method6716(local67, local45, local59, local51);
									}
								}
							} else {
								@Pc(1181) Class15 local1181;
								if (local23.anInt6967 == 4) {
									@Pc(1156) Class67 local1156 = local23.method5909(Static119.aClass95_4);
									if (local1156 != null) {
										local295 = local23.anInt6999;
										@Pc(1171) String local1171 = local23.aString86;
										if (local23.anInt7005 != -1) {
											local1181 = Static117.aClass197_2.method4518(local23.anInt7005);
											local1171 = local1181.aString6;
											if (local1171 == null) {
												local1171 = "null";
											}
											if ((local1181.anInt454 == 1 || local23.anInt7045 != 1) && local23.anInt7045 != -1) {
												local1171 = "<col=ff9040>" + local1171 + "</col> x" + Static370.method5290(local23.anInt7045);
											}
										}
										if (local23.anInt6964 != -1) {
											local1171 = Static576.method7581(local23.anInt6964);
											if (local1171 == null) {
												local1171 = "";
											}
										}
										if (Static84.aClass265_4 == local23) {
											local1171 = Static114.aClass84_31.method1729(Static654.anInt10668);
											local295 = local23.anInt6999;
										}
										if (Static90.aBoolean150) {
											Static119.aClass95_4.T(local120, local125, local23.anInt7024 + local120, local23.anInt6997 + local125);
										}
										local1156.method7686(local23.aBoolean498 ? 255 - (local140 & 0xFF) << 24 : -1, local23.anInt7024, local120, local1171, 0, (int[]) null, local23.anInt6997, local125, local23.anInt7021, local295 | 255 - (local140 & 0xFF) << 24, local23.anInt6972, Static266.aClass6Array8, local23.anInt7049, local23.anInt7013, 0, (Class1) null);
										if (Static90.aBoolean150) {
											Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
										}
										if (local1171.trim().length() > 0) {
											if (!Static90.aBoolean150) {
												@Pc(1341) Class91 local1341 = Static448.method6082(local23.anInt6975, Static119.aClass95_4);
												local661 = local1341.method1856(Static266.aClass6Array8, local1171, local23.anInt7024);
												local663 = local1341.method1846(Static266.aClass6Array8, local23.anInt7021, local23.anInt7024, local1171);
												if (Static498.aBoolean757) {
													if (arg0) {
														Static63.method1147(local125, local661 + local120, local120, local125 + local663);
													} else {
														Static515.method6716(local663 + local125, local120, local120 + local661, local125);
													}
												}
											} else if (Static498.aBoolean757) {
												if (arg0) {
													Static63.method1147(local51, local59, local45, local67);
												} else {
													Static515.method6716(local67, local45, local59, local51);
												}
											}
										}
									} else if (Static517.aBoolean564) {
										Static218.method3194(local23);
									}
								} else {
									@Pc(1482) int local1482;
									if (local23.anInt6967 == 5) {
										if (local23.anInt6962 < 0) {
											@Pc(1429) Class6 local1429;
											if (local23.anInt7005 != -1) {
												@Pc(1411) Class376 local1411 = local23.aBoolean494 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 : null;
												local1429 = Static117.aClass197_2.method4529(local23.anInt7039, local23.anInt7045, local23.anInt7051 | 0xFF000000, Static119.aClass95_4, local23.anInt7005, local23.anInt6971, local1411);
											} else if (local23.anInt6964 == -1) {
												local1429 = local23.method5917(Static119.aClass95_4);
											} else {
												local1429 = Static138.method2314(Static119.aClass95_4, local23.anInt6964);
											}
											if (local1429 != null) {
												local295 = local1429.method5130();
												local629 = local1429.method5134();
												local1482 = 255 - (local140 & 0xFF) << 24 | (local23.anInt6999 == 0 ? 16777215 : local23.anInt6999 & 0xFFFFFF);
												if (local23.aBoolean493) {
													Static119.aClass95_4.T(local120, local125, local120 + local23.anInt7024, local125 + local23.anInt6997);
													if (local23.anInt6998 != 0) {
														local661 = (local23.anInt7024 + local295 - 1) / local295;
														local663 = (local629 + local23.anInt6997 - 1) / local629;
														for (local674 = 0; local674 < local661; local674++) {
															for (local768 = 0; local768 < local663; local768++) {
																if (local23.anInt6999 == 0) {
																	local1429.method5126((float) local295 / 2.0F + (float) (local674 * local295 + local120), (float) (local125 + local629 * local768) + (float) local629 / 2.0F, 4096, local23.anInt6998);
																} else {
																	local1429.method5117((float) (local674 * local295 + local120) + (float) local295 / 2.0F, (float) local629 / 2.0F + (float) (local125 - -(local629 * local768)), 4096, local23.anInt6998, local1482);
																}
															}
														}
													} else if (local23.anInt6999 == 0 && local140 == 0) {
														local1429.method5139(local120, local125, local23.anInt7024, local23.anInt6997);
													} else {
														local1429.method5137(local120, local125, local23.anInt7024, local23.anInt6997, 0, local1482, 1);
													}
													Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
												} else if (local23.anInt6999 == 0 && local140 == 0) {
													if (local23.anInt6998 != 0) {
														local1429.method5126((float) local120 + (float) local23.anInt7024 / 2.0F, (float) local125 + (float) local23.anInt6997 / 2.0F, local23.anInt7024 * 4096 / local295, local23.anInt6998);
													} else if (local23.anInt7024 == local295 && local23.anInt6997 == local629) {
														local1429.method5115(local120, local125);
													} else {
														local1429.method5121(local120, local125, local23.anInt7024, local23.anInt6997);
													}
												} else if (local23.anInt6998 != 0) {
													local1429.method5117((float) local120 + (float) local23.anInt7024 / 2.0F, (float) local23.anInt6997 / 2.0F + (float) local125, local23.anInt7024 * 4096 / local295, local23.anInt6998, local1482);
												} else if (local295 == local23.anInt7024 && local23.anInt6997 == local629) {
													local1429.method5133(local120, local125, 0, local1482, 1);
												} else {
													local1429.method5135(local120, local125, local23.anInt7024, local23.anInt6997, 0, local1482, 1);
												}
											} else if (Static517.aBoolean564) {
												Static218.method3194(local23);
											}
										} else {
											local23.method5910(Static300.aClass332_1, Static73.aClass64_3).method2801(local125, Static119.aClass95_4, 0, local23.anInt7017 << 3, 0, local23.anInt7024, local23.anInt6997, local23.anInt6994 << 3, local120);
										}
										if (Static498.aBoolean757) {
											if (arg0) {
												Static63.method1147(local51, local59, local45, local67);
											} else {
												Static515.method6716(local67, local45, local59, local51);
											}
										}
									} else if (local23.anInt6967 == 6) {
										Static139.method5493();
										local1005 = null;
										@Pc(1830) Class149 local1830 = null;
										local629 = 0;
										@Pc(1939) Class239 local1939;
										@Pc(1949) Class376 local1949;
										if (local23.anInt7005 != -1) {
											local1181 = Static117.aClass197_2.method4518(local23.anInt7005);
											if (local1181 != null) {
												local1181 = local1181.method471(local23.anInt7045);
												local1939 = local23.anInt7026 == -1 ? null : Static13.aClass213_1.method5008(local23.anInt7026);
												local1949 = local23.aBoolean494 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 : null;
												local1830 = local1181.method458(Static119.aClass95_4, local1949, local1939, local23.anInt7022, local23.anInt7041, 1, 2048, local23.anInt6979);
												if (local1830 == null) {
													Static218.method3194(local23);
												} else {
													local629 = -local1830.fa() >> 1;
												}
											}
										} else if (local23.anInt7023 == 5) {
											local1482 = local23.anInt7050;
											if (local1482 >= 0 && local1482 < 2048) {
												@Pc(1987) Class34_Sub1_Sub1_Sub2_Sub1 local1987 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local1482];
												@Pc(2000) Class239 local2000 = local23.anInt7026 == -1 ? null : Static13.aClass213_1.method5008(local23.anInt7026);
												if (local1987 != null && (local1482 == Static291.anInt4955 || Static181.method2867(local1987.aString25) == local23.anInt6988)) {
													local1830 = local1987.aClass376_1.method8678(-1, Static461.aClass223_42, local2000, (Class239) null, 0, local23.anInt7022, 0, Static117.aClass197_2, Static267.aClass196_1, 0, local23.anInt7041, local23.anInt6979, Static210.aClass262_1, Static13.aClass213_1, (Class158[]) null, (int[]) null, Static538.aClass114_2, 2048, Static119.aClass95_4);
												}
											}
										} else if (local23.anInt7023 == 8 || local23.anInt7023 == 9) {
											@Pc(1926) Class3_Sub21 local1926 = Static586.method7782(local23.anInt7050, false);
											local1939 = local23.anInt7026 == -1 ? null : Static13.aClass213_1.method5008(local23.anInt7026);
											if (local1926 != null) {
												local1949 = local23.aBoolean494 ? Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1 : null;
												local1830 = local1926.method2930(local1939, local23.anInt7023 == 9, Static119.aClass95_4, local23.anInt7022, local23.anInt7041, local23.anInt6988, local1949, local23.anInt6979);
											}
										} else if (local23.anInt7026 == -1) {
											local1830 = local23.method5898(-1, Static538.aClass114_2, -1, 2048, Static267.aClass196_1, 0, Static13.aClass213_1, Static117.aClass197_2, Static461.aClass223_42, Static210.aClass262_1, local1005, (Class239) null, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1, Static119.aClass95_4);
											if (local1830 == null && Static517.aBoolean564) {
												Static218.method3194(local23);
											}
										} else {
											@Pc(1890) Class239 local1890 = Static13.aClass213_1.method5008(local23.anInt7026);
											local1830 = local23.method5898(local23.anInt7022, Static538.aClass114_2, local23.anInt6979, 2048, Static267.aClass196_1, local23.anInt7041, Static13.aClass213_1, Static117.aClass197_2, Static461.aClass223_42, Static210.aClass262_1, local1005, local1890, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aClass376_1, Static119.aClass95_4);
											if (local1830 == null && Static517.aBoolean564) {
												Static218.method3194(local23);
											}
										}
										if (local1830 != null) {
											if (local23.anInt7043 <= 0) {
												local1482 = 512;
											} else {
												local1482 = (local23.anInt7024 << 9) / local23.anInt7043;
											}
											if (local23.anInt6963 <= 0) {
												local661 = 512;
											} else {
												local661 = (local23.anInt6997 << 9) / local23.anInt6963;
											}
											local663 = local23.anInt7024 / 2 + local120;
											local674 = local23.anInt6997 / 2 + local125;
											if (!local23.aBoolean499) {
												local674 += local23.anInt6984 * local661 >> 9;
												local663 += local1482 * local23.anInt7044 >> 9;
											}
											Static360.aClass17_3.method6239();
											Static119.aClass95_4.method8037(Static360.aClass17_3);
											Static119.aClass95_4.DA(local663, local674, local1482, local661);
											Static119.aClass95_4.ya();
											if (local23.aBoolean489) {
												Static119.aClass95_4.C(false);
											}
											if (local23.aBoolean499) {
												Static586.aClass17_9.method6242(local23.anInt7030);
												Static586.aClass17_9.method6234(local23.anInt7036);
												Static586.aClass17_9.method6241(local23.anInt6982);
												Static586.aClass17_9.method6235(local23.anInt7044, local23.anInt6984, local23.anInt6961);
											} else {
												local768 = (local23.anInt6969 << 2) * Class94.anIntArray561[local23.anInt7030 << 3] >> 14;
												local770 = (local23.anInt6969 << 2) * Class94.anIntArray560[local23.anInt7030 << 3] >> 14;
												Static586.aClass17_9.method6238(-local23.anInt6982 << 3);
												Static586.aClass17_9.method6234(local23.anInt7036 << 3);
												Static586.aClass17_9.method6235(local23.anInt7037 << 2, local768 + (local23.anInt7027 << 2) + local629, (local23.anInt7027 << 2) + local770);
												Static586.aClass17_9.method6228(local23.anInt7030 << 3);
											}
											local23.method5900(Static122.anInt2190, Static586.aClass17_9, Static119.aClass95_4, local1830);
											if (Static90.aBoolean150) {
												Static119.aClass95_4.T(local120, local125, local23.anInt7024 + local120, local23.anInt6997 + local125);
											}
											if (local23.aBoolean499) {
												if (local23.aBoolean500) {
													local1830.method8869(Static586.aClass17_9, (Class34_Sub6) null, local23.anInt6969, 1);
												} else {
													local1830.method8857(Static586.aClass17_9, (Class34_Sub6) null, 1);
													if (local23.aClass34_Sub7_6 != null) {
														Static119.aClass95_4.method8057(local23.aClass34_Sub7_6.method5096());
													}
												}
											} else if (local23.aBoolean500) {
												local1830.method8869(Static586.aClass17_9, (Class34_Sub6) null, local23.anInt6969 << 2, 1);
											} else {
												local1830.method8857(Static586.aClass17_9, (Class34_Sub6) null, 1);
												if (local23.aClass34_Sub7_6 != null) {
													Static119.aClass95_4.method8057(local23.aClass34_Sub7_6.method5096());
												}
											}
											if (Static90.aBoolean150) {
												Static119.aClass95_4.KA(arg2, arg1, arg9, arg4);
											}
											if (local23.aBoolean489) {
												Static119.aClass95_4.C(true);
											}
										}
										if (Static498.aBoolean757) {
											if (arg0) {
												Static63.method1147(local51, local59, local45, local67);
											} else {
												Static515.method6716(local67, local45, local59, local51);
											}
										}
									} else if (local23.anInt6967 == 9) {
										if (local23.aBoolean501) {
											local629 = local23.anInt7024 + local120;
											local1482 = local125;
											local295 = local23.anInt6997 + local125;
										} else {
											local1482 = local125 + local23.anInt6997;
											local629 = local23.anInt7024 + local120;
											local295 = local125;
										}
										if (local23.anInt7034 == 1) {
											Static119.aClass95_4.method8024(local120, local295, local629, local1482, local23.anInt6999, 0);
										} else {
											Static119.aClass95_4.method8041(local120, local295, local629, local1482, local23.anInt6999, local23.anInt7034);
										}
										if (Static498.aBoolean757) {
											if (arg0) {
												Static63.method1147(local51, local59, local45, local67);
											} else {
												Static515.method6716(local67, local45, local59, local51);
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
