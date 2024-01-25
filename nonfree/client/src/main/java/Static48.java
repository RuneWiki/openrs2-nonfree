import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!cr", name = "D", descriptor = "Lclient!mo;")
	public static Class143 aClass143_33;

	@OriginalMember(owner = "client!cr", name = "F", descriptor = "Lclient!mo;")
	public static Class143 aClass143_34;

	@OriginalMember(owner = "client!cr", name = "J", descriptor = "I")
	public static int anInt1218 = 0;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
	public static void method1172() {
		@Pc(1) Class11 local1 = Static178.aClass11_79;
		synchronized (Static178.aClass11_79) {
			Static178.aClass11_79.method215(5);
		}
		local1 = Static95.aClass11_52;
		synchronized (Static95.aClass11_52) {
			Static95.aClass11_52.method215(5);
		}
		local1 = Static206.aClass11_144;
		synchronized (Static206.aClass11_144) {
			Static206.aClass11_144.method215(5);
		}
	}

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "(I)V")
	public static void method1176() {
		if (Static336.anInt6486 > 0) {
			Static198.method3705();
		} else {
			Static191.aClass159_4 = Static138.aClass159_3;
			Static138.aClass159_3 = null;
			Static67.method1662(40);
		}
	}
}
