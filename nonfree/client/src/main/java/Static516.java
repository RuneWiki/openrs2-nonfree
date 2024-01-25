import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static516 {

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IBI)Z")
	public static boolean method7401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static629.method8467(arg0, arg1) || Static416.method6524(arg0, arg1);
	}
}
