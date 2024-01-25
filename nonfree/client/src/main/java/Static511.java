import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static511 {

	@OriginalMember(owner = "client!vi", name = "Pc", descriptor = "Lclient!ra;")
	public static Class36 aClass36_4;

	@OriginalMember(owner = "client!vi", name = "Tc", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!vi", name = "Vc", descriptor = "[[Lclient!et;")
	public static Class91[][] aClass91ArrayArray2;

	@OriginalMember(owner = "client!vi", name = "bd", descriptor = "[I")
	public static int[] anIntArray782;

	@OriginalMember(owner = "client!vi", name = "Yc", descriptor = "[Lclient!av;")
	public static final Class20_Sub1_Sub1_Sub1[] aClass20_Sub1_Sub1_Sub1Array1 = new Class20_Sub1_Sub1_Sub1[2048];

	@OriginalMember(owner = "client!vi", name = "gd", descriptor = "[I")
	public static final int[] anIntArray783 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	public static void method7828(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static431.anInt7490 = arg0;
		Static355.aClass46_Sub7Array1 = new Class46_Sub7[Static154.anIntArray263[Static431.anInt7490] + 1];
		Static256.anInt5004 = 0;
		Static153.anInt3001 = 0;
	}
}
