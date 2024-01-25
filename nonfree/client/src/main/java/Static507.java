import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
	public static void method7207(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub7_Sub5 local8 = Static218.method3780(11, arg0);
		local8.method3062();
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	public static void method7208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class100 local7 = Static309.aClass100ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class100 local28 = Static309.aClass100ArrayArrayArray2[local9][arg0][arg1] = Static309.aClass100ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte37--;
				for (@Pc(40) Class35 local40 = local28.aClass35_2; local40 != null; local40 = local40.aClass35_1) {
					@Pc(44) Class10_Sub1 local44 = local40.aClass10_Sub1_1;
					if (local44.aShort116 == arg0 && local44.aShort117 == arg1) {
						local44.aByte101--;
					}
				}
			}
		}
		if (Static309.aClass100ArrayArrayArray2[0][arg0][arg1] == null) {
			Static309.aClass100ArrayArrayArray2[0][arg0][arg1] = new Class100(0, arg0, arg1);
			Static309.aClass100ArrayArrayArray2[0][arg0][arg1].aByte34 = 1;
		}
		Static309.aClass100ArrayArrayArray2[0][arg0][arg1].aClass100_1 = local7;
		Static309.aClass100ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
