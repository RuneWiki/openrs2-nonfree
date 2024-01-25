import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!af", name = "o", descriptor = "S")
	public static short aShort1 = 205;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!cs;Lclient!tv;ILclient!ya;Lclient!b;II)V")
	public static void method26(@OriginalArg(1) Class7_Sub11 arg0, @OriginalArg(2) Class241 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class51 arg3, @OriginalArg(5) Class20 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(15) int local15 = arg0.anInt1057 - arg6 / 2 - 5;
		@Pc(19) int local19 = arg5 + 2;
		if (arg4.anInt292 != 0) {
			arg3.method5286(arg6 + 10, arg4.anInt292, local15, arg2 * arg1.method5055() + arg5 + 1 - local19, local19);
		}
		if (arg4.anInt311 != 0) {
			arg3.method5325(local19, arg4.anInt311, arg6 + 10, arg2 * arg1.method5055() + 1 + (arg5 - local19), local15);
		}
		@Pc(69) int local69 = arg4.anInt296;
		if (arg0.aBoolean65 && arg4.anInt319 != -1) {
			local69 = arg4.anInt319;
		}
		for (@Pc(86) int local86 = 0; local86 < arg2; local86++) {
			@Pc(92) String local92 = Static165.aStringArray25[local86];
			if (arg2 - 1 > local86) {
				local92 = local92.substring(0, local92.length() - 4);
			}
			arg1.method5056(arg3, local92, arg0.anInt1057, arg5, local69);
			arg5 += arg1.method5055();
		}
	}
}
