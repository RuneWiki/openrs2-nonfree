import java.awt.Component;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!vb", name = "z", descriptor = "Lclient!fc;")
	public static Class21 aClass21_24;

	@OriginalMember(owner = "client!vb", name = "D", descriptor = "Lclient!fc;")
	public static Class21 aClass21_25;

	@OriginalMember(owner = "client!vb", name = "P", descriptor = "Lclient!pb;")
	public static Class40 aClass40_38;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "[I")
	public static int[] anIntArray290 = new int[500];

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1299 = Static34.method846("Fps:");

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!rc;")
	private static Class55 aClass55_1300 = Static34.method846("This computers address has been blocked");

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1301 = Static34.method846("backhmid2");

	@OriginalMember(owner = "client!vb", name = "K", descriptor = "Z")
	public static final boolean aBoolean158 = false;

	@OriginalMember(owner = "client!vb", name = "O", descriptor = "[I")
	public static int[] anIntArray292 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!vb", name = "Q", descriptor = "Lclient!rc;")
	public static Class55 aClass55_1302 = aClass55_1300;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method2001() {
		anIntArray290 = null;
		aClass55_1300 = null;
		aClass55_1302 = null;
		aClass55_1299 = null;
		aClass40_38 = null;
		aClass21_25 = null;
		aClass21_24 = null;
		anIntArray292 = null;
		aClass55_1301 = null;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method2002(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2003(@OriginalArg(0) Component arg0) {
		arg0.removeKeyListener(Static59.aClass24_1);
		arg0.removeFocusListener(Static59.aClass24_1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!jd;B)V")
	public static void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub2_Sub3_Sub1 arg1) {
		if (arg1.anInt2710 < 128 || arg1.anInt2744 < 128 || arg1.anInt2710 >= 13184 || arg1.anInt2744 >= 13184) {
			arg1.anInt2717 = -1;
			arg1.anInt2754 = 0;
			arg1.anInt2722 = -1;
			arg1.anInt2742 = 0;
			arg1.anInt2710 = arg1.anIntArray256[0] * 128 + arg1.anInt2708 * 64;
			arg1.anInt2744 = arg1.anInt2708 * 64 + arg1.anIntArray255[0] * 128;
			arg1.method1824();
		}
		if (Static99.aClass6_Sub2_Sub3_Sub1_Sub1_1 == arg1 && (arg1.anInt2710 < 1536 || arg1.anInt2744 < 1536 || arg1.anInt2710 >= 11776 || arg1.anInt2744 >= 11776)) {
			arg1.anInt2722 = -1;
			arg1.anInt2754 = 0;
			arg1.anInt2742 = 0;
			arg1.anInt2717 = -1;
			arg1.anInt2710 = arg1.anInt2708 * 64 + arg1.anIntArray256[0] * 128;
			arg1.anInt2744 = arg1.anIntArray255[0] * 128 + arg1.anInt2708 * 64;
			arg1.method1824();
		}
		if (arg1.anInt2742 > Static85.anInt2389) {
			Static76.method1520(arg1);
		} else if (Static85.anInt2389 > arg1.anInt2754) {
			Static3.method22(arg1);
		} else {
			Static83.method1590(arg1);
		}
		Static19.method587(arg1);
		Static111.method2045(arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!fb;BLjava/awt/Component;)Lclient!ud;")
	public static Class6_Sub3_Sub2 method2005(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Component arg1) {
		Static23.method674(arg0, arg1);
		@Pc(11) Class6_Sub3_Sub2 local11 = new Class6_Sub3_Sub2();
		Static27.method876(local11);
		return local11;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
	public static int method2006(@OriginalArg(1) KeyEvent arg0) {
		@Pc(12) int local12 = arg0.getKeyChar();
		if (local12 <= 0 || local12 >= 256) {
			local12 = -1;
		}
		return local12;
	}
}
