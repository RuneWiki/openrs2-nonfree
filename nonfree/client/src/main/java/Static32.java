import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!df", name = "u", descriptor = "I")
	public static int anInt4094;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1422 = Static161.method2971("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!df", name = "o", descriptor = "I")
	public static volatile int anInt4089 = 0;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "[I")
	public static int[] anIntArray450 = new int[5];

	@OriginalMember(owner = "client!df", name = "x", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1423 = Static161.method2971("M");

	@OriginalMember(owner = "client!df", name = "B", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1424 = Static161.method2971("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!df", name = "C", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1425 = aClass13_1423;

	@OriginalMember(owner = "client!df", name = "F", descriptor = "Z")
	public static final boolean aBoolean320 = false;

	@OriginalMember(owner = "client!df", name = "I", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1426 = aClass13_1422;

	@OriginalMember(owner = "client!df", name = "J", descriptor = "I")
	public static int anInt4101 = 0;

	@OriginalMember(owner = "client!df", name = "M", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1427 = aClass13_1423;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(B)V")
	public static void method3014() {
		try {
			if (Static48.anInt1535 == 1) {
				@Pc(17) int local17 = Static74.aClass1_Sub12_Sub4_1.method2644();
				if (local17 > 0 && Static74.aClass1_Sub12_Sub4_1.method2669()) {
					local17 -= Static50.anInt1636;
					if (local17 < 0) {
						local17 = 0;
					}
					Static74.aClass1_Sub12_Sub4_1.method2656(local17);
				} else {
					Static74.aClass1_Sub12_Sub4_1.method2666();
					Static74.aClass1_Sub12_Sub4_1.method2659();
					Static95.aClass1_Sub25_1 = null;
					if (Static115.aClass4_74 == null) {
						Static48.anInt1535 = 0;
					} else {
						Static48.anInt1535 = 2;
					}
					Static84.aClass72_1 = null;
				}
			}
		} catch (@Pc(59) Exception local59) {
			local59.printStackTrace();
			Static74.aClass1_Sub12_Sub4_1.method2666();
			Static48.anInt1535 = 0;
			Static84.aClass72_1 = null;
			Static95.aClass1_Sub25_1 = null;
			Static115.aClass4_74 = null;
		}
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V")
	public static void method3016() {
		aClass13_1426 = null;
		aClass13_1422 = null;
		aClass13_1424 = null;
		anIntArray450 = null;
		aClass13_1425 = null;
		aClass13_1427 = null;
		aClass13_1423 = null;
	}
}
