import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "J")
	private static long aLong111;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "J")
	private static long aLong112;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(B)J")
	public static synchronized long method2674() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong112) {
			aLong111 += aLong112 - local1;
		}
		aLong112 = local1;
		return local1 + aLong111;
	}
}
