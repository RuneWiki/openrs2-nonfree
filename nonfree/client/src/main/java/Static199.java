import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "J")
	private static long aLong97;

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "J")
	private static long aLong98;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)J")
	public static synchronized long method2845() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong98 > local6) {
			aLong97 += aLong98 - local6;
		}
		aLong98 = local6;
		return aLong97 + local6;
	}
}
