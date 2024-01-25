import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qk", name = "F", descriptor = "I")
	public static int anInt5318;

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
	public static int anInt5322 = 0;

	@OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V")
	public static void method4327() {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < Static337.anInt5497; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static282.anInt4644; local13++) {
				if (Static384.method5092(Static432.aClass75ArrayArrayArray6, true, local9, local13, local7)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}
}
