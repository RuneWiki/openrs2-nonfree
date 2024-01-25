import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!mh", name = "L", descriptor = "Lclient!c;")
	public static Class5 aClass5_20;

	@OriginalMember(owner = "client!mh", name = "N", descriptor = "Lclient!ok;")
	public static Class155 aClass155_1;

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
	public static int anInt4068;

	@OriginalMember(owner = "client!mh", name = "I", descriptor = "Lclient!bb;")
	public static final Class16 aClass16_22 = new Class16();

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIILclient!g;II)Z")
	public static boolean method3683(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class71 arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg0;
		@Pc(14) int local14 = arg1;
		@Pc(23) int local23 = arg0 - 64;
		Static252.anIntArrayArray55[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static109.anIntArrayArray27[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static45.anIntArray113[0] = arg0;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static57.anIntArray162[0] = arg1;
		@Pc(56) int[][] local56 = arg8.anIntArrayArray24;
		while (local48 != local51) {
			local12 = Static45.anIntArray113[local48];
			local14 = Static57.anIntArray162[local48];
			@Pc(71) int local71 = local14 - local34;
			@Pc(75) int local75 = local12 - local23;
			@Pc(80) int local80 = local12 - arg8.anInt2230;
			@Pc(86) int local86 = local14 - arg8.anInt2240;
			local48 = local48 + 1 & 0xFFF;
			if (arg2 == -4) {
				if (local12 == arg5 && local14 == arg7) {
					Static129.anInt2839 = local14;
					Static228.anInt4746 = local12;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static77.method1749(arg5, local12, 1, arg4, arg9, arg7, local14, 1)) {
					Static228.anInt4746 = local12;
					Static129.anInt2839 = local14;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg8.method1932(arg7, arg5, local12, arg9, 1, arg4, 1, arg3, local14)) {
					Static129.anInt2839 = local14;
					Static228.anInt4746 = local12;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg8.method1944(local14, arg3, 1, arg5, arg4, arg7, local12, arg9)) {
					Static228.anInt4746 = local12;
					Static129.anInt2839 = local14;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg8.method1947(arg5, arg2, local14, arg7, 1, arg6, local12)) {
					Static129.anInt2839 = local14;
					Static228.anInt4746 = local12;
					return true;
				}
			} else if (arg8.method1935(arg5, local14, arg2, arg6, 1, local12, arg7)) {
				Static129.anInt2839 = local14;
				Static228.anInt4746 = local12;
				return true;
			}
			@Pc(243) int local243 = Static109.anIntArrayArray27[local75][local71] + 1;
			if (local75 > 0 && Static252.anIntArrayArray55[local75 - 1][local71] == 0 && (local56[local80 - 1][local86] & 0x42240000) == 0) {
				Static45.anIntArray113[local51] = local12 - 1;
				Static57.anIntArray162[local51] = local14;
				Static252.anIntArrayArray55[local75 - 1][local71] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local75 - 1][local71] = local243;
			}
			if (local75 < 127 && Static252.anIntArrayArray55[local75 + 1][local71] == 0 && (local56[local80 + 1][local86] & 0x60240000) == 0) {
				Static45.anIntArray113[local51] = local12 + 1;
				Static57.anIntArray162[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local75 + 1][local71] = 8;
				Static109.anIntArrayArray27[local75 + 1][local71] = local243;
			}
			if (local71 > 0 && Static252.anIntArrayArray55[local75][local71 - 1] == 0 && (local56[local80][local86 - 1] & 0x40A40000) == 0) {
				Static45.anIntArray113[local51] = local12;
				Static57.anIntArray162[local51] = local14 - 1;
				Static252.anIntArrayArray55[local75][local71 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local75][local71 - 1] = local243;
			}
			if (local71 < 127 && Static252.anIntArrayArray55[local75][local71 + 1] == 0 && (local56[local80][local86 + 1] & 0x48240000) == 0) {
				Static45.anIntArray113[local51] = local12;
				Static57.anIntArray162[local51] = local14 + 1;
				Static252.anIntArrayArray55[local75][local71 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local75][local71 + 1] = local243;
			}
			if (local75 > 0 && local71 > 0 && Static252.anIntArrayArray55[local75 - 1][local71 - 1] == 0 && (local56[local80 - 1][local86 - 1] & 0x43A40000) == 0 && (local56[local80 - 1][local86] & 0x42240000) == 0 && (local56[local80][local86 - 1] & 0x40A40000) == 0) {
				Static45.anIntArray113[local51] = local12 - 1;
				Static57.anIntArray162[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local75 - 1][local71 - 1] = 3;
				Static109.anIntArrayArray27[local75 - 1][local71 - 1] = local243;
			}
			if (local75 < 127 && local71 > 0 && Static252.anIntArrayArray55[local75 + 1][local71 - 1] == 0 && (local56[local80 + 1][local86 - 1] & 0x60E40000) == 0 && (local56[local80 + 1][local86] & 0x60240000) == 0 && (local56[local80][local86 - 1] & 0x40A40000) == 0) {
				Static45.anIntArray113[local51] = local12 + 1;
				Static57.anIntArray162[local51] = local14 - 1;
				Static252.anIntArrayArray55[local75 + 1][local71 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static109.anIntArrayArray27[local75 + 1][local71 - 1] = local243;
			}
			if (local75 > 0 && local71 < 127 && Static252.anIntArrayArray55[local75 - 1][local71 + 1] == 0 && (local56[local80 - 1][local86 + 1] & 0x4E240000) == 0 && (local56[local80 - 1][local86] & 0x42240000) == 0 && (local56[local80][local86 + 1] & 0x48240000) == 0) {
				Static45.anIntArray113[local51] = local12 - 1;
				Static57.anIntArray162[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local75 - 1][local71 + 1] = 6;
				Static109.anIntArrayArray27[local75 - 1][local71 + 1] = local243;
			}
			if (local75 < 127 && local71 < 127 && Static252.anIntArrayArray55[local75 + 1][local71 + 1] == 0 && (local56[local80 + 1][local86 + 1] & 0x78240000) == 0 && (local56[local80 + 1][local86] & 0x60240000) == 0 && (local56[local80][local86 + 1] & 0x48240000) == 0) {
				Static45.anIntArray113[local51] = local12 + 1;
				Static57.anIntArray162[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static252.anIntArrayArray55[local75 + 1][local71 + 1] = 12;
				Static109.anIntArrayArray27[local75 + 1][local71 + 1] = local243;
			}
		}
		Static228.anInt4746 = local12;
		Static129.anInt2839 = local14;
		return false;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "([BI)[B")
	public static byte[] method3684(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(21) int local21 = local8.method4532();
		@Pc(25) int local25 = local8.method4545();
		if (local25 < 0 || Static352.anInt6713 != 0 && Static352.anInt6713 < local25) {
			throw new RuntimeException();
		} else if (local21 == 0) {
			@Pc(94) byte[] local94 = new byte[local25];
			local8.method4519(local25, local94);
			return local94;
		} else {
			@Pc(49) int local49 = local8.method4545();
			if (local49 < 0 || Static352.anInt6713 != 0 && Static352.anInt6713 < local49) {
				throw new RuntimeException();
			}
			@Pc(70) byte[] local70 = new byte[local49];
			if (local21 == 1) {
				Static333.method5404(local70, local49, arg0, local25);
			} else {
				Static266.aClass59_1.method1691(local8, local70);
			}
			return local70;
		}
	}
}
