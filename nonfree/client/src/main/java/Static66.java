import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!me", name = "f", descriptor = "Z")
	public static boolean aBoolean126;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] aClass3_Sub1_Sub4_Sub2Array9;

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Lclient!gb;")
	public static Class3_Sub4 aClass3_Sub4_4;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray25;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "Lclient!rd;")
	public static Class64 aClass64_48;

	@OriginalMember(owner = "client!me", name = "b", descriptor = "Lclient!ad;")
	private static Class4 aClass4_836 = Static75.method1216("Login");

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!ad;")
	private static Class4 aClass4_839 = Static75.method1216("Existing user");

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!ad;")
	public static Class4 aClass4_837 = aClass4_839;

	@OriginalMember(owner = "client!me", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_838 = aClass4_836;

	@OriginalMember(owner = "client!me", name = "p", descriptor = "I")
	public static int anInt1634 = 0;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V")
	public static void method1100() {
		aClass4_838 = null;
		aClass3_Sub4_4 = null;
		aClass4_839 = null;
		aClass4_836 = null;
		aClass3_Sub1_Sub4_Sub2Array9 = null;
		aClass4_837 = null;
		aClass64_48 = null;
		aByteArrayArrayArray25 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IB)V")
	public static void method1101(@OriginalArg(0) int arg0) {
		Static28.method590(arg0);
	}
}
