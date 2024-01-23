import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!oc", name = "p", descriptor = "[I")
	public static int[] anIntArray402;

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "Lclient!wf;")
	public static Class189 aClass189_10;

	@OriginalMember(owner = "client!oc", name = "bb", descriptor = "I")
	public static int anInt3731;

	@OriginalMember(owner = "client!oc", name = "z", descriptor = "Lclient!cc;")
	public static Class26 aClass26_39 = new Class26(5);

	@OriginalMember(owner = "client!oc", name = "B", descriptor = "I")
	public static int anInt3715 = 0;

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(BI)Z")
	public static boolean method3117(@OriginalArg(1) int arg0) {
		if (Static285.anInt5611 == arg0) {
			return false;
		}
		Static16.anIntArrayArray9 = new int[104][104];
		Static292.anIntArrayArray48 = new int[104][104];
		Static278.anIntArrayArrayArray15 = new int[4][13][13];
		Static10.anIntArrayArray2 = new int[104][104];
		for (@Pc(36) int local36 = 0; local36 < 4; local36++) {
			Static296.aClass30Array1[local36] = new Class30(104, 104);
		}
		Static174.aByteArrayArrayArray17 = new byte[4][104][104];
		Static9.aByteArrayArrayArray2 = new byte[4][104][104];
		Static139.aClass114ArrayArrayArray1 = new Class114[4][104][104];
		if (Static94.aBoolean138) {
			Static196.method3122();
			Static74.method1205();
			Static218.aClass191ArrayArray1 = new Class191[13][13];
		}
		Static285.anInt5611 = arg0;
		return true;
	}
}
