import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "J")
	private static long aLong186;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "J")
	private static long aLong187;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)J")
	public static synchronized long method4783() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong186 > local1) {
			aLong187 += aLong186 - local1;
		}
		aLong186 = local1;
		return aLong187 + local1;
	}
}
