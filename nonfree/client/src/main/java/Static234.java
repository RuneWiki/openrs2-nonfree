import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static234 {

	@OriginalMember(owner = "client!nq", name = "M", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_7 = new Class136("", 16);

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILjava/lang/String;IZ)I")
	public static int method4206(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1) {
		@Pc(24) boolean local24 = false;
		@Pc(26) boolean local26 = false;
		@Pc(28) int local28 = 0;
		@Pc(31) int local31 = arg0.length();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(39) char local39 = arg0.charAt(local33);
			if (local33 == 0) {
				if (local39 == '-') {
					local24 = true;
					continue;
				}
				if (local39 == '+') {
					continue;
				}
			}
			@Pc(88) int local88;
			if (local39 >= '0' && local39 <= '9') {
				local88 = local39 - '0';
			} else if (local39 >= 'A' && local39 <= 'Z') {
				local88 = local39 - '7';
			} else if (local39 >= 'a' && local39 <= 'z') {
				local88 = local39 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (local88 >= arg1) {
				throw new NumberFormatException();
			}
			if (local24) {
				local88 = -local88;
			}
			@Pc(112) int local112 = local88 + local28 * arg1;
			if (local112 / arg1 != local28) {
				throw new NumberFormatException();
			}
			local28 = local112;
			local26 = true;
		}
		if (!local26) {
			throw new NumberFormatException();
		}
		return local28;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!oj;IBIILclient!qh;III)Lclient!qh;")
	public static Class159 method4208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class159 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(6) long local6 = (long) arg8;
		@Pc(20) Class159 local20 = (Class159) Static120.aClass41_29.method823(local6);
		if (local20 == null) {
			@Pc(30) Class130 local30 = Static215.method3852(Static88.aClass83_41, arg8);
			if (local30 == null) {
				return null;
			}
			local20 = arg2.method2540(local30, 1031, Static31.anInt460, 64, 768);
			Static120.aClass41_29.method832(local6, local20);
		}
		local20 = local20.method4927((byte) 2, 1031, true);
		if (arg9 != 0) {
			local20.method4969(arg9);
		}
		if (arg7 != 0) {
			local20.method4954(arg7);
		}
		if (arg3 != 0) {
			local20.method4968(arg3);
		}
		if (arg4 != 0) {
			local20.method4945(0, arg4, 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "(I)V")
	public static void method4209() {
		for (@Pc(14) Class2_Sub7_Sub15 local14 = (Class2_Sub7_Sub15) Static307.aClass238_33.method5795(); local14 != null; local14 = (Class2_Sub7_Sub15) Static307.aClass238_33.method5799()) {
			@Pc(19) Class1_Sub2_Sub5 local19 = local14.aClass1_Sub2_Sub5_1;
			if (local19.aByte73 != Static241.anInt2711 || local19.anInt5809 < Static339.anInt6265) {
				local14.method6130();
				local19.method5129();
			} else if (Static339.anInt6265 >= local19.anInt5792) {
				if (local19.anInt5790 > 0) {
					@Pc(52) Class1_Sub2_Sub1_Sub2 local52 = Static223.aClass1_Sub2_Sub1_Sub2Array1[local19.anInt5790 - 1];
					if (local52 != null && local52.anInt6800 >= 0 && local52.anInt6800 < Static89.anInt1891 * 128 && local52.anInt6798 >= 0 && Static85.anInt1839 * 128 > local52.anInt6798) {
						local19.method5124(Static339.anInt6265, local52.anInt6798, Static36.method2335(local52.anInt6798, local19.aByte73, local52.anInt6800) - local19.anInt5814, local52.anInt6800);
					}
				}
				if (local19.anInt5790 < 0) {
					@Pc(110) int local110 = -local19.anInt5790 - 1;
					@Pc(117) Class1_Sub2_Sub1_Sub1 local117;
					if (local110 == Static93.anInt1976) {
						local117 = Static182.aClass1_Sub2_Sub1_Sub1_1;
					} else {
						local117 = Static42.aClass1_Sub2_Sub1_Sub1Array1[local110];
					}
					if (local117 != null && local117.anInt6800 >= 0 && local117.anInt6800 < Static89.anInt1891 * 128 && local117.anInt6798 >= 0 && Static85.anInt1839 * 128 > local117.anInt6798) {
						local19.method5124(Static339.anInt6265, local117.anInt6798, Static36.method2335(local117.anInt6798, local19.aByte73, local117.anInt6800) - local19.anInt5814, local117.anInt6800);
					}
				}
				local19.method5128(Static278.anInt5166);
				Static233.method4185(local19, true);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "(I)V")
	public static void method4210() {
		Static67.aClass2_Sub11_Sub1_1.method1800();
		Static194.aClass83_72 = null;
		Static348.anInt6384 = 1;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)Lclient!mg;")
	public static Class7_Sub5 method4211(@OriginalArg(1) int arg0) {
		@Pc(12) Class199[] local12 = Class250.aClass199Array1;
		synchronized (Class250.aClass199Array1) {
			@Pc(32) Class7_Sub5 local32;
			if (arg0 >= Class250.aClass199Array1.length || Class250.aClass199Array1[arg0].method4907()) {
				local32 = new Class7_Sub5();
				local32.aClass7_Sub6Array1 = new Class7_Sub6[arg0];
				for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
					local32.aClass7_Sub6Array1[local38] = new Class7_Sub6();
				}
			} else {
				local32 = (Class7_Sub5) Class250.aClass199Array1[arg0].method4897();
				local32.method5398();
				@Pc(71) int local71 = Static75.anIntArray125[arg0]--;
			}
			return local32;
		}
	}
}
