import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static610 {

	@OriginalMember(owner = "client!vs", name = "m", descriptor = "Lclient!la;")
	public static Class207 aClass207_123;

	@OriginalMember(owner = "client!vs", name = "g", descriptor = "Lclient!cb;")
	public static final Class46 aClass46_106 = new Class46(55, -1);

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)I")
	public static int method8697() {
		return Static359.anInt6012;
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(III)Z")
	public static boolean method8699(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static206.method3569(arg0, arg1) | (arg0 & 0x70000) != 0 || Static62.method1043(arg0, arg1);
	}
}
