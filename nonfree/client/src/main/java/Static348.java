import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!wi", name = "X", descriptor = "Lclient!qj;")
	public static Class165 aClass165_57;

	@OriginalMember(owner = "client!wi", name = "T", descriptor = "Lclient!br;")
	public static Class26 aClass26_20 = new Class26(8);

	@OriginalMember(owner = "client!wi", name = "W", descriptor = "[I")
	public static final int[] anIntArray439 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method3535(@OriginalArg(0) String arg0) {
		Static119.aString76 = arg0;
		if (Static180.aClass110_6.anApplet1 == null) {
			return;
		}
		try {
			@Pc(14) String local14 = Static180.aClass110_6.anApplet1.getParameter("cookieprefix");
			@Pc(19) String local19 = Static180.aClass110_6.anApplet1.getParameter("cookiehost");
			@Pc(34) String local34 = local14 + "settings=" + arg0 + "; version=1; path=/; domain=" + local19;
			if (arg0.length() == 0) {
				local34 = local34 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
			} else {
				local34 = local34 + "; Expires=" + Static149.method2391(Static349.method5647() + 94608000000L) + "; Max-Age=" + 94608000L;
			}
			Static365.method4927(Static180.aClass110_6.anApplet1, "document.cookie=\"" + local34 + "\"");
		} catch (@Pc(91) Throwable local91) {
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;I)I")
	public static int method3536(@OriginalArg(1) String arg0) {
		return Static239.method4253(arg0, 16);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIBIIII)V")
	public static void method3537(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(9) int local9 = arg1 - arg5;
		@Pc(13) int local13 = arg5 + arg2;
		for (@Pc(15) int local15 = arg2; local15 < local13; local15++) {
			Static97.method1784(arg3, Static327.anIntArrayArray63[local15], arg4, arg0);
		}
		@Pc(33) int local33 = arg3 + arg5;
		for (@Pc(35) int local35 = arg1; local35 > local9; local35--) {
			Static97.method1784(arg3, Static327.anIntArrayArray63[local35], arg4, arg0);
		}
		@Pc(54) int local54 = arg0 - arg5;
		for (@Pc(62) int local62 = local13; local62 <= local9; local62++) {
			@Pc(68) int[] local68 = Static327.anIntArrayArray63[local62];
			Static97.method1784(arg3, local68, arg4, local33);
			Static97.method1784(local54, local68, arg4, arg0);
		}
	}
}
