import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static509 {

	@OriginalMember(owner = "client!s", name = "h", descriptor = "[I")
	public static int[] anIntArray482;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString99 = null;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(II)Z")
	public static boolean method7582(@OriginalArg(1) int arg0) {
		return arg0 >= 4 && arg0 <= 8;
	}
}
