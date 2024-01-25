import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "J")
	private static long aLong216;

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "J")
	private static long aLong217;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)J")
	public static synchronized long method5308() {
		@Pc(6) long local6 = System.currentTimeMillis();
		if (local6 < aLong216) {
			aLong217 += aLong216 - local6;
		}
		aLong216 = local6;
		return local6 + aLong217;
	}
}
