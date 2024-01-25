import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "I")
	public static int anInt4785;

	@OriginalMember(owner = "client!jw", name = "f", descriptor = "Lclient!bw;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!jw", name = "h", descriptor = "F")
	public static float aFloat100;

	@OriginalMember(owner = "client!jw", name = "d", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_49 = new Class37();

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "Z")
	public static boolean aBoolean337 = false;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IZ)V")
	public static void method4132() {
		Static144.method2331(Static219.aClass296_340);
		for (@Pc(20) Class1_Sub35 local20 = (Class1_Sub35) Static468.aClass17_36.method735(); local20 != null; local20 = (Class1_Sub35) Static468.aClass17_36.method740()) {
			if (!local20.method7527()) {
				local20 = (Class1_Sub35) Static468.aClass17_36.method735();
				if (local20 == null) {
					break;
				}
			}
			if (local20.anInt6102 == 0) {
				Static217.method7162(true, local20, true);
			}
		}
		if (Static64.aClass156_3 != null) {
			Static473.method6593(Static64.aClass156_3);
			Static64.aClass156_3 = null;
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILclient!vaa;)Z")
	public static boolean method4133(@OriginalArg(1) Interface18 arg0) {
		@Pc(10) Class36 local10 = Static308.aClass96_4.method2274(arg0.method7467());
		if (local10.lb == -1) {
			return true;
		} else {
			@Pc(24) Class11 local24 = Static323.aClass257_4.method6143(local10.lb);
			return local24.anInt391 == -1 ? true : local24.method428();
		}
	}
}
