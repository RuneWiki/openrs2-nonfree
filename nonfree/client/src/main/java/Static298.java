import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "J")
	private static long aLong198;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "J")
	private static long aLong199;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)J")
	public static synchronized long method4535() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong198) {
			aLong199 += aLong198 - local1;
		}
		aLong198 = local1;
		return aLong199 + local1;
	}
}
