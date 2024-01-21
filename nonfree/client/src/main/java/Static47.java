import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!hf", name = "Lc", descriptor = "[I")
	public static int[] anIntArray96;

	@OriginalMember(owner = "client!hf", name = "Rc", descriptor = "Lclient!tb;")
	public static Class44 aClass44_30;

	@OriginalMember(owner = "client!hf", name = "fd", descriptor = "Lclient!nc;")
	public static Class54 aClass54_4;

	@OriginalMember(owner = "client!hf", name = "id", descriptor = "Lclient!b;")
	public static Class3_Sub2 aClass3_Sub2_2;

	@OriginalMember(owner = "client!hf", name = "ed", descriptor = "Lclient!oa;")
	private static Class56 aClass56_765 = Static33.method650("System update in: ");

	@OriginalMember(owner = "client!hf", name = "Jc", descriptor = "Lclient!oa;")
	public static Class56 aClass56_763 = aClass56_765;

	@OriginalMember(owner = "client!hf", name = "Wc", descriptor = "I")
	public static int anInt1377 = 0;

	@OriginalMember(owner = "client!hf", name = "nd", descriptor = "Lclient!oa;")
	public static Class56 aClass56_766 = Static33.method650("k");

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)V")
	public static void method875() {
		try {
			@Pc(6) Graphics local6 = Static59.aCanvas1.getGraphics();
			Static80.aClass30_13.method811(4, 550, local6);
		} catch (@Pc(20) Exception local20) {
			Static59.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(B[Lclient!td;IIIIIIII)Z")
	public static boolean method876(@OriginalArg(1) Class3_Sub1_Sub16[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static6.method1498(arg7, arg1, arg4, arg3);
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < arg0.length; local14++) {
			@Pc(20) Class3_Sub1_Sub16 local20 = arg0[local14];
			if (local20 != null && (local20.anInt2845 == arg8 || arg8 == -1412584499 && Static13.aClass3_Sub1_Sub16_1 == local20)) {
				if (local20.anInt2811 > 0) {
					Static16.method343(local20);
				}
				@Pc(56) int local56 = local20.anInt2855 + arg7 - arg5;
				@Pc(64) int local64 = local20.anInt2797 + arg1 - arg2;
				@Pc(67) int local67 = local20.anInt2819;
				@Pc(105) int local105;
				@Pc(103) int local103;
				@Pc(135) int[] local135;
				@Pc(246) int local246;
				@Pc(235) int local235;
				@Pc(258) int local258;
				@Pc(252) int local252;
				if (local20 == Static13.aClass3_Sub1_Sub16_1) {
					if (arg8 != -1412584499 && !local20.aBoolean150) {
						Static103.anInt2582 = arg5 - arg7;
						Static1.anInt4 = arg2 - arg1;
						Static9.aClass3_Sub1_Sub16Array1 = arg0;
						continue;
					}
					@Pc(95) Class3_Sub1_Sub16 local95 = Static50.method905(local20);
					if (local95 == null) {
						Static13.aClass3_Sub1_Sub16_1 = null;
					} else {
						local103 = Static102.anInt3222;
						local105 = Static36.anInt1021;
						if (Static43.anInt1150 == 0) {
							local105 -= 4;
							local103 -= 4;
						}
						if (Static43.anInt1150 == 1) {
							local105 -= 553;
							local103 -= 205;
						}
						if (Static43.anInt1150 == 2) {
							local103 -= 357;
							local105 -= 17;
						}
						local103 -= Static52.anInt1511;
						local105 -= Static27.anInt811;
						local135 = Static124.method1995(local95);
						@Pc(147) Class3_Sub1_Sub16 local147 = Static31.aClass3_Sub1_Sub16ArrayArray1[local20.anInt2817 >> 16][local20.anInt2845 & 0xFFFF];
						if (local135[0] > local105) {
							local105 = local135[0];
						}
						if (local20.anInt2854 + local105 > local95.anInt2854 + local135[0]) {
							local105 = local135[0] + local95.anInt2854 - local20.anInt2854;
						}
						if (local135[1] > local103) {
							local103 = local135[1];
						}
						if (local135[1] + local95.anInt2827 < local103 - -local20.anInt2827) {
							local103 = local135[1] + local95.anInt2827 - local20.anInt2827;
						}
						@Pc(221) int[] local221 = Static124.method1995(local147);
						if (!local20.aBoolean150) {
							local67 = 128;
						}
						local235 = local147.anInt2806 + local103 - local221[1];
						local246 = local105 + local147.anInt2842 - local221[0];
						local252 = local235 - local20.anInt2797;
						local258 = local246 - local20.anInt2855;
						if (local258 <= local20.anInt2796 && -local20.anInt2796 <= local258 && local252 <= local20.anInt2796 && -local20.anInt2796 <= local252 && !Static25.aBoolean38) {
							local252 = 0;
							local258 = 0;
						} else if (Static16.anInt469 <= local20.anInt2830 && !Static25.aBoolean38) {
							local252 = 0;
							local258 = 0;
						}
						local56 += local258;
						local64 += local252;
					}
				}
				if ((!local20.aBoolean149 || local56 <= Static6.anInt2242 && Static6.anInt2246 >= local64 && local20.anInt2854 + local56 >= Static6.anInt2243 && Static6.anInt2241 <= local64 + local20.anInt2827) && (!local20.aBoolean149 || !Static109.method1157(local20))) {
					if (local20.anInt2857 == 0) {
						if (!local20.aBoolean149 && Static109.method1157(local20) && !Static2.method15(local14, arg6)) {
							continue;
						}
						if (!local20.aBoolean149) {
							if (local20.anInt2806 > local20.anInt2829 - local20.anInt2827) {
								local20.anInt2806 = local20.anInt2829 - local20.anInt2827;
							}
							if (local20.anInt2806 < 0) {
								local20.anInt2806 = 0;
							}
						}
						local12 &= method876(arg0, local64, local20.anInt2806, local64 + local20.anInt2827, local56 + local20.anInt2854, local20.anInt2842, arg6, local56, local20.anInt2817);
						if (local20.aClass3_Sub1_Sub16Array2 != null) {
							local12 &= method876(local20.aClass3_Sub1_Sub16Array2, local64, local20.anInt2806, local64 + local20.anInt2827, local56 + local20.anInt2854, local20.anInt2842, arg6, local56, local20.anInt2817);
						}
						Static6.method1498(arg7, arg1, arg4, arg3);
						if (local20.anInt2829 > local20.anInt2827 && !local20.aBoolean149) {
							Static97.method1703(local20.anInt2827, local64, local20.anInt2829, local20.anInt2806, local56 + local20.anInt2854);
						}
					}
					if (local20.anInt2857 != 1) {
						@Pc(772) int local772;
						@Pc(485) int local485;
						@Pc(503) int local503;
						@Pc(512) int local512;
						@Pc(701) int local701;
						if (local20.anInt2857 == 2) {
							local485 = 0;
							for (local105 = 0; local105 < local20.anInt2827; local105++) {
								for (local103 = 0; local103 < local20.anInt2854; local103++) {
									local503 = (local20.anInt2820 + 32) * local103 + local56;
									local512 = (local20.anInt2839 + 32) * local105 + local64;
									if (local485 < 20) {
										local503 += local20.anIntArray268[local485];
										local512 += local20.anIntArray269[local485];
									}
									if (local20.anIntArray267[local485] > 0) {
										local235 = local20.anIntArray267[local485] - 1;
										if (local503 > Static6.anInt2243 - 32 && local503 < Static6.anInt2242 && local512 > Static6.anInt2241 - 32 && Static6.anInt2246 > local512 || Static31.anInt920 != 0 && local485 == Static110.anInt2762) {
											@Pc(632) Class3_Sub1_Sub1_Sub2 local632;
											if (Static98.anInt2560 == 1 && Static68.anInt1859 == local485 && local20.anInt2817 == Static12.anInt307) {
												local632 = Static43.method801(false, local235, 0, local20.anIntArray265[local485], 2);
											} else {
												local632 = Static43.method801(false, local235, 3153952, local20.anIntArray265[local485], 1);
											}
											if (local632 == null) {
												local12 = false;
											} else if (Static31.anInt920 != 0 && local485 == Static110.anInt2762 && Static100.anInt2570 == local20.anInt2817) {
												local246 = Static102.anInt3222 - Static94.anInt2471;
												local701 = Static36.anInt1021 - Static97.anInt2548;
												if (local701 < 5 && local701 > -5) {
													local701 = 0;
												}
												if (local246 < 5 && local246 > -5) {
													local246 = 0;
												}
												if (Static17.anInt473 < 5) {
													local246 = 0;
													local701 = 0;
												}
												local632.method962(local701 + local503, local512 - -local246, 128);
												if (arg8 != -1) {
													@Pc(751) Class3_Sub1_Sub16 local751 = arg0[arg8 & 0xFFFF];
													if (Static6.anInt2241 > local512 + local246 && local751.anInt2806 > 0) {
														local772 = Static44.anInt1163 * (Static6.anInt2241 - local512 - local246) / 3;
														if (local772 > Static44.anInt1163 * 10) {
															local772 = Static44.anInt1163 * 10;
														}
														if (local772 > local751.anInt2806) {
															local772 = local751.anInt2806;
														}
														local751.anInt2806 -= local772;
														Static94.anInt2471 += local772;
													}
													if (Static6.anInt2246 < local246 + local512 + 32 && local751.anInt2829 - local751.anInt2827 > local751.anInt2806) {
														local772 = (local512 + local246 + 32 - Static6.anInt2246) * Static44.anInt1163 / 3;
														if (Static44.anInt1163 * 10 < local772) {
															local772 = Static44.anInt1163 * 10;
														}
														if (local751.anInt2829 - local751.anInt2806 - local751.anInt2827 < local772) {
															local772 = local751.anInt2829 - local751.anInt2806 - local751.anInt2827;
														}
														Static94.anInt2471 -= local772;
														local751.anInt2806 += local772;
													}
												}
											} else if (Static1.anInt9 != 0 && local485 == Static69.anInt1923 && Static23.anInt692 == local20.anInt2817) {
												local632.method962(local503, local512, 128);
											} else {
												local632.method967(local503, local512);
											}
										}
									} else if (local20.anIntArray264 != null && local485 < 20) {
										@Pc(545) Class3_Sub1_Sub1_Sub2 local545 = local20.method1856(local485);
										if (local545 != null) {
											local545.method967(local503, local512);
										} else if (Static79.aBoolean96) {
											local12 = false;
										}
									}
									local485++;
								}
							}
						} else if (local20.anInt2857 == 3) {
							if (Static46.method1514(local20)) {
								local485 = local20.anInt2813;
								if (Static2.method15(local14, arg6) && local20.anInt2859 != 0) {
									local485 = local20.anInt2859;
								}
							} else {
								local485 = local20.anInt2822;
								if (Static2.method15(local14, arg6) && local20.anInt2861 != 0) {
									local485 = local20.anInt2861;
								}
							}
							if (local67 == 0) {
								if (local20.aBoolean147) {
									Static6.method1487(local56, local64, local20.anInt2854, local20.anInt2827, local485);
								} else {
									Static6.method1495(local56, local64, local20.anInt2854, local20.anInt2827, local485);
								}
							} else if (local20.aBoolean147) {
								Static6.method1494(local56, local64, local20.anInt2854, local20.anInt2827, local485, 256 - (local67 & 0xFF));
							} else {
								Static6.method1493(local56, local64, local20.anInt2854, local20.anInt2827, local485, 256 - (local67 & 0xFF));
							}
						} else {
							@Pc(1009) Class3_Sub1_Sub1_Sub1 local1009;
							if (local20.anInt2857 == 4) {
								local1009 = local20.method1859();
								if (local1009 != null) {
									@Pc(1020) Class56 local1020 = local20.aClass56_1546;
									if (Static46.method1514(local20)) {
										local105 = local20.anInt2813;
										if (Static2.method15(local14, arg6) && local20.anInt2859 != 0) {
											local105 = local20.anInt2859;
										}
										if (local20.aClass56_1542.method1426() > 0) {
											local1020 = local20.aClass56_1542;
										}
									} else {
										local105 = local20.anInt2822;
										if (Static2.method15(local14, arg6) && local20.anInt2861 != 0) {
											local105 = local20.anInt2861;
										}
									}
									if (local20.aBoolean149 && local20.anInt2831 != -1) {
										@Pc(1078) Class3_Sub1_Sub8 local1078 = Static12.method239(local20.anInt2831);
										local1020 = local1078.aClass56_944;
										if (local1020 == null) {
											local1020 = Static117.aClass56_1616;
										}
										if ((local1078.anInt1731 == 1 || local20.anInt2814 != 1) && local20.anInt2814 != -1) {
											local1020 = Static84.method1524(new Class56[] { local1020, Static73.aClass56_1076, Static113.method1869(local20.anInt2814) });
										}
									}
									if (Static79.anInt2107 == local20.anInt2817 && local20.anInt2807 == Static57.anInt1596) {
										local1020 = Static32.aClass56_520;
										local105 = local20.anInt2822;
									}
									if (Static6.anInt2244 == 479) {
										if (local105 == 16776960) {
											local105 = 255;
										}
										if (local105 == 49152) {
											local105 = 16777215;
										}
									}
									local1020 = Static40.method750(local20, local1020);
									local1009.method734(local1020, local56, local64, local20.anInt2854, local20.anInt2827, local105, local20.aBoolean145, local20.anInt2849, local20.anInt2808, local20.anInt2850);
								} else if (Static79.aBoolean96) {
									local12 = false;
								}
							} else {
								@Pc(1317) int local1317;
								if (local20.anInt2857 == 5) {
									@Pc(1196) Class3_Sub1_Sub1_Sub2 local1196;
									if (local20.aBoolean149) {
										if (local20.anInt2831 == -1) {
											local1196 = local20.method1860(false);
										} else {
											local1196 = Static43.method801(false, local20.anInt2831, local20.anInt2846, local20.anInt2814, local20.anInt2838);
										}
										if (local1196 != null) {
											local105 = local1196.anInt1482;
											local103 = local1196.anInt1486;
											if (local20.aBoolean146) {
												local135 = new int[4];
												Static6.method1488(local135);
												local512 = local56;
												if (local56 < local135[0]) {
													local512 = local135[0];
												}
												local701 = local64;
												if (local64 < local135[1]) {
													local701 = local135[1];
												}
												local246 = local56 + local20.anInt2854;
												local235 = local20.anInt2827 + local64;
												if (local135[3] < local235) {
													local235 = local135[3];
												}
												if (local246 > local135[2]) {
													local246 = local135[2];
												}
												Static6.method1498(local512, local701, local246, local235);
												local258 = (local105 + local20.anInt2854 - 1) / local105;
												local252 = (local103 + local20.anInt2827 - 1) / local103;
												for (local772 = 0; local772 < local258; local772++) {
													for (local1317 = 0; local1317 < local252; local1317++) {
														if (local20.anInt2833 != 0) {
															local1196.method950(local105 / 2 + local56 + local772 * local105, local103 / 2 + local103 * local1317 + local64, local20.anInt2833, 4096);
														} else if (local67 == 0) {
															local1196.method967(local56 + local772 * local105, local1317 * local103 + local64);
														} else {
															local1196.method962(local56 + local105 * local772, local64 - -(local103 * local1317), 256 - (local67 & 0xFF));
														}
													}
												}
												Static6.method1496(local135);
											} else {
												local503 = local20.anInt2854 * 4096 / local105;
												if (local20.anInt2833 != 0) {
													local1196.method950(local20.anInt2854 / 2 + local56, local64 - -(local20.anInt2827 / 2), local20.anInt2833, local503);
												} else if (local67 != 0) {
													local1196.method955(local56, local64, local20.anInt2854, local20.anInt2827, 256 - (local67 & 0xFF));
												} else if (local20.anInt2854 == local105 && local20.anInt2827 == local103) {
													local1196.method967(local56, local64);
												} else {
													local1196.method954(local56, local64, local20.anInt2854, local20.anInt2827);
												}
											}
										} else if (Static79.aBoolean96) {
											local12 = false;
										}
									} else {
										local1196 = local20.method1860(Static46.method1514(local20));
										if (local1196 != null) {
											local1196.method967(local56, local64);
										} else if (Static79.aBoolean96) {
											local12 = false;
										}
									}
								} else {
									@Pc(1604) Class3_Sub1_Sub8 local1604;
									if (local20.anInt2857 == 6) {
										@Pc(1514) boolean local1514 = Static46.method1514(local20);
										if (local1514) {
											local105 = local20.anInt2834;
										} else {
											local105 = local20.anInt2835;
										}
										local503 = 0;
										@Pc(1528) Class3_Sub1_Sub2_Sub6 local1528 = null;
										if (local20.anInt2831 != -1) {
											local1604 = Static12.method239(local20.anInt2831);
											if (local1604 != null) {
												local1604 = local1604.method1197(local20.anInt2814);
												local1528 = local1604.method1190(1);
												if (local1528 == null) {
													local12 = false;
												} else {
													local1528.method1798();
													local503 = local1528.anInt3141 / 2;
												}
											}
										} else if (local20.anInt2841 == 5) {
											if (local20.anInt2805 == 0) {
												local1528 = Static76.aClass42_2.method1082(-1, null, -1, null);
											} else {
												local1528 = Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.method2028();
											}
										} else if (local105 == -1) {
											local1528 = local20.method1853(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass42_1, null, local1514, -1);
											if (local1528 == null && Static79.aBoolean96) {
												local12 = false;
											}
										} else {
											@Pc(1582) Class3_Sub1_Sub4 local1582 = Static41.method770(local105);
											local1528 = local20.method1853(Static59.aClass3_Sub1_Sub2_Sub4_Sub1_1.aClass42_1, local1582, local1514, local20.anInt2815);
											if (local1528 == null && Static79.aBoolean96) {
												local12 = false;
											}
										}
										Static55.method1059(local20.anInt2854 / 2 + local56, local20.anInt2827 / 2 + local64);
										local512 = local20.anInt2837 * Class3_Sub1_Sub1_Sub3.anIntArray116[local20.anInt2856] >> 16;
										local701 = Class3_Sub1_Sub1_Sub3.anIntArray115[local20.anInt2856] * local20.anInt2837 >> 16;
										if (local1528 != null) {
											if (local20.aBoolean149) {
												local1528.method1798();
												if (local20.aBoolean152) {
													local1528.method1804(local20.anInt2858, local20.anInt2801, local20.anInt2856, local20.anInt2809, local20.anInt2826 + local512 + local503, local701 - -local20.anInt2826, local20.anInt2837);
												} else {
													local1528.method1791(local20.anInt2858, local20.anInt2801, local20.anInt2856, local20.anInt2809, local20.anInt2826 + local512 + local503, local20.anInt2826 + local701);
												}
											} else {
												local1528.method1791(local20.anInt2858, 0, local20.anInt2856, 0, local512, local701);
											}
										}
										Static55.method1043();
									} else {
										if (local20.anInt2857 == 7) {
											local1009 = local20.method1859();
											if (local1009 == null) {
												if (Static79.aBoolean96) {
													local12 = false;
												}
												continue;
											}
											local105 = 0;
											for (local103 = 0; local103 < local20.anInt2827; local103++) {
												for (local503 = 0; local503 < local20.anInt2854; local503++) {
													if (local20.anIntArray267[local105] > 0) {
														local1604 = Static12.method239(local20.anIntArray267[local105] - 1);
														@Pc(1784) Class56 local1784 = local1604.aClass56_944;
														if (local1784 == null) {
															local1784 = Static117.aClass56_1616;
														}
														if (local1604.anInt1731 == 1 || local20.anIntArray265[local105] != 1) {
															local1784 = Static84.method1524(new Class56[] { local1784, Static73.aClass56_1076, Static113.method1869(local20.anIntArray265[local105]) });
														}
														local246 = (local20.anInt2820 + 115) * local503 + local56;
														local235 = local64 + (local20.anInt2839 + 12) * local103;
														if (local20.anInt2849 == 0) {
															local1009.method733(local1784, local246, local235, local20.anInt2822, local20.aBoolean145);
														} else if (local20.anInt2849 == 1) {
															local1009.method728(local1784, local20.anInt2854 / 2 + local246, local235, local20.anInt2822, local20.aBoolean145);
														} else {
															local1009.method729(local1784, local246 + local20.anInt2854 - 1, local235, local20.anInt2822, local20.aBoolean145);
														}
													}
													local105++;
												}
											}
										}
										if (local20.anInt2857 == 8 && Static66.method379(local14, arg6) && Static60.anInt1738 == Static63.anInt1817) {
											local485 = 0;
											local105 = 0;
											@Pc(1926) Class3_Sub1_Sub1_Sub1 local1926 = Static80.aClass3_Sub1_Sub1_Sub1_4;
											@Pc(1929) Class56 local1929 = local20.aClass56_1546;
											local1929 = Static40.method750(local20, local1929);
											@Pc(1950) Class56 local1950;
											while (local1929.method1426() > 0) {
												local701 = local1929.method1424(Static64.aClass56_977);
												if (local701 == -1) {
													local1950 = local1929;
													local1929 = Static122.aClass56_1633;
												} else {
													local1950 = local1929.method1451(local701, 0);
													local1929 = local1929.method1417(local701 + 2);
												}
												local246 = local1926.method731(local1950);
												local105 += local1926.anInt1057 + 1;
												if (local246 > local485) {
													local485 = local246;
												}
											}
											local485 += 6;
											local105 += 7;
											local701 = local20.anInt2854 + local56 - local485 - 5;
											if (local701 < local56 + 5) {
												local701 = local56 + 5;
											}
											if (arg4 < local701 + local485) {
												local701 = arg4 - local485;
											}
											local246 = local64 + local20.anInt2827 + 5;
											if (arg3 < local246 + local105) {
												local246 = arg3 - local105;
											}
											Static6.method1487(local701, local246, local485, local105, 16777120);
											Static6.method1495(local701, local246, local485, local105, 0);
											local235 = local246 + local1926.anInt1057 + 2;
											local1929 = local20.aClass56_1546;
											local1929 = Static40.method750(local20, local1929);
											while (local1929.method1426() > 0) {
												local258 = local1929.method1424(Static64.aClass56_977);
												if (local258 == -1) {
													local1950 = local1929;
													local1929 = Static122.aClass56_1633;
												} else {
													local1950 = local1929.method1451(local258, 0);
													local1929 = local1929.method1417(local258 + 2);
												}
												local1926.method733(local1950, local701 + 3, local235, 0, false);
												local235 += local1926.anInt1057 + 1;
											}
										}
										if (local20.anInt2857 == 9) {
											if (local20.anInt2843 == 1) {
												Static6.method1492(local56, local64, local20.anInt2854 + local56, local20.anInt2827 + local64, local20.anInt2822);
											} else {
												local485 = local20.anInt2854 >= 0 ? local20.anInt2854 : -local20.anInt2854;
												local105 = local20.anInt2827 >= 0 ? local20.anInt2827 : -local20.anInt2827;
												local103 = local485;
												if (local485 < local105) {
													local103 = local105;
												}
												if (local103 != 0) {
													local512 = (local20.anInt2827 << 16) / local103;
													local503 = (local20.anInt2854 << 16) / local103;
													if (local512 <= local503) {
														local503 = -local503;
													} else {
														local512 = -local512;
													}
													local246 = local20.anInt2843 * local512 + 1 >> 17;
													local235 = local503 * local20.anInt2843 >> 17;
													local701 = local20.anInt2843 * local512 >> 17;
													local252 = local56 + local701;
													local258 = local503 * local20.anInt2843 + 1 >> 17;
													local772 = local56 - local246;
													local1317 = local56 + local20.anInt2854 - local246;
													@Pc(2259) int local2259 = local701 + local20.anInt2854 + local56;
													@Pc(2264) int local2264 = local64 + local235;
													@Pc(2269) int local2269 = local64 - local258;
													@Pc(2276) int local2276 = local64 + local20.anInt2827 - local258;
													@Pc(2284) int local2284 = local64 + local20.anInt2827 + local235;
													Static55.method1053(local252, local772, local1317);
													Static55.method1050(local2264, local2269, local2276, local252, local772, local1317, local20.anInt2822);
													Static55.method1053(local252, local1317, local2259);
													Static55.method1050(local2264, local2276, local2284, local252, local1317, local2259, local20.anInt2822);
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
		return local12;
	}

	@OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)I")
	public static int method878() {
		return Static94.anInt2475++;
	}

	@OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V")
	public static void method879() {
		anIntArray96 = null;
		aClass56_766 = null;
		aClass56_765 = null;
		aClass56_763 = null;
		aClass44_30 = null;
		aClass54_4 = null;
		aClass3_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZZ[B)Ljava/lang/Object;")
	public static Object method880(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static86.aBoolean108) {
			try {
				@Pc(23) Class35 local23 = (Class35) Class.forName("Class35_Sub1").getDeclaredConstructor().newInstance();
				local23.method976(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static86.aBoolean108 = true;
			}
		}
		return arg0;
	}
}
