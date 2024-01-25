import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Lclient!uq;")
	public static Class334 aClass334_14;

	@OriginalMember(owner = "client!kg", name = "u", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_80 = new Class70(69, 3);

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(III)Z")
	public static boolean method6365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static65.method1177(arg1, arg0) || Static208.method3294(arg0, arg1);
	}
}
