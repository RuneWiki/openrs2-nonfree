import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "Lclient!st;")
	public static Class227 aClass227_5;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!tc;")
	public static final Class1_Sub41 aClass1_Sub41_1 = new Class1_Sub41(0, 0);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII[IIILclient!vb;[IZIBIII)I")
	public static int method4643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class247 arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static411.anIntArrayArray171[local3][local7] = 0;
				Static397.anIntArrayArray162[local3][local7] = 99999999;
			}
		}
		@Pc(54) boolean local54;
		if (arg10 == 1) {
			local54 = Static150.method2102(arg5, arg11, arg13, arg0, arg7, arg1, arg3, arg2, arg6, arg12);
		} else if (arg10 == 2) {
			local54 = Static298.method3896(arg2, arg6, arg5, arg11, arg1, arg12, arg7, arg13, arg3, arg0);
		} else {
			local54 = Static121.method1656(arg6, arg3, arg13, arg12, arg5, arg10, arg2, arg7, arg1, arg0, arg11);
		}
		@Pc(91) int local91 = arg1 - 64;
		@Pc(95) int local95 = arg5 - 64;
		@Pc(97) int local97 = Static410.anInt6682;
		@Pc(99) int local99 = Static341.anInt5564;
		@Pc(107) int local107;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (!local54) {
			if (!arg9) {
				return -1;
			}
			local107 = Integer.MAX_VALUE;
			local109 = Integer.MAX_VALUE;
			for (local115 = arg2 - 10; local115 <= arg2 + 10; local115++) {
				for (@Pc(122) int local122 = arg6 - 10; local122 <= arg6 + 10; local122++) {
					@Pc(129) int local129 = local115 - local91;
					@Pc(134) int local134 = local122 - local95;
					if (local129 >= 0 && local134 >= 0 && local129 < 128 && local134 < 128 && Static397.anIntArrayArray162[local129][local134] < 100) {
						@Pc(160) int local160 = 0;
						if (arg2 > local115) {
							local160 = arg2 - local115;
						} else if (local115 > arg13 + arg2 - 1) {
							local160 = local115 + 1 - arg13 - arg2;
						}
						@Pc(191) int local191 = 0;
						if (arg6 > local122) {
							local191 = arg6 - local122;
						} else if (arg6 + arg11 - 1 < local122) {
							local191 = local122 + 1 - arg11 - arg6;
						}
						@Pc(227) int local227 = local191 * local191 + local160 * local160;
						if (local227 < local107 || local107 == local227 && local109 > Static397.anIntArrayArray162[local129][local134]) {
							local107 = local227;
							local109 = Static397.anIntArrayArray162[local129][local134];
							local97 = local115;
							local99 = local122;
						}
					}
				}
			}
			if (~local107 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg1 == local97 && local99 == arg5) {
			return 0;
		}
		@Pc(298) byte local298 = 0;
		Static40.anIntArray253[0] = local97;
		local107 = local298 + 1;
		Static145.anIntArray117[0] = local99;
		@Pc(319) int local319;
		local109 = local319 = Static411.anIntArrayArray171[local97 - local91][local99 - local95];
		while (arg1 != local97 || local99 != arg5) {
			if (local319 != local109) {
				Static40.anIntArray253[local107] = local97;
				local319 = local109;
				Static145.anIntArray117[local107++] = local99;
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
			local109 = Static411.anIntArrayArray171[local97 - local91][local99 - local95];
		}
		local115 = 0;
		while (local107-- > 0) {
			arg4[local115] = Static40.anIntArray253[local107];
			arg8[local115++] = Static145.anIntArray117[local107];
			if (arg4.length <= local115) {
				break;
			}
		}
		return local115;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
	public static void method4644() {
		Static312.aClass1_Sub9_Sub4_3.method4607();
		Static356.anInt5885 = 1;
		Static436.aClass113_131 = null;
	}
}
