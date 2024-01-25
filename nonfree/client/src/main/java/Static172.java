import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static172 {

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "[I")
	public static final int[] anIntArray261 = new int[32];

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZI)Z")
	public static boolean method3491(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static104.method6577(arg0, arg1) | (arg1 & 0x70000) != 0 || Static155.method6202(arg0, arg1);
	}
}
