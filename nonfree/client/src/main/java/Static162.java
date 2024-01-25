import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "J")
	private static long aLong114;

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "J")
	private static long aLong115;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)J")
	public static synchronized long method3252() {
		@Pc(7) long local7 = System.currentTimeMillis();
		if (local7 < aLong114) {
			aLong115 += aLong114 - local7;
		}
		aLong114 = local7;
		return local7 + aLong115;
	}
}
