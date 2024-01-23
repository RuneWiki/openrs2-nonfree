import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!pn", name = "R", descriptor = "Lclient!pk;")
	public static Class132 aClass132_72;

	@OriginalMember(owner = "client!pn", name = "S", descriptor = "Lclient!wd;")
	public static Class8_Sub1_Sub7 aClass8_Sub1_Sub7_7;

	@OriginalMember(owner = "client!pn", name = "I", descriptor = "Z")
	public static boolean aBoolean349 = false;

	@OriginalMember(owner = "client!pn", name = "N", descriptor = "I")
	public static int anInt4304 = 0;

	@OriginalMember(owner = "client!pn", name = "O", descriptor = "[C")
	public static char[] aCharArray5 = new char[128];

	@OriginalMember(owner = "client!pn", name = "T", descriptor = "Z")
	public static boolean aBoolean350 = false;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method3294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg3 && arg0 == arg4 && arg2 == arg7 && arg8 == arg6) {
			Static257.method3874(arg1, arg0, arg5, arg2, arg6);
			return;
		}
		@Pc(32) int local32 = arg1;
		@Pc(36) int local36 = arg3 * 3;
		@Pc(40) int local40 = arg1 * 3;
		@Pc(44) int local44 = arg0 * 3;
		@Pc(46) int local46 = arg0;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(65) int local65 = local54 + local40 - local36 - local36;
		@Pc(75) int local75 = arg2 + local36 - arg1 - local54;
		@Pc(79) int local79 = arg8 * 3;
		@Pc(89) int local89 = local44 + local79 - local50 - local50;
		@Pc(94) int local94 = local36 - local40;
		@Pc(104) int local104 = local50 + arg6 - arg0 - local79;
		@Pc(109) int local109 = local50 - local44;
		for (@Pc(111) int local111 = 128; local111 <= 4096; local111 += 128) {
			@Pc(120) int local120 = local111 * local111 >> 12;
			@Pc(126) int local126 = local111 * local120 >> 12;
			@Pc(130) int local130 = local126 * local75;
			@Pc(134) int local134 = local89 * local120;
			@Pc(138) int local138 = local65 * local120;
			@Pc(142) int local142 = local126 * local104;
			@Pc(146) int local146 = local94 * local111;
			@Pc(156) int local156 = arg1 + (local138 + local130 + local146 >> 12);
			@Pc(160) int local160 = local111 * local109;
			@Pc(170) int local170 = (local160 + local142 + local134 >> 12) + arg0;
			Static257.method3874(local32, local46, arg5, local156, local170);
			local32 = local156;
			local46 = local170;
		}
	}
}
