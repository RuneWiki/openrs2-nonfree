import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!pr", name = "N", descriptor = "I")
	private static int anInt1024;

	@OriginalMember(owner = "client!pr", name = "O", descriptor = "Z")
	private static boolean aBoolean86;

	@OriginalMember(owner = "client!pr", name = "P", descriptor = "I")
	private static int anInt1025;

	@OriginalMember(owner = "client!pr", name = "Q", descriptor = "Z")
	private static boolean aBoolean87;

	@OriginalMember(owner = "client!pr", name = "J", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_22 = new Class129(55, -2);

	@OriginalMember(owner = "client!pr", name = "K", descriptor = "I")
	public static int anInt1023 = 0;

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!am;B)V")
	public static void method862(@OriginalArg(0) Class5_Sub3 arg0) {
		if (Static319.aClass258ArrayArrayArray3 == null) {
			return;
		}
		@Pc(12) Interface2 local12 = null;
		if (arg0.anInt332 == 0) {
			local12 = (Interface2) Static73.method1080(arg0.anInt330, arg0.anInt338, arg0.anInt336);
		}
		if (arg0.anInt332 == 1) {
			local12 = (Interface2) Static173.method2392(arg0.anInt330, arg0.anInt338, arg0.anInt336);
		}
		if (arg0.anInt332 == 2) {
			local12 = (Interface2) Static12.method194(arg0.anInt330, arg0.anInt338, arg0.anInt336, bs.class);
		}
		if (arg0.anInt332 == 3) {
			local12 = (Interface2) Static285.method3519(arg0.anInt330, arg0.anInt338, arg0.anInt336);
		}
		if (local12 == null) {
			arg0.anInt333 = 0;
			arg0.anInt331 = -1;
			arg0.anInt329 = 0;
		} else {
			arg0.anInt331 = local12.method6037();
			arg0.anInt333 = local12.method6035();
			arg0.anInt329 = local12.method6034();
		}
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	public static void method864() {
		Static131.method1850();
	}

	@OriginalMember(owner = "client!pr", name = "providesignlink", descriptor = "(Lclient!gt;)V")
	private static void method877(@OriginalArg(0) Class93 arg0) {
		Static7.aClass93_1 = arg0;
		Static253.aClass93_3 = arg0;
	}
}
