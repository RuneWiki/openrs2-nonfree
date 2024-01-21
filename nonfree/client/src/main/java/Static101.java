import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
	public static int anInt2344;

	@OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
	public static int anInt2350;

	@OriginalMember(owner = "client!qe", name = "wb", descriptor = "[I")
	public static int[] anIntArray411;

	@OriginalMember(owner = "client!qe", name = "zb", descriptor = "Lclient!lf;")
	public static Class7 aClass7_15;

	@OriginalMember(owner = "client!qe", name = "nb", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1115 = Static78.method1313("Trade)4compete");

	@OriginalMember(owner = "client!qe", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1112 = aClass25_1115;

	@OriginalMember(owner = "client!qe", name = "U", descriptor = "Lclient!p;")
	public static Class63 aClass63_21 = new Class63(64);

	@OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1113 = Static78.method1313("Der Anmelde)2Server ist offline)3");

	@OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1114 = Static78.method1313("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!qe", name = "pb", descriptor = "Z")
	public static boolean aBoolean107 = false;

	@OriginalMember(owner = "client!qe", name = "xb", descriptor = "I")
	public static int anInt2360 = 0;

	@OriginalMember(owner = "client!qe", name = "yb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1116 = Static78.method1313("titlebox");

	@OriginalMember(owner = "client!qe", name = "Ab", descriptor = "I")
	public static int anInt2361 = 0;

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V")
	public static void method1670() {
		Static76.aClass63_13.method1513();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method1671(@OriginalArg(0) String arg0) throws ClassNotFoundException {
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

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
	public static void method1673() {
		aClass25_1116 = null;
		aClass25_1114 = null;
		aClass7_15 = null;
		anIntArray411 = null;
		aClass25_1112 = null;
		aClass63_21 = null;
		aClass25_1113 = null;
		aClass25_1115 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)V")
	public static void method1677(@OriginalArg(0) int arg0) {
		Static59.method1060(arg0);
		Static45.method959(arg0);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(JI)V")
	public static void method1681(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static80.anInt1786 >= 100 && Static109.anInt2506 != 1 || Static80.anInt1786 >= 200) {
			Static25.method584(0, Static2.aClass25_32, Static92.aClass25_985);
			return;
		}
		@Pc(31) Class25 local31 = Static24.method575(arg0).method772();
		for (@Pc(33) int local33 = 0; local33 < Static80.anInt1786; local33++) {
			if (arg0 == Static129.aLongArray6[local33]) {
				Static25.method584(0, Static116.method1859(new Class25[] { local31, Static124.aClass25_1405 }), Static92.aClass25_985);
				return;
			}
		}
		for (@Pc(64) int local64 = 0; local64 < Static49.anInt1230; local64++) {
			if (arg0 == Static68.aLongArray3[local64]) {
				Static25.method584(0, Static116.method1859(new Class25[] { Static93.aClass25_1007, local31, Static39.aClass25_459 }), Static92.aClass25_985);
				return;
			}
		}
		if (local31.method787(Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.aClass25_1384)) {
			return;
		}
		Static118.aClass25Array22[Static80.anInt1786] = local31;
		Static129.aLongArray6[Static80.anInt1786] = arg0;
		Static47.anIntArray241[Static80.anInt1786] = 0;
		Static3.anIntArray12[Static80.anInt1786] = 0;
		Static90.aBoolean98 = true;
		Static62.anInt1392 = Static60.anInt1366 + 1;
		Static80.anInt1786++;
		Static68.aClass1_Sub5_Sub1_2.method688(149);
		Static68.aClass1_Sub5_Sub1_2.method640(arg0);
	}
}
