import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static286 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_172 = new Class186(85, 2);

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "Z")
	public static boolean aBoolean356 = false;

	@OriginalMember(owner = "client!oj", name = "j", descriptor = "I")
	public static int anInt5206 = -1;

	@OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
	public static int anInt5207 = -1;

	@OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
	public static int anInt5208 = 0;

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(II)Z")
	public static boolean method4000(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 51 || arg0 == 6 || arg0 == 25 || arg0 == 1007) {
			return true;
		} else {
			return arg0 == 4 || arg0 == 1006;
		}
	}
}
