import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "y", descriptor = "Lclient!tia;")
	public static Class337 aClass337_1;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(IIIIIIIIII)Z")
	public static boolean method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (!Static31.method400(arg8, arg0, arg1)) {
			return false;
		}
		@Pc(15) int local15 = Static545.anIntArray489[0];
		@Pc(19) int local19 = Static545.anIntArray489[1];
		@Pc(23) int local23 = Static545.anIntArray489[2];
		if (!Static31.method400(arg3, arg2, arg6)) {
			return false;
		}
		@Pc(35) int local35 = Static545.anIntArray489[2];
		@Pc(39) int local39 = Static545.anIntArray489[1];
		@Pc(43) int local43 = Static545.anIntArray489[0];
		if (Static31.method400(arg4, arg5, arg7)) {
			@Pc(55) int local55 = Static545.anIntArray489[0];
			@Pc(59) int local59 = Static545.anIntArray489[1];
			@Pc(63) int local63 = Static545.anIntArray489[2];
			return Static434.method6501(local39, local19, local43, local59, local35, local15, local23, local55, local63);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!aga", name = "d", descriptor = "(B)Lclient!rq;")
	public static Class184 method197() {
		try {
			return (Class184) Class.forName("Class184_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "(II)V")
	public static void method199(@OriginalArg(1) int arg0) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(3, (long) arg0);
		local13.method2440();
	}
}
