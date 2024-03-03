import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static213 {

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray13;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "[Lclient!jd;")
	public static Class13[] aClass13Array16;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIII)V", line = 11)
	public static void method4013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(12) int local12 = -arg0;
		@Pc(14) int local14 = -1;
		@Pc(22) int local22 = Static24.method861(Class25_Sub1.anInt675, arg1 + arg0, Class61.anInt1835);
		@Pc(31) int local31 = Static24.method861(Class25_Sub1.anInt675, arg1 - arg0, Class61.anInt1835);
		Static94.method2165(local22, Static332.anIntArrayArray58[arg2], arg3, local31);
		while (local9 > local7) {
			local14 += 2;
			local12 += local14;
			@Pc(65) int local65;
			@Pc(70) int local70;
			@Pc(93) int local93;
			@Pc(101) int local101;
			if (local12 > 0) {
				local9--;
				local12 -= local9 << 1;
				local65 = arg2 - local9;
				local70 = arg2 + local9;
				if (Class2_Sub40.anInt6819 <= local70 && Class2_Sub20.anInt2951 >= local65) {
					local93 = Static24.method861(Class25_Sub1.anInt675, arg1 + local7, Class61.anInt1835);
					local101 = Static24.method861(Class25_Sub1.anInt675, arg1 - local7, Class61.anInt1835);
					if (Class2_Sub20.anInt2951 >= local70) {
						Static94.method2165(local93, Static332.anIntArrayArray58[local70], arg3, local101);
					}
					if (Class2_Sub40.anInt6819 <= local65) {
						Static94.method2165(local93, Static332.anIntArrayArray58[local65], arg3, local101);
					}
				}
			}
			local7++;
			local65 = arg2 - local7;
			local70 = arg2 + local7;
			if (Class2_Sub40.anInt6819 <= local70 && local65 <= Class2_Sub20.anInt2951) {
				local93 = Static24.method861(Class25_Sub1.anInt675, local9 + arg1, Class61.anInt1835);
				local101 = Static24.method861(Class25_Sub1.anInt675, arg1 - local9, Class61.anInt1835);
				if (local70 <= Class2_Sub20.anInt2951) {
					Static94.method2165(local93, Static332.anIntArrayArray58[local70], arg3, local101);
				}
				if (local65 >= Class2_Sub40.anInt6819) {
					Static94.method2165(local93, Static332.anIntArrayArray58[local65], arg3, local101);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V", line = 104)
	public static void method4015() {
		Class127.anInt3416 = 0;
		Class73.aBoolean158 = false;
		Class2_Sub2_Sub10.anInt6174 = -1;
		Class153.anInt3796 = 0;
		Class2_Sub3_Sub35.anInt6429 = 1;
		Class37_Sub1.anInt1247 = 0;
		Class2_Sub3_Sub6.anInt1045 = -3;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(IIIII)V", line = 139)
	public static void method4017(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Class69.anInt1949 == 1) {
			Static265.aClass13Array21[Class2_Sub3_Sub32.anInt5866 / 100].method6386(Class2_Sub35.anInt5993 - 8, Class195.anInt5492 + -8);
		}
		if (Class69.anInt1949 == 2) {
			Static265.aClass13Array21[Class2_Sub3_Sub32.anInt5866 / 100 + 4].method6386(Class2_Sub35.anInt5993 - 8, Class195.anInt5492 - 8);
		}
		Static267.method5026();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIIIILclient!dg;II)Z", line = 161)
	public static boolean method4018(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class46 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg6;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg6 - 64;
		@Pc(23) int local23 = arg0 - 64;
		Class2_Sub3_Sub30.anIntArrayArray49[64][64] = 99;
		Class11_Sub1_Sub1.anIntArrayArray4[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Class37_Sub1.anIntArray90[0] = arg6;
		@Pc(51) int local51 = local37 + 1;
		Class14.anIntArray257[0] = arg0;
		@Pc(56) int[][] local56 = arg7.anIntArrayArray14;
		while (local39 != local51) {
			local7 = Class37_Sub1.anIntArray90[local39];
			local9 = Class14.anIntArray257[local39];
			local39 = local39 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local18;
			@Pc(82) int local82 = local9 - local23;
			@Pc(88) int local88 = local7 - arg7.anInt1466;
			@Pc(94) int local94 = local9 - arg7.anInt1482;
			if (arg8 == -4) {
				if (local7 == arg4 && local9 == arg1) {
					Static170.anInt3418 = local9;
					Static172.anInt3431 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static23.method856(arg5, local9, arg1, local7, arg4, 2, arg9, 2)) {
					Static172.anInt3431 = local7;
					Static170.anInt3418 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg7.method1639(arg5, local7, arg1, 2, arg2, arg4, local9, 2, arg9)) {
					Static172.anInt3431 = local7;
					Static170.anInt3418 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg7.method1642(arg2, arg4, arg5, local7, arg1, arg9, local9, 2)) {
					Static172.anInt3431 = local7;
					Static170.anInt3418 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg7.method1631(2, arg4, arg8, arg1, arg3, local9, local7)) {
					Static172.anInt3431 = local7;
					Static170.anInt3418 = local9;
					return true;
				}
			} else if (arg7.method1632(arg3, 2, local9, local7, arg8, arg1, arg4)) {
				Static172.anInt3431 = local7;
				Static170.anInt3418 = local9;
				return true;
			}
			@Pc(252) int local252 = Class11_Sub1_Sub1.anIntArrayArray4[local77][local82] + 1;
			if (local77 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7 - 1;
				Class14.anIntArray257[local51] = local9;
				Class2_Sub3_Sub30.anIntArrayArray49[local77 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Class11_Sub1_Sub1.anIntArrayArray4[local77 - 1][local82] = local252;
			}
			if (local77 < 126 && Class2_Sub3_Sub30.anIntArrayArray49[local77 + 1][local82] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7 + 1;
				Class14.anIntArray257[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local77 + 1][local82] = 8;
				Class11_Sub1_Sub1.anIntArrayArray4[local77 + 1][local82] = local252;
			}
			if (local82 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7;
				Class14.anIntArray257[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local77][local82 - 1] = 1;
				Class11_Sub1_Sub1.anIntArrayArray4[local77][local82 - 1] = local252;
			}
			if (local82 < 126 && Class2_Sub3_Sub30.anIntArrayArray49[local77][local82 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7;
				Class14.anIntArray257[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local77][local82 + 1] = 4;
				Class11_Sub1_Sub1.anIntArrayArray4[local77][local82 + 1] = local252;
			}
			if (local77 > 0 && local82 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7 - 1;
				Class14.anIntArray257[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local77 - 1][local82 - 1] = 3;
				Class11_Sub1_Sub1.anIntArrayArray4[local77 - 1][local82 - 1] = local252;
			}
			if (local77 < 126 && local82 > 0 && Class2_Sub3_Sub30.anIntArrayArray49[local77 + 1][local82 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7 + 1;
				Class14.anIntArray257[local51] = local9 - 1;
				Class2_Sub3_Sub30.anIntArrayArray49[local77 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Class11_Sub1_Sub1.anIntArrayArray4[local77 + 1][local82 - 1] = local252;
			}
			if (local77 > 0 && local82 < 126 && Class2_Sub3_Sub30.anIntArrayArray49[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7 - 1;
				Class14.anIntArray257[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Class2_Sub3_Sub30.anIntArrayArray49[local77 - 1][local82 + 1] = 6;
				Class11_Sub1_Sub1.anIntArrayArray4[local77 - 1][local82 + 1] = local252;
			}
			if (local77 < 126 && local82 < 126 && Class2_Sub3_Sub30.anIntArrayArray49[local77 + 1][local82 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Class37_Sub1.anIntArray90[local51] = local7 + 1;
				Class14.anIntArray257[local51] = local9 + 1;
				Class2_Sub3_Sub30.anIntArrayArray49[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Class11_Sub1_Sub1.anIntArrayArray4[local77 + 1][local82 + 1] = local252;
			}
		}
		Static172.anInt3431 = local7;
		Static170.anInt3418 = local9;
		return false;
	}
}
