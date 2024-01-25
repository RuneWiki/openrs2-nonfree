import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static448 {

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "Lclient!od;")
	public static Class172 aClass172_1;

	@OriginalMember(owner = "client!wd", name = "w", descriptor = "Lclient!la;")
	public static final Class136 aClass136_199 = new Class136(0, 10);

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)Z")
	public static boolean method6115(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x10000) != 0 | Static359.method5020(arg0, arg1) || Static17.method328(arg0, arg1)) {
			return true;
		} else {
			return (arg0 & 0x37) == 0 && Static5.method68(arg0, arg1);
		}
	}
}
