import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

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

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V", line = 23)
	public static void method1093() {
		aClass5_21 = null;
		Class37.aClass40_481 = null;
		Class37.aClass40_480 = null;
		aClass14_4 = null;
		anIntArray338 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z", line = 66)
	public static boolean method1094(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLclient!o;Lclient!o;I)V", line = 100)
	public static void method1095(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class40 arg1, @OriginalArg(2) Class40 arg2) {
		@Pc(5) short local5 = 151;
		@Pc(6) int local6 = local5 - 3;
		if (Class1.aBoolean1) {
			Class1.aBoolean1 = false;
			Static39.method768(Static23.aGraphics1);
			Static4.method83(Static23.aGraphics1);
			Static67.method1207(Static23.aGraphics1);
			Static30.method594(Static23.aGraphics1);
			Static99.method1664(Class63.anInt2515, Static23.aGraphics1, Static95.aClass2_Sub2_Sub2_Sub2_5, Class62.anInt2491, Class2_Sub2_Sub4.anInt583);
			Static85.method1487(Class35.anInt1551, Class3.anIntArray2, -1, Class37.anInt1654 == -1, Static23.aGraphics1);
			Class6.aBoolean23 = true;
			Class45_Sub1.aBoolean165 = true;
			Class2_Sub2_Sub1.aBoolean13 = true;
		}
		Static69.method1230();
		Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg2, 257, 148, 0);
		Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg2, 256, 147, 16777215);
		if (arg1 != null) {
			local6 += 15;
			if (arg0) {
				@Pc(81) int local81 = Static95.aClass2_Sub2_Sub2_Sub2_5.method568(arg1) + 4;
				Static25.method1612(257 - local81 / 2, 152, local81, 11, 0);
			}
			Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg1, 257, 163, 0);
			Static95.aClass2_Sub2_Sub2_Sub2_5.method566(arg1, 256, 162, 16777215);
		}
		Static72.method1333(Static23.aGraphics1);
	}
}
