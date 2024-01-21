import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!b", name = "o", descriptor = "[Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3[] aClass2_Sub1_Sub4_Sub3Array4;

	@OriginalMember(owner = "client!b", name = "q", descriptor = "Lclient!va;")
	public static Class2_Sub11 aClass2_Sub11_1;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "Lclient!cd;")
	private static Class10 aClass10_131 = Static51.method932("Connecting to update server");

	@OriginalMember(owner = "client!b", name = "e", descriptor = "Lclient!cd;")
	private static Class10 aClass10_133 = Static51.method932("Please enter your password)3");

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Lclient!cd;")
	public static Class10 aClass10_132 = aClass10_133;

	@OriginalMember(owner = "client!b", name = "j", descriptor = "Lclient!cd;")
	private static Class10 aClass10_134 = Static51.method932("Loaded textures");

	@OriginalMember(owner = "client!b", name = "k", descriptor = "I")
	public static int anInt260 = 0;

	@OriginalMember(owner = "client!b", name = "l", descriptor = "[[B")
	public static byte[][] aByteArrayArray1 = new byte[250][];

	@OriginalMember(owner = "client!b", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_135 = Static51.method932(":trade:");

	@OriginalMember(owner = "client!b", name = "r", descriptor = "[[I")
	public static int[][] anIntArrayArray2 = new int[104][104];

	@OriginalMember(owner = "client!b", name = "s", descriptor = "Lclient!cd;")
	public static Class10 aClass10_136 = aClass10_134;

	@OriginalMember(owner = "client!b", name = "x", descriptor = "Lclient!cd;")
	public static Class10 aClass10_137 = aClass10_131;

	@OriginalMember(owner = "client!b", name = "y", descriptor = "Lclient!cf;")
	public static Class12 aClass12_1 = new Class12();

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
	public static void method168() {
		Static141.aClass2_Sub11_Sub1_3.method1495(83);
		for (@Pc(18) Class2_Sub15 local18 = (Class2_Sub15) Static30.aClass18_2.method687(); local18 != null; local18 = (Class2_Sub15) Static30.aClass18_2.method682()) {
			if (local18.anInt2382 == 0 || local18.anInt2382 == 3) {
				Static48.method890(local18, true);
			}
		}
		if (Static68.aClass23_6 != null) {
			Static3.method34(Static68.aClass23_6);
			Static68.aClass23_6 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)I")
	public static int method170() {
		@Pc(9) int local9 = Static178.method2702(Static104.anInt2384, Static107.anInt2447, Static56.anInt1432);
		return local9 - Static110.anInt2509 >= 800 || (Static50.aByteArrayArrayArray3[Static56.anInt1432][Static107.anInt2447 >> 7][Static104.anInt2384 >> 7] & 0x4) == 0 ? 3 : Static56.anInt1432;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Z")
	public static boolean method171(@OriginalArg(0) int arg0) {
		return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
	public static void method172() {
		aClass2_Sub1_Sub4_Sub3Array4 = null;
		aClass10_136 = null;
		aByteArrayArray1 = null;
		aClass10_137 = null;
		anIntArrayArray2 = null;
		aClass10_134 = null;
		aClass10_135 = null;
		aClass10_133 = null;
		aClass12_1 = null;
		aClass10_131 = null;
		aClass2_Sub11_1 = null;
		aClass10_132 = null;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Lclient!oe;")
	public static Class2_Sub1_Sub4_Sub3 method173() {
		@Pc(7) Class2_Sub1_Sub4_Sub3 local7 = new Class2_Sub1_Sub4_Sub3();
		local7.anInt2633 = Static171.anInt3704;
		local7.anInt2631 = Static96.anIntArray401[0];
		local7.anInt2635 = Static68.anIntArray178[0];
		local7.anInt2630 = Static14.anIntArray26[0];
		local7.anInt2632 = Static98.anIntArray240[0];
		local7.aByteArray34 = Static115.aByteArrayArray9[0];
		local7.anIntArray279 = Static118.anIntArray284;
		local7.anInt2634 = Static148.anInt3209;
		Static155.method2394();
		return local7;
	}
}
