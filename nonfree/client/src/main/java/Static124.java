import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
	public static int anInt2712;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "[[I")
	public static int[][] anIntArrayArray27;

	@OriginalMember(owner = "client!vb", name = "A", descriptor = "I")
	public static int anInt2720;

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	public static int anInt2723;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_1262 = Static134.method2017("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!v;")
	public static Class76 aClass76_1263 = Static134.method2017("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_1264 = Static134.method2017("Benutzen");

	@OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
	public static int anInt2713 = 0;

	@OriginalMember(owner = "client!vb", name = "h", descriptor = "[[[Lclient!vf;")
	public static Class78[][][] aClass78ArrayArrayArray1 = new Class78[4][104][104];

	@OriginalMember(owner = "client!vb", name = "C", descriptor = "Lclient!v;")
	private static Class76 aClass76_1274 = Static134.method2017("World");

	@OriginalMember(owner = "client!vb", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_1265 = aClass76_1274;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "Lclient!vf;")
	public static Class78 aClass78_14 = new Class78();

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_1266 = Static134.method2017("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_1267 = Static134.method2017(" x ");

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!v;")
	public static Class76 aClass76_1268 = Static134.method2017("<)4col> x");

	@OriginalMember(owner = "client!vb", name = "G", descriptor = "Lclient!v;")
	private static Class76 aClass76_1275 = Static134.method2017("OFF");

	@OriginalMember(owner = "client!vb", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_1269 = aClass76_1275;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_1270 = Static134.method2017("gleiten:");

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	public static volatile int anInt2717 = 0;

	@OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
	public static int anInt2718 = 0;

	@OriginalMember(owner = "client!vb", name = "v", descriptor = "Lclient!v;")
	public static Class76 aClass76_1271 = Static134.method2017("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!vb", name = "w", descriptor = "[J")
	public static long[] aLongArray65 = new long[32];

	@OriginalMember(owner = "client!vb", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_1272 = aClass76_1274;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!v;")
	private static Class76 aClass76_1273 = Static134.method2017("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "[I")
	public static int[] anIntArray393 = new int[2000];

	@OriginalMember(owner = "client!vb", name = "H", descriptor = "Lclient!v;")
	public static Class76 aClass76_1276 = aClass76_1273;

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	public static void method1902() {
		aLongArray65 = null;
		aClass76_1264 = null;
		aClass78ArrayArrayArray1 = null;
		aClass76_1263 = null;
		aClass76_1272 = null;
		aClass76_1276 = null;
		aClass76_1266 = null;
		aClass76_1265 = null;
		aClass78_14 = null;
		aClass76_1271 = null;
		aClass76_1273 = null;
		aClass76_1274 = null;
		aClass76_1262 = null;
		aClass76_1275 = null;
		aClass76_1267 = null;
		anIntArray393 = null;
		aClass76_1268 = null;
		aClass76_1269 = null;
		aClass76_1270 = null;
		anIntArrayArray27 = null;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	public static void method1903() {
		try {
			if (Static48.anInt1229 == 1) {
				@Pc(17) int local17 = Static30.aClass4_Sub12_Sub2_4.method1086();
				if (local17 > 0 && Static30.aClass4_Sub12_Sub2_4.method1068()) {
					local17 -= Static55.anInt1458;
					if (local17 < 0) {
						local17 = 0;
					}
					Static30.aClass4_Sub12_Sub2_4.method1064(local17);
				} else {
					Static30.aClass4_Sub12_Sub2_4.method1089();
					Static30.aClass4_Sub12_Sub2_4.method1080();
					Static69.aClass4_Sub9_1 = null;
					Static102.aClass46_1 = null;
					if (Static28.aClass17_6 == null) {
						Static48.anInt1229 = 0;
					} else {
						Static48.anInt1229 = 2;
					}
				}
			}
		} catch (@Pc(55) Exception local55) {
			local55.printStackTrace();
			Static30.aClass4_Sub12_Sub2_4.method1089();
			Static48.anInt1229 = 0;
			Static102.aClass46_1 = null;
			Static28.aClass17_6 = null;
			Static69.aClass4_Sub9_1 = null;
		}
	}
}
