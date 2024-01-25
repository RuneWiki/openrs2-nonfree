import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static439 {

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "[J")
	public static long[] aLongArray11;

	@OriginalMember(owner = "client!pu", name = "h", descriptor = "F")
	public static float aFloat179;

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "Lclient!of;")
	public static final Class236 aClass236_76 = new Class236(4);

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_111 = new Class71(9, -2);

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(II)Z")
	public static boolean method6796(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6797(@OriginalArg(1) String arg0) {
		System.exit(1);
	}
}
