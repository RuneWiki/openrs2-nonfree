import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!lt", name = "i", descriptor = "J")
	public static long aLong163 = 0L;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Z)V")
	public static void method5283() {
		@Pc(7) int local7 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static251.anInt4680; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static406.anInt6924; local18++) {
				if (Static32.method1022(local14, local7, local18, true, Static332.aClass247ArrayArrayArray1)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
