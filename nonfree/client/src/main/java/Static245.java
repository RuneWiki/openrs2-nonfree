import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static245 {

	@OriginalMember(owner = "client!k", name = "m", descriptor = "I")
	public static int anInt4908;

	@OriginalMember(owner = "client!k", name = "r", descriptor = "Lclient!n;")
	public static Class213 aClass213_3;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public static int anInt4901 = -1;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(II)I")
	public static int method4243(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
