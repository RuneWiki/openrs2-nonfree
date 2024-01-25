import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "J")
	private static long aLong92;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "J")
	private static long aLong93;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)J")
	public static synchronized long method2672() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (aLong92 > local7) {
			aLong93 += aLong92 - local7;
		}
		aLong92 = local7;
		return local7 + aLong93;
	}
}
