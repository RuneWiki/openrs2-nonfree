import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ar", name = "x", descriptor = "[Lclient!gl;")
	public static Class2[] aClass2Array2;

	@OriginalMember(owner = "client!ar", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString16 = "flash2:";

	@OriginalMember(owner = "client!ar", name = "B", descriptor = "[I")
	public static final int[] anIntArray24 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILclient!ne;I)V")
	public static void method336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2) {
		Static165.anInt5094 = arg0;
		Static21.anInt1363 = arg1;
		Static45.aClass146_10 = arg2;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(II)I")
	public static int method337(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIIIILclient!fn;III)Z")
	public static boolean method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class65 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) int local15 = arg7;
		@Pc(17) int local17 = arg3;
		@Pc(26) int local26 = arg7 - 64;
		@Pc(30) int local30 = arg3 - 64;
		Static114.anIntArrayArray36[64][64] = 99;
		Static216.anIntArrayArray73[64][64] = 0;
		@Pc(44) byte local44 = 0;
		@Pc(46) int local46 = 0;
		Static34.anIntArray392[0] = arg7;
		@Pc(53) int local53 = local44 + 1;
		Static161.anIntArray298[0] = arg3;
		@Pc(58) int[][] local58 = arg6.anIntArrayArray29;
		while (local53 != local46) {
			local15 = Static34.anIntArray392[local46];
			local17 = Static161.anIntArray298[local46];
			@Pc(73) int local73 = local17 - local30;
			@Pc(79) int local79 = local15 - arg6.anInt2120;
			@Pc(85) int local85 = local17 - arg6.anInt2134;
			@Pc(89) int local89 = local15 - local26;
			local46 = local46 + 1 & 0xFFF;
			if (arg8 == -4) {
				if (local15 == arg9 && local17 == arg1) {
					Static4.anInt124 = local17;
					Static7.anInt190 = local15;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static71.method5022(1, 1, local17, arg1, local15, arg2, arg4, arg9)) {
					Static7.anInt190 = local15;
					Static4.anInt124 = local17;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg6.method2124(arg5, arg4, arg2, arg1, local15, 1, arg9, local17, 1)) {
					Static4.anInt124 = local17;
					Static7.anInt190 = local15;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg6.method2126(local15, arg4, 1, arg5, local17, arg1, arg9, arg2)) {
					Static7.anInt190 = local15;
					Static4.anInt124 = local17;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg6.method2131(arg8, local17, 1, arg0, arg9, local15, arg1)) {
					Static4.anInt124 = local17;
					Static7.anInt190 = local15;
					return true;
				}
			} else if (arg6.method2132(arg9, 1, arg8, arg0, local15, local17, arg1)) {
				Static4.anInt124 = local17;
				Static7.anInt190 = local15;
				return true;
			}
			@Pc(248) int local248 = Static216.anIntArrayArray73[local89][local73] + 1;
			if (local89 > 0 && Static114.anIntArrayArray36[local89 - 1][local73] == 0 && (local58[local79 - 1][local85] & 0x42240000) == 0) {
				Static34.anIntArray392[local53] = local15 - 1;
				Static161.anIntArray298[local53] = local17;
				local53 = local53 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local89 - 1][local73] = 2;
				Static216.anIntArrayArray73[local89 - 1][local73] = local248;
			}
			if (local89 < 127 && Static114.anIntArrayArray36[local89 + 1][local73] == 0 && (local58[local79 + 1][local85] & 0x60240000) == 0) {
				Static34.anIntArray392[local53] = local15 + 1;
				Static161.anIntArray298[local53] = local17;
				Static114.anIntArrayArray36[local89 + 1][local73] = 8;
				local53 = local53 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local89 + 1][local73] = local248;
			}
			if (local73 > 0 && Static114.anIntArrayArray36[local89][local73 - 1] == 0 && (local58[local79][local85 - 1] & 0x40A40000) == 0) {
				Static34.anIntArray392[local53] = local15;
				Static161.anIntArray298[local53] = local17 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local89][local73 - 1] = 1;
				Static216.anIntArrayArray73[local89][local73 - 1] = local248;
			}
			if (local73 < 127 && Static114.anIntArrayArray36[local89][local73 + 1] == 0 && (local58[local79][local85 + 1] & 0x48240000) == 0) {
				Static34.anIntArray392[local53] = local15;
				Static161.anIntArray298[local53] = local17 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local89][local73 + 1] = 4;
				Static216.anIntArrayArray73[local89][local73 + 1] = local248;
			}
			if (local89 > 0 && local73 > 0 && Static114.anIntArrayArray36[local89 - 1][local73 - 1] == 0 && (local58[local79 - 1][local85 - 1] & 0x43A40000) == 0 && (local58[local79 - 1][local85] & 0x42240000) == 0 && (local58[local79][local85 - 1] & 0x40A40000) == 0) {
				Static34.anIntArray392[local53] = local15 - 1;
				Static161.anIntArray298[local53] = local17 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local89 - 1][local73 - 1] = 3;
				Static216.anIntArrayArray73[local89 - 1][local73 - 1] = local248;
			}
			if (local89 < 127 && local73 > 0 && Static114.anIntArrayArray36[local89 + 1][local73 - 1] == 0 && (local58[local79 + 1][local85 - 1] & 0x60E40000) == 0 && (local58[local79 + 1][local85] & 0x60240000) == 0 && (local58[local79][local85 - 1] & 0x40A40000) == 0) {
				Static34.anIntArray392[local53] = local15 + 1;
				Static161.anIntArray298[local53] = local17 - 1;
				Static114.anIntArrayArray36[local89 + 1][local73 - 1] = 9;
				local53 = local53 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local89 + 1][local73 - 1] = local248;
			}
			if (local89 > 0 && local73 < 127 && Static114.anIntArrayArray36[local89 - 1][local73 + 1] == 0 && (local58[local79 - 1][local85 + 1] & 0x4E240000) == 0 && (local58[local79 - 1][local85] & 0x42240000) == 0 && (local58[local79][local85 + 1] & 0x48240000) == 0) {
				Static34.anIntArray392[local53] = local15 - 1;
				Static161.anIntArray298[local53] = local17 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static114.anIntArrayArray36[local89 - 1][local73 + 1] = 6;
				Static216.anIntArrayArray73[local89 - 1][local73 + 1] = local248;
			}
			if (local89 < 127 && local73 < 127 && Static114.anIntArrayArray36[local89 + 1][local73 + 1] == 0 && (local58[local79 + 1][local85 + 1] & 0x78240000) == 0 && (local58[local79 + 1][local85] & 0x60240000) == 0 && (local58[local79][local85 + 1] & 0x48240000) == 0) {
				Static34.anIntArray392[local53] = local15 + 1;
				Static161.anIntArray298[local53] = local17 + 1;
				Static114.anIntArrayArray36[local89 + 1][local73 + 1] = 12;
				local53 = local53 + 1 & 0xFFF;
				Static216.anIntArrayArray73[local89 + 1][local73 + 1] = local248;
			}
		}
		Static4.anInt124 = local17;
		Static7.anInt190 = local15;
		return false;
	}
}
