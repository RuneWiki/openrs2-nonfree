import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!mu", name = "f", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_104 = new Class129(23, 7);

	@OriginalMember(owner = "client!mu", name = "j", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_75 = new Class194(6, -1);

	@OriginalMember(owner = "client!mu", name = "k", descriptor = "[I")
	public static final int[] anIntArray335 = new int[256];

	@OriginalMember(owner = "client!mu", name = "l", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!mu", name = "a", descriptor = "(Z)V")
	public static void method3384() {
		if (Static112.method1554(Static376.anInt6324) || Static67.method1032(Static376.anInt6324)) {
			Static290.method3603(Static116.anInt1977 >> 10, 5000, Static393.anInt4184 >> 10);
		} else {
			@Pc(36) int local36 = Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray434[0] >> 3;
			@Pc(43) int local43 = Static220.aClass2_Sub1_Sub3_Sub2_1.anIntArray433[0] >> 3;
			if (local36 >= 0 && Static433.anInt7210 >> 3 > local36 && local43 >= 0 && Static418.anInt6969 >> 3 > local43) {
				Static290.method3603(local36, 5000, local43);
			} else {
				Static290.method3603(Static433.anInt7210 >> 4, 0, Static418.anInt6969 >> 4);
			}
		}
		Static51.method806();
		Static367.method4754();
		Static335.method4341();
		Static355.method4596();
	}
}
