import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
	public static int anInt7100 = -1;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
	public static int anInt7103 = -1;

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V")
	public static void method6357() {
		@Pc(15) Class2_Sub49 local15;
		for (local15 = (Class2_Sub49) Static338.aClass271_39.method7177(); local15 != null; local15 = (Class2_Sub49) Static338.aClass271_39.method7175()) {
			Static574.method8722(local15, false);
		}
		for (local15 = (Class2_Sub49) Static545.aClass271_58.method7177(); local15 != null; local15 = (Class2_Sub49) Static545.aClass271_58.method7175()) {
			Static574.method8722(local15, true);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	public static void method6358(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub1_Sub11 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class18 local8 = Static549.aClass18Array30[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static202.anInt4238; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static585.anInt10170; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static170.anInt3602;
							@Pc(32) int local32 = local12 << Static170.anInt3602;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class18 local41 = Static549.aClass18Array30[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8537(local12, local15) - local41.method8537(local12, local15);
									@Pc(71) int local71 = local8.method8537(local12, local15 + 1) - local41.method8537(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8537(local12 + 1, local15 + 1) - local41.method8537(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8537(local12 + 1, local15) - local41.method8537(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)Lclient!jn;")
	public static Class2_Sub1_Sub10 method6359(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub10 local10 = (Class2_Sub1_Sub10) Static646.aClass42_4.method1177((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static670.aClass124_86.method3641(arg0, 0);
		if (local20 == null || local20.length <= 1) {
			return null;
		}
		try {
			local10 = Static663.method9678(local20);
		} catch (@Pc(46) Exception local46) {
			throw new RuntimeException(local46.getMessage() + " S: " + arg0);
		}
		Static646.aClass42_4.method1175(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)V")
	public static void method6360(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg3 * arg3;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg3 << 1;
		@Pc(38) int local38 = local21 + (1 - local29) * local13;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg3 << 1) - 3);
		@Pc(77) int local77 = local55;
		Static567.method8614(arg2 - arg1, arg2 - -arg1, Static186.anIntArrayArray12[arg0], arg4);
		@Pc(105) int local105 = local51 * (arg3 - 1);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local38 += local63;
					local7++;
					local63 += local55;
					local77 += local55;
				}
			}
			if (local47 < 0) {
				local47 += local77;
				local38 += local63;
				local77 += local55;
				local7++;
				local63 += local55;
			}
			local38 += -local105;
			local47 += -local71;
			local105 -= local51;
			local9--;
			local71 -= local51;
			@Pc(179) int local179 = arg0 - local9;
			@Pc(183) int local183 = local9 + arg0;
			@Pc(187) int local187 = local7 + arg2;
			@Pc(192) int local192 = arg2 - local7;
			Static567.method8614(local192, local187, Static186.anIntArrayArray12[local179], arg4);
			Static567.method8614(local192, local187, Static186.anIntArrayArray12[local183], arg4);
		}
	}
}
