import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public static int anInt3631 = 1;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "[I")
	public static int[] anIntArray295 = new int[4];

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
	public static void method3206() {
		@Pc(7) int local7 = Static227.anInt3948;
		@Pc(9) int[] local9 = Static467.anIntArray632;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class14_Sub1_Sub1_Sub3_Sub1 local24 = Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local9[local16]];
			if (local24 != null && local24.anInt2957 > 0) {
				local24.anInt2957--;
				if (local24.anInt2957 == 0) {
					local24.aString50 = null;
				}
			}
		}
		for (@Pc(53) int local53 = 0; local53 < Static58.anInt926; local53++) {
			@Pc(60) long local60 = (long) Static191.anIntArray287[local53];
			@Pc(66) Class5_Sub13 local66 = (Class5_Sub13) Static51.aClass81_11.method1599(local60);
			if (local66 != null) {
				@Pc(71) Class14_Sub1_Sub1_Sub3_Sub2 local71 = local66.aClass14_Sub1_Sub1_Sub3_Sub2_1;
				if (local71.anInt2957 > 0) {
					local71.anInt2957--;
					if (local71.anInt2957 == 0) {
						local71.aString50 = null;
					}
				}
			}
		}
	}
}
