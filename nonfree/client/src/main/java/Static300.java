import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pd", name = "j", descriptor = "Lclient!bg;")
	public static Class22 aClass22_246 = null;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIZBI)Lclient!vj;")
	public static Class4_Sub43 method4092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub43 local7 = new Class4_Sub43();
		local7.anInt6981 = arg1;
		local7.anInt6979 = arg0;
		Static325.aClass102_29.method2703((long) arg3, local7);
		Static426.method5439(arg0);
		@Pc(26) Class247 local26 = Static392.method5121(arg3);
		if (local26 != null) {
			Static63.method1142(local26);
		}
		if (Static304.aClass247_16 != null) {
			Static63.method1142(Static304.aClass247_16);
			Static304.aClass247_16 = null;
		}
		Static214.method3224();
		if (local26 != null) {
			Static374.method4998(local26, !arg2);
		}
		if (!arg2) {
			Static271.method3897(arg0);
		}
		if (!arg2 && Static334.anInt5766 != -1) {
			Static310.method4165(Static334.anInt5766, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lclient!ya;IILclient!rd;II)V")
	public static void method4094(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class202 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) Class41 local9 = Static76.aClass265_2.method5588(arg2.anInt5803);
		if (local9.anInt1024 == -1) {
			return;
		}
		if (arg2.aBoolean533) {
			@Pc(37) int local37 = arg1 + arg2.anInt5817;
			arg1 = local37 & 0x3;
		} else {
			arg1 = 0;
		}
		@Pc(49) Class57 local49 = local9.method937(arg2.aBoolean530, arg0, arg1);
		if (local49 == null) {
			return;
		}
		@Pc(55) int local55 = arg2.anInt5816;
		@Pc(58) int local58 = arg2.anInt5801;
		if ((arg1 & 0x1) == 1) {
			local55 = arg2.anInt5801;
			local58 = arg2.anInt5816;
		}
		@Pc(74) int local74 = local49.j();
		@Pc(77) int local77 = local49.T();
		if (local9.aBoolean96) {
			local74 = local55 * 4;
			local77 = local58 * 4;
		}
		if (local9.anInt1027 == 0) {
			local49.method5537(arg4, arg3 + 4 - local58 * 4, local74, local77);
		} else {
			local49.s(arg4, arg3 + 4 - local58 * 4, local74, local77, 0, local9.anInt1027 | 0xFF000000, 1);
		}
	}
}
