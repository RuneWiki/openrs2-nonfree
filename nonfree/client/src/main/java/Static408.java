import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!om", name = "c", descriptor = "Lclient!nl;")
	public static Class3_Sub7_Sub5 aClass3_Sub7_Sub5_3;

	@OriginalMember(owner = "client!om", name = "n", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "I")
	public static int anInt7671 = 0;

	@OriginalMember(owner = "client!om", name = "i", descriptor = "I")
	public static int anInt7676 = 0;

	@OriginalMember(owner = "client!om", name = "k", descriptor = "I")
	public static int anInt7678 = -1;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Lclient!ga;I)Z")
	public static boolean method6433(@OriginalArg(0) Class107 arg0) {
		return Static200.aClass107_4 == arg0 || Static619.aClass107_6 == arg0 || Static559.aClass107_5 == arg0 || Static85.aClass107_1 == arg0;
	}

	@OriginalMember(owner = "client!om", name = "b", descriptor = "(ZI)Z")
	public static boolean method6434(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z")
	public static boolean method6435(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 4;
	}
}
