import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "J")
	private static long aLong97;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "J")
	private static long aLong98;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)J")
	public static synchronized long method2163() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong97 > local1) {
			aLong98 += aLong97 - local1;
		}
		aLong97 = local1;
		return aLong98 + local1;
	}
}
