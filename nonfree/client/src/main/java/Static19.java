import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!bi", name = "V", descriptor = "Lclient!rf;")
	public static Class70 aClass70_186 = Static49.method1293("::autoshadow on");

	@OriginalMember(owner = "client!bi", name = "W", descriptor = "I")
	public static int anInt535 = 0;

	@OriginalMember(owner = "client!bi", name = "bb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_187 = Static49.method1293("");

	@OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_188 = Static49.method1293("mn");

	@OriginalMember(owner = "client!bi", name = "eb", descriptor = "[I")
	public static int[] anIntArray32 = new int[100];

	@OriginalMember(owner = "client!bi", name = "hb", descriptor = "I")
	public static int anInt543 = 0;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "(I)V")
	public static void method435() {
		aClass70_187 = null;
		aClass70_186 = null;
		anIntArray32 = null;
		aClass70_188 = null;
	}

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)V")
	public static void method436() {
		Static67.anInt2096 = 0;
		Static161.anInt4212 = 0;
		Static39.method1006();
		Static139.method2726();
		Static53.method1338();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static67.anInt2096; local17++) {
			local23 = Static151.anIntArray380[local17];
			if (Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local23].anInt2026 != Static47.anInt1654) {
				Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local23].aClass1_Sub1_Sub13_1 = null;
				Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local23] = null;
			}
		}
		if (Static69.anInt2127 != Static98.aClass1_Sub9_Sub1_2.anInt1592) {
			throw new RuntimeException("gnp1 pos:" + Static98.aClass1_Sub9_Sub1_2.anInt1592 + " psize:" + Static69.anInt2127);
		}
		for (local23 = 0; local23 < Static86.anInt2582; local23++) {
			if (Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[Static152.anIntArray208[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static86.anInt2582);
			}
		}
	}
}
