import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_11 = new Class274(36, 6);

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIII[IZIIIILclient!jn;Z[III)I")
	public static int method748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class179 arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(5) int local5 = 0; local5 < 128; local5++) {
			for (@Pc(8) int local8 = 0; local8 < 128; local8++) {
				Static559.anIntArrayArray88[local5][local8] = 0;
				Static597.anIntArrayArray96[local5][local8] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg6 == 1) {
			local55 = Static204.method3579(arg0, arg3, arg12, arg7, arg9, arg10, arg8, arg13, arg2, arg1);
		} else if (arg6 == 2) {
			local55 = Static77.method1459(arg0, arg12, arg13, arg9, arg8, arg7, arg1, arg2, arg10, arg3);
		} else {
			local55 = Static12.method288(arg7, arg8, arg1, arg12, arg2, arg13, arg0, arg3, arg6, arg9, arg10);
		}
		@Pc(87) int local87 = arg13 - 64;
		@Pc(96) int local96 = arg3 - 64;
		@Pc(98) int local98 = Static540.anInt9014;
		@Pc(100) int local100 = Static590.anInt9764;
		@Pc(108) int local108;
		@Pc(110) int local110;
		@Pc(116) int local116;
		if (!local55) {
			if (!arg5) {
				return -1;
			}
			local108 = Integer.MAX_VALUE;
			local110 = Integer.MAX_VALUE;
			for (local116 = arg7 - 10; local116 <= arg7 + 10; local116++) {
				for (@Pc(122) int local122 = arg9 - 10; local122 <= arg9 + 10; local122++) {
					@Pc(128) int local128 = local116 - local87;
					@Pc(133) int local133 = local122 - local96;
					if (local128 >= 0 && local133 >= 0 && local128 < 128 && local133 < 128 && Static597.anIntArrayArray96[local128][local133] < 100) {
						@Pc(157) int local157 = 0;
						if (local116 < arg7) {
							local157 = arg7 - local116;
						} else if (arg7 + arg8 - 1 < local116) {
							local157 = local116 + 1 - arg7 - arg8;
						}
						@Pc(187) int local187 = 0;
						if (arg9 > local122) {
							local187 = arg9 - local122;
						} else if (arg2 + arg9 - 1 < local122) {
							local187 = local122 + 1 - arg9 - arg2;
						}
						@Pc(230) int local230 = local157 * local157 + local187 * local187;
						if (local108 > local230 || local108 == local230 && Static597.anIntArrayArray96[local128][local133] < local110) {
							local108 = local230;
							local98 = local116;
							local100 = local122;
							local110 = Static597.anIntArrayArray96[local128][local133];
						}
					}
				}
			}
			if (local108 == Integer.MAX_VALUE) {
				return -1;
			}
		}
		if (arg13 == local98 && local100 == arg3) {
			return 0;
		}
		@Pc(295) byte local295 = 0;
		Static369.anIntArray441[0] = local98;
		local108 = local295 + 1;
		Static423.anIntArray719[0] = local100;
		@Pc(316) int local316;
		local110 = local316 = Static559.anIntArrayArray88[local98 - local87][local100 - local96];
		while (local98 != arg13 || arg3 != local100) {
			if (local110 != local316) {
				Static369.anIntArray441[local108] = local98;
				local316 = local110;
				Static423.anIntArray719[local108++] = local100;
			}
			if ((local110 & 0x2) != 0) {
				local98++;
			} else if ((local110 & 0x8) != 0) {
				local98--;
			}
			if ((local110 & 0x1) != 0) {
				local100++;
			} else if ((local110 & 0x4) != 0) {
				local100--;
			}
			local110 = Static559.anIntArrayArray88[local98 - local87][local100 - local96];
		}
		local116 = 0;
		while (local108-- > 0) {
			arg11[local116] = Static369.anIntArray441[local108];
			arg4[local116++] = Static423.anIntArray719[local108];
			if (local116 >= arg11.length) {
				break;
			}
		}
		return local116;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method750() {
		for (@Pc(8) int local8 = 0; local8 < Static74.anInt1598; local8++) {
			@Pc(14) Class208 local14 = Static492.aClass208Array1[local8];
			if (local14.aByte89 == 3) {
				if (local14.aClass2_Sub2_Sub5_4 == null) {
					local14.anInt6158 = Integer.MIN_VALUE;
				} else {
					Static1.aClass2_Sub2_Sub2_6.method1042(local14.aClass2_Sub2_Sub5_4);
				}
			}
		}
	}
}
