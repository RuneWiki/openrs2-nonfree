import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "J")
	private static long aLong86;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "J")
	private static long aLong87;

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)J")
	public static synchronized long method1934() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong87) {
			aLong86 += aLong87 - local7;
		}
		aLong87 = local7;
		return local7 + aLong86;
	}
}
