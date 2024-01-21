import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Lclient!m;")
	public static Class41 aClass41_1;

	@OriginalMember(owner = "client!hb", name = "k", descriptor = "Lclient!ab;")
	public static Class3_Sub1_Sub1_Sub1 aClass3_Sub1_Sub1_Sub1_10;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt1100 = 1;

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "Z")
	public static boolean aBoolean63 = false;

	@OriginalMember(owner = "client!hb", name = "g", descriptor = "Lclient!v;")
	public static Class62 aClass62_472 = Static45.method753("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "I")
	public static int anInt1104 = 0;

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "I")
	public static int anInt1106 = 0;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V")
	public static void method660() {
		aClass41_1 = null;
		aClass62_472 = null;
		aClass3_Sub1_Sub1_Sub1_10 = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)Lclient!v;")
	public static Class62 method661(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static99.method1662(arg0);
		} else if (arg0 < 10000000) {
			return Static49.method782(new Class62[] { Static99.method1662(arg0 / 1000), Static99.aClass62_1195 });
		} else {
			return Static49.method782(new Class62[] { Static99.method1662(arg0 / 1000000), Static15.aClass62_220 });
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ILclient!rc;ZII)V")
	public static void method662(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub1_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static29.aClass9_14.method682();
		Static2.aClass3_Sub1_Sub1_Sub1_1.method145(0, 0);
		arg1.method1489(Static79.aClass62_931, 55, 28, 16777215, true);
		if (arg0 == 0) {
			arg1.method1489(Static50.aClass62_1276, 55, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg1.method1489(Static74.aClass62_871, 55, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg1.method1489(Static19.aClass62_1289, 55, 41, 16711680, true);
		}
		if (arg0 == 3) {
			arg1.method1489(Static55.aClass62_654, 55, 41, 65535, true);
		}
		arg1.method1489(Static83.aClass62_204, 184, 28, 16777215, true);
		if (arg2 == 0) {
			arg1.method1489(Static50.aClass62_1276, 184, 41, 65280, true);
		}
		if (arg2 == 1) {
			arg1.method1489(Static74.aClass62_871, 184, 41, 16776960, true);
		}
		if (arg2 == 2) {
			arg1.method1489(Static19.aClass62_1289, 184, 41, 16711680, true);
		}
		arg1.method1489(Static18.aClass62_285, 324, 28, 16777215, true);
		if (arg3 == 0) {
			arg1.method1489(Static50.aClass62_1276, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg1.method1489(Static74.aClass62_871, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg1.method1489(Static19.aClass62_1289, 324, 41, 16711680, true);
		}
		arg1.method1489(Static54.aClass62_1241, 458, 33, 16777215, true);
		try {
			@Pc(161) Graphics local161 = Static44.aCanvas1.getGraphics();
			Static29.aClass9_14.method686(local161, 0, 453);
		} catch (@Pc(169) Exception local169) {
			Static44.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!v;Lclient!v;Lclient!v;Z)V")
	public static void method663(@OriginalArg(0) Class62 arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) Class62 arg2) {
		Static74.aClass62_869 = arg2;
		Static74.aClass62_870 = arg0;
		Static74.aClass62_872 = arg1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)I")
	public static int method664() {
		return 19;
	}
}
