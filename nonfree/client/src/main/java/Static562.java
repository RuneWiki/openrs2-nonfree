import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "[I")
	public static final int[] anIntArray534 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
	public static final int[] anIntArray535 = new int[5];

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)Z")
	public static boolean method7836(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static390.method6237(arg1, arg0) || Static416.method6524(arg0, arg1);
	}
}
