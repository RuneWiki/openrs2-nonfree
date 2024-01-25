import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!mea", name = "n", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_137 = new Class362(37, 6);

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIII)I")
	public static int method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 >= arg0) {
			return arg1 < arg2 ? arg1 : arg2;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!mea", name = "b", descriptor = "(I)Lclient!io;")
	public static Class158_Sub1 method5337() {
		Static9.anInt216 = 0;
		return Static519.method7600();
	}

	@OriginalMember(owner = "client!mea", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method5338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) Class158_Sub1 local20 = Static5.aClass158_Sub1Array1[local14];
		Static5.aClass158_Sub1Array1[local14] = Static5.aClass158_Sub1Array1[arg0];
		Static5.aClass158_Sub1Array1[arg0] = local20;
		for (@Pc(32) int local32 = arg3; local32 < arg0; local32++) {
			if (Static577.method8235(arg2, local20, arg5, arg1, arg4, Static5.aClass158_Sub1Array1[local32]) <= 0) {
				@Pc(52) Class158_Sub1 local52 = Static5.aClass158_Sub1Array1[local32];
				Static5.aClass158_Sub1Array1[local32] = Static5.aClass158_Sub1Array1[local16];
				Static5.aClass158_Sub1Array1[local16++] = local52;
			}
		}
		Static5.aClass158_Sub1Array1[arg0] = Static5.aClass158_Sub1Array1[local16];
		Static5.aClass158_Sub1Array1[local16] = local20;
		method5338(local16 - 1, arg1, arg2, arg3, arg4, arg5);
		method5338(arg0, arg1, arg2, local16 + 1, arg4, arg5);
	}
}
