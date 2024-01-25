import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!so", name = "o", descriptor = "F")
	public static float aFloat97;

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(III)Z")
	public static boolean method5208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
