import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!tv", name = "r", descriptor = "[F")
	public static final float[] aFloatArray88 = new float[4];

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I)V")
	public static void method7886() {
		if (Static509.method7066(Static454.anInt7416) || Static85.method1801(Static454.anInt7416)) {
			Static353.method5308(Static63.anInt1715 >> 12, 5000, Static576.anInt9403 >> 12);
		} else {
			@Pc(32) int local32 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray595[0] >> 3;
			@Pc(39) int local39 = Static27.aClass16_Sub1_Sub1_Sub3_Sub2_1.anIntArray594[0] >> 3;
			if (local32 >= 0 && Static456.anInt7428 >> 3 > local32 && local39 >= 0 && Static5.anInt112 >> 3 > local39) {
				Static353.method5308(local39, 5000, local32);
			} else {
				Static353.method5308(Static5.anInt112 >> 4, 0, Static456.anInt7428 >> 4);
			}
		}
		Static524.method7274();
		Static83.method1791();
		Static72.method1636();
		Static460.method6509();
	}
}
