import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static519 {

	@OriginalMember(owner = "client!sga", name = "g", descriptor = "F")
	public static float aFloat144;

	@OriginalMember(owner = "client!sga", name = "i", descriptor = "Lclient!jb;")
	public static Class163 aClass163_7;

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "Lclient!ro;")
	public static final Class306 aClass306_38 = new Class306();

	@OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
	public static int anInt7022 = 765;

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "(B)V")
	public static void method6247() {
		Static121.method1818();
		for (@Pc(13) int local13 = 0; local13 < 4; local13++) {
			Static308.aClass182Array1[local13].method4162();
		}
		Static227.method3580();
		Static587.method8245();
		Static515.method7421();
		System.gc();
		Static485.aClass126_17.ya();
	}
}
