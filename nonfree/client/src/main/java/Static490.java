import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static490 {

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "J")
	public static long aLong218;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!uv;")
	public static Class344 aClass344_10;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Z")
	public static boolean method7203(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static619.method8432(arg0, arg1) | (arg0 & 0x70000) != 0 || Static282.method4597(arg0, arg1);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
	public static boolean method7204(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 3;
	}
}
