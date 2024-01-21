import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static82 {

	@OriginalMember(owner = "client!qa", name = "h", descriptor = "[Lclient!cb;")
	public static Class2_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub3_Sub1Array4;

	@OriginalMember(owner = "client!qa", name = "k", descriptor = "[I")
	public static int[] anIntArray326;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "Lclient!lc;")
	public static Class31 aClass31_800 = Static56.method1206("Loading ignore list");

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
	public static volatile int anInt2305 = 0;

	@OriginalMember(owner = "client!qa", name = "e", descriptor = "Lclient!lc;")
	public static Class31 aClass31_801 = Static56.method1206("::hiddenbuttontest");

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "Lclient!lc;")
	public static Class31 aClass31_802 = Static56.method1206("You have @gre@");

	@OriginalMember(owner = "client!qa", name = "m", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
	public static void method1446() {
		aClass31_800 = null;
		aClass31_802 = null;
		aClass2_Sub1_Sub3_Sub1Array4 = null;
		anIntArray326 = null;
		aClass31_801 = null;
	}

	@OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
	public static void method1447() {
		Static20.aClass2_Sub6_Sub1_11.method684(255);
		if (Static54.anInt1802 != -1) {
			Static39.method1011(Static54.anInt1802);
			Static54.anInt1802 = -1;
			Static60.aBoolean104 = false;
			Static92.aBoolean81 = true;
			Static58.aBoolean100 = true;
		}
		if (Static47.anInt1736 != -1) {
			Static39.method1011(Static47.anInt1736);
			Static27.aBoolean65 = true;
			Static47.anInt1736 = -1;
			Static60.aBoolean104 = false;
		}
		if (Static16.anInt773 != -1) {
			Static39.method1011(Static16.anInt773);
			Static16.anInt773 = -1;
			Static75.method1404(30);
		}
		if (Static41.anInt1577 != -1) {
			Static39.method1011(Static41.anInt1577);
			Static41.anInt1577 = -1;
		}
		if (Static42.anInt1586 != -1) {
			Static39.method1011(Static42.anInt1586);
			Static42.anInt1586 = -1;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)V")
	public static void method1448(@OriginalArg(1) int arg0) {
		if (Static70.aBoolean113) {
			Static90.anInt2422 = arg0;
		} else {
			Static88.method1488(arg0);
		}
	}
}
