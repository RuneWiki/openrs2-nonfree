import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "Lclient!ba;")
	public static Class2_Sub3 aClass2_Sub3_3;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_2276 = Static94.method1596("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Lclient!a;")
	public static Class1 aClass1_2272 = aClass1_2276;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!a;")
	public static Class1 aClass1_2273 = Static94.method1596(" ");

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!a;")
	private static Class1 aClass1_2275 = Static94.method1596("Loading title screen )2 ");

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!a;")
	public static Class1 aClass1_2274 = aClass1_2275;

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public static int anInt2132 = 0;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
	public static int anInt2133 = 0;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!a;")
	public static Class1 aClass1_2277 = Static94.method1596("M");

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "I")
	public static int anInt2140 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILclient!ba;IIIII)V")
	public static void method1489(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(34) int local34;
		if (arg0 < 0 || arg0 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local34 = arg2.method791();
				if (local34 == 0) {
					break;
				}
				if (local34 == 1) {
					arg2.method791();
					break;
				}
				if (local34 <= 49) {
					arg2.method791();
				}
			}
			return;
		}
		Static29.aByteArrayArrayArray2[arg6][arg0][arg3] = 0;
		while (true) {
			local34 = arg2.method791();
			if (local34 == 0) {
				if (arg6 == 0) {
					Static50.anIntArrayArrayArray7[0][arg0][arg3] = -Static71.method1365(arg5 + arg0 + 932731, arg4 + 556238 + arg3) * 8;
				} else {
					Static50.anIntArrayArrayArray7[arg6][arg0][arg3] = Static50.anIntArrayArrayArray7[arg6 - 1][arg0][arg3] - 240;
				}
				break;
			}
			if (local34 == 1) {
				@Pc(92) int local92 = arg2.method791();
				if (local92 == 1) {
					local92 = 0;
				}
				if (arg6 == 0) {
					Static50.anIntArrayArrayArray7[0][arg0][arg3] = -local92 * 8;
				} else {
					Static50.anIntArrayArrayArray7[arg6][arg0][arg3] = Static50.anIntArrayArrayArray7[arg6 - 1][arg0][arg3] - local92 * 8;
				}
				break;
			}
			if (local34 <= 49) {
				Static103.aByteArrayArrayArray9[arg6][arg0][arg3] = arg2.method831();
				Static29.aByteArrayArrayArray3[arg6][arg0][arg3] = (byte) ((local34 - 2) / 4);
				Static63.aByteArrayArrayArray5[arg6][arg0][arg3] = (byte) (arg1 + local34 - 2 & 0x3);
			} else if (local34 <= 81) {
				Static29.aByteArrayArrayArray2[arg6][arg0][arg3] = (byte) (local34 - 49);
			} else {
				Static71.aByteArrayArrayArray6[arg6][arg0][arg3] = (byte) (local34 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
	public static void method1491() {
		aClass1_2277 = null;
		aClass2_Sub3_3 = null;
		aClass1_2273 = null;
		aClass1_2276 = null;
		aClass1_2272 = null;
		aClass1_2274 = null;
		aClass1_2275 = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Lclient!qd;IIIIIIIIII)V")
	public static void method1492(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1_Sub14[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg2 > arg7 || arg4 < arg8 || arg7 >= arg10 || arg4 >= arg0) {
			return;
		}
		for (@Pc(28) int local28 = 0; local28 < arg1.length; local28++) {
			@Pc(34) Class2_Sub1_Sub14 local34 = arg1[local28];
			if (local34 != null && arg5 == local34.anInt2174) {
				@Pc(50) int local50 = local34.anInt2197 + arg8 - arg3;
				@Pc(59) int local59 = local34.anInt2180 + arg2 - arg9;
				if (local34.anInt2192 == 8 && local59 <= arg7 && local50 <= arg4 && arg7 < local59 + local34.anInt2196 && arg4 < local34.anInt2171 + local50) {
					Static51.anInt1707 = local28;
				}
				if ((local34.anInt2209 >= 0 || local34.anInt2207 != 0) && local59 <= arg7 && local50 <= arg4 && arg7 < local59 + local34.anInt2196 && arg4 < local34.anInt2171 + local50) {
					if (local34.anInt2209 >= 0) {
						Static29.anInt1091 = local34.anInt2209;
					} else {
						Static29.anInt1091 = local28;
					}
				}
				if (local34.anInt2192 != 0) {
					if (local34.anInt2203 == 1 && local59 <= arg7 && local50 <= arg4 && local34.anInt2196 + local59 > arg7 && local34.anInt2171 + local50 > arg4) {
						@Pc(257) boolean local257 = false;
						if (local34.anInt2169 != 0) {
							local257 = Static4.method193(local34);
						}
						if (!local257) {
							Static29.method758(0, local34.aClass1_2336, local34.anInt2194, 0, 42, Static111.aClass1_2898);
						}
					}
					if (local34.anInt2203 == 2 && Static17.anInt783 == 0 && arg7 >= local59 && arg4 >= local50 && arg7 < local34.anInt2196 + local59 && arg4 < local50 + local34.anInt2171) {
						Static29.method758(0, local34.aClass1_2332, local34.anInt2194, 0, 33, Static97.method1655(new Class1[] { Static84.aClass1_2356, local34.aClass1_2342 }));
					}
					if (local34.anInt2203 == 3 && arg7 >= local59 && arg4 >= local50 && local59 + local34.anInt2196 > arg7 && arg4 < local50 + local34.anInt2171) {
						@Pc(385) byte local385;
						if (arg6 == 3) {
							local385 = 40;
						} else {
							local385 = 9;
						}
						Static29.method758(0, Static77.aClass1_2152, local34.anInt2194, 0, local385, Static111.aClass1_2898);
					}
					if (local34.anInt2203 == 4 && arg7 >= local59 && local50 <= arg4 && arg7 < local34.anInt2196 + local59 && local34.anInt2171 + local50 > arg4) {
						Static29.method758(0, local34.aClass1_2336, local34.anInt2194, 0, 23, Static111.aClass1_2898);
					}
					if (local34.anInt2203 == 5 && local59 <= arg7 && local50 <= arg4 && arg7 < local59 + local34.anInt2196 && local50 + local34.anInt2171 > arg4) {
						Static29.method758(0, local34.aClass1_2336, local34.anInt2194, 0, 57, Static111.aClass1_2898);
					}
					if (local34.anInt2203 == 6 && Static101.anInt2594 == -1 && local59 <= arg7 && local50 <= arg4 && arg7 < local59 + local34.anInt2196 && arg4 < local34.anInt2171 + local50) {
						Static29.method758(0, local34.aClass1_2336, local34.anInt2194, 0, 54, Static111.aClass1_2898);
					}
					@Pc(546) int local546;
					if (local34.anInt2192 == 2) {
						@Pc(544) int local544 = 0;
						for (local546 = 0; local546 < local34.anInt2171; local546++) {
							for (@Pc(550) int local550 = 0; local550 < local34.anInt2196; local550++) {
								@Pc(561) int local561 = local550 * (local34.anInt2229 + 32) + local59;
								@Pc(571) int local571 = local50 + (local34.anInt2187 + 32) * local546;
								if (local544 < 20) {
									local561 += local34.anIntArray278[local544];
									local571 += local34.anIntArray280[local544];
								}
								if (arg7 >= local561 && local571 <= arg4 && local561 + 32 > arg7 && arg4 < local571 + 32) {
									Static38.anInt1371 = local34.anInt2194;
									Static90.anInt2328 = local544;
									if (local34.anIntArray276[local544] > 0) {
										@Pc(630) Class2_Sub1_Sub17 local630 = Static73.method1374(local34.anIntArray276[local544] - 1);
										if (Static12.anInt2645 == 1 && local34.aBoolean132) {
											if (local34.anInt2194 != Static34.anInt1276 || Static76.anInt2053 != local544) {
												Static29.method758(local630.anInt2467, Static17.aClass1_675, local34.anInt2194, local544, 56, Static97.method1655(new Class1[] { Static109.aClass1_2872, Static8.aClass1_426, local630.aClass1_2571 }));
											}
										} else if (Static17.anInt783 != 1 || !local34.aBoolean132) {
											@Pc(688) Class1[] local688 = local630.aClass1Array22;
											if (Static99.aBoolean147) {
												local688 = Static91.method1580(local688);
											}
											@Pc(699) int local699;
											@Pc(716) byte local716;
											if (local34.aBoolean132) {
												for (local699 = 4; local699 >= 3; local699--) {
													if (local688 != null && local688[local699] != null) {
														if (local699 == 3) {
															local716 = 43;
														} else {
															local716 = 11;
														}
														Static29.method758(local630.anInt2467, local688[local699], local34.anInt2194, local544, local716, Static97.method1655(new Class1[] { Static77.aClass1_2163, local630.aClass1_2571 }));
													} else if (local699 == 4) {
														Static29.method758(local630.anInt2467, Static13.aClass1_596, local34.anInt2194, local544, 11, Static97.method1655(new Class1[] { Static77.aClass1_2163, local630.aClass1_2571 }));
													}
												}
											}
											if (local34.aBoolean124) {
												Static29.method758(local630.anInt2467, Static17.aClass1_675, local34.anInt2194, local544, 19, Static97.method1655(new Class1[] { Static77.aClass1_2163, local630.aClass1_2571 }));
											}
											if (local34.aBoolean132 && local688 != null) {
												for (local699 = 2; local699 >= 0; local699--) {
													if (local688[local699] != null) {
														local716 = 0;
														if (local699 == 0) {
															local716 = 52;
														}
														if (local699 == 1) {
															local716 = 6;
														}
														if (local699 == 2) {
															local716 = 31;
														}
														Static29.method758(local630.anInt2467, local688[local699], local34.anInt2194, local544, local716, Static97.method1655(new Class1[] { Static77.aClass1_2163, local630.aClass1_2571 }));
													}
												}
											}
											local688 = local34.aClass1Array19;
											if (Static99.aBoolean147) {
												local688 = Static91.method1580(local688);
											}
											if (local688 != null) {
												for (local699 = 4; local699 >= 0; local699--) {
													if (local688[local699] != null) {
														local716 = 0;
														if (local699 == 0) {
															local716 = 53;
														}
														if (local699 == 1) {
															local716 = 25;
														}
														if (local699 == 2) {
															local716 = 55;
														}
														if (local699 == 3) {
															local716 = 48;
														}
														if (local699 == 4) {
															local716 = 24;
														}
														Static29.method758(local630.anInt2467, local688[local699], local34.anInt2194, local544, local716, Static97.method1655(new Class1[] { Static77.aClass1_2163, local630.aClass1_2571 }));
													}
												}
											}
											Static29.method758(local630.anInt2467, Static95.aClass1_2519, local34.anInt2194, local544, 1006, Static97.method1655(new Class1[] { Static77.aClass1_2163, local630.aClass1_2571 }));
										} else if ((Static96.anInt2434 & 0x10) == 16) {
											Static29.method758(local630.anInt2467, Static52.aClass1_1774, local34.anInt2194, local544, 37, Static97.method1655(new Class1[] { Static46.aClass1_1507, Static8.aClass1_426, local630.aClass1_2571 }));
										}
									}
								}
								local544++;
							}
						}
					}
					if (local34.aBoolean121 && local34.anInt2206 != -1 && arg7 >= local59 && arg4 >= local50 && arg7 < local34.anInt2196 + local59 && arg4 < local50 + local34.anInt2171) {
						@Pc(1100) Class2_Sub1_Sub17 local1100 = Static73.method1374(local34.anInt2206);
						if (local34.aBoolean132) {
							@Pc(1106) Class1[] local1106 = local1100.aClass1Array22;
							if (Static99.aBoolean147) {
								local1106 = Static91.method1580(local1106);
							}
							if (local1106 == null || local1106[4] == null) {
								Static29.method758(local1100.anInt2467, Static13.aClass1_596, local34.anInt2194, local34.anInt2220 - 1, 11, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
							} else {
								Static29.method758(local1100.anInt2467, local1106[4], local34.anInt2194, local34.anInt2220 - 1, 11, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
							}
							if (local1106 != null && local1106[3] != null) {
								Static29.method758(local1100.anInt2467, local1106[3], local34.anInt2194, local34.anInt2220 - 1, 43, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
							}
							if (local1106 != null && local1106[2] != null) {
								Static29.method758(local1100.anInt2467, local1106[2], local34.anInt2194, local34.anInt2220 - 1, 31, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
							}
							if (local1106 != null && local1106[1] != null) {
								Static29.method758(local1100.anInt2467, local1106[1], local34.anInt2194, local34.anInt2220 - 1, 6, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
							}
							if (local1106 != null && local1106[0] != null) {
								Static29.method758(local1100.anInt2467, local1106[0], local34.anInt2194, local34.anInt2220 - 1, 52, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
							}
						}
						if (local34.anInt2194 >= 0) {
							Static29.method758(local1100.anInt2467, Static95.aClass1_2519, local34.anInt2194, -1, 1007, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
						} else {
							Static29.method758(local1100.anInt2467, Static95.aClass1_2519, local34.anInt2174, local34.anInt2194 & 0x7FFF, 1007, Static97.method1655(new Class1[] { Static77.aClass1_2163, local1100.aClass1_2571 }));
						}
					}
					if (local34.aBoolean127 && local34.aClass1Array18 != null && local59 <= arg7 && local50 <= arg4 && local34.anInt2196 + local59 > arg7 && arg4 < local50 + local34.anInt2171) {
						@Pc(1390) Class1 local1390 = Static111.aClass1_2898;
						if (local34.anInt2206 != -1) {
							@Pc(1401) Class2_Sub1_Sub17 local1401 = Static73.method1374(local34.anInt2206);
							local1390 = Static97.method1655(new Class1[] { Static77.aClass1_2163, local1401.aClass1_2571 });
						}
						for (local546 = local34.aClass1Array18.length - 1; local546 >= 0; local546--) {
							if (local34.aClass1Array18[local546] != null) {
								if (local34.anInt2194 < 0) {
									Static29.method758(local546 + 1, local34.aClass1Array18[local546], local34.anInt2174, local34.anInt2194 & 0x7FFF, 50, local1390);
								} else {
									Static29.method758(local546 + 1, local34.aClass1Array18[local546], local34.anInt2194, 0, 50, local1390);
								}
							}
						}
					}
				} else if (!local34.aBoolean134 || Static56.method1237(arg6, local28) || Static31.aBoolean52) {
					method1492(local50 + local34.anInt2171, arg1, local59, local34.anInt2215, arg4, local28, arg6, arg7, local50, local34.anInt2228, local59 + local34.anInt2196);
					if (local34.aClass2_Sub1_Sub14Array1 != null) {
						method1492(local50 + local34.anInt2171, local34.aClass2_Sub1_Sub14Array1, local59, local34.anInt2215, arg4, local34.anInt2194, arg6, arg7, local50, local34.anInt2228, local34.anInt2196 + local59);
					}
					if (local34.anInt2171 < local34.anInt2208) {
						Static8.method302(local34.anInt2171, arg4, arg7, local34.anInt2208, local34, local34.anInt2196 + local59, arg6, local50);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILclient!bd;ZI)Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 method1494(@OriginalArg(0) int arg0, @OriginalArg(1) Class8 arg1, @OriginalArg(3) int arg2) {
		return Static87.method1560(arg0, arg2, arg1) ? Static37.method940() : null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method1495() {
		if (Static50.aClass65_1 != null) {
			Static50.aClass65_1.method1758();
			Static50.aClass65_1 = null;
		}
		Static53.method1215();
		Static109.aClass3_1.method130();
		for (@Pc(18) int local18 = 0; local18 < 4; local18++) {
			Static84.aClass5Array1[local18].method198();
		}
		System.gc();
		Static60.method1278();
		Static63.anInt1888 = 0;
		Static103.anInt2610 = -1;
		Static65.method1344();
		Static29.method759(10);
	}
}
