import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIILclient!vba;IIIIII)Z")
	public static boolean method6872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class299 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg0;
		@Pc(12) int local12 = arg9;
		@Pc(21) int local21 = arg0 - 64;
		Static355.anIntArrayArray24[64][64] = 99;
		@Pc(32) int local32 = arg9 - 64;
		Static143.anIntArrayArray30[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static460.anIntArray620[0] = arg0;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static529.anIntArray773[0] = arg9;
		@Pc(54) int[][] local54 = arg3.anIntArrayArray84;
		while (local49 != local46) {
			local12 = Static529.anIntArray773[local46];
			local5 = Static460.anIntArray620[local46];
			local46 = local46 + 1 & 0xFFF;
			@Pc(74) int local74 = local5 - local21;
			@Pc(79) int local79 = local12 - local32;
			@Pc(84) int local84 = local5 - arg3.anInt8548;
			@Pc(89) int local89 = local12 - arg3.anInt8569;
			if (arg4 == -4) {
				if (local5 == arg6 && arg7 == local12) {
					Static144.anInt3323 = local5;
					Static504.anInt8566 = local12;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static76.method1970(2, arg6, local5, local12, arg2, arg7, arg8, 2)) {
					Static504.anInt8566 = local12;
					Static144.anInt3323 = local5;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg3.method7242(local5, arg2, 2, arg1, 2, local12, arg6, arg8, arg7)) {
					Static504.anInt8566 = local12;
					Static144.anInt3323 = local5;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg3.method7227(arg7, 2, arg6, local5, arg2, local12, arg1, arg8)) {
					Static144.anInt3323 = local5;
					Static504.anInt8566 = local12;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg3.method7240(arg7, local12, 2, arg5, arg6, arg4, local5)) {
					Static504.anInt8566 = local12;
					Static144.anInt3323 = local5;
					return true;
				}
			} else if (arg3.method7236(2, local12, arg7, arg6, arg4, arg5, local5)) {
				Static504.anInt8566 = local12;
				Static144.anInt3323 = local5;
				return true;
			}
			@Pc(235) int local235 = Static143.anIntArrayArray30[local74][local79] + 1;
			if (local74 > 0 && Static355.anIntArrayArray24[local74 - 1][local79] == 0 && (local54[local84 - 1][local89] & 0x43A40000) == 0 && (local54[local84 - 1][local89 + 1] & 0x4E240000) == 0) {
				Static460.anIntArray620[local49] = local5 - 1;
				Static529.anIntArray773[local49] = local12;
				local49 = local49 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local74 - 1][local79] = 2;
				Static143.anIntArrayArray30[local74 - 1][local79] = local235;
			}
			if (local74 < 126 && Static355.anIntArrayArray24[local74 + 1][local79] == 0 && (local54[local84 + 2][local89] & 0x60E40000) == 0 && (local54[local84 + 2][local89 + 1] & 0x78240000) == 0) {
				Static460.anIntArray620[local49] = local5 + 1;
				Static529.anIntArray773[local49] = local12;
				local49 = local49 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local74 + 1][local79] = 8;
				Static143.anIntArrayArray30[local74 + 1][local79] = local235;
			}
			if (local79 > 0 && Static355.anIntArrayArray24[local74][local79 - 1] == 0 && (local54[local84][local89 - 1] & 0x43A40000) == 0 && (local54[local84 + 1][local89 - 1] & 0x60E40000) == 0) {
				Static460.anIntArray620[local49] = local5;
				Static529.anIntArray773[local49] = local12 - 1;
				Static355.anIntArrayArray24[local74][local79 - 1] = 1;
				local49 = local49 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local74][local79 - 1] = local235;
			}
			if (local79 < 126 && Static355.anIntArrayArray24[local74][local79 + 1] == 0 && (local54[local84][local89 + 2] & 0x4E240000) == 0 && (local54[local84 + 1][local89 + 2] & 0x78240000) == 0) {
				Static460.anIntArray620[local49] = local5;
				Static529.anIntArray773[local49] = local12 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local74][local79 + 1] = 4;
				Static143.anIntArrayArray30[local74][local79 + 1] = local235;
			}
			if (local74 > 0 && local79 > 0 && Static355.anIntArrayArray24[local74 - 1][local79 - 1] == 0 && (local54[local84 - 1][local89] & 0x4FA40000) == 0 && (local54[local84 - 1][local89 - 1] & 0x43A40000) == 0 && (local54[local84][local89 - 1] & 0x63E40000) == 0) {
				Static460.anIntArray620[local49] = local5 - 1;
				Static529.anIntArray773[local49] = local12 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local74 - 1][local79 - 1] = 3;
				Static143.anIntArrayArray30[local74 - 1][local79 - 1] = local235;
			}
			if (local74 < 126 && local79 > 0 && Static355.anIntArrayArray24[local74 + 1][local79 - 1] == 0 && (local54[local84 + 1][local89 - 1] & 0x63E40000) == 0 && (local54[local84 + 2][local89 - 1] & 0x60E40000) == 0 && (local54[local84 + 2][local89] & 0x78E40000) == 0) {
				Static460.anIntArray620[local49] = local5 + 1;
				Static529.anIntArray773[local49] = local12 - 1;
				Static355.anIntArrayArray24[local74 + 1][local79 - 1] = 9;
				local49 = local49 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local74 + 1][local79 - 1] = local235;
			}
			if (local74 > 0 && local79 < 126 && Static355.anIntArrayArray24[local74 - 1][local79 + 1] == 0 && (local54[local84 - 1][local89 + 1] & 0x4FA40000) == 0 && (local54[local84 - 1][local89 + 2] & 0x4E240000) == 0 && (local54[local84][local89 + 2] & 0x7E240000) == 0) {
				Static460.anIntArray620[local49] = local5 - 1;
				Static529.anIntArray773[local49] = local12 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static355.anIntArrayArray24[local74 - 1][local79 + 1] = 6;
				Static143.anIntArrayArray30[local74 - 1][local79 + 1] = local235;
			}
			if (local74 < 126 && local79 < 126 && Static355.anIntArrayArray24[local74 + 1][local79 + 1] == 0 && (local54[local84 + 1][local89 + 2] & 0x7E240000) == 0 && (local54[local84 + 2][local89 + 2] & 0x78240000) == 0 && (local54[local84 + 2][local89 + 1] & 0x78E40000) == 0) {
				Static460.anIntArray620[local49] = local5 + 1;
				Static529.anIntArray773[local49] = local12 + 1;
				Static355.anIntArrayArray24[local74 + 1][local79 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static143.anIntArrayArray30[local74 + 1][local79 + 1] = local235;
			}
		}
		Static504.anInt8566 = local12;
		Static144.anInt3323 = local5;
		return false;
	}
}
