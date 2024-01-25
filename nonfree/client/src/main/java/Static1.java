import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "V", descriptor = "I")
	public static int anInt42;

	@OriginalMember(owner = "client!a", name = "n", descriptor = "I")
	public static int anInt13 = 0;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	public static int anInt23 = 0;

	@OriginalMember(owner = "client!a", name = "J", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_1 = new Class189("M", "M", "M", "M");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
	public static void method1() {
		if (Static98.anInt2239 != -1) {
			Static419.method5367(-1, -1, false, Static98.anInt2239);
			Static98.anInt2239 = -1;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(Z)V")
	public static void method5() {
		if (Static227.anInt4227 != 3) {
			Static101.anInt6819 = -1;
		}
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method6() {
		if (Static121.aClass172_3.method5472()) {
			Static121.aClass172_3.method5532(Static392.aCanvas6);
			Static361.method4770();
			Static121.aClass172_3.method5500(Static392.aCanvas6);
			Static121.aClass172_3.method5540(Static392.aCanvas6);
		} else {
			Static111.method1883(Static105.anInt2382);
		}
		Static36.method725();
	}
}
