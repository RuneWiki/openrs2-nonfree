import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static134 {

	@OriginalMember(owner = "client!we", name = "J", descriptor = "I")
	public static int anInt2949;

	@OriginalMember(owner = "client!we", name = "s", descriptor = "B")
	public static byte aByte8 = 0;

	@OriginalMember(owner = "client!we", name = "x", descriptor = "I")
	public static int anInt2942 = 0;

	@OriginalMember(owner = "client!we", name = "B", descriptor = "[I")
	public static int[] anIntArray417 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1273 = Static119.method1462("Sorry invited players only)3");

	@OriginalMember(owner = "client!we", name = "E", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!we", name = "F", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1274 = Static119.method1462("Standort");

	@OriginalMember(owner = "client!we", name = "H", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1275 = Static119.method1462("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!we", name = "K", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1276 = aClass65_1273;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V")
	public static void method2048() {
		aClass65_1275 = null;
		aClass65_1273 = null;
		anIntArray417 = null;
		aClass65_1274 = null;
		aClass65_1276 = null;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(Lclient!na;Lclient!na;Lclient!na;I)V")
	public static void method2049(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2) {
		Static113.aClass56_34 = arg1;
		Static99.aClass56_32 = arg0;
		Static17.aClass56_8 = arg2;
	}

	@OriginalMember(owner = "client!we", name = "c", descriptor = "(B)V")
	public static void method2050() {
		if (!Static60.aBoolean18) {
			return;
		}
		Static62.aClass2_Sub1_Sub4_Sub1_3 = null;
		Static44.anIntArray126 = null;
		Static12.anIntArray30 = null;
		Static122.aClass2_Sub1_Sub4_Sub2Array10 = null;
		Static1.aClass2_Sub1_Sub4_Sub2_1 = null;
		Static23.aClass2_Sub1_Sub4_Sub2Array6 = null;
		Static11.anIntArray162 = null;
		Static126.aClass2_Sub1_Sub4_Sub2_40 = null;
		Static22.anIntArray48 = null;
		Static112.aClass2_Sub1_Sub4_Sub2Array9 = null;
		Static98.anIntArray291 = null;
		Static115.aClass2_Sub1_Sub4_Sub1Array12 = null;
		Static38.aClass2_Sub1_Sub4_Sub2Array2 = null;
		Static36.aClass2_Sub1_Sub4_Sub2_15 = null;
		Static41.anIntArray118 = null;
		Static21.anIntArray44 = null;
		Static4.anIntArray157 = null;
		Static104.aClass2_Sub1_Sub4_Sub2_45 = null;
		Static83.aClass2_Sub1_Sub4_Sub2Array7 = null;
		Static78.aClass2_Sub1_Sub4_Sub1_4 = null;
		Static63.method1132();
		Static102.method1662(true);
		Static60.aBoolean18 = false;
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IBILclient!na;)[Lclient!e;")
	public static Class2_Sub1_Sub4_Sub1[] method2051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class56 arg2) {
		return Static10.method2052(arg2, arg0, arg1) ? Static106.method1717() : null;
	}
}
