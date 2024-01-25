import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!rn", name = "E", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_173 = new Class102(70, 8);

	@OriginalMember(owner = "client!rn", name = "M", descriptor = "S")
	public static short aShort73 = 205;

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)V")
	public static void method4646(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(25) Class2_Sub5_Sub11 local25 = Static316.method4316(13, arg1);
		local25.method3098();
		local25.anInt3911 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIIIIILclient!et;II)Z")
	public static boolean method4647(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class71 arg9, @OriginalArg(10) int arg10) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg1 - 64;
		Static238.anIntArrayArray28[64][64] = 99;
		@Pc(29) int local29 = arg0 - 64;
		Static284.anIntArrayArray34[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static350.anIntArray518[0] = arg1;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static18.anIntArray300[0] = arg0;
		@Pc(56) int[][] local56 = arg9.anIntArrayArray11;
		while (true) {
			label282: while (true) {
				@Pc(82) int local82;
				@Pc(71) int local71;
				@Pc(88) int local88;
				@Pc(94) int local94;
				@Pc(241) int local241;
				@Pc(286) int local286;
				do {
					do {
						do {
							label259: do {
								if (local43 == local46) {
									Static245.anInt3937 = local9;
									Static343.anInt5848 = local7;
									return false;
								}
								local7 = Static350.anIntArray518[local43];
								local9 = Static18.anIntArray300[local43];
								local71 = local9 - local29;
								local43 = local43 + 1 & 0xFFF;
								local82 = local7 - local18;
								local88 = local7 - arg9.anInt1979;
								local94 = local9 - arg9.anInt1973;
								if (arg8 == -4) {
									if (arg3 == local7 && local9 == arg5) {
										Static343.anInt5848 = local7;
										Static245.anInt3937 = local9;
										return true;
									}
								} else if (arg8 == -3) {
									if (Static414.method5236(arg6, arg5, arg4, local7, arg6, arg3, arg7, local9)) {
										Static343.anInt5848 = local7;
										Static245.anInt3937 = local9;
										return true;
									}
								} else if (arg8 == -2) {
									if (arg9.method1613(local9, arg5, arg6, local7, arg10, arg7, arg3, arg6, arg4)) {
										Static245.anInt3937 = local9;
										Static343.anInt5848 = local7;
										return true;
									}
								} else if (arg8 == -1) {
									if (arg9.method1620(arg3, local7, arg5, local9, arg10, arg4, arg6, arg7)) {
										Static343.anInt5848 = local7;
										Static245.anInt3937 = local9;
										return true;
									}
								} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
									if (arg9.method1615(arg5, local9, arg2, arg6, local7, arg8, arg3)) {
										Static343.anInt5848 = local7;
										Static245.anInt3937 = local9;
										return true;
									}
								} else if (arg9.method1612(arg5, arg2, arg8, local7, arg6, arg3, local9)) {
									Static343.anInt5848 = local7;
									Static245.anInt3937 = local9;
									return true;
								}
								local241 = Static284.anIntArrayArray34[local82][local71] + 1;
								if (local82 > 0 && Static238.anIntArrayArray28[local82 - 1][local71] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][arg6 + local94 - 1] & 0x4E240000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg6 - 1) {
											Static350.anIntArray518[local46] = local7 - 1;
											Static18.anIntArray300[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static238.anIntArrayArray28[local82 - 1][local71] = 2;
											Static284.anIntArrayArray34[local82 - 1][local71] = local241;
											break;
										}
										if ((local56[local88 - 1][local286 + local94] & 0x4FA40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 < 128 - arg6 && Static238.anIntArrayArray28[local82 + 1][local71] == 0 && (local56[arg6 + local88][local94] & 0x60E40000) == 0 && (local56[local88 + arg6][local94 + arg6 - 1] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg6 - 1 <= local286) {
											Static350.anIntArray518[local46] = local7 + 1;
											Static18.anIntArray300[local46] = local9;
											local46 = local46 + 1 & 0xFFF;
											Static238.anIntArrayArray28[local82 + 1][local71] = 8;
											Static284.anIntArrayArray34[local82 + 1][local71] = local241;
											break;
										}
										if ((local56[local88 + arg6][local286 + local94] & 0x78E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 > 0 && Static238.anIntArrayArray28[local82][local71 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + arg6 - 1][local94 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg6 - 1) {
											Static350.anIntArray518[local46] = local7;
											Static18.anIntArray300[local46] = local9 - 1;
											local46 = local46 + 1 & 0xFFF;
											Static238.anIntArrayArray28[local82][local71 - 1] = 1;
											Static284.anIntArrayArray34[local82][local71 - 1] = local241;
											break;
										}
										if ((local56[local88 + local286][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local71 < 128 - arg6 && Static238.anIntArrayArray28[local82][local71 + 1] == 0 && (local56[local88][local94 + arg6] & 0x4E240000) == 0 && (local56[local88 + arg6 - 1][arg6 + local94] & 0x78240000) == 0) {
									local286 = 1;
									while (true) {
										if (arg6 - 1 <= local286) {
											Static350.anIntArray518[local46] = local7;
											Static18.anIntArray300[local46] = local9 + 1;
											local46 = local46 + 1 & 0xFFF;
											Static238.anIntArrayArray28[local82][local71 + 1] = 4;
											Static284.anIntArrayArray34[local82][local71 + 1] = local241;
											break;
										}
										if ((local56[local88 + local286][arg6 + local94] & 0x7E240000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 > 0 && local71 > 0 && Static238.anIntArrayArray28[local82 - 1][local71 - 1] == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0) {
									local286 = 1;
									while (true) {
										if (arg6 <= local286) {
											Static350.anIntArray518[local46] = local7 - 1;
											Static18.anIntArray300[local46] = local9 - 1;
											Static238.anIntArrayArray28[local82 - 1][local71 - 1] = 3;
											local46 = local46 + 1 & 0xFFF;
											Static284.anIntArrayArray34[local82 - 1][local71 - 1] = local241;
											break;
										}
										if ((local56[local88 - 1][local286 + local94 - 1] & 0x4FA40000) != 0 || (local56[local88 + local286 - 1][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 < 128 - arg6 && local71 > 0 && Static238.anIntArrayArray28[local82 + 1][local71 - 1] == 0 && (local56[local88 + arg6][local94 - 1] & 0x60E40000) == 0) {
									local286 = 1;
									while (true) {
										if (local286 >= arg6) {
											Static350.anIntArray518[local46] = local7 + 1;
											Static18.anIntArray300[local46] = local9 - 1;
											Static238.anIntArrayArray28[local82 + 1][local71 - 1] = 9;
											local46 = local46 + 1 & 0xFFF;
											Static284.anIntArrayArray34[local82 + 1][local71 - 1] = local241;
											break;
										}
										if ((local56[local88 + arg6][local286 + local94 - 1] & 0x78E40000) != 0 || (local56[local286 + local88][local94 - 1] & 0x63E40000) != 0) {
											break;
										}
										local286++;
									}
								}
								if (local82 > 0 && local71 < 128 - arg6 && Static238.anIntArrayArray28[local82 - 1][local71 + 1] == 0 && (local56[local88 - 1][local94 + arg6] & 0x4E240000) == 0) {
									for (local286 = 1; local286 < arg6; local286++) {
										if ((local56[local88 - 1][local94 + local286] & 0x4FA40000) != 0 || (local56[local286 + local88 - 1][arg6 + local94] & 0x7E240000) != 0) {
											continue label259;
										}
									}
									Static350.anIntArray518[local46] = local7 - 1;
									Static18.anIntArray300[local46] = local9 + 1;
									Static238.anIntArrayArray28[local82 - 1][local71 + 1] = 6;
									local46 = local46 + 1 & 0xFFF;
									Static284.anIntArrayArray34[local82 - 1][local71 + 1] = local241;
								}
							} while (128 - arg6 <= local82);
						} while (local71 >= 128 - arg6);
					} while (Static238.anIntArrayArray28[local82 + 1][local71 + 1] != 0);
				} while ((local56[local88 + arg6][local94 + arg6] & 0x78240000) != 0);
				for (local286 = 1; local286 < arg6; local286++) {
					if ((local56[local286 + local88][local94 + arg6] & 0x7E240000) != 0 || (local56[arg6 + local88][local94 + local286] & 0x78E40000) != 0) {
						continue label282;
					}
				}
				Static350.anIntArray518[local46] = local7 + 1;
				Static18.anIntArray300[local46] = local9 + 1;
				Static238.anIntArrayArray28[local82 + 1][local71 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static284.anIntArrayArray34[local82 + 1][local71 + 1] = local241;
			}
		}
	}
}
