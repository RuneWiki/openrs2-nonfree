import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static179 {

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "Lclient!dh;")
	public static Class18 aClass18_12 = new Class18(4096);

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1621 = Static51.method932("Fps:");

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "Lclient!dh;")
	public static Class18 aClass18_13 = new Class18(32);

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	public static int anInt3813 = 0;

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "I")
	public static int anInt3814 = -1;

	@OriginalMember(owner = "client!wg", name = "z", descriptor = "[Z")
	public static boolean[] aBooleanArray20 = new boolean[100];

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIZ)V")
	public static void method2709(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static142.anInt3159 == 0 || arg0 == 0 || Static48.anInt1160 >= 50) {
			return;
		}
		Static59.anIntArray169[Static48.anInt1160] = arg2;
		Static110.anIntArray256[Static48.anInt1160] = arg0;
		Static28.anIntArray62[Static48.anInt1160] = arg1;
		Static26.aClass57Array1[Static48.anInt1160] = null;
		Static106.anIntArray250[Static48.anInt1160] = 0;
		Static48.anInt1160++;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V")
	public static void method2710() {
		aClass18_12 = null;
		aBooleanArray20 = null;
		aClass10_1621 = null;
		aClass18_13 = null;
	}
}
