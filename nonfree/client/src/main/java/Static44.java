import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
	public static int anInt1123 = 0;

	@OriginalMember(owner = "client!eb", name = "l", descriptor = "[Lclient!ka;")
	public static final Class49[] aClass49Array1 = new Class49[4];

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	public static int anInt1130 = 0;

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_703 = Static118.method2249("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	public static void method728() {
		Static51.anInt1367 = 0;
		Static45.aClass1_Sub14_Sub1_8.anInt2306 = 0;
		Static124.anInt3084 = 0;
		Static101.anInt2533 = 0;
		Static172.anInt3846 = -1;
		Static192.anInt4177 = -1;
		Static150.anInt3510 = -1;
		Static21.anInt645 = -1;
		Static31.anInt933 = 0;
		Static62.anInt1604 = 0;
		Static106.anInt2616 = 0;
		Static198.aBoolean168 = false;
		Static1.aClass1_Sub14_Sub1_43.anInt2306 = 0;
		for (@Pc(40) int local40 = 0; local40 < Static158.aClass6_Sub4_Sub1Array1.length; local40++) {
			if (Static158.aClass6_Sub4_Sub1Array1[local40] != null) {
				Static158.aClass6_Sub4_Sub1Array1[local40].anInt3928 = -1;
			}
		}
		for (@Pc(58) int local58 = 0; local58 < Static106.aClass6_Sub4_Sub2Array1.length; local58++) {
			if (Static106.aClass6_Sub4_Sub2Array1[local58] != null) {
				Static106.aClass6_Sub4_Sub2Array1[local58].anInt3928 = -1;
			}
		}
		Static7.method130();
		Static118.method2247(30);
		for (@Pc(85) int local85 = 0; local85 < 100; local85++) {
			Static197.aBooleanArray18[local85] = true;
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
	public static void method730() {
		@Pc(8) int[] local8 = new int[Static92.anInt2321];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static92.anInt2321; local12++) {
			@Pc(18) Class1_Sub2_Sub2 local18 = Static40.method700(local12);
			if (local18.anInt287 >= 0 || local18.anInt282 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static159.anIntArray428 = new int[local10];
		for (@Pc(46) int local46 = 0; local46 < local10; local46++) {
			Static159.anIntArray428[local46] = local8[local46];
		}
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	public static void method733() {
		Static11.aFontMetrics1 = null;
		Static139.anImage4 = null;
		Static50.aFont2 = null;
	}
}
