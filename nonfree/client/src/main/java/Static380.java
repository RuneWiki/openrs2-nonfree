import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static380 {

	@OriginalMember(owner = "client!te", name = "p", descriptor = "Z")
	public static boolean aBoolean463 = false;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)Z")
	public static boolean method5241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x70000) != 0 | Static12.method401(arg0, arg1) || Static247.method3788(arg0, arg1);
	}
}
