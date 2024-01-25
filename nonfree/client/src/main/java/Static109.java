import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!dr", name = "j", descriptor = "Lclient!qk;")
	public static Class288 aClass288_71;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_26 = new Class179(29, 8);

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "(I)V")
	public static void method1616() {
		Static267.aClass2_Sub13_Sub3_3.method6136();
		Static93.aClass380_31 = null;
		Static527.aClass2_Sub13_Sub3_4 = null;
		Static317.anInt5047 = 1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([J[IIIB)V")
	public static void method1617(@OriginalArg(0) long[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(18) int local18 = (arg3 + arg2) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) long local24 = arg0[local18];
		arg0[local18] = arg0[arg2];
		arg0[arg2] = local24;
		@Pc(38) int local38 = arg1[local18];
		arg1[local18] = arg1[arg2];
		arg1[arg2] = local38;
		@Pc(58) int local58 = ~local24 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(60) int local60 = arg3; local60 < arg2; local60++) {
			if ((long) (local58 & local60) + local24 > arg0[local60]) {
				@Pc(77) long local77 = arg0[local60];
				arg0[local60] = arg0[local20];
				arg0[local20] = local77;
				@Pc(91) int local91 = arg1[local60];
				arg1[local60] = arg1[local20];
				arg1[local20++] = local91;
			}
		}
		arg0[arg2] = arg0[local20];
		arg0[local20] = local24;
		arg1[arg2] = arg1[local20];
		arg1[local20] = local38;
		method1617(arg0, arg1, local20 - 1, arg3);
		method1617(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(Z)V")
	public static void method1618() {
		if (!Static362.aBoolean421) {
			Static362.aBoolean421 = true;
			Static16.aFloat3 += (-12.0F - Static16.aFloat3) / 2.0F;
			Static68.aBoolean87 = true;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILclient!paa;I)V")
	public static void method1619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class261 arg2) {
		if (Static8.aBoolean11) {
			@Pc(14) Class238 local14 = Static198.anInt8166 == -1 ? null : Static339.aClass66_1.method1439(Static198.anInt8166);
			if (Static76.method1071(arg2).method6877() && (Static241.anInt3917 & 0x20) != 0 && (local14 == null || arg2.method5630(local14.anInt6043, Static198.anInt8166) != local14.anInt6043)) {
				Static564.method7726(false, arg2.anInt6629, arg2.anInt6585, Static83.anInt1494, false, arg2.anInt6614, (long) (arg2.anInt6614 | arg2.anInt6629 << 0), Static577.aString105, 0L, 9, true, Static90.aString16 + " -> " + arg2.aString90);
			}
		}
		@Pc(89) String local89;
		for (@Pc(82) int local82 = 9; local82 >= 5; local82--) {
			local89 = Static541.method7470(arg2, local82);
			if (local89 != null) {
				Static564.method7726(false, arg2.anInt6629, arg2.anInt6585, Static387.method5193(local82, arg2), false, arg2.anInt6614, (long) (arg2.anInt6614 | arg2.anInt6629 << 0), local89, (long) (local82 + 1), 1002, true, arg2.aString90);
			}
		}
		local89 = Static91.method1438(arg2);
		if (local89 != null) {
			Static564.method7726(false, arg2.anInt6629, arg2.anInt6585, arg2.anInt6618, false, arg2.anInt6614, (long) (arg2.anInt6614 | arg2.anInt6629 << 0), local89, 0L, 5, true, arg2.aString90);
		}
		for (@Pc(176) int local176 = 4; local176 >= 0; local176--) {
			@Pc(183) String local183 = Static541.method7470(arg2, local176);
			if (local183 != null) {
				Static564.method7726(false, arg2.anInt6629, arg2.anInt6585, Static387.method5193(local176, arg2), false, arg2.anInt6614, (long) (arg2.anInt6629 << 0 | arg2.anInt6614), local183, (long) (local176 + 1), 10, true, arg2.aString90);
			}
		}
		if (!Static76.method1071(arg2).method6876()) {
			return;
		}
		if (arg2.aString92 == null) {
			Static564.method7726(false, arg2.anInt6629, arg2.anInt6585, -1, false, arg2.anInt6614, (long) (arg2.anInt6614 | arg2.anInt6629 << 0), Static434.aClass271_9.method5972(Static483.anInt7694), 0L, 15, true, "");
		} else {
			Static564.method7726(false, arg2.anInt6629, arg2.anInt6585, -1, false, arg2.anInt6614, (long) (arg2.anInt6629 << 0 | arg2.anInt6614), arg2.aString92, 0L, 15, true, "");
		}
	}
}
