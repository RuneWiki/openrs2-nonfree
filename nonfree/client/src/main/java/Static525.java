import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static525 {

	@OriginalMember(owner = "client!ub", name = "Q", descriptor = "Lclient!fu;")
	public static Class106 aClass106_8;

	@OriginalMember(owner = "client!ub", name = "N", descriptor = "Lclient!ow;")
	public static final Class252 aClass252_4 = new Class252();

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZLclient!ho;Lclient!ho;ZIIZ)I")
	public static int method6984(@OriginalArg(1) Class133_Sub1 arg0, @OriginalArg(2) Class133_Sub1 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5) {
		@Pc(22) int local22 = Static311.method4860(arg3, arg0, arg1, arg2);
		if (local22 != 0) {
			return arg2 ? -local22 : local22;
		} else if (arg4 == -1) {
			return 0;
		} else {
			@Pc(43) int local43 = Static311.method4860(arg4, arg0, arg1, arg5);
			return arg5 ? -local43 : local43;
		}
	}
}
