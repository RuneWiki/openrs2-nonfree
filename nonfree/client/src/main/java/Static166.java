import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ph", name = "O", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!ph", name = "P", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1143 = Static231.method3737("scrollen:");

	@OriginalMember(owner = "client!ph", name = "S", descriptor = "I")
	public static int anInt4347 = 0;

	@OriginalMember(owner = "client!ph", name = "T", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1144 = Static231.method3737("(U1");

	@OriginalMember(owner = "client!ph", name = "U", descriptor = "Lclient!sc;")
	public static Class107 aClass107_1145 = Static231.method3737("<br>(X");

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IILclient!jb;)[Lclient!ka;")
	public static Class64_Sub1[] method3209(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		return Static23.method421(arg1, arg0) ? Static39.method743() : null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!g;")
	public static RuntimeException_Sub1 method3210(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString9 = local9.aString9 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method3211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class117 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class117(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static174.aClass1_Sub9ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static174.aClass1_Sub9ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub9(local14, arg1, arg2);
				}
			}
			Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass117_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class117(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static174.aClass1_Sub9ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static174.aClass1_Sub9ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub9(local14, arg1, arg2);
				}
			}
			Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass117_1 = local12;
		} else {
			@Pc(134) Class49 local134 = new Class49(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static174.aClass1_Sub9ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static174.aClass1_Sub9ArrayArrayArray2[local14][arg1][arg2] = new Class1_Sub9(local14, arg1, arg2);
				}
			}
			Static174.aClass1_Sub9ArrayArrayArray2[arg0][arg1][arg2].aClass49_1 = local134;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIII)V")
	public static void method3213(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(3) int local3 = 0;
		Static162.method2605(Static231.anIntArrayArray44[arg3], arg1 - arg2, arg4, arg2 + arg1);
		@Pc(18) int local18 = arg0;
		@Pc(26) int local26 = arg2 * arg2;
		@Pc(30) int local30 = arg0 * arg0;
		@Pc(34) int local34 = local26 << 1;
		@Pc(38) int local38 = local30 << 1;
		@Pc(42) int local42 = arg0 << 1;
		@Pc(51) int local51 = local30 - local34 * (local42 - 1);
		@Pc(67) int local67 = local38 + local26 * (1 - local42);
		@Pc(71) int local71 = local26 << 2;
		@Pc(75) int local75 = local30 << 2;
		@Pc(83) int local83 = ((arg0 << 1) - 3) * local34;
		@Pc(91) int local91 = local38 * 3;
		@Pc(97) int local97 = local71 * (arg0 - 1);
		@Pc(103) int local103 = local75;
		while (local18 > 0) {
			if (local67 < 0) {
				while (local67 < 0) {
					local3++;
					local67 += local91;
					local51 += local103;
					local91 += local75;
					local103 += local75;
				}
			}
			if (local51 < 0) {
				local51 += local103;
				local3++;
				local67 += local91;
				local91 += local75;
				local103 += local75;
			}
			local51 += -local83;
			local18--;
			local83 -= local71;
			local67 += -local97;
			@Pc(172) int local172 = local18 + arg3;
			@Pc(177) int local177 = arg3 - local18;
			local97 -= local71;
			@Pc(185) int local185 = local3 + arg1;
			@Pc(189) int local189 = arg1 - local3;
			Static162.method2605(Static231.anIntArrayArray44[local177], local189, arg4, local185);
			Static162.method2605(Static231.anIntArrayArray44[local172], local189, arg4, local185);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZ)Lclient!wb;")
	public static Class1_Sub2_Sub19 method3214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class1_Sub2_Sub19 local20 = (Class1_Sub2_Sub19) Static96.aClass50_14.method1364((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class1_Sub2_Sub19(arg1, arg0);
			Static96.aClass50_14.method1362(local20.aLong177, local20);
		}
		return local20;
	}
}
