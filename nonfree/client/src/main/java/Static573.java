import org.openrs2.deob.annotation.OriginalMember;

public final class Static573 {

	@OriginalMember(owner = "client!uha", name = "c", descriptor = "[I")
	public static int[] anIntArray589;

	@OriginalMember(owner = "client!uha", name = "f", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_59 = new Class276();

	@OriginalMember(owner = "client!uha", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray40 = new String[200];

	@OriginalMember(owner = "client!uha", name = "b", descriptor = "(I)V")
	public static void method8006() {
		if (Static531.aClass251_22 != null) {
			Static99.aClass348_1 = new Class348();
			Static99.aClass348_1.method8106(Static531.aClass251_22.aClass176_64.method4986(Static380.anInt7247), Static531.aClass251_22, Static531.aClass251_22.anInt7696, Static102.aLong262);
			Static42.aThread1 = new Thread(Static99.aClass348_1, "");
			Static42.aThread1.start();
		}
	}
}
