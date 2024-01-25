import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static642 {

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(I)V")
	public static void method8488() {
		@Pc(12) int local12 = Static72.anInt9084;
		@Pc(14) int[] local14 = Static388.anIntArray381;
		for (@Pc(16) int local16 = 0; local16 < local12; local16++) {
			@Pc(23) Class41_Sub1_Sub1_Sub3_Sub2 local23 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local14[local16]];
			if (local23 != null) {
				Static362.method5339(local23, local23.method7917());
			}
		}
	}

	@OriginalMember(owner = "client!vt", name = "a", descriptor = "(BC)Z")
	public static boolean method8489(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
