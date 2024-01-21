import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!tb", name = "j", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!tb", name = "l", descriptor = "I")
	public static int anInt2573;

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "I")
	public static int anInt2579;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "Lclient!lf;")
	public static Class48 aClass48_52 = new Class48(64);

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1205 = Static56.method816("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!tb", name = "i", descriptor = "Lclient!m;")
	public static Class49 aClass49_10 = new Class49();

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1208 = Static56.method816("Please try again)3");

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1206 = aClass34_1208;

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	public static int anInt2574 = 0;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	public static int anInt2575 = 0;

	@OriginalMember(owner = "client!tb", name = "p", descriptor = "Lclient!ic;")
	private static Class34 aClass34_1207 = Static56.method816("Loading )2 please wait)3");

	@OriginalMember(owner = "client!tb", name = "s", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1209 = aClass34_1207;

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1210 = Static56.method816(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1211 = Static56.method816("Wordpack geladen)3");

	@OriginalMember(owner = "client!tb", name = "x", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1212 = Static56.method816(")2");

	@OriginalMember(owner = "client!tb", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_1213 = Static56.method816("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIIIIIII[Lclient!wf;)V")
	public static void method1613(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class8_Sub24[] arg8) {
		Static110.method1721(arg3, arg5, arg4, arg0);
		Static11.method178();
		for (@Pc(9) int local9 = 0; local9 < arg8.length; local9++) {
			@Pc(15) Class8_Sub24 local15 = arg8[local9];
			if (local15 != null && (local15.anInt3166 == arg2 || arg2 == -1412584499 && local15 == Static93.aClass8_Sub24_7)) {
				@Pc(68) int local68;
				if (arg6 == -1) {
					Static125.anIntArray395[Static133.anInt3069] = local15.anInt3093 + arg1;
					Static38.anIntArray131[Static133.anInt3069] = local15.anInt3107 + arg7;
					Static2.anIntArray3[Static133.anInt3069] = local15.anInt3154;
					Static6.anIntArray12[Static133.anInt3069] = local15.anInt3111;
					local68 = Static133.anInt3069++;
				} else {
					local68 = arg6;
				}
				local15.anInt3157 = local68;
				local15.anInt3169 = Static21.anInt655;
				if (!local15.aBoolean117 || !Static5.method38(local15)) {
					if (local15.anInt3143 > 0) {
						Static27.method496(local15);
					}
					@Pc(99) int local99 = local15.anInt3093 + arg1;
					@Pc(104) int local104 = arg7 + local15.anInt3107;
					@Pc(107) int local107 = local15.anInt3106;
					@Pc(130) int local130;
					@Pc(141) int local141;
					if (local15 == Static93.aClass8_Sub24_7) {
						if (arg2 != -1412584499 && !local15.aBoolean118) {
							Static93.anInt2210 = arg7;
							Static105.anInt2400 = arg1;
							Static78.aClass8_Sub24Array1 = arg8;
							continue;
						}
						if (Static20.aBoolean31 && Static24.aBoolean71) {
							local130 = Static14.anInt366;
							local130 -= Static96.anInt547;
							if (Static109.anInt2498 > local130) {
								local130 = Static109.anInt2498;
							}
							local141 = Static121.anInt2909;
							if (local15.anInt3154 + local130 > Static15.aClass8_Sub24_3.anInt3154 + Static109.anInt2498) {
								local130 = Static15.aClass8_Sub24_3.anInt3154 + Static109.anInt2498 - local15.anInt3154;
							}
							local141 -= Static68.anInt1678;
							local99 = local130;
							if (Static52.anInt1351 > local141) {
								local141 = Static52.anInt1351;
							}
							if (local15.anInt3111 + local141 > Static15.aClass8_Sub24_3.anInt3111 + Static52.anInt1351) {
								local141 = Static15.aClass8_Sub24_3.anInt3111 + Static52.anInt1351 - local15.anInt3111;
							}
							local104 = local141;
						}
						if (!local15.aBoolean118) {
							local107 = 128;
						}
					}
					@Pc(262) int local262;
					@Pc(255) int local255;
					@Pc(248) int local248;
					@Pc(243) int local243;
					@Pc(273) int local273;
					@Pc(279) int local279;
					if (local15.anInt3145 == 2) {
						local255 = arg0;
						local130 = arg3;
						local141 = arg5;
						local262 = arg4;
					} else if (local15.anInt3145 == 9) {
						local248 = local99;
						local243 = local104;
						local273 = local99 + local15.anInt3154;
						local279 = local104 + local15.anInt3111;
						if (local273 < local99) {
							local248 = local273;
							local273 = local99;
						}
						local130 = local248 > arg3 ? local248 : arg3;
						if (local279 < local104) {
							local243 = local279;
							local279 = local104;
						}
						local279++;
						local255 = arg0 > local279 ? local279 : arg0;
						local141 = local243 <= arg5 ? arg5 : local243;
						local273++;
						local262 = local273 >= arg4 ? arg4 : local273;
					} else {
						local130 = arg3 < local99 ? local99 : arg3;
						local141 = arg5 >= local104 ? arg5 : local104;
						local243 = local104 + local15.anInt3111;
						local248 = local15.anInt3154 + local99;
						local255 = arg0 > local243 ? local243 : arg0;
						local262 = arg4 <= local248 ? arg4 : local248;
					}
					if (!local15.aBoolean117 || local130 < local262 && local141 < local255) {
						if (local15.anInt3143 != 0) {
							if (local15.anInt3143 == 1337) {
								Static21.anInt639 = local104;
								Static30.anInt844 = local99;
								Static97.method1363(local15.anInt3111, local104, local99, local15.anInt3154);
								Static110.method1721(arg3, arg5, arg4, arg0);
								continue;
							}
							if (local15.anInt3143 == 1338) {
								Static54.method780(local68, local104, local99);
								Static110.method1721(arg3, arg5, arg4, arg0);
								continue;
							}
						}
						local248 = Static14.anInt366;
						local243 = Static121.anInt2909;
						if (!Static90.aBoolean14 && local248 >= local130 && local141 <= local243 && local262 > local248 && local255 > local243) {
							Static57.method896(local243 - local104, -local99 + local248, local15);
						}
						if (local15.anInt3145 == 0) {
							if (!local15.aBoolean117 && Static5.method38(local15) && local15 != Static15.aClass8_Sub24_4) {
								continue;
							}
							if (!local15.aBoolean117) {
								if (local15.anInt3151 - local15.anInt3111 < local15.anInt3103) {
									local15.anInt3103 = local15.anInt3151 - local15.anInt3111;
								}
								if (local15.anInt3103 < 0) {
									local15.anInt3103 = 0;
								}
							}
							method1613(local255, local99 - local15.anInt3115, local15.anInt3124, local130, local262, local141, local68, local104 - local15.anInt3103, arg8);
							if (local15.aClass8_Sub24Array2 != null) {
								method1613(local255, local99 - local15.anInt3115, local15.anInt3124, local130, local262, local141, local68, local104 - local15.anInt3103, local15.aClass8_Sub24Array2);
							}
							@Pc(539) Class8_Sub7 local539 = (Class8_Sub7) Static31.aClass7_3.method45((long) local15.anInt3124);
							if (local539 != null) {
								if (local539.anInt953 == 0 && local130 <= Static14.anInt366 && local141 <= Static121.anInt2909 && local262 > Static14.anInt366 && Static121.anInt2909 < local255 && !Static90.aBoolean14 && !Static33.aBoolean42) {
									Static96.anInt552 = 1;
									Static50.anIntArray166[0] = 1006;
									Static61.aClass34Array11[0] = Static62.aClass34_759;
									Static6.aClass34Array3[0] = Static36.aClass34_504;
								}
								Static33.method550(local141, local104, local68, local99, local130, local262, local539.anInt954, local255);
							}
							Static110.method1721(arg3, arg5, arg4, arg0);
							Static11.method178();
						}
						if (Static47.aBooleanArray8[local68] || Static82.anInt1973 > 1) {
							if (local15.anInt3145 == 0 && !local15.aBoolean117 && local15.anInt3111 < local15.anInt3151) {
								Static124.method1965(local104, local15.anInt3151, local15.anInt3103, local15.anInt3154 + local99, local15.anInt3111);
							}
							if (local15.anInt3145 != 1) {
								@Pc(658) int local658;
								@Pc(669) int local669;
								@Pc(834) int local834;
								@Pc(742) int local742;
								@Pc(884) int local884;
								@Pc(886) int local886;
								@Pc(910) int local910;
								@Pc(678) int local678;
								@Pc(829) int local829;
								if (local15.anInt3145 == 2) {
									local273 = 0;
									for (local279 = 0; local279 < local15.anInt3111; local279++) {
										for (local658 = 0; local658 < local15.anInt3154; local658++) {
											local669 = (local15.anInt3127 + 32) * local658 + local99;
											local678 = local279 * (local15.anInt3161 + 32) + local104;
											if (local273 < 20) {
												local669 += local15.anIntArray409[local273];
												local678 += local15.anIntArray418[local273];
											}
											if (local15.anIntArray414[local273] > 0) {
												local742 = local15.anIntArray414[local273] - 1;
												if (arg3 < local669 + 32 && local669 < arg4 && arg5 < local678 + 32 && arg0 > local678 || local15 == Static115.aClass8_Sub24_10 && Static86.anInt2181 == local273) {
													@Pc(799) Class8_Sub1_Sub3_Sub3 local799;
													if (Static88.anInt2340 == 1 && Static23.anInt712 == local273 && Static120.anInt2878 == local15.anInt3124) {
														local799 = Static40.method606(0, false, 2, local15.anIntArray410[local273], local742);
													} else {
														local799 = Static40.method606(3153952, false, 1, local15.anIntArray410[local273], local742);
													}
													if (local799 == null) {
														Static40.method608(local15);
													} else if (Static115.aClass8_Sub24_10 == local15 && local273 == Static86.anInt2181) {
														local829 = Static14.anInt366 - Static86.anInt2180;
														local834 = Static121.anInt2909 - Static60.anInt1579;
														if (local829 < 5 && local829 > -5) {
															local829 = 0;
														}
														if (local834 < 5 && local834 > -5) {
															local834 = 0;
														}
														if (Static27.anInt796 < 5) {
															local829 = 0;
															local834 = 0;
														}
														local799.method1575(local669 + local829, local834 + local678, 128);
														if (arg2 != -1) {
															@Pc(882) Class8_Sub24 local882 = arg8[arg2 & 0xFFFF];
															local884 = Static110.anInt2718;
															local886 = Static110.anInt2715;
															if (local884 > local678 + local834 && local882.anInt3103 > 0) {
																local910 = (local884 - local834 - local678) * Static69.anInt1683 / 3;
																if (local910 > Static69.anInt1683 * 10) {
																	local910 = Static69.anInt1683 * 10;
																}
																if (local882.anInt3103 < local910) {
																	local910 = local882.anInt3103;
																}
																local882.anInt3103 -= local910;
																Static60.anInt1579 += local910;
																Static40.method608(local882);
															}
															if (local678 + local834 + 32 > local886 && local882.anInt3151 - local882.anInt3111 > local882.anInt3103) {
																local910 = (local678 + local834 + 32 - local886) * Static69.anInt1683 / 3;
																if (local910 > Static69.anInt1683 * 10) {
																	local910 = Static69.anInt1683 * 10;
																}
																if (local882.anInt3151 - local882.anInt3103 - local882.anInt3111 < local910) {
																	local910 = local882.anInt3151 - local882.anInt3111 - local882.anInt3103;
																}
																local882.anInt3103 += local910;
																Static60.anInt1579 -= local910;
																Static40.method608(local882);
															}
														}
													} else if (local15 == Static123.aClass8_Sub24_15 && Static75.anInt1806 == local273) {
														local799.method1575(local669, local678, 128);
													} else {
														local799.method1587(local669, local678);
													}
												}
											} else if (local15.anIntArray412 != null && local273 < 20) {
												@Pc(716) Class8_Sub1_Sub3_Sub3 local716 = local15.method2018(local273);
												if (local716 != null) {
													local716.method1587(local669, local678);
												} else if (Static126.aBoolean92) {
													Static40.method608(local15);
												}
											}
											local273++;
										}
									}
								} else if (local15.anInt3145 == 3) {
									if (Static17.method260(local15)) {
										local273 = local15.anInt3135;
										if (local15 == Static15.aClass8_Sub24_4 && local15.anInt3120 != 0) {
											local273 = local15.anInt3120;
										}
									} else {
										local273 = local15.anInt3110;
										if (local15 == Static15.aClass8_Sub24_4 && local15.anInt3171 != 0) {
											local273 = local15.anInt3171;
										}
									}
									if (local107 == 0) {
										if (local15.aBoolean123) {
											Static110.method1729(local99, local104, local15.anInt3154, local15.anInt3111, local273);
										} else {
											Static110.method1738(local99, local104, local15.anInt3154, local15.anInt3111, local273);
										}
									} else if (local15.aBoolean123) {
										Static110.method1735(local99, local104, local15.anInt3154, local15.anInt3111, local273, 256 - (local107 & 0xFF));
									} else {
										Static110.method1725(local99, local104, local15.anInt3154, local15.anInt3111, local273, 256 - (local107 & 0xFF));
									}
								} else {
									@Pc(1164) Class8_Sub1_Sub3_Sub4_Sub1 local1164;
									if (local15.anInt3145 == 4) {
										local1164 = local15.method2025();
										if (local1164 != null) {
											@Pc(1176) Class34 local1176 = local15.aClass34_1437;
											if (Static17.method260(local15)) {
												local279 = local15.anInt3135;
												if (local15 == Static15.aClass8_Sub24_4 && local15.anInt3120 != 0) {
													local279 = local15.anInt3120;
												}
												if (local15.aClass34_1436.method820() > 0) {
													local1176 = local15.aClass34_1436;
												}
											} else {
												local279 = local15.anInt3110;
												if (Static15.aClass8_Sub24_4 == local15 && local15.anInt3171 != 0) {
													local279 = local15.anInt3171;
												}
											}
											if (local15.aBoolean117 && local15.anInt3131 != -1) {
												@Pc(1232) Class8_Sub1_Sub13 local1232 = Static7.method49(local15.anInt3131);
												local1176 = local1232.aClass34_812;
												if (local1176 == null) {
													local1176 = Static97.aClass34_1056;
												}
												if ((local1232.anInt1752 == 1 || local15.anInt3146 != 1) && local15.anInt3146 != -1) {
													local1176 = Static44.method669(new Class34[] { Static111.aClass34_1398, local1176, Static106.aClass34_1143, Static59.method924(local15.anInt3146) });
												}
											}
											if (Static126.aClass8_Sub24_8 == local15) {
												local279 = local15.anInt3110;
												local1176 = Static70.aClass34_797;
											}
											if (!local15.aBoolean117) {
												local1176 = Static30.method525(local15, local1176);
											}
											local1164.method1763(local1176, local99, local104, local15.anInt3154, local15.anInt3111, local279, local15.aBoolean113 ? 0 : -1, local15.anInt3132, local15.anInt3121, local15.anInt3149);
										} else if (Static126.aBoolean92) {
											Static40.method608(local15);
										}
									} else if (local15.anInt3145 == 5) {
										@Pc(1332) Class8_Sub1_Sub3_Sub3 local1332;
										if (local15.aBoolean117) {
											if (local15.anInt3131 == -1) {
												local1332 = local15.method2015(false);
											} else {
												local1332 = Static40.method606(local15.anInt3150, false, local15.anInt3141, local15.anInt3146, local15.anInt3131);
											}
											if (local1332 != null) {
												local279 = local1332.anInt2534;
												local658 = local1332.anInt2536;
												if (local15.aBoolean122) {
													Static110.method1733(local99, local104, local15.anInt3154 + local99, local15.anInt3111 + local104);
													local669 = (local279 + local15.anInt3154 - 1) / local279;
													local678 = (local658 + local15.anInt3111 - 1) / local658;
													for (local829 = 0; local829 < local669; local829++) {
														for (local834 = 0; local834 < local678; local834++) {
															if (local15.anInt3152 != 0) {
																local1332.method1592(local279 * local829 + local99 + local279 / 2, local834 * local658 + (local104 - -(local658 / 2)), local15.anInt3152, 4096);
															} else if (local107 == 0) {
																local1332.method1587(local99 + local279 * local829, local104 + local658 * local834);
															} else {
																local1332.method1575(local279 * local829 + local99, local658 * local834 + local104, 256 - (local107 & 0xFF));
															}
														}
													}
													Static110.method1721(arg3, arg5, arg4, arg0);
												} else {
													local669 = local15.anInt3154 * 4096 / local279;
													if (local15.anInt3152 != 0) {
														local1332.method1592(local99 + local15.anInt3154 / 2, local104 + local15.anInt3111 / 2, local15.anInt3152, local669);
													} else if (local107 != 0) {
														local1332.method1577(local99, local104, local15.anInt3154, local15.anInt3111, 256 - (local107 & 0xFF));
													} else if (local279 == local15.anInt3154 && local658 == local15.anInt3111) {
														local1332.method1587(local99, local104);
													} else {
														local1332.method1578(local99, local104, local15.anInt3154, local15.anInt3111);
													}
												}
											} else if (Static126.aBoolean92) {
												Static40.method608(local15);
											}
										} else {
											local1332 = local15.method2015(Static17.method260(local15));
											if (local1332 != null) {
												local1332.method1587(local99, local104);
											} else if (Static126.aBoolean92) {
												Static40.method608(local15);
											}
										}
									} else {
										@Pc(1687) Class8_Sub1_Sub13 local1687;
										if (local15.anInt3145 == 6) {
											@Pc(1596) Class8_Sub1_Sub1_Sub6 local1596 = null;
											@Pc(1600) boolean local1600 = Static17.method260(local15);
											local669 = 0;
											if (local1600) {
												local279 = local15.anInt3105;
											} else {
												local279 = local15.anInt3144;
											}
											if (local15.anInt3131 != -1) {
												local1687 = Static7.method49(local15.anInt3131);
												if (local1687 != null) {
													local1687 = local1687.method1079(local15.anInt3146);
													local1596 = local1687.method1072(1);
													if (local1596 == null) {
														Static40.method608(local15);
													} else {
														local1596.method1269();
														local669 = local1596.anInt2957 / 2;
													}
												}
											} else if (local15.anInt3116 == 5) {
												if (local15.anInt3133 == 0) {
													local1596 = Static134.aClass52_2.method1203(-1, -1, null, null);
												} else {
													local1596 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1955();
												}
											} else if (local279 == -1) {
												local1596 = local15.method2021(-1, local1600, null, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass52_1);
												if (local1596 == null && Static126.aBoolean92) {
													Static40.method608(local15);
												}
											} else {
												@Pc(1647) Class8_Sub1_Sub6 local1647 = Static47.method733(local279);
												local1596 = local15.method2021(local15.anInt3147, local1600, local1647, Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass52_1);
												if (local1596 == null && Static126.aBoolean92) {
													Static40.method608(local15);
												}
											}
											Static11.method181(local15.anInt3154 / 2 + local99 + local15.anInt3102, local15.anInt3167 + local15.anInt3111 / 2 + local104);
											local678 = Class8_Sub1_Sub3_Sub1.anIntArray38[local15.anInt3101] * local15.anInt3095 >> 16;
											local829 = Class8_Sub1_Sub3_Sub1.anIntArray40[local15.anInt3101] * local15.anInt3095 >> 16;
											if (local1596 != null) {
												if (local15.aBoolean117) {
													local1596.method1269();
													if (local15.aBoolean121) {
														local1596.method1280(local15.anInt3160, local15.anInt3098, local15.anInt3101, local15.anInt3148, local669 + local678 + local15.anInt3129, local15.anInt3129 + local829, local15.anInt3095);
													} else {
														local1596.method1279(local15.anInt3160, local15.anInt3098, local15.anInt3101, local15.anInt3148, local15.anInt3129 + local669 + local678, local15.anInt3129 + local829);
													}
												} else {
													local1596.method1279(local15.anInt3160, 0, local15.anInt3101, 0, local678, local829);
												}
											}
											Static11.method173();
										} else {
											if (local15.anInt3145 == 7) {
												local1164 = local15.method2025();
												if (local1164 == null) {
													if (Static126.aBoolean92) {
														Static40.method608(local15);
													}
													continue;
												}
												local279 = 0;
												for (local658 = 0; local658 < local15.anInt3111; local658++) {
													for (local669 = 0; local669 < local15.anInt3154; local669++) {
														if (local15.anIntArray414[local279] > 0) {
															local1687 = Static7.method49(local15.anIntArray414[local279] - 1);
															@Pc(1910) Class34 local1910;
															if (local1687.anInt1752 != 1 && local15.anIntArray410[local279] == 1) {
																local1910 = Static44.method669(new Class34[] { Static111.aClass34_1398, local1687.aClass34_812, Static132.aClass34_1318 });
															} else {
																local1910 = Static44.method669(new Class34[] { Static111.aClass34_1398, local1687.aClass34_812, Static106.aClass34_1143, Static59.method924(local15.anIntArray410[local279]) });
															}
															local742 = local104 + local658 * (local15.anInt3161 + 12);
															local834 = (local15.anInt3127 + 115) * local669 + local99;
															if (local15.anInt3132 == 0) {
																local1164.method1741(local1910, local834, local742, local15.anInt3110, local15.aBoolean113 ? 0 : -1);
															} else if (local15.anInt3132 == 1) {
																local1164.method1753(local1910, local834 + local15.anInt3154 / 2, local742, local15.anInt3110, local15.aBoolean113 ? 0 : -1);
															} else {
																local1164.method1742(local1910, local15.anInt3154 + local834 - 1, local742, local15.anInt3110, local15.aBoolean113 ? 0 : -1);
															}
														}
														local279++;
													}
												}
											}
											@Pc(2194) int local2194;
											if (local15.anInt3145 == 8 && local15 == Static123.aClass8_Sub24_14 && Static3.anInt50 == Static78.anInt1854) {
												local273 = 0;
												@Pc(2045) Class8_Sub1_Sub3_Sub4_Sub1 local2045 = Static81.aClass8_Sub1_Sub3_Sub4_Sub1_3;
												local279 = 0;
												@Pc(2050) Class34 local2050 = local15.aClass34_1437;
												local2050 = Static30.method525(local15, local2050);
												@Pc(2072) Class34 local2072;
												while (local2050.method820() > 0) {
													local829 = local2050.method818(Static20.aClass34_302);
													if (local829 == -1) {
														local2072 = local2050;
														local2050 = Static36.aClass34_504;
													} else {
														local2072 = local2050.method810(local829, 0);
														local2050 = local2050.method835(local829 + 4);
													}
													local834 = local2045.method1766(local2072);
													local279 += local2045.anInt2723 + 1;
													if (local273 < local834) {
														local273 = local834;
													}
												}
												local273 += 6;
												local279 += 7;
												local829 = local15.anInt3154 + local99 - local273 - 5;
												if (local99 + 5 > local829) {
													local829 = local99 + 5;
												}
												if (arg4 < local829 + local273) {
													local829 = arg4 - local273;
												}
												local834 = local15.anInt3111 + local104 + 5;
												if (local279 + local834 > arg0) {
													local834 = arg0 - local279;
												}
												Static110.method1729(local829, local834, local273, local279, 16777120);
												Static110.method1738(local829, local834, local273, local279, 0);
												local742 = local2045.anInt2723 + local834 + 2;
												local2050 = local15.aClass34_1437;
												local2050 = Static30.method525(local15, local2050);
												while (local2050.method820() > 0) {
													local2194 = local2050.method818(Static20.aClass34_302);
													if (local2194 == -1) {
														local2072 = local2050;
														local2050 = Static36.aClass34_504;
													} else {
														local2072 = local2050.method810(local2194, 0);
														local2050 = local2050.method835(local2194 + 4);
													}
													local2045.method1741(local2072, local829 + 3, local742, 0, -1);
													local742 += local2045.anInt2723 + 1;
												}
											}
											if (local15.anInt3145 == 9) {
												if (local15.anInt3162 == 1) {
													Static110.method1724(local99, local104, local15.anInt3154 + local99, local15.anInt3111 + local104, local15.anInt3110);
												} else {
													local273 = local15.anInt3154 < 0 ? -local15.anInt3154 : local15.anInt3154;
													local279 = local15.anInt3111 < 0 ? -local15.anInt3111 : local15.anInt3111;
													local658 = local273;
													if (local273 < local279) {
														local658 = local279;
													}
													if (local658 != 0) {
														local678 = (local15.anInt3111 << 16) / local658;
														local669 = (local15.anInt3154 << 16) / local658;
														if (local669 >= local678) {
															local669 = -local669;
														} else {
															local678 = -local678;
														}
														local742 = local15.anInt3162 * local669 >> 17;
														local2194 = local669 * local15.anInt3162 + 1 >> 17;
														local834 = local678 * local15.anInt3162 + 1 >> 17;
														local829 = local678 * local15.anInt3162 >> 17;
														@Pc(2353) int local2353 = local99 - arg3;
														local884 = local104 - arg5;
														local910 = local2353 - local834;
														local886 = local829 + local2353;
														@Pc(2375) int local2375 = local2353 + local15.anInt3154 - local834;
														@Pc(2382) int local2382 = local829 + local15.anInt3154 + local2353;
														@Pc(2387) int local2387 = local884 + local742;
														@Pc(2391) int local2391 = local884 - local2194;
														@Pc(2399) int local2399 = local15.anInt3111 + local884 - local2194;
														@Pc(2406) int local2406 = local742 + local15.anInt3111 + local884;
														Static11.method177(local886, local910, local2375);
														Static11.method182(local2387, local2391, local2399, local886, local910, local2375, local15.anInt3110);
														Static11.method177(local886, local2375, local2382);
														Static11.method182(local2387, local2399, local2406, local886, local2375, local2382, local15.anInt3110);
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

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)Lclient!wf;")
	public static Class8_Sub24 method1614(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static44.aClass8_Sub24ArrayArray1[local12] == null || Static44.aClass8_Sub24ArrayArray1[local12][local16] == null) {
			@Pc(30) boolean local30 = Static100.method1458(local12);
			if (!local30) {
				return null;
			}
		}
		return Static44.aClass8_Sub24ArrayArray1[local12][local16];
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public static void method1615() {
		aClass34_1208 = null;
		aClass34_1212 = null;
		aByteArrayArrayArray7 = null;
		aClass34_1213 = null;
		aClass49_10 = null;
		aClass34_1209 = null;
		aClass34_1206 = null;
		aClass48_52 = null;
		aClass34_1210 = null;
		aClass34_1205 = null;
		aClass34_1207 = null;
		aClass34_1211 = null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!jf;I)V")
	public static void method1616(@OriginalArg(0) Class8_Sub1_Sub1_Sub4 arg0) {
		arg0.anInt2010 = arg0.anInt2063;
		if (arg0.anInt2032 == 0) {
			arg0.anInt2020 = 0;
			return;
		}
		if (arg0.anInt2009 != -1 && arg0.anInt2027 == 0) {
			@Pc(31) Class8_Sub1_Sub6 local31 = Static47.method733(arg0.anInt2009);
			if (arg0.anInt2005 > 0 && local31.anInt718 == 0) {
				arg0.anInt2020++;
				return;
			}
			if (arg0.anInt2005 <= 0 && local31.anInt708 == 0) {
				arg0.anInt2020++;
				return;
			}
		}
		@Pc(72) int local72 = arg0.anInt2043;
		@Pc(80) int local80 = arg0.anInt2059;
		@Pc(96) int local96 = arg0.anIntArray260[arg0.anInt2032 - 1] * 128 + arg0.anInt2030 * 64;
		@Pc(111) int local111 = arg0.anInt2030 * 64 + arg0.anIntArray262[arg0.anInt2032 - 1] * 128;
		if (local111 - local72 > 256 || local111 - local72 < -256 || local96 - local80 > 256 || local96 - local80 < -256) {
			arg0.anInt2043 = local111;
			arg0.anInt2059 = local96;
			return;
		}
		if (local111 <= local72) {
			if (local111 < local72) {
				if (local96 > local80) {
					arg0.anInt2022 = 768;
				} else if (local80 <= local96) {
					arg0.anInt2022 = 512;
				} else {
					arg0.anInt2022 = 256;
				}
			} else if (local80 < local96) {
				arg0.anInt2022 = 1024;
			} else if (local96 < local80) {
				arg0.anInt2022 = 0;
			}
		} else if (local80 < local96) {
			arg0.anInt2022 = 1280;
		} else if (local96 >= local80) {
			arg0.anInt2022 = 1536;
		} else {
			arg0.anInt2022 = 1792;
		}
		@Pc(243) int local243 = arg0.anInt2022 - arg0.anInt2038 & 0x7FF;
		@Pc(246) int local246 = arg0.anInt2031;
		if (local243 > 1024) {
			local243 -= 2048;
		}
		if (local243 >= -256 && local243 <= 256) {
			local246 = arg0.anInt2054;
		} else if (local243 >= 256 && local243 < 768) {
			local246 = arg0.anInt2016;
		} else if (local243 >= -768 && local243 <= -256) {
			local246 = arg0.anInt2056;
		}
		@Pc(291) int local291 = 4;
		if (local246 == -1) {
			local246 = arg0.anInt2054;
		}
		arg0.anInt2010 = local246;
		@Pc(303) boolean local303 = true;
		if (arg0 instanceof Class8_Sub1_Sub1_Sub4_Sub2) {
			local303 = ((Class8_Sub1_Sub1_Sub4_Sub2) arg0).aClass8_Sub1_Sub16_1.aBoolean96;
		}
		if (local303) {
			if (arg0.anInt2022 != arg0.anInt2038 && arg0.anInt2029 == -1 && arg0.anInt2028 != 0) {
				local291 = 2;
			}
			if (arg0.anInt2032 > 2) {
				local291 = 6;
			}
			if (arg0.anInt2032 > 3) {
				local291 = 8;
			}
			if (arg0.anInt2020 > 0 && arg0.anInt2032 > 1) {
				local291 = 8;
				arg0.anInt2020--;
			}
		} else {
			if (arg0.anInt2032 > 1) {
				local291 = 6;
			}
			if (arg0.anInt2032 > 2) {
				local291 = 8;
			}
			if (arg0.anInt2020 > 0 && arg0.anInt2032 > 1) {
				local291 = 8;
				arg0.anInt2020--;
			}
		}
		if (arg0.aBooleanArray13[arg0.anInt2032 - 1]) {
			local291 <<= 0x1;
		}
		if (local111 > local72) {
			arg0.anInt2043 += local291;
			if (local111 < arg0.anInt2043) {
				arg0.anInt2043 = local111;
			}
		} else if (local111 < local72) {
			arg0.anInt2043 -= local291;
			if (arg0.anInt2043 < local111) {
				arg0.anInt2043 = local111;
			}
		}
		if (local80 < local96) {
			arg0.anInt2059 += local291;
			if (local96 < arg0.anInt2059) {
				arg0.anInt2059 = local96;
			}
		} else if (local80 > local96) {
			arg0.anInt2059 -= local291;
			if (local96 > arg0.anInt2059) {
				arg0.anInt2059 = local96;
			}
		}
		if (local291 >= 8 && arg0.anInt2054 == arg0.anInt2010 && arg0.anInt2034 != -1) {
			arg0.anInt2010 = arg0.anInt2034;
		}
		if (local111 == arg0.anInt2043 && local96 == arg0.anInt2059) {
			if (arg0.anInt2005 > 0) {
				arg0.anInt2005--;
			}
			arg0.anInt2032--;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IB)Lclient!ic;")
	public static Class34 method1617(@OriginalArg(0) int arg0) {
		return arg0 < 999999999 ? Static44.method672(arg0) : Static47.aClass34_637;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!dd;II)Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2 method1619(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) int arg2) {
		return Static134.method2026(arg2, arg0, arg1) ? Static75.method1094() : null;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "([Lclient!ic;Z)[Lclient!ic;")
	public static Class34[] method1620(@OriginalArg(0) Class34[] arg0) {
		@Pc(2) Class34[] local2 = new Class34[5];
		for (@Pc(8) int local8 = 0; local8 < 5; local8++) {
			local2[local8] = Static44.method669(new Class34[] { Static44.method672(local8), Static22.aClass34_1199 });
			if (arg0 != null && arg0[local8] != null) {
				local2[local8] = Static44.method669(new Class34[] { local2[local8], arg0[local8] });
			}
		}
		return local2;
	}
}
