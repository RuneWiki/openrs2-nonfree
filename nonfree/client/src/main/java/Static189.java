import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static189 {

	@OriginalMember(owner = "client!hj", name = "e", descriptor = "B")
	public static byte aByte35;

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_81 = new Class73(0, 8);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(Z)Z")
	public static boolean method3422() {
		return Static171.anInt3648 == 0 ? Static587.aClass6_Sub18_Sub2_3.method3312() : true;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)Z")
	public static boolean method3423(@OriginalArg(1) int arg0) {
		return arg0 == 3 || arg0 == 7 || arg0 == 10;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)I")
	public static int method3424() {
		return Static329.method5151(false);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Z")
	public static boolean method3425(@OriginalArg(1) int arg0) {
		if (arg0 == 21 || arg0 == 16 || arg0 == 49 || arg0 == 12 || arg0 == 18) {
			return true;
		} else {
			return arg0 == 46 || arg0 == 1009;
		}
	}
}
