import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static218 {

	@OriginalMember(owner = "client!j", name = "a", descriptor = "I")
	public static int anInt7241;

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)Z")
	public static boolean method6061(@OriginalArg(0) int arg0) {
		return arg0 == 6 || arg0 == 8;
	}
}
