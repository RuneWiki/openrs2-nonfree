import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static119 {

	@OriginalMember(owner = "client!p", name = "u", descriptor = "B")
	public static byte aByte7;

	@OriginalMember(owner = "client!p", name = "y", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array4;

	@OriginalMember(owner = "client!p", name = "A", descriptor = "I")
	public static int anInt2824;

	@OriginalMember(owner = "client!p", name = "n", descriptor = "Lclient!kb;")
	private static Class46 aClass46_972 = Static65.method1172("You can(Wt add yourself to your own ignore list)3");

	@OriginalMember(owner = "client!p", name = "r", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5 = new byte[4][104][104];

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!kb;")
	public static Class46 aClass46_973 = Static65.method1172(" <col=ffff00>");

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!kb;")
	public static Class46 aClass46_975 = aClass46_972;

	@OriginalMember(owner = "client!p", name = "x", descriptor = "I")
	public static int anInt2823 = -1;

	@OriginalMember(owner = "client!p", name = "z", descriptor = "[I")
	public static int[] anIntArray326 = new int[100];

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public static void method2035() {
		if (Static135.anInt3150 > 0) {
			Static106.method1735();
		} else {
			Static180.method2893(40);
			Static127.aClass1_2 = Static129.aClass1_3;
			Static129.aClass1_3 = null;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIZI)V")
	public static void method2036(@OriginalArg(2) boolean arg0) {
		Static8.anInt275 = 2;
		Static3.aBoolean5 = arg0;
		Static149.anInt3584 = 22050;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V")
	public static void method2037() {
		anIntArray326 = null;
		aClass3_Sub2_Sub3_Sub2Array4 = null;
		aClass46_975 = null;
		aByteArrayArrayArray5 = null;
		aClass46_972 = null;
		aClass46_973 = null;
	}
}
