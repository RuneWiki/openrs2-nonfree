import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!fw", name = "H", descriptor = "Lclient!oq;")
	public static Class259 aClass259_1;

	@OriginalMember(owner = "client!fw", name = "J", descriptor = "I")
	public static int anInt3541;

	@OriginalMember(owner = "client!fw", name = "B", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_73 = new Class180(75, 6);

	@OriginalMember(owner = "client!fw", name = "G", descriptor = "Lclient!cf;")
	public static final Class56 aClass56_6 = new Class56();

	@OriginalMember(owner = "client!fw", name = "I", descriptor = "I")
	public static int anInt3540 = 0;

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(II[IIZI[IIIILclient!oga;IIII)I")
	public static int method3220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class252 arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static199.anIntArrayArray20[local5][local8] = 0;
				Static94.anIntArrayArray13[local5][local8] = 99999999;
			}
		}
		@Pc(51) boolean local51;
		if (arg1 == 1) {
			local51 = Static441.method6270(arg10, arg9, arg12, arg5, arg7, arg0, arg13, arg11, arg3, arg8);
		} else if (arg1 == 2) {
			local51 = Static80.method8195(arg12, arg7, arg10, arg8, arg3, arg0, arg13, arg5, arg9, arg11);
		} else {
			local51 = Static29.method692(arg7, arg13, arg0, arg11, arg12, arg9, arg3, arg1, arg5, arg8, arg10);
		}
		@Pc(87) int local87 = arg5 - 64;
		@Pc(91) int local91 = arg7 - 64;
		@Pc(93) int local93 = Static421.anInt6741;
		@Pc(95) int local95 = Static561.anInt9113;
		@Pc(103) int local103;
		@Pc(112) int local112;
		@Pc(118) int local118;
		if (!local51) {
			if (!arg4) {
				return -1;
			}
			local103 = Integer.MAX_VALUE;
			@Pc(105) int local105 = Integer.MAX_VALUE;
			for (local112 = arg11 - 10; local112 <= arg11 + 10; local112++) {
				for (local118 = arg0 - 10; local118 <= arg0 + 10; local118++) {
					@Pc(124) int local124 = local112 - local87;
					@Pc(129) int local129 = local118 - local91;
					if (local124 >= 0 && local129 >= 0 && local124 < 128 && local129 < 128 && Static94.anIntArrayArray13[local124][local129] < 100) {
						@Pc(153) int local153 = 0;
						if (arg11 > local112) {
							local153 = arg11 - local112;
						} else if (arg11 + arg8 - 1 < local112) {
							local153 = local112 + 1 - arg11 - arg8;
						}
						@Pc(185) int local185 = 0;
						if (local118 < arg0) {
							local185 = arg0 - local118;
						} else if (local118 > arg0 + arg10 - 1) {
							local185 = local118 + 1 - arg10 - arg0;
						}
						@Pc(221) int local221 = local185 * local185 + local153 * local153;
						if (local103 > local221 || local221 == local103 && local105 > Static94.anIntArrayArray13[local124][local129]) {
							local93 = local112;
							local105 = Static94.anIntArrayArray13[local124][local129];
							local103 = local221;
							local95 = local118;
						}
					}
				}
			}
			if (local103 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local93 == arg5 && local95 == arg7) {
			return 0;
		}
		@Pc(285) byte local285 = 0;
		Static19.anIntArray26[0] = local93;
		local103 = local285 + 1;
		Static491.anIntArray684[0] = local95;
		@Pc(315) int local315 = local112 = Static199.anIntArrayArray20[local93 - local87][local95 - local91];
		while (local93 != arg5 || arg7 != local95) {
			if (local315 != local112) {
				local112 = local315;
				Static19.anIntArray26[local103] = local93;
				Static491.anIntArray684[local103++] = local95;
			}
			if ((local315 & 0x1) != 0) {
				local95++;
			} else if ((local315 & 0x4) != 0) {
				local95--;
			}
			if ((local315 & 0x2) != 0) {
				local93++;
			} else if ((local315 & 0x8) != 0) {
				local93--;
			}
			local315 = Static199.anIntArrayArray20[local93 - local87][local95 - local91];
		}
		local118 = 0;
		while (local103-- > 0) {
			arg6[local118] = Static19.anIntArray26[local103];
			arg2[local118++] = Static491.anIntArray684[local103];
			if (arg6.length <= local118) {
				break;
			}
		}
		return local118;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(ZLclient!aga;)I")
	public static int method3221(@OriginalArg(1) Class10 arg0) {
		if (arg0 == Static437.aClass10_2) {
			return 9216;
		} else if (arg0 == Static263.aClass10_1) {
			return 34065;
		} else if (Static660.aClass10_4 == arg0) {
			return 34066;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
