import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static492 {

	@OriginalMember(owner = "client!tl", name = "C", descriptor = "Lclient!lq;")
	public static Class189 aClass189_1;

	@OriginalMember(owner = "client!tl", name = "L", descriptor = "Lclient!pq;")
	public static Class251 aClass251_136;

	@OriginalMember(owner = "client!tl", name = "B", descriptor = "Ljava/lang/String;")
	public static String aString102 = null;

	@OriginalMember(owner = "client!tl", name = "N", descriptor = "I")
	public static int anInt8232 = -1;

	@OriginalMember(owner = "client!tl", name = "Q", descriptor = "Z")
	public static boolean aBoolean560 = false;

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method6799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg3 && arg7 == arg5 && arg6 == arg0 && arg2 == arg4) {
			Static517.method6762(arg5, arg3, arg0, arg4, arg8);
			return;
		}
		@Pc(36) int local36 = arg3;
		@Pc(38) int local38 = arg5;
		@Pc(42) int local42 = arg3 * 3;
		@Pc(46) int local46 = arg5 * 3;
		@Pc(50) int local50 = arg1 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg2 * 3;
		@Pc(71) int local71 = local50 + arg0 - local58 - arg3;
		@Pc(81) int local81 = local54 + arg4 - arg5 - local62;
		@Pc(92) int local92 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local46 + local62 - local54 - local54;
		@Pc(105) int local105 = local50 - local42;
		@Pc(110) int local110 = local54 - local46;
		for (@Pc(112) int local112 = 128; local112 <= 4096; local112 += 128) {
			@Pc(120) int local120 = local112 * local112 >> 12;
			@Pc(126) int local126 = local120 * local112 >> 12;
			@Pc(130) int local130 = local71 * local126;
			@Pc(134) int local134 = local126 * local81;
			@Pc(138) int local138 = local92 * local120;
			@Pc(142) int local142 = local120 * local101;
			@Pc(146) int local146 = local112 * local105;
			@Pc(150) int local150 = local112 * local110;
			@Pc(162) int local162 = arg3 + (local146 + local130 + local138 >> 12);
			@Pc(173) int local173 = (local150 + local134 + local142 >> 12) + arg5;
			Static517.method6762(local38, local36, local162, local173, arg8);
			local36 = local162;
			local38 = local173;
		}
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(BC)C")
	public static char method6800(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}
}
