import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!al", name = "k", descriptor = "I")
	public static int anInt5702;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	public static int anInt5706 = 104;

	@OriginalMember(owner = "client!al", name = "h", descriptor = "(I)V")
	public static void method4655() {
		Static89.aClass90_3.X(Static163.anInt2988, Static58.aClass6_Sub17_Sub1_1.aBoolean610 ? Static239.anInt4386 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(II)V")
	public static void method4656(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class133 local7 = Static113.aClass133ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class133 local28 = Static113.aClass133ArrayArrayArray1[local9][arg0][arg1] = Static113.aClass133ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte50--;
				for (@Pc(40) Class315 local40 = local28.aClass315_1; local40 != null; local40 = local40.aClass315_3) {
					@Pc(44) Class15_Sub2 local44 = local40.aClass15_Sub2_2;
					if (local44.aShort116 == arg0 && local44.aShort114 == arg1) {
						local44.aByte98--;
					}
				}
			}
		}
		if (Static113.aClass133ArrayArrayArray1[0][arg0][arg1] == null) {
			Static113.aClass133ArrayArrayArray1[0][arg0][arg1] = new Class133(0, arg0, arg1);
			Static113.aClass133ArrayArrayArray1[0][arg0][arg1].aByte49 = 1;
		}
		Static113.aClass133ArrayArrayArray1[0][arg0][arg1].aClass133_1 = local7;
		Static113.aClass133ArrayArrayArray1[3][arg0][arg1] = null;
	}
}
