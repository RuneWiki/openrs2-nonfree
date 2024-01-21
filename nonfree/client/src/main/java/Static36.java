import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!gd", name = "n", descriptor = "Lclient!rd;")
	public static Class64 aClass64_30;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "[I")
	public static int[] anIntArray100;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt1039 = 0;

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "[I")
	public static int[] anIntArray99 = new int[5];

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!ad;")
	private static Class4 aClass4_525 = Static75.method1216("RuneScape has been updated(Q");

	@OriginalMember(owner = "client!gd", name = "k", descriptor = "[Lclient!hc;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array1 = new Class3_Sub1_Sub1_Sub4[4];

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_526 = Static75.method1216("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_527 = aClass4_525;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "[J")
	public static long[] aLongArray11 = new long[100];

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!ad;")
	private static Class4 aClass4_529 = Static75.method1216("Continue");

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_528 = aClass4_529;

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "[I")
	public static int[] anIntArray101 = new int[200];

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "I")
	public static int anInt1044 = 2;

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)V")
	public static void method712() {
		for (@Pc(10) Class3_Sub8 local10 = (Class3_Sub8) Static7.aClass20_1.method308(); local10 != null; local10 = (Class3_Sub8) Static7.aClass20_1.method309()) {
			if (local10.aClass3_Sub3_Sub1_1 != null) {
				Static52.aClass3_Sub3_Sub2_1.method1057(local10.aClass3_Sub3_Sub1_1);
				local10.aClass3_Sub3_Sub1_1 = null;
			}
			if (local10.aClass3_Sub3_Sub1_2 != null) {
				Static52.aClass3_Sub3_Sub2_1.method1057(local10.aClass3_Sub3_Sub1_2);
				local10.aClass3_Sub3_Sub1_2 = null;
			}
		}
		Static7.aClass20_1.method310();
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	public static void method718() {
		anIntArray99 = null;
		aClass4_529 = null;
		aClass64_30 = null;
		aClass4_528 = null;
		aClass4_527 = null;
		aLongArray11 = null;
		anIntArray101 = null;
		aClass4_526 = null;
		aClass3_Sub1_Sub1_Sub4Array1 = null;
		anIntArray100 = null;
		aClass4_525 = null;
	}
}
