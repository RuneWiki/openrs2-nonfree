import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bl", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString18 = "white:";

	@OriginalMember(owner = "client!bl", name = "x", descriptor = "[I")
	public static final int[] anIntArray35 = new int[5];

	@OriginalMember(owner = "client!bl", name = "B", descriptor = "[I")
	public static int[] anIntArray36 = new int[2];

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(IIII)Lclient!ps;")
	public static Class5_Sub4_Sub4 method576(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class45 local11 = Static256.aClass45ArrayArrayArray2[arg2][arg0][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(17) Class5_Sub4_Sub4 local17 = null;
		@Pc(19) int local19 = -1;
		for (@Pc(22) Class160 local22 = local11.aClass160_1; local22 != null; local22 = local22.aClass160_3) {
			@Pc(35) Class5_Sub4 local35 = local22.aClass5_Sub4_1;
			if (local35 instanceof Class5_Sub4_Sub4) {
				@Pc(41) Class5_Sub4_Sub4 local41 = (Class5_Sub4_Sub4) local35;
				@Pc(51) int local51 = (local41.method4208() - 1) * 64 + 60;
				@Pc(59) int local59 = local41.anInt5901 - local51 >> 7;
				@Pc(66) int local66 = local41.anInt5905 - local51 >> 7;
				@Pc(73) int local73 = local41.anInt5901 + local51 >> 7;
				@Pc(80) int local80 = local51 + local41.anInt5905 >> 7;
				if (local59 <= arg0 && arg1 >= local66 && arg0 <= local73 && local80 >= arg1) {
					@Pc(114) int local114 = (local80 + 1 - arg1) * (-arg0 + 1 + local73);
					if (local114 > local19) {
						local17 = local41;
						local19 = local114;
					}
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "(III)V")
	public static void method577(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static291.aClass3_Sub4_Sub2_3.method3682(33);
		Static291.aClass3_Sub4_Sub2_3.method3635(arg0);
		Static291.aClass3_Sub4_Sub2_3.method3615(arg1);
	}
}
