import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "J")
	private static long aLong48;

	@OriginalMember(owner = "client!cr", name = "b", descriptor = "J")
	private static long aLong49;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(B)J")
	public static synchronized long method898() {
		@Pc(9) long local9 = System.currentTimeMillis();
		if (aLong48 > local9) {
			aLong49 += aLong48 - local9;
		}
		aLong48 = local9;
		return aLong49 + local9;
	}
}
