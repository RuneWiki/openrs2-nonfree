import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ch", name = "J", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!ch", name = "Q", descriptor = "Lclient!lc;")
	public static Class98 aClass98_22;

	@OriginalMember(owner = "client!ch", name = "L", descriptor = "I")
	public static int anInt708 = 0;

	@OriginalMember(owner = "client!ch", name = "M", descriptor = "I")
	public static int anInt709 = 0;

	@OriginalMember(owner = "client!ch", name = "O", descriptor = "Ljava/lang/String;")
	public static String aString16 = "Continue";

	@OriginalMember(owner = "client!ch", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray7 = new String[500];

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIIIIIII)V")
	public static void method513(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7) {
		@Pc(6) int local6 = arg0 - arg4;
		if (Static269.anInt5031 > arg0) {
			local6++;
		}
		@Pc(20) int local20 = arg1 - arg7;
		if (Static92.anInt1912 > arg1) {
			local20++;
		}
		@Pc(36) int local36;
		@Pc(57) int local57;
		@Pc(49) int local49;
		@Pc(61) int local61;
		@Pc(73) int local73;
		@Pc(120) int local120;
		@Pc(143) int local143;
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(213) int local213;
		@Pc(224) int local224;
		@Pc(234) int local234;
		@Pc(256) int local256;
		@Pc(275) int local275;
		@Pc(307) int local307;
		@Pc(368) int local368;
		@Pc(384) int local384;
		@Pc(203) int[][] local203;
		for (local36 = 0; local36 < local6; local36++) {
			local49 = arg5 * (local36 + 1) >> 16;
			local57 = local36 * arg5 >> 16;
			local61 = local49 - local57;
			if (local61 > 0) {
				local73 = local36 + arg4 >> 6;
				if (local73 >= 0 && local73 <= Static220.anIntArrayArrayArray11.length - 1) {
					local57 += arg2;
					local49 += arg2;
					@Pc(191) byte[][] local191 = Static212.aByteArrayArrayArray16[local73];
					@Pc(195) byte[][] local195 = Static147.aByteArrayArrayArray8[local73];
					@Pc(199) byte[][] local199 = Static283.aByteArrayArrayArray20[local73];
					local203 = Static220.anIntArrayArrayArray11[local73];
					@Pc(207) byte[][] local207 = Static106.aByteArrayArrayArray5[local73];
					@Pc(211) byte[][] local211 = Static121.aByteArrayArrayArray6[local73];
					for (local213 = 0; local213 < local20; local213++) {
						local224 = local213 * arg6 >> 16;
						local234 = (local213 + 1) * arg6 >> 16;
						@Pc(238) int local238 = local234 - local224;
						if (local238 > 0) {
							local224 += arg3;
							local234 += arg3;
							local256 = arg7 + local213 >> 6;
							@Pc(262) int local262 = arg7 + local213 & 0x3F;
							@Pc(268) int local268 = local36 + arg4 & 0x3F;
							local275 = (local262 << 6) + local268;
							if (local256 < 0 || local203.length - 1 < local256 || local203[local256] == null) {
								if (Static23.aClass4_Sub2_Sub9_1.anInt1819 != -1) {
									local307 = Static23.aClass4_Sub2_Sub9_1.anInt1819;
								} else if ((local213 + arg7 & 0x4) == (arg4 + local36 & 0x4)) {
									local307 = Static44.anIntArray115[Static55.anInt1085 + 1];
								} else {
									local307 = 4936552;
								}
								if (local256 < 0 || local203.length - 1 < local256) {
									if (local307 == 0) {
										local307 = 1;
									}
									Static166.method2627(local57, local224, local61, local238, local307);
									continue;
								}
							} else {
								local307 = local203[local256][local275];
							}
							if (local307 == 0) {
								local307 = 1;
							}
							local368 = local199[local256] == null ? 0 : Static44.anIntArray115[local199[local256][local275] & 0xFF];
							local384 = local207[local256] == null ? 0 : Static44.anIntArray115[local207[local256][local275] & 0xFF];
							@Pc(421) int local421;
							if (local368 == 0 && local384 == 0) {
								Static166.method2627(local57, local224, local61, local238, local307);
							} else {
								@Pc(417) byte local417;
								if (local368 != 0) {
									if (local368 == -1) {
										local368 = 1;
									}
									local417 = local191[local256] == null ? 0 : local191[local256][local275];
									local421 = local417 & 0xFC;
									if (local421 == 0 || local61 <= 1 || local238 <= 1) {
										Static166.method2627(local57, local224, local61, local238, local368);
									} else {
										Static142.method2310(local421 >> 2, local238, local57, local368, local61, local417 & 0x3, Static166.anIntArray293, true, local307, local224);
									}
								}
								if (local384 != 0) {
									if (local384 == -1) {
										local384 = local307;
									}
									local417 = local195[local256][local275];
									local421 = local417 & 0xFC;
									if (local421 == 0 || local61 <= 1 || local238 <= 1) {
										Static166.method2627(local57, local224, local61, local238, local384);
									}
									Static142.method2310(local421 >> 2, local238, local57, local384, local61, local417 & 0x3, Static166.anIntArray293, local368 == 0, 0, local224);
								}
							}
							if (local211[local256] != null) {
								@Pc(538) int local538 = local211[local256][local275] & 0xFF;
								if (local538 != 0) {
									if (local61 == 1) {
										local421 = local57;
									} else {
										local421 = local49 - 1;
									}
									@Pc(555) int local555 = 13421772;
									if (local538 >= 5 && local538 <= 8 || local538 >= 13 && local538 <= 16 || local538 >= 21 && local538 <= 24 || local538 == 27 || local538 == 28) {
										local555 = 13369344;
										local538 -= 4;
									}
									@Pc(597) int local597;
									if (local238 == 1) {
										local597 = local224;
									} else {
										local597 = local234 - 1;
									}
									if (local538 == 1) {
										Static166.method2608(local57, local224, local238, local555);
									} else if (local538 == 2) {
										Static166.method2615(local57, local224, local61, local555);
									} else if (local538 == 3) {
										Static166.method2608(local421, local224, local238, local555);
									} else if (local538 == 4) {
										Static166.method2615(local57, local597, local61, local555);
									} else if (local538 == 9) {
										Static166.method2608(local57, local224, local238, 16777215);
										Static166.method2615(local57, local224, local61, local555);
									} else if (local538 == 10) {
										Static166.method2608(local421, local224, local238, 16777215);
										Static166.method2615(local57, local224, local61, local555);
									} else if (local538 == 11) {
										Static166.method2608(local421, local224, local238, 16777215);
										Static166.method2615(local57, local597, local61, local555);
									} else if (local538 == 12) {
										Static166.method2608(local57, local224, local238, 16777215);
										Static166.method2615(local57, local597, local61, local555);
									} else if (local538 == 17) {
										Static166.method2615(local57, local224, 1, local555);
									} else if (local538 == 18) {
										Static166.method2615(local421, local224, 1, local555);
									} else if (local538 == 19) {
										Static166.method2615(local421, local597, 1, local555);
									} else if (local538 == 20) {
										Static166.method2615(local57, local597, 1, local555);
									} else {
										@Pc(698) int local698;
										if (local538 == 25) {
											for (local698 = 0; local698 < local238; local698++) {
												Static166.method2615(local698 + local57, -local698 + local597, 1, local555);
											}
										} else if (local538 == 26) {
											for (local698 = 0; local698 < local238; local698++) {
												Static166.method2615(local57 + local698, local224 + local698, 1, local555);
											}
										}
									}
								}
							}
						}
					}
				} else {
					local57 += arg2;
					for (@Pc(95) int local95 = 0; local95 < local20; local95++) {
						if (Static23.aClass4_Sub2_Sub9_1.anInt1819 != -1) {
							local120 = Static23.aClass4_Sub2_Sub9_1.anInt1819;
						} else if ((local95 + arg7 & 0x4) == (arg4 + local36 & 0x4)) {
							local120 = Static44.anIntArray115[Static55.anInt1085 + 1];
						} else {
							local120 = 4936552;
						}
						local143 = arg3 + (arg6 * local95 >> 16);
						if (local120 == 0) {
							local120 = 1;
						}
						local163 = arg3 + (arg6 * (local95 + 1) >> 16);
						local168 = local163 - local143;
						Static166.method2627(local57, local143, local61, local168, local120);
					}
				}
			}
		}
		for (local36 = -2; local36 < local6 + 2; local36++) {
			local57 = arg5 * local36 >> 16;
			local49 = arg5 * (local36 + 1) >> 16;
			local61 = local49 - local57;
			if (local61 > 0) {
				local73 = local36 + arg4 >> 6;
				local57 += arg2;
				if (local73 >= 0 && Static290.anIntArrayArrayArray14.length - 1 >= local73) {
					local203 = Static290.anIntArrayArrayArray14[local73];
					for (local120 = -2; local120 < local20 + 2; local120++) {
						local143 = local120 * arg6 >> 16;
						local163 = arg6 * (local120 + 1) >> 16;
						local168 = local163 - local143;
						if (local168 > 0) {
							local143 += arg3;
							@Pc(922) int local922 = arg7 + local120 >> 6;
							if (local922 >= 0 && local203.length - 1 >= local922) {
								local213 = ((local120 + arg7 & 0x3F) << 6) + (local36 + arg4 & 0x3F);
								if (local203[local922] != null) {
									local224 = local203[local922][local213];
									local234 = local224 & 0x1FFF;
									if (local234 != 0) {
										@Pc(975) Class108 local975 = Static155.method2472(local234 - 1);
										local256 = local224 >> 13 & 0x3;
										@Pc(992) boolean local992 = (local224 >> 15 & 0x1) == 1;
										@Pc(998) Class59_Sub2 local998 = local975.method2593(local256, local992);
										if (local998 != null) {
											local275 = local61 * local998.anInt4748 / 4;
											local307 = local998.anInt4753 * local168 / 4;
											if (local975.aBoolean206) {
												local368 = local224 >> 16 & 0xF;
												local384 = local224 >> 20 & 0xF;
												if ((local256 & 0x1) == 1) {
													local256 = local368;
													local368 = local384;
													local384 = local256;
												}
												local275 = local61 * local368;
												local307 = local384 * local168;
											}
											if (local275 != 0 && local307 != 0) {
												if (local975.anInt3280 == 0) {
													local998.method3793(local57, local168 + local143 - local307, local275, local307);
												} else {
													local998.method3801(local57, local168 + local143 - local307, local275, local307, local975.anInt3280);
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

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "(I)V")
	public static void method514() {
		aStringArray7 = null;
		aClass98_22 = null;
		aByteArrayArrayArray1 = null;
		aString16 = null;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIBIIIII)V")
	public static void method515(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg0 < 0 || arg5 >= 103 || arg0 >= 103) {
			return;
		}
		@Pc(39) int local39;
		if (arg3 == 0) {
			@Pc(27) Class43 local27 = Static173.method2710(arg2, arg5, arg0);
			if (local27 != null) {
				local39 = (int) (local27.aLong44 >>> 32) & Integer.MAX_VALUE;
				if (arg1 == 2) {
					local27.aClass12_5 = new Class12_Sub6(local39, 2, arg6 + 4, arg2, arg5, arg0, arg4, false, local27.aClass12_5);
					local27.aClass12_4 = new Class12_Sub6(local39, 2, arg6 + 1 & 0x3, arg2, arg5, arg0, arg4, false, local27.aClass12_4);
				} else {
					local27.aClass12_5 = new Class12_Sub6(local39, arg1, arg6, arg2, arg5, arg0, arg4, false, local27.aClass12_5);
				}
			}
		}
		if (arg3 == 1) {
			@Pc(108) Class104 local108 = Static40.method672(arg2, arg5, arg0);
			if (local108 != null) {
				local39 = Integer.MAX_VALUE & (int) (local108.aLong112 >>> 32);
				if (arg1 == 4 || arg1 == 5) {
					local108.aClass12_6 = new Class12_Sub6(local39, 4, arg6, arg2, arg5, arg0, arg4, false, local108.aClass12_6);
				} else if (arg1 == 6) {
					local108.aClass12_6 = new Class12_Sub6(local39, 4, arg6 + 4, arg2, arg5, arg0, arg4, false, local108.aClass12_6);
				} else if (arg1 == 7) {
					local108.aClass12_6 = new Class12_Sub6(local39, 4, (arg6 + 2 & 0x3) + 4, arg2, arg5, arg0, arg4, false, local108.aClass12_6);
				} else if (arg1 == 8) {
					local108.aClass12_6 = new Class12_Sub6(local39, 4, arg6 + 4, arg2, arg5, arg0, arg4, false, local108.aClass12_6);
					local108.aClass12_7 = new Class12_Sub6(local39, 4, (arg6 + 2 & 0x3) + 4, arg2, arg5, arg0, arg4, false, local108.aClass12_7);
				}
			}
		}
		if (arg3 == 2) {
			if (arg1 == 11) {
				arg1 = 10;
			}
			@Pc(255) Class173 local255 = Static21.method3459(arg2, arg5, arg0);
			if (local255 != null) {
				local255.aClass12_10 = new Class12_Sub6(Integer.MAX_VALUE & (int) (local255.aLong183 >>> 32), arg1, arg6, arg2, arg5, arg0, arg4, false, local255.aClass12_10);
			}
		}
		if (arg3 == 3) {
			@Pc(287) Class135 local287 = Static62.method954(arg2, arg5, arg0);
			if (local287 != null) {
				local287.aClass12_8 = new Class12_Sub6(Integer.MAX_VALUE & (int) (local287.aLong147 >>> 32), 22, arg6, arg2, arg5, arg0, arg4, false, local287.aClass12_8);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IIIIIII)V")
	public static void method516(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg0 >= Static211.anInt4200 && Static154.anInt3126 >= arg3 && arg4 >= Static171.anInt3392 && Static141.anInt2889 >= arg2) {
			if (arg5 == 1) {
				Static153.method2440(arg2, arg3, arg1, arg4, arg0);
			} else {
				Static15.method261(arg1, arg3, arg4, arg2, arg5, arg0);
			}
		} else if (arg5 == 1) {
			Static102.method1654(arg3, arg0, arg2, arg1, arg4);
		} else {
			Static16.method273(arg0, arg5, arg3, arg1, arg2, arg4);
		}
	}
}
