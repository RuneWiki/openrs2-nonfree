import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static565 {

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "F")
	public static float aFloat207;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)Z")
	public static boolean method7805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static583.method7927(arg1, arg0) | (arg1 & 0x70000) != 0 || Static19.method253(arg1, arg0);
	}
}
