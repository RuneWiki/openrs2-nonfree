import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!oa", name = "S", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!oa", name = "Z", descriptor = "I")
	public static int anInt2428;

	@OriginalMember(owner = "client!oa", name = "hb", descriptor = "I")
	public static int anInt2433;

	@OriginalMember(owner = "client!oa", name = "R", descriptor = "I")
	public static int anInt2424 = -1;

	@OriginalMember(owner = "client!oa", name = "U", descriptor = "I")
	public static int anInt2426 = 0;

	@OriginalMember(owner = "client!oa", name = "V", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!oa", name = "db", descriptor = "Lclient!lf;")
	private static Class49 aClass49_1122 = Static32.method683("Loaded update list");

	@OriginalMember(owner = "client!oa", name = "X", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1120 = aClass49_1122;

	@OriginalMember(owner = "client!oa", name = "Y", descriptor = "I")
	public static final int anInt2427 = 7759444;

	@OriginalMember(owner = "client!oa", name = "bb", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1121 = Static32.method683("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)V")
	public static void method1966() {
		aClass49_1122 = null;
		anIntArray225 = null;
		aClass49_1121 = null;
		aClass49_1120 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IILclient!lf;)V")
	public static void method1967(@OriginalArg(1) int arg0, @OriginalArg(2) Class49 arg1) {
		@Pc(11) Class49 local11 = arg1.method1664().method1677();
		@Pc(13) boolean local13 = false;
		for (@Pc(23) int local23 = 0; local23 < Static139.anInt2969; local23++) {
			@Pc(31) Class2_Sub2_Sub3_Sub7_Sub2 local31 = Static178.aClass2_Sub2_Sub3_Sub7_Sub2Array1[Static110.anIntArray221[local23]];
			if (local31 != null && local31.aClass49_1606 != null && local31.aClass49_1606.method1645(local11)) {
				local13 = true;
				Static51.method905(1, 1, local31.anIntArray316[0], 0, 2, Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray318[0], Static139.aClass2_Sub2_Sub3_Sub7_Sub2_1.anIntArray316[0], false, local31.anIntArray318[0], 0, 0);
				if (arg0 == 1) {
					Static176.aClass2_Sub13_Sub1_14.method2976(121);
					Static176.aClass2_Sub13_Sub1_14.method2967(Static110.anIntArray221[local23]);
				} else if (arg0 == 4) {
					Static176.aClass2_Sub13_Sub1_14.method2976(12);
					Static176.aClass2_Sub13_Sub1_14.method2938(Static110.anIntArray221[local23]);
				} else if (arg0 == 6) {
					Static176.aClass2_Sub13_Sub1_14.method2976(8);
					Static176.aClass2_Sub13_Sub1_14.method2964(Static110.anIntArray221[local23]);
				} else if (arg0 == 7) {
					Static176.aClass2_Sub13_Sub1_14.method2976(222);
					Static176.aClass2_Sub13_Sub1_14.method2921(Static110.anIntArray221[local23]);
				}
				break;
			}
		}
		if (!local13) {
			Static88.method1475(Static154.aClass49_1489, Static33.method692(new Class49[] { Static118.aClass49_1134, local11 }), 0);
		}
	}
}
