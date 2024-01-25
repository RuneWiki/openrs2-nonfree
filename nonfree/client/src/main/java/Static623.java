import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static623 {

	@OriginalMember(owner = "client!va", name = "F", descriptor = "F")
	public static float aFloat188;

	@OriginalMember(owner = "client!va", name = "J", descriptor = "[I")
	public static int[] anIntArray557;

	@OriginalMember(owner = "client!va", name = "y", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_172 = new Class126(114, 7);

	@OriginalMember(owner = "client!va", name = "H", descriptor = "Lclient!cja;")
	public static final Class62 aClass62_45 = new Class62(4);

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILclient!tc;Lclient!tc;)V")
	public static void method7323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class23_Sub2_Sub5 arg3, @OriginalArg(4) Class23_Sub2_Sub5 arg4) {
		@Pc(4) Class247 local4 = Static554.method7252(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass23_Sub2_Sub5_1 = arg3;
		local4.aClass23_Sub2_Sub5_2 = arg4;
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

	@OriginalMember(owner = "client!va", name = "k", descriptor = "(I)Z")
	public static boolean method7324() {
		Static321.aBoolean467 = true;
		Static154.anInt2874++;
		return true;
	}
}
