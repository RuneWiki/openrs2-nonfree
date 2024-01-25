import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!cea", name = "E", descriptor = "Lclient!bt;")
	public static Class34 aClass34_11;

	@OriginalMember(owner = "client!cea", name = "Q", descriptor = "Lclient!wt;")
	public static Class4_Sub55 aClass4_Sub55_1;

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!bt;IBIZI)V")
	public static void method1419(@OriginalArg(0) Class34 arg0, @OriginalArg(3) int arg1, @OriginalArg(5) int arg2) {
		Static359.method4797(arg1, arg2, arg0, 0L);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
	public static void method1423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 <= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg1;
		@Pc(24) int local24 = arg3[local18];
		arg3[local18] = arg3[arg0];
		arg3[arg0] = local24;
		@Pc(38) Object local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		@Pc(55) int local55 = local24 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(57) int local57 = arg1; local57 < arg0; local57++) {
			if (local24 + (local55 & local57) > arg3[local57]) {
				@Pc(72) int local72 = arg3[local57];
				arg3[local57] = arg3[local20];
				arg3[local20] = local72;
				@Pc(86) Object local86 = arg2[local57];
				arg2[local57] = arg2[local20];
				arg2[local20++] = local86;
			}
		}
		arg3[arg0] = arg3[local20];
		arg3[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method1423(local20 - 1, arg1, arg2, arg3);
		method1423(arg0, local20 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(JJ)J")
	public static long method1424(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 & arg1;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(B)V")
	public static void method1425() {
		@Pc(10) Class352 local10 = Static318.aClass352_43;
		synchronized (Static318.aClass352_43) {
			Static318.aClass352_43.method7656();
		}
	}
}
