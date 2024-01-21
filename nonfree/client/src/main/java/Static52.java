import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[I")
	public static int[] anIntArray148;

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!f;")
	public static Class4_Sub7 aClass4_Sub7_11;

	@OriginalMember(owner = "client!ja", name = "o", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "I")
	public static final int anInt1484 = 50;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "[I")
	public static int[] anIntArray147 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_366 = Static60.method1113("rect_debug=");

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "J")
	public static volatile long aLong47 = 0L;

	@OriginalMember(owner = "client!ja", name = "e", descriptor = "Lclient!ec;")
	public static Class22 aClass22_367 = Static60.method1113("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!ec;")
	public static Class22 aClass22_368 = Static60.method1113(")1p");

	@OriginalMember(owner = "client!ja", name = "g", descriptor = "[I")
	public static int[] anIntArray149 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "[Lclient!ec;")
	public static Class22[] aClass22Array13 = new Class22[anInt1484];

	@OriginalMember(owner = "client!ja", name = "n", descriptor = "Lclient!ec;")
	private static Class22 aClass22_369 = Static60.method1113("Loading sprites )2 ");

	@OriginalMember(owner = "client!ja", name = "p", descriptor = "Lclient!ec;")
	public static Class22 aClass22_370 = Static60.method1113("sl_arrows");

	@OriginalMember(owner = "client!ja", name = "r", descriptor = "[I")
	public static int[] anIntArray150 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "Lclient!ec;")
	public static Class22 aClass22_371 = aClass22_369;

	@OriginalMember(owner = "client!ja", name = "y", descriptor = "[I")
	public static int[] anIntArray151 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "I")
	public static int anInt1488 = -1;

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "Lclient!wd;")
	public static Class82 aClass82_5 = new Class82();

	@OriginalMember(owner = "client!ja", name = "B", descriptor = "[I")
	public static int[] anIntArray152 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	public static int anInt1490 = 0;

	@OriginalMember(owner = "client!ja", name = "E", descriptor = "[I")
	public static int[] anIntArray153 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "G", descriptor = "[I")
	public static int[] anIntArray154 = new int[anInt1484];

	@OriginalMember(owner = "client!ja", name = "K", descriptor = "Lclient!ec;")
	public static Class22 aClass22_372 = Static60.method1113("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
	public static void method996(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static104.anInt2634 == 2) {
			Static114.method1818((Static85.anInt2258 - Static98.anInt2584 << 7) + Static18.anInt500, (-Static59.anInt1769 + Static122.anInt1376 << 7) + Static115.anInt2840, Static91.anInt2418 * 2);
			if (Static74.anInt1966 > -1 && Static117.anInt2877 % 20 < 10) {
				Static109.aClass4_Sub1_Sub2_Sub2Array4[0].method790(arg0 + Static74.anInt1966 - 12, arg1 - (-Static108.anInt2723 + 28));
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(B)V")
	public static void method1000() {
		Static68.aClass33_8.method1003();
		Static42.aClass33_13.method1003();
		Static41.aClass33_16.method1003();
	}

	@OriginalMember(owner = "client!ja", name = "b", descriptor = "(B)V")
	public static void method1001() {
		aClass22_370 = null;
		anIntArray154 = null;
		aClass4_Sub7_11 = null;
		aClass22_368 = null;
		anIntArrayArray13 = null;
		aClass22_372 = null;
		anIntArray147 = null;
		anIntArray152 = null;
		anIntArray148 = null;
		aClass22_369 = null;
		aClass22Array13 = null;
		aClass82_5 = null;
		aClass22_367 = null;
		aClass22_371 = null;
		anIntArray149 = null;
		anIntArray150 = null;
		anIntArray153 = null;
		aClass22_366 = null;
		anIntArray151 = null;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(B)V")
	public static void method1002() {
		@Pc(1) Object local1 = Static76.anObject3;
		synchronized (Static76.anObject3) {
			if (Static123.anInt3084 != 0) {
				Static123.anInt3084 = 1;
				try {
					Static76.anObject3.wait();
				} catch (@Pc(11) InterruptedException local11) {
				}
			}
		}
	}
}
