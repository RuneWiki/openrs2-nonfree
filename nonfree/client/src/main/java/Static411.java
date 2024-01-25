import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!op", name = "k", descriptor = "I")
	public static int anInt7519;

	@OriginalMember(owner = "client!op", name = "e", descriptor = "Lclient!ak;")
	public static final Class15 aClass15_12 = new Class15();

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(I)V")
	public static void method6509() {
		@Pc(1) Class102 local1 = Static613.aClass102_63;
		synchronized (Static613.aClass102_63) {
			Static613.aClass102_63.method2681();
		}
		local1 = Static83.aClass102_11;
		synchronized (Static83.aClass102_11) {
			Static83.aClass102_11.method2681();
		}
	}
}
