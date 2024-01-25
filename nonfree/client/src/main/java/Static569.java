import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!vp", name = "B", descriptor = "Lclient!fp;")
	public static Class113 aClass113_1;

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "(II)V")
	public static void method7427(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class228 local7 = Static469.aClass228ArrayArrayArray6[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class228 local28 = Static469.aClass228ArrayArrayArray6[local9][arg0][arg1] = Static469.aClass228ArrayArrayArray6[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class180 local33 = local28.aClass180_3; local33 != null; local33 = local33.aClass180_2) {
					@Pc(37) Class12_Sub2_Sub1 local37 = local33.aClass12_Sub2_Sub1_1;
					if (local37.aShort120 == arg0 && local37.aShort121 == arg1) {
						local37.aByte128--;
					}
				}
				if (local28.aClass12_Sub2_Sub2_1 != null) {
					local28.aClass12_Sub2_Sub2_1.aByte128--;
				}
				if (local28.aClass12_Sub2_Sub5_1 != null) {
					local28.aClass12_Sub2_Sub5_1.aByte128--;
				}
				if (local28.aClass12_Sub2_Sub5_2 != null) {
					local28.aClass12_Sub2_Sub5_2.aByte128--;
				}
				if (local28.aClass12_Sub2_Sub4_1 != null) {
					local28.aClass12_Sub2_Sub4_1.aByte128--;
				}
				if (local28.aClass12_Sub2_Sub4_2 != null) {
					local28.aClass12_Sub2_Sub4_2.aByte128--;
				}
			}
		}
		if (Static469.aClass228ArrayArrayArray6[0][arg0][arg1] == null) {
			Static469.aClass228ArrayArrayArray6[0][arg0][arg1] = new Class228(0);
			Static469.aClass228ArrayArrayArray6[0][arg0][arg1].aByte80 = 1;
		}
		Static469.aClass228ArrayArrayArray6[0][arg0][arg1].aClass228_1 = local7;
		Static469.aClass228ArrayArrayArray6[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!vp", name = "f", descriptor = "(I)V")
	public static void method7428() {
		Static329.method4757(-1, 255);
	}
}
