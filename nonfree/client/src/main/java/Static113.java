import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "Lclient!ul;")
	public static Class246 aClass246_73;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "[Lclient!fg;")
	public static Class74[] aClass74Array1 = new Class74[50];

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!uq;)Lclient!uq;")
	public static Class251 method2103(@OriginalArg(1) Class251 arg0) {
		@Pc(6) Class251 local6 = Static57.method1245(arg0);
		if (local6 == null) {
			local6 = arg0.aClass251_12;
		}
		return local6;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!ul;)I")
	public static int method2105(@OriginalArg(1) Class246 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method5497(Static123.anInt2496)) {
			local10++;
		}
		if (arg0.method5497(Static238.anInt4357)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIIZIZI)V")
	public static void method2106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg1 + arg3) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) Class91_Sub1 local24 = Static260.aClass91_Sub1Array1[local18];
		Static260.aClass91_Sub1Array1[local18] = Static260.aClass91_Sub1Array1[arg3];
		Static260.aClass91_Sub1Array1[arg3] = local24;
		for (@Pc(36) int local36 = arg1; local36 < arg3; local36++) {
			if (Static366.method5035(arg4, arg5, local24, Static260.aClass91_Sub1Array1[local36], arg2, arg0) <= 0) {
				@Pc(52) Class91_Sub1 local52 = Static260.aClass91_Sub1Array1[local36];
				Static260.aClass91_Sub1Array1[local36] = Static260.aClass91_Sub1Array1[local20];
				Static260.aClass91_Sub1Array1[local20++] = local52;
			}
		}
		Static260.aClass91_Sub1Array1[arg3] = Static260.aClass91_Sub1Array1[local20];
		Static260.aClass91_Sub1Array1[local20] = local24;
		method2106(arg0, arg1, arg2, local20 - 1, arg4, arg5);
		method2106(arg0, local20 + 1, arg2, arg3, arg4, arg5);
	}
}
