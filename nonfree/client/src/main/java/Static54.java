import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static54 {

	@OriginalMember(owner = "client!cba", name = "m", descriptor = "F")
	public static float aFloat20;

	@OriginalMember(owner = "client!cba", name = "j", descriptor = "S")
	public static short aShort19 = 1;

	@OriginalMember(owner = "client!cba", name = "k", descriptor = "[I")
	public static final int[] anIntArray81 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!cba", name = "a", descriptor = "(III)Z")
	public static boolean method978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x400) != 0;
	}
}
