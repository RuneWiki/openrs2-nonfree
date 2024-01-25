import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static373 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
	public static boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static186.method3177(arg0, arg1) || Static384.method7165(arg0, arg1);
	}
}
