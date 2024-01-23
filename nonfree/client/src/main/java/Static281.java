import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static281 {

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "[Lclient!hc;")
	public static Interface3[] anInterface3Array2;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!uf", name = "m", descriptor = "Lclient!ui;")
	public static Class175 aClass175_2 = new Class175(30);

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!ak;Lclient!ak;)V")
	public static void method98(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_234 != null) {
			arg0.method4573();
		}
		arg0.aClass1_234 = arg1.aClass1_234;
		arg0.aClass1_235 = arg1;
		arg0.aClass1_234.aClass1_235 = arg0;
		arg0.aClass1_235.aClass1_234 = arg0;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
	public static void method99() {
		if (Static126.aClass157_7 != null || (Static64.aClass157_5 != null || Static226.anInt4234 > 0)) {
			return;
		}
		@Pc(24) int local24 = Static235.anInt4408;
		@Pc(34) int local34;
		@Pc(90) int local90;
		if (!Static91.aBoolean183) {
			if (local24 == 1 && Static241.anInt4470 > 0) {
				@Pc(230) short local230 = Static94.aShortArray46[Static241.anInt4470 - 1];
				if (local230 == 18 || local230 == 26 || local230 == 13 || local230 == 41 || local230 == 39 || local230 == 7 || local230 == 34 || local230 == 17 || local230 == 24 || local230 == 22 || local230 == 46 || local230 == 1002) {
					local34 = Static266.anIntArray551[Static241.anInt4470 - 1];
					local90 = Static195.anIntArray409[Static241.anInt4470 - 1];
					@Pc(295) Class157 local295 = Static206.method3444(local90);
					@Pc(298) Class1_Sub11 local298 = Static42.method777(local295);
					if (local298.method1120() || local298.method1124()) {
						Static66.aBoolean135 = false;
						Static225.anInt4216 = 0;
						if (Static126.aClass157_7 != null) {
							Static224.method3621(Static126.aClass157_7);
						}
						Static126.aClass157_7 = Static206.method3444(local90);
						Static58.anInt1235 = Static45.anInt1043;
						Static207.anInt5395 = local34;
						Static89.anInt1902 = Static186.anInt3549;
						Static224.method3621(Static126.aClass157_7);
						return;
					}
				}
			}
			if (local24 == 1 && (Static239.anInt4459 == 1 && Static241.anInt4470 > 2 || Static310.method4599(Static241.anInt4470 - 1))) {
				local24 = 2;
			}
			if (local24 == 2 && Static241.anInt4470 > 0 || Static17.anInt371 == 1) {
				Static138.method3843();
			}
			if (local24 == 1 && Static241.anInt4470 > 0 || Static17.anInt371 == 2) {
				Static8.method142();
			}
			return;
		}
		@Pc(32) int local32;
		if (local24 != 1) {
			local32 = Static89.anInt1899;
			local34 = Static14.anInt309;
			if (local32 < Static92.anInt1933 - 10 || local32 > Static229.anInt4962 + Static92.anInt1933 + 10 || local34 < Static48.anInt1073 - 10 || local34 > Static48.anInt1073 + Static282.anInt5139 + 10) {
				Static91.aBoolean183 = false;
				Static111.method2031(Static48.anInt1073, Static282.anInt5139, Static92.anInt1933, Static229.anInt4962);
			}
		}
		if (local24 != 1) {
			return;
		}
		local32 = Static92.anInt1933;
		@Pc(88) int local88 = Static45.anInt1043;
		local90 = Static229.anInt4962;
		@Pc(92) int local92 = -1;
		local34 = Static48.anInt1073;
		@Pc(96) int local96 = Static186.anInt3549;
		for (@Pc(98) int local98 = 0; local98 < Static241.anInt4470; local98++) {
			@Pc(121) int local121;
			if (Static284.aBoolean486) {
				local121 = local34 + (-local98 + -1 + Static241.anInt4470) * 15 + 33;
				if (local96 > local32 && local96 < local90 + local32 && local88 > local121 - 13 && local121 + 3 > local88) {
					local92 = local98;
				}
			} else {
				local121 = local34 + (-local98 + -1 + Static241.anInt4470) * 15 + 31;
				if (local96 > local32 && local90 + local32 > local96 && local88 > local121 - 13 && local88 < local121 + 3) {
					local92 = local98;
				}
			}
		}
		if (local92 != -1) {
			Static222.method3594(local92);
		}
		Static91.aBoolean183 = false;
		Static111.method2031(Static48.anInt1073, Static282.anInt5139, Static92.anInt1933, Static229.anInt4962);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIBII)V")
	public static void method102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg2;
		@Pc(10) int local10 = -arg2;
		@Pc(12) int local12 = 0;
		@Pc(14) int local14 = -1;
		@Pc(23) int local23 = Static306.method4566(arg1 + arg2, Static188.anInt3598, Static289.anInt5245);
		@Pc(36) int local36 = Static306.method4566(arg1 - arg2, Static188.anInt3598, Static289.anInt5245);
		Static103.method1978(arg0, local23, local36, Static40.anIntArrayArray6[arg3]);
		while (local12 < local7) {
			local14 += 2;
			local10 += local14;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(89) int local89;
			@Pc(98) int local98;
			if (local10 > 0) {
				local7--;
				local64 = arg3 - local7;
				local68 = local7 + arg3;
				local10 -= local7 << 1;
				if (Static231.anInt4333 <= local68 && Static218.anInt4086 >= local64) {
					local89 = Static306.method4566(local12 + arg1, Static188.anInt3598, Static289.anInt5245);
					local98 = Static306.method4566(arg1 - local12, Static188.anInt3598, Static289.anInt5245);
					if (local68 <= Static218.anInt4086) {
						Static103.method1978(arg0, local89, local98, Static40.anIntArrayArray6[local68]);
					}
					if (local64 >= Static231.anInt4333) {
						Static103.method1978(arg0, local89, local98, Static40.anIntArrayArray6[local64]);
					}
				}
			}
			local12++;
			local64 = arg3 - local12;
			local68 = local12 + arg3;
			if (Static231.anInt4333 <= local68 && Static218.anInt4086 >= local64) {
				local89 = Static306.method4566(local7 + arg1, Static188.anInt3598, Static289.anInt5245);
				local98 = Static306.method4566(arg1 - local7, Static188.anInt3598, Static289.anInt5245);
				if (Static218.anInt4086 >= local68) {
					Static103.method1978(arg0, local89, local98, Static40.anIntArrayArray6[local68]);
				}
				if (Static231.anInt4333 <= local64) {
					Static103.method1978(arg0, local89, local98, Static40.anIntArrayArray6[local64]);
				}
			}
		}
	}
}
