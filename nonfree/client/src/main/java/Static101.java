import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "J")
	private static long aLong55;

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "J")
	private static long aLong56;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)J")
	public static synchronized long method1805() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong55 > local1) {
			aLong56 += aLong55 - local1;
		}
		aLong55 = local1;
		return local1 + aLong56;
	}
}
