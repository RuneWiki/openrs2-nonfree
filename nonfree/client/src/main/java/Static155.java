import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static155 {

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z")
	public static boolean method2471(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
