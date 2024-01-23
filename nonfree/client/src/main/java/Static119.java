import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!in", name = "a", descriptor = "Lclient!cg;")
	public static Class22 aClass22_40;

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(Lclient!cg;)V")
	public static void method2000(@OriginalArg(0) Class22 arg0) {
		aClass22_40 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "()V")
	public static void method2001() {
		Static6.method101();
	}
}
