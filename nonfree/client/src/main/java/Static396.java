import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static396 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(III)Z")
	public static boolean method5371(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(II)Z")
	public static boolean method5372(@OriginalArg(0) int arg0) {
		if (arg0 == 3 || arg0 == 45 || arg0 == 48 || arg0 == 13 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 50 || arg0 == 1011;
		}
	}
}
