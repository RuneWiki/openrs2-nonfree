import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BLjava/lang/String;)I")
	public static int method4559(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(16) int local16 = 0; local16 < Static574.anInt9426; local16++) {
			if (arg0.equalsIgnoreCase(Static398.aStringArray29[local16])) {
				return local16;
			}
		}
		return -1;
	}
}
