import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static104 {

	@OriginalMember(owner = "client!eu", name = "o", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_217 = new Class107(10, 7);

	@OriginalMember(owner = "client!eu", name = "d", descriptor = "(III)Z")
	public static boolean method5960(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static248.method3744(arg1, arg0) | (arg0 & 0x70000) != 0 || Static285.method4143(arg1, arg0);
	}
}
