import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static380 {

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "I")
	public static int anInt6413;

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "F")
	public static float aFloat96;

	@OriginalMember(owner = "client!sp", name = "N", descriptor = "[Lclient!mr;")
	public static Class23_Sub1_Sub2_Sub1[] aClass23_Sub1_Sub2_Sub1Array2;

	@OriginalMember(owner = "client!sp", name = "L", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIIII[Lclient!ga;III)V")
	public static void method5283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class82[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
		for (@Pc(18) int local18 = 0; local18 < arg5.length; local18++) {
			@Pc(24) Class82 local24 = arg5[local18];
			if (local24 != null && (arg8 == local24.anInt2259 || arg8 == -1412584499 && Static296.aClass82_16 == local24)) {
				@Pc(64) int local64;
				if (arg2 == -1) {
					Class43.aRectangleArray1[Static100.anInt1815].setBounds(arg6 + local24.anInt2210, arg7 + local24.anInt2199, local24.anInt2192, local24.anInt2216);
					local64 = Static100.anInt1815++;
				} else {
					local64 = arg2;
				}
				local24.anInt2204 = Static172.anInt3107;
				local24.anInt2224 = local64;
				if (!Static54.method1044(local24)) {
					if (local24.anInt2201 != 0) {
						Static89.method1549(local24);
					}
					@Pc(88) int local88 = local24.anInt2210 + arg6;
					@Pc(93) int local93 = arg7 + local24.anInt2199;
					@Pc(96) int local96 = local24.anInt2261;
					if (Static64.aBoolean82 && (Static54.method1060(local24).anInt6593 != 0 || local24.anInt2252 == 0) && local96 > 127) {
						local96 = 127;
					}
					@Pc(154) int local154;
					@Pc(158) int local158;
					if (local24 == Static296.aClass82_16) {
						if (arg8 != -1412584499 && (local24.anInt2194 == Static258.anInt4311 || Static284.anInt5011 == local24.anInt2194)) {
							Static137.anInt2419 = arg7;
							Static401.aClass82Array2 = arg5;
							Static438.anInt2389 = arg6;
							continue;
						}
						if (Static170.aBoolean243 && Static280.aBoolean333) {
							local154 = Static171.aClass50_1.method4993();
							local158 = Static171.aClass50_1.method4989();
							local154 -= Static233.anInt3984;
							local158 -= Static317.anInt5362;
							if (local154 < Static1.anInt7721) {
								local154 = Static1.anInt7721;
							}
							if (Static260.aClass82_22.anInt2192 + Static1.anInt7721 < local154 + local24.anInt2192) {
								local154 = Static260.aClass82_22.anInt2192 + Static1.anInt7721 - local24.anInt2192;
							}
							if (local158 < Static201.anInt3586) {
								local158 = Static201.anInt3586;
							}
							if (local158 + local24.anInt2216 > Static260.aClass82_22.anInt2216 + Static201.anInt3586) {
								local158 = Static260.aClass82_22.anInt2216 + Static201.anInt3586 - local24.anInt2216;
							}
							local88 = local154;
							local93 = local158;
						}
						if (Static284.anInt5011 == local24.anInt2194) {
							local96 = 128;
						}
					}
					@Pc(237) int local237;
					@Pc(235) int local235;
					@Pc(246) int local246;
					@Pc(252) int local252;
					if (local24.anInt2252 == 2) {
						local158 = arg4;
						local235 = arg0;
						local237 = arg3;
						local154 = arg1;
					} else {
						local246 = local24.anInt2192 + local88;
						local252 = local93 + local24.anInt2216;
						local154 = local88 <= arg1 ? arg1 : local88;
						if (local24.anInt2252 == 9) {
							local246++;
							local252++;
						}
						local158 = local93 > arg4 ? local93 : arg4;
						local235 = local252 < arg0 ? local252 : arg0;
						local237 = local246 >= arg3 ? arg3 : local246;
					}
					if (local237 > local154 && local235 > local158) {
						@Pc(514) int local514;
						@Pc(568) int local568;
						@Pc(592) int local592;
						@Pc(480) int local480;
						@Pc(512) int local512;
						if (local24.anInt2201 != 0) {
							if (Static228.anInt3814 == local24.anInt2201 || Static388.anInt6534 == local24.anInt2201) {
								Static326.method4515(local24.anInt2216, local88, local93, Static388.anInt6534 == local24.anInt2201, local24.anInt2192);
								Static391.aBooleanArray22[local64] = true;
								Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
								continue;
							}
							if (Static228.anInt3817 == local24.anInt2201) {
								if (local24.method1970(Static413.aClass167_11) != null) {
									Static44.method856();
									Static413.method5690(local24, Static413.aClass167_11, local93, local88);
									Static15.aBooleanArray3[local64] = true;
									Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
								}
								continue;
							}
							if (local24.anInt2201 == Static273.anInt4566) {
								if (local24.method1970(Static413.aClass167_11) != null) {
									Static464.method6335(local93, local24, local88);
									Static15.aBooleanArray3[local64] = true;
									Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
								}
								continue;
							}
							if (local24.anInt2201 == Static352.anInt5987) {
								Static126.method1987(Static203.anInterface7_5, local24.anInt2192, Static413.aClass167_11, local93, local24.anInt2216, local88);
								Static391.aBooleanArray22[local64] = true;
								Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
								continue;
							}
							if (local24.anInt2201 == Static407.anInt6719) {
								Static273.method3791(Static413.aClass167_11, local88, local93, local24.anInt2216, local24.anInt2192);
								Static391.aBooleanArray22[local64] = true;
								Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
								continue;
							}
							if (local24.anInt2201 == Static352.anInt5995) {
								if (!Static38.aBoolean35 && !Static269.aBoolean256) {
									continue;
								}
								local246 = local88 + local24.anInt2192;
								local252 = local93 + 15;
								if (Static38.aBoolean35) {
									local480 = -256;
									if (Static128.anInt2338 < 20) {
										local480 = -65536;
									}
									Static244.aClass18_1.method5168("Fps:" + Static128.anInt2338, local252, local480, local246);
									local252 += 15;
									@Pc(502) Runtime local502 = Runtime.getRuntime();
									local512 = (int) ((local502.totalMemory() - local502.freeMemory()) / 1024L);
									local514 = -256;
									if (local512 > 65536) {
										local514 = -65536;
									}
									Static244.aClass18_1.method5168("Mem:" + local512 + "k", local252, local514, local246);
									local252 += 15;
									Static244.aClass18_1.method5168("In:" + Static181.anInt5111 + "B/s Out:" + Static369.anInt6265 + "B/s", local252, -256, local246);
									local252 += 15;
									local568 = Static413.aClass167_11.xa() / 1024;
									Static244.aClass18_1.method5168("Offheap:" + local568 + "k", local252, local568 <= 65536 ? -256 : -65536, local246);
									local252 += 15;
									local592 = 0;
									@Pc(594) int local594 = 0;
									@Pc(596) int local596 = 0;
									for (@Pc(598) int local598 = 0; local598 < 30; local598++) {
										local592 += Static311.aClass101_Sub1Array2[local598].method2467();
										local594 += Static311.aClass101_Sub1Array2[local598].method2459();
										local596 += Static311.aClass101_Sub1Array2[local598].method2468();
									}
									@Pc(636) int local636 = local596 * 100 / local592;
									@Pc(642) int local642 = local594 * 10000 / local592;
									@Pc(662) String local662 = "Cache:" + Static230.method3353(2, (long) local642, 0, true) + "% (" + local636 + "%)";
									Static275.aClass18_3.method5168(local662, local252, -256, local246);
									local252 += 12;
								}
								if (anInt6413 > 0) {
									Static275.aClass18_3.method5168("Particles: " + Static30.anInt543 + " / " + anInt6413, local252, -256, local246);
								}
								local252 += 12;
								if (Static269.aBoolean256) {
									Static275.aClass18_3.method5168("Polys: " + Static413.aClass167_11.Z() + " Models: " + Static413.aClass167_11.U(), local252, -256, local246);
									local252 += 12;
									Static275.aClass18_3.method5168("Ls: " + Static66.anInt1270 + " La: " + Static170.anInt3085 + " NPC: " + Static245.anInt4187 + " Pl: " + Static339.anInt5691, local252, -256, local246);
									local252 += 12;
									Static173.method3102();
								}
								Static391.aBooleanArray22[local64] = true;
								continue;
							}
						}
						if (local24.anInt2252 == 0) {
							if (local24.anInt2201 == Static105.anInt1901 && Static413.aClass167_11.method6019()) {
								Static413.aClass167_11.method6010(local88, local93, local24.anInt2192, local24.anInt2216);
							}
							method5283(local235, local154, local64, local237, local158, arg5, local88 - local24.anInt2245, -local24.anInt2263 + local93, local24.anInt2208);
							if (local24.aClass82Array1 != null) {
								method5283(local235, local154, local64, local237, local158, local24.aClass82Array1, local88 - local24.anInt2245, -local24.anInt2263 + local93, local24.anInt2208);
							}
							@Pc(827) Class3_Sub10 local827 = (Class3_Sub10) Static32.aClass140_5.method3490((long) local24.anInt2208);
							if (local827 != null) {
								Static55.method1094(local827.anInt827, local154, local88, local64, local237, local93, local158, local235);
							}
							if (Static105.anInt1901 == local24.anInt2201 && Static413.aClass167_11.method6019()) {
								Static413.aClass167_11.method6008();
								Static185.aBoolean257 = true;
							}
							Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
						}
						if (Static375.aBooleanArray21[local64] || Static87.anInt1588 > 1) {
							if (local24.anInt2252 == 3) {
								if (local96 == 0) {
									if (local24.aBoolean173) {
										Static413.aClass167_11.M(local88, local93, local24.anInt2192, local24.anInt2216, local24.anInt2274, 0);
									} else {
										Static413.aClass167_11.method5996(local88, local93, local24.anInt2192, local24.anInt2216, local24.anInt2274, 0);
									}
								} else if (local24.aBoolean173) {
									Static413.aClass167_11.M(local88, local93, local24.anInt2192, local24.anInt2216, 255 - (local96 & 0xFF) << 24 | local24.anInt2274 & 0xFFFFFF, 1);
								} else {
									Static413.aClass167_11.method5996(local88, local93, local24.anInt2192, local24.anInt2216, 255 - (local96 & 0xFF) << 24 | local24.anInt2274 & 0xFFFFFF, 1);
								}
							} else if (local24.anInt2252 == 4) {
								@Pc(962) Class18 local962 = local24.method1971(Static413.aClass167_11);
								if (local962 != null) {
									local252 = local24.anInt2274;
									@Pc(977) String local977 = local24.aString31;
									if (local24.anInt2200 != -1) {
										@Pc(988) Class209 local988 = Static158.aClass272_1.method6283(local24.anInt2200);
										local977 = local988.lb;
										if (local977 == null) {
											local977 = "null";
										}
										if ((local988.anInt6020 == 1 || local24.anInt2215 != 1) && local24.anInt2215 != -1) {
											local977 = "<col=ff9040>" + local977 + "</col> x" + Static99.method1679(local24.anInt2215);
										}
									}
									if (Static444.aClass82_23 == local24) {
										local977 = Static276.aClass174_132.method4208(Static300.anInt5192);
										local252 = local24.anInt2274;
									}
									if (Static229.aBoolean282) {
										Static413.aClass167_11.IA(local88, local93, local88 + local24.anInt2192, local24.anInt2216 + local93);
									}
									local962.method5170(null, local24.aBoolean170 ? 255 - (local96 & 0xFF) << 24 : -1, 0, local24.anInt2229, 255 - (local96 & 0xFF) << 24 | local252, local93, local24.anInt2211, local24.anInt2214, 0, null, local24.anInt2216, Static353.aClass2Array19, local977, local24.anInt2266, local88, local24.anInt2192);
									if (Static229.aBoolean282) {
										Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
									}
								} else if (Static392.aBoolean447) {
									Static463.method6297(local24);
								}
							} else {
								@Pc(1212) int local1212;
								if (local24.anInt2252 == 5) {
									if (local24.anInt2258 >= 0) {
										local24.method1976(Static335.aClass58_1, Static448.aClass172_1).method1676(Static413.aClass167_11, 0, local24.anInt2192, local24.anInt2198 << 3, local88, local93, local24.anInt2239 << 3, 0, local24.anInt2216);
									} else {
										@Pc(1154) Class2 local1154;
										if (local24.anInt2200 == -1) {
											local1154 = local24.method1965(Static413.aClass167_11);
										} else {
											@Pc(1164) Class198 local1164 = local24.aBoolean172 ? Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 : null;
											local1154 = Static158.aClass272_1.method6278(local24.anInt2215, local1164, local24.anInt2200, local24.anInt2205, Static413.aClass167_11, local24.anInt2251, local24.anInt2226 | 0xFF000000);
										}
										if (local1154 != null) {
											local252 = local1154.d();
											local480 = local1154.ga();
											local1212 = 255 - (local96 & 0xFF) << 24 | (local24.anInt2274 == 0 ? 16777215 : local24.anInt2274 & 0xFFFFFF);
											if (local24.aBoolean180) {
												Static413.aClass167_11.IA(local88, local93, local24.anInt2192 + local88, local24.anInt2216 + local93);
												if (local24.anInt2222 != 0) {
													local512 = (local24.anInt2192 + local252 - 1) / local252;
													local514 = (local24.anInt2216 + local480 - 1) / local480;
													for (local568 = 0; local568 < local512; local568++) {
														for (local592 = 0; local592 < local514; local592++) {
															if (local24.anInt2274 == 0) {
																local1154.method5832((float) local252 / 2.0F + (float) (local88 + local568 * local252), (float) (local592 * local480 + local93) + (float) local480 / 2.0F, 4096, local24.anInt2222);
															} else {
																local1154.method5834((float) (local252 * local568 + local88) + (float) local252 / 2.0F, (float) local480 / 2.0F + (float) (local480 * local592 + local93), 4096, local24.anInt2222, local1212);
															}
														}
													}
												} else if (local24.anInt2274 == 0 && local96 == 0) {
													local1154.method5828(local88, local93, local24.anInt2192, local24.anInt2216);
												} else {
													local1154.PA(local88, local93, local24.anInt2192, local24.anInt2216, 0, local1212, 1);
												}
												Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
											} else if (local24.anInt2274 == 0 && local96 == 0) {
												if (local24.anInt2222 != 0) {
													local1154.method5832((float) local24.anInt2192 / 2.0F + (float) local88, (float) local24.anInt2216 / 2.0F + (float) local93, local24.anInt2192 * 4096 / local252, local24.anInt2222);
												} else if (local252 == local24.anInt2192 && local24.anInt2216 == local480) {
													local1154.method5829(local88, local93);
												} else {
													local1154.method5835(local88, local93, local24.anInt2192, local24.anInt2216);
												}
											} else if (local24.anInt2222 != 0) {
												local1154.method5834((float) local24.anInt2192 / 2.0F + (float) local88, (float) local93 + (float) local24.anInt2216 / 2.0F, local24.anInt2192 * 4096 / local252, local24.anInt2222, local1212);
											} else if (local24.anInt2192 == local252 && local480 == local24.anInt2216) {
												local1154.E(local88, local93, 0, local1212, 1);
											} else {
												local1154.XA(local88, local93, local24.anInt2192, local24.anInt2216, 0, local1212, 1);
											}
										} else if (Static392.aBoolean447) {
											Static463.method6297(local24);
										}
									}
								} else if (local24.anInt2252 == 6) {
									Static216.method3203();
									@Pc(1521) Class108 local1521 = null;
									local252 = 0;
									@Pc(1553) Class261 local1553;
									@Pc(1561) Class198 local1561;
									if (local24.anInt2200 != -1) {
										@Pc(1533) Class209 local1533 = Static158.aClass272_1.method6283(local24.anInt2200);
										if (local1533 != null) {
											local1533 = local1533.method4967(local24.anInt2215);
											local1553 = local24.anInt2227 == -1 ? null : Static444.aClass59_3.method1552(local24.anInt2227);
											local1561 = local24.aBoolean172 ? Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 : null;
											local1521 = local1533.method4982(local24.anInt2202, local1561, 1, local24.anInt2219, local1553, 2048, local24.anInt2267, Static413.aClass167_11);
											if (local1521 == null) {
												Static463.method6297(local24);
											} else {
												local252 = -local1521.ja() >> 1;
											}
										}
									} else if (local24.anInt2233 == 5) {
										local480 = local24.anInt2238;
										if (local480 >= 0 && local480 < 2048) {
											@Pc(1612) Class1_Sub2_Sub6_Sub2 local1612 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local480];
											@Pc(1627) Class261 local1627 = local24.anInt2227 == -1 ? null : Static444.aClass59_3.method1552(local24.anInt2227);
											if (local1612 != null && (Static317.anInt5364 == local480 || Static60.method1136(local1612.aString69) == local24.anInt2270)) {
												local1521 = local1612.aClass198_1.method4677(local24.anInt2202, local1627, Static413.aClass167_11, local24.anInt2219, Static444.aClass59_3, Static158.aClass272_1, 0, Static212.aClass238_1, 0, null, Static119.aClass47_1, local24.anInt2267, -1, Static421.aClass7_1, null, 2048, Static118.aClass19_1);
											}
										}
									} else if (local24.anInt2233 == 8 || local24.anInt2233 == 9) {
										@Pc(1682) Class3_Sub32 local1682 = Static457.method6232(false, local24.anInt2238);
										local1553 = local24.anInt2227 == -1 ? null : Static444.aClass59_3.method1552(local24.anInt2227);
										if (local1682 != null) {
											local1561 = local24.aBoolean172 ? Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1 : null;
											local1521 = local1682.method3507(local24.anInt2233 == 9, local1561, local24.anInt2219, Static413.aClass167_11, local24.anInt2267, local24.anInt2202, local24.anInt2270, local1553);
										}
									} else if (local24.anInt2227 == -1) {
										local1521 = local24.method1973(2048, Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1, Static444.aClass59_3, Static212.aClass238_1, null, Static421.aClass7_1, -1, 0, Static158.aClass272_1, -1, Static118.aClass19_1, Static119.aClass47_1, Static413.aClass167_11);
										if (local1521 == null && Static392.aBoolean447) {
											Static463.method6297(local24);
										}
									} else {
										@Pc(1741) Class261 local1741 = Static444.aClass59_3.method1552(local24.anInt2227);
										local1521 = local24.method1973(2048, Static203.aClass1_Sub2_Sub6_Sub2_1.aClass198_1, Static444.aClass59_3, Static212.aClass238_1, local1741, Static421.aClass7_1, local24.anInt2219, local24.anInt2267, Static158.aClass272_1, local24.anInt2202, Static118.aClass19_1, Static119.aClass47_1, Static413.aClass167_11);
										if (local1521 == null && Static392.aBoolean447) {
											Static463.method6297(local24);
										}
									}
									if (local1521 != null) {
										if (local24.anInt2254 <= 0) {
											local480 = 512;
										} else {
											local480 = (local24.anInt2192 << 9) / local24.anInt2254;
										}
										if (local24.anInt2279 > 0) {
											local1212 = (local24.anInt2216 << 9) / local24.anInt2279;
										} else {
											local1212 = 512;
										}
										local512 = local24.anInt2192 / 2 + local88 + (local24.anInt2246 * local480 >> 9);
										local514 = (local24.anInt2236 * local1212 >> 9) + local93 + local24.anInt2216 / 2;
										Static359.aClass11_5.K();
										Static413.aClass167_11.method6012(Static359.aClass11_5);
										Static413.aClass167_11.b(local512, local514, local480, local1212);
										Static413.aClass167_11.PA((float) (local24.anInt2265 << 0), local24.aBoolean166 ? (float) (local24.anInt2273 << 0) : (float) (local24.anInt2273 << 0) * 1.5F);
										if (arg8 == -1412584499 || Static185.aBoolean257) {
											Static413.aClass167_11.H();
											Static413.aClass167_11.method6005();
											Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
											Static185.aBoolean257 = false;
										}
										if (local24.aBoolean174) {
											Static413.aClass167_11.method6011(false);
										}
										local568 = Class65.anIntArray88[local24.anInt2232 << 3] * (local24.anInt2244 << 0) >> 15;
										local592 = (local24.anInt2244 << 0) * Class65.anIntArray87[local24.anInt2232 << 3] >> 15;
										Static103.aClass11_3.WA(-local24.anInt2193 << 3);
										Static103.aClass11_3.CA(local24.anInt2197 << 3);
										Static103.aClass11_3.J(local24.anInt2256 << 0, local252 + local568 + (local24.anInt2230 << 0), (local24.anInt2230 << 0) + local592);
										Static103.aClass11_3.ba(local24.anInt2232 << 3);
										if (Static229.aBoolean282) {
											Static413.aClass167_11.IA(local88, local93, local88 + local24.anInt2192, local93 + local24.anInt2216);
										}
										if (local24.aBoolean166) {
											local1521.method4933(Static103.aClass11_3, null, local24.anInt2244 << 0);
										} else {
											local1521.method4931(Static103.aClass11_3, null, 1);
										}
										if (Static229.aBoolean282) {
											Static413.aClass167_11.w(arg1, arg4, arg3, arg0);
										}
										if (local24.aBoolean174) {
											Static413.aClass167_11.method6011(true);
										}
										Static413.aClass167_11.PA(0.0F, 0.0F);
									}
								} else if (local24.anInt2252 == 9) {
									if (local24.aBoolean167) {
										local1212 = local93;
										local252 = local93 + local24.anInt2216;
										local480 = local88 + local24.anInt2192;
									} else {
										local252 = local93;
										local1212 = local24.anInt2216 + local93;
										local480 = local24.anInt2192 + local88;
									}
									if (local24.anInt2271 == 1) {
										Static413.aClass167_11.method5997(local88, local252, local480, local1212, local24.anInt2274, 0);
									} else {
										Static413.aClass167_11.method5966(local88, local252, local480, local1212, local24.anInt2274, local24.anInt2271);
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
