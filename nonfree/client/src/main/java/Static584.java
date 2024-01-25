import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)V")
	public static void method8336() {
		@Pc(7) int local7 = Static209.anInt3954;
		@Pc(9) int[] local9 = Static457.anIntArray607;
		for (@Pc(15) int local15 = 0; local15 < local7; local15++) {
			@Pc(23) Class12_Sub2_Sub2_Sub1_Sub2 local23 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local9[local15]];
			if (local23 != null) {
				Static539.method7650(local23.method2422(), local23);
			}
		}
	}
}
