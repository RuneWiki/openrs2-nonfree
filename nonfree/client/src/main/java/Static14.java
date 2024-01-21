import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ca", name = "f", descriptor = "Lclient!lf;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!ca", name = "j", descriptor = "Lclient!nb;")
	public static Class1_Sub2_Sub12 aClass1_Sub2_Sub12_1;

	@OriginalMember(owner = "client!ca", name = "m", descriptor = "Lclient!lf;")
	public static Class7 aClass7_3;

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "[I")
	public static int[] anIntArray76;

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "[I")
	public static int[] anIntArray78;

	@OriginalMember(owner = "client!ca", name = "A", descriptor = "Lclient!oc;")
	public static Class56 aClass56_15;

	@OriginalMember(owner = "client!ca", name = "G", descriptor = "I")
	public static int anInt408;

	@OriginalMember(owner = "client!ca", name = "i", descriptor = "Lclient!fc;")
	public static Class25 aClass25_203 = Static78.method1313("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_204 = Static78.method1313("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "Lclient!fc;")
	private static Class25 aClass25_206 = Static78.method1313("Click to switch");

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "Lclient!fc;")
	public static Class25 aClass25_205 = aClass25_206;

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
	public static int[] anIntArray77 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "Lclient!fc;")
	public static Class25 aClass25_207 = Static78.method1313("<col=80ff00>");

	@OriginalMember(owner = "client!ca", name = "B", descriptor = "Lclient!fc;")
	public static Class25 aClass25_208 = Static78.method1313("(Y ");

	@OriginalMember(owner = "client!ca", name = "H", descriptor = "Lclient!fc;")
	public static Class25 aClass25_209 = Static78.method1313("title)3jpg");

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!ma;III)V")
	public static void method351(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub3 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		aClass7_3.method1096();
		Static23.aClass1_Sub2_Sub2_Sub4_3.method1953(0, 0);
		arg1.method1200(Static52.aClass25_540, 55, 28, 16777215, 0);
		if (arg3 == 0) {
			arg1.method1200(Static81.aClass25_865, 55, 41, 65280, 0);
		}
		if (arg3 == 1) {
			arg1.method1200(Static112.aClass25_1269, 55, 41, 16776960, 0);
		}
		if (arg3 == 2) {
			arg1.method1200(Static115.aClass25_1291, 55, 41, 16711680, 0);
		}
		if (arg3 == 3) {
			arg1.method1200(Static59.aClass25_588, 55, 41, 65535, 0);
		}
		arg1.method1200(Static97.aClass25_1078, 184, 28, 16777215, 0);
		if (arg2 == 0) {
			arg1.method1200(Static81.aClass25_865, 184, 41, 65280, 0);
		}
		if (arg2 == 1) {
			arg1.method1200(Static112.aClass25_1269, 184, 41, 16776960, 0);
		}
		if (arg2 == 2) {
			arg1.method1200(Static115.aClass25_1291, 184, 41, 16711680, 0);
		}
		arg1.method1200(Static101.aClass25_1112, 324, 28, 16777215, 0);
		if (arg0 == 0) {
			arg1.method1200(Static81.aClass25_865, 324, 41, 65280, 0);
		}
		if (arg0 == 1) {
			arg1.method1200(Static112.aClass25_1269, 324, 41, 16776960, 0);
		}
		if (arg0 == 2) {
			arg1.method1200(Static115.aClass25_1291, 324, 41, 16711680, 0);
		}
		arg1.method1179(Static3.aClass25_40, 417, 17, 85, 25, 16777215, 0, 1, 1, 0);
		try {
			@Pc(159) Graphics local159 = Static119.aCanvas1.getGraphics();
			aClass7_3.method1095(local159, 0, 453);
		} catch (@Pc(167) Exception local167) {
			Static119.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
	public static void method355() {
		aClass1_Sub2_Sub12_1 = null;
		aClass7_3 = null;
		aClass25_209 = null;
		aClass25_206 = null;
		anIntArray76 = null;
		aClass25_208 = null;
		aClass25_207 = null;
		anIntArray78 = null;
		aClass25_204 = null;
		aClass56_15 = null;
		aClass7_2 = null;
		anIntArray77 = null;
		aClass25_205 = null;
		aClass25_203 = null;
	}
}
