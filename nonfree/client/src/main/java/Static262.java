import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!mba;")
	public static final Class216 aClass216_43 = new Class216();

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!nfa;IIIIIIIII)Z")
	public static boolean method4384(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg3;
		@Pc(18) int local18 = arg2 - 64;
		@Pc(23) int local23 = arg3 - 64;
		Static634.anIntArrayArray60[64][64] = 99;
		Static184.anIntArrayArray19[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static333.anIntArray343[0] = arg2;
		@Pc(46) int local46 = local37 + 1;
		Static58.anIntArray68[0] = arg3;
		@Pc(51) int[][] local51 = arg1.anIntArrayArray33;
		while (local46 != local39) {
			local7 = Static333.anIntArray343[local39];
			local9 = Static58.anIntArray68[local39];
			@Pc(68) int local68 = local7 - local18;
			@Pc(74) int local74 = local9 - arg1.anInt6790;
			local39 = local39 + 1 & 0xFFF;
			@Pc(85) int local85 = local9 - local23;
			@Pc(90) int local90 = local7 - arg1.anInt6799;
			if (arg6 == -4) {
				if (arg0 == local7 && local9 == arg9) {
					Static58.anInt1078 = local9;
					Static255.anInt4980 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static559.method7954(arg4, local7, arg9, arg0, 1, arg7, 1, local9)) {
					Static58.anInt1078 = local9;
					Static255.anInt4980 = local7;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg1.method5909(arg4, 1, local9, 1, arg8, arg9, arg7, arg0, local7)) {
					Static255.anInt4980 = local7;
					Static58.anInt1078 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg1.method5903(arg4, arg8, local7, 1, local9, arg0, arg7, arg9)) {
					Static255.anInt4980 = local7;
					Static58.anInt1078 = local9;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg1.method5902(arg9, arg6, arg5, arg0, local9, 1, local7)) {
					Static255.anInt4980 = local7;
					Static58.anInt1078 = local9;
					return true;
				}
			} else if (arg1.method5910(arg0, 1, arg9, local7, arg6, local9, arg5)) {
				Static58.anInt1078 = local9;
				Static255.anInt4980 = local7;
				return true;
			}
			@Pc(244) int local244 = Static184.anIntArrayArray19[local68][local85] + 1;
			if (local68 > 0 && Static634.anIntArrayArray60[local68 - 1][local85] == 0 && (local51[local90 - 1][local74] & 0x42240000) == 0) {
				Static333.anIntArray343[local46] = local7 - 1;
				Static58.anIntArray68[local46] = local9;
				Static634.anIntArrayArray60[local68 - 1][local85] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local68 - 1][local85] = local244;
			}
			if (local68 < 127 && Static634.anIntArrayArray60[local68 + 1][local85] == 0 && (local51[local90 + 1][local74] & 0x60240000) == 0) {
				Static333.anIntArray343[local46] = local7 + 1;
				Static58.anIntArray68[local46] = local9;
				Static634.anIntArrayArray60[local68 + 1][local85] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local68 + 1][local85] = local244;
			}
			if (local85 > 0 && Static634.anIntArrayArray60[local68][local85 - 1] == 0 && (local51[local90][local74 - 1] & 0x40A40000) == 0) {
				Static333.anIntArray343[local46] = local7;
				Static58.anIntArray68[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray60[local68][local85 - 1] = 1;
				Static184.anIntArrayArray19[local68][local85 - 1] = local244;
			}
			if (local85 < 127 && Static634.anIntArrayArray60[local68][local85 + 1] == 0 && (local51[local90][local74 + 1] & 0x48240000) == 0) {
				Static333.anIntArray343[local46] = local7;
				Static58.anIntArray68[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray60[local68][local85 + 1] = 4;
				Static184.anIntArrayArray19[local68][local85 + 1] = local244;
			}
			if (local68 > 0 && local85 > 0 && Static634.anIntArrayArray60[local68 - 1][local85 - 1] == 0 && (local51[local90 - 1][local74 - 1] & 0x43A40000) == 0 && (local51[local90 - 1][local74] & 0x42240000) == 0 && (local51[local90][local74 - 1] & 0x40A40000) == 0) {
				Static333.anIntArray343[local46] = local7 - 1;
				Static58.anIntArray68[local46] = local9 - 1;
				Static634.anIntArrayArray60[local68 - 1][local85 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local68 - 1][local85 - 1] = local244;
			}
			if (local68 < 127 && local85 > 0 && Static634.anIntArrayArray60[local68 + 1][local85 - 1] == 0 && (local51[local90 + 1][local74 - 1] & 0x60E40000) == 0 && (local51[local90 + 1][local74] & 0x60240000) == 0 && (local51[local90][local74 - 1] & 0x40A40000) == 0) {
				Static333.anIntArray343[local46] = local7 + 1;
				Static58.anIntArray68[local46] = local9 - 1;
				Static634.anIntArrayArray60[local68 + 1][local85 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local68 + 1][local85 - 1] = local244;
			}
			if (local68 > 0 && local85 < 127 && Static634.anIntArrayArray60[local68 - 1][local85 + 1] == 0 && (local51[local90 - 1][local74 + 1] & 0x4E240000) == 0 && (local51[local90 - 1][local74] & 0x42240000) == 0 && (local51[local90][local74 + 1] & 0x48240000) == 0) {
				Static333.anIntArray343[local46] = local7 - 1;
				Static58.anIntArray68[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray60[local68 - 1][local85 + 1] = 6;
				Static184.anIntArrayArray19[local68 - 1][local85 + 1] = local244;
			}
			if (local68 < 127 && local85 < 127 && Static634.anIntArrayArray60[local68 + 1][local85 + 1] == 0 && (local51[local90 + 1][local74 + 1] & 0x78240000) == 0 && (local51[local90 + 1][local74] & 0x60240000) == 0 && (local51[local90][local74 + 1] & 0x48240000) == 0) {
				Static333.anIntArray343[local46] = local7 + 1;
				Static58.anIntArray68[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static634.anIntArrayArray60[local68 + 1][local85 + 1] = 12;
				Static184.anIntArrayArray19[local68 + 1][local85 + 1] = local244;
			}
		}
		Static255.anInt4980 = local7;
		Static58.anInt1078 = local9;
		return false;
	}
}
