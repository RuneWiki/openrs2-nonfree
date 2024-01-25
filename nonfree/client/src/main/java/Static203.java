import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!go", name = "i", descriptor = "I")
	public static int anInt3734 = 0;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILclient!va;Lclient!va;)V")
	public static void method3209(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23_Sub2_Sub2 arg3, @OriginalArg(4) Class23_Sub2_Sub2 arg4) {
		@Pc(4) Class247 local4 = Static554.method7252(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass23_Sub2_Sub2_1 = arg3;
		local4.aClass23_Sub2_Sub2_2 = arg4;
		@Pc(19) int local19 = Static343.aClass104Array2 == Static605.aClass104Array3 ? 1 : 0;
		if (!arg3.method8608()) {
			arg3.aClass23_Sub2_23 = Static188.aClass23_Sub2Array1[local19];
			Static188.aClass23_Sub2Array1[local19] = arg3;
		} else if (arg3.method8594()) {
			arg3.aClass23_Sub2_23 = Static496.aClass23_Sub2Array3[local19];
			Static496.aClass23_Sub2Array3[local19] = arg3;
		} else {
			arg3.aClass23_Sub2_23 = Static249.aClass23_Sub2Array2[local19];
			Static249.aClass23_Sub2Array2[local19] = arg3;
			Static674.aBoolean763 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8608()) {
			if (arg4.method8594()) {
				arg4.aClass23_Sub2_23 = Static496.aClass23_Sub2Array3[local19];
				Static496.aClass23_Sub2Array3[local19] = arg4;
				return;
			}
			arg4.aClass23_Sub2_23 = Static249.aClass23_Sub2Array2[local19];
			Static249.aClass23_Sub2Array2[local19] = arg4;
			Static674.aBoolean763 = true;
			return;
		}
		arg4.aClass23_Sub2_23 = Static188.aClass23_Sub2Array1[local19];
		Static188.aClass23_Sub2Array1[local19] = arg4;
	}
}
