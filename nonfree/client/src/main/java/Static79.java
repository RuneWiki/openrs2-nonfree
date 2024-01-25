import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "I")
	public static int anInt6453 = 0;

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "Lclient!ib;")
	public static final Class140 aClass140_17 = new Class140(7, 2);

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()V")
	public static void method5516() {
		for (@Pc(1) int local1 = 0; local1 < Static174.aClass136Array1.length; local1++) {
			Static174.aClass136Array1[local1].method3391();
		}
		Static174.aClass136Array1 = null;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "(B)V")
	public static void method5529() {
		if (Static37.method1503(Static32.anInt602) || Static234.method3634(Static32.anInt602)) {
			Static258.method6209(Static350.anInt6080 >> 12, Static226.anInt3984 >> 12, 5000);
		} else {
			@Pc(16) int local16 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray629[0] >> 3;
			@Pc(23) int local23 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anIntArray628[0] >> 3;
			if (local16 >= 0 && local16 < Static54.anInt1038 >> 3 && local23 >= 0 && Static140.anInt3026 >> 3 > local23) {
				Static258.method6209(local23, local16, 5000);
			} else {
				Static258.method6209(Static140.anInt3026 >> 4, Static54.anInt1038 >> 4, 0);
			}
		}
		Static310.method4549();
		Static582.method4497();
		Static66.method1441();
		Static81.method1656();
	}
}
