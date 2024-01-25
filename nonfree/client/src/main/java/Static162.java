import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public static int anInt3364;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "Lclient!dj;")
	public static final Class1_Sub11 aClass1_Sub11_1 = new Class1_Sub11(0, -1);

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(Lclient!ii;IILclient!vj;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2853(@OriginalArg(0) Class105 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static176.aClass105_10 = arg0;
		Static131.anInt2601 = arg1;
		Static102.aClass31_2 = arg3;
		Static165.aBoolean263 = Static176.aClass105_10.method4279() > 0;
		Static97.anInt1886 = arg4 >> 7;
		Static349.anInt6708 = arg6 >> 7;
		Static286.anInt5739 = arg4;
		Static55.anInt1333 = arg6;
		Static310.anInt6184 = arg5;
		Static226.anInt5592 = Static97.anInt1886 - Static131.anInt2605;
		if (Static226.anInt5592 < 0) {
			Static141.anInt2713 = -Static226.anInt5592;
			Static226.anInt5592 = 0;
		} else {
			Static141.anInt2713 = 0;
		}
		Static285.anInt5730 = Static349.anInt6708 - Static131.anInt2605;
		if (Static285.anInt5730 < 0) {
			Static101.anInt1942 = -Static285.anInt5730;
			Static285.anInt5730 = 0;
		} else {
			Static101.anInt1942 = 0;
		}
		Static254.anInt5237 = Static97.anInt1886 + Static131.anInt2605;
		if (Static254.anInt5237 > Static97.anInt1852) {
			Static254.anInt5237 = Static97.anInt1852;
		}
		Static296.anInt5981 = Static349.anInt6708 + Static131.anInt2605;
		if (Static296.anInt5981 > Static3.anInt38) {
			Static296.anInt5981 = Static3.anInt38;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static131.anInt2605 + Static131.anInt2605 + 2; local74++) {
			for (local77 = 0; local77 < Static131.anInt2605 + Static131.anInt2605 + 2; local77++) {
				local84 = Static97.anInt1886 + local74 - Static131.anInt2605;
				local90 = Static349.anInt6708 + local77 - Static131.anInt2605;
				if (local84 >= 0 && local90 >= 0 && local84 < Static97.anInt1852 && local90 < Static3.anInt38) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static278.aClass12Array3[3].method2704(local84, local90) - 1000;
					@Pc(137) int local137 = Static81.aClass12Array1 == null ? Static278.aClass12Array3[0].method2704(local84, local90) + 128 : Static81.aClass12Array1[0].method2704(local84, local90) + 128;
					Static296.aBooleanArrayArray8[local74][local77] = Static176.aClass105_10.method4241(local104, local117, local108, local104, local137, local108);
				} else {
					Static296.aBooleanArrayArray8[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static131.anInt2605 + Static131.anInt2605 + 1; local77++) {
			for (local84 = 0; local84 < Static131.anInt2605 + Static131.anInt2605 + 1; local84++) {
				Static50.aBooleanArrayArray1[local77][local84] = Static296.aBooleanArrayArray8[local77][local84] || Static296.aBooleanArrayArray8[local77 + 1][local84] || Static296.aBooleanArrayArray8[local77][local84 + 1] || Static296.aBooleanArrayArray8[local77 + 1][local84 + 1];
			}
		}
		Static342.anIntArray258 = arg8;
		Static259.anIntArray508 = arg9;
		Static334.anIntArray654 = arg10;
		Static18.anIntArray17 = arg11;
		Static253.anIntArray487 = arg12;
		Static250.method4505();
		Static281.method4986();
		for (@Pc(253) Class7_Sub3 local253 = (Class7_Sub3) Static88.aClass122_1.method2626(); local253 != null; local253 = (Class7_Sub3) Static88.aClass122_1.method2630()) {
			local253.method3450();
			Static32.method511(local253);
		}
		if (Static165.aBoolean263) {
			for (local90 = 0; local90 < Static168.anInt3459; local90++) {
				Static174.aClass1_Sub19_Sub1Array4[local90].method2024(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static176.aClass105_10.method4236(0);
			if (Static71.aClass135_1 == null || Static71.aClass135_1 instanceof Class135_Sub2) {
				Static71.aClass135_1 = new Class135_Sub1();
			}
		} else if (Static71.aClass135_1 == null || Static71.aClass135_1 instanceof Class135_Sub1) {
			Static71.aClass135_1 = new Class135_Sub2();
		}
		Static71.aClass135_1.method5037(arg2);
		Static71.aClass135_1.method5043();
		if (Static298.aClass83ArrayArrayArray1 != null) {
			Static187.method3326(true);
			Static71.aClass135_1.method5047(22);
			Static15.method256(arg2, null, 0, (byte) 0, arg15, arg16);
			Static71.aClass135_1.method5043();
			Static71.aClass135_1.method5047(23);
			Static187.method3326(false);
		}
		Static15.method256(arg2, arg7, arg13, arg14, arg15, arg16);
		Static71.aClass135_1.method5043();
		Static71.aClass135_1.method5041();
		Static71.aClass135_1.method5043();
		if (arg2 > 1) {
			Static176.aClass105_10.method4205(0);
		}
		Static176.aClass105_10.method4242(0, null);
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "([IIIIZIIILclient!ba;[IIIIII)I")
	public static int method2854(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class17 arg8, @OriginalArg(9) int[] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static131.anIntArrayArray25[local7][local11] = 0;
				Static257.anIntArrayArray41[local7][local11] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg5 == 1) {
			local58 = Static278.method4960(arg10, arg1, arg6, arg11, arg13, arg3, arg12, arg7, arg8, arg2);
		} else if (arg5 == 2) {
			local58 = Static172.method3079(arg11, arg10, arg1, arg12, arg2, arg13, arg8, arg7, arg3, arg6);
		} else {
			local58 = Static105.method1649(arg5, arg6, arg12, arg10, arg3, arg8, arg13, arg7, arg2, arg11, arg1);
		}
		@Pc(93) int local93 = arg7 - 64;
		@Pc(97) int local97 = arg13 - 64;
		@Pc(99) int local99 = Static315.anInt6285;
		@Pc(123) int local123 = Static100.anInt1936;
		@Pc(131) int local131;
		@Pc(133) int local133;
		@Pc(140) int local140;
		if (!local58) {
			if (!arg4) {
				return -1;
			}
			local131 = Integer.MAX_VALUE;
			local133 = Integer.MAX_VALUE;
			for (local140 = arg12 - 10; local140 <= arg12 + 10; local140++) {
				for (@Pc(147) int local147 = arg2 - 10; local147 <= arg2 + 10; local147++) {
					@Pc(154) int local154 = local140 - local93;
					@Pc(159) int local159 = local147 - local97;
					if (local154 >= 0 && local159 >= 0 && local154 < 128 && local159 < 128 && Static257.anIntArrayArray41[local154][local159] < 100) {
						@Pc(183) int local183 = 0;
						if (local140 < arg12) {
							local183 = arg12 - local140;
						} else if (local140 > arg12 + arg6 - 1) {
							local183 = local140 + 1 - arg6 - arg12;
						}
						@Pc(216) int local216 = 0;
						if (local147 < arg2) {
							local216 = arg2 - local147;
						} else if (arg1 + arg2 - 1 < local147) {
							local216 = local147 + 1 - arg1 - arg2;
						}
						@Pc(253) int local253 = local216 * local216 + local183 * local183;
						if (local253 < local131 || local253 == local131 && local133 > Static257.anIntArrayArray41[local154][local159]) {
							local131 = local253;
							local133 = Static257.anIntArrayArray41[local154][local159];
							local99 = local140;
							local123 = local147;
						}
					}
				}
			}
			if (~local131 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg7 == local99 && local123 == arg13) {
			return 0;
		}
		@Pc(315) byte local315 = 0;
		Static222.anIntArray437[0] = local99;
		local131 = local315 + 1;
		Static121.anIntArray392[0] = local123;
		@Pc(336) int local336;
		local133 = local336 = Static131.anIntArrayArray25[local99 - local93][local123 - local97];
		while (arg7 != local99 || local123 != arg13) {
			if (local336 != local133) {
				Static222.anIntArray437[local131] = local99;
				local336 = local133;
				Static121.anIntArray392[local131++] = local123;
			}
			if ((local133 & 0x1) != 0) {
				local123++;
			} else if ((local133 & 0x4) != 0) {
				local123--;
			}
			if ((local133 & 0x2) != 0) {
				local99++;
			} else if ((local133 & 0x8) != 0) {
				local99--;
			}
			local133 = Static131.anIntArrayArray25[local99 - local93][local123 - local97];
		}
		local140 = 0;
		while (local131-- > 0) {
			arg9[local140] = Static222.anIntArray437[local131];
			arg0[local140++] = Static121.anIntArray392[local131];
			if (local140 >= arg9.length) {
				break;
			}
		}
		return local140;
	}
}
