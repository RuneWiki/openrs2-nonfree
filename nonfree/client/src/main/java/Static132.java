import org.openrs2.deob.annotation.OriginalMember;

public final class Static132 {

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Z")
	public static boolean aBoolean242;

	@OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
	public static int anInt2841;

	@OriginalMember(owner = "client!fb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString38;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method2576() {
		if (Static282.anInt5183 == 1 || Static282.anInt5183 == 3 || Static345.anInt6056 != Static282.anInt5183 && (Static282.anInt5183 == 0 || Static345.anInt6056 == 0)) {
			Static568.anInt9131 = 0;
			Static49.anInt1058 = 0;
			Static243.aClass310_16.method6605();
		}
		Static345.anInt6056 = Static282.anInt5183;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method2577() {
		if (Static319.anInt5778 < 0) {
			Static341.anInt6022 = -1;
			Static319.anInt5778 = 0;
			Static296.anInt5364 = -1;
		}
		if (Static284.anInt7858 < Static319.anInt5778) {
			Static341.anInt6022 = -1;
			Static296.anInt5364 = -1;
			Static319.anInt5778 = Static284.anInt7858;
		}
		if (Static236.anInt4460 < 0) {
			Static296.anInt5364 = -1;
			Static236.anInt4460 = 0;
			Static341.anInt6022 = -1;
		}
		if (Static284.anInt7855 < Static236.anInt4460) {
			Static236.anInt4460 = Static284.anInt7855;
			Static341.anInt6022 = -1;
			Static296.anInt5364 = -1;
		}
	}
}
