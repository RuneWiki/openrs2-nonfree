import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!qk", name = "j", descriptor = "[I")
	public static final int[] anIntArray505 = new int[5];

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method6300(@OriginalArg(1) Class1_Sub20_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static121.anInt2449; local3++) {
			@Pc(9) int local9 = Static263.anIntArray300[local3];
			@Pc(13) Class20_Sub2_Sub4_Sub1_Sub1 local13 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local9];
			@Pc(17) int local17 = arg0.method4393();
			if ((local17 & 0x1) != 0) {
				local17 += arg0.method4393() << 8;
			}
			if ((local17 & 0x800) != 0) {
				local17 += arg0.method4393() << 16;
			}
			Static513.method7033(local17, local13, arg0, local9);
		}
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIILclient!ev;IIIBIII)Z")
	public static boolean method6304(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class94 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg4;
		@Pc(22) int local22 = arg7 - 64;
		Static252.anIntArrayArray62[64][64] = 99;
		@Pc(33) int local33 = arg4 - 64;
		Static89.anIntArrayArray10[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static341.anIntArray410[0] = arg7;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static343.anIntArray412[0] = arg4;
		@Pc(55) int[][] local55 = arg3.anIntArrayArray20;
		while (local47 != local50) {
			local9 = Static343.anIntArray412[local47];
			local7 = Static341.anIntArray410[local47];
			@Pc(71) int local71 = local7 - arg3.anInt2619;
			@Pc(76) int local76 = local9 - arg3.anInt2626;
			@Pc(81) int local81 = local9 - local33;
			local47 = local47 + 1 & 0xFFF;
			@Pc(92) int local92 = local7 - local22;
			if (arg1 == -4) {
				if (arg9 == local7 && arg8 == local9) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static239.method3923(arg9, local9, arg8, 1, local7, arg6, 1, arg5)) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg3.method2223(arg9, 1, local7, 1, arg5, arg0, arg6, local9, arg8)) {
					Static126.anInt6655 = local9;
					Static492.anInt8284 = local7;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg3.method2214(arg5, local9, local7, arg0, arg8, 1, arg9, arg6)) {
					Static126.anInt6655 = local9;
					Static492.anInt8284 = local7;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg3.method2222(arg2, arg8, 1, arg1, arg9, local7, local9)) {
					Static492.anInt8284 = local7;
					Static126.anInt6655 = local9;
					return true;
				}
			} else if (arg3.method2215(arg9, 1, arg8, local9, arg2, arg1, local7)) {
				Static126.anInt6655 = local9;
				Static492.anInt8284 = local7;
				return true;
			}
			@Pc(251) int local251 = Static89.anIntArrayArray10[local92][local81] + 1;
			if (local92 > 0 && Static252.anIntArrayArray62[local92 - 1][local81] == 0 && (local55[local71 - 1][local76] & 0x42240000) == 0) {
				Static341.anIntArray410[local50] = local7 - 1;
				Static343.anIntArray412[local50] = local9;
				Static252.anIntArrayArray62[local92 - 1][local81] = 2;
				local50 = local50 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local92 - 1][local81] = local251;
			}
			if (local92 < 127 && Static252.anIntArrayArray62[local92 + 1][local81] == 0 && (local55[local71 + 1][local76] & 0x60240000) == 0) {
				Static341.anIntArray410[local50] = local7 + 1;
				Static343.anIntArray412[local50] = local9;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local92 + 1][local81] = 8;
				Static89.anIntArrayArray10[local92 + 1][local81] = local251;
			}
			if (local81 > 0 && Static252.anIntArrayArray62[local92][local81 - 1] == 0 && (local55[local71][local76 - 1] & 0x40A40000) == 0) {
				Static341.anIntArray410[local50] = local7;
				Static343.anIntArray412[local50] = local9 - 1;
				Static252.anIntArrayArray62[local92][local81 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local92][local81 - 1] = local251;
			}
			if (local81 < 127 && Static252.anIntArrayArray62[local92][local81 + 1] == 0 && (local55[local71][local76 + 1] & 0x48240000) == 0) {
				Static341.anIntArray410[local50] = local7;
				Static343.anIntArray412[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local92][local81 + 1] = 4;
				Static89.anIntArrayArray10[local92][local81 + 1] = local251;
			}
			if (local92 > 0 && local81 > 0 && Static252.anIntArrayArray62[local92 - 1][local81 - 1] == 0 && (local55[local71 - 1][local76 - 1] & 0x43A40000) == 0 && (local55[local71 - 1][local76] & 0x42240000) == 0 && (local55[local71][local76 - 1] & 0x40A40000) == 0) {
				Static341.anIntArray410[local50] = local7 - 1;
				Static343.anIntArray412[local50] = local9 - 1;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local92 - 1][local81 - 1] = 3;
				Static89.anIntArrayArray10[local92 - 1][local81 - 1] = local251;
			}
			if (local92 < 127 && local81 > 0 && Static252.anIntArrayArray62[local92 + 1][local81 - 1] == 0 && (local55[local71 + 1][local76 - 1] & 0x60E40000) == 0 && (local55[local71 + 1][local76] & 0x60240000) == 0 && (local55[local71][local76 - 1] & 0x40A40000) == 0) {
				Static341.anIntArray410[local50] = local7 + 1;
				Static343.anIntArray412[local50] = local9 - 1;
				Static252.anIntArrayArray62[local92 + 1][local81 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local92 + 1][local81 - 1] = local251;
			}
			if (local92 > 0 && local81 < 127 && Static252.anIntArrayArray62[local92 - 1][local81 + 1] == 0 && (local55[local71 - 1][local76 + 1] & 0x4E240000) == 0 && (local55[local71 - 1][local76] & 0x42240000) == 0 && (local55[local71][local76 + 1] & 0x48240000) == 0) {
				Static341.anIntArray410[local50] = local7 - 1;
				Static343.anIntArray412[local50] = local9 + 1;
				Static252.anIntArrayArray62[local92 - 1][local81 + 1] = 6;
				local50 = local50 + 1 & 0xFFF;
				Static89.anIntArrayArray10[local92 - 1][local81 + 1] = local251;
			}
			if (local92 < 127 && local81 < 127 && Static252.anIntArrayArray62[local92 + 1][local81 + 1] == 0 && (local55[local71 + 1][local76 + 1] & 0x78240000) == 0 && (local55[local71 + 1][local76] & 0x60240000) == 0 && (local55[local71][local76 + 1] & 0x48240000) == 0) {
				Static341.anIntArray410[local50] = local7 + 1;
				Static343.anIntArray412[local50] = local9 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static252.anIntArrayArray62[local92 + 1][local81 + 1] = 12;
				Static89.anIntArrayArray10[local92 + 1][local81 + 1] = local251;
			}
		}
		Static492.anInt8284 = local7;
		Static126.anInt6655 = local9;
		return false;
	}
}
