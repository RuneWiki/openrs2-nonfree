import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "I")
	public static int anInt1975;

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public static int anInt1976;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
	public static int anInt1977;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIIIII[Lclient!fi;)V")
	public static void method1602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class76[] arg8) {
		Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg8.length; local13++) {
			@Pc(19) Class76 local19 = arg8[local13];
			if (local19 != null && (local19.anInt2112 == arg6 || arg6 == -1412584499 && local19 == Static387.aClass76_14)) {
				@Pc(42) int local42;
				if (arg5 == -1) {
					Class121.aRectangleArray1[Static343.anInt5618].setBounds(local19.anInt2126 + arg1, arg4 + local19.anInt2079, local19.anInt2127, local19.anInt2106);
					local42 = Static343.anInt5618++;
				} else {
					local42 = arg5;
				}
				local19.anInt2122 = local42;
				local19.anInt2110 = Static85.anInt1536;
				if (!Static55.method890(local19)) {
					if (local19.anInt2107 != 0) {
						Static441.method5808(local19);
					}
					@Pc(90) int local90 = arg1 + local19.anInt2126;
					@Pc(95) int local95 = local19.anInt2079 + arg4;
					@Pc(98) int local98 = local19.anInt2089;
					if (Static97.aBoolean113 && (Static55.method885(local19).anInt6805 != 0 || local19.anInt2060 == 0) && local98 > 127) {
						local98 = 127;
					}
					@Pc(144) int local144;
					@Pc(148) int local148;
					if (Static387.aClass76_14 == local19) {
						if (arg6 != -1412584499 && (local19.anInt2081 == Static462.anInt7531 || Static39.anInt737 == local19.anInt2081)) {
							Static245.anInt3960 = arg4;
							Static49.aClass76Array1 = arg8;
							Static209.anInt3496 = arg1;
							continue;
						}
						if (Static243.aBoolean252 && Static320.aBoolean344) {
							local144 = Static290.aClass66_1.method5965();
							local148 = Static290.aClass66_1.method5974();
							local144 -= Static464.anInt7343;
							local148 -= Static372.anInt6084;
							if (local144 < Static454.anInt7429) {
								local144 = Static454.anInt7429;
							}
							if (local148 < Static147.anInt2654) {
								local148 = Static147.anInt2654;
							}
							if (local19.anInt2127 + local144 > Static454.anInt7429 + Static359.aClass76_13.anInt2127) {
								local144 = Static359.aClass76_13.anInt2127 + Static454.anInt7429 - local19.anInt2127;
							}
							local90 = local144;
							if (local148 + local19.anInt2106 > Static147.anInt2654 + Static359.aClass76_13.anInt2106) {
								local148 = Static359.aClass76_13.anInt2106 + Static147.anInt2654 - local19.anInt2106;
							}
							local95 = local148;
						}
						if (Static39.anInt737 == local19.anInt2081) {
							local98 = 128;
						}
					}
					@Pc(271) int local271;
					@Pc(282) int local282;
					@Pc(229) int local229;
					@Pc(234) int local234;
					if (local19.anInt2060 == 2) {
						local144 = arg0;
						local271 = arg2;
						local282 = arg7;
						local148 = arg3;
					} else {
						local229 = local90 + local19.anInt2127;
						local234 = local95 + local19.anInt2106;
						local148 = local95 <= arg3 ? arg3 : local95;
						local144 = local90 <= arg0 ? arg0 : local90;
						if (local19.anInt2060 == 9) {
							local234++;
							local229++;
						}
						local271 = arg2 > local229 ? local229 : arg2;
						local282 = arg7 > local234 ? local234 : arg7;
					}
					if (local271 > local144 && local282 > local148) {
						@Pc(523) int local523;
						@Pc(575) int local575;
						@Pc(599) int local599;
						@Pc(489) int local489;
						@Pc(521) int local521;
						if (local19.anInt2107 != 0) {
							if (Static49.anInt898 == local19.anInt2107 || local19.anInt2107 == Static261.anInt4198) {
								Static274.method3429(local19.anInt2106, local90, local19.anInt2107 == Static261.anInt4198, local95, local19.anInt2127);
								Static99.aBooleanArray5[local42] = true;
								Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
								continue;
							}
							if (Static200.anInt3340 == local19.anInt2107) {
								if (local19.method1688(Static407.aClass200_9) != null) {
									Static341.method4427();
									Static457.method5995(Static407.aClass200_9, local19, local90, local95);
									Static371.aBooleanArray21[local42] = true;
									Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
								}
								continue;
							}
							if (local19.anInt2107 == Static63.anInt1196) {
								if (local19.method1688(Static407.aClass200_9) != null) {
									Static430.method5693(local90, local95, local19);
									Static371.aBooleanArray21[local42] = true;
									Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
								}
								continue;
							}
							if (local19.anInt2107 == Static247.anInt3978) {
								Static380.method4955(Static71.anInterface8_138, local19.anInt2127, local19.anInt2106, local90, local95, Static407.aClass200_9);
								Static99.aBooleanArray5[local42] = true;
								Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
								continue;
							}
							if (Static430.anInt7165 == local19.anInt2107) {
								Static397.method5160(local19.anInt2127, local95, local19.anInt2106, local90, Static407.aClass200_9);
								Static99.aBooleanArray5[local42] = true;
								Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
								continue;
							}
							if (local19.anInt2107 == Static294.anInt4615) {
								if (!Static9.aBoolean30 && !Static179.aBoolean200) {
									continue;
								}
								local229 = local90 + local19.anInt2127;
								local234 = local95 + 15;
								if (Static9.aBoolean30) {
									local489 = -256;
									if (Static150.anInt2694 < 20) {
										local489 = -65536;
									}
									Static428.aClass23_4.method5742(local229, "Fps:" + Static150.anInt2694, local234, local489);
									local234 += 15;
									@Pc(511) Runtime local511 = Runtime.getRuntime();
									local521 = (int) ((local511.totalMemory() - local511.freeMemory()) / 1024L);
									local523 = -256;
									if (local521 > 65536) {
										local523 = -65536;
									}
									Static428.aClass23_4.method5742(local229, "Mem:" + local521 + "k", local234, local523);
									local234 += 15;
									Static428.aClass23_4.method5742(local229, "In:" + Static451.anInt7414 + "B/s Out:" + Static256.anInt4160 + "B/s", local234, -256);
									local234 += 15;
									local575 = Static407.aClass200_9.pa() / 1024;
									Static428.aClass23_4.method5742(local229, "Offheap:" + local575 + "k", local234, local575 <= 65536 ? -256 : -65536);
									local234 += 15;
									local599 = 0;
									@Pc(601) int local601 = 0;
									@Pc(603) int local603 = 0;
									for (@Pc(605) int local605 = 0; local605 < 30; local605++) {
										local599 += Static198.aClass104_Sub1Array1[local605].method2268();
										local601 += Static198.aClass104_Sub1Array1[local605].method2273();
										local603 += Static198.aClass104_Sub1Array1[local605].method2266();
									}
									@Pc(643) int local643 = local603 * 100 / local599;
									@Pc(649) int local649 = local601 * 10000 / local599;
									@Pc(671) String local671 = "Cache:" + Static222.method2921(2, true, (long) local649, 0) + "% (" + local643 + "%)";
									Static138.aClass23_2.method5742(local229, local671, local234, -256);
									local234 += 12;
								}
								if (Static48.anInt889 > 0) {
									Static138.aClass23_2.method5742(local229, "Particles: " + Static399.anInt6517 + " / " + Static48.anInt889, local234, -256);
								}
								local234 += 12;
								if (Static179.aBoolean200) {
									Static138.aClass23_2.method5742(local229, "Polys: " + Static407.aClass200_9.OA() + " Models: " + Static407.aClass200_9.Y(), local234, -256);
									local234 += 12;
									Static138.aClass23_2.method5742(local229, "Ls: " + Static95.anInt1639 + " La: " + Static305.anInt4782 + " NPC: " + Static20.anInt428 + " Pl: " + Static331.anInt5297, local234, -256);
									local234 += 12;
									Static270.method3404();
								}
								Static99.aBooleanArray5[local42] = true;
								continue;
							}
						}
						if (local19.anInt2060 == 0) {
							if (Static286.anInt4458 == local19.anInt2107 && Static407.aClass200_9.method5839()) {
								Static407.aClass200_9.method5830(local90, local95, local19.anInt2127, local19.anInt2106);
							}
							method1602(local144, local90 - local19.anInt2052, local271, local148, local95 - local19.anInt2061, local42, local19.anInt2100, local282, arg8);
							if (local19.aClass76Array2 != null) {
								method1602(local144, local90 - local19.anInt2052, local271, local148, local95 - local19.anInt2061, local42, local19.anInt2100, local282, local19.aClass76Array2);
							}
							@Pc(836) Class5_Sub44 local836 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local19.anInt2100);
							if (local836 != null) {
								Static283.method3500(local148, local282, local836.anInt6981, local144, local271, local95, local90, local42);
							}
							if (local19.anInt2107 == Static286.anInt4458 && Static407.aClass200_9.method5839()) {
								Static407.aClass200_9.method5818();
								Static456.aBoolean502 = true;
							}
							Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
						}
						if (Static39.aBooleanArray3[local42] || Static342.anInt5602 > 1) {
							if (local19.anInt2060 == 3) {
								if (local98 == 0) {
									if (local19.aBoolean150) {
										Static407.aClass200_9.P(local90, local95, local19.anInt2127, local19.anInt2106, local19.anInt2054, 0);
									} else {
										Static407.aClass200_9.method5814(local90, local95, local19.anInt2127, local19.anInt2106, local19.anInt2054, 0);
									}
								} else if (local19.aBoolean150) {
									Static407.aClass200_9.P(local90, local95, local19.anInt2127, local19.anInt2106, local19.anInt2054 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								} else {
									Static407.aClass200_9.method5814(local90, local95, local19.anInt2127, local19.anInt2106, local19.anInt2054 & 0xFFFFFF | 255 - (local98 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt2060 == 4) {
								@Pc(970) Class23 local970 = local19.method1692(Static407.aClass200_9);
								if (local970 != null) {
									local234 = local19.anInt2054;
									@Pc(985) String local985 = local19.aString19;
									if (local19.anInt2057 != -1) {
										@Pc(997) Class40 local997 = Static306.aClass67_3.method1452(local19.anInt2057);
										local985 = local997.aString5;
										if (local985 == null) {
											local985 = "null";
										}
										if ((local997.anInt1182 == 1 || local19.anInt2125 != 1) && local19.anInt2125 != -1) {
											local985 = "<col=ff9040>" + local985 + "</col> x" + Static74.method1089(local19.anInt2125);
										}
									}
									if (Static192.aClass76_9 == local19) {
										local985 = Static349.aClass198_103.method4012(Static38.anInt4834);
										local234 = local19.anInt2054;
									}
									if (Static103.aBoolean119) {
										Static407.aClass200_9.HA(local90, local95, local19.anInt2127 + local90, local95 - -local19.anInt2106);
									}
									local970.method5753(local19.anInt2127, local19.anInt2106, local19.anInt2083, local19.anInt2120, local19.anInt2080, null, local985, null, 0, local19.aBoolean147 ? 255 - (local98 & 0xFF) << 24 : -1, local95, 0, local19.anInt2119, Static107.aClass49Array5, local90, 255 - (local98 & 0xFF) << 24 | local234);
									if (Static103.aBoolean119) {
										Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
									}
								} else if (Static78.aBoolean328) {
									Static53.method833(local19);
								}
							} else {
								@Pc(1190) int local1190;
								if (local19.anInt2060 == 5) {
									if (local19.anInt2103 < 0) {
										@Pc(1136) Class49 local1136;
										if (local19.anInt2057 == -1) {
											local1136 = local19.method1680(Static407.aClass200_9);
										} else {
											@Pc(1146) Class270 local1146 = local19.aBoolean154 ? Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 : null;
											local1136 = Static306.aClass67_3.method1446(local19.anInt2057, local19.anInt2056 | 0xFF000000, local19.anInt2125, local1146, Static407.aClass200_9, local19.lb, local19.anInt2086);
										}
										if (local1136 != null) {
											local234 = local1136.RA();
											local489 = local1136.Q();
											local1190 = (local19.anInt2054 == 0 ? 16777215 : local19.anInt2054 & 0xFFFFFF) | 255 - (local98 & 0xFF) << 24;
											if (local19.aBoolean146) {
												Static407.aClass200_9.HA(local90, local95, local19.anInt2127 + local90, local95 - -local19.anInt2106);
												if (local19.anInt2048 != 0) {
													local521 = (local19.anInt2127 + local234 - 1) / local234;
													local523 = (local19.anInt2106 + local489 - 1) / local489;
													for (local575 = 0; local575 < local521; local575++) {
														for (local599 = 0; local599 < local523; local599++) {
															if (local19.anInt2054 == 0) {
																local1136.method5786((float) local234 / 2.0F + (float) (local234 * local575 + local90), (float) (local95 + local599 * local489) + (float) local489 / 2.0F, 4096, local19.anInt2048);
															} else {
																local1136.method5788((float) local234 / 2.0F + (float) (local90 + local234 * local575), (float) local489 / 2.0F + (float) (local95 - -(local489 * local599)), 4096, local19.anInt2048, local1190);
															}
														}
													}
												} else if (local19.anInt2054 == 0 && local98 == 0) {
													local1136.method5792(local90, local95, local19.anInt2127, local19.anInt2106);
												} else {
													local1136.la(local90, local95, local19.anInt2127, local19.anInt2106, 0, local1190, 1);
												}
												Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
											} else if (local19.anInt2054 == 0 && local98 == 0) {
												if (local19.anInt2048 != 0) {
													local1136.method5786((float) local90 + (float) local19.anInt2127 / 2.0F, (float) local19.anInt2106 / 2.0F + (float) local95, local19.anInt2127 * 4096 / local234, local19.anInt2048);
												} else if (local19.anInt2127 == local234 && local489 == local19.anInt2106) {
													local1136.method5785(local90, local95);
												} else {
													local1136.method5789(local90, local95, local19.anInt2127, local19.anInt2106);
												}
											} else if (local19.anInt2048 != 0) {
												local1136.method5788((float) local90 + (float) local19.anInt2127 / 2.0F, (float) local19.anInt2106 / 2.0F + (float) local95, local19.anInt2127 * 4096 / local234, local19.anInt2048, local1190);
											} else if (local19.anInt2127 == local234 && local19.anInt2106 == local489) {
												local1136.W(local90, local95, 0, local1190, 1);
											} else {
												local1136.ya(local90, local95, local19.anInt2127, local19.anInt2106, 0, local1190, 1);
											}
										} else if (Static78.aBoolean328) {
											Static53.method833(local19);
										}
									} else {
										local19.method1691(Static420.aClass175_2, Static42.aClass235_1).method4567(local95, 0, local19.anInt2087 << 3, 0, local19.anInt2101 << 3, Static407.aClass200_9, local19.anInt2127, local19.anInt2106, local90);
									}
								} else if (local19.anInt2060 == 6) {
									Static462.method6053();
									@Pc(1532) Class57 local1532 = null;
									local234 = 0;
									@Pc(1575) Class143 local1575;
									@Pc(1585) Class270 local1585;
									if (local19.anInt2057 != -1) {
										@Pc(1763) Class40 local1763 = Static306.aClass67_3.method1452(local19.anInt2057);
										if (local1763 != null) {
											local1763 = local1763.method977(local19.anInt2125);
											local1575 = local19.anInt2084 == -1 ? null : Static271.aClass219_4.method4752(local19.anInt2084);
											local1585 = local19.aBoolean154 ? Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 : null;
											local1532 = local1763.method983(local19.anInt2051, Static407.aClass200_9, 1, local1575, local19.anInt2064, local1585, 2048, local19.anInt2050);
											if (local1532 == null) {
												Static53.method833(local19);
											} else {
												local234 = -local1532.B() >> 1;
											}
										}
									} else if (local19.anInt2134 == 5) {
										local489 = local19.anInt2053;
										if (local489 >= 0 && local489 < 2048) {
											@Pc(1695) Class2_Sub1_Sub3_Sub2 local1695 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local489];
											@Pc(1710) Class143 local1710 = local19.anInt2084 == -1 ? null : Static271.aClass219_4.method4752(local19.anInt2084);
											if (local1695 != null && (local489 == Static43.anInt5302 || Static278.method3460(local1695.aString65) == local19.anInt2129)) {
												local1532 = local1695.aClass270_1.method5997(Static306.aClass67_3, null, Static271.aClass219_4, local19.anInt2064, Static27.aClass149_1, local19.anInt2050, Static391.aClass120_2, Static407.aClass200_9, local19.anInt2051, local1710, 2048, null, 0, -1, Static196.aClass180_1, 0, Static408.aClass39_1);
											}
										}
									} else if (local19.anInt2134 == 8 || local19.anInt2134 == 9) {
										@Pc(1563) Class5_Sub26 local1563 = Static176.method2415(false, local19.anInt2053);
										local1575 = local19.anInt2084 == -1 ? null : Static271.aClass219_4.method4752(local19.anInt2084);
										if (local1563 != null) {
											local1585 = local19.aBoolean154 ? Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1 : null;
											local1532 = local1563.method3055(local19.anInt2134 == 9, local1585, local1575, Static407.aClass200_9, local19.anInt2064, local19.anInt2051, local19.anInt2129, local19.anInt2050);
										}
									} else if (local19.anInt2084 == -1) {
										local1532 = local19.method1689(0, Static27.aClass149_1, Static271.aClass219_4, 2048, Static408.aClass39_1, Static306.aClass67_3, -1, Static407.aClass200_9, Static196.aClass180_1, Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1, Static391.aClass120_2, null, -1);
										if (local1532 == null && Static78.aBoolean328) {
											Static53.method833(local19);
										}
									} else {
										@Pc(1649) Class143 local1649 = Static271.aClass219_4.method4752(local19.anInt2084);
										local1532 = local19.method1689(local19.anInt2064, Static27.aClass149_1, Static271.aClass219_4, 2048, Static408.aClass39_1, Static306.aClass67_3, local19.anInt2051, Static407.aClass200_9, Static196.aClass180_1, Static220.aClass2_Sub1_Sub3_Sub2_1.aClass270_1, Static391.aClass120_2, local1649, local19.anInt2050);
										if (local1532 == null && Static78.aBoolean328) {
											Static53.method833(local19);
										}
									}
									if (local1532 != null) {
										if (local19.anInt2095 > 0) {
											local489 = (local19.anInt2127 << 9) / local19.anInt2095;
										} else {
											local489 = 512;
										}
										if (local19.anInt2091 > 0) {
											local1190 = (local19.anInt2106 << 9) / local19.anInt2091;
										} else {
											local1190 = 512;
										}
										local521 = local90 + local19.anInt2127 / 2 + (local489 * local19.anInt2094 >> 9);
										local523 = local95 + local19.anInt2106 / 2 + (local1190 * local19.anInt2128 >> 9);
										Static43.aClass29_5.v();
										Static407.aClass200_9.SA(Static43.aClass29_5);
										Static407.aClass200_9.GA(local521, local523, local489, local1190);
										Static407.aClass200_9.da((float) (local19.anInt2135 << 0), local19.aBoolean140 ? (float) (local19.anInt2065 << 0) : (float) (local19.anInt2065 << 0) * 1.5F);
										if (arg6 == -1412584499 || Static456.aBoolean502) {
											Static407.aClass200_9.va();
											Static407.aClass200_9.method5881();
											Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
											Static456.aBoolean502 = false;
										}
										if (local19.aBoolean149) {
											Static407.aClass200_9.method5859(false);
										}
										local575 = Class30.anIntArray38[local19.anInt2093 << 3] * (local19.anInt2137 << 0) >> 15;
										local599 = Class30.anIntArray37[local19.anInt2093 << 3] * (local19.anInt2137 << 0) >> 15;
										Static344.aClass29_6.A(-local19.anInt2069 << 3);
										Static344.aClass29_6.EA(local19.anInt2117 << 3);
										Static344.aClass29_6.W(local19.anInt2092 << 0, (local19.anInt2078 << 0) + local575 + local234, (local19.anInt2078 << 0) + local599);
										Static344.aClass29_6.ea(local19.anInt2093 << 3);
										if (Static103.aBoolean119) {
											Static407.aClass200_9.HA(local90, local95, local19.anInt2127 + local90, local19.anInt2106 + local95);
										}
										if (local19.aBoolean140) {
											local1532.method6072(Static344.aClass29_6, null, local19.anInt2137 << 0);
										} else {
											local1532.method6060(Static344.aClass29_6, null, 1);
										}
										if (Static103.aBoolean119) {
											Static407.aClass200_9.ba(arg0, arg3, arg2, arg7);
										}
										if (local19.aBoolean149) {
											Static407.aClass200_9.method5859(true);
										}
										Static407.aClass200_9.da(0.0F, 0.0F);
									}
								} else if (local19.anInt2060 == 9) {
									if (local19.aBoolean153) {
										local489 = local19.anInt2127 + local90;
										local1190 = local95;
										local234 = local95 + local19.anInt2106;
									} else {
										local234 = local95;
										local489 = local19.anInt2127 + local90;
										local1190 = local95 + local19.anInt2106;
									}
									if (local19.anInt2088 == 1) {
										Static407.aClass200_9.method5861(local90, local234, local489, local1190, local19.anInt2054, 0);
									} else {
										Static407.aClass200_9.method5834(local90, local234, local489, local1190, local19.anInt2054, local19.anInt2088);
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
