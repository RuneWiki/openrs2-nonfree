import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ka", name = "y", descriptor = "Lclient!pb;")
	public static Class71 aClass71_20;

	@OriginalMember(owner = "client!ka", name = "z", descriptor = "[Lclient!vi;")
	public static Class2_Sub1_Sub2[] aClass2_Sub1_Sub2Array7;

	@OriginalMember(owner = "client!ka", name = "X", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_11;

	@OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
	public static final int anInt2311 = 50;

	@OriginalMember(owner = "client!ka", name = "u", descriptor = "[I")
	public static final int[] anIntArray207 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "w", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_791 = Static151.method2243("logo");

	@OriginalMember(owner = "client!ka", name = "x", descriptor = "[Lclient!mb;")
	public static final Class62[] aClass62Array71 = new Class62[anInt2311];

	@OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
	public static final int[] anIntArray208 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "E", descriptor = "[I")
	public static final int[] anIntArray209 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "L", descriptor = "[I")
	public static final int[] anIntArray210 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ka", name = "N", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_793 = Static151.method2243("World");

	@OriginalMember(owner = "client!ka", name = "M", descriptor = "Lclient!mb;")
	public static Class62 aClass62_792 = aClass62_793;

	@OriginalMember(owner = "client!ka", name = "Q", descriptor = "[I")
	public static final int[] anIntArray211 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "S", descriptor = "Lclient!mb;")
	public static Class62 aClass62_794 = aClass62_793;

	@OriginalMember(owner = "client!ka", name = "T", descriptor = "[I")
	public static final int[] anIntArray212 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "U", descriptor = "[I")
	public static final int[] anIntArray213 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "V", descriptor = "[I")
	public static final int[] anIntArray214 = new int[anInt2311];

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V")
	public static void method1612(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub2_Sub1 local9;
		if (Static76.aClass2_Sub1_Sub2_2 == null) {
			local9 = new Class2_Sub1_Sub2_Sub1(512, 512);
		} else {
			local9 = (Class2_Sub1_Sub2_Sub1) Static76.aClass2_Sub1_Sub2_2;
		}
		@Pc(21) int[] local21 = local9.anIntArray32;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(60) int local60;
		@Pc(62) int local62;
		for (@Pc(42) int local42 = 1; local42 < 103; local42++) {
			local60 = (103 - local42) * 512 * 4 + 24628;
			for (local62 = 1; local62 < 103; local62++) {
				if ((Static133.aByteArrayArrayArray11[arg0][local62][local42] & 0x18) == 0) {
					Static155.method2306(local21, local60, arg0, local62, local42);
				}
				if (arg0 < 3 && (Static133.aByteArrayArrayArray11[arg0 + 1][local62][local42] & 0x8) != 0) {
					Static155.method2306(local21, local60, arg0 + 1, local62, local42);
				}
				local60 += 4;
			}
		}
		local9.method285();
		local62 = (int) (Math.random() * 20.0D) + 228 << 16;
		local60 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + ((int) (Math.random() * 20.0D) + 228 << 16) + 238 - 10;
		@Pc(169) int local169;
		for (@Pc(165) int local165 = 1; local165 < 103; local165++) {
			for (local169 = 1; local169 < 103; local169++) {
				if ((Static133.aByteArrayArrayArray11[arg0][local169][local165] & 0x18) == 0) {
					Static122.method1920(local165, local60, local62, arg0, local169);
				}
				if (arg0 < 3 && (Static133.aByteArrayArrayArray11[arg0 + 1][local169][local165] & 0x8) != 0) {
					Static122.method1920(local165, local60, local62, arg0 + 1, local169);
				}
			}
		}
		Static144.anInt3102 = 0;
		for (local169 = 0; local169 < 104; local169++) {
			for (@Pc(238) int local238 = 0; local238 < 104; local238++) {
				@Pc(245) long local245 = Static59.method819(Static126.anInt2806, local169, local238);
				if (local245 != 0L) {
					@Pc(260) Class2_Sub1_Sub11 local260 = Static60.method844((int) (local245 >>> 32) & Integer.MAX_VALUE);
					@Pc(263) int local263 = local260.anInt1557;
					if (local263 >= 0) {
						@Pc(270) int local270 = local169;
						@Pc(272) int local272 = local238;
						if (local263 != 22 && local263 != 29 && local263 != 34 && local263 != 36 && local263 != 46 && local263 != 47 && local263 != 48) {
							@Pc(304) int[][] local304 = Static164.aClass95Array1[Static126.anInt2806].anIntArrayArray35;
							for (@Pc(306) int local306 = 0; local306 < 10; local306++) {
								@Pc(313) int local313 = (int) (Math.random() * 4.0D);
								if (local313 == 0 && local270 > 0 && local169 - 3 < local270 && (local304[local270 - 1][local272] & 0x12C0108) == 0) {
									local270--;
								}
								if (local313 == 1 && local270 < 103 && local270 < local169 + 3 && (local304[local270 + 1][local272] & 0x12C0180) == 0) {
									local270++;
								}
								if (local313 == 2 && local272 > 0 && local272 > local238 - 3 && (local304[local270][local272 - 1] & 0x12C0102) == 0) {
									local272--;
								}
								if (local313 == 3 && local272 < 103 && local238 + 3 > local272 && (local304[local270][local272 + 1] & 0x12C0120) == 0) {
									local272++;
								}
							}
						}
						Static23.anIntArray56[Static144.anInt3102] = local260.anInt1548;
						Static181.anIntArray333[Static144.anInt3102] = local270;
						Static64.anIntArray105[Static144.anInt3102] = local272;
						Static144.anInt3102++;
					}
				}
			}
		}
		Static76.aClass2_Sub1_Sub2_2 = local9;
		Static127.aClass46_1.method2377();
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)I")
	public static int method1613(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(21) double local21 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(23) double local23 = 0.0D;
		@Pc(32) double local32 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(34) double local34 = local32;
		if (local32 < local14) {
			local34 = local14;
		}
		@Pc(42) double local42 = local32;
		@Pc(44) double local44 = 0.0D;
		if (local14 < local32) {
			local42 = local14;
		}
		if (local21 < local42) {
			local42 = local21;
		}
		if (local34 < local21) {
			local34 = local21;
		}
		@Pc(77) double local77 = (local34 + local42) / 2.0D;
		if (local42 != local34) {
			if (local32 == local34) {
				local23 = (local14 - local21) / (-local42 + local34);
			} else if (local34 == local14) {
				local23 = (local21 - local32) / (local34 - local42) + 2.0D;
			} else if (local34 == local21) {
				local23 = (local32 - local14) / (local34 - local42) + 4.0D;
			}
			if (local77 < 0.5D) {
				local44 = (local34 - local42) / (local42 + local34);
			}
			if (local77 >= 0.5D) {
				local44 = (local34 - local42) / (2.0D - local42 - local34);
			}
		}
		@Pc(161) int local161 = (int) (local77 * 256.0D);
		local23 /= 6.0D;
		@Pc(170) int local170 = (int) (local44 * 256.0D);
		if (local161 < 0) {
			local161 = 0;
		} else if (local161 > 255) {
			local161 = 255;
		}
		if (local170 < 0) {
			local170 = 0;
		} else if (local170 > 255) {
			local170 = 255;
		}
		if (local161 > 243) {
			local170 >>= 0x4;
		} else if (local161 > 217) {
			local170 >>= 0x3;
		} else if (local161 > 192) {
			local170 >>= 0x2;
		} else if (local161 > 179) {
			local170 >>= 0x1;
		}
		@Pc(245) int local245 = (int) (local23 * 256.0D);
		return (local161 >> 1) + (local170 >> 5 << 7) + (local245 >> 2 << 10);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!dh;)V")
	public static void method1614(@OriginalArg(1) Class7_Sub2 arg0) {
		if (arg0.anInt3054 == 0) {
			return;
		}
		@Pc(42) int local42;
		@Pc(48) int local48;
		if (arg0.anInt3067 != -1 && arg0.anInt3067 < 32768) {
			@Pc(33) Class7_Sub2_Sub1 local33 = Static9.aClass7_Sub2_Sub1Array1[arg0.anInt3067];
			if (local33 != null) {
				local42 = arg0.anInt3046 - local33.anInt3046;
				local48 = arg0.anInt3085 - local33.anInt3085;
				if (local42 != 0 || local48 != 0) {
					arg0.anInt3098 = (int) (Math.atan2((double) local42, (double) local48) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(75) int local75;
		if (arg0.anInt3067 >= 32768) {
			local75 = arg0.anInt3067 - 32768;
			if (Static59.anInt1225 == local75) {
				local75 = 2047;
			}
			@Pc(84) Class7_Sub2_Sub2 local84 = Static62.aClass7_Sub2_Sub2Array1[local75];
			if (local84 != null) {
				local48 = arg0.anInt3046 - local84.anInt3046;
				@Pc(100) int local100 = arg0.anInt3085 - local84.anInt3085;
				if (local48 != 0 || local100 != 0) {
					arg0.anInt3098 = (int) (Math.atan2((double) local48, (double) local100) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt3052 != 0 || arg0.anInt3083 != 0) && (arg0.anInt3064 == 0 || arg0.anInt3084 > 0)) {
			local75 = arg0.anInt3048 * 64 + arg0.anInt3046 - (arg0.anInt3052 - Static116.anInt2535 - Static116.anInt2535) * 64 - 64;
			local42 = arg0.anInt3085 + (arg0.anInt3048 - 1) * 64 - (arg0.anInt3083 - Static153.anInt3278 - Static153.anInt3278) * 64;
			if (local75 != 0 || local42 != 0) {
				arg0.anInt3098 = (int) (Math.atan2((double) local75, (double) local42) * 325.949D) & 0x7FF;
			}
			arg0.anInt3052 = 0;
			arg0.anInt3083 = 0;
		}
		local75 = arg0.anInt3098 - arg0.anInt3071 & 0x7FF;
		if (local75 == 0) {
			arg0.anInt3050 = 0;
			return;
		}
		arg0.anInt3050++;
		@Pc(237) boolean local237;
		if (local75 <= 1024) {
			arg0.anInt3071 += arg0.anInt3054;
			local237 = true;
			if (arg0.anInt3054 > local75 || 2048 - arg0.anInt3054 < local75) {
				local237 = false;
				arg0.anInt3071 = arg0.anInt3098;
			}
			if (arg0.anInt3077 == arg0.anInt3096 && (arg0.anInt3050 > 25 || local237)) {
				if (arg0.anInt3082 == -1) {
					arg0.anInt3096 = arg0.anInt3088;
				} else {
					arg0.anInt3096 = arg0.anInt3082;
				}
			}
		} else {
			arg0.anInt3071 -= arg0.anInt3054;
			local237 = true;
			if (local75 < arg0.anInt3054 || local75 > 2048 - arg0.anInt3054) {
				local237 = false;
				arg0.anInt3071 = arg0.anInt3098;
			}
			if (arg0.anInt3077 == arg0.anInt3096 && (arg0.anInt3050 > 25 || local237)) {
				if (arg0.anInt3074 == -1) {
					arg0.anInt3096 = arg0.anInt3088;
				} else {
					arg0.anInt3096 = arg0.anInt3074;
				}
			}
		}
		arg0.anInt3071 &= 0x7FF;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILclient!og;IIZ)V")
	public static void method1616(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub2_Sub2 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static186.aClass7_Sub2_Sub2_1 == arg1 || Static51.anInt1111 >= 400) {
			return;
		}
		@Pc(54) Class62 local54;
		if (arg1.anInt3110 == 0) {
			local54 = Static169.method2460(new Class62[] { arg1.aClass62_1072, Static123.method3146(arg1.anInt3117, Static186.aClass7_Sub2_Sub2_1.anInt3117), Static17.aClass62_131, Static8.aClass62_61, Static119.method1865(arg1.anInt3117), Static84.aClass62_1327 });
		} else {
			local54 = Static169.method2460(new Class62[] { arg1.aClass62_1072, Static17.aClass62_131, Static47.aClass62_328, Static119.method1865(arg1.anInt3110), Static84.aClass62_1327 });
		}
		@Pc(133) int local133;
		if (Static97.anInt2284 == 1) {
			Static99.method1601(Static169.method2460(new Class62[] { Static155.aClass62_1179, Static64.aClass62_448, local54 }), Static169.aClass62_1261, (long) arg3, (short) 16, arg0, arg2);
		} else if (!Static8.aBoolean12) {
			for (local133 = 7; local133 >= 0; local133--) {
				if (Static38.aClass62Array94[local133] != null) {
					@Pc(143) short local143 = 0;
					if (Static65.anInt1369 == 0 && Static38.aClass62Array94[local133].method1858(Static85.aClass62_594)) {
						if (arg1.anInt3117 > Static186.aClass7_Sub2_Sub2_1.anInt3117) {
							local143 = 2000;
						}
						if (Static186.aClass7_Sub2_Sub2_1.anInt3114 != 0 && arg1.anInt3114 != 0) {
							if (arg1.anInt3114 == Static186.aClass7_Sub2_Sub2_1.anInt3114) {
								local143 = 2000;
							} else {
								local143 = 0;
							}
						}
					} else if (Static132.aBooleanArray16[local133]) {
						local143 = 2000;
					}
					@Pc(201) short local201 = Static54.aShortArray33[local133];
					@Pc(206) short local206 = (short) (local201 + local143);
					Static99.method1601(Static169.method2460(new Class62[] { Static112.aClass62_845, local54 }), Static38.aClass62Array94[local133], (long) arg3, local206, arg0, arg2);
				}
			}
		} else if ((Static34.anInt818 & 0x8) == 8) {
			Static99.method1601(Static169.method2460(new Class62[] { Static145.aClass62_1077, Static64.aClass62_448, local54 }), Static125.aClass62_970, (long) arg3, (short) 39, arg0, arg2);
		}
		for (local133 = 0; local133 < Static51.anInt1111; local133++) {
			if (Static26.aShortArray134[local133] == 49) {
				Static87.aClass62Array53[local133] = Static169.method2460(new Class62[] { Static112.aClass62_845, local54 });
				return;
			}
		}
	}
}
