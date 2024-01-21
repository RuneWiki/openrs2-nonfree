import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static24 {

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	public static int anInt3056;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array103;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "Lclient!je;")
	public static Class40 aClass40_1644 = Static69.method1231("sl_button");

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "I")
	public static int anInt3057 = 0;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "Lclient!ob;")
	public static Class55 aClass55_91 = new Class55(64);

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "Lclient!je;")
	public static Class40 aClass40_1645 = Static69.method1231("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "Lclient!je;")
	public static Class40 aClass40_1646 = Static69.method1231("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "[I")
	public static int[] anIntArray376 = new int[100];

	@OriginalMember(owner = "client!ea", name = "Q", descriptor = "Lclient!ob;")
	public static Class55 aClass55_92 = new Class55(64);

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)V")
	public static void method2212() {
		Static70.anInt1896 = 2;
		Static56.anInt1471 = -1;
		Static104.aBoolean204 = false;
		Static122.aClass24_32 = null;
		Static120.anInt2820 = -1;
		Static26.anInt673 = 0;
		Static77.anInt2023 = 1;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public static void method2213() {
		aClass40_1645 = null;
		aClass55_92 = null;
		aClass55_91 = null;
		aClass40_1644 = null;
		anIntArray376 = null;
		aClass40_1646 = null;
		aClass2_Sub1_Sub2_Sub1Array103 = null;
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
	public static void method2214() {
		Static65.aClass55_45.method1413();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)V")
	public static void method2215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static81.anInt2089 != 0 && arg0 != -1) {
			Static52.method940(arg0, 0, Static105.aClass24_Sub1_17, Static81.anInt2089);
			Static86.aBoolean247 = true;
		}
	}
}
