import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "Lclient!od;")
	public static Class60 aClass60_954 = Static41.method597("leuchten3:");

	@OriginalMember(owner = "client!sa", name = "ub", descriptor = "Lclient!cb;")
	public static Class12 aClass12_23 = new Class12(64);

	@OriginalMember(owner = "client!sa", name = "Hb", descriptor = "I")
	public static int anInt2402 = 0;

	@OriginalMember(owner = "client!sa", name = "Tb", descriptor = "[I")
	public static int[] anIntArray309 = new int[100];

	@OriginalMember(owner = "client!sa", name = "wc", descriptor = "I")
	public static int anInt2426 = 0;

	@OriginalMember(owner = "client!sa", name = "zc", descriptor = "I")
	public static int anInt2428 = 0;

	@OriginalMember(owner = "client!sa", name = "Tc", descriptor = "I")
	public static int anInt2439 = 0;

	@OriginalMember(owner = "client!sa", name = "Wc", descriptor = "Lclient!cb;")
	public static Class12 aClass12_24 = new Class12(30);

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIZ)Lclient!od;")
	public static Class60 method1692(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1) {
		@Pc(13) int local13 = arg0 / 10;
		@Pc(15) int local15 = 1;
		while (local13 != 0) {
			local15++;
			local13 /= 10;
		}
		@Pc(33) int local33 = local15;
		if (arg0 < 0 || arg1) {
			local33 = local15 + 1;
		}
		@Pc(49) byte[] local49 = new byte[local33];
		if (arg0 < 0) {
			local49[0] = 45;
		} else if (arg1) {
			local49[0] = 43;
		}
		for (@Pc(68) int local68 = 0; local68 < local15; local68++) {
			@Pc(74) int local74 = arg0 % 10;
			if (local74 < 0) {
				local74 = -local74;
			}
			if (local74 > 9) {
				local74 += 39;
			}
			arg0 /= 10;
			local49[local33 - local68 - 1] = (byte) (local74 + 48);
		}
		@Pc(114) Class60 local114 = new Class60();
		local114.aByteArray21 = local49;
		local114.anInt1991 = local33;
		return local114;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZII[Lclient!sa;IIIIII)V")
	public static void method1693(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class4_Sub14[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static34.method1652(arg8, arg7, arg5, arg4);
		Static100.method1669();
		for (@Pc(13) int local13 = 0; local13 < arg2.length; local13++) {
			@Pc(24) Class4_Sub14 local24 = arg2[local13];
			if (local24 != null && (local24.anInt2397 == arg1 || arg1 == -1412584499 && local24 == Static81.aClass4_Sub14_12)) {
				@Pc(77) int local77;
				if (arg0 == -1) {
					anIntArray309[Static132.anInt2950] = local24.anInt2406 + arg3;
					Static78.anIntArray219[Static132.anInt2950] = arg6 + local24.anInt2375;
					Static107.anIntArray324[Static132.anInt2950] = local24.anInt2392;
					Static68.anIntArray193[Static132.anInt2950] = local24.anInt2440;
					local77 = Static132.anInt2950++;
				} else {
					local77 = arg0;
				}
				local24.anInt2431 = Static118.anInt2741;
				local24.anInt2413 = local77;
				if (!local24.aBoolean95 || !Static2.method9(local24)) {
					if (local24.anInt2432 > 0) {
						Static71.method1227(local24);
					}
					@Pc(108) int local108 = arg3 + local24.anInt2406;
					@Pc(113) int local113 = arg6 + local24.anInt2375;
					@Pc(116) int local116 = local24.anInt2418;
					@Pc(146) int local146;
					@Pc(152) int local152;
					if (local24 == Static81.aClass4_Sub14_12) {
						if (arg1 != -1412584499 && !local24.aBoolean98) {
							Static60.anInt2965 = arg3;
							Static129.aClass4_Sub14Array2 = arg2;
							Static131.anInt2918 = arg6;
							continue;
						}
						if (!local24.aBoolean98) {
							local116 = 128;
						}
						if (Static70.aBoolean63 && Static115.aBoolean116) {
							local146 = Static36.anInt1006;
							local146 -= Static113.anInt1295;
							local152 = Static85.anInt2015;
							if (local146 < Static81.anInt1918) {
								local146 = Static81.anInt1918;
							}
							local152 -= Static42.anInt1098;
							if (local152 < Static68.anInt1703) {
								local152 = Static68.anInt1703;
							}
							if (local146 + local24.anInt2392 > Static81.anInt1918 - -Static69.aClass4_Sub14_10.anInt2392) {
								local146 = Static81.anInt1918 + Static69.aClass4_Sub14_10.anInt2392 - local24.anInt2392;
							}
							local108 = local146;
							if (Static68.anInt1703 + Static69.aClass4_Sub14_10.anInt2440 < local24.anInt2440 + local152) {
								local152 = Static68.anInt1703 + Static69.aClass4_Sub14_10.anInt2440 - local24.anInt2440;
							}
							local113 = local152;
						}
					}
					@Pc(224) int local224;
					@Pc(230) int local230;
					@Pc(240) int local240;
					@Pc(242) int local242;
					@Pc(253) int local253;
					@Pc(247) int local247;
					if (local24.anInt2389 == 2) {
						local224 = arg5;
						local146 = arg8;
						local152 = arg7;
						local230 = arg4;
					} else if (local24.anInt2389 == 9) {
						local240 = local108;
						local242 = local113;
						local247 = local24.anInt2440 + local113;
						local253 = local108 + local24.anInt2392;
						if (local108 > local253) {
							local240 = local253;
							local253 = local108;
						}
						if (local113 > local247) {
							local242 = local247;
							local247 = local113;
						}
						local152 = arg7 < local242 ? local242 : arg7;
						local146 = arg8 < local240 ? local240 : arg8;
						local253++;
						local224 = arg5 > local253 ? local253 : arg5;
						local247++;
						local230 = arg4 > local247 ? local247 : arg4;
					} else {
						local152 = arg7 < local113 ? local113 : arg7;
						local146 = arg8 >= local108 ? arg8 : local108;
						local240 = local24.anInt2392 + local108;
						local224 = arg5 > local240 ? local240 : arg5;
						local242 = local113 + local24.anInt2440;
						local230 = arg4 > local242 ? local242 : arg4;
					}
					if (!local24.aBoolean95 || local146 < local224 && local230 > local152) {
						if (local24.anInt2432 != 0) {
							if (local24.anInt2432 == 1337) {
								Static85.anInt2011 = local113;
								Static21.anInt767 = local108;
								Static67.method1077(local24.anInt2440, local24.anInt2392, local113, local108);
								Static34.method1652(arg8, arg7, arg5, arg4);
								continue;
							}
							if (local24.anInt2432 == 1338) {
								Static70.method1113(local113, local108, local77);
								Static34.method1652(arg8, arg7, arg5, arg4);
								continue;
							}
						}
						local240 = Static36.anInt1006;
						local242 = Static85.anInt2015;
						if (!Static12.aBoolean107 && local240 >= local146 && local242 >= local152 && local240 < local224 && local230 > local242) {
							Static55.method879(local240 - local108, -local113 + local242, local24);
						}
						if (local24.anInt2389 == 0) {
							if (!local24.aBoolean95 && Static2.method9(local24) && Static18.aClass4_Sub14_4 != local24) {
								continue;
							}
							if (!local24.aBoolean95) {
								if (local24.anInt2395 - local24.anInt2440 < local24.anInt2437) {
									local24.anInt2437 = local24.anInt2395 - local24.anInt2440;
								}
								if (local24.anInt2437 < 0) {
									local24.anInt2437 = 0;
								}
							}
							method1693(local77, local24.anInt2388, arg2, local108 - local24.anInt2416, local230, local224, local113 - local24.anInt2437, local152, local146);
							if (local24.aClass4_Sub14Array3 != null) {
								method1693(local77, local24.anInt2388, local24.aClass4_Sub14Array3, local108 - local24.anInt2416, local230, local224, local113 - local24.anInt2437, local152, local146);
							}
							@Pc(553) Class4_Sub18 local553 = (Class4_Sub18) Static78.aClass75_10.method1896((long) local24.anInt2388);
							if (local553 != null) {
								if (local553.anInt2591 == 0 && local146 <= Static36.anInt1006 && local152 <= Static85.anInt2015 && local224 > Static36.anInt1006 && local230 > Static85.anInt2015 && !Static12.aBoolean107 && !Static62.aBoolean54) {
									Static80.aClass60Array14[0] = Static119.aClass60_1072;
									Static128.aClass60Array20[0] = Static23.aClass60_253;
									Static48.anInt1184 = 1;
									Static82.anIntArray226[0] = 1005;
								}
								Static117.method1889(local113, local553.anInt2589, local152, local230, local77, local108, local224, local146);
							}
							Static34.method1652(arg8, arg7, arg5, arg4);
							Static100.method1669();
						}
						if (Static61.aBooleanArray10[local77] || Static111.anInt2633 > 1) {
							if (local24.anInt2389 == 0 && !local24.aBoolean95 && local24.anInt2395 > local24.anInt2440) {
								Static5.method54(local24.anInt2437, local113, local24.anInt2440, local108 + local24.anInt2392, local24.anInt2395);
							}
							if (local24.anInt2389 != 1) {
								@Pc(661) int local661;
								@Pc(673) int local673;
								@Pc(846) int local846;
								@Pc(741) int local741;
								@Pc(926) int local926;
								@Pc(682) int local682;
								@Pc(860) int local860;
								if (local24.anInt2389 == 2) {
									local253 = 0;
									for (local247 = 0; local247 < local24.anInt2440; local247++) {
										for (local661 = 0; local661 < local24.anInt2392; local661++) {
											local673 = (local24.anInt2423 + 32) * local661 + local108;
											local682 = (local24.anInt2365 + 32) * local247 + local113;
											if (local253 < 20) {
												local673 += local24.anIntArray310[local253];
												local682 += local24.anIntArray308[local253];
											}
											if (local24.anIntArray312[local253] > 0) {
												local741 = local24.anIntArray312[local253] - 1;
												if (arg8 < local673 + 32 && arg5 > local673 && local682 + 32 > arg7 && local682 < arg4 || Static75.aClass4_Sub14_9 == local24 && local253 == Static69.anInt1721) {
													@Pc(796) Class4_Sub3_Sub6_Sub3 local796;
													if (Static44.anInt2167 == 1 && Static9.anInt125 == local253 && Static108.anInt2580 == local24.anInt2388) {
														local796 = Static111.method1833(local741, false, 2, 0, local24.anIntArray311[local253]);
													} else {
														local796 = Static111.method1833(local741, false, 1, 3153952, local24.anIntArray311[local253]);
													}
													if (local796 == null) {
														Static36.method558(local24);
													} else if (local24 == Static75.aClass4_Sub14_9 && Static69.anInt1721 == local253) {
														local846 = Static85.anInt2015 - Static16.anInt553;
														if (local846 < 5 && local846 > -5) {
															local846 = 0;
														}
														local860 = Static36.anInt1006 - Static90.anInt2122;
														if (local860 < 5 && local860 > -5) {
															local860 = 0;
														}
														if (Static120.anInt2753 < 5) {
															local846 = 0;
															local860 = 0;
														}
														local796.method1615(local673 + local860, local682 - -local846, 128);
														if (arg1 != -1) {
															@Pc(899) Class4_Sub14 local899 = arg2[arg1 & 0xFFFF];
															if (Static34.anInt2344 > local682 + local846 && local899.anInt2437 > 0) {
																local926 = Static116.anInt2713 * (Static34.anInt2344 - local846 - local682) / 3;
																if (Static116.anInt2713 * 10 < local926) {
																	local926 = Static116.anInt2713 * 10;
																}
																if (local899.anInt2437 < local926) {
																	local926 = local899.anInt2437;
																}
																Static16.anInt553 += local926;
																local899.anInt2437 -= local926;
																Static36.method558(local899);
															}
															if (Static34.anInt2347 < local846 + local682 + 32 && local899.anInt2395 - local899.anInt2440 > local899.anInt2437) {
																local926 = Static116.anInt2713 * (local682 + local846 + 32 - Static34.anInt2347) / 3;
																if (local926 > Static116.anInt2713 * 10) {
																	local926 = Static116.anInt2713 * 10;
																}
																if (local926 > local899.anInt2395 - local899.anInt2437 - local899.anInt2440) {
																	local926 = local899.anInt2395 - local899.anInt2437 - local899.anInt2440;
																}
																local899.anInt2437 += local926;
																Static16.anInt553 -= local926;
																Static36.method558(local899);
															}
														}
													} else if (Static23.aClass4_Sub14_5 == local24 && local253 == Static110.anInt2618) {
														local796.method1615(local673, local682, 128);
													} else {
														local796.method1632(local673, local682);
													}
												}
											} else if (local24.anIntArray314 != null && local253 < 20) {
												@Pc(717) Class4_Sub3_Sub6_Sub3 local717 = local24.method1689(local253);
												if (local717 != null) {
													local717.method1632(local673, local682);
												} else if (Static125.aBoolean121) {
													Static36.method558(local24);
												}
											}
											local253++;
										}
									}
								} else if (local24.anInt2389 == 3) {
									if (Static50.method850(local24)) {
										local253 = local24.anInt2436;
										if (local24 == Static18.aClass4_Sub14_4 && local24.anInt2384 != 0) {
											local253 = local24.anInt2384;
										}
									} else {
										local253 = local24.anInt2387;
										if (Static18.aClass4_Sub14_4 == local24 && local24.anInt2396 != 0) {
											local253 = local24.anInt2396;
										}
									}
									if (local116 == 0) {
										if (local24.aBoolean101) {
											Static34.method1649(local108, local113, local24.anInt2392, local24.anInt2440, local253);
										} else {
											Static34.method1650(local108, local113, local24.anInt2392, local24.anInt2440, local253);
										}
									} else if (local24.aBoolean101) {
										Static34.method1658(local108, local113, local24.anInt2392, local24.anInt2440, local253, 256 - (local116 & 0xFF));
									} else {
										Static34.method1663(local108, local113, local24.anInt2392, local24.anInt2440, local253, 256 - (local116 & 0xFF));
									}
								} else {
									@Pc(1181) Class4_Sub3_Sub6_Sub1_Sub1 local1181;
									if (local24.anInt2389 == 4) {
										local1181 = local24.method1694();
										if (local1181 != null) {
											@Pc(1197) Class60 local1197 = local24.aClass60_958;
											if (Static50.method850(local24)) {
												local247 = local24.anInt2436;
												if (Static18.aClass4_Sub14_4 == local24 && local24.anInt2384 != 0) {
													local247 = local24.anInt2384;
												}
												if (local24.aClass60_956.method1345() > 0) {
													local1197 = local24.aClass60_956;
												}
											} else {
												local247 = local24.anInt2387;
												if (Static18.aClass4_Sub14_4 == local24 && local24.anInt2396 != 0) {
													local247 = local24.anInt2396;
												}
											}
											if (local24.aBoolean95 && local24.anInt2399 != -1) {
												@Pc(1257) Class4_Sub3_Sub16 local1257 = Static112.method1854(local24.anInt2399);
												local1197 = local1257.aClass60_1128;
												if (local1197 == null) {
													local1197 = Static31.aClass60_319;
												}
												if ((local1257.anInt2866 == 1 || local24.anInt2370 != 1) && local24.anInt2370 != -1) {
													local1197 = Static12.method1761(new Class60[] { Static115.aClass60_1048, local1197, Static31.aClass60_314, Static42.method607(local24.anInt2370) });
												}
											}
											if (Static27.aClass4_Sub14_6 == local24) {
												local1197 = Static41.aClass60_398;
												local247 = local24.anInt2387;
											}
											if (!local24.aBoolean95) {
												local1197 = Static71.method1228(local1197, local24);
											}
											local1181.method1210(local1197, local108, local113, local24.anInt2392, local24.anInt2440, local247, local24.aBoolean96 ? 0 : -1, local24.anInt2391, local24.anInt2407, local24.anInt2372);
										} else if (Static125.aBoolean121) {
											Static36.method558(local24);
										}
									} else if (local24.anInt2389 == 5) {
										@Pc(1359) Class4_Sub3_Sub6_Sub3 local1359;
										if (local24.aBoolean95) {
											if (local24.anInt2399 == -1) {
												local1359 = local24.method1703(false);
											} else {
												local1359 = Static111.method1833(local24.anInt2399, false, local24.anInt2378, local24.anInt2408, local24.anInt2370);
											}
											if (local1359 != null) {
												local247 = local1359.anInt2313;
												local661 = local1359.anInt2317;
												if (local24.aBoolean90) {
													Static34.method1661(local108, local113, local24.anInt2392 + local108, local24.anInt2440 + local113);
													local682 = (local661 + local24.anInt2440 - 1) / local661;
													local673 = (local24.anInt2392 + local247 - 1) / local247;
													for (local860 = 0; local860 < local673; local860++) {
														for (local846 = 0; local846 < local682; local846++) {
															if (local24.anInt2393 != 0) {
																local1359.method1613(local108 + local860 * local247 + local247 / 2, local661 / 2 + local846 * local661 + local113, local24.anInt2393, 4096);
															} else if (local116 == 0) {
																local1359.method1632(local108 + local860 * local247, local113 + local661 * local846);
															} else {
																local1359.method1615(local108 + local247 * local860, local113 - -(local846 * local661), 256 - (local116 & 0xFF));
															}
														}
													}
													Static34.method1652(arg8, arg7, arg5, arg4);
												} else {
													local673 = local24.anInt2392 * 4096 / local247;
													if (local24.anInt2393 != 0) {
														local1359.method1613(local108 + local24.anInt2392 / 2, local24.anInt2440 / 2 + local113, local24.anInt2393, local673);
													} else if (local116 != 0) {
														local1359.method1633(local108, local113, local24.anInt2392, local24.anInt2440, 256 - (local116 & 0xFF));
													} else if (local24.anInt2392 == local247 && local24.anInt2440 == local661) {
														local1359.method1632(local108, local113);
													} else {
														local1359.method1609(local108, local113, local24.anInt2392, local24.anInt2440);
													}
												}
											} else if (Static125.aBoolean121) {
												Static36.method558(local24);
											}
										} else {
											local1359 = local24.method1703(Static50.method850(local24));
											if (local1359 != null) {
												local1359.method1632(local108, local113);
											} else if (Static125.aBoolean121) {
												Static36.method558(local24);
											}
										}
									} else {
										@Pc(1711) Class4_Sub3_Sub16 local1711;
										if (local24.anInt2389 == 6) {
											@Pc(1623) boolean local1623 = Static50.method850(local24);
											@Pc(1625) Class4_Sub3_Sub1_Sub7 local1625 = null;
											if (local1623) {
												local247 = local24.anInt2438;
											} else {
												local247 = local24.anInt2385;
											}
											local673 = 0;
											if (local24.anInt2399 != -1) {
												local1711 = Static112.method1854(local24.anInt2399);
												if (local1711 != null) {
													local1711 = local1711.method1962(local24.anInt2370);
													local1625 = local1711.method1964(1);
													if (local1625 == null) {
														Static36.method558(local24);
													} else {
														local1625.method1493();
														local673 = local1625.anInt2166 / 2;
													}
												}
											} else if (local24.anInt2367 == 5) {
												if (local24.anInt2364 == 0) {
													local1625 = Static71.aClass49_2.method1065(-1, null, -1, null);
												} else {
													local1625 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.method1484();
												}
											} else if (local247 == -1) {
												local1625 = local24.method1699(null, -1, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass49_1, local1623);
												if (local1625 == null && Static125.aBoolean121) {
													Static36.method558(local24);
												}
											} else {
												@Pc(1671) Class4_Sub3_Sub10 local1671 = Static7.method63(local247);
												local1625 = local24.method1699(local1671, local24.anInt2424, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass49_1, local1623);
												if (local1625 == null && Static125.aBoolean121) {
													Static36.method558(local24);
												}
											}
											Static100.method1678(local24.anInt2392 / 2 + local108, local113 - -(local24.anInt2440 / 2));
											local682 = local24.anInt2410 * Class4_Sub3_Sub6_Sub4.anIntArray301[local24.anInt2386] >> 16;
											local860 = Class4_Sub3_Sub6_Sub4.anIntArray304[local24.anInt2386] * local24.anInt2410 >> 16;
											if (local1625 != null) {
												if (local24.aBoolean95) {
													local1625.method1493();
													if (local24.aBoolean92) {
														local1625.method1497(local24.anInt2373, local24.anInt2404, local24.anInt2386, local24.anInt2409, local24.anInt2425 + local682 + local673, local24.anInt2425 + local860, local24.anInt2410);
													} else {
														local1625.method1492(local24.anInt2373, local24.anInt2404, local24.anInt2386, local24.anInt2409, local682 + local673 + local24.anInt2425, local24.anInt2425 + local860);
													}
												} else {
													local1625.method1492(local24.anInt2373, 0, local24.anInt2386, 0, local682, local860);
												}
											}
											Static100.method1670();
										} else {
											if (local24.anInt2389 == 7) {
												local1181 = local24.method1694();
												if (local1181 == null) {
													if (Static125.aBoolean121) {
														Static36.method558(local24);
													}
													continue;
												}
												local247 = 0;
												for (local661 = 0; local661 < local24.anInt2440; local661++) {
													for (local673 = 0; local673 < local24.anInt2392; local673++) {
														if (local24.anIntArray312[local247] > 0) {
															local1711 = Static112.method1854(local24.anIntArray312[local247] - 1);
															@Pc(1935) Class60 local1935;
															if (local1711.anInt2866 != 1 && local24.anIntArray311[local247] == 1) {
																local1935 = Static12.method1761(new Class60[] { Static115.aClass60_1048, local1711.aClass60_1128, Static62.aClass60_586 });
															} else {
																local1935 = Static12.method1761(new Class60[] { Static115.aClass60_1048, local1711.aClass60_1128, Static31.aClass60_314, Static42.method607(local24.anIntArray311[local247]) });
															}
															local741 = local113 + (local24.anInt2365 + 12) * local661;
															local846 = (local24.anInt2423 + 115) * local673 + local108;
															if (local24.anInt2391 == 0) {
																local1181.method1204(local1935, local846, local741, local24.anInt2387, local24.aBoolean96 ? 0 : -1);
															} else if (local24.anInt2391 == 1) {
																local1181.method1202(local1935, local846 + local24.anInt2392 / 2, local741, local24.anInt2387, local24.aBoolean96 ? 0 : -1);
															} else {
																local1181.method1200(local1935, local24.anInt2392 + local846 - 1, local741, local24.anInt2387, local24.aBoolean96 ? 0 : -1);
															}
														}
														local247++;
													}
												}
											}
											@Pc(2227) int local2227;
											if (local24.anInt2389 == 8 && Static128.aClass4_Sub14_16 == local24 && Static123.anInt2794 == Static129.anInt1202) {
												local247 = 0;
												@Pc(2074) Class60 local2074 = local24.aClass60_958;
												@Pc(2076) Class4_Sub3_Sub6_Sub1_Sub1 local2076 = Static132.aClass4_Sub3_Sub6_Sub1_Sub1_6;
												local2074 = Static71.method1228(local2074, local24);
												local253 = 0;
												@Pc(2100) Class60 local2100;
												while (local2074.method1345() > 0) {
													local860 = local2074.method1316(Static72.aClass60_757);
													if (local860 == -1) {
														local2100 = local2074;
														local2074 = Static23.aClass60_253;
													} else {
														local2100 = local2074.method1333(0, local860);
														local2074 = local2074.method1315(local860 + 4);
													}
													local846 = local2076.method1218(local2100);
													local247 += local2076.anInt1808 + 1;
													if (local253 < local846) {
														local253 = local846;
													}
												}
												local247 += 7;
												local253 += 6;
												local860 = local108 + local24.anInt2392 - local253 - 5;
												if (local860 < local108 + 5) {
													local860 = local108 + 5;
												}
												if (local253 + local860 > arg5) {
													local860 = arg5 - local253;
												}
												local846 = local113 + local24.anInt2440 + 5;
												if (local247 + local846 > arg4) {
													local846 = arg4 - local247;
												}
												Static34.method1649(local860, local846, local253, local247, 16777120);
												Static34.method1650(local860, local846, local253, local247, 0);
												local2074 = local24.aClass60_958;
												local741 = local2076.anInt1808 + local846 + 2;
												local2074 = Static71.method1228(local2074, local24);
												while (local2074.method1345() > 0) {
													local2227 = local2074.method1316(Static72.aClass60_757);
													if (local2227 == -1) {
														local2100 = local2074;
														local2074 = Static23.aClass60_253;
													} else {
														local2100 = local2074.method1333(0, local2227);
														local2074 = local2074.method1315(local2227 + 4);
													}
													local2076.method1204(local2100, local860 + 3, local741, 0, -1);
													local741 += local2076.anInt1808 + 1;
												}
											}
											if (local24.anInt2389 == 9) {
												if (local24.anInt2366 == 1) {
													Static34.method1660(local108, local113, local108 + local24.anInt2392, local113 - -local24.anInt2440, local24.anInt2387);
												} else {
													local247 = local24.anInt2440 < 0 ? -local24.anInt2440 : local24.anInt2440;
													local253 = local24.anInt2392 >= 0 ? local24.anInt2392 : -local24.anInt2392;
													local661 = local253;
													if (local247 > local253) {
														local661 = local247;
													}
													if (local661 != 0) {
														local673 = (local24.anInt2392 << 16) / local661;
														local682 = (local24.anInt2440 << 16) / local661;
														if (local682 > local673) {
															local682 = -local682;
														} else {
															local673 = -local673;
														}
														local846 = local682 * local24.anInt2366 + 1 >> 17;
														local860 = local24.anInt2366 * local682 >> 17;
														@Pc(2358) int local2358 = local108 + local860;
														local2227 = local24.anInt2366 * local673 + 1 >> 17;
														local926 = local108 - local846;
														local741 = local673 * local24.anInt2366 >> 17;
														@Pc(2387) int local2387 = local108 + local24.anInt2392 - local846;
														@Pc(2391) int local2391 = local741 + local113;
														@Pc(2399) int local2399 = local24.anInt2392 + local108 + local860;
														@Pc(2404) int local2404 = local113 - local2227;
														@Pc(2412) int local2412 = local24.anInt2440 + local113 - local2227;
														@Pc(2419) int local2419 = local113 + local24.anInt2440 + local741;
														Static100.method1680(local2358, local926, local2387);
														Static100.method1682(local2391, local2404, local2412, local2358, local926, local2387, local24.anInt2387);
														Static100.method1680(local2358, local2387, local2399);
														Static100.method1682(local2391, local2412, local2419, local2358, local2387, local2399, local24.anInt2387);
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JI)V")
	public static void method1700(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static59.anInt1560 >= 100) {
			Static90.method1469(0, Static23.aClass60_253, Static14.aClass60_164);
			return;
		}
		@Pc(33) Class60 local33 = Static56.method885(arg0).method1322();
		for (@Pc(35) int local35 = 0; local35 < Static59.anInt1560; local35++) {
			if (Static26.aLongArray3[local35] == arg0) {
				Static90.method1469(0, Static23.aClass60_253, Static12.method1761(new Class60[] { local33, Static106.aClass60_981 }));
				return;
			}
		}
		for (@Pc(74) int local74 = 0; local74 < Static83.anInt1972; local74++) {
			if (arg0 == Static35.aLongArray4[local74]) {
				Static90.method1469(0, Static23.aClass60_253, Static12.method1761(new Class60[] { Static84.aClass60_825, local33, Static31.aClass60_311 }));
				return;
			}
		}
		if (local33.method1311(Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.aClass60_139)) {
			Static90.method1469(0, Static23.aClass60_253, Static106.aClass60_983);
		} else {
			Static26.aLongArray3[Static59.anInt1560++] = arg0;
			Static8.anInt94 = Static87.anInt2052;
			Static14.aClass4_Sub9_Sub1_1.method826(114);
			Static14.aClass4_Sub9_Sub1_1.method805(arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "(I)V")
	public static void method1701() {
		@Pc(10) int local10 = Static96.aClass4_Sub9_Sub1_2.method833(8);
		@Pc(19) int local19;
		if (local10 < Static125.anInt2830) {
			for (local19 = local10; local19 < Static125.anInt2830; local19++) {
				Static3.anIntArray5[Static21.anInt737++] = Static118.anIntArray336[local19];
			}
		}
		if (Static125.anInt2830 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static125.anInt2830 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(57) int local57 = Static118.anIntArray336[local19];
			@Pc(61) Class4_Sub3_Sub1_Sub2_Sub1 local61 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local57];
			@Pc(66) int local66 = Static96.aClass4_Sub9_Sub1_2.method833(1);
			if (local66 == 0) {
				Static118.anIntArray336[Static125.anInt2830++] = local57;
				local61.anInt1394 = Static118.anInt2741;
			} else {
				@Pc(89) int local89 = Static96.aClass4_Sub9_Sub1_2.method833(2);
				if (local89 == 0) {
					Static118.anIntArray336[Static125.anInt2830++] = local57;
					local61.anInt1394 = Static118.anInt2741;
					Static35.anIntArray97[Static9.anInt116++] = local57;
				} else {
					@Pc(136) int local136;
					@Pc(146) int local146;
					if (local89 == 1) {
						Static118.anIntArray336[Static125.anInt2830++] = local57;
						local61.anInt1394 = Static118.anInt2741;
						local136 = Static96.aClass4_Sub9_Sub1_2.method833(3);
						local61.method851(local136, false);
						local146 = Static96.aClass4_Sub9_Sub1_2.method833(1);
						if (local146 == 1) {
							Static35.anIntArray97[Static9.anInt116++] = local57;
						}
					} else if (local89 == 2) {
						Static118.anIntArray336[Static125.anInt2830++] = local57;
						local61.anInt1394 = Static118.anInt2741;
						local136 = Static96.aClass4_Sub9_Sub1_2.method833(3);
						local61.method851(local136, true);
						local146 = Static96.aClass4_Sub9_Sub1_2.method833(3);
						local61.method851(local146, true);
						@Pc(202) int local202 = Static96.aClass4_Sub9_Sub1_2.method833(1);
						if (local202 == 1) {
							Static35.anIntArray97[Static9.anInt116++] = local57;
						}
					} else if (local89 == 3) {
						Static3.anIntArray5[Static21.anInt737++] = local57;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method1702() {
		anIntArray309 = null;
		aClass60_954 = null;
		aClass12_23 = null;
		aClass12_24 = null;
	}
}
