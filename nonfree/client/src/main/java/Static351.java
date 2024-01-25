import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!no", name = "d", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray10 = new int[2][][];

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)Lclient!eca;")
	public static Class6_Sub3 method5315(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub3_Sub22();
		} else if (arg0 == 1) {
			return new Class6_Sub3_Sub15();
		} else if (arg0 == 2) {
			return new Class6_Sub3_Sub13();
		} else if (arg0 == 3) {
			return new Class6_Sub3_Sub27();
		} else if (arg0 == 4) {
			return new Class6_Sub3_Sub20();
		} else if (arg0 == 5) {
			return new Class6_Sub3_Sub28();
		} else if (arg0 == 6) {
			return new Class6_Sub3_Sub33();
		} else if (arg0 == 7) {
			return new Class6_Sub3_Sub2();
		} else if (arg0 == 8) {
			return new Class6_Sub3_Sub35();
		} else if (arg0 == 9) {
			return new Class6_Sub3_Sub3();
		} else if (arg0 == 10) {
			return new Class6_Sub3_Sub26();
		} else if (arg0 == 11) {
			return new Class6_Sub3_Sub18();
		} else if (arg0 == 12) {
			return new Class6_Sub3_Sub5();
		} else if (arg0 == 13) {
			return new Class6_Sub3_Sub36();
		} else if (arg0 == 14) {
			return new Class6_Sub3_Sub6();
		} else if (arg0 == 15) {
			return new Class6_Sub3_Sub19();
		} else if (arg0 == 16) {
			return new Class6_Sub3_Sub24();
		} else if (arg0 == 17) {
			return new Class6_Sub3_Sub23();
		} else if (arg0 == 18) {
			return new Class6_Sub3_Sub9_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub3_Sub30();
		} else if (arg0 == 20) {
			return new Class6_Sub3_Sub21();
		} else if (arg0 == 21) {
			return new Class6_Sub3_Sub11();
		} else if (arg0 == 22) {
			return new Class6_Sub3_Sub25();
		} else if (arg0 == 23) {
			return new Class6_Sub3_Sub7();
		} else if (arg0 == 24) {
			return new Class6_Sub3_Sub34();
		} else if (arg0 == 25) {
			return new Class6_Sub3_Sub10();
		} else if (arg0 == 26) {
			return new Class6_Sub3_Sub29();
		} else if (arg0 == 27) {
			return new Class6_Sub3_Sub1();
		} else if (arg0 == 28) {
			return new Class6_Sub3_Sub16();
		} else if (arg0 == 29) {
			return new Class6_Sub3_Sub37();
		} else if (arg0 == 30) {
			return new Class6_Sub3_Sub14();
		} else if (arg0 == 31) {
			return new Class6_Sub3_Sub39();
		} else if (arg0 == 32) {
			return new Class6_Sub3_Sub38();
		} else if (arg0 == 33) {
			return new Class6_Sub3_Sub17();
		} else if (arg0 == 34) {
			return new Class6_Sub3_Sub4();
		} else if (arg0 == 35) {
			return new Class6_Sub3_Sub12();
		} else if (arg0 == 36) {
			return new Class6_Sub3_Sub31();
		} else if (arg0 == 37) {
			return new Class6_Sub3_Sub8();
		} else if (arg0 == 38) {
			return new Class6_Sub3_Sub32();
		} else if (arg0 == 39) {
			return new Class6_Sub3_Sub9();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(Lclient!iaa;IIIIIIIIII)Z")
	public static boolean method5316(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(25) int local25 = arg9;
		@Pc(34) int local34 = arg5 - 64;
		Static318.anIntArrayArray48[64][64] = 99;
		@Pc(44) int local44 = arg9 - 64;
		Static567.anIntArrayArray82[64][64] = 0;
		@Pc(52) byte local52 = 0;
		@Pc(54) int local54 = 0;
		Static191.anIntArray315[0] = arg5;
		@Pc(61) int local61 = local52 + 1;
		Static313.anIntArray436[0] = arg9;
		@Pc(66) int[][] local66 = arg0.anIntArrayArray35;
		while (local54 != local61) {
			local25 = Static313.anIntArray436[local54];
			local7 = Static191.anIntArray315[local54];
			local54 = local54 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg0.anInt4008;
			@Pc(94) int local94 = local25 - arg0.anInt3999;
			@Pc(98) int local98 = local25 - local44;
			@Pc(103) int local103 = local7 - local34;
			if (arg7 == -4) {
				if (local7 == arg6 && arg1 == local25) {
					Static410.anInt7383 = local25;
					Static447.anInt7902 = local7;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static114.method1796(arg4, arg3, arg1, 1, 1, local7, arg6, local25)) {
					Static447.anInt7902 = local7;
					Static410.anInt7383 = local25;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg0.method3442(local7, arg4, arg6, 1, local25, arg3, 1, arg8, arg1)) {
					Static447.anInt7902 = local7;
					Static410.anInt7383 = local25;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg0.method3440(arg3, local25, arg4, arg8, arg1, local7, arg6, 1)) {
					Static447.anInt7902 = local7;
					Static410.anInt7383 = local25;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg0.method3444(arg2, arg7, local25, local7, arg1, 1, arg6)) {
					Static447.anInt7902 = local7;
					Static410.anInt7383 = local25;
					return true;
				}
			} else if (arg0.method3454(arg6, arg7, local25, 1, arg1, local7, arg2)) {
				Static447.anInt7902 = local7;
				Static410.anInt7383 = local25;
				return true;
			}
			@Pc(258) int local258 = Static567.anIntArrayArray82[local103][local98] + 1;
			if (local103 > 0 && Static318.anIntArrayArray48[local103 - 1][local98] == 0 && (local66[local88 - 1][local94] & 0x42240000) == 0) {
				Static191.anIntArray315[local61] = local7 - 1;
				Static313.anIntArray436[local61] = local25;
				Static318.anIntArrayArray48[local103 - 1][local98] = 2;
				local61 = local61 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local103 - 1][local98] = local258;
			}
			if (local103 < 127 && Static318.anIntArrayArray48[local103 + 1][local98] == 0 && (local66[local88 + 1][local94] & 0x60240000) == 0) {
				Static191.anIntArray315[local61] = local7 + 1;
				Static313.anIntArray436[local61] = local25;
				Static318.anIntArrayArray48[local103 + 1][local98] = 8;
				local61 = local61 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local103 + 1][local98] = local258;
			}
			if (local98 > 0 && Static318.anIntArrayArray48[local103][local98 - 1] == 0 && (local66[local88][local94 - 1] & 0x40A40000) == 0) {
				Static191.anIntArray315[local61] = local7;
				Static313.anIntArray436[local61] = local25 - 1;
				local61 = local61 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local103][local98 - 1] = 1;
				Static567.anIntArrayArray82[local103][local98 - 1] = local258;
			}
			if (local98 < 127 && Static318.anIntArrayArray48[local103][local98 + 1] == 0 && (local66[local88][local94 + 1] & 0x48240000) == 0) {
				Static191.anIntArray315[local61] = local7;
				Static313.anIntArray436[local61] = local25 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local103][local98 + 1] = 4;
				Static567.anIntArrayArray82[local103][local98 + 1] = local258;
			}
			if (local103 > 0 && local98 > 0 && Static318.anIntArrayArray48[local103 - 1][local98 - 1] == 0 && (local66[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local66[local88 - 1][local94] & 0x42240000) == 0 && (local66[local88][local94 - 1] & 0x40A40000) == 0) {
				Static191.anIntArray315[local61] = local7 - 1;
				Static313.anIntArray436[local61] = local25 - 1;
				local61 = local61 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local103 - 1][local98 - 1] = 3;
				Static567.anIntArrayArray82[local103 - 1][local98 - 1] = local258;
			}
			if (local103 < 127 && local98 > 0 && Static318.anIntArrayArray48[local103 + 1][local98 - 1] == 0 && (local66[local88 + 1][local94 - 1] & 0x60E40000) == 0 && (local66[local88 + 1][local94] & 0x60240000) == 0 && (local66[local88][local94 - 1] & 0x40A40000) == 0) {
				Static191.anIntArray315[local61] = local7 + 1;
				Static313.anIntArray436[local61] = local25 - 1;
				Static318.anIntArrayArray48[local103 + 1][local98 - 1] = 9;
				local61 = local61 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local103 + 1][local98 - 1] = local258;
			}
			if (local103 > 0 && local98 < 127 && Static318.anIntArrayArray48[local103 - 1][local98 + 1] == 0 && (local66[local88 - 1][local94 + 1] & 0x4E240000) == 0 && (local66[local88 - 1][local94] & 0x42240000) == 0 && (local66[local88][local94 + 1] & 0x48240000) == 0) {
				Static191.anIntArray315[local61] = local7 - 1;
				Static313.anIntArray436[local61] = local25 + 1;
				Static318.anIntArrayArray48[local103 - 1][local98 + 1] = 6;
				local61 = local61 + 1 & 0xFFF;
				Static567.anIntArrayArray82[local103 - 1][local98 + 1] = local258;
			}
			if (local103 < 127 && local98 < 127 && Static318.anIntArrayArray48[local103 + 1][local98 + 1] == 0 && (local66[local88 + 1][local94 + 1] & 0x78240000) == 0 && (local66[local88 + 1][local94] & 0x60240000) == 0 && (local66[local88][local94 + 1] & 0x48240000) == 0) {
				Static191.anIntArray315[local61] = local7 + 1;
				Static313.anIntArray436[local61] = local25 + 1;
				local61 = local61 + 1 & 0xFFF;
				Static318.anIntArrayArray48[local103 + 1][local98 + 1] = 12;
				Static567.anIntArrayArray82[local103 + 1][local98 + 1] = local258;
			}
		}
		Static447.anInt7902 = local7;
		Static410.anInt7383 = local25;
		return false;
	}
}
