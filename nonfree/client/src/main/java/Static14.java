import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public static int anInt320;

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_102 = Static120.method1824("button near the top of that page)3");

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "Lclient!rd;")
	public static Class80 aClass80_96 = aClass80_102;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_97 = Static120.method1824("Welt");

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_98 = Static120.method1824(" ");

	@OriginalMember(owner = "client!bf", name = "f", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_99 = Static120.method1824("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_100 = Static120.method1824(":trade:");

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_101 = Static120.method1824("<col=ffff00>");

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	public static void method242() {
		Static41.anInt906 = 0;
		Static33.anInt779 = 0;
		Static130.method1952();
		Static174.method2811();
		Static126.method1867();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static41.anInt906; local17++) {
			local23 = Static36.anIntArray109[local17];
			if (Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local23].anInt4314 != Static193.anInt4411) {
				Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local23].aClass3_Sub1_Sub7_1 = null;
				Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[local23] = null;
			}
		}
		if (Static63.aClass3_Sub17_Sub1_2.anInt2923 != Static41.anInt905) {
			throw new RuntimeException("gnp1 pos:" + Static63.aClass3_Sub17_Sub1_2.anInt2923 + " psize:" + Static41.anInt905);
		}
		for (local23 = 0; local23 < Static59.anInt1317; local23++) {
			if (Static28.aClass3_Sub1_Sub5_Sub4_Sub1Array1[Static125.anIntArray359[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static59.anInt1317);
			}
		}
	}

	@OriginalMember(owner = "client!bf", name = "b", descriptor = "(I)V")
	public static void method243() {
		if (Static96.aBoolean83 && Static181.anInt4055 != Static153.anInt673) {
			Static92.method2207(Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray509[0], Static147.anInt3300, Static153.anInt673, Static156.aClass3_Sub1_Sub5_Sub4_Sub2_1.anIntArray513[0], Static134.anInt3310);
		} else if (Static31.anInt751 != Static153.anInt673) {
			Static31.anInt751 = Static153.anInt673;
			Static69.method1037(Static153.anInt673);
		}
	}
}
