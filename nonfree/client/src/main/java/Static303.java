import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
	public static int anInt4820;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIILclient!cj;Lclient!cj;)V")
	public static void method4407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14_Sub1_Sub2 arg3, @OriginalArg(4) Class14_Sub1_Sub2 arg4) {
		@Pc(4) Class156 local4 = Static503.method3567(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass14_Sub1_Sub2_2 = arg3;
		local4.aClass14_Sub1_Sub2_1 = arg4;
		@Pc(19) int local19 = Static299.aClass40Array1 == Static327.aClass40Array2 ? 1 : 0;
		if (!arg3.method7998()) {
			arg3.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local19];
			Static469.aClass14_Sub1Array5[local19] = arg3;
		} else if (arg3.method7987()) {
			arg3.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local19];
			Static151.aClass14_Sub1Array1[local19] = arg3;
		} else {
			arg3.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local19];
			Static250.aClass14_Sub1Array2[local19] = arg3;
			Static367.aBoolean541 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method7998()) {
			if (arg4.method7987()) {
				arg4.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local19];
				Static151.aClass14_Sub1Array1[local19] = arg4;
				return;
			}
			arg4.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local19];
			Static250.aClass14_Sub1Array2[local19] = arg4;
			Static367.aBoolean541 = true;
			return;
		}
		arg4.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local19];
		Static469.aClass14_Sub1Array5[local19] = arg4;
	}
}
