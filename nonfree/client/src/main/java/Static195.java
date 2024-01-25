import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static195 {

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "Z")
	public static boolean aBoolean332 = false;

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(II)V")
	public static void method3645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class56 local28 = Static405.aClass56ArrayArrayArray2[local9][arg0][arg1] = Static405.aClass56ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class152 local33 = local28.aClass152_2; local33 != null; local33 = local33.aClass152_3) {
					@Pc(37) Class15_Sub1_Sub2 local37 = local33.aClass15_Sub1_Sub2_1;
					if (local37.aShort105 == arg0 && local37.aShort103 == arg1) {
						local37.aByte124--;
					}
				}
				if (local28.aClass15_Sub1_Sub3_1 != null) {
					local28.aClass15_Sub1_Sub3_1.aByte124--;
				}
				if (local28.aClass15_Sub1_Sub4_2 != null) {
					local28.aClass15_Sub1_Sub4_2.aByte124--;
				}
				if (local28.aClass15_Sub1_Sub4_1 != null) {
					local28.aClass15_Sub1_Sub4_1.aByte124--;
				}
				if (local28.aClass15_Sub1_Sub5_1 != null) {
					local28.aClass15_Sub1_Sub5_1.aByte124--;
				}
				if (local28.aClass15_Sub1_Sub5_2 != null) {
					local28.aClass15_Sub1_Sub5_2.aByte124--;
				}
			}
		}
		if (Static405.aClass56ArrayArrayArray2[0][arg0][arg1] == null) {
			Static405.aClass56ArrayArrayArray2[0][arg0][arg1] = new Class56(0);
			Static405.aClass56ArrayArrayArray2[0][arg0][arg1].aByte22 = 1;
		}
		Static405.aClass56ArrayArrayArray2[0][arg0][arg1].aClass56_1 = local7;
		Static405.aClass56ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
