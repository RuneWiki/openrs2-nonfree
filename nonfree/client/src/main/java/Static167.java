import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static167 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILclient!hu;I)I")
	public static int method2479(@OriginalArg(1) Class114 arg0) {
		return -1;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(CI)Z")
	public static boolean method2480(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
