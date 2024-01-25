import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static472 {

	@OriginalMember(owner = "client!so", name = "c", descriptor = "I")
	public static int anInt6156;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Z")
	public static boolean method5255(@OriginalArg(1) int arg0) {
		if (arg0 == 3 || arg0 == 45 || arg0 == 58 || arg0 == 5 || arg0 == 1011) {
			return true;
		} else {
			return arg0 == 30 || arg0 == 1009;
		}
	}
}
