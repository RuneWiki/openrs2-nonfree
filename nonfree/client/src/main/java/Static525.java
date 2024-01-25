import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static525 {

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(III)Z")
	public static boolean method1314(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
