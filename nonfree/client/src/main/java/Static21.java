import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
	private static long aLong24;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
	private static long aLong25;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
	public static synchronized long method458() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong24 > local1) {
			aLong25 += aLong24 - local1;
		}
		aLong24 = local1;
		return aLong25 + local1;
	}
}
