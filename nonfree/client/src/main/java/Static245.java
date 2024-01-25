import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "J")
	private static long aLong148;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "J")
	private static long aLong149;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)J")
	public static synchronized long method4300() {
		@Pc(1) long local1 = System.currentTimeMillis();
		if (aLong148 > local1) {
			aLong149 += aLong148 - local1;
		}
		aLong148 = local1;
		return local1 + aLong149;
	}
}
