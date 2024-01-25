import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!rga", name = "n", descriptor = "I")
	public static int anInt7407 = 0;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(IIIIIILclient!je;IIII)Z")
	public static boolean method6466(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class175 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg0;
		@Pc(7) int local7 = arg8;
		@Pc(25) int local25 = arg0 - 64;
		Static220.anIntArrayArray44[64][64] = 99;
		@Pc(36) int local36 = arg8 - 64;
		Static314.anIntArrayArray58[64][64] = 0;
		@Pc(44) byte local44 = 0;
		@Pc(46) int local46 = 0;
		Static55.anIntArray87[0] = arg0;
		@Pc(53) int local53 = local44 + 1;
		Static335.anIntArray379[0] = arg8;
		@Pc(58) int[][] local58 = arg5.anIntArrayArray48;
		while (local53 != local46) {
			local7 = Static335.anIntArray379[local46];
			local5 = Static55.anIntArray87[local46];
			local46 = local46 + 1 & 0xFFF;
			@Pc(78) int local78 = local5 - local25;
			@Pc(83) int local83 = local5 - arg5.anInt4875;
			@Pc(88) int local88 = local7 - arg5.anInt4866;
			@Pc(93) int local93 = local7 - local36;
			if (arg9 == -4) {
				if (local5 == arg1 && local7 == arg2) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg9 == -3) {
				if (Static175.method3006(1, local7, arg1, 1, arg4, arg2, local5, arg7)) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg9 == -2) {
				if (arg5.method4289(arg1, arg2, arg7, local5, 1, arg6, 1, local7, arg4)) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg9 == -1) {
				if (arg5.method4292(1, arg6, local7, arg1, local5, arg4, arg7, arg2)) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg9 == 0 || arg9 == 1 || arg9 == 2 || arg9 == 3 || arg9 == 9) {
				if (arg5.method4291(arg2, arg9, 1, arg1, arg3, local5, local7)) {
					Static530.anInt8535 = local7;
					Static166.anInt3402 = local5;
					return true;
				}
			} else if (arg5.method4287(arg9, local7, local5, arg1, 1, arg2, arg3)) {
				Static530.anInt8535 = local7;
				Static166.anInt3402 = local5;
				return true;
			}
			@Pc(247) int local247 = Static314.anIntArrayArray58[local78][local93] + 1;
			if (local78 > 0 && Static220.anIntArrayArray44[local78 - 1][local93] == 0 && (local58[local83 - 1][local88] & 0x42240000) == 0) {
				Static55.anIntArray87[local53] = local5 - 1;
				Static335.anIntArray379[local53] = local7;
				Static220.anIntArrayArray44[local78 - 1][local93] = 2;
				local53 = local53 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local78 - 1][local93] = local247;
			}
			if (local78 < 127 && Static220.anIntArrayArray44[local78 + 1][local93] == 0 && (local58[local83 + 1][local88] & 0x60240000) == 0) {
				Static55.anIntArray87[local53] = local5 + 1;
				Static335.anIntArray379[local53] = local7;
				local53 = local53 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local78 + 1][local93] = 8;
				Static314.anIntArrayArray58[local78 + 1][local93] = local247;
			}
			if (local93 > 0 && Static220.anIntArrayArray44[local78][local93 - 1] == 0 && (local58[local83][local88 - 1] & 0x40A40000) == 0) {
				Static55.anIntArray87[local53] = local5;
				Static335.anIntArray379[local53] = local7 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local78][local93 - 1] = 1;
				Static314.anIntArrayArray58[local78][local93 - 1] = local247;
			}
			if (local93 < 127 && Static220.anIntArrayArray44[local78][local93 + 1] == 0 && (local58[local83][local88 + 1] & 0x48240000) == 0) {
				Static55.anIntArray87[local53] = local5;
				Static335.anIntArray379[local53] = local7 + 1;
				Static220.anIntArrayArray44[local78][local93 + 1] = 4;
				local53 = local53 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local78][local93 + 1] = local247;
			}
			if (local78 > 0 && local93 > 0 && Static220.anIntArrayArray44[local78 - 1][local93 - 1] == 0 && (local58[local83 - 1][local88 - 1] & 0x43A40000) == 0 && (local58[local83 - 1][local88] & 0x42240000) == 0 && (local58[local83][local88 - 1] & 0x40A40000) == 0) {
				Static55.anIntArray87[local53] = local5 - 1;
				Static335.anIntArray379[local53] = local7 - 1;
				Static220.anIntArrayArray44[local78 - 1][local93 - 1] = 3;
				local53 = local53 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local78 - 1][local93 - 1] = local247;
			}
			if (local78 < 127 && local93 > 0 && Static220.anIntArrayArray44[local78 + 1][local93 - 1] == 0 && (local58[local83 + 1][local88 - 1] & 0x60E40000) == 0 && (local58[local83 + 1][local88] & 0x60240000) == 0 && (local58[local83][local88 - 1] & 0x40A40000) == 0) {
				Static55.anIntArray87[local53] = local5 + 1;
				Static335.anIntArray379[local53] = local7 - 1;
				local53 = local53 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local78 + 1][local93 - 1] = 9;
				Static314.anIntArrayArray58[local78 + 1][local93 - 1] = local247;
			}
			if (local78 > 0 && local93 < 127 && Static220.anIntArrayArray44[local78 - 1][local93 + 1] == 0 && (local58[local83 - 1][local88 + 1] & 0x4E240000) == 0 && (local58[local83 - 1][local88] & 0x42240000) == 0 && (local58[local83][local88 + 1] & 0x48240000) == 0) {
				Static55.anIntArray87[local53] = local5 - 1;
				Static335.anIntArray379[local53] = local7 + 1;
				Static220.anIntArrayArray44[local78 - 1][local93 + 1] = 6;
				local53 = local53 + 1 & 0xFFF;
				Static314.anIntArrayArray58[local78 - 1][local93 + 1] = local247;
			}
			if (local78 < 127 && local93 < 127 && Static220.anIntArrayArray44[local78 + 1][local93 + 1] == 0 && (local58[local83 + 1][local88 + 1] & 0x78240000) == 0 && (local58[local83 + 1][local88] & 0x60240000) == 0 && (local58[local83][local88 + 1] & 0x48240000) == 0) {
				Static55.anIntArray87[local53] = local5 + 1;
				Static335.anIntArray379[local53] = local7 + 1;
				local53 = local53 + 1 & 0xFFF;
				Static220.anIntArrayArray44[local78 + 1][local93 + 1] = 12;
				Static314.anIntArrayArray58[local78 + 1][local93 + 1] = local247;
			}
		}
		Static166.anInt3402 = local5;
		Static530.anInt8535 = local7;
		return false;
	}

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(Ljava/lang/String;IZI)I")
	public static int method6470(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(22) boolean local22 = false;
		@Pc(24) boolean local24 = false;
		@Pc(26) int local26 = 0;
		@Pc(29) int local29 = arg0.length();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			@Pc(40) char local40 = arg0.charAt(local31);
			if (local31 == 0) {
				if (local40 == '-') {
					local22 = true;
					continue;
				}
				if (local40 == '+') {
					continue;
				}
			}
			@Pc(75) int local75;
			if (local40 >= '0' && local40 <= '9') {
				local75 = local40 - '0';
			} else if (local40 >= 'A' && local40 <= 'Z') {
				local75 = local40 - '7';
			} else if (local40 >= 'a' && local40 <= 'z') {
				local75 = local40 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local75 >= arg1) {
				throw new NumberFormatException();
			}
			if (local22) {
				local75 = -local75;
			}
			@Pc(114) int local114 = arg1 * local26 + local75;
			if (local114 / arg1 != local26) {
				throw new NumberFormatException();
			}
			local24 = true;
			local26 = local114;
		}
		if (!local24) {
			throw new NumberFormatException();
		}
		return local26;
	}
}
