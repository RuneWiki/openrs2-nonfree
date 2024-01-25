import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "Lclient!bc;")
	public static Class21 aClass21_4;

	@OriginalMember(owner = "client!tj", name = "I", descriptor = "Lclient!s;")
	public static final Class217 aClass217_141 = new Class217(24, -1);

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_91 = new Class27(45, 4);

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)V")
	public static void method5202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class11 local7 = Static309.aClass11ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class11 local28 = Static309.aClass11ArrayArrayArray2[local9][arg0][arg1] = Static309.aClass11ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte7--;
				for (@Pc(40) Class1 local40 = local28.aClass1_3; local40 != null; local40 = local40.aClass1_1) {
					@Pc(44) Class24_Sub3 local44 = local40.aClass24_Sub3_1;
					if (local44.aShort107 == arg0 && local44.aShort105 == arg1) {
						local44.aByte98--;
					}
				}
			}
		}
		if (Static309.aClass11ArrayArrayArray2[0][arg0][arg1] == null) {
			Static309.aClass11ArrayArrayArray2[0][arg0][arg1] = new Class11(0, arg0, arg1);
			Static309.aClass11ArrayArrayArray2[0][arg0][arg1].aByte1 = 1;
		}
		Static309.aClass11ArrayArrayArray2[0][arg0][arg1].aClass11_1 = local7;
		Static309.aClass11ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
