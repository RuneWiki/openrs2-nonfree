import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!bv;")
	public static final Class37 aClass37_85 = new Class37();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZZ)V")
	public static void method6533(@OriginalArg(1) boolean arg0) {
		Static152.method2408(Static350.anInt6255, arg0, Static170.anInt3050, Static83.anInt1567);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(JI)V")
	public static void method6534(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(15) InterruptedException local15) {
		}
	}
}
