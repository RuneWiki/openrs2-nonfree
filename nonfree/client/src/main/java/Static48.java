import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)V")
	public static void method1147() {
		@Pc(13) int[] local13 = new int[Static170.aClass370_1.anInt10161];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static170.aClass370_1.anInt10161; local17++) {
			@Pc(24) Class374 local24 = Static170.aClass370_1.method8900(local17);
			if (local24.anInt10313 >= 0 || local24.anInt10330 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static32.anIntArray50 = new int[local15];
		for (@Pc(55) int local55 = 0; local55 < local15; local55++) {
			Static32.anIntArray50[local55] = local13[local55];
		}
	}
}
