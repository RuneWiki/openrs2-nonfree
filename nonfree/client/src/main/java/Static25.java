import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!ch", name = "I", descriptor = "I")
	public static int anInt621;

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_20;

	@OriginalMember(owner = "client!ch", name = "z", descriptor = "I")
	public static int anInt614 = 0;

	@OriginalMember(owner = "client!ch", name = "D", descriptor = "Lclient!db;")
	public static Class20 aClass20_1 = new Class20(32);

	@OriginalMember(owner = "client!ch", name = "E", descriptor = "I")
	public static int anInt617 = 0;

	@OriginalMember(owner = "client!ch", name = "H", descriptor = "I")
	public static int anInt620 = 0;

	@OriginalMember(owner = "client!ch", name = "K", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_205 = Static177.method3050("::gc");

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_207 = Static177.method3050("Started 3d library");

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "Lclient!jd;")
	public static Class46 aClass46_206 = aClass46_207;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	public static int anInt622 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ZIII[Lclient!a;IIIII)V")
	public static void method414(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static145.method2932(arg1, arg6, arg2, arg4);
		Static171.method2952();
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(21) Class1 local21 = arg3[local13];
			if (local21 != null && (local21.anInt24 == arg8 || arg8 == -1412584499 && local21 == Static6.aClass1_2)) {
				@Pc(76) int local76;
				if (arg7 == -1) {
					Static121.anIntArray275[Static59.anInt1457] = local21.anInt43 + arg0;
					Static167.anIntArray362[Static59.anInt1457] = local21.anInt8 + arg5;
					Static66.anIntArray165[Static59.anInt1457] = local21.anInt50;
					Static180.anIntArray432[Static59.anInt1457] = local21.anInt20;
					local76 = Static59.anInt1457++;
				} else {
					local76 = arg7;
				}
				local21.anInt27 = local76;
				local21.anInt73 = Static142.anInt3325;
				if (!local21.aBoolean8 || !Static94.method1843(local21)) {
					if (local21.anInt62 > 0) {
						Static117.method2136(local21);
					}
					@Pc(104) int local104 = arg0 + local21.anInt43;
					@Pc(107) int local107 = local21.anInt68;
					@Pc(112) int local112 = arg5 + local21.anInt8;
					@Pc(137) int local137;
					@Pc(172) int local172;
					if (local21 == Static6.aClass1_2) {
						if (arg8 != -1412584499 && !local21.aBoolean7) {
							Static165.aClass1Array2 = arg3;
							anInt621 = arg5;
							Static165.anInt3639 = arg0;
							continue;
						}
						if (Static32.aBoolean41 && Static13.aBoolean24) {
							local137 = anInt620;
							local137 -= Static141.anInt3281;
							if (local137 < Static143.anInt3335) {
								local137 = Static143.anInt3335;
							}
							if (local21.anInt50 + local137 > Static27.aClass1_10.anInt50 + Static143.anInt3335) {
								local137 = Static27.aClass1_10.anInt50 + Static143.anInt3335 - local21.anInt50;
							}
							local104 = local137;
							local172 = Static169.anInt3778;
							local172 -= Static128.anInt3049;
							if (local172 < Static88.anInt2260) {
								local172 = Static88.anInt2260;
							}
							if (Static27.aClass1_10.anInt20 + Static88.anInt2260 < local172 + local21.anInt20) {
								local172 = Static27.aClass1_10.anInt20 + Static88.anInt2260 - local21.anInt20;
							}
							local112 = local172;
						}
						if (!local21.aBoolean7) {
							local107 = 128;
						}
					}
					@Pc(228) int local228;
					@Pc(226) int local226;
					@Pc(236) int local236;
					@Pc(238) int local238;
					@Pc(243) int local243;
					@Pc(257) int local257;
					if (local21.anInt7 == 2) {
						local137 = arg1;
						local172 = arg6;
						local226 = arg4;
						local228 = arg2;
					} else if (local21.anInt7 == 9) {
						local236 = local104;
						local238 = local112;
						local243 = local104 + local21.anInt50;
						if (local104 > local243) {
							local236 = local243;
							local243 = local104;
						}
						local257 = local21.anInt20 + local112;
						if (local257 < local112) {
							local238 = local257;
							local257 = local112;
						}
						local257++;
						local226 = arg4 <= local257 ? arg4 : local257;
						local137 = arg1 >= local236 ? arg1 : local236;
						local243++;
						local172 = local238 > arg6 ? local238 : arg6;
						local228 = local243 >= arg2 ? arg2 : local243;
					} else {
						local172 = local112 > arg6 ? local112 : arg6;
						local236 = local21.anInt50 + local104;
						local228 = arg2 > local236 ? local236 : arg2;
						local137 = arg1 < local104 ? local104 : arg1;
						local238 = local112 + local21.anInt20;
						local226 = arg4 <= local238 ? arg4 : local238;
					}
					if (!local21.aBoolean8 || local228 > local137 && local172 < local226) {
						if (local21.anInt62 != 0) {
							if (local21.anInt62 == 1337) {
								Static123.anInt2971 = local104;
								Static175.anInt3926 = local112;
								Static22.method390(local21.anInt20, local21.anInt50, local104, local112);
								Static145.method2932(arg1, arg6, arg2, arg4);
								continue;
							}
							if (local21.anInt62 == 1338) {
								if (local21.method14()) {
									Static154.method3134(local21, local104, local76, local112);
									Static145.method2932(arg1, arg6, arg2, arg4);
								}
								continue;
							}
							if (local21.anInt62 == 1339) {
								if (local21.method14()) {
									Static182.method3125(local104, local76, local112, local21);
									Static145.method2932(arg1, arg6, arg2, arg4);
								}
								continue;
							}
						}
						local238 = Static169.anInt3778;
						local236 = anInt620;
						if (!Static64.aBoolean76 && local137 <= local236 && local172 <= local238 && local228 > local236 && local226 > local238) {
							Static33.method568(local236 - local104, local21, local238 - local112);
						}
						if (local21.anInt7 == 0) {
							if (!local21.aBoolean8 && Static94.method1843(local21) && local21 != Static102.aClass1_31) {
								continue;
							}
							if (!local21.aBoolean8) {
								if (local21.anInt42 - local21.anInt20 < local21.anInt32) {
									local21.anInt32 = local21.anInt42 - local21.anInt20;
								}
								if (local21.anInt32 < 0) {
									local21.anInt32 = 0;
								}
							}
							method414(local104 - local21.anInt18, local137, local228, arg3, local226, local112 - local21.anInt32, local172, local76, local21.anInt53);
							if (local21.aClass1Array1 != null) {
								method414(local104 - local21.anInt18, local137, local228, local21.aClass1Array1, local226, local112 - local21.anInt32, local172, local76, local21.anInt53);
							}
							@Pc(567) Class4_Sub14 local567 = (Class4_Sub14) Static106.aClass20_5.method505((long) local21.anInt53);
							if (local567 != null) {
								if (local567.anInt2444 == 0 && local137 <= anInt620 && Static169.anInt3778 >= local172 && local228 > anInt620 && Static169.anInt3778 < local226 && !Static64.aBoolean76 && !Static120.aBoolean150) {
									Static3.anInt86 = 1;
									Static11.aShortArray5[0] = 1003;
									Static83.aClass46Array15[0] = Static93.aClass46_863;
									Static166.aClass46Array24[0] = Static3.aClass46_44;
								}
								Static83.method1678(local112, local226, local567.anInt2450, local228, local137, local104, local172, local76);
							}
							Static145.method2932(arg1, arg6, arg2, arg4);
							Static171.method2952();
						}
						if (Static153.aBooleanArray14[local76] || Static127.anInt3025 > 1) {
							if (local21.anInt7 == 0 && !local21.aBoolean8 && local21.anInt42 > local21.anInt20) {
								Static134.method2347(local21.anInt20, local112, local21.anInt42, local21.anInt50 + local104, local21.anInt32);
							}
							if (local21.anInt7 != 1) {
								@Pc(677) int local677;
								@Pc(688) int local688;
								@Pc(854) int local854;
								@Pc(736) int local736;
								@Pc(904) int local904;
								@Pc(906) int local906;
								@Pc(931) int local931;
								@Pc(698) int local698;
								@Pc(850) int local850;
								if (local21.anInt7 == 2) {
									local243 = 0;
									for (local257 = 0; local257 < local21.anInt20; local257++) {
										for (local677 = 0; local677 < local21.anInt50; local677++) {
											local688 = local104 + local677 * (local21.anInt36 + 32);
											local698 = local257 * (local21.anInt31 + 32) + local112;
											if (local243 < 20) {
												local688 += local21.anIntArray4[local243];
												local698 += local21.anIntArray3[local243];
											}
											if (local21.anIntArray11[local243] > 0) {
												local736 = local21.anIntArray11[local243] - 1;
												if (local688 + 32 > arg1 && local688 < arg2 && arg6 < local698 + 32 && local698 < arg4 || local21 == Static103.aClass1_32 && local243 == Static156.anInt3535) {
													@Pc(797) Class4_Sub1_Sub7_Sub2 local797;
													if (Static53.anInt1331 == 1 && local243 == Static1.anInt54 && local21.anInt53 == Static28.anInt745) {
														local797 = Static169.method2885(local736, 2, 0, local21.anIntArray2[local243], false);
													} else {
														local797 = Static169.method2885(local736, 1, 3153952, local21.anIntArray2[local243], false);
													}
													if (local797 == null) {
														Static3.method21(local21);
													} else if (Static103.aClass1_32 == local21 && Static156.anInt3535 == local243) {
														local850 = anInt620 - Static101.anInt2575;
														local854 = Static169.anInt3778 - Static154.anInt4090;
														if (local850 < 5 && local850 > -5) {
															local850 = 0;
														}
														if (local854 < 5 && local854 > -5) {
															local854 = 0;
														}
														if (Static61.anInt1638 < 5) {
															local850 = 0;
															local854 = 0;
														}
														local797.method2550(local850 + local688, local698 - -local854, 128);
														if (arg8 != -1) {
															@Pc(902) Class1 local902 = arg3[arg8 & 0xFFFF];
															local904 = Static145.anInt3836;
															local906 = Static145.anInt3840;
															if (local904 > local698 + local854 && local902.anInt32 > 0) {
																local931 = (local904 - local698 - local854) * Static68.anInt1847 / 3;
																if (Static68.anInt1847 * 10 < local931) {
																	local931 = Static68.anInt1847 * 10;
																}
																if (local902.anInt32 < local931) {
																	local931 = local902.anInt32;
																}
																local902.anInt32 -= local931;
																Static154.anInt4090 += local931;
																Static3.method21(local902);
															}
															if (local906 < local698 + local854 + 32 && local902.anInt42 - local902.anInt20 > local902.anInt32) {
																local931 = Static68.anInt1847 * (local698 + local854 + 32 - local906) / 3;
																if (Static68.anInt1847 * 10 < local931) {
																	local931 = Static68.anInt1847 * 10;
																}
																if (local902.anInt42 - local902.anInt20 - local902.anInt32 < local931) {
																	local931 = local902.anInt42 - local902.anInt32 - local902.anInt20;
																}
																local902.anInt32 += local931;
																Static154.anInt4090 -= local931;
																Static3.method21(local902);
															}
														}
													} else if (Static45.aClass1_15 == local21 && local243 == Static96.anInt2445) {
														local797.method2550(local688, local698, 128);
													} else {
														local797.method2538(local688, local698);
													}
												}
											} else if (local21.anIntArray7 != null && local243 < 20) {
												@Pc(1054) Class4_Sub1_Sub7_Sub2 local1054 = local21.method7(local243);
												if (local1054 != null) {
													local1054.method2538(local688, local698);
												} else if (Static64.aBoolean77) {
													Static3.method21(local21);
												}
											}
											local243++;
										}
									}
								} else if (local21.anInt7 == 3) {
									if (Static52.method1024(local21)) {
										local243 = local21.anInt3;
										if (local21 == Static102.aClass1_31 && local21.anInt10 != 0) {
											local243 = local21.anInt10;
										}
									} else {
										local243 = local21.anInt6;
										if (Static102.aClass1_31 == local21 && local21.anInt45 != 0) {
											local243 = local21.anInt45;
										}
									}
									if (local107 == 0) {
										if (local21.aBoolean3) {
											Static145.method2941(local104, local112, local21.anInt50, local21.anInt20, local243);
										} else {
											Static145.method2945(local104, local112, local21.anInt50, local21.anInt20, local243);
										}
									} else if (local21.aBoolean3) {
										Static145.method2931(local104, local112, local21.anInt50, local21.anInt20, local243, 256 - (local107 & 0xFF));
									} else {
										Static145.method2943(local104, local112, local21.anInt50, local21.anInt20, local243, 256 - (local107 & 0xFF));
									}
								} else {
									@Pc(1187) Class4_Sub1_Sub7_Sub1_Sub1 local1187;
									if (local21.anInt7 == 4) {
										local1187 = local21.method6(Static102.aClass4_Sub1_Sub7_Sub3Array11);
										if (local1187 != null) {
											@Pc(1199) Class46 local1199 = local21.aClass46_2;
											if (Static52.method1024(local21)) {
												local257 = local21.anInt3;
												if (local21 == Static102.aClass1_31 && local21.anInt10 != 0) {
													local257 = local21.anInt10;
												}
												if (local21.aClass46_7.method1677() > 0) {
													local1199 = local21.aClass46_7;
												}
											} else {
												local257 = local21.anInt6;
												if (Static102.aClass1_31 == local21 && local21.anInt45 != 0) {
													local257 = local21.anInt45;
												}
											}
											if (local21.aBoolean8 && local21.anInt25 != -1) {
												@Pc(1255) Class4_Sub1_Sub12 local1255 = Static83.method1663(local21.anInt25);
												local1199 = local1255.aClass46_895;
												if (local1199 == null) {
													local1199 = Static54.aClass46_524;
												}
												if ((local1255.anInt2481 == 1 || local21.anInt46 != 1) && local21.anInt46 != -1) {
													local1199 = Static69.method1482(new Class46[] { Static46.aClass46_469, local1199, Static151.aClass46_1275, Static104.method1977(local21.anInt46) });
												}
											}
											if (Static84.aClass1_54 == local21) {
												local1199 = Static158.aClass46_1310;
												local257 = local21.anInt6;
											}
											if (!local21.aBoolean8) {
												local1199 = Static1.method1(local21, local1199);
											}
											local1187.method885(local1199, local104, local112, local21.anInt50, local21.anInt20, local257, local21.aBoolean10 ? 0 : -1, local21.anInt47, local21.anInt67, local21.anInt61);
										} else if (Static64.aBoolean77) {
											Static3.method21(local21);
										}
									} else if (local21.anInt7 == 5) {
										@Pc(1358) Class4_Sub1_Sub7_Sub2 local1358;
										if (local21.aBoolean8) {
											if (local21.anInt25 == -1) {
												local1358 = local21.method4(false);
											} else {
												local1358 = Static169.method2885(local21.anInt25, local21.anInt58, local21.anInt34, local21.anInt46, false);
											}
											if (local1358 != null) {
												local257 = local1358.anInt3408;
												local677 = local1358.anInt3407;
												if (local21.aBoolean9) {
													Static145.method2930(local104, local112, local104 + local21.anInt50, local112 - -local21.anInt20);
													local688 = (local21.anInt50 + local257 - 1) / local257;
													local698 = (local21.anInt20 + local677 - 1) / local677;
													for (local850 = 0; local850 < local688; local850++) {
														for (local854 = 0; local854 < local698; local854++) {
															if (local21.anInt40 != 0) {
																local1358.method2536(local257 / 2 + local257 * local850 + local104, local112 - -(local677 * local854) - -(local677 / 2), local21.anInt40, 4096);
															} else if (local107 == 0) {
																local1358.method2538(local850 * local257 + local104, local677 * local854 + local112);
															} else {
																local1358.method2550(local104 + local850 * local257, local112 + local854 * local677, 256 - (local107 & 0xFF));
															}
														}
													}
													Static145.method2932(arg1, arg6, arg2, arg4);
												} else {
													local688 = local21.anInt50 * 4096 / local257;
													if (local21.anInt40 != 0) {
														local1358.method2536(local21.anInt50 / 2 + local104, local112 - -(local21.anInt20 / 2), local21.anInt40, local688);
													} else if (local107 != 0) {
														local1358.method2543(local104, local112, local21.anInt50, local21.anInt20, 256 - (local107 & 0xFF));
													} else if (local21.anInt50 == local257 && local677 == local21.anInt20) {
														local1358.method2538(local104, local112);
													} else {
														local1358.method2541(local104, local112, local21.anInt50, local21.anInt20);
													}
												}
											} else if (Static64.aBoolean77) {
												Static3.method21(local21);
											}
										} else {
											local1358 = local21.method4(Static52.method1024(local21));
											if (local1358 != null) {
												local1358.method2538(local104, local112);
											} else if (Static64.aBoolean77) {
												Static3.method21(local21);
											}
										}
									} else {
										@Pc(1648) Class4_Sub1_Sub12 local1648;
										if (local21.anInt7 == 6) {
											@Pc(1625) boolean local1625 = Static52.method1024(local21);
											@Pc(1627) Class4_Sub1_Sub1_Sub4 local1627 = null;
											if (local1625) {
												local257 = local21.anInt9;
											} else {
												local257 = local21.anInt19;
											}
											local688 = 0;
											if (local21.anInt25 != -1) {
												local1648 = Static83.method1663(local21.anInt25);
												if (local1648 != null) {
													local1648 = local1648.method1888(local21.anInt46);
													local1627 = local1648.method1883(0, 1, null);
													if (local1627 == null) {
														Static3.method21(local21);
													} else {
														local1627.method2824();
														local688 = -local1627.aShort29 / 2;
													}
												}
											} else if (local21.anInt33 == 5) {
												if (local21.anInt71 == -1) {
													local1627 = Static106.aClass43_2.method1571(-1, null, -1, null);
												} else {
													local698 = local21.anInt71 & 0x7FF;
													if (Static151.anInt3441 == local698) {
														local698 = 2047;
													}
													@Pc(1758) Class4_Sub1_Sub1_Sub1_Sub1 local1758 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local698];
													@Pc(1768) Class4_Sub1_Sub4 local1768 = local257 == -1 ? null : Static137.method2394(local257);
													if (local1758 != null && (int) local1758.aClass46_796.method1646() << 11 == (local21.anInt71 & 0xFFFFF800)) {
														local1627 = local1758.aClass43_1.method1571(local21.anInt70, null, 0, local1768);
													}
												}
											} else if (local257 == -1) {
												local1627 = local21.method8(local1625, null, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1, -1);
												if (local1627 == null && Static64.aBoolean77) {
													Static3.method21(local21);
												}
											} else {
												@Pc(1708) Class4_Sub1_Sub4 local1708 = Static137.method2394(local257);
												local1627 = local21.method8(local1625, local1708, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.aClass43_1, local21.anInt70);
												if (local1627 == null && Static64.aBoolean77) {
													Static3.method21(local21);
												}
											}
											if (local1627 != null) {
												Static171.method2961(local21.anInt66 + local104 + local21.anInt50 / 2, local112 + local21.anInt20 / 2 - -local21.anInt17);
												local698 = Class4_Sub1_Sub7_Sub4.anIntArray412[local21.anInt35] * local21.anInt72 >> 16;
												local850 = local21.anInt72 * Class4_Sub1_Sub7_Sub4.anIntArray416[local21.anInt35] >> 16;
												if (!local21.aBoolean8) {
													local1627.method2840(local21.anInt56, 0, local21.anInt35, 0, local698, local850);
												} else if (local21.aBoolean11) {
													local1627.method2830(local21.anInt56, local21.anInt5, local21.anInt35, local21.anInt22, local21.anInt4 + local688 + local698, local21.anInt4 + local850, local21.anInt72);
												} else {
													local1627.method2840(local21.anInt56, local21.anInt5, local21.anInt35, local21.anInt22, local688 + local698 + local21.anInt4, local850 + local21.anInt4);
												}
												Static171.method2953();
											}
										} else {
											if (local21.anInt7 == 7) {
												local1187 = local21.method6(Static102.aClass4_Sub1_Sub7_Sub3Array11);
												if (local1187 == null) {
													if (Static64.aBoolean77) {
														Static3.method21(local21);
													}
													continue;
												}
												local257 = 0;
												for (local677 = 0; local677 < local21.anInt20; local677++) {
													for (local688 = 0; local688 < local21.anInt50; local688++) {
														if (local21.anIntArray11[local257] > 0) {
															local1648 = Static83.method1663(local21.anIntArray11[local257] - 1);
															@Pc(1984) Class46 local1984;
															if (local1648.anInt2481 != 1 && local21.anIntArray2[local257] == 1) {
																local1984 = Static69.method1482(new Class46[] { Static46.aClass46_469, local1648.aClass46_895, Static149.aClass46_1259 });
															} else {
																local1984 = Static69.method1482(new Class46[] { Static46.aClass46_469, local1648.aClass46_895, Static151.aClass46_1275, Static104.method1977(local21.anIntArray2[local257]) });
															}
															local736 = local677 * (local21.anInt31 + 12) + local112;
															local854 = local104 + local688 * (local21.anInt36 + 115);
															if (local21.anInt47 == 0) {
																local1187.method890(local1984, local854, local736, local21.anInt6, local21.aBoolean10 ? 0 : -1);
															} else if (local21.anInt47 == 1) {
																local1187.method906(local1984, local854 + local21.anInt50 / 2, local736, local21.anInt6, local21.aBoolean10 ? 0 : -1);
															} else {
																local1187.method898(local1984, local21.anInt50 + local854 - 1, local736, local21.anInt6, local21.aBoolean10 ? 0 : -1);
															}
														}
														local257++;
													}
												}
											}
											@Pc(2258) int local2258;
											if (local21.anInt7 == 8 && local21 == Static162.aClass1_47 && Static152.anInt3458 == Static3.anInt82) {
												local243 = 0;
												local257 = 0;
												@Pc(2113) Class46 local2113 = local21.aClass46_2;
												@Pc(2115) Class4_Sub1_Sub7_Sub1_Sub1 local2115 = Static155.aClass4_Sub1_Sub7_Sub1_Sub1_6;
												local2113 = Static1.method1(local21, local2113);
												@Pc(2132) Class46 local2132;
												while (local2113.method1677() > 0) {
													local850 = local2113.method1652(Static23.aClass46_194);
													if (local850 == -1) {
														local2132 = local2113;
														local2113 = Static3.aClass46_44;
													} else {
														local2132 = local2113.method1666(local850, 0);
														local2113 = local2113.method1650(local850 + 4);
													}
													local854 = local2115.method903(local2132);
													if (local854 > local243) {
														local243 = local854;
													}
													local257 += local2115.anInt1206 + 1;
												}
												local243 += 6;
												local850 = local104 + local21.anInt50 - local243 - 5;
												if (local850 < local104 + 5) {
													local850 = local104 + 5;
												}
												local854 = local112 + local21.anInt20 + 5;
												if (local850 + local243 > arg2) {
													local850 = arg2 - local243;
												}
												local257 += 7;
												if (local257 + local854 > arg4) {
													local854 = arg4 - local257;
												}
												Static145.method2941(local850, local854, local243, local257, 16777120);
												Static145.method2945(local850, local854, local243, local257, 0);
												local736 = local854 + local2115.anInt1206 + 2;
												local2113 = local21.aClass46_2;
												local2113 = Static1.method1(local21, local2113);
												while (local2113.method1677() > 0) {
													local2258 = local2113.method1652(Static23.aClass46_194);
													if (local2258 == -1) {
														local2132 = local2113;
														local2113 = Static3.aClass46_44;
													} else {
														local2132 = local2113.method1666(local2258, 0);
														local2113 = local2113.method1650(local2258 + 4);
													}
													local2115.method890(local2132, local850 + 3, local736, 0, -1);
													local736 += local2115.anInt1206 + 1;
												}
											}
											if (local21.anInt7 == 9) {
												if (local21.anInt15 == 1) {
													Static145.method2940(local104, local112, local21.anInt50 + local104, local112 + local21.anInt20, local21.anInt6);
												} else {
													local243 = local21.anInt50 < 0 ? -local21.anInt50 : local21.anInt50;
													local257 = local21.anInt20 < 0 ? -local21.anInt20 : local21.anInt20;
													local677 = local243;
													if (local243 < local257) {
														local677 = local257;
													}
													if (local677 != 0) {
														local698 = (local21.anInt20 << 16) / local677;
														local688 = (local21.anInt50 << 16) / local677;
														if (local688 >= local698) {
															local688 = -local688;
														} else {
															local698 = -local698;
														}
														local854 = local21.anInt15 * local698 + 1 >> 17;
														local850 = local698 * local21.anInt15 >> 17;
														local736 = local21.anInt15 * local688 >> 17;
														@Pc(2411) int local2411 = local104 - arg1;
														local2258 = local688 * local21.anInt15 + 1 >> 17;
														local904 = local112 - arg6;
														local906 = local850 + local2411;
														local931 = local2411 - local854;
														@Pc(2442) int local2442 = local2411 + local21.anInt50 - local854;
														@Pc(2449) int local2449 = local850 + local21.anInt50 + local2411;
														@Pc(2453) int local2453 = local904 - local2258;
														@Pc(2457) int local2457 = local736 + local904;
														@Pc(2465) int local2465 = local904 + local21.anInt20 - local2258;
														@Pc(2473) int local2473 = local904 + local21.anInt20 + local736;
														Static171.method2951(local906, local931, local2442);
														Static171.method2960(local2457, local2453, local2465, local906, local931, local2442, local21.anInt6);
														Static171.method2951(local906, local2442, local2449);
														Static171.method2960(local2457, local2465, local2473, local906, local2442, local2449, local21.anInt6);
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
}
