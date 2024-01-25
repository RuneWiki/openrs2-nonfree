import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!qu", name = "d", descriptor = "[Lclient!pu;")
	public static Class50[] aClass50Array12;

	@OriginalMember(owner = "client!qu", name = "m", descriptor = "Lclient!qc;")
	public static Class5_Sub45 aClass5_Sub45_1;

	@OriginalMember(owner = "client!qu", name = "w", descriptor = "I")
	public static int anInt8274;

	@OriginalMember(owner = "client!qu", name = "x", descriptor = "Lclient!sc;")
	public static Class314 aClass314_5;

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(III)I")
	public static int method7075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(IIIILclient!eo;IIIIII)Z")
	public static boolean method7077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class106 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg4;
		@Pc(7) int local7 = arg8;
		@Pc(20) int local20 = arg4 - 64;
		Static587.anIntArrayArray55[64][64] = 99;
		@Pc(31) int local31 = arg8 - 64;
		Static572.anIntArrayArray51[64][64] = 0;
		@Pc(39) byte local39 = 0;
		@Pc(41) int local41 = 0;
		Static267.anIntArray284[0] = arg4;
		@Pc(48) int local48 = local39 + 1;
		Static334.anIntArray356[0] = arg8;
		@Pc(53) int[][] local53 = arg3.anIntArrayArray8;
		while (local41 != local48) {
			local5 = Static267.anIntArray284[local41];
			local7 = Static334.anIntArray356[local41];
			@Pc(67) int local67 = local5 - arg3.anInt3007;
			@Pc(73) int local73 = local7 - arg3.anInt3006;
			@Pc(78) int local78 = local7 - local31;
			local41 = local41 + 1 & 0xFFF;
			@Pc(89) int local89 = local5 - local20;
			if (arg2 == -4) {
				if (local5 == arg7 && arg0 == local7) {
					Static150.anInt3076 = local5;
					Static192.anInt3707 = local7;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static173.method2972(local7, arg7, arg9, arg0, arg1, 1, 1, local5)) {
					Static150.anInt3076 = local5;
					Static192.anInt3707 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg3.method2670(1, 1, arg5, arg0, local5, arg7, arg9, arg1, local7)) {
					Static192.anInt3707 = local7;
					Static150.anInt3076 = local5;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg3.method2674(arg9, local7, local5, arg5, arg1, arg0, 1, arg7)) {
					Static192.anInt3707 = local7;
					Static150.anInt3076 = local5;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg3.method2665(arg0, local7, arg6, arg7, arg2, 1, local5)) {
					Static192.anInt3707 = local7;
					Static150.anInt3076 = local5;
					return true;
				}
			} else if (arg3.method2669(arg0, 1, local7, arg2, arg6, local5, arg7)) {
				Static192.anInt3707 = local7;
				Static150.anInt3076 = local5;
				return true;
			}
			@Pc(235) int local235 = Static572.anIntArrayArray51[local89][local78] + 1;
			if (local89 > 0 && Static587.anIntArrayArray55[local89 - 1][local78] == 0 && (local53[local67 - 1][local73] & 0x42240000) == 0) {
				Static267.anIntArray284[local48] = local5 - 1;
				Static334.anIntArray356[local48] = local7;
				local48 = local48 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local89 - 1][local78] = 2;
				Static572.anIntArrayArray51[local89 - 1][local78] = local235;
			}
			if (local89 < 127 && Static587.anIntArrayArray55[local89 + 1][local78] == 0 && (local53[local67 + 1][local73] & 0x60240000) == 0) {
				Static267.anIntArray284[local48] = local5 + 1;
				Static334.anIntArray356[local48] = local7;
				local48 = local48 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local89 + 1][local78] = 8;
				Static572.anIntArrayArray51[local89 + 1][local78] = local235;
			}
			if (local78 > 0 && Static587.anIntArrayArray55[local89][local78 - 1] == 0 && (local53[local67][local73 - 1] & 0x40A40000) == 0) {
				Static267.anIntArray284[local48] = local5;
				Static334.anIntArray356[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local89][local78 - 1] = 1;
				Static572.anIntArrayArray51[local89][local78 - 1] = local235;
			}
			if (local78 < 127 && Static587.anIntArrayArray55[local89][local78 + 1] == 0 && (local53[local67][local73 + 1] & 0x48240000) == 0) {
				Static267.anIntArray284[local48] = local5;
				Static334.anIntArray356[local48] = local7 + 1;
				Static587.anIntArrayArray55[local89][local78 + 1] = 4;
				local48 = local48 + 1 & 0xFFF;
				Static572.anIntArrayArray51[local89][local78 + 1] = local235;
			}
			if (local89 > 0 && local78 > 0 && Static587.anIntArrayArray55[local89 - 1][local78 - 1] == 0 && (local53[local67 - 1][local73 - 1] & 0x43A40000) == 0 && (local53[local67 - 1][local73] & 0x42240000) == 0 && (local53[local67][local73 - 1] & 0x40A40000) == 0) {
				Static267.anIntArray284[local48] = local5 - 1;
				Static334.anIntArray356[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local89 - 1][local78 - 1] = 3;
				Static572.anIntArrayArray51[local89 - 1][local78 - 1] = local235;
			}
			if (local89 < 127 && local78 > 0 && Static587.anIntArrayArray55[local89 + 1][local78 - 1] == 0 && (local53[local67 + 1][local73 - 1] & 0x60E40000) == 0 && (local53[local67 + 1][local73] & 0x60240000) == 0 && (local53[local67][local73 - 1] & 0x40A40000) == 0) {
				Static267.anIntArray284[local48] = local5 + 1;
				Static334.anIntArray356[local48] = local7 - 1;
				local48 = local48 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local89 + 1][local78 - 1] = 9;
				Static572.anIntArrayArray51[local89 + 1][local78 - 1] = local235;
			}
			if (local89 > 0 && local78 < 127 && Static587.anIntArrayArray55[local89 - 1][local78 + 1] == 0 && (local53[local67 - 1][local73 + 1] & 0x4E240000) == 0 && (local53[local67 - 1][local73] & 0x42240000) == 0 && (local53[local67][local73 + 1] & 0x48240000) == 0) {
				Static267.anIntArray284[local48] = local5 - 1;
				Static334.anIntArray356[local48] = local7 + 1;
				Static587.anIntArrayArray55[local89 - 1][local78 + 1] = 6;
				local48 = local48 + 1 & 0xFFF;
				Static572.anIntArrayArray51[local89 - 1][local78 + 1] = local235;
			}
			if (local89 < 127 && local78 < 127 && Static587.anIntArrayArray55[local89 + 1][local78 + 1] == 0 && (local53[local67 + 1][local73 + 1] & 0x78240000) == 0 && (local53[local67 + 1][local73] & 0x60240000) == 0 && (local53[local67][local73 + 1] & 0x48240000) == 0) {
				Static267.anIntArray284[local48] = local5 + 1;
				Static334.anIntArray356[local48] = local7 + 1;
				local48 = local48 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local89 + 1][local78 + 1] = 12;
				Static572.anIntArrayArray51[local89 + 1][local78 + 1] = local235;
			}
		}
		Static150.anInt3076 = local5;
		Static192.anInt3707 = local7;
		return false;
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(JJ)J")
	public static long method7083(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}
}
