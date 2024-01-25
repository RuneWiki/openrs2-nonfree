import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(II)V")
	public static void method8867(@OriginalArg(1) int arg0) {
		if (Static410.aClass3_Sub56_3 == null || (arg0 < 0 || arg0 >= Static410.aClass3_Sub56_3.anInt11265)) {
			return;
		}
		@Pc(30) Class407 local30 = Static410.aClass3_Sub56_3.aClass407Array1[arg0];
		if (local30.aByte147 != -1) {
			return;
		}
		@Pc(41) Class400 local41 = Static81.method1057();
		@Pc(47) Class3_Sub48 local47 = Static89.method1200(Static539.aClass286_102, local41.aClass399_2);
		local47.aClass3_Sub28_Sub2_1.method5329(Static605.method8305(local30.aString133) + 2);
		local47.aClass3_Sub28_Sub2_1.method5282(arg0);
		local47.aClass3_Sub28_Sub2_1.method5283(local30.aString133);
		local41.method9223(local47);
	}

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(Z)V")
	public static void method8868(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static584.aClass262ArrayArrayArray2 = Static712.aClass262ArrayArrayArray3;
			Static639.aClass313Array2 = Static711.aClass313Array3;
		} else {
			Static584.aClass262ArrayArrayArray2 = Static274.aClass262ArrayArrayArray1;
			Static639.aClass313Array2 = Static167.aClass313Array1;
		}
		Static241.anInt4521 = Static584.aClass262ArrayArrayArray2.length;
	}
}
