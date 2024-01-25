import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static597 {

	@OriginalMember(owner = "client!vea", name = "d", descriptor = "I")
	public static int anInt10148;

	@OriginalMember(owner = "client!vea", name = "h", descriptor = "Z")
	public static boolean aBoolean790;

	@OriginalMember(owner = "client!vea", name = "e", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_178 = new Class73(19, 2);

	@OriginalMember(owner = "client!vea", name = "a", descriptor = "(IIIIZZB)V")
	public static void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) boolean arg5) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) Class67_Sub1 local20 = Static56.aClass67_Sub1Array1[local14];
		Static56.aClass67_Sub1Array1[local14] = Static56.aClass67_Sub1Array1[arg2];
		Static56.aClass67_Sub1Array1[arg2] = local20;
		for (@Pc(32) int local32 = arg1; local32 < arg2; local32++) {
			if (Static499.method7242(Static56.aClass67_Sub1Array1[local32], arg4, local20, arg5, arg3, arg0) <= 0) {
				@Pc(52) Class67_Sub1 local52 = Static56.aClass67_Sub1Array1[local32];
				Static56.aClass67_Sub1Array1[local32] = Static56.aClass67_Sub1Array1[local16];
				Static56.aClass67_Sub1Array1[local16++] = local52;
			}
		}
		Static56.aClass67_Sub1Array1[arg2] = Static56.aClass67_Sub1Array1[local16];
		Static56.aClass67_Sub1Array1[local16] = local20;
		method8284(arg0, arg1, local16 - 1, arg3, arg4, arg5);
		method8284(arg0, local16 + 1, arg2, arg3, arg4, arg5);
	}
}
