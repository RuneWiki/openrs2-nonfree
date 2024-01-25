import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static478 {

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method7057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) int local13 = arg0 - arg1;
		if (local13 < -9) {
			return "<col=ff0000>";
		} else if (local13 < -6) {
			return "<col=ff3000>";
		} else if (local13 < -3) {
			return "<col=ff7000>";
		} else if (local13 < 0) {
			return "<col=ffb000>";
		} else if (local13 > 9) {
			return "<col=00ff00>";
		} else if (local13 > 6) {
			return "<col=40ff00>";
		} else if (local13 > 3) {
			return "<col=80ff00>";
		} else if (local13 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!rda", name = "a", descriptor = "(IIZ)Lclient!oc;")
	public static Class5_Sub38 method7058(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(20) long local20 = (long) (arg0 | (arg1 ? Integer.MIN_VALUE : 0));
		return (Class5_Sub38) Static447.aClass273_30.method6581(local20);
	}
}
