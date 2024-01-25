import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!rn;")
	public static final Class217 aClass217_86 = new Class217(37, 3);

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "I")
	public static final int anInt5463 = 328;

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
	public static void method4288() {
		if (Static120.anInt2584 == 10 || Static120.anInt2584 == 28) {
			Static376.method4925(Static265.anInt5008 >> 10, 5000, Static276.anInt5105 >> 10);
		} else {
			@Pc(22) int local22 = Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray287[0] >> 3;
			@Pc(29) int local29 = Static379.aClass7_Sub2_Sub3_Sub2_2.anIntArray288[0] >> 3;
			if (local22 >= 0 && Static40.anInt1089 >> 3 > local22 && local29 >= 0 && Static44.anInt7276 >> 3 > local29) {
				Static376.method4925(local29, 5000, local22);
			} else {
				Static376.method4925(Static44.anInt7276 >> 4, 0, Static40.anInt1089 >> 4);
			}
		}
		Static104.method1816();
		Static428.method5582();
		Static37.method730();
		Static6.method43();
	}
}
