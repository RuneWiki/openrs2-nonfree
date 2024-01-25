import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static314 {

	@OriginalMember(owner = "client!lt", name = "n", descriptor = "Lclient!cq;")
	public static final Class56 aClass56_108 = new Class56(45, 0);

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "F")
	public static float aFloat118 = 1.0F;

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(III)Z")
	public static boolean method4612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x20) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(ZI)V")
	public static void method4613(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static44.aClass3_Sub7_Sub17_3 != null) {
			Static20.anInt349 = Static44.aClass3_Sub7_Sub17_3.anInt8083;
		} else {
			Static20.anInt349 = -1;
		}
		Static44.aClass3_Sub7_Sub17_3 = null;
		Static565.aClass112_71 = null;
		Static493.aClass361_17 = null;
		Static454.anInt7639 = 0;
		Static44.method7658();
		Static44.aClass112_72.method3092();
		Static316.aClass96_4 = null;
		Static319.aClass96_5 = null;
		Static584.aClass96_8 = null;
		Static147.aClass96_2 = null;
		Static44.aClass355_3 = null;
		Static510.aClass96_7 = null;
		Static435.aClass14_20 = null;
		Static455.anInt7670 = -1;
		Static181.aClass96_3 = null;
		Static406.anInt7005 = -1;
		Static449.aClass96_6 = null;
		Static26.aClass96_1 = null;
		if (Static44.aClass102_4 != null) {
			Static44.aClass102_4.method2923();
			Static44.aClass102_4.method2924(128, 64);
		}
		if (Static44.aClass87_4 != null) {
			Static44.aClass87_4.method2541(64, 64);
		}
		if (Static44.aClass212_4 != null) {
			Static44.aClass212_4.method4798(64);
		}
		Static284.aClass207_1.method4718(64);
	}
}
