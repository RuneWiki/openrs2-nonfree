import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "[I")
	public static int[] anIntArray139;

	@OriginalMember(owner = "client!cea", name = "b", descriptor = "[I")
	public static final int[] anIntArray138 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!kf;Lclient!kf;IZI)I")
	public static int method1444(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(1) Class23_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		@Pc(13) int local13;
		@Pc(16) int local16;
		if (arg2 == 1) {
			local13 = arg1.anInt5189;
			local16 = arg0.anInt5189;
			if (!arg3) {
				if (local16 == -1) {
					local16 = 2001;
				}
				if (local13 == -1) {
					local13 = 2001;
				}
			}
			return local13 - local16;
		} else if (arg2 == 2) {
			return Static72.method1643(Static345.anInt6495, arg0.method4355().aString60, arg1.method4355().aString60);
		} else if (arg2 == 3) {
			if (arg1.aString51.equals("-")) {
				if (arg0.aString51.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg0.aString51.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static72.method1643(Static345.anInt6495, arg0.aString51, arg1.aString51);
			}
		} else if (arg2 == 4) {
			if (arg1.method4350()) {
				return arg0.method4350() ? 0 : 1;
			} else if (arg0.method4350()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method4351()) {
				return arg0.method4351() ? 0 : 1;
			} else if (arg0.method4351()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method4352()) {
				return arg0.method4352() ? 0 : 1;
			} else if (arg0.method4352()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method4349()) {
				return arg0.method4349() ? 0 : 1;
			} else if (arg0.method4349()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local13 = arg1.anInt5199;
			local16 = arg0.anInt5199;
			if (arg3) {
				if (local16 == 1000) {
					local16 = -1;
				}
				if (local13 == 1000) {
					local13 = -1;
				}
			} else {
				if (local16 == -1) {
					local16 = 1000;
				}
				if (local13 == -1) {
					local13 = 1000;
				}
			}
			return local13 - local16;
		} else {
			return arg1.anInt5198 - arg0.anInt5198;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIIIILclient!ld;IIZII)Z")
	public static boolean method1446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class184 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg7;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg7 - 64;
		@Pc(23) int local23 = arg6 - 64;
		Static315.anIntArrayArray56[64][64] = 99;
		Static412.anIntArrayArray71[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(49) int local49 = 0;
		Static449.anIntArray613[0] = arg7;
		@Pc(56) int local56 = local37 + 1;
		Static97.anIntArray199[0] = arg6;
		@Pc(61) int[][] local61 = arg5.anIntArrayArray51;
		while (local56 != local49) {
			local7 = Static449.anIntArray613[local49];
			local9 = Static97.anIntArray199[local49];
			@Pc(77) int local77 = local7 - arg5.anInt5439;
			@Pc(82) int local82 = local7 - local18;
			local49 = local49 + 1 & 0xFFF;
			@Pc(94) int local94 = local9 - arg5.anInt5440;
			@Pc(99) int local99 = local9 - local23;
			if (arg8 == -4) {
				if (arg4 == local7 && arg9 == local9) {
					Static429.anInt7947 = local9;
					Static288.anInt5601 = local7;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static176.method3493(local7, arg0, local9, 1, arg4, arg2, 1, arg9)) {
					Static288.anInt5601 = local7;
					Static429.anInt7947 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg5.method4598(1, arg1, arg4, local7, local9, 1, arg9, arg0, arg2)) {
					Static288.anInt5601 = local7;
					Static429.anInt7947 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg5.method4594(arg9, local7, arg4, arg0, 1, arg2, arg1, local9)) {
					Static288.anInt5601 = local7;
					Static429.anInt7947 = local9;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg5.method4586(arg9, arg4, local7, arg3, arg8, local9, 1)) {
					Static288.anInt5601 = local7;
					Static429.anInt7947 = local9;
					return true;
				}
			} else if (arg5.method4592(local9, arg8, arg9, 1, arg3, local7, arg4)) {
				Static429.anInt7947 = local9;
				Static288.anInt5601 = local7;
				return true;
			}
			@Pc(252) int local252 = Static412.anIntArrayArray71[local82][local99] + 1;
			if (local82 > 0 && Static315.anIntArrayArray56[local82 - 1][local99] == 0 && (local61[local77 - 1][local94] & 0x42240000) == 0) {
				Static449.anIntArray613[local56] = local7 - 1;
				Static97.anIntArray199[local56] = local9;
				local56 = local56 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local82 - 1][local99] = 2;
				Static412.anIntArrayArray71[local82 - 1][local99] = local252;
			}
			if (local82 < 127 && Static315.anIntArrayArray56[local82 + 1][local99] == 0 && (local61[local77 + 1][local94] & 0x60240000) == 0) {
				Static449.anIntArray613[local56] = local7 + 1;
				Static97.anIntArray199[local56] = local9;
				Static315.anIntArrayArray56[local82 + 1][local99] = 8;
				local56 = local56 + 1 & 0xFFF;
				Static412.anIntArrayArray71[local82 + 1][local99] = local252;
			}
			if (local99 > 0 && Static315.anIntArrayArray56[local82][local99 - 1] == 0 && (local61[local77][local94 - 1] & 0x40A40000) == 0) {
				Static449.anIntArray613[local56] = local7;
				Static97.anIntArray199[local56] = local9 - 1;
				local56 = local56 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local82][local99 - 1] = 1;
				Static412.anIntArrayArray71[local82][local99 - 1] = local252;
			}
			if (local99 < 127 && Static315.anIntArrayArray56[local82][local99 + 1] == 0 && (local61[local77][local94 + 1] & 0x48240000) == 0) {
				Static449.anIntArray613[local56] = local7;
				Static97.anIntArray199[local56] = local9 + 1;
				local56 = local56 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local82][local99 + 1] = 4;
				Static412.anIntArrayArray71[local82][local99 + 1] = local252;
			}
			if (local82 > 0 && local99 > 0 && Static315.anIntArrayArray56[local82 - 1][local99 - 1] == 0 && (local61[local77 - 1][local94 - 1] & 0x43A40000) == 0 && (local61[local77 - 1][local94] & 0x42240000) == 0 && (local61[local77][local94 - 1] & 0x40A40000) == 0) {
				Static449.anIntArray613[local56] = local7 - 1;
				Static97.anIntArray199[local56] = local9 - 1;
				local56 = local56 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local82 - 1][local99 - 1] = 3;
				Static412.anIntArrayArray71[local82 - 1][local99 - 1] = local252;
			}
			if (local82 < 127 && local99 > 0 && Static315.anIntArrayArray56[local82 + 1][local99 - 1] == 0 && (local61[local77 + 1][local94 - 1] & 0x60E40000) == 0 && (local61[local77 + 1][local94] & 0x60240000) == 0 && (local61[local77][local94 - 1] & 0x40A40000) == 0) {
				Static449.anIntArray613[local56] = local7 + 1;
				Static97.anIntArray199[local56] = local9 - 1;
				Static315.anIntArrayArray56[local82 + 1][local99 - 1] = 9;
				local56 = local56 + 1 & 0xFFF;
				Static412.anIntArrayArray71[local82 + 1][local99 - 1] = local252;
			}
			if (local82 > 0 && local99 < 127 && Static315.anIntArrayArray56[local82 - 1][local99 + 1] == 0 && (local61[local77 - 1][local94 + 1] & 0x4E240000) == 0 && (local61[local77 - 1][local94] & 0x42240000) == 0 && (local61[local77][local94 + 1] & 0x48240000) == 0) {
				Static449.anIntArray613[local56] = local7 - 1;
				Static97.anIntArray199[local56] = local9 + 1;
				local56 = local56 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local82 - 1][local99 + 1] = 6;
				Static412.anIntArrayArray71[local82 - 1][local99 + 1] = local252;
			}
			if (local82 < 127 && local99 < 127 && Static315.anIntArrayArray56[local82 + 1][local99 + 1] == 0 && (local61[local77 + 1][local94 + 1] & 0x78240000) == 0 && (local61[local77 + 1][local94] & 0x60240000) == 0 && (local61[local77][local94 + 1] & 0x48240000) == 0) {
				Static449.anIntArray613[local56] = local7 + 1;
				Static97.anIntArray199[local56] = local9 + 1;
				local56 = local56 + 1 & 0xFFF;
				Static315.anIntArrayArray56[local82 + 1][local99 + 1] = 12;
				Static412.anIntArrayArray71[local82 + 1][local99 + 1] = local252;
			}
		}
		Static429.anInt7947 = local9;
		Static288.anInt5601 = local7;
		return false;
	}
}
