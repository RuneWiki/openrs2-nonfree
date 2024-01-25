import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static376 {

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
	public static int anInt6631;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "I")
	public static int anInt6634;

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt6628 = -60;

	@OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
	public static int anInt6636 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Z")
	public static boolean method5467(@OriginalArg(0) int arg0) {
		if (arg0 == 4 || arg0 == 21 || arg0 == 15 || arg0 == 45 || arg0 == 1003) {
			return true;
		} else {
			return arg0 == 18 || arg0 == 1011;
		}
	}
}
