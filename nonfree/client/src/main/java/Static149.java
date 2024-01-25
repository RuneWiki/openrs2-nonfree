import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "Lclient!fc;")
	public static Class66 aClass66_1;

	@OriginalMember(owner = "client!fv", name = "m", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray5;

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_134 = new Class296(52, 3);

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
	public static int anInt2773 = 0;

	@OriginalMember(owner = "client!fv", name = "n", descriptor = "Lclient!im;")
	public static final Class140 aClass140_51 = new Class140(39, 8);

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Z")
	public static boolean aBoolean179 = false;

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IIII)V")
	public static void method2369(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 0) {
			Static144.method2331(Static72.aClass296_73);
		}
		if (arg0 == 1) {
			Static144.method2331(Static446.aClass296_327);
		}
		Static455.aClass1_Sub6_Sub2_2.method3919(Static470.anInt7897 + arg2);
		Static455.aClass1_Sub6_Sub2_2.method3959(arg1 + Static534.anInt9007);
		Static455.aClass1_Sub6_Sub2_2.method3957(aClass66_1.method1582(82) ? 1 : 0);
		Static377.anInt6886 = arg1;
		Static364.anInt6445 = arg2;
		Static426.aBoolean535 = false;
		Static19.method499();
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)Ljava/lang/String;")
	public static String method2370() {
		@Pc(7) String local7 = "www";
		if (Static145.aClass21_4 == Static486.aClass21_7) {
			local7 = "www-wtrc";
		} else if (Static145.aClass21_4 == Static214.aClass21_3) {
			local7 = "www-wtqa";
		} else if (Static145.aClass21_4 == Static508.aClass21_8) {
			local7 = "www-wtwip";
		}
		@Pc(28) String local28 = "";
		if (Static285.aString48 != null) {
			local28 = "/p=" + Static285.aString48;
		}
		return "http://" + local7 + "." + Static304.aClass101_1.aString23 + ".com/l=" + Static179.anInt3168 + "/a=" + Static543.anInt9158 + local28 + "/";
	}
}
