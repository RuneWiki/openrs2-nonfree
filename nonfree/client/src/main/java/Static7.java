import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static7 {

	@OriginalMember(owner = "client!ada", name = "b", descriptor = "Lclient!cb;")
	public static Class50 aClass50_5;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(BII)Z")
	public static boolean method148(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static416.method6123(arg0, arg1) | (arg0 & 0x40000) != 0 || Static93.method1446(arg0, arg1);
	}
}
