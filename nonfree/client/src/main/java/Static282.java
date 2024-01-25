import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lo", name = "C", descriptor = "[I")
	public static final int[] anIntArray398 = new int[5];

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
	public static void method4793() {
		@Pc(5) int local5 = Static412.anInt7191;
		@Pc(7) int[] local7 = Static349.anIntArray479;
		for (@Pc(9) int local9 = 0; local9 < local5; local9++) {
			@Pc(16) Class47_Sub2_Sub3_Sub2 local16 = Static473.aClass47_Sub2_Sub3_Sub2Array1[local7[local9]];
			if (local16 != null) {
				Static304.method5078(local16, local16.method4350());
			}
		}
	}
}
