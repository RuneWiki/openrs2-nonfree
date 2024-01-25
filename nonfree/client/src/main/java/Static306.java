import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static306 {

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "F")
	public static float aFloat115;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(II)V")
	public static void method5183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class97 local7 = Static272.aClass97ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class97 local28 = Static272.aClass97ArrayArrayArray3[local9][arg0][arg1] = Static272.aClass97ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class196 local33 = local28.aClass196_2; local33 != null; local33 = local33.aClass196_3) {
					@Pc(37) Class20_Sub2_Sub2 local37 = local33.aClass20_Sub2_Sub2_1;
					if (local37.aShort124 == arg0 && local37.aShort123 == arg1) {
						local37.aByte131--;
					}
				}
				if (local28.aClass20_Sub2_Sub5_1 != null) {
					local28.aClass20_Sub2_Sub5_1.aByte131--;
				}
				if (local28.aClass20_Sub2_Sub1_1 != null) {
					local28.aClass20_Sub2_Sub1_1.aByte131--;
				}
				if (local28.aClass20_Sub2_Sub1_2 != null) {
					local28.aClass20_Sub2_Sub1_2.aByte131--;
				}
				if (local28.aClass20_Sub2_Sub3_2 != null) {
					local28.aClass20_Sub2_Sub3_2.aByte131--;
				}
				if (local28.aClass20_Sub2_Sub3_1 != null) {
					local28.aClass20_Sub2_Sub3_1.aByte131--;
				}
			}
		}
		if (Static272.aClass97ArrayArrayArray3[0][arg0][arg1] == null) {
			Static272.aClass97ArrayArrayArray3[0][arg0][arg1] = new Class97(0);
			Static272.aClass97ArrayArrayArray3[0][arg0][arg1].aByte52 = 1;
		}
		Static272.aClass97ArrayArrayArray3[0][arg0][arg1].aClass97_1 = local7;
		Static272.aClass97ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
