import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!ra", name = "fb", descriptor = "Lclient!iv;")
	public static final Class168 aClass168_10 = new Class168(1);

	@OriginalMember(owner = "client!ra", name = "mb", descriptor = "J")
	public static long aLong214 = -1L;

	@OriginalMember(owner = "client!ra", name = "pb", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray5 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!ra", name = "rb", descriptor = "Z")
	public static boolean aBoolean590 = true;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!nfa;IIIIIIII)Z")
	public static boolean method7097(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class237 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg3;
		@Pc(23) int local23 = arg9 - 64;
		@Pc(28) int local28 = arg3 - 64;
		Static634.anIntArrayArray60[64][64] = 99;
		Static184.anIntArrayArray19[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static333.anIntArray343[0] = arg9;
		@Pc(51) int local51 = local42 + 1;
		Static58.anIntArray68[0] = arg3;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray33;
		while (local51 != local44) {
			local7 = Static333.anIntArray343[local44];
			local9 = Static58.anIntArray68[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(76) int local76 = local9 - local28;
			@Pc(81) int local81 = local7 - local23;
			@Pc(86) int local86 = local7 - arg2.anInt6799;
			@Pc(92) int local92 = local9 - arg2.anInt6790;
			if (arg7 == -4) {
				if (local7 == arg6 && arg0 == local9) {
					Static58.anInt1078 = local9;
					Static255.anInt4980 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static559.method7954(arg8, local7, arg0, arg6, 2, arg4, 2, local9)) {
					Static58.anInt1078 = local9;
					Static255.anInt4980 = local7;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg2.method5909(arg8, 2, local9, 2, arg5, arg0, arg4, arg6, local7)) {
					Static255.anInt4980 = local7;
					Static58.anInt1078 = local9;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg2.method5903(arg8, arg5, local7, 2, local9, arg6, arg4, arg0)) {
					Static255.anInt4980 = local7;
					Static58.anInt1078 = local9;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg2.method5902(arg0, arg7, arg1, arg6, local9, 2, local7)) {
					Static255.anInt4980 = local7;
					Static58.anInt1078 = local9;
					return true;
				}
			} else if (arg2.method5910(arg6, 2, arg0, local7, arg7, local9, arg1)) {
				Static58.anInt1078 = local9;
				Static255.anInt4980 = local7;
				return true;
			}
			@Pc(246) int local246 = Static184.anIntArrayArray19[local81][local76] + 1;
			if (local81 > 0 && Static634.anIntArrayArray60[local81 - 1][local76] == 0 && (local56[local86 - 1][local92] & 0x43A40000) == 0 && (local56[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static333.anIntArray343[local51] = local7 - 1;
				Static58.anIntArray68[local51] = local9;
				Static634.anIntArrayArray60[local81 - 1][local76] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local81 - 1][local76] = local246;
			}
			if (local81 < 126 && Static634.anIntArrayArray60[local81 + 1][local76] == 0 && (local56[local86 + 2][local92] & 0x60E40000) == 0 && (local56[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static333.anIntArray343[local51] = local7 + 1;
				Static58.anIntArray68[local51] = local9;
				Static634.anIntArrayArray60[local81 + 1][local76] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local81 + 1][local76] = local246;
			}
			if (local76 > 0 && Static634.anIntArrayArray60[local81][local76 - 1] == 0 && (local56[local86][local92 - 1] & 0x43A40000) == 0 && (local56[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static333.anIntArray343[local51] = local7;
				Static58.anIntArray68[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static634.anIntArrayArray60[local81][local76 - 1] = 1;
				Static184.anIntArrayArray19[local81][local76 - 1] = local246;
			}
			if (local76 < 126 && Static634.anIntArrayArray60[local81][local76 + 1] == 0 && (local56[local86][local92 + 2] & 0x4E240000) == 0 && (local56[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static333.anIntArray343[local51] = local7;
				Static58.anIntArray68[local51] = local9 + 1;
				Static634.anIntArrayArray60[local81][local76 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local81][local76 + 1] = local246;
			}
			if (local81 > 0 && local76 > 0 && Static634.anIntArrayArray60[local81 - 1][local76 - 1] == 0 && (local56[local86 - 1][local92] & 0x4FA40000) == 0 && (local56[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local86][local92 - 1] & 0x63E40000) == 0) {
				Static333.anIntArray343[local51] = local7 - 1;
				Static58.anIntArray68[local51] = local9 - 1;
				Static634.anIntArrayArray60[local81 - 1][local76 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local81 - 1][local76 - 1] = local246;
			}
			if (local81 < 126 && local76 > 0 && Static634.anIntArrayArray60[local81 + 1][local76 - 1] == 0 && (local56[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local86 + 2][local92] & 0x78E40000) == 0) {
				Static333.anIntArray343[local51] = local7 + 1;
				Static58.anIntArray68[local51] = local9 - 1;
				Static634.anIntArrayArray60[local81 + 1][local76 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local81 + 1][local76 - 1] = local246;
			}
			if (local81 > 0 && local76 < 126 && Static634.anIntArrayArray60[local81 - 1][local76 + 1] == 0 && (local56[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local86][local92 + 2] & 0x7E240000) == 0) {
				Static333.anIntArray343[local51] = local7 - 1;
				Static58.anIntArray68[local51] = local9 + 1;
				Static634.anIntArrayArray60[local81 - 1][local76 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static184.anIntArrayArray19[local81 - 1][local76 + 1] = local246;
			}
			if (local81 < 126 && local76 < 126 && Static634.anIntArrayArray60[local81 + 1][local76 + 1] == 0 && (local56[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static333.anIntArray343[local51] = local7 + 1;
				Static58.anIntArray68[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static634.anIntArrayArray60[local81 + 1][local76 + 1] = 12;
				Static184.anIntArrayArray19[local81 + 1][local76 + 1] = local246;
			}
		}
		Static58.anInt1078 = local9;
		Static255.anInt4980 = local7;
		return false;
	}
}
