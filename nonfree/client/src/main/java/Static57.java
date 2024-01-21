import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static57 {

	@OriginalMember(owner = "client!k", name = "v", descriptor = "[[B")
	public static byte[][] aByteArrayArray5;

	@OriginalMember(owner = "client!k", name = "B", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!k", name = "G", descriptor = "[I")
	public static int[] anIntArray158;

	@OriginalMember(owner = "client!k", name = "z", descriptor = "I")
	public static int anInt1375 = 0;

	@OriginalMember(owner = "client!k", name = "C", descriptor = "Lclient!u;")
	public static Class74 aClass74_965 = Static72.method1077("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!k", name = "F", descriptor = "Lclient!u;")
	public static Class74 aClass74_966 = Static72.method1077("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!k", name = "I", descriptor = "Lclient!u;")
	public static Class74 aClass74_967 = Static72.method1077("oder benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!k", name = "J", descriptor = "I")
	public static int anInt1378 = 0;

	@OriginalMember(owner = "client!k", name = "M", descriptor = "Lclient!u;")
	private static Class74 aClass74_969 = Static72.method1077("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!k", name = "K", descriptor = "Lclient!u;")
	public static Class74 aClass74_968 = aClass74_969;

	@OriginalMember(owner = "client!k", name = "L", descriptor = "[I")
	public static int[] anIntArray159 = new int[500];

	@OriginalMember(owner = "client!k", name = "O", descriptor = "Z")
	public static boolean aBoolean52 = false;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Lclient!u;")
	private static Class74 aClass74_970 = Static72.method1077("Loading game screen )2 ");

	@OriginalMember(owner = "client!k", name = "R", descriptor = "Lclient!u;")
	public static Class74 aClass74_971 = aClass74_970;

	@OriginalMember(owner = "client!k", name = "S", descriptor = "Lclient!u;")
	public static Class74 aClass74_972 = Static72.method1077("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!k", name = "T", descriptor = "Lclient!u;")
	public static Class74 aClass74_973 = Static72.method1077("gleiten:");

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZIII)V")
	public static void method951(@OriginalArg(0) boolean arg0) {
		Static79.anInt1769 = 2;
		Static119.anInt2551 = 22050;
		Static106.aBoolean99 = arg0;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IIB)V")
	public static void method952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static128.aClass2_Sub10_Sub1_3.method1533(221);
		Static128.aClass2_Sub10_Sub1_3.method1492(arg0);
		Static128.aClass2_Sub10_Sub1_3.method1482(arg1);
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZLclient!ba;I)V")
	public static void method953(@OriginalArg(1) Class2_Sub2_Sub2_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt2701 > Static107.anInt2338) {
			Static42.method677(arg0);
		} else if (arg0.anInt2716 >= Static107.anInt2338) {
			Static24.method489(arg0);
		} else {
			Static8.method169(arg0);
		}
		if (arg0.anInt2673 < 128 || arg0.anInt2672 < 128 || arg0.anInt2673 >= 13184 || arg0.anInt2672 >= 13184) {
			arg0.anInt2673 = arg0.anInt2703 * 64 + arg0.anIntArray394[0] * 128;
			arg0.anInt2701 = 0;
			arg0.anInt2672 = arg0.anInt2703 * 64 + arg0.anIntArray393[0] * 128;
			arg0.anInt2660 = -1;
			arg0.anInt2716 = 0;
			arg0.anInt2670 = -1;
			arg0.method1857();
		}
		if (arg0 == Static99.aClass2_Sub2_Sub2_Sub1_Sub2_1 && (arg0.anInt2673 < 1536 || arg0.anInt2672 < 1536 || arg0.anInt2673 >= 11776 || arg0.anInt2672 >= 11776)) {
			arg0.anInt2716 = 0;
			arg0.anInt2673 = arg0.anInt2703 * 64 + arg0.anIntArray394[0] * 128;
			arg0.anInt2672 = arg0.anIntArray393[0] * 128 + arg0.anInt2703 * 64;
			arg0.anInt2660 = -1;
			arg0.anInt2701 = 0;
			arg0.anInt2670 = -1;
			arg0.method1857();
		}
		Static4.method27(arg0);
		Static61.method1093(arg0);
	}

	@OriginalMember(owner = "client!k", name = "b", descriptor = "(B)V")
	public static void method954() {
		aClass74_971 = null;
		aClass74_966 = null;
		anIntArray156 = null;
		aClass74_965 = null;
		aClass74_969 = null;
		aClass74_972 = null;
		aByteArrayArray5 = null;
		anIntArray158 = null;
		aClass74_968 = null;
		anIntArray159 = null;
		aClass74_970 = null;
		aClass74_973 = null;
		aClass74_967 = null;
	}

	@OriginalMember(owner = "client!k", name = "c", descriptor = "(I)V")
	public static void method955() {
		Static49.aClass16_39.method485();
	}
}
