import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Lclient!ee;")
	public static Class3_Sub3_Sub2_Sub1 aClass3_Sub3_Sub2_Sub1_1;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!hc;")
	public static Class3_Sub3_Sub2_Sub2 aClass3_Sub3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!mc;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_387 = Static87.method1648("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "Lclient!hb;")
	private static Class27 aClass27_388 = Static87.method1648("Login attempts exceeded)3");

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "Lclient!hb;")
	private static Class27 aClass27_391 = Static87.method1648("level)2");

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_389 = aClass27_391;

	@OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
	public static int anInt800 = 0;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "[I")
	public static int[] anIntArray150 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!fc", name = "q", descriptor = "Lclient!hb;")
	public static Class27 aClass27_390 = aClass27_388;

	@OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
	public static int anInt803 = 0;

	@OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
	public static int anInt805 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public static void method657() {
		aClass3_Sub3_Sub2_Sub1_1 = null;
		aClass41_1 = null;
		aClass27_390 = null;
		aClass3_Sub3_Sub2_Sub2_2 = null;
		aClass27_389 = null;
		aClass27_391 = null;
		aClass27_388 = null;
		aClass27_387 = null;
		anIntArray150 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method659() {
		if (Static74.anInt2080 == 2) {
			Static28.method620((Static80.anInt2185 - Static89.anInt2464 << 7) + Static11.anInt2734, Static47.anInt1276 + (-Static101.anInt2631 + Static38.anInt926 << 7), Static19.anInt444 * 2);
			if (Static28.anInt746 > -1 && Static2.anInt38 % 20 < 10) {
				Static19.aClass3_Sub3_Sub2_Sub2Array6[0].method804(Static28.anInt746 - 12, Static77.anInt2149 + -28);
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public static void method662() {
		try {
			@Pc(11) Graphics local11 = Static19.aCanvas1.getGraphics();
			Static90.aClass12_71.method671(4, local11, 4);
		} catch (@Pc(21) Exception local21) {
			Static19.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!td;Z)V")
	public static void method664(@OriginalArg(0) Class54 arg0) {
		Static83.aClass54_30 = arg0;
	}
}
