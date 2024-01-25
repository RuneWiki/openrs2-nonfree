import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "J")
	private static long aLong18;

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "J")
	private static long aLong19;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)J")
	public static synchronized long method359() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (aLong19 > local6) {
			aLong18 += aLong19 - local6;
		}
		aLong19 = local6;
		return local6 + aLong18;
	}
}
