import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!eo", name = "m", descriptor = "I")
	public static int anInt2496 = 0;

	@OriginalMember(owner = "client!eo", name = "u", descriptor = "I")
	public static int anInt2504 = 0;

	@OriginalMember(owner = "client!eo", name = "d", descriptor = "(I)V")
	public static void method2163() {
		Static14.aClass330_51.method7688();
		Static407.aClass330_49.method7688();
		Static247.aClass330_27.method7688();
		Static427.aClass330_53.method7688();
		Static233.aClass330_26.method7688();
	}

	@OriginalMember(owner = "client!eo", name = "e", descriptor = "(I)Z")
	public static boolean method2164() {
		try {
			if (anInt2504 == 2) {
				if (Static498.aClass6_Sub19_2 == null) {
					Static498.aClass6_Sub19_2 = Static589.method3274(Static226.aClass248_33, Static426.anInt7575, Static554.anInt9644);
					if (Static498.aClass6_Sub19_2 == null) {
						return false;
					}
				}
				if (Static353.aClass198_1 == null) {
					Static353.aClass198_1 = new Class198(Static497.aClass248_98, Static332.aClass248_53);
				}
				if (Static373.aClass6_Sub15_Sub3_2.method6637(Static309.aClass248_46, Static353.aClass198_1, Static498.aClass6_Sub19_2)) {
					Static373.aClass6_Sub15_Sub3_2.method6658();
					Static373.aClass6_Sub15_Sub3_2.method6644(Static540.anInt8992);
					Static373.aClass6_Sub15_Sub3_2.method6665(Static498.aClass6_Sub19_2, Static95.aBoolean114);
					Static353.aClass198_1 = null;
					anInt2504 = 0;
					Static226.aClass248_33 = null;
					Static498.aClass6_Sub19_2 = null;
					return true;
				}
			}
		} catch (@Pc(66) Exception local66) {
			local66.printStackTrace();
			Static373.aClass6_Sub15_Sub3_2.method6656();
			Static353.aClass198_1 = null;
			Static226.aClass248_33 = null;
			Static498.aClass6_Sub19_2 = null;
			anInt2504 = 0;
		}
		return false;
	}
}
