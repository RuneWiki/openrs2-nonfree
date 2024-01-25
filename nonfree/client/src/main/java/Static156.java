import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static156 {

	@OriginalMember(owner = "client!ffa", name = "I", descriptor = "I")
	public static int anInt3080;

	@OriginalMember(owner = "client!ffa", name = "G", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!ffa", name = "O", descriptor = "Lclient!bu;")
	public static Class44 aClass44_62 = null;

	@OriginalMember(owner = "client!ffa", name = "Q", descriptor = "I")
	public static int anInt3087 = 0;

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BIIIIIIIII)V")
	public static void method2525(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg7 == arg5 && arg6 == arg3 && arg4 == arg1 && arg8 == arg2) {
			Static279.method4040(arg0, arg4, arg8, arg7, arg3);
			return;
		}
		@Pc(41) int local41 = arg7;
		@Pc(43) int local43 = arg3;
		@Pc(47) int local47 = arg7 * 3;
		@Pc(51) int local51 = arg3 * 3;
		@Pc(55) int local55 = arg5 * 3;
		@Pc(59) int local59 = arg6 * 3;
		@Pc(63) int local63 = arg1 * 3;
		@Pc(67) int local67 = arg2 * 3;
		@Pc(76) int local76 = local55 + arg4 - local63 - arg7;
		@Pc(86) int local86 = local59 + arg8 - arg3 - local67;
		@Pc(96) int local96 = local47 + local63 - local55 - local55;
		@Pc(105) int local105 = local51 + local67 - local59 - local59;
		@Pc(109) int local109 = local55 - local47;
		@Pc(114) int local114 = local59 - local51;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(130) int local130 = local124 * local116 >> 12;
			@Pc(134) int local134 = local76 * local130;
			@Pc(138) int local138 = local86 * local130;
			@Pc(142) int local142 = local124 * local96;
			@Pc(146) int local146 = local105 * local124;
			@Pc(150) int local150 = local109 * local116;
			@Pc(154) int local154 = local116 * local114;
			@Pc(164) int local164 = arg7 + (local150 + local142 + local134 >> 12);
			@Pc(174) int local174 = (local138 + local146 + local154 >> 12) + arg3;
			Static279.method4040(arg0, local164, local174, local41, local43);
			local41 = local164;
			local43 = local174;
		}
	}

	@OriginalMember(owner = "client!ffa", name = "b", descriptor = "(IIB)Z")
	public static boolean method2526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
