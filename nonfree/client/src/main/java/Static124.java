import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static124 {

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "I")
	public static int anInt2150 = 104;

	@OriginalMember(owner = "client!eda", name = "b", descriptor = "I")
	public static int anInt2151 = 0;

	@OriginalMember(owner = "client!eda", name = "d", descriptor = "I")
	public static int anInt2153 = 0;

	@OriginalMember(owner = "client!eda", name = "a", descriptor = "(I)J")
	public static synchronized long method1947() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (Static38.aLong326 > local10) {
			Static488.aLong260 += Static38.aLong326 - local10;
		}
		Static38.aLong326 = local10;
		return local10 + Static488.aLong260;
	}
}
