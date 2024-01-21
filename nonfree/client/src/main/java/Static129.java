import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
	public static int anInt3146 = -1;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt3148 = 0;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt3149 = 0;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1768 = Static28.method504("Connection timed out)3");

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "[Lclient!f;")
	public static Class24[] aClass24Array1 = new Class24[50];

	@OriginalMember(owner = "client!wa", name = "h", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1769 = Static28.method504("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1770 = Static28.method504("Abbrechen");

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1771 = aClass39_1768;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1772 = Static28.method504("huffman");

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
	public static int anInt3153 = 1;

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1773 = Static28.method504("mapedge");

	@OriginalMember(owner = "client!wa", name = "p", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_72 = null;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!pd;Lclient!pd;Lclient!pd;)V")
	public static void method2183(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) Class20 arg2) {
		Static105.aClass20_42 = arg1;
		Static52.aClass20_31 = arg0;
		Static103.aClass20_52 = arg2;
		Static109.aClass4_Sub5ArrayArray1 = new Class4_Sub5[Static105.aClass20_42.method468()][];
		Static24.aBooleanArray7 = new boolean[Static105.aClass20_42.method468()];
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILclient!pd;BI)[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] method2184(@OriginalArg(0) int arg0, @OriginalArg(1) Class20 arg1, @OriginalArg(3) int arg2) {
		return Static55.method977(arg2, arg0, arg1) ? Static36.method594() : null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2185() {
		aClass39_1773 = null;
		aClass4_Sub5_72 = null;
		aClass39_1768 = null;
		aClass39_1772 = null;
		aClass39_1769 = null;
		aClass24Array1 = null;
		aClass39_1771 = null;
		aClass39_1770 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method2186() {
		if (!Static101.aBoolean122) {
			Static47.aClass39Array8[0] = Static62.aClass39_862;
			Static125.anIntArray358[0] = 1007;
			Static52.aClass39Array11[0] = Static72.aClass39_423;
			Static105.anInt2033 = 1;
		}
		if (Static115.anInt2882 != -1) {
			Static70.method1190(Static115.anInt2882);
		}
		for (@Pc(30) int local30 = 0; local30 < Static87.anInt2227; local30++) {
			if (Static13.aBooleanArray3[local30]) {
				Static113.aBooleanArray16[local30] = true;
			}
			Static99.aBooleanArray13[local30] = Static13.aBooleanArray3[local30];
			Static13.aBooleanArray3[local30] = false;
		}
		Static100.aClass4_Sub5_54 = null;
		Static23.anInt646 = -1;
		Static102.anInt2543 = -1;
		Static33.anInt832 = Static71.anInt1738;
		if (Static115.anInt2882 != -1) {
			Static87.anInt2227 = 0;
			Static24.method322(503, 0, -1, 0, 765, 0, 0, Static115.anInt2882);
		}
		Static27.method494();
		if (Static101.aBoolean122) {
			Static80.method1329();
		} else if (Static102.anInt2543 != -1) {
			Static110.method1954(Static23.anInt646, Static102.anInt2543);
		}
		if (Static2.anInt17 == 3) {
			Static17.method1681();
			for (@Pc(99) int local99 = 0; local99 < Static87.anInt2227; local99++) {
				if (Static99.aBooleanArray13[local99]) {
					Static17.method1676(Static11.anIntArray38[local99], Static30.anIntArray89[local99], Static108.anIntArray301[local99], Static94.anIntArray252[local99], 16711935, 128);
				} else if (Static113.aBooleanArray16[local99]) {
					Static17.method1676(Static11.anIntArray38[local99], Static30.anIntArray89[local99], Static108.anIntArray301[local99], Static94.anIntArray252[local99], 16711680, 128);
				}
			}
		}
		Static52.method886(Static131.anInt3202, Static39.anInt952, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2641, Static36.aClass4_Sub2_Sub1_Sub1_Sub1_1.anInt2643);
		Static39.anInt952 = 0;
	}
}
