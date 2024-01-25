import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bh", name = "t", descriptor = "Lclient!bu;")
	public static Class32 aClass32_9;

	@OriginalMember(owner = "client!bh", name = "s", descriptor = "Lclient!mq;")
	public static Class156 aClass156_1 = null;

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!rn;I)V")
	public static void method641(@OriginalArg(0) Class217 arg0) {
		Static302.aClass3_Sub7_Sub1_2.method1057(arg0.method4668());
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	public static void method642(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class118 local7 = Static263.aClass118ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null && local7.aClass7_Sub1_1 != null) {
			local7.aClass7_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method643(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg8 && arg5 == arg2 && arg0 == arg7 && arg4 == arg1) {
			Static245.method3728(arg7, arg5, arg3, arg4, arg6);
			return;
		}
		@Pc(25) int local25 = arg6;
		@Pc(27) int local27 = arg5;
		@Pc(31) int local31 = arg6 * 3;
		@Pc(35) int local35 = arg5 * 3;
		@Pc(39) int local39 = arg8 * 3;
		@Pc(43) int local43 = arg2 * 3;
		@Pc(47) int local47 = arg0 * 3;
		@Pc(51) int local51 = arg1 * 3;
		@Pc(62) int local62 = arg7 + local39 - local47 - arg6;
		@Pc(71) int local71 = local43 + arg4 - local51 - arg5;
		@Pc(80) int local80 = local47 + local31 - local39 - local39;
		@Pc(90) int local90 = local51 + local35 - local43 - local43;
		@Pc(94) int local94 = local39 - local31;
		@Pc(99) int local99 = local43 - local35;
		for (@Pc(101) int local101 = 128; local101 <= 4096; local101 += 128) {
			@Pc(108) int local108 = local101 * local101 >> 12;
			@Pc(114) int local114 = local108 * local101 >> 12;
			@Pc(118) int local118 = local62 * local114;
			@Pc(122) int local122 = local114 * local71;
			@Pc(126) int local126 = local108 * local80;
			@Pc(130) int local130 = local90 * local108;
			@Pc(134) int local134 = local101 * local94;
			@Pc(138) int local138 = local101 * local99;
			@Pc(149) int local149 = (local134 + local118 + local126 >> 12) + arg6;
			@Pc(160) int local160 = (local130 + local122 + local138 >> 12) + arg5;
			Static245.method3728(local149, local27, arg3, local160, local25);
			local25 = local149;
			local27 = local160;
		}
	}
}
