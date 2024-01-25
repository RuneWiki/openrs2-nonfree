import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ht", name = "F", descriptor = "[Lclient!lo;")
	public static Class6_Sub1[] aClass6_Sub1Array1;

	@OriginalMember(owner = "client!ht", name = "z", descriptor = "Z")
	public static boolean aBoolean326 = false;

	@OriginalMember(owner = "client!ht", name = "f", descriptor = "(I)V")
	public static void method3343() {
		Static267.aClass313_28.method6977();
	}

	@OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)V")
	public static void method3345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class346 local28 = Static389.aClass346ArrayArrayArray2[local9][arg0][arg1] = Static389.aClass346ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class153 local33 = local28.aClass153_3; local33 != null; local33 = local33.aClass153_1) {
					@Pc(37) Class6_Sub1_Sub1 local37 = local33.aClass6_Sub1_Sub1_1;
					if (local37.aShort85 == arg0 && local37.aShort83 == arg1) {
						local37.aByte112--;
					}
				}
				if (local28.aClass6_Sub1_Sub2_1 != null) {
					local28.aClass6_Sub1_Sub2_1.aByte112--;
				}
				if (local28.aClass6_Sub1_Sub3_2 != null) {
					local28.aClass6_Sub1_Sub3_2.aByte112--;
				}
				if (local28.aClass6_Sub1_Sub3_1 != null) {
					local28.aClass6_Sub1_Sub3_1.aByte112--;
				}
				if (local28.aClass6_Sub1_Sub5_1 != null) {
					local28.aClass6_Sub1_Sub5_1.aByte112--;
				}
				if (local28.aClass6_Sub1_Sub5_2 != null) {
					local28.aClass6_Sub1_Sub5_2.aByte112--;
				}
			}
		}
		if (Static389.aClass346ArrayArrayArray2[0][arg0][arg1] == null) {
			Static389.aClass346ArrayArrayArray2[0][arg0][arg1] = new Class346(0);
			Static389.aClass346ArrayArrayArray2[0][arg0][arg1].aByte121 = 1;
		}
		Static389.aClass346ArrayArrayArray2[0][arg0][arg1].aClass346_1 = local7;
		Static389.aClass346ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
