import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static295 {

	@OriginalMember(owner = "client!jt", name = "f", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_106 = new Class359(93, 10);

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)Z")
	public static boolean method4758(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static439.method6409(arg0, arg1) || Static457.method6552(arg0, arg1) || Static538.method7533(arg0, arg1);
	}
}
