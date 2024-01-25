import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cv", name = "l", descriptor = "Lclient!so;")
	public static Class227 aClass227_3;

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "[I")
	public static int[] anIntArray96 = new int[2];

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_28 = new Class27(46, 3);

	@OriginalMember(owner = "client!cv", name = "i", descriptor = "[I")
	public static final int[] anIntArray97 = new int[250];

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)V")
	public static void method1073() {
		if (Static412.aClass50_8 == null) {
			return;
		}
		Static191.aClass240_2.method5232();
		Static206.method3214();
		Static341.method4585();
		Static234.method2026();
		Static33.method5357();
		Static264.method3771();
		if (Static378.aClass230_1 != null) {
			Static378.aClass230_1.method5131();
		}
		Static141.method2401();
		Static365.method2561();
		Static298.method4146();
		Static260.method3743(false);
		Static371.method4972();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class24_Sub3_Sub2_Sub2 local45 = Static360.aClass24_Sub3_Sub2_Sub2Array1[local39];
			if (local45 != null) {
				local45.aClass10_Sub34_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass63Array3.length; local52++) {
					local45.aClass63Array3[local52] = null;
				}
			}
		}
		for (@Pc(75) int local75 = 0; local75 < Static134.anInt2764; local75++) {
			@Pc(82) Class24_Sub3_Sub2_Sub1 local82 = Static149.aClass10_Sub26Array1[local75].aClass24_Sub3_Sub2_Sub1_2;
			if (local82 != null) {
				for (@Pc(86) int local86 = 0; local86 < local82.aClass63Array3.length; local86++) {
					local82.aClass63Array3[local86] = null;
				}
			}
		}
		Static259.aClass34_6 = null;
		Static342.aClass34_4 = null;
		Static412.aClass50_8.method5815();
		Static412.aClass50_8 = null;
	}
}
