import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "J")
	private static long aLong15;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "J")
	private static long aLong16;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)J")
	public static synchronized long method126() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong16) {
			aLong15 += aLong16 - local1;
		}
		aLong16 = local1;
		return aLong15 + local1;
	}
}
