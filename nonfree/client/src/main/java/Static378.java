import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "I")
	public static int anInt9225 = 0;

	@OriginalMember(owner = "client!mo", name = "d", descriptor = "Z")
	public static boolean aBoolean643 = false;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method7517(@OriginalArg(0) String arg0) {
		@Pc(16) int local16 = arg0.length();
		@Pc(18) int local18 = 0;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			local18 = (local18 << 5) + Static225.method3318(arg0.charAt(local20)) - local18;
		}
		return local18;
	}
}
