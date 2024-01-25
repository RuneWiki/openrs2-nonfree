import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static38 {

	@OriginalMember(owner = "client!bf", name = "C", descriptor = "[I")
	public static int[] anIntArray32 = new int[1];

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(CI)Z")
	public static boolean method1294(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
