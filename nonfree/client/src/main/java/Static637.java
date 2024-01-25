import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static637 {

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZB)I")
	public static int method8637(@OriginalArg(0) boolean arg0) {
		@Pc(11) int local11 = Static293.anInt5243;
		if (local11 == 0) {
			return arg0 ? 0 : Static292.anInt5232;
		} else if (local11 == 1) {
			return Static292.anInt5232;
		} else if (local11 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
