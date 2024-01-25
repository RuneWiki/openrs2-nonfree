import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!sw", name = "v", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!sw", name = "s", descriptor = "Lclient!uc;")
	public static final Class328 aClass328_22 = new Class328(15, -1);

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(III)Z")
	public static boolean method6739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static474.method7118(arg1, arg0) || Static318.method4955(arg0, arg1);
	}

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "(I)V")
	public static void method6740() {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(0, 15);
		local13.method2580();
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIII)V")
	public static void method6742(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(6) int local6 = arg3 + 1;
		Static208.method3687(arg0, arg4, Static454.anIntArrayArray71[arg3], arg2);
		@Pc(19) int local19 = arg1 - 1;
		Static208.method3687(arg0, arg4, Static454.anIntArrayArray71[arg1], arg2);
		for (@Pc(25) int local25 = local6; local25 <= local19; local25++) {
			@Pc(31) int[] local31 = Static454.anIntArrayArray71[local25];
			local31[arg0] = local31[arg2] = arg4;
		}
	}

	@OriginalMember(owner = "client!sw", name = "c", descriptor = "(II)V")
	public static void method6743(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class276 local7 = Static270.aClass276ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class276 local28 = Static270.aClass276ArrayArrayArray2[local9][arg0][arg1] = Static270.aClass276ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.aByte89--;
				for (@Pc(40) Class267 local40 = local28.aClass267_3; local40 != null; local40 = local40.aClass267_2) {
					@Pc(44) Class4_Sub1 local44 = local40.aClass4_Sub1_2;
					if (local44.aShort126 == arg0 && local44.aShort125 == arg1) {
						local44.aByte108--;
					}
				}
			}
		}
		if (Static270.aClass276ArrayArrayArray2[0][arg0][arg1] == null) {
			Static270.aClass276ArrayArrayArray2[0][arg0][arg1] = new Class276(0, arg0, arg1);
			Static270.aClass276ArrayArrayArray2[0][arg0][arg1].aByte85 = 1;
		}
		Static270.aClass276ArrayArrayArray2[0][arg0][arg1].aClass276_1 = local7;
		Static270.aClass276ArrayArrayArray2[3][arg0][arg1] = null;
	}
}
