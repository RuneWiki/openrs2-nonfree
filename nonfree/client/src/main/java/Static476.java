import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static476 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)Z")
	public static boolean method7152(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BII)Z")
	public static boolean method7153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
