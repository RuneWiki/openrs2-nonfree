import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vi", name = "e", descriptor = "Lclient!gt;")
	public static Class93 aClass93_5;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Lclient!ud;")
	public static final Class5_Sub40 aClass5_Sub40_2 = new Class5_Sub40(0, -1);

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIB)Ljava/lang/String;")
	public static String method5697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!dk;IIZLclient!dk;IZ)I")
	public static int method5698(@OriginalArg(0) Class50_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class50_Sub1 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static84.method1239(arg3, arg2, arg0, arg4);
		if (local10 != 0) {
			return arg2 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static84.method1239(arg3, arg5, arg0, arg1);
			return arg5 ? -local42 : local42;
		}
	}
}
