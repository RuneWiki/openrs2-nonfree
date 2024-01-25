import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!df", name = "q", descriptor = "Lclient!he;")
	public static Class156 aClass156_20;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_119 = new Class387(17, 3);

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V")
	public static void method8912() {
		if (Static165.method2306(Static107.anInt1746) || Static416.method8829(Static107.anInt1746)) {
			Static410.method6185(Static489.anInt8202 >> 12, 5000, Static532.anInt9189 >> 12);
		} else {
			@Pc(31) int local31 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray414[0] >> 3;
			@Pc(38) int local38 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anIntArray415[0] >> 3;
			if (local31 >= 0 && local31 < Static544.anInt9261 >> 3 && local38 >= 0 && Static282.anInt4887 >> 3 > local38) {
				Static410.method6185(local38, 5000, local31);
			} else {
				Static410.method6185(Static282.anInt4887 >> 4, 0, Static544.anInt9261 >> 4);
			}
		}
		Static130.method1894();
		Static265.method3879();
		Static175.method2572();
		Static534.method550();
	}
}
