import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qd", name = "N", descriptor = "F")
	public static float aFloat161;

	@OriginalMember(owner = "client!qd", name = "L", descriptor = "Lclient!lga;")
	public static Class223 aClass223_95;

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_145 = new Class322(36, 10);

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "(I)V")
	public static void method7184() {
		Static460.method7012();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static669.aClass356Array1[local8].method8400();
		}
		Static120.method2195();
		Static375.method5662();
		Static253.method4389();
		System.gc();
		Static202.aClass75_5.ya();
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Z)V")
	public static void method7185() {
		if (Static468.aByteArray78 != null) {
			Static352.method5392(Static423.anInt7240);
		} else if (Static561.anInt9080 == -1) {
			Static67.method821(Static366.aString75, Static527.aString100, Static423.anInt7240);
		} else {
			Static212.method6684(Static423.anInt7240);
		}
	}
}
