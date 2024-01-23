import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static282 {

	@OriginalMember(owner = "client!ug", name = "k", descriptor = "[I")
	public static int[] anIntArray530;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public static int anInt5573;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "[Lclient!hg;")
	public static Class71[] aClass71Array1;

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "Lclient!fh;")
	public static Class50 aClass50_1 = new Class50();

	@OriginalMember(owner = "client!ug", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString198 = "You can't add yourself to your own ignore list.";

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)I")
	public static int method4398(@OriginalArg(0) int arg0) {
		if (arg0 <= 0) {
			return arg0 < 0 ? -1 : 0;
		} else {
			return 1;
		}
	}
}
