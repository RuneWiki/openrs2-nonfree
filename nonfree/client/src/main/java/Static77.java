import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ig", name = "Hb", descriptor = "[[Lclient!ig;")
	public static Class39[][] aClass39ArrayArray1;

	@OriginalMember(owner = "client!ig", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_769 = Static49.method1293(" )2> ");

	@OriginalMember(owner = "client!ig", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_770 = Static49.method1293("Regeln versto-8en hat)3");

	@OriginalMember(owner = "client!ig", name = "pc", descriptor = "Lclient!ng;")
	public static Class58 aClass58_1 = new Class58();

	@OriginalMember(owner = "client!ig", name = "Ec", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!ig", name = "Qc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_782 = Static49.method1293("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!ig", name = "Fc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_777 = aClass70_782;

	@OriginalMember(owner = "client!ig", name = "Gc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_778 = Static49.method1293("Prepared sound engine");

	@OriginalMember(owner = "client!ig", name = "Ic", descriptor = "[S")
	public static short[] aShortArray23 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!ig", name = "Lc", descriptor = "Lclient!rf;")
	private static Class70 aClass70_779 = Static49.method1293(" has logged out)3");

	@OriginalMember(owner = "client!ig", name = "Nc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_780 = aClass70_778;

	@OriginalMember(owner = "client!ig", name = "Pc", descriptor = "Lclient!rf;")
	public static Class70 aClass70_781 = aClass70_779;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V")
	public static void method1751(@OriginalArg(0) int arg0) {
		if (Static15.anInt445 == arg0) {
			return;
		}
		if (Static15.anInt445 == 0) {
			Static54.method1368();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static68.anInt2112 = 0;
			Static30.anInt995 = 0;
			Static164.anInt4266 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static74.aClass43_19 != null) {
			Static74.aClass43_19.method2042();
			Static74.aClass43_19 = null;
		}
		if (Static15.anInt445 == 25) {
			Static106.anInt3001 = 1;
			Static96.anInt2795 = 0;
			Static55.anInt1762 = 1;
			Static115.anInt3157 = 0;
			Static131.anInt3437 = 0;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static71.method1644(Static24.aCanvas1, Static101.aClass76_Sub1_9, Static156.aClass76_Sub1_15);
		} else {
			Static55.method1372();
		}
		Static15.anInt445 = arg0;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)V")
	public static void method1759() {
		aClass70_770 = null;
		aClass70_778 = null;
		aClass70_780 = null;
		aClass58_1 = null;
		aClass70_779 = null;
		aClass70_777 = null;
		aClass70_782 = null;
		aClass70_769 = null;
		aClass70_781 = null;
		aShortArray23 = null;
		aClass39ArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)V")
	public static void method1760() {
		if (!Static32.aBoolean47) {
			Static20.aShortArray7[0] = 1004;
			Static162.anInt4331 = 1;
			Static30.aClass70Array6[0] = Static70.aClass70_676;
			Static174.aClass70Array23[0] = Static35.aClass70_632;
		}
		if (Static58.anInt1865 != -1) {
			Static104.method2189(Static58.anInt1865);
		}
		for (@Pc(29) int local29 = 0; local29 < Static44.anInt1474; local29++) {
			if (Static161.aBooleanArray18[local29]) {
				Static26.aBooleanArray3[local29] = true;
			}
			Static164.aBooleanArray19[local29] = Static161.aBooleanArray18[local29];
			Static161.aBooleanArray18[local29] = false;
		}
		Static149.anInt4000 = -1;
		Static167.anInt4342 = -1;
		Static53.aClass39_16 = null;
		Static3.anInt154 = Static47.anInt1654;
		if (Static58.anInt1865 != -1) {
			Static44.anInt1474 = 0;
			Static139.method2728(503, 765, 0, 0, 0, 0, -1, Static58.anInt1865);
		}
		Static155.method3005();
		Static126.method631();
		if (Static32.aBoolean47) {
			Static144.method2834();
		} else if (Static167.anInt4342 != -1) {
			Static136.method2656(Static149.anInt4000, Static167.anInt4342);
		}
		if (Static45.anInt1478 == 3) {
			for (@Pc(104) int local104 = 0; local104 < Static44.anInt1474; local104++) {
				if (Static164.aBooleanArray19[local104]) {
					Static155.method3010(Static99.anIntArray437[local104], Static92.anIntArray254[local104], Static19.anIntArray32[local104], Static146.anIntArray363[local104], 16711935, 128);
				} else if (Static26.aBooleanArray3[local104]) {
					Static155.method3010(Static99.anIntArray437[local104], Static92.anIntArray254[local104], Static19.anIntArray32[local104], Static146.anIntArray363[local104], 16711680, 128);
				}
			}
		}
		Static70.method1602(Static72.anInt2243, Static56.anInt1784, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2001, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2030);
		Static72.anInt2243 = 0;
	}
}
