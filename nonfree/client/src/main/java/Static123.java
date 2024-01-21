import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static123 {

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
	public static int anInt3344;

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] aClass1_Sub1_Sub1_Sub3Array9;

	@OriginalMember(owner = "client!oc", name = "l", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1131 = Static49.method1293("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1127 = aClass70_1131;

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
	public static int anInt3341 = 0;

	@OriginalMember(owner = "client!oc", name = "d", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1128 = Static49.method1293("Unexpected server response)3");

	@OriginalMember(owner = "client!oc", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1129 = Static49.method1293(":duelstake:");

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
	public static int anInt3345 = 0;

	@OriginalMember(owner = "client!oc", name = "i", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1130 = aClass70_1128;

	@OriginalMember(owner = "client!oc", name = "k", descriptor = "[I")
	public static int[] anIntArray323 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

	@OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
	public static int anInt3348 = 0;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public static int anInt3349 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB[I)I")
	public static int method2499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		return arg2[0] * arg1 + arg2[1] * arg0;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
	public static void method2500() {
		aClass70_1130 = null;
		anIntArray323 = null;
		aClass70_1128 = null;
		aClass1_Sub1_Sub1_Sub3Array9 = null;
		aClass70_1127 = null;
		aClass70_1131 = null;
		aClass70_1129 = null;
	}
}
