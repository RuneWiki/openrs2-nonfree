import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "J")
	private static long aLong104;

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "J")
	private static long aLong105;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)J")
	public static synchronized long method2196() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong104) {
			aLong105 += aLong104 - local1;
		}
		aLong104 = local1;
		return aLong105 + local1;
	}
}
