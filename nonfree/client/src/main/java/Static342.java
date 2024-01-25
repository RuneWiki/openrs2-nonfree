import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "Lclient!ch;")
	public static final Class32 aClass32_91 = new Class32("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "[[I")
	public static final int[][] anIntArrayArray49 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIII)V")
	public static void method5005(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static93.method1862(arg3, Static40.anInt818, Static138.anInt932);
		@Pc(17) int local17 = Static93.method1862(arg0, Static40.anInt818, Static138.anInt932);
		@Pc(31) int local31 = Static93.method1862(arg5, Static235.anInt4193, Static243.anInt4326);
		@Pc(37) int local37 = Static93.method1862(arg2, Static235.anInt4193, Static243.anInt4326);
		@Pc(46) int local46 = Static93.method1862(arg3 + arg1, Static40.anInt818, Static138.anInt932);
		@Pc(55) int local55 = Static93.method1862(arg0 - arg1, Static40.anInt818, Static138.anInt932);
		for (@Pc(57) int local57 = local11; local57 < local46; local57++) {
			Static315.method4662(local37, Static15.anIntArrayArray1[local57], local31, arg4);
		}
		for (@Pc(73) int local73 = local17; local73 > local55; local73--) {
			Static315.method4662(local37, Static15.anIntArrayArray1[local73], local31, arg4);
		}
		@Pc(99) int local99 = Static93.method1862(arg1 + arg5, Static235.anInt4193, Static243.anInt4326);
		@Pc(108) int local108 = Static93.method1862(arg2 - arg1, Static235.anInt4193, Static243.anInt4326);
		for (@Pc(110) int local110 = local46; local110 <= local55; local110++) {
			@Pc(116) int[] local116 = Static15.anIntArrayArray1[local110];
			Static315.method4662(local99, local116, local31, arg4);
			Static315.method4662(local37, local116, local108, arg4);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZZ)V")
	public static void method5006(@OriginalArg(1) boolean arg0) {
		Static102.anInt2132++;
		Static163.method2375();
		if (arg0) {
			Static131.anInt2688++;
			Static353.method5189();
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILclient!pf;IIIIIIIII)Z")
	public static boolean method5008(@OriginalArg(1) Class188 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg8 - 64;
		Static381.anIntArrayArray59[64][64] = 99;
		@Pc(29) int local29 = arg4 - 64;
		Static135.anIntArrayArray28[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static189.anIntArray1355[0] = arg8;
		@Pc(51) int local51 = local42 + 1;
		Static275.anIntArray914[0] = arg4;
		@Pc(56) int[][] local56 = arg0.anIntArrayArray34;
		while (local51 != local44) {
			local7 = Static189.anIntArray1355[local44];
			local9 = Static275.anIntArray914[local44];
			@Pc(71) int local71 = local7 - local18;
			local44 = local44 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local29;
			@Pc(88) int local88 = local7 - arg0.anInt4570;
			@Pc(94) int local94 = local9 - arg0.anInt4574;
			if (arg3 == -4) {
				if (arg5 == local7 && local9 == arg1) {
					Static60.anInt1160 = local7;
					Static197.anInt3647 = local9;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static323.method4787(2, 2, arg2, arg5, arg9, local9, arg1, local7)) {
					Static60.anInt1160 = local7;
					Static197.anInt3647 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg0.method4039(arg9, arg1, 2, 2, arg5, arg7, arg2, local7, local9)) {
					Static197.anInt3647 = local9;
					Static60.anInt1160 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg0.method4052(arg7, arg5, arg1, arg2, local7, local9, 2, arg9)) {
					Static197.anInt3647 = local9;
					Static60.anInt1160 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg0.method4046(arg5, 2, local9, arg3, local7, arg6, arg1)) {
					Static197.anInt3647 = local9;
					Static60.anInt1160 = local7;
					return true;
				}
			} else if (arg0.method4054(local7, 2, arg5, arg1, arg6, local9, arg3)) {
				Static60.anInt1160 = local7;
				Static197.anInt3647 = local9;
				return true;
			}
			@Pc(252) int local252 = Static135.anIntArrayArray28[local71][local82] + 1;
			if (local71 > 0 && Static381.anIntArrayArray59[local71 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static189.anIntArray1355[local51] = local7 - 1;
				Static275.anIntArray914[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local71 - 1][local82] = 2;
				Static135.anIntArrayArray28[local71 - 1][local82] = local252;
			}
			if (local71 < 126 && Static381.anIntArrayArray59[local71 + 1][local82] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static189.anIntArray1355[local51] = local7 + 1;
				Static275.anIntArray914[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local71 + 1][local82] = 8;
				Static135.anIntArrayArray28[local71 + 1][local82] = local252;
			}
			if (local82 > 0 && Static381.anIntArrayArray59[local71][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static189.anIntArray1355[local51] = local7;
				Static275.anIntArray914[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local71][local82 - 1] = 1;
				Static135.anIntArrayArray28[local71][local82 - 1] = local252;
			}
			if (local82 < 126 && Static381.anIntArrayArray59[local71][local82 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static189.anIntArray1355[local51] = local7;
				Static275.anIntArray914[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local71][local82 + 1] = 4;
				Static135.anIntArrayArray28[local71][local82 + 1] = local252;
			}
			if (local71 > 0 && local82 > 0 && Static381.anIntArrayArray59[local71 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Static189.anIntArray1355[local51] = local7 - 1;
				Static275.anIntArray914[local51] = local9 - 1;
				Static381.anIntArrayArray59[local71 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local71 - 1][local82 - 1] = local252;
			}
			if (local71 < 126 && local82 > 0 && Static381.anIntArrayArray59[local71 + 1][local82 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Static189.anIntArray1355[local51] = local7 + 1;
				Static275.anIntArray914[local51] = local9 - 1;
				Static381.anIntArrayArray59[local71 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local71 + 1][local82 - 1] = local252;
			}
			if (local71 > 0 && local82 < 126 && Static381.anIntArrayArray59[local71 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Static189.anIntArray1355[local51] = local7 - 1;
				Static275.anIntArray914[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static381.anIntArrayArray59[local71 - 1][local82 + 1] = 6;
				Static135.anIntArrayArray28[local71 - 1][local82 + 1] = local252;
			}
			if (local71 < 126 && local82 < 126 && Static381.anIntArrayArray59[local71 + 1][local82 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static189.anIntArray1355[local51] = local7 + 1;
				Static275.anIntArray914[local51] = local9 + 1;
				Static381.anIntArrayArray59[local71 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static135.anIntArrayArray28[local71 + 1][local82 + 1] = local252;
			}
		}
		Static60.anInt1160 = local7;
		Static197.anInt3647 = local9;
		return false;
	}
}
