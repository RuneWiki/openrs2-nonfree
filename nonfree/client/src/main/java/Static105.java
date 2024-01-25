import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "Lclient!bm;")
	public static Class28 aClass28_2;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIZ)V")
	public static void method1940(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(43) int local43 = Static248.aShort63 + (Static46.aShort3 - Static248.aShort63) * local21 / 100;
		if (local43 < Static252.aShort64) {
			local43 = Static252.aShort64;
		} else if (local43 > Static435.aShort95) {
			local43 = Static435.aShort95;
		}
		@Pc(77) int local77 = arg3 * local43 * 512 / (arg0 * 334);
		@Pc(114) int local114;
		@Pc(121) int local121;
		@Pc(89) short local89;
		if (local77 < Static67.aShort16) {
			local89 = Static67.aShort16;
			local43 = local89 * arg0 * 334 / (arg3 * 512);
			if (Static435.aShort95 < local43) {
				local43 = Static435.aShort95;
				local114 = local43 * 512 * arg3 / (local89 * 334);
				local121 = (arg0 - local114) / 2;
				if (arg4) {
					Static33.aClass49_1.e();
					Static33.aClass49_1.method4480(arg2, local121, -16777216, arg1, arg3);
					Static33.aClass49_1.method4480(arg0 + arg2 - local121, local121, -16777216, arg1, arg3);
				}
				arg2 += local121;
				arg0 -= local121 * 2;
			}
		} else if (Static172.aShort43 < local77) {
			local89 = Static172.aShort43;
			local43 = arg0 * 334 * local89 / (arg3 * 512);
			if (local43 < Static252.aShort64) {
				local43 = Static252.aShort64;
				local114 = local89 * 334 * arg0 / (local43 * 512);
				local121 = (arg3 - local114) / 2;
				if (arg4) {
					Static33.aClass49_1.e();
					Static33.aClass49_1.method4480(arg2, arg0, -16777216, arg1, local121);
					Static33.aClass49_1.method4480(arg2, arg0, -16777216, arg1 + arg3 - local121, local121);
				}
				arg3 -= local121 * 2;
				arg1 += local121;
			}
		}
		Static380.anInt6430 = arg2;
		Static394.anInt6579 = arg1;
		Static26.anInt615 = (short) arg0;
		Static149.anInt3091 = arg3 * local43 / 334;
		Static201.anInt3540 = (short) arg3;
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!si;IB)V")
	public static void method1942(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (Static194.aClass220_1 == null) {
			return;
		}
		try {
			Static194.aClass220_1.method4796(0L);
			Static194.aClass220_1.method4794(24, arg1, arg0.aByteArray130);
		} catch (@Pc(14) Exception local14) {
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z[Lclient!em;I)V")
	public static void method1943(@OriginalArg(1) Class68[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) Class68 local9 = arg0[local3];
			if (local9 != null && local9.anInt2221 == arg1 && !Static47.method781(local9)) {
				if (local9.anInt2249 == 0) {
					method1943(arg0, local9.anInt2229);
					if (local9.aClass68Array1 != null) {
						method1943(local9.aClass68Array1, local9.anInt2229);
					}
					@Pc(50) Class2_Sub35 local50 = (Class2_Sub35) Static113.aClass163_11.method3769((long) local9.anInt2229);
					if (local50 != null) {
						Static131.method2234(local50.anInt5537);
					}
				}
				if (local9.anInt2249 == 6 && local9.anInt2222 != -1) {
					@Pc(71) Class250 local71 = Static338.aClass12_2.method255(local9.anInt2222);
					if (local71 != null) {
						local9.anInt2210 += Static377.anInt6400;
						while (local9.anInt2210 > local71.anIntArray594[local9.anInt2224]) {
							local9.anInt2210 -= local71.anIntArray594[local9.anInt2224];
							local9.anInt2224++;
							if (local9.anInt2224 >= local71.anIntArray592.length) {
								local9.anInt2224 -= local71.anInt7016;
								if (local9.anInt2224 < 0 || local9.anInt2224 >= local71.anIntArray592.length) {
									local9.anInt2224 = 0;
								}
							}
							local9.anInt2231 = local9.anInt2224 + 1;
							if (local71.anIntArray592.length <= local9.anInt2231) {
								local9.anInt2231 -= local71.anInt7016;
								if (local9.anInt2231 < 0 || local9.anInt2231 >= local71.anIntArray592.length) {
									local9.anInt2231 = -1;
								}
							}
							Static78.method1460(local9);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "(I)V")
	public static void method1944() {
		for (@Pc(13) int local13 = 0; local13 < Static227.aClass22ArrayArray1.length; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static227.aClass22ArrayArray1[local13].length; local17++) {
				Static227.aClass22ArrayArray1[local13][local17] = Static344.aClass22_2;
			}
		}
	}
}
