import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!ud;")
	public static Class5 aClass5_21;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	public static int anInt1653;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "Lclient!d;")
	public static Class14 aClass14_4;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "[I")
	public static int[] anIntArray338;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public static int anInt1664;

	@OriginalMember(owner = "client!n", name = "b", descriptor = "Lclient!o;")
	public static Class40 aClass40_480 = Static13.method257("::noclip");

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	public static int anInt1645 = 0;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	public static int anInt1649 = 0;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "I")
	public static int anInt1654 = -1;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!o;")
	public static Class40 aClass40_481 = Static13.method257("Chat panel redrawn");

	@OriginalMember(owner = "client!n", name = "t", descriptor = "I")
	public static final int anInt1660 = 20;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	public static volatile int anInt1663 = -1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1093() {
		aClass5_21 = null;
		aClass40_481 = null;
		aClass40_480 = null;
		aClass14_4 = null;
		anIntArray338 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z")
	public static boolean method1094(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!o;Lclient!o;I)V")
	public static void method1095(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(5) short local5 = 151;
		@Pc(6) int local6 = local5 - 3;
		if (Static1.aBoolean1) {
			Static1.aBoolean1 = false;
			Static42.method768(Static24.aGraphics1);
			Static4.method83(Static24.aGraphics1);
			Static73.method1207(Static24.aGraphics1);
			Static32.method594(Static24.aGraphics1);
			Static107.method1664(Static104.anInt2515, Static24.aGraphics1, Static103.aClass2_Sub2_Sub2_Sub2_5, Static103.anInt2491, Static23.anInt583);
			Static93.method1487(Static62.anInt1551, Static2.anIntArray2, -1, anInt1654 == -1, Static24.aGraphics1);
			Static7.aBoolean23 = true;
			Static92.aBoolean165 = true;
			Static5.aBoolean13 = true;
		}
		Static75.method1230();
		Static103.aClass2_Sub2_Sub2_Sub2_5.method566(arg2, 257, 148, 0);
		Static103.aClass2_Sub2_Sub2_Sub2_5.method566(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local6 += 15;
			if (arg0) {
				@Pc(81) int local81 = Static103.aClass2_Sub2_Sub2_Sub2_5.method568(arg1) + 4;
				Static26.method1612(257 - local81 / 2, 152, local81, 11, 0);
			}
			Static103.aClass2_Sub2_Sub2_Sub2_5.method566(arg1, 257, 163, 0);
			Static103.aClass2_Sub2_Sub2_Sub2_5.method566(arg1, 256, 162, 16777215);
		}
		Static80.method1333(Static24.aGraphics1);
	}
}
