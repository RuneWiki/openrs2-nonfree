import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static158 {

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "J")
	private static long aLong84;

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "J")
	private static long aLong85;

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)J")
	public static synchronized long method2342() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong84) {
			aLong85 += aLong84 - local1;
		}
		aLong84 = local1;
		return aLong85 + local1;
	}
}
