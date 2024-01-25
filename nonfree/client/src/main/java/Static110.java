import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!em", name = "a", descriptor = "J")
	private static long aLong62;

	@OriginalMember(owner = "client!em", name = "b", descriptor = "J")
	private static long aLong63;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)J")
	public static synchronized long method2222() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong63 > local7) {
			aLong62 += aLong63 - local7;
		}
		aLong63 = local7;
		return local7 + aLong62;
	}
}
