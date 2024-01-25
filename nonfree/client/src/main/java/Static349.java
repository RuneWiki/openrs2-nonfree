import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "J")
	private static long aLong211;

	@OriginalMember(owner = "client!wj", name = "b", descriptor = "J")
	private static long aLong212;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)J")
	public static synchronized long method5647() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong211) {
			aLong212 += aLong211 - local1;
		}
		aLong211 = local1;
		return local1 + aLong212;
	}
}
