import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static110 {

	@OriginalMember(owner = "client!eaa", name = "s", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_59 = new Class81(12, 3);

	@OriginalMember(owner = "client!eaa", name = "x", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_60 = new Class81(79, 11);

	@OriginalMember(owner = "client!eaa", name = "y", descriptor = "Lclient!eba;")
	public static final Class81 aClass81_61 = new Class81(65, -1);

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(III)Z")
	public static boolean method1967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x40000) != 0 | Static29.method752(arg1, arg0) || Static515.method7050(arg1, arg0);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(I)V")
	public static void method1968() {
		if (Static359.aBoolean443) {
			return;
		}
		Static459.aBoolean567 = true;
		Static359.aBoolean443 = true;
		if (Static479.aClass1_Sub7_Sub1_1.aBoolean231) {
			Static79.aFloat37 = (int) Static79.aFloat37 + 47 & 0xFFFFFFF0;
		} else {
			Static257.aFloat111 += (12.0F - Static257.aFloat111) / 2.0F;
		}
	}
}
