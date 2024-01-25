import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static562 {

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "[I")
	public static int[] anIntArray563;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Z")
	public static boolean method7679(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}
}
