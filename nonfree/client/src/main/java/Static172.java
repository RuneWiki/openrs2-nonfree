import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!ak;")
	public static Class7 aClass7_142;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "()V")
	public static void method2612() {
		Static144.method2269();
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!ak;)V")
	public static void method2614(@OriginalArg(0) Class7 arg0) {
		aClass7_142 = arg0;
	}
}
