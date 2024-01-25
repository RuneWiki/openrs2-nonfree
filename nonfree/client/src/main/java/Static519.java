import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static519 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!f;")
	public static Class5[] aClass5Array19;

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!em;")
	public static final Class83 aClass83_191 = new Class83(25, 8);

	@OriginalMember(owner = "client!u", name = "d", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_103 = new Class208(79, -1);

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IIZ)Z")
	public static boolean method7180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static280.method4171(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static109.method1516(arg0, arg1) | Static64.method1035(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static262.method3790(arg1, arg0) | Static118.method2139(arg1, arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Z")
	public static boolean method7182(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}
}
