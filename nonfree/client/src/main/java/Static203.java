import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static203 {

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "[I")
	public static final int[] anIntArray323 = new int[] { 1, 4 };

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	public static int anInt4155 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IC)Z")
	public static boolean method3644(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
