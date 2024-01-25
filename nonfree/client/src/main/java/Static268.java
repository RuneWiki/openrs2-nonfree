import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
	public static int anInt5000;

	@OriginalMember(owner = "client!rb", name = "db", descriptor = "Lclient!dp;")
	public static Class53 aClass53_123;

	@OriginalMember(owner = "client!rb", name = "eb", descriptor = "Lclient!r;")
	public static Class174 aClass174_3;

	@OriginalMember(owner = "client!rb", name = "O", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_86 = new Class70(64);

	@OriginalMember(owner = "client!rb", name = "cb", descriptor = "I")
	public static int anInt5004 = -2;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!dp;Z)V")
	public static void method4558(@OriginalArg(0) Class53 arg0) {
		Static34.aClass53_26 = arg0;
		Static34.aClass53_26.method1011(35);
	}

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(CB)Z")
	public static boolean method4561(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
