import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!eb", name = "L", descriptor = "Lclient!dca;")
	public static Class76 aClass76_2;

	@OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
	public static int anInt2240;

	@OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
	public static int anInt2242 = -1;

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V")
	public static void method1977() {
		if (Static243.method3435(Static357.anInt5722) || Static459.method6651(-870, Static357.anInt5722)) {
			Static655.method8996(Static407.anInt6702, Static430.anInt7002 >> 12, Static218.anInt3475 >> 12);
		} else {
			@Pc(18) int local18 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray183[0] >> 3;
			@Pc(25) int local25 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anIntArray182[0] >> 3;
			if (local18 >= 0 && local18 < Static426.anInt6942 >> 3 && local25 >= 0 && local25 < Static280.anInt6752 >> 3) {
				Static655.method8996(Static407.anInt6702, local18, local25);
			} else {
				Static655.method8996(0, Static426.anInt6942 >> 4, Static280.anInt6752 >> 4);
			}
		}
		Static65.method991();
		Static162.method2418();
		Static607.method8325();
		Static139.method2016();
	}
}
