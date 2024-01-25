import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "Lclient!kl;")
	public static Class135_Sub1 aClass135_Sub1_1;

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
	public static int anInt3286;

	@OriginalMember(owner = "client!ke", name = "f", descriptor = "Lclient!fc;")
	public static Class79 aClass79_5;

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "J")
	public static long aLong104 = 0L;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIILclient!tf;IIIIII)Z")
	public static boolean method2681(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class222 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg0 - 64;
		Static364.anIntArrayArray61[64][64] = 99;
		@Pc(29) int local29 = arg6 - 64;
		Static324.anIntArrayArray32[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static296.anIntArray604[0] = arg0;
		@Pc(46) int local46 = local37 + 1;
		Static225.anIntArray493[0] = arg6;
		@Pc(51) int[][] local51 = arg3.anIntArrayArray59;
		while (local39 != local46) {
			local7 = Static296.anIntArray604[local39];
			local9 = Static225.anIntArray493[local39];
			@Pc(71) int local71 = local7 - local18;
			local39 = local39 + 1 & 0xFFF;
			@Pc(82) int local82 = local9 - local29;
			@Pc(88) int local88 = local7 - arg3.anInt5619;
			@Pc(94) int local94 = local9 - arg3.anInt5625;
			if (arg2 == -4) {
				if (arg7 == local7 && local9 == arg1) {
					Static143.anInt2675 = local7;
					Static92.anInt1673 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static318.method4692(arg9, 2, arg7, 2, local7, local9, arg1, arg5)) {
					Static143.anInt2675 = local7;
					Static92.anInt1673 = local9;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg3.method4837(arg5, 2, local7, 2, local9, arg1, arg4, arg9, arg7)) {
					Static143.anInt2675 = local7;
					Static92.anInt1673 = local9;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg3.method4835(arg5, arg4, arg9, arg7, local7, arg1, local9, 2)) {
					Static143.anInt2675 = local7;
					Static92.anInt1673 = local9;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg3.method4827(arg7, arg1, arg2, arg8, local9, local7, 2)) {
					Static92.anInt1673 = local9;
					Static143.anInt2675 = local7;
					return true;
				}
			} else if (arg3.method4822(arg7, 2, arg2, local9, arg1, local7, arg8)) {
				Static92.anInt1673 = local9;
				Static143.anInt2675 = local7;
				return true;
			}
			@Pc(249) int local249 = Static324.anIntArrayArray32[local71][local82] + 1;
			if (local71 > 0 && Static364.anIntArrayArray61[local71 - 1][local82] == 0 && (local51[local88 - 1][local94] & 0x43A40000) == 0 && (local51[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static296.anIntArray604[local46] = local7 - 1;
				Static225.anIntArray493[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local71 - 1][local82] = 2;
				Static324.anIntArrayArray32[local71 - 1][local82] = local249;
			}
			if (local71 < 126 && Static364.anIntArrayArray61[local71 + 1][local82] == 0 && (local51[local88 + 2][local94] & 0x60E40000) == 0 && (local51[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static296.anIntArray604[local46] = local7 + 1;
				Static225.anIntArray493[local46] = local9;
				Static364.anIntArrayArray61[local71 + 1][local82] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local71 + 1][local82] = local249;
			}
			if (local82 > 0 && Static364.anIntArrayArray61[local71][local82 - 1] == 0 && (local51[local88][local94 - 1] & 0x43A40000) == 0 && (local51[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static296.anIntArray604[local46] = local7;
				Static225.anIntArray493[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local71][local82 - 1] = 1;
				Static324.anIntArrayArray32[local71][local82 - 1] = local249;
			}
			if (local82 < 126 && Static364.anIntArrayArray61[local71][local82 + 1] == 0 && (local51[local88][local94 + 2] & 0x4E240000) == 0 && (local51[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static296.anIntArray604[local46] = local7;
				Static225.anIntArray493[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local71][local82 + 1] = 4;
				Static324.anIntArrayArray32[local71][local82 + 1] = local249;
			}
			if (local71 > 0 && local82 > 0 && Static364.anIntArrayArray61[local71 - 1][local82 - 1] == 0 && (local51[local88 - 1][local94] & 0x4FA40000) == 0 && (local51[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local51[local88][local94 - 1] & 0x63E40000) == 0) {
				Static296.anIntArray604[local46] = local7 - 1;
				Static225.anIntArray493[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static364.anIntArrayArray61[local71 - 1][local82 - 1] = 3;
				Static324.anIntArrayArray32[local71 - 1][local82 - 1] = local249;
			}
			if (local71 < 126 && local82 > 0 && Static364.anIntArrayArray61[local71 + 1][local82 - 1] == 0 && (local51[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local51[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local51[local88 + 2][local94] & 0x78E40000) == 0) {
				Static296.anIntArray604[local46] = local7 + 1;
				Static225.anIntArray493[local46] = local9 - 1;
				Static364.anIntArrayArray61[local71 + 1][local82 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local71 + 1][local82 - 1] = local249;
			}
			if (local71 > 0 && local82 < 126 && Static364.anIntArrayArray61[local71 - 1][local82 + 1] == 0 && (local51[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local51[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local51[local88][local94 + 2] & 0x7E240000) == 0) {
				Static296.anIntArray604[local46] = local7 - 1;
				Static225.anIntArray493[local46] = local9 + 1;
				Static364.anIntArrayArray61[local71 - 1][local82 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local71 - 1][local82 + 1] = local249;
			}
			if (local71 < 126 && local82 < 126 && Static364.anIntArrayArray61[local71 + 1][local82 + 1] == 0 && (local51[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local51[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local51[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static296.anIntArray604[local46] = local7 + 1;
				Static225.anIntArray493[local46] = local9 + 1;
				Static364.anIntArrayArray61[local71 + 1][local82 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static324.anIntArrayArray32[local71 + 1][local82 + 1] = local249;
			}
		}
		Static143.anInt2675 = local7;
		Static92.anInt1673 = local9;
		return false;
	}

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "(I)V")
	public static void method2684() {
		for (@Pc(10) Class1_Sub6_Sub7 local10 = (Class1_Sub6_Sub7) Static137.aClass17_23.method202(); local10 != null; local10 = (Class1_Sub6_Sub7) Static137.aClass17_23.method207()) {
			@Pc(15) Class25_Sub1_Sub3 local15 = local10.aClass25_Sub1_Sub3_1;
			if (local15.aBoolean208) {
				local10.method5577();
				local15.method1956();
			} else if (Static366.anInt5883 >= local15.anInt2462) {
				local15.method1961(Static109.anInt1911);
				if (local15.aBoolean208) {
					local10.method5577();
				} else {
					Static31.method498(local15, true);
				}
			}
		}
	}
}
