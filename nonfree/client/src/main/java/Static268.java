import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static268 {

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "F")
	public static float aFloat168;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(IBI)Z")
	public static boolean method4692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100) != 0;
	}
}
