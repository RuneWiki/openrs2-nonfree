import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "F")
	public static float aFloat33;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Z[IIIIIILclient!dg;III[IIII)I", line = 91)
	public static int method2656(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class46 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13) {
		for (@Pc(3) int local3 = 0; local3 < 128; local3++) {
			for (@Pc(7) int local7 = 0; local7 < 128; local7++) {
				Class2_Sub3_Sub30.anIntArrayArray49[local3][local7] = 0;
				Class11_Sub1_Sub1.anIntArrayArray4[local3][local7] = 99999999;
			}
		}
		@Pc(55) boolean local55;
		if (arg11 == 1) {
			local55 = Static7.method6464(arg6, arg2, arg4, arg13, arg12, arg9, arg3, arg5, arg8, arg7);
		} else if (arg11 == 2) {
			local55 = Static213.method4018(arg13, arg12, arg5, arg4, arg9, arg8, arg7, arg6, arg3, arg2);
		} else {
			local55 = Static263.method4928(arg3, arg11, arg5, arg4, arg12, arg9, arg6, arg8, arg2, arg13, arg7);
		}
		@Pc(95) int local95 = arg7 - 64;
		@Pc(99) int local99 = arg13 - 64;
		@Pc(101) int local101 = Static172.anInt3431;
		@Pc(108) int local108 = Static170.anInt3418;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(123) int local123;
		if (!local55) {
			if (!arg0) {
				return -1;
			}
			local114 = Integer.MAX_VALUE;
			local116 = Integer.MAX_VALUE;
			for (local123 = arg9 - 10; local123 <= arg9 + 10; local123++) {
				for (@Pc(130) int local130 = arg12 - 10; local130 <= arg12 + 10; local130++) {
					@Pc(137) int local137 = local123 - local95;
					@Pc(142) int local142 = local130 - local99;
					if (local137 >= 0 && local142 >= 0 && local137 < 128 && local142 < 128 && Class11_Sub1_Sub1.anIntArrayArray4[local137][local142] < 100) {
						@Pc(169) int local169 = 0;
						if (local123 < arg9) {
							local169 = arg9 - local123;
						} else if (arg2 + arg9 - 1 < local123) {
							local169 = local123 + 1 - arg2 - arg9;
						}
						@Pc(201) int local201 = 0;
						if (local130 < arg12) {
							local201 = arg12 - local130;
						} else if (local130 > arg12 + arg8 - 1) {
							local201 = local130 + 1 - arg12 - arg8;
						}
						@Pc(237) int local237 = local169 * local169 + local201 * local201;
						if (local237 < local114 || local237 == local114 && Class11_Sub1_Sub1.anIntArrayArray4[local137][local142] < local116) {
							local101 = local123;
							local108 = local130;
							local114 = local237;
							local116 = Class11_Sub1_Sub1.anIntArrayArray4[local137][local142];
						}
					}
				}
			}
			if (~local114 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (arg7 == local101 && local108 == arg13) {
			return 0;
		}
		@Pc(310) byte local310 = 0;
		Class37_Sub1.anIntArray90[0] = local101;
		local114 = local310 + 1;
		Class14.anIntArray257[0] = local108;
		@Pc(332) int local332;
		local116 = local332 = Class2_Sub3_Sub30.anIntArrayArray49[local101 - local95][local108 - local99];
		while (arg7 != local101 || local108 != arg13) {
			if (local332 != local116) {
				local332 = local116;
				Class37_Sub1.anIntArray90[local114] = local101;
				Class14.anIntArray257[local114++] = local108;
			}
			if ((local116 & 0x2) != 0) {
				local101++;
			} else if ((local116 & 0x8) != 0) {
				local101--;
			}
			if ((local116 & 0x1) != 0) {
				local108++;
			} else if ((local116 & 0x4) != 0) {
				local108--;
			}
			local116 = Class2_Sub3_Sub30.anIntArrayArray49[local101 - local95][local108 - local99];
		}
		local123 = 0;
		while (local114-- > 0) {
			arg1[local123] = Class37_Sub1.anIntArray90[local114];
			arg10[local123++] = Class14.anIntArray257[local114];
			if (arg1.length <= local123) {
				break;
			}
		}
		return local123;
	}

	@OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 370)
	public static void method2657() {
		if (Class2_Sub3_Sub15.anInt2650 <= 0) {
			Class22.aString9 = "";
			return;
		}
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < Static117.aStringArray65.length; local19++) {
			if (Static117.aStringArray65[local19].startsWith("--> ")) {
				local17++;
				if (Class2_Sub3_Sub15.anInt2650 == local17) {
					Class22.aString9 = Static117.aStringArray65[local19].substring(4);
					return;
				}
			}
		}
	}
}
