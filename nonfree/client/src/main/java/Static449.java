import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "J")
	private static long aLong230;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "J")
	private static long aLong231;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z)J")
	public static synchronized long method6552() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (local1 < aLong230) {
			aLong231 += aLong230 - local1;
		}
		aLong230 = local1;
		return local1 + aLong231;
	}
}
