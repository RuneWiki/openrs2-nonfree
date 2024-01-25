import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static536 {

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(BII)Z")
	public static boolean method7560(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
