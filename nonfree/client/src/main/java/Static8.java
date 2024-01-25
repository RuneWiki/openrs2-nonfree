import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static8 {

	@OriginalMember(owner = "client!ada", name = "j", descriptor = "[I")
	public static int[] anIntArray14;

	@OriginalMember(owner = "client!ada", name = "a", descriptor = "(III)Z")
	public static boolean method111(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x10000) != 0;
	}
}
