import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!na;")
	public static Class56 aClass56_38;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "Z")
	public static boolean aBoolean105;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1131 = Static119.method1462("<)4col>");

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "J")
	public static long aLong88 = 0L;

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[I")
	public static int[] anIntArray342 = new int[1000];

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1132 = Static119.method1462("m");

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1134 = Static119.method1462("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!na;I)V")
	public static void method1874(@OriginalArg(0) Class56 arg0) {
		Static41.aClass56_18 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method1875() {
		aClass56_38 = null;
		aClass65_1131 = null;
		aClass65_1134 = null;
		anIntArray342 = null;
		aClass65_1132 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ZLclient!pe;)V")
	public static void method1876(@OriginalArg(1) Class65 arg0) {
		if (Static4.anInt1223 >= 2) {
			if (arg0.method1488(Static122.aClass65_1146)) {
				System.gc();
			}
			if (arg0.method1488(Static94.aClass65_899)) {
				Static13.method1865();
			}
			if (arg0.method1488(Static84.aClass65_793)) {
				Static114.aBoolean102 = true;
			}
			if (arg0.method1488(Static35.aClass65_378)) {
				Static114.aBoolean102 = false;
			}
			if (arg0.method1488(Static26.aClass65_293)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static90.aClass46Array1[local42].anIntArrayArray13[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method1488(Static112.aClass65_1070) && Static67.anInt1595 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1490(Static21.aClass65_257)) {
				Static20.anInt520 = arg0.method1501(12).method1474().method1497();
				Static59.method1098(0, null, Static35.method647(new Class65[] { Static98.aClass65_932, Static120.method1871(Static20.anInt520) }));
			}
			if (arg0.method1488(Static77.aClass65_742)) {
				Static12.aBoolean14 = true;
			}
		}
		Static49.aClass2_Sub4_Sub1_1.method962(82);
		Static49.aClass2_Sub4_Sub1_1.method926(arg0.method1502() - 1);
		Static49.aClass2_Sub4_Sub1_1.method943(arg0.method1501(2));
	}
}
