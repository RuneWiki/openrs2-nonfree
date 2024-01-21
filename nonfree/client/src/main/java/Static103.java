import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!r", name = "x", descriptor = "J")
	public static long aLong177;

	@OriginalMember(owner = "client!r", name = "L", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1365 = Static78.method1313("Loading ignore list");

	@OriginalMember(owner = "client!r", name = "y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1360 = aClass25_1365;

	@OriginalMember(owner = "client!r", name = "I", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1363 = Static78.method1313("Location");

	@OriginalMember(owner = "client!r", name = "A", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1361 = aClass25_1363;

	@OriginalMember(owner = "client!r", name = "D", descriptor = "I")
	public static int anInt2772 = 0;

	@OriginalMember(owner = "client!r", name = "E", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!r", name = "F", descriptor = "[Lclient!rc;")
	public static Class1_Sub2_Sub3_Sub4_Sub1[] aClass1_Sub2_Sub3_Sub4_Sub1Array32 = new Class1_Sub2_Sub3_Sub4_Sub1[32768];

	@OriginalMember(owner = "client!r", name = "G", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1362 = Static78.method1313("<col=00ff00>");

	@OriginalMember(owner = "client!r", name = "J", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1364 = Static78.method1313("Ihr Spielkonto wurde deaktiviert)3");

	@OriginalMember(owner = "client!r", name = "c", descriptor = "(I)[Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4[] method1962() {
		@Pc(8) Class1_Sub2_Sub2_Sub4[] local8 = new Class1_Sub2_Sub2_Sub4[Static60.anInt1363];
		for (@Pc(15) int local15 = 0; local15 < Static60.anInt1363; local15++) {
			@Pc(25) Class1_Sub2_Sub2_Sub4 local25 = local8[local15] = new Class1_Sub2_Sub2_Sub4();
			local25.anInt2755 = Static1.anInt20;
			local25.anInt2760 = Static39.anInt1092;
			local25.anInt2759 = Static111.anIntArray434[local15];
			local25.anInt2757 = Static62.anIntArray267[local15];
			local25.anInt2756 = Static88.anIntArray349[local15];
			local25.anInt2758 = Static100.anIntArray402[local15];
			local25.anIntArray477 = Static1.anIntArray10;
			local25.aByteArray39 = Static13.aByteArrayArray1[local15];
		}
		Static99.method1649();
		return local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
	public static void method1963() {
		aClass25_1362 = null;
		aClass25_1363 = null;
		aClass25_1361 = null;
		aClass25_1364 = null;
		aClass1_Sub2_Sub3_Sub4_Sub1Array32 = null;
		aClass25_1360 = null;
		aClass25_1365 = null;
	}
}
