import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static207 {

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!cb;")
	public static Class32 aClass32_1;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Ljava/lang/String;")
	public static String aString34 = null;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!pn;")
	public static final Class183 aClass183_59 = new Class183(74, 4);

	@OriginalMember(owner = "client!me", name = "j", descriptor = "Lclient!vf;")
	public static final Class238 aClass238_18 = new Class238();

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIIII)Z")
	public static boolean method3777(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		if (arg5 + arg1 > arg2 && arg1 < arg7 + arg2) {
			return arg3 + arg0 > arg4 && arg3 < arg6 + arg4;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method3778() {
		Static379.anImage3 = null;
		Static160.aFont1 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method3779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg2 && arg6 == arg4 && arg8 == arg5 && arg7 == arg0) {
			Static176.method3283(arg2, arg5, arg6, arg0, arg3);
			return;
		}
		@Pc(32) int local32 = arg2;
		@Pc(34) int local34 = arg6;
		@Pc(38) int local38 = arg2 * 3;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg1 * 3;
		@Pc(50) int local50 = arg4 * 3;
		@Pc(54) int local54 = arg8 * 3;
		@Pc(58) int local58 = arg7 * 3;
		@Pc(68) int local68 = arg5 + local46 - arg2 - local54;
		@Pc(78) int local78 = local50 + arg0 - local58 - arg6;
		@Pc(87) int local87 = local38 + local54 - local46 - local46;
		@Pc(97) int local97 = local58 + local42 - local50 - local50;
		@Pc(101) int local101 = local46 - local38;
		@Pc(106) int local106 = local50 - local42;
		for (@Pc(108) int local108 = 128; local108 <= 4096; local108 += 128) {
			@Pc(116) int local116 = local108 * local108 >> 12;
			@Pc(122) int local122 = local116 * local108 >> 12;
			@Pc(126) int local126 = local122 * local68;
			@Pc(130) int local130 = local122 * local78;
			@Pc(134) int local134 = local87 * local116;
			@Pc(138) int local138 = local97 * local116;
			@Pc(142) int local142 = local108 * local101;
			@Pc(146) int local146 = local108 * local106;
			@Pc(156) int local156 = arg2 + (local134 + local126 + local142 >> 12);
			@Pc(166) int local166 = (local138 + local130 + local146 >> 12) + arg6;
			Static176.method3283(local32, local156, local34, local166, arg3);
			local34 = local166;
			local32 = local156;
		}
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(II)I")
	public static int method3780(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
