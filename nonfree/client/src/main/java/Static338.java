import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static338 {

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	public static int anInt6358;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!an;")
	public static Class12 aClass12_2;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public static int anInt6360;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_143 = new Class265(13, 7);

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
	public static int anInt6357 = 2;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Z")
	public static boolean aBoolean439 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIILclient!eq;IIIII)Z")
	public static boolean method5040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class70 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg0;
		@Pc(14) int local14 = arg1;
		@Pc(23) int local23 = arg0 - 64;
		Static149.anIntArrayArray28[64][64] = 99;
		@Pc(34) int local34 = arg1 - 64;
		Static142.anIntArrayArray27[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static432.anIntArray602[0] = arg0;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static185.anIntArray318[0] = arg1;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray17;
		while (local48 != local51) {
			local12 = Static432.anIntArray602[local48];
			local14 = Static185.anIntArray318[local48];
			@Pc(71) int local71 = local12 - arg4.anInt2303;
			@Pc(77) int local77 = local14 - arg4.anInt2305;
			@Pc(82) int local82 = local14 - local34;
			@Pc(87) int local87 = local12 - local23;
			local48 = local48 + 1 & 0xFFF;
			if (arg7 == -4) {
				if (local12 == arg8 && arg2 == local14) {
					Static333.anInt5769 = local14;
					Static275.anInt5052 = local12;
					return true;
				}
			} else if (arg7 == -3) {
				if (Static170.method2747(1, arg6, arg9, local14, arg2, local12, arg8, 1)) {
					Static275.anInt5052 = local12;
					Static333.anInt5769 = local14;
					return true;
				}
			} else if (arg7 == -2) {
				if (arg4.method1805(arg6, local14, arg2, 1, arg9, arg3, 1, local12, arg8)) {
					Static333.anInt5769 = local14;
					Static275.anInt5052 = local12;
					return true;
				}
			} else if (arg7 == -1) {
				if (arg4.method1803(arg3, arg2, local12, arg8, local14, 1, arg9, arg6)) {
					Static333.anInt5769 = local14;
					Static275.anInt5052 = local12;
					return true;
				}
			} else if (arg7 == 0 || arg7 == 1 || arg7 == 2 || arg7 == 3 || arg7 == 9) {
				if (arg4.method1795(local12, arg8, arg5, arg2, 1, local14, arg7)) {
					Static275.anInt5052 = local12;
					Static333.anInt5769 = local14;
					return true;
				}
			} else if (arg4.method1796(arg8, arg5, 1, local12, arg2, local14, arg7)) {
				Static333.anInt5769 = local14;
				Static275.anInt5052 = local12;
				return true;
			}
			@Pc(241) int local241 = Static142.anIntArrayArray27[local87][local82] + 1;
			if (local87 > 0 && Static149.anIntArrayArray28[local87 - 1][local82] == 0 && (local56[local71 - 1][local77] & 0x42240000) == 0) {
				Static432.anIntArray602[local51] = local12 - 1;
				Static185.anIntArray318[local51] = local14;
				Static149.anIntArrayArray28[local87 - 1][local82] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local87 - 1][local82] = local241;
			}
			if (local87 < 127 && Static149.anIntArrayArray28[local87 + 1][local82] == 0 && (local56[local71 + 1][local77] & 0x60240000) == 0) {
				Static432.anIntArray602[local51] = local12 + 1;
				Static185.anIntArray318[local51] = local14;
				local51 = local51 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local87 + 1][local82] = 8;
				Static142.anIntArrayArray27[local87 + 1][local82] = local241;
			}
			if (local82 > 0 && Static149.anIntArrayArray28[local87][local82 - 1] == 0 && (local56[local71][local77 - 1] & 0x40A40000) == 0) {
				Static432.anIntArray602[local51] = local12;
				Static185.anIntArray318[local51] = local14 - 1;
				Static149.anIntArrayArray28[local87][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local87][local82 - 1] = local241;
			}
			if (local82 < 127 && Static149.anIntArrayArray28[local87][local82 + 1] == 0 && (local56[local71][local77 + 1] & 0x48240000) == 0) {
				Static432.anIntArray602[local51] = local12;
				Static185.anIntArray318[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local87][local82 + 1] = 4;
				Static142.anIntArrayArray27[local87][local82 + 1] = local241;
			}
			if (local87 > 0 && local82 > 0 && Static149.anIntArrayArray28[local87 - 1][local82 - 1] == 0 && (local56[local71 - 1][local77 - 1] & 0x43A40000) == 0 && (local56[local71 - 1][local77] & 0x42240000) == 0 && (local56[local71][local77 - 1] & 0x40A40000) == 0) {
				Static432.anIntArray602[local51] = local12 - 1;
				Static185.anIntArray318[local51] = local14 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local87 - 1][local82 - 1] = 3;
				Static142.anIntArrayArray27[local87 - 1][local82 - 1] = local241;
			}
			if (local87 < 127 && local82 > 0 && Static149.anIntArrayArray28[local87 + 1][local82 - 1] == 0 && (local56[local71 + 1][local77 - 1] & 0x60E40000) == 0 && (local56[local71 + 1][local77] & 0x60240000) == 0 && (local56[local71][local77 - 1] & 0x40A40000) == 0) {
				Static432.anIntArray602[local51] = local12 + 1;
				Static185.anIntArray318[local51] = local14 - 1;
				Static149.anIntArrayArray28[local87 + 1][local82 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local87 + 1][local82 - 1] = local241;
			}
			if (local87 > 0 && local82 < 127 && Static149.anIntArrayArray28[local87 - 1][local82 + 1] == 0 && (local56[local71 - 1][local77 + 1] & 0x4E240000) == 0 && (local56[local71 - 1][local77] & 0x42240000) == 0 && (local56[local71][local77 + 1] & 0x48240000) == 0) {
				Static432.anIntArray602[local51] = local12 - 1;
				Static185.anIntArray318[local51] = local14 + 1;
				Static149.anIntArrayArray28[local87 - 1][local82 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static142.anIntArrayArray27[local87 - 1][local82 + 1] = local241;
			}
			if (local87 < 127 && local82 < 127 && Static149.anIntArrayArray28[local87 + 1][local82 + 1] == 0 && (local56[local71 + 1][local77 + 1] & 0x78240000) == 0 && (local56[local71 + 1][local77] & 0x60240000) == 0 && (local56[local71][local77 + 1] & 0x48240000) == 0) {
				Static432.anIntArray602[local51] = local12 + 1;
				Static185.anIntArray318[local51] = local14 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static149.anIntArrayArray28[local87 + 1][local82 + 1] = 12;
				Static142.anIntArrayArray27[local87 + 1][local82 + 1] = local241;
			}
		}
		Static275.anInt5052 = local12;
		Static333.anInt5769 = local14;
		return false;
	}
}
