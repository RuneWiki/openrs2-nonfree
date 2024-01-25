import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "Lclient!hda;")
	public static final Class136 aClass136_84 = new Class136(43, -1);

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZI)V")
	public static void method3280(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) Class5_Sub37 local12 = Static498.method7299(arg1, arg0);
		if (local12 != null) {
			local12.method8911();
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIILclient!nl;)V")
	public static void method3282(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class14_Sub1_Sub5 arg3) {
		@Pc(4) Class156 local4 = Static503.method3567(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass14_Sub1_Sub5_1 = arg3;
		@Pc(16) int local16 = Static299.aClass40Array1 == Static327.aClass40Array2 ? 1 : 0;
		if (arg3.method7998()) {
			if (arg3.method7987()) {
				arg3.aClass14_Sub1_22 = Static151.aClass14_Sub1Array1[local16];
				Static151.aClass14_Sub1Array1[local16] = arg3;
				return;
			}
			arg3.aClass14_Sub1_22 = Static250.aClass14_Sub1Array2[local16];
			Static250.aClass14_Sub1Array2[local16] = arg3;
			Static367.aBoolean541 = true;
			return;
		}
		arg3.aClass14_Sub1_22 = Static469.aClass14_Sub1Array5[local16];
		Static469.aClass14_Sub1Array5[local16] = arg3;
	}
}
