import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!dp", name = "X", descriptor = "Lclient!lf;")
	public static Class153 aClass153_2;

	@OriginalMember(owner = "client!dp", name = "Y", descriptor = "Lclient!bc;")
	public static Class21 aClass21_1;

	@OriginalMember(owner = "client!dp", name = "Z", descriptor = "I")
	public static int anInt1648;

	@OriginalMember(owner = "client!dp", name = "S", descriptor = "Lclient!os;")
	public static final Class182 aClass182_64 = new Class182("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

	@OriginalMember(owner = "client!dp", name = "W", descriptor = "I")
	public static int anInt1647 = -1;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILclient!sd;IIBIIZIII[II[I)I")
	public static int method1496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class220 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 128; local11++) {
				Static315.anIntArrayArray49[local7][local11] = 0;
				Static282.anIntArrayArray45[local7][local11] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg12 == 1) {
			local55 = Static273.method3838(arg10, arg3, arg9, arg2, arg0, arg1, arg6, arg5, arg8, arg4);
		} else if (arg12 == 2) {
			local55 = Static76.method1415(arg10, arg2, arg4, arg6, arg8, arg3, arg9, arg1, arg5, arg0);
		} else {
			local55 = Static446.method5983(arg4, arg8, arg3, arg5, arg10, arg9, arg0, arg2, arg6, arg1, arg12);
		}
		@Pc(91) int local91 = arg5 - 64;
		@Pc(95) int local95 = arg0 - 64;
		@Pc(97) int local97 = Static243.anInt4413;
		@Pc(99) int local99 = Static136.anInt2794;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(116) int local116;
		if (!local55) {
			if (!arg7) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local116 = arg8 - 10; local116 <= arg8 + 10; local116++) {
				for (@Pc(123) int local123 = arg9 - 10; local123 <= arg9 + 10; local123++) {
					@Pc(130) int local130 = local116 - local91;
					@Pc(134) int local134 = local123 - local95;
					if (local130 >= 0 && local134 >= 0 && local130 < 128 && local134 < 128 && Static282.anIntArrayArray45[local130][local134] < 100) {
						@Pc(160) int local160 = 0;
						if (local116 < arg8) {
							local160 = arg8 - local116;
						} else if (arg8 + arg4 - 1 < local116) {
							local160 = local116 + 1 - arg8 - arg4;
						}
						@Pc(191) int local191 = 0;
						if (local123 < arg9) {
							local191 = arg9 - local123;
						} else if (local123 > arg9 + arg6 - 1) {
							local191 = local123 + 1 - arg9 - arg6;
						}
						@Pc(224) int local224 = local191 * local191 + local160 * local160;
						if (local107 > local224 || local224 == local107 && local109 > Static282.anIntArrayArray45[local130][local134]) {
							local107 = local224;
							local97 = local116;
							local99 = local123;
							local109 = Static282.anIntArrayArray45[local130][local134];
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local97 == arg5 && local99 == arg0) {
			return 0;
		}
		@Pc(315) byte local315 = 0;
		Static422.anIntArray685[0] = local97;
		local107 = local315 + 1;
		Static392.anIntArray649[0] = local99;
		@Pc(337) int local337;
		local109 = local337 = Static315.anIntArrayArray49[local97 - local91][local99 - local95];
		while (arg5 != local97 || local99 != arg0) {
			if (local109 != local337) {
				local337 = local109;
				Static422.anIntArray685[local107] = local97;
				Static392.anIntArray649[local107++] = local99;
			}
			if ((local109 & 0x2) != 0) {
				local97++;
			} else if ((local109 & 0x8) != 0) {
				local97--;
			}
			if ((local109 & 0x1) != 0) {
				local99++;
			} else if ((local109 & 0x4) != 0) {
				local99--;
			}
			local109 = Static315.anIntArrayArray49[local97 - local91][local99 - local95];
		}
		local116 = 0;
		while (local107-- > 0) {
			arg13[local116] = Static422.anIntArray685[local107];
			arg11[local116++] = Static392.anIntArray649[local107];
			if (local116 >= arg13.length) {
				break;
			}
		}
		return local116;
	}
}
