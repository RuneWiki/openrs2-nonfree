import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "J")
	private static long aLong27;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "J")
	private static long aLong28;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)J")
	public static synchronized long method1197() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong27 > local7) {
			aLong28 += aLong27 - local7;
		}
		aLong27 = local7;
		return aLong28 + local7;
	}
}
