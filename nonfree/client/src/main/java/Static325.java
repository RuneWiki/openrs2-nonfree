import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(II[BIII)Z")
	public static boolean method4454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(24) Class1_Sub35 local24 = new Class1_Sub35(arg2);
		@Pc(26) int local26 = -1;
		label68: while (true) {
			@Pc(32) int local32 = local24.method5746();
			if (local32 == 0) {
				return local7;
			}
			local26 += local32;
			@Pc(43) int local43 = 0;
			@Pc(45) boolean local45 = false;
			while (true) {
				@Pc(77) int local77;
				@Pc(112) Class95 local112;
				do {
					@Pc(82) int local82;
					@Pc(86) int local86;
					do {
						do {
							do {
								do {
									@Pc(53) int local53;
									while (local45) {
										local53 = local24.method5739();
										if (local53 == 0) {
											continue label68;
										}
										local24.method5750();
									}
									local53 = local24.method5739();
									if (local53 == 0) {
										continue label68;
									}
									local43 += local53 - 1;
									@Pc(65) int local65 = local43 & 0x3F;
									@Pc(71) int local71 = local43 >> 6 & 0x3F;
									local77 = local24.method5750() >> 2;
									local82 = local71 + arg1;
									local86 = arg4 + local65;
								} while (local82 <= 0);
							} while (local86 <= 0);
						} while (local82 >= arg0 - 1);
					} while (arg3 - 1 <= local86);
					local112 = Static518.aClass96_4.method1925(local26);
				} while (local77 == 22 && !Static348.aClass1_Sub30_Sub1_1.aBoolean392 && local112.anInt2399 == 0 && local112.anInt2428 != 1 && !local112.aBoolean173);
				local45 = true;
				if (!local112.method1916()) {
					local7 = false;
					Static2.anInt50++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!r;IIIIBI)Lclient!da;")
	public static Class63 method4455(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg3;
		@Pc(12) Class63 local12 = (Class63) Static201.aClass222_24.method4430(local6);
		if (local12 == null) {
			@Pc(22) Class210 local22 = Static127.method2013(arg3, Static412.aClass270_84);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt5251 < 13) {
				local22.method4260();
			}
			local12 = arg0.method6910(local22, 2055, Static6.anInt67, 64, 768);
			Static201.aClass222_24.method4434(local12, local6);
		}
		local12 = local12.method7417((byte) 2, 2055, true);
		if (arg4 != 0) {
			local12.M(arg4);
		}
		if (arg5 != 0) {
			local12.MA(arg5);
		}
		if (arg1 != 0) {
			local12.W(arg1);
		}
		if (arg2 != 0) {
			local12.oa(0, arg2, 0);
		}
		return local12;
	}
}
