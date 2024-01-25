import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt4024 = 0;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)Lclient!ku;")
	public static Class29 method3518() {
		try {
			return (Class29) Class.forName("Class29_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIIIB)V")
	public static void method3519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg0 < 0 || arg6 < 0 || Static89.anInt1891 - 1 <= arg0 || Static85.anInt1839 - 1 <= arg6) {
			return;
		}
		if (Static45.aClass188ArrayArrayArray5 == null) {
			return;
		}
		@Pc(33) Interface8 local33;
		if (arg2 == 0) {
			local33 = (Interface8) Static94.method1598(arg4, arg0, arg6);
			@Pc(39) Interface8 local39 = (Interface8) Static313.method5079(arg4, arg0, arg6);
			if (local33 != null && arg5 != 2) {
				if (local33 instanceof Class1_Sub5_Sub1) {
					((Class1_Sub5_Sub1) local33).aClass6_3.method76(arg1);
				} else {
					Static290.method4766(arg3, arg6, arg4, local33.method6034(), arg0, arg2, arg5, arg1);
				}
			}
			if (local39 != null) {
				if (local39 instanceof Class1_Sub5_Sub1) {
					((Class1_Sub5_Sub1) local39).aClass6_3.method76(arg1);
				} else {
					Static290.method4766(arg3, arg6, arg4, local39.method6034(), arg0, arg2, arg5, arg1);
				}
			}
		} else if (arg2 == 1) {
			local33 = (Interface8) Static204.method3744(arg4, arg0, arg6);
			if (local33 != null) {
				if (local33 instanceof Class1_Sub3_Sub1) {
					((Class1_Sub3_Sub1) local33).aClass6_2.method76(arg1);
				} else {
					@Pc(207) int local207 = local33.method6034();
					if (arg5 == 4 || arg5 == 5) {
						Static290.method4766(arg3, arg6, arg4, local207, arg0, arg2, 4, arg1);
					} else if (arg5 == 6) {
						Static290.method4766(arg3 + 4, arg6, arg4, local207, arg0, arg2, 4, arg1);
					} else if (arg5 == 7) {
						Static290.method4766((arg3 + 2 & 0x3) + 4, arg6, arg4, local207, arg0, arg2, 4, arg1);
					} else if (arg5 == 8) {
						Static290.method4766(arg3 + 4, arg6, arg4, local207, arg0, arg2, 4, arg1);
						Static290.method4766((arg3 + 2 & 0x3) + 4, arg6, arg4, local207, arg0, arg2, 4, arg1);
					}
				}
			}
		} else if (arg2 == 2) {
			local33 = (Interface8) Static278.method4615(arg4, arg0, arg6, td.class);
			if (local33 != null) {
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (local33 instanceof Class1_Sub2_Sub4) {
					((Class1_Sub2_Sub4) local33).aClass6_4.method76(arg1);
				} else {
					Static290.method4766(arg3, arg6, arg4, local33.method6034(), arg0, arg2, arg5, arg1);
				}
			}
		} else if (arg2 == 3) {
			local33 = (Interface8) Static266.method4518(arg4, arg0, arg6);
			if (local33 != null) {
				if (local33 instanceof Class1_Sub1_Sub2) {
					((Class1_Sub1_Sub2) local33).aClass6_1.method76(arg1);
				} else {
					Static290.method4766(arg3, arg6, arg4, local33.method6034(), arg0, arg2, arg5, arg1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIZZII)V")
	public static void method3520(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= arg5) {
			return;
		}
		@Pc(20) int local20 = (arg4 + arg5) / 2;
		@Pc(22) int local22 = arg4;
		@Pc(26) Class35_Sub1 local26 = Static222.aClass35_Sub1Array1[local20];
		Static222.aClass35_Sub1Array1[local20] = Static222.aClass35_Sub1Array1[arg5];
		Static222.aClass35_Sub1Array1[arg5] = local26;
		for (@Pc(38) int local38 = arg4; local38 < arg5; local38++) {
			if (Static349.method5574(Static222.aClass35_Sub1Array1[local38], local26, arg3, arg1, arg0, arg2) <= 0) {
				@Pc(55) Class35_Sub1 local55 = Static222.aClass35_Sub1Array1[local38];
				Static222.aClass35_Sub1Array1[local38] = Static222.aClass35_Sub1Array1[local22];
				Static222.aClass35_Sub1Array1[local22++] = local55;
			}
		}
		Static222.aClass35_Sub1Array1[arg5] = Static222.aClass35_Sub1Array1[local22];
		Static222.aClass35_Sub1Array1[local22] = local26;
		method3520(arg0, arg1, arg2, arg3, arg4, local22 - 1);
		method3520(arg0, arg1, arg2, arg3, local22 + 1, arg5);
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3521(@OriginalArg(1) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
