import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!bp", name = "e", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_16 = new Class180(30, -1);

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIZIIIZ)V")
	public static void method1156(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) Class98_Sub1 local24 = Static665.aClass98_Sub1Array3[local18];
		Static665.aClass98_Sub1Array3[local18] = Static665.aClass98_Sub1Array3[arg3];
		Static665.aClass98_Sub1Array3[arg3] = local24;
		for (@Pc(36) int local36 = arg0; local36 < arg3; local36++) {
			if (Static431.method6191(arg2, local24, arg5, arg4, Static665.aClass98_Sub1Array3[local36], arg1) <= 0) {
				@Pc(53) Class98_Sub1 local53 = Static665.aClass98_Sub1Array3[local36];
				Static665.aClass98_Sub1Array3[local36] = Static665.aClass98_Sub1Array3[local20];
				Static665.aClass98_Sub1Array3[local20++] = local53;
			}
		}
		Static665.aClass98_Sub1Array3[arg3] = Static665.aClass98_Sub1Array3[local20];
		Static665.aClass98_Sub1Array3[local20] = local24;
		method1156(arg0, arg1, arg2, local20 - 1, arg4, arg5);
		method1156(local20 + 1, arg1, arg2, arg3, arg4, arg5);
	}
}
