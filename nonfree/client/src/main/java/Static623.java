import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static623 {

	@OriginalMember(owner = "client!va", name = "b", descriptor = "[I")
	public static int[] anIntArray862;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "[I")
	public static int[] anIntArray861 = new int[1];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(III)Z")
	public static boolean method8759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(III)Z")
	public static boolean method8760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
