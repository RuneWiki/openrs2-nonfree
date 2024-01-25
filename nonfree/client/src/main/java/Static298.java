import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!jw", name = "e", descriptor = "F")
	public static float aFloat102;

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIIIIIBIIII)V")
	public static void method4809(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (!Static172.method3336(arg0, (byte) -31)) {
			return;
		}
		if (Static431.aClass381ArrayArray1[arg0] == null) {
			Static78.method1066(Static686.aClass381ArrayArray2[arg0], -1, arg8, arg10, arg4, arg6, arg2, arg1, arg7, arg3, arg9, arg5);
		} else {
			Static78.method1066(Static431.aClass381ArrayArray1[arg0], -1, arg8, arg10, arg4, arg6, arg2, arg1, arg7, arg3, arg9, arg5);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(II[Lclient!vo;)V")
	public static void method4810(@OriginalArg(1) int arg0, @OriginalArg(2) Class381[] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg1.length; local14++) {
			@Pc(20) Class381 local20 = arg1[local14];
			if (local20 != null && local20.anInt10079 == arg0 && !Static78.method1076(local20)) {
				if (local20.anInt10156 == 0) {
					method4810(local20.anInt10089, arg1);
					if (local20.aClass381Array2 != null) {
						method4810(local20.anInt10089, local20.aClass381Array2);
					}
					@Pc(67) Class6_Sub25 local67 = (Class6_Sub25) Static477.aClass74_31.method1401((long) local20.anInt10089);
					if (local67 != null) {
						Static450.method6930(local67.anInt5007);
					}
				}
				if (local20.anInt10156 == 6 && local20.anInt10158 != -1) {
					if (local20.aClass104_11 == null) {
						local20.aClass104_11 = new Class104_Sub1();
						local20.aClass104_11.method9035(local20.anInt10158);
					}
					if (local20.aClass104_11.method9039(Static2.anInt3) && local20.aClass104_11.method9038()) {
						local20.aClass104_11.method9022();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lclient!rfa;ZZ)V")
	public static void method4811(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		arg0.aBoolean683 = arg1;
		if (Static398.aBoolean515) {
			Static489.aClass15Array1[Static489.aClass15Array1.length - 1].method204(arg0);
		} else {
			Static122.method2209(arg0, Static468.aClass6_Sub10Array6);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIZ)Z")
	public static boolean method4812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static207.method3816(arg0, arg1) | (arg0 & 0x40000) != 0 || Static584.method8153(arg0, arg1);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIZI)V")
	public static void method4813(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		if (Static252.aClass74_67.method1401((long) arg0) != null) {
			return;
		}
		if (Static272.aBoolean77) {
			@Pc(37) Class6_Sub33 local37 = new Class6_Sub33(arg0, new Class115_Sub1(4096, Static338.aClass223_74, arg0), arg2, arg1);
			local37.aClass115_Sub1_1.method3255(Static205.aStringArray17[Static601.anInt9518]);
			Static252.aClass74_67.method1399(local37, (long) arg0);
		} else {
			Static159.method3133(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(IBLjava/lang/String;)V")
	public static void method4814(@OriginalArg(2) String arg0) {
		Static14.method193("", "", "", 0, arg0, 4);
	}

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4815(@OriginalArg(1) String arg0) {
		return Static129.method2528(arg0);
	}
}
