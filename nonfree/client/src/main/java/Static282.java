import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "J")
	private static long aLong172;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "J")
	private static long aLong173;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)J")
	public static synchronized long method3962() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong173 > local1) {
			aLong172 += aLong173 - local1;
		}
		aLong173 = local1;
		return aLong172 + local1;
	}
}
