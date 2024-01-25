import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static470 {

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "(IZ)I")
	public static int method5107(@OriginalArg(1) boolean arg0) {
		@Pc(10) int local10 = Static453.anInt7627;
		if (local10 == 0) {
			return arg0 ? 0 : Static463.anInt7854;
		} else if (local10 == 1) {
			return Static463.anInt7854;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
