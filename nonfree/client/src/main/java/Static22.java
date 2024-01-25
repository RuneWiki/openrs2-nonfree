import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "J")
	private static long aLong20;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
	private static long aLong21;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
	public static synchronized long method285() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong20) {
			aLong21 += aLong20 - local1;
		}
		aLong20 = local1;
		return local1 + aLong21;
	}
}
