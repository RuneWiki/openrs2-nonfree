import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static581 {

	@OriginalMember(owner = "client!tm", name = "hb", descriptor = "I")
	public static int anInt9233;

	@OriginalMember(owner = "client!tm", name = "O", descriptor = "I")
	public static int anInt9218 = 503;

	@OriginalMember(owner = "client!tm", name = "ib", descriptor = "I")
	public static int anInt9234 = -1;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "(I)V")
	public static void method7831() {
		if (Static649.method8507(Static520.anInt6836) || Static473.method6805(Static520.anInt6836)) {
			Static198.method3149(Static97.anInt2082 >> 12, 5000, Static663.anInt10236 >> 12);
		} else {
			@Pc(29) int local29 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray659[0] >> 3;
			@Pc(36) int local36 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anIntArray660[0] >> 3;
			if (local29 >= 0 && Static251.anInt4680 >> 3 > local29 && local36 >= 0 && local36 < Static406.anInt6924 >> 3) {
				Static198.method3149(local29, 5000, local36);
			} else {
				Static198.method3149(Static251.anInt4680 >> 4, 0, Static406.anInt6924 >> 4);
			}
		}
		Static643.method8442();
		Static404.method5780();
		Static577.method7767();
		Static530.method7397();
	}
}
