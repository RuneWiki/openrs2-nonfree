import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public static int anInt7120;

	@OriginalMember(owner = "client!pl", name = "E", descriptor = "[[I")
	public static final int[][] anIntArrayArray45 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(Z)Z")
	public static boolean method5983() {
		@Pc(7) Class2 local7 = Static375.aClass8_38.aClass2_9.aClass2_285;
		if (local7 == null || local7 == Static375.aClass8_38.aClass2_9) {
			return false;
		}
		@Pc(23) Class2_Sub5 local23 = (Class2_Sub5) local7;
		if (local23.anInt902 >= 2000) {
			local23.anInt902 -= 2000;
		}
		return local23.anInt902 == 1011;
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(I)V")
	public static void method5994() {
		@Pc(7) int local7 = Static376.anInt6647;
		@Pc(9) int[] local9 = Static557.anIntArray665;
		for (@Pc(11) int local11 = 0; local11 < local7; local11++) {
			@Pc(19) Class6_Sub1_Sub1_Sub1_Sub2 local19 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local9[local11]];
			if (local19 != null) {
				Static562.method7639(local19, local19.method6165());
			}
		}
	}
}
