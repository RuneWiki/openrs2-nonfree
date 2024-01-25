import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!gu", name = "d", descriptor = "Lclient!mo;")
	public static Class215 aClass215_3;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!r;)V")
	public static void method3147(@OriginalArg(1) Class43 arg0) {
		if (Static490.aBoolean625) {
			Static62.method4171(arg0);
		} else {
			Static213.method3760(arg0);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(CZ)Z")
	public static boolean method3148(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
