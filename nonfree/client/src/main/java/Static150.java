import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "[I")
	public static final int[] anIntArray127 = new int[100];

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIIIBII)V")
	public static void method2101(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(12) Class1_Sub30 local12 = null;
		for (@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) Static204.aClass254_22.method5437(); local17 != null; local17 = (Class1_Sub30) Static204.aClass254_22.method5433()) {
			if (local17.anInt4704 == arg5 && arg1 == local17.anInt4697 && local17.anInt4691 == arg6 && arg3 == local17.anInt4703) {
				local12 = local17;
				break;
			}
		}
		if (local12 == null) {
			local12 = new Class1_Sub30();
			local12.anInt4697 = arg1;
			local12.anInt4703 = arg3;
			local12.anInt4704 = arg5;
			local12.anInt4691 = arg6;
			if (arg1 >= 0 && arg6 >= 0 && Static425.anInt6922 > arg1 && arg6 < Static251.anInt4072) {
				Static12.method187(local12);
			}
			Static204.aClass254_22.method5430(local12);
		}
		local12.anInt4702 = arg2;
		local12.anInt4695 = arg4;
		local12.anInt4701 = arg0;
		local12.anInt4693 = -1;
		local12.anInt4694 = 0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(ZIIIILclient!vb;IIIII)Z")
	public static boolean method2102(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class247 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg5;
		@Pc(9) int local9 = arg0;
		@Pc(23) int local23 = arg5 - 64;
		Static411.anIntArrayArray171[64][64] = 99;
		@Pc(34) int local34 = arg0 - 64;
		Static397.anIntArrayArray162[64][64] = 0;
		@Pc(42) byte local42 = 0;
		Static40.anIntArray253[0] = arg5;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local42 + 1;
		Static145.anIntArray117[0] = arg0;
		@Pc(56) int[][] local56 = arg4.anIntArrayArray179;
		while (local48 != local51) {
			local9 = Static145.anIntArray117[local48];
			local7 = Static40.anIntArray253[local48];
			@Pc(70) int local70 = local9 - local34;
			@Pc(76) int local76 = local7 - arg4.anInt6878;
			local48 = local48 + 1 & 0xFFF;
			@Pc(88) int local88 = local9 - arg4.anInt6866;
			@Pc(93) int local93 = local7 - local23;
			if (arg3 == -4) {
				if (arg7 == local7 && arg8 == local9) {
					Static341.anInt5564 = local9;
					Static410.anInt6682 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static177.method2368(arg8, local7, 1, arg1, local9, arg2, 1, arg7)) {
					Static410.anInt6682 = local7;
					Static341.anInt5564 = local9;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg4.method5266(local9, arg2, arg8, 1, 1, arg1, arg9, arg7, local7)) {
					Static341.anInt5564 = local9;
					Static410.anInt6682 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg4.method5264(arg1, arg8, arg9, arg7, local7, 1, arg2, local9)) {
					Static341.anInt5564 = local9;
					Static410.anInt6682 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg4.method5260(local9, arg3, 1, arg7, arg8, local7, arg6)) {
					Static341.anInt5564 = local9;
					Static410.anInt6682 = local7;
					return true;
				}
			} else if (arg4.method5272(1, local9, arg7, arg3, local7, arg8, arg6)) {
				Static410.anInt6682 = local7;
				Static341.anInt5564 = local9;
				return true;
			}
			@Pc(247) int local247 = Static397.anIntArrayArray162[local93][local70] + 1;
			if (local93 > 0 && Static411.anIntArrayArray171[local93 - 1][local70] == 0 && (local56[local76 - 1][local88] & 0x42240000) == 0) {
				Static40.anIntArray253[local51] = local7 - 1;
				Static145.anIntArray117[local51] = local9;
				Static411.anIntArrayArray171[local93 - 1][local70] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local93 - 1][local70] = local247;
			}
			if (local93 < 127 && Static411.anIntArrayArray171[local93 + 1][local70] == 0 && (local56[local76 + 1][local88] & 0x60240000) == 0) {
				Static40.anIntArray253[local51] = local7 + 1;
				Static145.anIntArray117[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local93 + 1][local70] = 8;
				Static397.anIntArrayArray162[local93 + 1][local70] = local247;
			}
			if (local70 > 0 && Static411.anIntArrayArray171[local93][local70 - 1] == 0 && (local56[local76][local88 - 1] & 0x40A40000) == 0) {
				Static40.anIntArray253[local51] = local7;
				Static145.anIntArray117[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local93][local70 - 1] = 1;
				Static397.anIntArrayArray162[local93][local70 - 1] = local247;
			}
			if (local70 < 127 && Static411.anIntArrayArray171[local93][local70 + 1] == 0 && (local56[local76][local88 + 1] & 0x48240000) == 0) {
				Static40.anIntArray253[local51] = local7;
				Static145.anIntArray117[local51] = local9 + 1;
				Static411.anIntArrayArray171[local93][local70 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local93][local70 + 1] = local247;
			}
			if (local93 > 0 && local70 > 0 && Static411.anIntArrayArray171[local93 - 1][local70 - 1] == 0 && (local56[local76 - 1][local88 - 1] & 0x43A40000) == 0 && (local56[local76 - 1][local88] & 0x42240000) == 0 && (local56[local76][local88 - 1] & 0x40A40000) == 0) {
				Static40.anIntArray253[local51] = local7 - 1;
				Static145.anIntArray117[local51] = local9 - 1;
				Static411.anIntArrayArray171[local93 - 1][local70 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local93 - 1][local70 - 1] = local247;
			}
			if (local93 < 127 && local70 > 0 && Static411.anIntArrayArray171[local93 + 1][local70 - 1] == 0 && (local56[local76 + 1][local88 - 1] & 0x60E40000) == 0 && (local56[local76 + 1][local88] & 0x60240000) == 0 && (local56[local76][local88 - 1] & 0x40A40000) == 0) {
				Static40.anIntArray253[local51] = local7 + 1;
				Static145.anIntArray117[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local93 + 1][local70 - 1] = 9;
				Static397.anIntArrayArray162[local93 + 1][local70 - 1] = local247;
			}
			if (local93 > 0 && local70 < 127 && Static411.anIntArrayArray171[local93 - 1][local70 + 1] == 0 && (local56[local76 - 1][local88 + 1] & 0x4E240000) == 0 && (local56[local76 - 1][local88] & 0x42240000) == 0 && (local56[local76][local88 + 1] & 0x48240000) == 0) {
				Static40.anIntArray253[local51] = local7 - 1;
				Static145.anIntArray117[local51] = local9 + 1;
				Static411.anIntArrayArray171[local93 - 1][local70 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static397.anIntArrayArray162[local93 - 1][local70 + 1] = local247;
			}
			if (local93 < 127 && local70 < 127 && Static411.anIntArrayArray171[local93 + 1][local70 + 1] == 0 && (local56[local76 + 1][local88 + 1] & 0x78240000) == 0 && (local56[local76 + 1][local88] & 0x60240000) == 0 && (local56[local76][local88 + 1] & 0x48240000) == 0) {
				Static40.anIntArray253[local51] = local7 + 1;
				Static145.anIntArray117[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static411.anIntArrayArray171[local93 + 1][local70 + 1] = 12;
				Static397.anIntArrayArray162[local93 + 1][local70 + 1] = local247;
			}
		}
		Static410.anInt6682 = local7;
		Static341.anInt5564 = local9;
		return false;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ljava/lang/String;CI)[Ljava/lang/String;")
	public static String[] method2106(@OriginalArg(0) String arg0, @OriginalArg(1) char arg1) {
		@Pc(10) int local10 = Static40.method3803(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0.charAt(local25) != arg1; local25++) {
			}
			local15[local17++] = arg0.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg0.substring(local19);
		return local15;
	}
}
