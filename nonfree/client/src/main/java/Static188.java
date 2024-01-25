import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static188 {

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "F")
	public static float aFloat70;

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(III)Z")
	public static boolean method2954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}
}
