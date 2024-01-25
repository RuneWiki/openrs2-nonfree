import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "J")
	private static long aLong110;

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "J")
	private static long aLong111;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)J")
	public static synchronized long method2929() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong111) {
			aLong110 += aLong111 - local1;
		}
		aLong111 = local1;
		return aLong110 + local1;
	}
}
