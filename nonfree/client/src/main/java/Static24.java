import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ee", name = "gb", descriptor = "Lclient!oa;")
	public static Class9 aClass9_10;

	@OriginalMember(owner = "client!ee", name = "hb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_341 = Static56.method1206("Loaded textures");

	@OriginalMember(owner = "client!ee", name = "nb", descriptor = "[I")
	public static int[] anIntArray116 = new int[5];

	@OriginalMember(owner = "client!ee", name = "qb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_342 = Static56.method1206("@gre@1 unread message");

	@OriginalMember(owner = "client!ee", name = "sb", descriptor = "I")
	public static int anInt1065 = 1;

	@OriginalMember(owner = "client!ee", name = "ub", descriptor = "[I")
	public static int[] anIntArray117 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!ee", name = "wb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_343 = Static56.method1206("Login attempts exceeded)3");

	@OriginalMember(owner = "client!ee", name = "Ab", descriptor = "J")
	public static long aLong31 = 0L;

	@OriginalMember(owner = "client!ee", name = "Bb", descriptor = "Lclient!lc;")
	public static Class31 aClass31_344 = Static56.method1206("Loading title screen )2 ");

	@OriginalMember(owner = "client!ee", name = "Db", descriptor = "Lclient!lc;")
	public static Class31 aClass31_345 = Static56.method1206("backleft1");

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BBZ)V")
	public static void method719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) boolean arg3) {
		if (Static83.anInt2318 >= 0) {
			Static86.anInt2335 = arg1;
			if (Static83.anInt2318 == 0) {
				Static57.anInt2684 = 1;
			} else {
				@Pc(38) int local38 = Static100.method1710(Static83.anInt2318);
				@Pc(42) int local42 = local38 - Static3.anInt126;
				Static57.anInt2684 = (local42 + 3600) / arg1;
				if (Static57.anInt2684 < 1) {
					Static57.anInt2684 = 1;
				}
			}
			Static83.aByteArray21 = arg2;
			Static103.aBoolean153 = arg3;
			Static45.anInt1601 = arg0;
		} else if (Static57.anInt2684 == 0) {
			Static31.method853(arg3, arg2, arg0);
		} else {
			Static45.anInt1601 = arg0;
			Static103.aBoolean153 = arg3;
			Static83.aByteArray21 = arg2;
		}
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)V")
	public static void method720() {
		aClass31_341 = null;
		aClass31_344 = null;
		aClass9_10 = null;
		aClass31_343 = null;
		anIntArray117 = null;
		aClass31_342 = null;
		aClass31_345 = null;
		anIntArray116 = null;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "([BIIIIB[Lclient!vb;IIILclient!wd;)V")
	public static void method721(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class60[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class64 arg9) {
		@Pc(7) int local7 = -1;
		@Pc(20) Class2_Sub6 local20 = new Class2_Sub6(arg0);
		while (true) {
			@Pc(24) int local24 = local20.method646();
			if (local24 == 0) {
				return;
			}
			local7 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local20.method646();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local20.method665();
				@Pc(66) int local66 = local62 & 0x3;
				@Pc(70) int local70 = local62 >> 2;
				if (arg2 == local58 && arg8 <= local54 && local54 < arg8 + 8 && local48 >= arg6 && arg6 + 8 > local48) {
					@Pc(105) Class2_Sub1_Sub16 local105 = Static92.method1045(local7);
					@Pc(122) int local122 = Static28.method787(local54 & 0x7, local105.anInt2699, local105.anInt2698, local66, arg4, local48 & 0x7) + arg1;
					@Pc(140) int local140 = arg3 + Static75.method1407(local54 & 0x7, local105.anInt2698, local105.anInt2699, local66, arg4, local48 & 0x7);
					if (local122 > 0 && local140 > 0 && local122 < 103 && local140 < 103) {
						@Pc(158) Class60 local158 = null;
						@Pc(160) int local160 = arg7;
						if ((Static34.aByteArrayArrayArray17[1][local122][local140] & 0x2) == 2) {
							local160 = arg7 - 1;
						}
						if (local160 >= 0) {
							local158 = arg5[local160];
						}
						Static91.method1544(arg9, arg4 + local66 & 0x3, local158, local7, local140, local122, arg7, local70);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZ)V")
	public static void method722(@OriginalArg(1) boolean arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static49.anInt2696; local7++) {
			@Pc(20) Class2_Sub1_Sub4_Sub6_Sub2 local20 = Static93.aClass2_Sub1_Sub4_Sub6_Sub2Array1[Static57.anIntArray383[local7]];
			@Pc(28) int local28 = (Static57.anIntArray383[local7] << 14) + 536870912;
			if (local20 != null && local20.method1270() && arg0 == local20.aClass2_Sub1_Sub8_1.aBoolean95 && local20.aClass2_Sub1_Sub8_1.method1192()) {
				@Pc(53) int local53 = local20.anInt2006 >> 7;
				@Pc(58) int local58 = local20.anInt2011 >> 7;
				if (local53 >= 0 && local53 < 104 && local58 >= 0 && local58 < 104) {
					if (local20.anInt1994 == 1 && (local20.anInt2006 & 0x7F) == 64 && (local20.anInt2011 & 0x7F) == 64) {
						if (Static78.anInt2278 == Static46.anIntArrayArray51[local53][local58]) {
							continue;
						}
						Static46.anIntArrayArray51[local53][local58] = Static78.anInt2278;
					}
					if (!local20.aClass2_Sub1_Sub8_1.aBoolean94) {
						local28 += Integer.MIN_VALUE;
					}
					Static99.aClass64_1.method1791(Static58.anInt1945, local20.anInt2006, local20.anInt2011, Static42.method1057(local20.anInt2006, local20.anInt2011, Static58.anInt1945), local20.anInt1994 * 64 + 60 - 64, local20, local20.anInt1991, local28, local20.aBoolean102);
				}
			}
		}
	}
}
