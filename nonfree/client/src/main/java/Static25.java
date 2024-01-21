import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!ad;")
	public static Class1_Sub3_Sub1_Sub1 aClass1_Sub3_Sub1_Sub1_1;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
	public static int anInt776;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "[I")
	public static int[] anIntArray88;

	@OriginalMember(owner = "client!dc", name = "n", descriptor = "[I")
	public static int[] anIntArray89;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!af;")
	public static Class5 aClass5_353 = Static45.method1937("mod_icons");

	@OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
	public static final int anInt774 = 3353893;

	@OriginalMember(owner = "client!dc", name = "h", descriptor = "Lclient!af;")
	private static Class5 aClass5_354 = Static45.method1937("Drop");

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static int anInt775 = 0;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!af;")
	public static Class5 aClass5_355 = aClass5_354;

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1 = new byte[4][104][104];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIILclient!nc;I)V")
	public static void method542(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub3_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (Static39.anInt1036 >= 50 || Static27.anInt844 == 0 || (arg2.anIntArray316 == null || arg2.anIntArray316.length <= arg3)) {
			return;
		}
		@Pc(35) int local35 = arg2.anIntArray316[arg3];
		if (local35 == 0) {
			return;
		}
		@Pc(45) int local45 = local35 >> 8;
		@Pc(51) int local51 = local35 >> 4 & 0x7;
		Static115.anIntArray431[Static39.anInt1036] = local45;
		Static76.anIntArray297[Static39.anInt1036] = local51;
		Static24.anIntArray87[Static39.anInt1036] = 0;
		@Pc(69) int local69 = (arg1 - 64) / 128;
		Static83.aClass37Array1[Static39.anInt1036] = null;
		@Pc(77) int local77 = local35 & 0xF;
		@Pc(83) int local83 = (arg0 - 64) / 128;
		Static37.anIntArray165[Static39.anInt1036] = local77 + (local69 << 16) + (local83 << 8);
		Static39.anInt1036++;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method543(@OriginalArg(1) int arg0) {
		Static93.anInt2336 += arg0 * 128;
		@Pc(31) int local31;
		if (Static17.anIntArray70.length < Static93.anInt2336) {
			Static93.anInt2336 -= Static17.anIntArray70.length;
			local31 = (int) (Math.random() * 12.0D);
			Static103.method1752(Static93.aClass1_Sub3_Sub1_Sub3Array7[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(56) int local56 = (256 - arg0) * 128;
		@Pc(83) int local83;
		for (@Pc(58) int local58 = 0; local58 < local56; local58++) {
			local83 = Static106.anIntArray396[local31 + local42] - arg0 * Static17.anIntArray70[Static93.anInt2336 + local31 & Static17.anIntArray70.length - 1] / 6;
			if (local83 < 0) {
				local83 = 0;
			}
			Static106.anIntArray396[local31++] = local83;
		}
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(123) int local123;
		for (local83 = 256 - arg0; local83 < 256; local83++) {
			local114 = local83 * 128;
			for (local116 = 0; local116 < 128; local116++) {
				local123 = (int) (Math.random() * 100.0D);
				if (local123 < 50 && local116 > 10 && local116 < 118) {
					Static106.anIntArray396[local114 + local116] = 255;
				} else {
					Static106.anIntArray396[local114 + local116] = 0;
				}
			}
		}
		if (Static59.anInt1402 > 0) {
			Static59.anInt1402 -= arg0 * 4;
		}
		if (Static86.anInt2186 > 0) {
			Static86.anInt2186 -= arg0 * 4;
		}
		if (Static86.anInt2186 == 0 && Static59.anInt1402 == 0) {
			local114 = (int) ((double) (2000 / arg0) * Math.random());
			if (local114 == 1) {
				Static59.anInt1402 = 1024;
			}
			if (local114 == 0) {
				Static86.anInt2186 = 1024;
			}
		}
		for (local114 = 0; local114 < 256 - arg0; local114++) {
			Static82.anIntArray320[local114] = Static82.anIntArray320[arg0 + local114];
		}
		for (local116 = 256 - arg0; local116 < 256; local116++) {
			Static82.anIntArray320[local116] = (int) (Math.sin((double) Static11.anInt331 / 14.0D) * 16.0D + Math.sin((double) Static11.anInt331 / 15.0D) * 14.0D + Math.sin((double) Static11.anInt331 / 16.0D) * 12.0D);
			Static11.anInt331++;
		}
		Static44.anInt1082 += arg0;
		local123 = (arg0 + (Static131.anInt3270 & 0x1)) / 2;
		if (local123 <= 0) {
			return;
		}
		@Pc(304) int local304;
		@Pc(311) int local311;
		for (@Pc(295) int local295 = 0; local295 < Static44.anInt1082 * 100; local295++) {
			local304 = (int) (Math.random() * 124.0D) + 2;
			local311 = (int) (Math.random() * 128.0D) + 128;
			Static106.anIntArray396[(local311 << 7) + local304] = 192;
		}
		Static44.anInt1082 = 0;
		@Pc(341) int local341;
		@Pc(344) int local344;
		for (local304 = 0; local304 < 256; local304++) {
			local311 = 0;
			local341 = local304 * 128;
			for (local344 = -local123; local344 < 128; local344++) {
				if (local344 + local123 < 128) {
					local311 += Static106.anIntArray396[local123 + local344 + local341];
				}
				if (local344 - local123 - 1 >= 0) {
					local311 -= Static106.anIntArray396[local341 + local344 - local123 - 1];
				}
				if (local344 >= 0) {
					Static11.anIntArray43[local344 + local341] = local311 / (local123 * 2 + 1);
				}
			}
		}
		for (local311 = 0; local311 < 128; local311++) {
			local341 = 0;
			for (local344 = -local123; local344 < 256; local344++) {
				@Pc(429) int local429 = local344 * 128;
				if (local123 + local344 < 256) {
					local341 += Static11.anIntArray43[local123 * 128 + local311 + local429];
				}
				if (local344 - local123 - 1 >= 0) {
					local341 -= Static11.anIntArray43[local429 + local311 - local123 * 128 - 128];
				}
				if (local344 >= 0) {
					Static106.anIntArray396[local311 + local429] = local341 / (local123 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIILclient!of;)V")
	public static void method544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub17 arg2) {
		if (arg2.anInt2308 == 1) {
			Static18.method2149(0, arg2.anInt2248, Static49.aClass5_612, arg2.aClass5_1096, 1, 0);
		}
		if (arg2.anInt2308 == 2 && !Static47.aBoolean35) {
			@Pc(33) Class5 local33 = Static85.method1499(arg2);
			if (local33 != null) {
				Static18.method2149(-1, arg2.anInt2248, Static100.method1696(new Class5[] { Static72.aClass5_821, arg2.aClass5_1093 }), local33, 13, 0);
			}
		}
		if (arg2.anInt2308 == 3) {
			Static18.method2149(0, arg2.anInt2248, Static49.aClass5_612, Static83.aClass5_1036, 25, 0);
		}
		if (arg2.anInt2308 == 4) {
			Static18.method2149(0, arg2.anInt2248, Static49.aClass5_612, arg2.aClass5_1096, 34, 0);
		}
		if (arg2.anInt2308 == 5) {
			Static18.method2149(0, arg2.anInt2248, Static49.aClass5_612, arg2.aClass5_1096, 40, 0);
		}
		if (arg2.anInt2308 == 6 && Static11.aClass1_Sub17_14 == null) {
			Static18.method2149(-1, arg2.anInt2248, Static49.aClass5_612, arg2.aClass5_1096, 48, 0);
		}
		@Pc(152) int local152;
		@Pc(146) int local146;
		if (arg2.anInt2271 == 2) {
			local146 = 0;
			for (@Pc(148) int local148 = 0; local148 < arg2.anInt2293; local148++) {
				for (local152 = 0; local152 < arg2.anInt2305; local152++) {
					@Pc(161) int local161 = local148 * (arg2.anInt2284 + 32);
					@Pc(168) int local168 = local152 * (arg2.anInt2252 + 32);
					if (local146 < 20) {
						local161 += arg2.anIntArray346[local146];
						local168 += arg2.anIntArray350[local146];
					}
					if (arg0 >= local168 && arg1 >= local161 && local168 + 32 > arg0 && arg1 < local161 + 32) {
						Static8.aClass1_Sub17_11 = arg2;
						Static102.anInt2526 = local146;
						if (arg2.anIntArray341[local146] > 0) {
							@Pc(222) Class1_Sub3_Sub16 local222 = Static56.method1022(arg2.anIntArray341[local146] - 1);
							if (Static120.anInt1840 == 1 && Static47.method836(Static6.method221(arg2))) {
								if (arg2.anInt2248 != Static9.anInt285 || local146 != Static50.anInt1243) {
									Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static74.aClass5_851, Static17.aClass5_266, local222.aClass5_1323 }), Static66.aClass5_1396, 29, local222.anInt2855);
								}
							} else if (!Static47.aBoolean35 || !Static47.method836(Static6.method221(arg2))) {
								@Pc(328) Class5[] local328 = local222.aClass5Array23;
								if (Static48.aBoolean36) {
									local328 = Static39.method770(local328);
								}
								@Pc(346) int local346;
								@Pc(363) byte local363;
								if (Static47.method836(Static6.method221(arg2))) {
									for (local346 = 4; local346 >= 3; local346--) {
										if (local328 != null && local328[local346] != null) {
											if (local346 == 3) {
												local363 = 28;
											} else {
												local363 = 11;
											}
											Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static16.aClass5_252, local222.aClass5_1323 }), local328[local346], local363, local222.anInt2855);
										} else if (local346 == 4) {
											Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static16.aClass5_252, local222.aClass5_1323 }), aClass5_355, 11, local222.anInt2855);
										}
									}
								}
								if (Static83.method1471(Static6.method221(arg2))) {
									Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static16.aClass5_252, local222.aClass5_1323 }), Static66.aClass5_1396, 43, local222.anInt2855);
								}
								if (Static47.method836(Static6.method221(arg2)) && local328 != null) {
									for (local346 = 2; local346 >= 0; local346--) {
										if (local328[local346] != null) {
											local363 = 0;
											if (local346 == 0) {
												local363 = 18;
											}
											if (local346 == 1) {
												local363 = 58;
											}
											if (local346 == 2) {
												local363 = 15;
											}
											Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static16.aClass5_252, local222.aClass5_1323 }), local328[local346], local363, local222.anInt2855);
										}
									}
								}
								local328 = arg2.aClass5Array18;
								if (Static48.aBoolean36) {
									local328 = Static39.method770(local328);
								}
								if (local328 != null) {
									for (local346 = 4; local346 >= 0; local346--) {
										if (local328[local346] != null) {
											local363 = 0;
											if (local346 == 0) {
												local363 = 22;
											}
											if (local346 == 1) {
												local363 = 20;
											}
											if (local346 == 2) {
												local363 = 5;
											}
											if (local346 == 3) {
												local363 = 14;
											}
											if (local346 == 4) {
												local363 = 33;
											}
											Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static16.aClass5_252, local222.aClass5_1323 }), local328[local346], local363, local222.anInt2855);
										}
									}
								}
								Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static16.aClass5_252, local222.aClass5_1323 }), Static28.aClass5_403, 1007, local222.anInt2855);
							} else if ((Static8.anInt265 & 0x10) == 16) {
								Static18.method2149(local146, arg2.anInt2248, Static100.method1696(new Class5[] { Static108.aClass5_1252, Static17.aClass5_266, local222.aClass5_1323 }), Static80.aClass5_989, 37, local222.anInt2855);
							}
						}
					}
					local146++;
				}
			}
		}
		if (!arg2.aBoolean89) {
			return;
		}
		if (Static47.aBoolean35) {
			if (Static66.method2193(Static6.method221(arg2)) && (Static8.anInt265 & 0x20) == 32) {
				Static18.method2149(arg2.anInt2249, arg2.anInt2248, Static100.method1696(new Class5[] { Static108.aClass5_1252, Static59.aClass5_725, arg2.aClass5_1097 }), Static80.aClass5_989, 4, 0);
				return;
			}
			return;
		}
		@Pc(708) Class5 local708;
		for (local146 = 9; local146 >= 5; local146--) {
			local708 = Static30.method605(local146, arg2);
			if (local708 != null) {
				Static18.method2149(arg2.anInt2249, arg2.anInt2248, arg2.aClass5_1097, local708, 1004, local146 + 1);
			}
		}
		local708 = Static85.method1499(arg2);
		if (local708 != null) {
			Static18.method2149(arg2.anInt2249, arg2.anInt2248, arg2.aClass5_1097, local708, 13, 0);
		}
		for (local152 = 4; local152 >= 0; local152--) {
			@Pc(761) Class5 local761 = Static30.method605(local152, arg2);
			if (local761 != null) {
				Static18.method2149(arg2.anInt2249, arg2.anInt2248, arg2.aClass5_1097, local761, 7, local152 + 1);
			}
		}
		if (Static44.method798(Static6.method221(arg2))) {
			Static18.method2149(arg2.anInt2249, arg2.anInt2248, Static49.aClass5_612, Static39.aClass5_486, 48, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)Lclient!ia;")
	public static Class1_Sub3_Sub9 method545(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub3_Sub9 local10 = (Class1_Sub3_Sub9) Static118.aClass28_77.method796((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static66.aClass41_31.method1710(5, arg0);
		local10 = new Class1_Sub3_Sub9();
		if (local20 != null) {
			local10.method940(new Class1_Sub20(local20));
		}
		Static118.aClass28_77.method789(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public static void method546() {
		anIntArray89 = null;
		aClass1_Sub3_Sub1_Sub1_1 = null;
		aClass5_353 = null;
		anIntArray88 = null;
		aClass5_354 = null;
		aByteArrayArrayArray1 = null;
		aClass5_355 = null;
	}
}
