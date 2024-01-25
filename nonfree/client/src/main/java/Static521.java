import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!uo", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[100];

	@OriginalMember(owner = "client!uo", name = "m", descriptor = "S")
	public static short aShort120 = 1;

	@OriginalMember(owner = "client!uo", name = "x", descriptor = "[I")
	public static final int[] anIntArray670 = new int[14];

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(III)V")
	public static void method7338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static208.aClass9ArrayArrayArray3[0][arg1][arg2] != null && Static208.aClass9ArrayArrayArray3[0][arg1][arg2].aClass9_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static208.aClass9ArrayArrayArray3[local22][arg1][arg2] == null) {
				@Pc(46) Class9 local46 = Static208.aClass9ArrayArrayArray3[local22][arg1][arg2] = new Class9(local22, arg1, arg2);
				if (local20) {
					local46.aByte8++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "(Z)V")
	public static void method7340() {
		Static218.aClass6_Sub14_Sub2_1.method5990(Static361.aClass251_104.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static196.aClass251_67.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static28.aClass251_7.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static19.aClass251_62.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static527.aClass251_147.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static285.aClass251_84.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static375.aClass251_107.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static251.aClass251_88.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static447.aClass251_141.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static219.aClass251_71.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static131.aClass251_46.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static168.aClass251_60.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static58.aClass251_21.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static492.aClass251_136.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static509.aClass251_142.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static63.aClass251_23.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static543.aClass251_151.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static45.aClass251_17.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static529.aClass251_148.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static543.aClass251_150.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static505.aClass251_138.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static310.aClass251_94.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static9.aClass251_1.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static30.aClass251_82.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static228.aClass251_74.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static36.aClass251_12.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static79.aClass251_26.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static145.aClass251_50.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static118.aClass251_40.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static126.aClass251_44.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static266.aClass251_77.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static509.aClass251_143.method5832());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static200.method3797());
		Static218.aClass6_Sub14_Sub2_1.method5990(Static192.method2860());
	}
}
