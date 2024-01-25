import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static636 {

	@OriginalMember(owner = "client!vja", name = "K", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_136 = new Class100(5, -1);

	@OriginalMember(owner = "client!vja", name = "M", descriptor = "Lclient!wv;")
	public static final Class395 aClass395_17 = new Class395(13, 3);

	@OriginalMember(owner = "client!vja", name = "a", descriptor = "(IIIIBZZ)V")
	public static void method8885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg3 + arg0) / 2;
		@Pc(17) int local17 = arg3;
		@Pc(21) Class217_Sub1 local21 = Static372.aClass217_Sub1Array1[local15];
		Static372.aClass217_Sub1Array1[local15] = Static372.aClass217_Sub1Array1[arg0];
		Static372.aClass217_Sub1Array1[arg0] = local21;
		for (@Pc(33) int local33 = arg3; local33 < arg0; local33++) {
			if (Static223.method3457(Static372.aClass217_Sub1Array1[local33], arg2, arg4, arg5, arg1, local21) <= 0) {
				@Pc(50) Class217_Sub1 local50 = Static372.aClass217_Sub1Array1[local33];
				Static372.aClass217_Sub1Array1[local33] = Static372.aClass217_Sub1Array1[local17];
				Static372.aClass217_Sub1Array1[local17++] = local50;
			}
		}
		Static372.aClass217_Sub1Array1[arg0] = Static372.aClass217_Sub1Array1[local17];
		Static372.aClass217_Sub1Array1[local17] = local21;
		method8885(local17 - 1, arg1, arg2, arg3, arg4, arg5);
		method8885(arg0, arg1, arg2, local17 + 1, arg4, arg5);
	}
}
