import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ce", name = "l", descriptor = "J")
	public static long aLong51;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "Lclient!lk;")
	public static final Class225 aClass225_28 = new Class225(5, -1);

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public static int anInt1355 = 0;

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)V")
	public static void method1190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class311 local7 = Static632.aClass311ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class311 local28 = Static632.aClass311ArrayArrayArray3[local9][arg0][arg1] = Static632.aClass311ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class142 local33 = local28.aClass142_2; local33 != null; local33 = local33.aClass142_1) {
					@Pc(37) Class4_Sub2_Sub1 local37 = local33.aClass4_Sub2_Sub1_1;
					if (local37.aShort130 == arg0 && local37.aShort127 == arg1) {
						local37.aByte133--;
					}
				}
				if (local28.aClass4_Sub2_Sub2_1 != null) {
					local28.aClass4_Sub2_Sub2_1.aByte133--;
				}
				if (local28.aClass4_Sub2_Sub3_2 != null) {
					local28.aClass4_Sub2_Sub3_2.aByte133--;
				}
				if (local28.aClass4_Sub2_Sub3_1 != null) {
					local28.aClass4_Sub2_Sub3_1.aByte133--;
				}
				if (local28.aClass4_Sub2_Sub4_1 != null) {
					local28.aClass4_Sub2_Sub4_1.aByte133--;
				}
				if (local28.aClass4_Sub2_Sub4_2 != null) {
					local28.aClass4_Sub2_Sub4_2.aByte133--;
				}
			}
		}
		if (Static632.aClass311ArrayArrayArray3[0][arg0][arg1] == null) {
			Static632.aClass311ArrayArrayArray3[0][arg0][arg1] = new Class311(0);
			Static632.aClass311ArrayArrayArray3[0][arg0][arg1].aByte118 = 1;
		}
		Static632.aClass311ArrayArrayArray3[0][arg0][arg1].aClass311_1 = local7;
		Static632.aClass311ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
