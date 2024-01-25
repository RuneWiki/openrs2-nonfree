import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
	public static void method4800() {
		for (@Pc(3) int local3 = 0; local3 < Static451.anInt4553; local3++) {
			@Pc(9) int local9 = Static11.anIntArray16[local3];
			@Pc(16) Class12_Sub41 local16 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local9);
			if (local16 != null) {
				@Pc(21) Class30_Sub1_Sub1_Sub2 local21 = local16.aClass30_Sub1_Sub1_Sub2_2;
				Static470.method7081(local21, local21.aClass130_1.anInt4113);
			}
		}
	}
}
