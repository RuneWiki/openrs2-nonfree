import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!mca", name = "v", descriptor = "[I")
	public static int[] anIntArray365;

	@OriginalMember(owner = "client!mca", name = "u", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_132 = new Class81(4, 0);

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(ILclient!ev;IIIBIIIII)Z")
	public static boolean method4812(@OriginalArg(0) int arg0, @OriginalArg(1) Class94 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg0;
		@Pc(23) int local23 = arg9 - 64;
		Static252.anIntArrayArray62[64][64] = 99;
		@Pc(34) int local34 = arg0 - 64;
		Static89.anIntArrayArray10[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static341.anIntArray410[0] = arg9;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static343.anIntArray412[0] = arg0;
		@Pc(56) int[][] local56 = arg1.anIntArrayArray20;
		while (local51 != local48) {
			local7 = Static341.anIntArray410[local48];
			local9 = Static343.anIntArray412[local48];
			@Pc(71) int local71 = local9 - local34;
			@Pc(76) int local76 = local7 - local23;
			local48 = local48 + 1 & 0xFFF;
			@Pc(87) int local87 = local7 - arg1.anInt2619;
			@Pc(92) int local92 = local9 - arg1.anInt2626;
			if (arg7 == -4) {
				if (arg2 == local7 && local9 == arg4) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static239.method3923(arg2, local9, arg4, 2, local7, arg3, 2, arg8)) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg1.method2223(arg2, 2, local7, 2, arg8, arg5, arg3, local9, arg4)) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg1.method2214(arg8, local9, local7, arg5, arg4, 2, arg2, arg3)) {
					Static126.anInt6655 = local9;
					Static492.anInt8284 = local7;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg1.method2222(arg6, arg4, 2, arg7, arg2, local7, local9)) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg1.method2215(arg2, 2, arg4, local9, arg6, arg7, local7)) {
				Static126.anInt6655 = local9;
				Static492.anInt8284 = local7;
				return true;
			}
			@Pc(241) int local241 = Static89.anIntArrayArray10[local76][local71] + 1;
			if (local76 > 0 && Static252.anIntArrayArray62[local76 - 1][local71] == 0 && (local56[local87 - 1][local92] & 0x43A40000) == 0 && (local56[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static341.anIntArray410[local51] = local7 - 1;
				Static343.anIntArray412[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local76 - 1][local71] = 2;
				Static89.anIntArrayArray10[local76 - 1][local71] = local241;
			}
			if (local76 < 126 && Static252.anIntArrayArray62[local76 + 1][local71] == 0 && (local56[local87 + 2][local92] & 0x60E40000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static341.anIntArray410[local51] = local7 + 1;
				Static343.anIntArray412[local51] = local9;
				Static252.anIntArrayArray62[local76 + 1][local71] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local76 + 1][local71] = local241;
			}
			if (local71 > 0 && Static252.anIntArrayArray62[local76][local71 - 1] == 0 && (local56[local87][local92 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static341.anIntArray410[local51] = local7;
				Static343.anIntArray412[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local76][local71 - 1] = 1;
				Static89.anIntArrayArray10[local76][local71 - 1] = local241;
			}
			if (local71 < 126 && Static252.anIntArrayArray62[local76][local71 + 1] == 0 && (local56[local87][local92 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static341.anIntArray410[local51] = local7;
				Static343.anIntArray412[local51] = local9 + 1;
				Static252.anIntArrayArray62[local76][local71 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local76][local71 + 1] = local241;
			}
			if (local76 > 0 && local71 > 0 && Static252.anIntArrayArray62[local76 - 1][local71 - 1] == 0 && (local56[local87 - 1][local92] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local87][local92 - 1] & 0x63E40000) == 0) {
				Static341.anIntArray410[local51] = local7 - 1;
				Static343.anIntArray412[local51] = local9 - 1;
				Static252.anIntArrayArray62[local76 - 1][local71 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local76 - 1][local71 - 1] = local241;
			}
			if (local76 < 126 && local71 > 0 && Static252.anIntArrayArray62[local76 + 1][local71 - 1] == 0 && (local56[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local92] & 0x78E40000) == 0) {
				Static341.anIntArray410[local51] = local7 + 1;
				Static343.anIntArray412[local51] = local9 - 1;
				Static252.anIntArrayArray62[local76 + 1][local71 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local76 + 1][local71 - 1] = local241;
			}
			if (local76 > 0 && local71 < 126 && Static252.anIntArrayArray62[local76 - 1][local71 + 1] == 0 && (local56[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local87][local92 + 2] & 0x7E240000) == 0) {
				Static341.anIntArray410[local51] = local7 - 1;
				Static343.anIntArray412[local51] = local9 + 1;
				Static252.anIntArrayArray62[local76 - 1][local71 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local76 - 1][local71 + 1] = local241;
			}
			if (local76 < 126 && local71 < 126 && Static252.anIntArrayArray62[local76 + 1][local71 + 1] == 0 && (local56[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static341.anIntArray410[local51] = local7 + 1;
				Static343.anIntArray412[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local76 + 1][local71 + 1] = 12;
				Static89.anIntArrayArray10[local76 + 1][local71 + 1] = local241;
			}
		}
		Static492.anInt8284 = local7;
		Static126.anInt6655 = local9;
		return false;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(BI)V")
	public static void method4814(@OriginalArg(1) int arg0) {
		if (Static562.anInt9126 == arg0) {
			return;
		}
		Static500.anInt6888 = Static573.anInt9325 = Static93.anIntArray115[arg0];
		Static377.method5473();
		Static582.anIntArrayArray61 = new int[Static500.anInt6888][Static573.anInt9325];
		Static70.anIntArrayArray9 = new int[Static500.anInt6888][Static573.anInt9325];
		Static414.anIntArrayArrayArray16 = new int[4][Static500.anInt6888 >> 3][Static573.anInt9325 >> 3];
		for (@Pc(52) int local52 = 0; local52 < 4; local52++) {
			Static28.aClass94Array2[local52] = Static49.method1136(Static500.anInt6888, Static573.anInt9325);
		}
		Static221.aByteArrayArrayArray5 = new byte[4][Static500.anInt6888][Static573.anInt9325];
		Static309.method4757(Static500.anInt6888, Static573.anInt9325);
		Static69.method1447(Static136.aClass12_8, Static500.anInt6888 >> 3, Static573.anInt9325 >> 3);
		Static562.anInt9126 = arg0;
	}

	@OriginalMember(owner = "client!mca", name = "e", descriptor = "(B)Ljava/lang/String;")
	public static String method4819() {
		return Static294.aBoolean407 || Static323.aClass1_Sub23_1 == null ? "" : Static323.aClass1_Sub23_1.aString55;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(IIZI)Ljava/lang/String;")
	public static String method4820(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(40) int local40 = 2;
		@Pc(44) int local44 = arg0 / 10;
		while (local44 != 0) {
			local44 /= 10;
			local40++;
		}
		@Pc(56) char[] local56 = new char[local40];
		local56[0] = '+';
		for (@Pc(64) int local64 = local40 - 1; local64 > 0; local64--) {
			@Pc(68) int local68 = arg0;
			arg0 /= 10;
			@Pc(79) int local79 = local68 - arg0 * 10;
			if (local79 >= 10) {
				local56[local64] = (char) (local79 + 87);
			} else {
				local56[local64] = (char) (local79 + 48);
			}
		}
		return new String(local56);
	}
}
