import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!oj", name = "F", descriptor = "Lclient!mo;")
	public static Class143 aClass143_85;

	@OriginalMember(owner = "client!oj", name = "I", descriptor = "Lclient!jm;")
	public static Class107 aClass107_4;

	@OriginalMember(owner = "client!oj", name = "J", descriptor = "Ljava/lang/String;")
	public static final String aString170 = "shake:";

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(BIIIIII)V")
	public static void method4073(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static82.anInt2015 = arg2;
		Static254.anInt4871 = arg1;
		Static30.anInt715 = arg5;
		Static192.anInt3937 = arg3;
		Static117.anInt5258 = arg0;
		Static63.anInt1530 = arg4;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)I")
	public static int method4074(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static31.method762(arg0);
	}

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)Z")
	public static boolean method4075(@OriginalArg(0) int arg0) {
		if (arg0 == 45 || arg0 == 28 || arg0 == 58 || arg0 == 12 || arg0 == 8 || arg0 == 7 || arg0 == 43 || arg0 == 23) {
			return true;
		} else if (arg0 == 37 || arg0 == 29 || arg0 == 1003 || arg0 == 1004) {
			return true;
		} else if (arg0 == 17 || arg0 == 51 || arg0 == 31 || arg0 == 35 || arg0 == 15) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 46 || arg0 == 10 || arg0 == 20 || arg0 == 24 || arg0 == 25;
		}
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IB)V")
	public static void method4076(@OriginalArg(0) int arg0) {
		Static238.aClass11_102 = new Class11(arg0);
	}
}
