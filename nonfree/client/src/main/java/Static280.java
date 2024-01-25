import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!of", name = "A", descriptor = "[[I")
	public static int[][] anIntArrayArray51;

	@OriginalMember(owner = "client!of", name = "s", descriptor = "I")
	public static int anInt5104 = 1;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "I")
	public static int anInt5110 = -1;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method4099(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static418.method5550(0, arg0, arg1, arg0.length - 1);
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IILclient!ya;I)V")
	public static void method4100(@OriginalArg(0) int arg0, @OriginalArg(2) Class49 arg1, @OriginalArg(3) int arg2) {
		Static227.aClass22ArrayArray1 = new Class22[arg0][arg2];
		Static195.aClass49_5 = arg1;
		if (Static340.anIntArray497 != null) {
			Static164.aClass155_2 = Static167.method2728(Static340.anIntArray497[0], Static340.anIntArray497[4], Static340.anIntArray497[2], Static340.anIntArray497[1], Static340.anIntArray497[5], Static340.anIntArray497[3]);
		}
		Static344.aClass22_2 = new Class22();
		Static105.method1944();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I[Lclient!em;IIIIIIII)V")
	public static void method4101(@OriginalArg(1) Class68[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
		for (@Pc(13) int local13 = 0; local13 < arg0.length; local13++) {
			@Pc(21) Class68 local21 = arg0[local13];
			if (local21 != null && (arg4 == local21.anInt2221 || arg4 == -1412584499 && Static182.aClass68_7 == local21)) {
				@Pc(61) int local61;
				if (arg7 == -1) {
					Class200.aRectangleArray3[Static104.anInt2441].setBounds(local21.anInt2244 + arg3, arg2 + local21.anInt2214, local21.anInt2188, local21.anInt2252);
					local61 = Static104.anInt2441++;
				} else {
					local61 = arg7;
				}
				local21.anInt2250 = local61;
				local21.anInt2226 = Static131.anInt2821;
				if (!Static47.method781(local21)) {
					if (local21.anInt2236 != 0) {
						Static39.method625(local21);
					}
					@Pc(88) int local88 = local21.anInt2244 + arg3;
					@Pc(93) int local93 = local21.anInt2214 + arg2;
					@Pc(96) int local96 = local21.anInt2166;
					if (Static154.aBoolean245 && (Static47.method787(local21).anInt6837 != 0 || local21.anInt2249 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(145) int local145;
					@Pc(149) int local149;
					if (local21 == Static182.aClass68_7) {
						if (arg4 != -1412584499 && (local21.anInt2206 == Static25.anInt591 || Static46.anInt863 == local21.anInt2206)) {
							Static37.anInt706 = arg3;
							Static335.anInt924 = arg2;
							Static199.aClass68Array2 = arg0;
							continue;
						}
						if (Static205.aBoolean296 && Static130.aBoolean218) {
							local145 = Static109.aClass1_2.method702();
							local149 = Static109.aClass1_2.method698();
							local149 -= Static74.anInt1617;
							local145 -= Static350.anInt5952;
							if (Static420.anInt7046 > local145) {
								local145 = Static420.anInt7046;
							}
							if (local145 + local21.anInt2188 > Static225.aClass68_9.anInt2188 + Static420.anInt7046) {
								local145 = Static225.aClass68_9.anInt2188 + Static420.anInt7046 - local21.anInt2188;
							}
							if (local149 < Static34.anInt678) {
								local149 = Static34.anInt678;
							}
							if (local149 + local21.anInt2252 > Static225.aClass68_9.anInt2252 + Static34.anInt678) {
								local149 = Static225.aClass68_9.anInt2252 + Static34.anInt678 - local21.anInt2252;
							}
							local88 = local145;
							local93 = local149;
						}
						if (local21.anInt2206 == Static46.anInt863) {
							local96 = 128;
						}
					}
					@Pc(229) int local229;
					@Pc(235) int local235;
					@Pc(242) int local242;
					@Pc(247) int local247;
					if (local21.anInt2249 == 2) {
						local229 = arg6;
						local145 = arg5;
						local149 = arg1;
						local235 = arg8;
					} else {
						local242 = local21.anInt2188 + local88;
						local247 = local21.anInt2252 + local93;
						local149 = arg1 >= local93 ? arg1 : local93;
						local145 = local88 <= arg5 ? arg5 : local88;
						if (local21.anInt2249 == 9) {
							local247++;
							local242++;
						}
						local229 = arg6 <= local242 ? arg6 : local242;
						local235 = local247 < arg8 ? local247 : arg8;
					}
					if (local229 > local145 && local149 < local235) {
						@Pc(549) int local549;
						@Pc(575) int local575;
						@Pc(577) int local577;
						@Pc(499) int local499;
						@Pc(501) int local501;
						if (local21.anInt2236 != 0) {
							if (local21.anInt2236 == Static363.anInt6252 || Static128.anInt2667 == local21.anInt2236) {
								Static248.method3787(local21.anInt2188, local93, local21.anInt2236 == Static128.anInt2667, local88, local21.anInt2252);
								Static243.aBooleanArray19[local61] = true;
								Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
								continue;
							}
							if (Static64.anInt1452 == local21.anInt2236) {
								if (local21.method1751(Static33.aClass49_1) != null) {
									Static112.method2026();
									Static369.method5017(local93, local88, local21, Static33.aClass49_1);
									Static367.aBooleanArray23[local61] = true;
									Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
								}
								continue;
							}
							if (local21.anInt2236 == Static49.anInt970) {
								if (local21.method1751(Static33.aClass49_1) != null) {
									Static59.method1152(local88, local93, local21);
									Static367.aBooleanArray23[local61] = true;
									Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
								}
								continue;
							}
							if (Static357.anInt6062 == local21.anInt2236) {
								Static437.method5684(local93, Static33.aClass49_1, local21.anInt2188, local21.anInt2252, Static427.anInterface4_8, local88);
								Static243.aBooleanArray19[local61] = true;
								Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
								continue;
							}
							if (Static86.anInt4390 == local21.anInt2236) {
								Static209.method3316(local93, local88, local21.anInt2252, Static33.aClass49_1, local21.anInt2188);
								Static243.aBooleanArray19[local61] = true;
								Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
								continue;
							}
							if (local21.anInt2236 == Static260.anInt4866) {
								if (!Static121.aBoolean205 && !Static157.aBoolean246) {
									continue;
								}
								local242 = local88 + local21.anInt2188;
								local247 = local93 + 15;
								if (Static121.aBoolean205) {
									Static368.aClass116_4.method4812(local247, local242, "Fps:" + Static411.anInt6851, -256);
									local247 += 15;
									@Pc(490) Runtime local490 = Runtime.getRuntime();
									local499 = (int) ((local490.totalMemory() - local490.freeMemory()) / 1024L);
									local501 = -256;
									if (local499 > 65536) {
										local501 = -65536;
									}
									Static368.aClass116_4.method4812(local247, local242, "Mem:" + local499 + "k", local501);
									local247 += 15;
									Static368.aClass116_4.method4812(local247, local242, "In:" + Static301.anInt5392 + "B/s Out:" + Static182.anInt3563 + "B/s", -256);
									local247 += 15;
									local549 = Static33.aClass49_1.IA() / 1024;
									Static368.aClass116_4.method4812(local247, local242, "Offheap:" + local549 + "k", local549 <= 65536 ? -256 : -65536);
									local247 += 15;
									local575 = 0;
									local577 = 0;
									@Pc(579) int local579 = 0;
									for (@Pc(581) int local581 = 0; local581 < 30; local581++) {
										local575 += Static318.aClass94_Sub1Array6[local581].method2188();
										local577 += Static318.aClass94_Sub1Array6[local581].method2186();
										local579 += Static318.aClass94_Sub1Array6[local581].method2185();
									}
									@Pc(619) int local619 = local579 * 100 / local575;
									@Pc(625) int local625 = local577 * 10000 / local575;
									@Pc(645) String local645 = "Cache:" + Static287.method4145(0, true, (long) local625, 2) + "% (" + local619 + "%)";
									Static291.aClass116_3.method4812(local247, local242, local645, -256);
									local247 += 12;
								}
								if (Static145.anInt3058 > 0) {
									Static291.aClass116_3.method4812(local247, local242, "Particles: " + Static240.anInt4616 + " / " + Static145.anInt3058, -256);
								}
								local247 += 12;
								if (Static157.aBoolean246) {
									Static291.aClass116_3.method4812(local247, local242, "Polys: " + Static33.aClass49_1.ZA() + " Models: " + Static33.aClass49_1.w(), -256);
									local247 += 12;
									Static291.aClass116_3.method4812(local247, local242, "Ls: " + Static120.anInt2696 + " La: " + Static343.anInt5857 + " NPC: " + Static239.anInt4584 + " Pl: " + Static202.anInt3966, -256);
									Static67.method1277();
									local247 += 12;
								}
								Static243.aBooleanArray19[local61] = true;
								continue;
							}
						}
						if (local21.anInt2249 == 0) {
							if (Static96.anInt2360 == local21.anInt2236 && Static33.aClass49_1.method4431()) {
								Static33.aClass49_1.method4463(local88, local93, local21.anInt2188, local21.anInt2252);
							}
							method4101(arg0, local149, local93 - local21.anInt2172, local88 - local21.anInt2176, local21.anInt2229, local145, local229, local61, local235);
							if (local21.aClass68Array1 != null) {
								method4101(local21.aClass68Array1, local149, local93 - local21.anInt2172, local88 - local21.anInt2176, local21.anInt2229, local145, local229, local61, local235);
							}
							@Pc(804) Class2_Sub35 local804 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local21.anInt2229);
							if (local804 != null) {
								Static247.method3761(local229, local61, local88, local145, local93, local804.anInt5537, local235, local149);
							}
							if (Static96.anInt2360 == local21.anInt2236 && Static33.aClass49_1.method4431()) {
								Static33.aClass49_1.method4483();
								Static103.aBoolean171 = true;
							}
							Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
						}
						if (Static345.aBooleanArray21[local61] || Static270.anInt5006 > 1) {
							if (local21.anInt2249 == 3) {
								if (local96 == 0) {
									if (local21.aBoolean153) {
										Static33.aClass49_1.O(local88, local93, local21.anInt2188, local21.anInt2252, local21.anInt2235, 0);
									} else {
										Static33.aClass49_1.method4426(local88, local93, local21.anInt2188, local21.anInt2252, local21.anInt2235, 0);
									}
								} else if (local21.aBoolean153) {
									Static33.aClass49_1.O(local88, local93, local21.anInt2188, local21.anInt2252, local21.anInt2235 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								} else {
									Static33.aClass49_1.method4426(local88, local93, local21.anInt2188, local21.anInt2252, local21.anInt2235 & 0xFFFFFF | 255 - (local96 & 0xFF) << 24, 1);
								}
							} else if (local21.anInt2249 == 4) {
								@Pc(941) Class116 local941 = local21.method1750(Static33.aClass49_1);
								if (local941 != null) {
									local247 = local21.anInt2235;
									@Pc(956) String local956 = local21.aString22;
									if (local21.anInt2208 != -1) {
										@Pc(967) Class45 local967 = Static318.aClass144_6.method3265(local21.anInt2208);
										local956 = local967.aString6;
										if (local956 == null) {
											local956 = "null";
										}
										if ((local967.anInt1107 == 1 || local21.anInt2220 != 1) && local21.anInt2220 != -1) {
											local956 = "<col=ff9040>" + local956 + "</col> x" + Static349.method4778(local21.anInt2220);
										}
									}
									if (local21 == Static412.aClass68_14) {
										local956 = Static279.aClass209_115.method4562(Static388.anInt6533);
										local247 = local21.anInt2235;
									}
									if (Static294.aBoolean383) {
										Static33.aClass49_1.fa(local88, local93, local88 + local21.anInt2188, local21.anInt2252 + local93);
									}
									local941.method4822(null, local21.anInt2223, 0, local21.anInt2170, local21.anInt2246, local21.anInt2182, local88, local93, null, local21.aBoolean155 ? 255 - (local96 & 0xFF) << 24 : -1, Static279.aClass17Array12, local956, 0, local21.anInt2252, local21.anInt2188, 255 - (local96 & 0xFF) << 24 | local247);
									if (Static294.aBoolean383) {
										Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
									}
								} else if (Static104.aBoolean173) {
									Static78.method1460(local21);
								}
							} else {
								@Pc(1170) int local1170;
								if (local21.anInt2249 == 5) {
									if (local21.anInt2230 >= 0) {
										local21.method1737(Static154.aClass252_1, Static318.aClass131_5).method5223(local21.anInt2252, Static33.aClass49_1, local21.anInt2188, local93, 0, local88, local21.anInt2237 << 3, local21.anInt2178 << 3, 0);
									} else {
										@Pc(1127) Class17 local1127;
										if (local21.anInt2208 == -1) {
											local1127 = local21.method1748(Static33.aClass49_1);
										} else {
											@Pc(1137) Class97 local1137 = local21.aBoolean150 ? Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 : null;
											local1127 = Static318.aClass144_6.method3273(local1137, Static33.aClass49_1, local21.anInt2200 | 0xFF000000, local21.anInt2208, local21.anInt2220, local21.anInt2202, local21.anInt2253);
										}
										if (local1127 != null) {
											local247 = local1127.j();
											local1170 = local1127.T();
											local499 = (local21.anInt2235 == 0 ? 16777215 : local21.anInt2235 & 0xFFFFFF) | 255 - (local96 & 0xFF) << 24;
											if (local21.aBoolean159) {
												Static33.aClass49_1.fa(local88, local93, local21.anInt2188 + local88, local21.anInt2252 + local93);
												if (local21.anInt2183 != 0) {
													local501 = (local21.anInt2188 + local247 - 1) / local247;
													local549 = (local21.anInt2252 + local1170 - 1) / local1170;
													for (local575 = 0; local575 < local501; local575++) {
														for (local577 = 0; local577 < local549; local577++) {
															if (local21.anInt2235 == 0) {
																local1127.method5772((float) local247 / 2.0F + (float) (local88 + local575 * local247), (float) (local577 * local1170 + local93) + (float) local1170 / 2.0F, 4096, local21.anInt2183);
															} else {
																local1127.method5770((float) local247 / 2.0F + (float) (local575 * local247 + local88), (float) local1170 / 2.0F + (float) (local93 - -(local577 * local1170)), 4096, local21.anInt2183, local499);
															}
														}
													}
												} else if (local21.anInt2235 == 0 && local96 == 0) {
													local1127.method5766(local88, local93, local21.anInt2188, local21.anInt2252);
												} else {
													local1127.JA(local88, local93, local21.anInt2188, local21.anInt2252, 0, local499, 1);
												}
												Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
											} else if (local21.anInt2235 == 0 && local96 == 0) {
												if (local21.anInt2183 != 0) {
													local1127.method5772((float) local88 + (float) local21.anInt2188 / 2.0F, (float) local21.anInt2252 / 2.0F + (float) local93, local21.anInt2188 * 4096 / local247, local21.anInt2183);
												} else if (local21.anInt2188 == local247 && local1170 == local21.anInt2252) {
													local1127.method5767(local88, local93);
												} else {
													local1127.method5775(local88, local93, local21.anInt2188, local21.anInt2252);
												}
											} else if (local21.anInt2183 != 0) {
												local1127.method5770((float) local88 + (float) local21.anInt2188 / 2.0F, (float) local21.anInt2252 / 2.0F + (float) local93, local21.anInt2188 * 4096 / local247, local21.anInt2183, local499);
											} else if (local21.anInt2188 == local247 && local21.anInt2252 == local1170) {
												local1127.r(local88, local93, 0, local499, 1);
											} else {
												local1127.s(local88, local93, local21.anInt2188, local21.anInt2252, 0, local499, 1);
											}
										} else if (Static104.aBoolean173) {
											Static78.method1460(local21);
										}
									}
								} else if (local21.anInt2249 == 6) {
									Static350.method4780();
									@Pc(1495) Class91 local1495 = null;
									local247 = 0;
									@Pc(1603) Class250 local1603;
									@Pc(1613) Class97 local1613;
									if (local21.anInt2208 != -1) {
										@Pc(1708) Class45 local1708 = Static318.aClass144_6.method3265(local21.anInt2208);
										if (local1708 != null) {
											local1708 = local1708.method857(local21.anInt2220);
											local1603 = local21.anInt2222 == -1 ? null : Static338.aClass12_2.method255(local21.anInt2222);
											local1613 = local21.aBoolean150 ? Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 : null;
											local1495 = local1708.method872(local21.anInt2210, local1603, Static33.aClass49_1, 1, 2048, local21.anInt2231, local1613, local21.anInt2224);
											if (local1495 == null) {
												Static78.method1460(local21);
											} else {
												local247 = -local1495.MA() >> 1;
											}
										}
									} else if (local21.anInt2238 == 5) {
										local1170 = local21.anInt2203;
										if (local1170 >= 0 && local1170 < 2048) {
											@Pc(1519) Class3_Sub2_Sub1_Sub2 local1519 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local1170];
											@Pc(1531) Class250 local1531 = local21.anInt2222 == -1 ? null : Static338.aClass12_2.method255(local21.anInt2222);
											if (local1519 != null && (Static399.anInt6656 == local1170 || Static375.method4698(local1519.aString56) == local21.anInt2185)) {
												local1495 = local1519.aClass97_1.method2228(Static356.aClass259_2, Static338.aClass12_2, null, Static344.aClass108_1, Static33.aClass49_1, local21.anInt2231, -1, null, local21.anInt2224, Static219.aClass76_2, local21.anInt2210, Static318.aClass144_6, local1531, Static262.aClass51_3, 2048, 0, 0);
											}
										}
									} else if (local21.anInt2238 == 8 || local21.anInt2238 == 9) {
										@Pc(1590) Class2_Sub38 local1590 = Static448.method5748(local21.anInt2203, false);
										local1603 = local21.anInt2222 == -1 ? null : Static338.aClass12_2.method255(local21.anInt2222);
										if (local1590 != null) {
											local1613 = local21.aBoolean150 ? Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1 : null;
											local1495 = local1590.method4806(local21.anInt2185, Static33.aClass49_1, local21.anInt2238 == 9, local21.anInt2224, local21.anInt2231, local1613, local21.anInt2210, local1603);
										}
									} else if (local21.anInt2222 == -1) {
										local1495 = local21.method1744(Static318.aClass144_6, Static338.aClass12_2, Static33.aClass49_1, 0, -1, null, Static344.aClass108_1, Static219.aClass76_2, -1, Static356.aClass259_2, Static262.aClass51_3, Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1, 2048);
										if (local1495 == null && Static104.aBoolean173) {
											Static78.method1460(local21);
										}
									} else {
										@Pc(1673) Class250 local1673 = Static338.aClass12_2.method255(local21.anInt2222);
										local1495 = local21.method1744(Static318.aClass144_6, Static338.aClass12_2, Static33.aClass49_1, local21.anInt2210, local21.anInt2224, local1673, Static344.aClass108_1, Static219.aClass76_2, local21.anInt2231, Static356.aClass259_2, Static262.aClass51_3, Static375.aClass3_Sub2_Sub1_Sub2_7.aClass97_1, 2048);
										if (local1495 == null && Static104.aBoolean173) {
											Static78.method1460(local21);
										}
									}
									if (local1495 != null) {
										if (local21.anInt2207 > 0) {
											local1170 = (local21.anInt2188 << 9) / local21.anInt2207;
										} else {
											local1170 = 512;
										}
										if (local21.anInt2240 <= 0) {
											local499 = 512;
										} else {
											local499 = (local21.anInt2252 << 9) / local21.anInt2240;
										}
										local501 = local21.anInt2188 / 2 + local88 + (local1170 * local21.anInt2216 >> 9);
										local549 = (local21.anInt2174 * local499 >> 9) + local21.anInt2252 / 2 + local93;
										Static17.aClass35_4.xa();
										Static33.aClass49_1.ea(Static17.aClass35_4);
										Static33.aClass49_1.H(local501, local549, local1170, local499);
										Static33.aClass49_1.g((float) (local21.anInt2251 << 0), local21.aBoolean154 ? (float) (local21.anInt2248 << 0) : (float) (local21.anInt2248 << 0) * 1.5F);
										if (arg4 == -1412584499 || Static103.aBoolean171) {
											Static33.aClass49_1.e();
											Static33.aClass49_1.method4477();
											Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
											Static103.aBoolean171 = false;
										}
										if (local21.aBoolean157) {
											Static33.aClass49_1.method4416(false);
										}
										local575 = (local21.anInt2242 << 0) * Class162.anIntArray388[local21.anInt2228 << 3] >> 15;
										local577 = Class162.anIntArray387[local21.anInt2228 << 3] * (local21.anInt2242 << 0) >> 15;
										Static66.aClass35_3.O(-local21.anInt2254 << 3);
										Static66.aClass35_3.ja(local21.anInt2205 << 3);
										Static66.aClass35_3.o(local21.anInt2192 << 0, local247 + (local21.lb << 0) + local575, local577 - -(local21.lb << 0));
										Static66.aClass35_3.ka(local21.anInt2228 << 3);
										if (Static294.aBoolean383) {
											Static33.aClass49_1.fa(local88, local93, local21.anInt2188 + local88, local93 + local21.anInt2252);
										}
										if (local21.aBoolean154) {
											local1495.method3280(Static66.aClass35_3, null, local21.anInt2242 << 0);
										} else {
											local1495.method3276(Static66.aClass35_3, null, 1);
										}
										if (Static294.aBoolean383) {
											Static33.aClass49_1.OA(arg5, arg1, arg6, arg8);
										}
										if (local21.aBoolean157) {
											Static33.aClass49_1.method4416(true);
										}
										Static33.aClass49_1.g(0.0F, 0.0F);
									}
								} else if (local21.anInt2249 == 9) {
									if (local21.aBoolean149) {
										local247 = local21.anInt2252 + local93;
										local499 = local93;
										local1170 = local88 + local21.anInt2188;
									} else {
										local247 = local93;
										local1170 = local21.anInt2188 + local88;
										local499 = local21.anInt2252 + local93;
									}
									if (local21.anInt2193 == 1) {
										Static33.aClass49_1.method4449(local88, local247, local1170, local499, local21.anInt2235, 0);
									} else {
										Static33.aClass49_1.method4410(local88, local247, local1170, local499, local21.anInt2235, local21.anInt2193);
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
