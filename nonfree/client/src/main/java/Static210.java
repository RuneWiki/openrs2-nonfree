import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!ica", name = "f", descriptor = "F")
	public static float aFloat106;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(IIIIZ[ILclient!cp;IZIIII[II)I")
	public static int method3321(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class59 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Static546.anIntArrayArray195[local3][local7] = 0;
				Static485.anIntArrayArray180[local3][local7] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg13 == 1) {
			local55 = Static479.method6515(arg9, arg6, arg2, arg10, arg0, arg11, arg8, arg1, arg5, arg3);
		} else if (arg13 == 2) {
			local55 = Static487.method6596(arg1, arg10, arg2, arg8, arg3, arg11, arg5, arg9, arg0, arg6);
		} else {
			local55 = Static66.method1184(arg11, arg6, arg3, arg10, arg8, arg13, arg1, arg9, arg5, arg0, arg2);
		}
		@Pc(94) int local94 = arg0 - 64;
		@Pc(98) int local98 = arg3 - 64;
		@Pc(100) int local100 = Static115.anInt2240;
		@Pc(102) int local102 = Static215.anInt4124;
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(116) int local116;
		if (!local55) {
			if (!arg7) {
				return -1;
			}
			local108 = Integer.MAX_VALUE;
			local110 = Integer.MAX_VALUE;
			for (local116 = arg8 - 10; local116 <= arg8 + 10; local116++) {
				for (@Pc(123) int local123 = arg6 - 10; local123 <= arg6 + 10; local123++) {
					@Pc(129) int local129 = local116 - local94;
					@Pc(134) int local134 = local123 - local98;
					if (local129 >= 0 && local134 >= 0 && local129 < 128 && local134 < 128 && Static485.anIntArrayArray180[local129][local134] < 100) {
						@Pc(160) int local160 = 0;
						if (local116 < arg8) {
							local160 = arg8 - local116;
						} else if (arg8 + arg2 - 1 < local116) {
							local160 = local116 + 1 - arg8 - arg2;
						}
						@Pc(196) int local196 = 0;
						if (arg6 > local123) {
							local196 = arg6 - local123;
						} else if (arg6 + arg9 - 1 < local123) {
							local196 = local123 + 1 - arg6 - arg9;
						}
						@Pc(240) int local240 = local196 * local196 + local160 * local160;
						if (local108 > local240 || local240 == local108 && local110 > Static485.anIntArrayArray180[local129][local134]) {
							local102 = local123;
							local100 = local116;
							local110 = Static485.anIntArrayArray180[local129][local134];
							local108 = local240;
						}
					}
				}
			}
			if (local108 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (local100 == arg0 && arg3 == local102) {
			return 0;
		}
		@Pc(307) byte local307 = 0;
		Static145.anIntArray230[0] = local100;
		local108 = local307 + 1;
		Static286.anIntArray636[0] = local102;
		@Pc(329) int local329;
		local110 = local329 = Static546.anIntArrayArray195[local100 - local94][local102 - local98];
		while (local100 != arg0 || arg3 != local102) {
			if (local329 != local110) {
				Static145.anIntArray230[local108] = local100;
				local329 = local110;
				Static286.anIntArray636[local108++] = local102;
			}
			if ((local110 & 0x1) != 0) {
				local102++;
			} else if ((local110 & 0x4) != 0) {
				local102--;
			}
			if ((local110 & 0x2) != 0) {
				local100++;
			} else if ((local110 & 0x8) != 0) {
				local100--;
			}
			local110 = Static546.anIntArrayArray195[local100 - local94][local102 - local98];
		}
		local116 = 0;
		while (local108-- > 0) {
			arg12[local116] = Static145.anIntArray230[local108];
			arg4[local116++] = Static286.anIntArray636[local108];
			if (arg12.length <= local116) {
				break;
			}
		}
		return local116;
	}
}
