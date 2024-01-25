import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "[[B")
	public static byte[][] aByteArrayArray19;

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "Lclient!ae;")
	public static Class4 aClass4_25;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	public static int anInt6715 = 0;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "Lclient!eb;")
	public static final Class42 aClass42_45 = new Class42();

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
	public static int anInt6720 = 0;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)Lclient!gl;")
	public static Class1_Sub4_Sub10 method5862(@OriginalArg(1) int arg0) {
		@Pc(18) Class1_Sub4_Sub10 local18 = (Class1_Sub4_Sub10) Static11.aClass44_4.method1612((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(33) byte[] local33;
		if (arg0 >= 32768) {
			local33 = Static69.aClass30_16.method1161(arg0 & 0x7FFF, 0);
		} else {
			local33 = Static62.aClass30_14.method1161(arg0, 0);
		}
		local18 = new Class1_Sub4_Sub10();
		if (local33 != null) {
			local18.method2245(new Class1_Sub7(local33));
		}
		if (arg0 >= 32768) {
			local18.method2250();
		}
		Static11.aClass44_4.method1616((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(BI)Lclient!lc;")
	public static Class119 method5863(@OriginalArg(1) int arg0) {
		@Pc(10) Class119 local10 = (Class119) Static353.aClass21_174.method854((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static9.aClass30_1.method1161(arg0, 35);
		local10 = new Class119();
		if (local20 != null) {
			local10.method3444(new Class1_Sub7(local20));
		}
		local10.method3439();
		Static353.aClass21_174.method843(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "([[BLclient!fp;Lclient!ui;I[[BI[[IIZ[[B[[BILclient!ui;)V")
	public static void method5865(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class63 arg1, @OriginalArg(2) Class36 arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[][] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) byte[][] arg8, @OriginalArg(10) byte[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) Class36 arg11) {
		for (@Pc(15) int local15 = 0; local15 < arg10; local15++) {
			@Pc(32) int local32 = local15 < arg10 - 1 ? local15 + 1 : local15;
			for (@Pc(34) int local34 = 0; local34 < arg6; local34++) {
				@Pc(51) int local51 = arg6 - 1 > local34 ? local34 + 1 : local34;
				if (Static150.method4956() || Static320.method4042(local15, local34, arg4, Static75.anInt3288)) {
					@Pc(65) boolean local65 = false;
					@Pc(67) boolean local67 = false;
					@Pc(70) boolean[] local70 = new boolean[4];
					@Pc(76) int local76 = arg3[local15][local34];
					@Pc(82) int local82 = arg8[local15][local34];
					@Pc(90) int local90 = arg9[local15][local34] & 0xFF;
					@Pc(98) int local98 = arg0[local15][local34] & 0xFF;
					@Pc(106) int local106 = arg0[local15][local51] & 0xFF;
					@Pc(114) int local114 = arg0[local32][local51] & 0xFF;
					@Pc(122) int local122 = arg0[local32][local34] & 0xFF;
					if (local90 != 0 || local98 != 0) {
						@Pc(145) Class180 local145 = local90 == 0 ? null : Static201.method3743(local90 - 1);
						if (local76 == 0 && local145 == null) {
							local76 = 12;
						}
						@Pc(164) Class189 local164 = local98 == 0 ? null : Static49.method1146(local98 - 1);
						@Pc(166) Class180 local166 = local145;
						if (local145 != null) {
							if (local145.anInt5293 == -1 && local145.anInt5283 == -1) {
								local166 = local145;
								local145 = null;
							} else if (local164 != null && local76 != 0) {
								local67 = local145.aBoolean403;
							}
						}
						@Pc(270) int local270;
						@Pc(285) int local285;
						@Pc(350) int local350;
						@Pc(360) int local360;
						if ((local76 == 0 || local76 == 12) && local15 > 0 && local34 > 0 && arg10 > local15 && arg6 > local34) {
							@Pc(238) int local238 = local98 == arg0[local32][local51] ? 1 : -1;
							@Pc(253) int local253 = arg0[local32][local34 - 1] == local98 ? 1 : -1;
							local270 = local98 == arg0[local15 - 1][local34 - 1] ? 1 : -1;
							local285 = arg0[local15 - 1][local51] == local98 ? 1 : -1;
							if (arg0[local15][local34 - 1] == local98) {
								local270++;
								local253++;
							} else {
								local270--;
								local253--;
							}
							if (arg0[local32][local34] == local98) {
								local253++;
								local238++;
							} else {
								local238--;
								local253--;
							}
							if (local98 == arg0[local15][local51]) {
								local238++;
								local285++;
							} else {
								local285--;
								local238--;
							}
							if (arg0[local15 - 1][local34] == local98) {
								local285++;
								local270++;
							} else {
								local270--;
								local285--;
							}
							local350 = local270 - local238;
							if (local350 < 0) {
								local350 = -local350;
							}
							local360 = local253 - local285;
							if (local360 < 0) {
								local360 = -local360;
							}
							if (local350 == local360) {
								local350 = arg2.method4431(local15, local34) - arg2.method4431(local32, local51);
								if (local350 < 0) {
									local350 = -local350;
								}
								local360 = arg2.method4431(local32, local34) - arg2.method4431(local15, local51);
								if (local360 < 0) {
									local360 = -local360;
								}
							}
							local82 = local350 < local360 ? 1 : 0;
						}
						for (local270 = 0; local270 < 13; local270++) {
							Static5.anIntArray20[local270] = -1;
							Static155.anIntArray231[local270] = 1;
						}
						@Pc(448) boolean[] local448 = local145 != null && local145.aBoolean403 ? Static191.aBooleanArrayArray9[local76] : Static83.aBooleanArrayArray3[local76];
						Static117.method2458(local76, arg10, local82, local34, arg6, local145, arg1, arg9, local15, local70, local164, arg3, arg8);
						@Pc(474) boolean local474 = local145 != null && local145.anInt5283 != local145.anInt5293;
						if (!local474) {
							for (local285 = 0; local285 < 8; local285++) {
								if (Static5.anIntArray20[local285] >= 0 && Static293.anIntArray384[local285] != Static197.anIntArray306[local285]) {
									local474 = true;
									break;
								}
							}
						}
						if (!local448[local82 + 1 & 0x3]) {
							local70[1] = Static96.method2057(local70[1], (Static155.anIntArray231[4] & Static155.anIntArray231[2]) == 0);
						}
						if (!local448[local82 + 3 & 0x3]) {
							local70[3] = Static96.method2057(local70[3], (Static155.anIntArray231[6] & Static155.anIntArray231[0]) == 0);
						}
						if (!local448[local82 & 0x3]) {
							local70[0] = Static96.method2057(local70[0], (Static155.anIntArray231[2] & Static155.anIntArray231[0]) == 0);
						}
						if (!local448[local82 + 2 & 0x3]) {
							local70[2] = Static96.method2057(local70[2], (Static155.anIntArray231[4] & Static155.anIntArray231[6]) == 0);
						}
						if (!local67 && (local76 == 0 || local76 == 12)) {
							if (local70[0] && !local70[1] && !local70[2] && local70[3]) {
								local82 = 0;
								local70[0] = local70[3] = false;
								local76 = local76 == 0 ? 13 : 14;
							} else if (local70[0] && local70[1] && !local70[2] && !local70[3]) {
								local76 = local76 == 0 ? 13 : 14;
								local82 = 3;
								local70[0] = local70[1] = false;
							} else if (!local70[0] && local70[1] && local70[2] && !local70[3]) {
								local70[1] = local70[2] = false;
								local82 = 2;
								local76 = local76 == 0 ? 13 : 14;
							} else if (!local70[0] && !local70[1] && local70[2] && local70[3]) {
								local82 = 1;
								local70[2] = local70[3] = false;
								local76 = local76 == 0 ? 13 : 14;
							}
						}
						@Pc(780) boolean local780 = !local67 && !local70[0] && !local70[2] && !local70[1] && !local70[3];
						@Pc(782) int[] local782 = null;
						@Pc(804) int[] local804;
						@Pc(800) int[] local800;
						@Pc(788) int[] local788;
						if (local780) {
							local788 = Static196.anIntArrayArray34[local76];
							local350 = local164 == null ? 0 : Static295.anIntArray441[local76];
							local800 = Static289.anIntArrayArray63[local76];
							local804 = Static215.anIntArrayArray40[local76];
							local360 = local145 == null ? 0 : Static44.anIntArray74[local76];
						} else if (local67) {
							local350 = local164 == null ? 0 : Static36.anIntArray59[local76];
							local788 = Static216.anIntArrayArray41[local76];
							local800 = Static342.anIntArrayArray71[local76];
							local782 = Static136.anIntArrayArray54[local76];
							local360 = local145 == null ? 0 : Static325.anIntArray405[local76];
							local804 = Static255.anIntArrayArray56[local76];
						} else {
							local788 = Static150.anIntArrayArray59[local76];
							local350 = local164 == null ? 0 : Static191.anIntArray493[local76];
							local360 = local145 == null ? 0 : Static272.anIntArray411[local76];
							local800 = Static229.anIntArrayArray46[local76];
							local804 = Static254.anIntArrayArray55[local76];
							local782 = Static43.anIntArrayArray58[local76];
						}
						@Pc(886) int local886 = local360 + local350;
						if (local886 <= 0) {
							Static85.method1806(arg4, local15, local34);
						} else {
							if (local70[0]) {
								local886++;
							}
							if (local70[2]) {
								local886++;
							}
							if (local70[1]) {
								local886++;
							}
							if (local70[3]) {
								local886++;
							}
							@Pc(916) int local916 = 0;
							@Pc(918) int local918 = 0;
							@Pc(922) int local922 = local886 * 3;
							@Pc(929) int[] local929 = arg7 ? new int[local922] : null;
							@Pc(936) int[] local936 = local474 ? new int[local922] : null;
							@Pc(939) int[] local939 = new int[local922];
							@Pc(942) int[] local942 = new int[local922];
							@Pc(945) int[] local945 = new int[local922];
							@Pc(948) int[] local948 = new int[local922];
							@Pc(951) int[] local951 = new int[local922];
							@Pc(953) int local953 = -1;
							@Pc(955) int local955 = -1;
							@Pc(957) int local957 = 256;
							@Pc(1057) byte local1057;
							@Pc(1007) int local1007;
							@Pc(1009) int local1009;
							@Pc(1242) int local1242;
							@Pc(1248) int local1248;
							@Pc(1257) int local1257;
							@Pc(1261) int local1261;
							@Pc(1265) int local1265;
							@Pc(1341) int local1341;
							@Pc(1349) int local1349;
							if (local145 != null) {
								local953 = local145.anInt5293;
								local955 = arg1.method4598() ? local145.anInt5286 : local145.anInt5289;
								local957 = local145.anInt5284;
								local1007 = Static225.method4171(local145, arg1);
								for (local1009 = 0; local1009 < local360; local1009++) {
									if (local70[-local82 & 0x3] && local916 == local782[0]) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 1;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 1;
										Static223.anIntArray371[4] = local800[local916];
										local1057 = 6;
										Static223.anIntArray371[5] = local788[local916];
									} else if (local70[2 - local82 & 0x3] && local782[2] == local916) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 5;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 5;
										Static223.anIntArray371[4] = local800[local916];
										local1057 = 6;
										Static223.anIntArray371[5] = local788[local916];
									} else if (local70[1 - local82 & 0x3] && local916 == local782[1]) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 3;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 3;
										Static223.anIntArray371[4] = local800[local916];
										Static223.anIntArray371[5] = local788[local916];
										local1057 = 6;
									} else if (local70[3 - local82 & 0x3] && local782[3] == local916) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 7;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 7;
										Static223.anIntArray371[4] = local800[local916];
										local1057 = 6;
										Static223.anIntArray371[5] = local788[local916];
									} else {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = local800[local916];
										Static223.anIntArray371[2] = local788[local916];
										local1057 = 3;
									}
									local916++;
									for (local1242 = 0; local1242 < local1057; local1242++) {
										local1248 = Static223.anIntArray371[local1242];
										local1257 = local1248 - local82 * 2 & 0x7;
										local1261 = Static195.anIntArray302[local1248];
										local1265 = Static2.anIntArray6[local1248];
										if (local82 == 1) {
											local939[local918] = local1265;
											local942[local918] = 128 - local1261;
										} else if (local82 == 2) {
											local939[local918] = 128 - local1261;
											local942[local918] = 128 - local1265;
										} else if (local82 == 3) {
											local939[local918] = 128 - local1265;
											local942[local918] = local1261;
										} else {
											local939[local918] = local1261;
											local942[local918] = local1265;
										}
										if (arg7 && Static214.aBooleanArrayArray7[local76][local1248]) {
											local1341 = (local15 << 7) + local939[local918];
											local1349 = local942[local918] + (local34 << 7);
											local929[local918] = arg11.method4433(local1341, local1349) - arg2.method4433(local1341, local1349);
										}
										if (local1248 < 8 && Static5.anIntArray20[local1257] > local145.anInt5288) {
											if (local936 != null) {
												local936[local918] = Static197.anIntArray306[local1257];
											}
											local951[local918] = Static56.anIntArray118[local1257];
											local948[local918] = Static222.anIntArray370[local1257];
											local945[local918] = Static293.anIntArray384[local1257];
										} else {
											if (local936 != null) {
												local936[local918] = local1007;
											}
											local948[local918] = arg1.method4598() ? local145.anInt5286 : local145.anInt5289;
											local951[local918] = local145.anInt5284;
											local945[local918] = local953;
										}
										local918++;
									}
								}
								if (!arg7 && arg4 == 0) {
									Static318.method5490(local15, local34, local145.anInt5294, local145.anInt5285 * 8);
								}
								if (local76 != 12 && local145.anInt5293 != -1 && local145.aBoolean404) {
									local65 = true;
								}
							} else if (local780) {
								local916 = Static44.anIntArray74[local76];
							} else if (local67) {
								local916 = Static325.anIntArray405[local76];
							} else {
								local916 = Static272.anIntArray411[local76];
							}
							if (local164 != null) {
								if (local122 == 0) {
									local122 = local98;
								}
								if (local106 == 0) {
									local106 = local98;
								}
								if (local114 == 0) {
									local114 = local98;
								}
								@Pc(1494) Class189 local1494 = Static49.method1146(local98 - 1);
								@Pc(1500) Class189 local1500 = Static49.method1146(local106 - 1);
								@Pc(1506) Class189 local1506 = Static49.method1146(local114 - 1);
								@Pc(1512) Class189 local1512 = Static49.method1146(local122 - 1);
								for (local1257 = 0; local1257 < local350; local1257++) {
									if (local70[-local82 & 0x3] && local782[0] == local916) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 1;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 1;
										Static223.anIntArray371[4] = local800[local916];
										Static223.anIntArray371[5] = local788[local916];
										local1057 = 6;
									} else if (local70[2 - local82 & 0x3] && local916 == local782[2]) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 5;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 5;
										Static223.anIntArray371[4] = local800[local916];
										local1057 = 6;
										Static223.anIntArray371[5] = local788[local916];
									} else if (local70[1 - local82 & 0x3] && local782[1] == local916) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 3;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 3;
										Static223.anIntArray371[4] = local800[local916];
										local1057 = 6;
										Static223.anIntArray371[5] = local788[local916];
									} else if (local70[3 - local82 & 0x3] && local916 == local782[3]) {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = 7;
										Static223.anIntArray371[2] = local788[local916];
										Static223.anIntArray371[3] = 7;
										Static223.anIntArray371[4] = local800[local916];
										Static223.anIntArray371[5] = local788[local916];
										local1057 = 6;
									} else {
										Static223.anIntArray371[0] = local804[local916];
										Static223.anIntArray371[1] = local800[local916];
										local1057 = 3;
										Static223.anIntArray371[2] = local788[local916];
									}
									local916++;
									for (local1261 = 0; local1261 < local1057; local1261++) {
										local1265 = Static223.anIntArray371[local1261];
										local1341 = local1265 - local82 * 2 & 0x7;
										local1349 = Static195.anIntArray302[local1265];
										@Pc(1770) int local1770 = Static2.anIntArray6[local1265];
										@Pc(1788) int local1788;
										@Pc(1790) int local1790;
										if (local82 == 1) {
											local1788 = local1770;
											local1790 = 128 - local1349;
										} else if (local82 == 2) {
											local1790 = 128 - local1770;
											local1788 = 128 - local1349;
										} else if (local82 == 3) {
											local1788 = 128 - local1770;
											local1790 = local1349;
										} else {
											local1790 = local1770;
											local1788 = local1349;
										}
										local939[local918] = local1788;
										local942[local918] = local1790;
										@Pc(1840) int local1840;
										@Pc(1846) int local1846;
										if (arg7 && Static214.aBooleanArrayArray7[local76][local1265]) {
											local1840 = (local15 << 7) + local1788;
											local1846 = local1790 + (local34 << 7);
											local929[local918] = arg11.method4433(local1840, local1846) - arg2.method4433(local1840, local1846);
										}
										if (local1265 < 8 && Static5.anIntArray20[local1341] >= 0) {
											if (local936 != null) {
												local936[local918] = Static197.anIntArray306[local1341];
											}
											local951[local918] = Static56.anIntArray118[local1341];
											local948[local918] = Static222.anIntArray370[local1341];
											local945[local918] = Static293.anIntArray384[local1341];
										} else {
											if (local67 && Static214.aBooleanArrayArray7[local76][local1265]) {
												local948[local918] = local955;
												local951[local918] = local957;
												local945[local918] = local953;
											} else if (local1788 == 0 && local1790 == 0) {
												local945[local918] = arg5[local15][local34];
												local948[local918] = local1494.anInt5576;
												local951[local918] = local1494.anInt5583;
											} else if (local1788 == 0 && local1790 == 128) {
												local945[local918] = arg5[local15][local51];
												local948[local918] = local1500.anInt5576;
												local951[local918] = local1500.anInt5583;
											} else if (local1788 == 128 && local1790 == 128) {
												local945[local918] = arg5[local32][local51];
												local948[local918] = local1506.anInt5576;
												local951[local918] = local1506.anInt5583;
											} else if (local1788 == 128 && local1790 == 0) {
												local945[local918] = arg5[local32][local34];
												local948[local918] = local1512.anInt5576;
												local951[local918] = local1512.anInt5583;
											} else {
												if (local1788 < 64) {
													if (local1790 >= 64) {
														local948[local918] = local1500.anInt5576;
														local951[local918] = local1500.anInt5583;
													} else {
														local948[local918] = local1494.anInt5576;
														local951[local918] = local1494.anInt5583;
													}
												} else if (local1790 < 64) {
													local948[local918] = local1512.anInt5576;
													local951[local918] = local1512.anInt5583;
												} else {
													local948[local918] = local1506.anInt5576;
													local951[local918] = local1506.anInt5583;
												}
												local1840 = Static116.method2436(local1788 << 7 >> 7, arg5[local15][local34], arg5[local32][local34]);
												local1846 = Static116.method2436(local1788 << 7 >> 7, arg5[local15][local51], arg5[local32][local51]);
												local945[local918] = Static116.method2436(local1790 << 7 >> 7, local1840, local1846);
											}
											if (local936 != null) {
												local936[local918] = local945[local918];
											}
										}
										local918++;
									}
								}
								if (local76 != 0 && local164.aBoolean426) {
									local65 = true;
								}
							}
							local1007 = arg2.method4431(local15, local34);
							local1009 = arg2.method4431(local32, local34);
							local1242 = arg2.method4431(local32, local51);
							local1248 = arg2.method4431(local15, local51);
							if (arg4 > 0) {
								@Pc(2180) boolean local2180 = true;
								if (local98 == 0 && local76 != 0) {
									local2180 = false;
								}
								if (local90 > 0 && local166 != null && !local166.aBoolean402) {
									local2180 = false;
								}
								if (local2180 && local1007 == local1009 && local1007 == local1242 && local1248 == local1007) {
									Static312.aByteArrayArrayArray9[arg4][local15][local34] = (byte) (Static312.aByteArrayArrayArray9[arg4][local15][local34] | 0x4);
								}
							}
							local1257 = 0;
							local1261 = 0;
							if (arg7) {
								local1257 = Static60.method1457(local15, local34);
								local1261 = Static1.method48(local15, local34);
							}
							arg2.method4436(local15, local34, local939, local929, local942, local945, local936, local948, local951, local1257, local1261, local65);
							Static85.method1806(arg4, local15, local34);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	public static void method5866() {
		Static51.aClass63_2.method4629(Static56.anInt1435, Static291.aBoolean430 ? Static288.anInt5584 + 256 : -1);
	}
}
