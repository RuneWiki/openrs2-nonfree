import org.openrs2.deob.annotation.OriginalMember;

public final class Static201 {

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "I")
	public static int anInt3955;

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "Lclient!aj;")
	public static Class15 aClass15_58;

	@OriginalMember(owner = "client!gm", name = "f", descriptor = "I")
	public static int anInt3959 = 0;

	@OriginalMember(owner = "client!gm", name = "a", descriptor = "(I)V")
	public static void method3623() {
		if (Static615.aClass45_23 != null) {
			Static578.aClass193_1 = new Class193();
			Static578.aClass193_1.method4869(Static615.aClass45_23.aClass346_1.method8440(Static609.anInt9834), Static615.aClass45_23, Static615.aClass45_23.anInt1154, Static258.aLong141);
			Static2.aThread9 = new Thread(Static578.aClass193_1, "");
			Static2.aThread9.start();
		}
	}
}
