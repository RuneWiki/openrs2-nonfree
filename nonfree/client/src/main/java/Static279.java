import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "J")
	private static long aLong152;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "J")
	private static long aLong153;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)J")
	public static synchronized long method4058() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong153 > local6) {
			aLong152 += aLong153 - local6;
		}
		aLong153 = local6;
		return aLong152 + local6;
	}
}
