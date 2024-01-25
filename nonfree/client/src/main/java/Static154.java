import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "J")
	private static long aLong90;

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "J")
	private static long aLong91;

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(B)J")
	public static synchronized long method2527() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong91 > local1) {
			aLong90 += aLong91 - local1;
		}
		aLong91 = local1;
		return local1 + aLong90;
	}
}
