import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "J")
	private static long aLong52;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "J")
	private static long aLong53;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)J")
	public static synchronized long method1150() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong53 > local1) {
			aLong52 += aLong53 - local1;
		}
		aLong53 = local1;
		return local1 + aLong52;
	}
}
