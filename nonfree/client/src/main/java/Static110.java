import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!efa", name = "q", descriptor = "Lclient!dh;")
	public static Class66 aClass66_3;

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(III)B")
	public static byte method1746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!efa", name = "a", descriptor = "(II)V")
	public static void method1749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class9 local7 = Static208.aClass9ArrayArrayArray3[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class9 local28 = Static208.aClass9ArrayArrayArray3[local9][arg0][arg1] = Static208.aClass9ArrayArrayArray3[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte2--;
				for (@Pc(40) Class66 local40 = local28.aClass66_1; local40 != null; local40 = local40.aClass66_2) {
					@Pc(44) Class29_Sub2 local44 = local40.aClass29_Sub2_1;
					if (local44.aShort122 == arg0 && local44.aShort121 == arg1) {
						local44.aByte103--;
					}
				}
			}
		}
		if (Static208.aClass9ArrayArrayArray3[0][arg0][arg1] == null) {
			Static208.aClass9ArrayArrayArray3[0][arg0][arg1] = new Class9(0, arg0, arg1);
			Static208.aClass9ArrayArrayArray3[0][arg0][arg1].aByte8 = 1;
		}
		Static208.aClass9ArrayArrayArray3[0][arg0][arg1].aClass9_1 = local7;
		Static208.aClass9ArrayArrayArray3[3][arg0][arg1] = null;
	}
}
