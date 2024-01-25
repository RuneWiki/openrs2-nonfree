import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "J")
	private static long aLong76;

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "J")
	private static long aLong77;

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)J")
	public static synchronized long method2132() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong76 > local6) {
			aLong77 += aLong76 - local6;
		}
		aLong76 = local6;
		return aLong77 + local6;
	}
}
