import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	public static int anInt5797;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
	public static boolean aBoolean504 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB)Z")
	public static boolean method4800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIILclient!eo;IIIIIII)Z")
	public static boolean method4804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg2;
		@Pc(7) int local7 = arg1;
		@Pc(16) int local16 = arg2 - 64;
		@Pc(21) int local21 = arg1 - 64;
		Static587.anIntArrayArray55[64][64] = 99;
		Static572.anIntArrayArray51[64][64] = 0;
		@Pc(35) byte local35 = 0;
		Static267.anIntArray284[0] = arg2;
		@Pc(41) int local41 = 0;
		@Pc(52) int local52 = local35 + 1;
		Static334.anIntArray356[0] = arg1;
		@Pc(57) int[][] local57 = arg3.anIntArrayArray8;
		while (local52 != local41) {
			local5 = Static267.anIntArray284[local41];
			local7 = Static334.anIntArray356[local41];
			@Pc(71) int local71 = local5 - local16;
			@Pc(76) int local76 = local7 - local21;
			local41 = local41 + 1 & 0xFFF;
			@Pc(88) int local88 = local5 - arg3.anInt3007;
			@Pc(93) int local93 = local7 - arg3.anInt3006;
			if (arg6 == -4) {
				if (arg7 == local5 && local7 == arg0) {
					Static150.anInt3076 = local5;
					Static192.anInt3707 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static173.method2972(local7, arg7, arg5, arg0, arg9, 2, 2, local5)) {
					Static150.anInt3076 = local5;
					Static192.anInt3707 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg3.method2670(2, 2, arg8, arg0, local5, arg7, arg5, arg9, local7)) {
					Static192.anInt3707 = local7;
					Static150.anInt3076 = local5;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg3.method2674(arg5, local7, local5, arg8, arg9, arg0, 2, arg7)) {
					Static192.anInt3707 = local7;
					Static150.anInt3076 = local5;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg3.method2665(arg0, local7, arg4, arg7, arg6, 2, local5)) {
					Static192.anInt3707 = local7;
					Static150.anInt3076 = local5;
					return true;
				}
			} else if (arg3.method2669(arg0, 2, local7, arg6, arg4, local5, arg7)) {
				Static192.anInt3707 = local7;
				Static150.anInt3076 = local5;
				return true;
			}
			@Pc(246) int local246 = Static572.anIntArrayArray51[local71][local76] + 1;
			if (local71 > 0 && Static587.anIntArrayArray55[local71 - 1][local76] == 0 && (local57[local88 - 1][local93] & 0x43A40000) == 0 && (local57[local88 - 1][local93 + 1] & 0x4E240000) == 0) {
				Static267.anIntArray284[local52] = local5 - 1;
				Static334.anIntArray356[local52] = local7;
				local52 = local52 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local71 - 1][local76] = 2;
				Static572.anIntArrayArray51[local71 - 1][local76] = local246;
			}
			if (local71 < 126 && Static587.anIntArrayArray55[local71 + 1][local76] == 0 && (local57[local88 + 2][local93] & 0x60E40000) == 0 && (local57[local88 + 2][local93 + 1] & 0x78240000) == 0) {
				Static267.anIntArray284[local52] = local5 + 1;
				Static334.anIntArray356[local52] = local7;
				local52 = local52 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local71 + 1][local76] = 8;
				Static572.anIntArrayArray51[local71 + 1][local76] = local246;
			}
			if (local76 > 0 && Static587.anIntArrayArray55[local71][local76 - 1] == 0 && (local57[local88][local93 - 1] & 0x43A40000) == 0 && (local57[local88 + 1][local93 - 1] & 0x60E40000) == 0) {
				Static267.anIntArray284[local52] = local5;
				Static334.anIntArray356[local52] = local7 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local71][local76 - 1] = 1;
				Static572.anIntArrayArray51[local71][local76 - 1] = local246;
			}
			if (local76 < 126 && Static587.anIntArrayArray55[local71][local76 + 1] == 0 && (local57[local88][local93 + 2] & 0x4E240000) == 0 && (local57[local88 + 1][local93 + 2] & 0x78240000) == 0) {
				Static267.anIntArray284[local52] = local5;
				Static334.anIntArray356[local52] = local7 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local71][local76 + 1] = 4;
				Static572.anIntArrayArray51[local71][local76 + 1] = local246;
			}
			if (local71 > 0 && local76 > 0 && Static587.anIntArrayArray55[local71 - 1][local76 - 1] == 0 && (local57[local88 - 1][local93] & 0x4FA40000) == 0 && (local57[local88 - 1][local93 - 1] & 0x43A40000) == 0 && (local57[local88][local93 - 1] & 0x63E40000) == 0) {
				Static267.anIntArray284[local52] = local5 - 1;
				Static334.anIntArray356[local52] = local7 - 1;
				local52 = local52 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local71 - 1][local76 - 1] = 3;
				Static572.anIntArrayArray51[local71 - 1][local76 - 1] = local246;
			}
			if (local71 < 126 && local76 > 0 && Static587.anIntArrayArray55[local71 + 1][local76 - 1] == 0 && (local57[local88 + 1][local93 - 1] & 0x63E40000) == 0 && (local57[local88 + 2][local93 - 1] & 0x60E40000) == 0 && (local57[local88 + 2][local93] & 0x78E40000) == 0) {
				Static267.anIntArray284[local52] = local5 + 1;
				Static334.anIntArray356[local52] = local7 - 1;
				Static587.anIntArrayArray55[local71 + 1][local76 - 1] = 9;
				local52 = local52 + 1 & 0xFFF;
				Static572.anIntArrayArray51[local71 + 1][local76 - 1] = local246;
			}
			if (local71 > 0 && local76 < 126 && Static587.anIntArrayArray55[local71 - 1][local76 + 1] == 0 && (local57[local88 - 1][local93 + 1] & 0x4FA40000) == 0 && (local57[local88 - 1][local93 + 2] & 0x4E240000) == 0 && (local57[local88][local93 + 2] & 0x7E240000) == 0) {
				Static267.anIntArray284[local52] = local5 - 1;
				Static334.anIntArray356[local52] = local7 + 1;
				local52 = local52 + 1 & 0xFFF;
				Static587.anIntArrayArray55[local71 - 1][local76 + 1] = 6;
				Static572.anIntArrayArray51[local71 - 1][local76 + 1] = local246;
			}
			if (local71 < 126 && local76 < 126 && Static587.anIntArrayArray55[local71 + 1][local76 + 1] == 0 && (local57[local88 + 1][local93 + 2] & 0x7E240000) == 0 && (local57[local88 + 2][local93 + 2] & 0x78240000) == 0 && (local57[local88 + 2][local93 + 1] & 0x78E40000) == 0) {
				Static267.anIntArray284[local52] = local5 + 1;
				Static334.anIntArray356[local52] = local7 + 1;
				Static587.anIntArrayArray55[local71 + 1][local76 + 1] = 12;
				local52 = local52 + 1 & 0xFFF;
				Static572.anIntArrayArray51[local71 + 1][local76 + 1] = local246;
			}
		}
		Static192.anInt3707 = local7;
		Static150.anInt3076 = local5;
		return false;
	}
}
