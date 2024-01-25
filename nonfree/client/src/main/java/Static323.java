import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!lo", name = "p", descriptor = "Lclient!vd;")
	public static Class353 aClass353_55;

	@OriginalMember(owner = "client!lo", name = "i", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_110 = new Class268(70, 6);

	@OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
	public static int anInt6179 = 0;

	@OriginalMember(owner = "client!lo", name = "e", descriptor = "(B)I")
	public static int method5374() {
		if (Static476.aFrame6 == null) {
			return Static104.aBoolean155 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIIII)V")
	public static void method5375(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg0 && arg1 == Static500.anInt8419 && arg2 == Static436.anInt7900 && (Static175.anInt3636 == Static110.anInt2165 || Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 1)) {
			return;
		}
		Static436.anInt7900 = arg2;
		Static500.anInt8419 = arg1;
		Static110.anInt2165 = Static175.anInt3636;
		if (Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 1) {
			Static110.anInt2165 = 0;
		}
		Static190.method3390(arg3);
		Static67.method1169(true, Static317.aClass192_12.method5299(Static307.anInt5931), Static176.aClass133_45, Static43.aClass50_2, Static162.aClass100_7);
		@Pc(60) int local60 = Static606.anInt8651;
		Static606.anInt8651 = (Static500.anInt8419 - (Static442.anInt7975 >> 4)) * 8;
		@Pc(70) int local70 = Static195.anInt3961;
		Static195.anInt3961 = (Static436.anInt7900 - (Static284.anInt7916 >> 4)) * 8;
		Static442.aClass6_Sub2_Sub11_3 = Static487.method6432(Static500.anInt8419 * 8, Static436.anInt7900 * 8);
		Static273.aClass356_1 = null;
		@Pc(94) int local94 = Static606.anInt8651 - local60;
		@Pc(99) int local99 = Static195.anInt3961 - local70;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(170) int local170;
		@Pc(279) int local279;
		if (arg3 == 11) {
			for (local279 = 0; local279 < Static273.anInt5420; local279++) {
				@Pc(285) Class6_Sub46 local285 = Static1.aClass6_Sub46Array5[local279];
				if (local285 != null) {
					@Pc(290) Class20_Sub2_Sub2_Sub1_Sub2 local290 = local285.aClass20_Sub2_Sub2_Sub1_Sub2_1;
					for (local122 = 0; local122 < 10; local122++) {
						local290.anIntArray335[local122] -= local94;
						local290.anIntArray336[local122] -= local99;
					}
					local290.anInt10725 -= local94 * 512;
					local290.anInt10729 -= local99 * 512;
				}
			}
		} else {
			@Pc(106) boolean local106 = false;
			Static252.anInt5066 = 0;
			@Pc(114) int local114 = Static442.anInt7975 * 512 - 512;
			local120 = Static284.anInt7916 * 512 - 512;
			for (local122 = 0; local122 < Static273.anInt5420; local122++) {
				@Pc(128) Class6_Sub46 local128 = Static1.aClass6_Sub46Array5[local122];
				if (local128 != null) {
					@Pc(133) Class20_Sub2_Sub2_Sub1_Sub2 local133 = local128.aClass20_Sub2_Sub2_Sub1_Sub2_1;
					local133.anInt10729 -= local99 * 512;
					local133.anInt10725 -= local94 * 512;
					if (local133.anInt10725 >= 0 && local114 >= local133.anInt10725 && local133.anInt10729 >= 0 && local133.anInt10729 <= local120) {
						@Pc(168) boolean local168 = true;
						for (local170 = 0; local170 < 10; local170++) {
							local133.anIntArray335[local170] -= local94;
							local133.anIntArray336[local170] -= local99;
							if (local133.anIntArray335[local170] < 0 || Static442.anInt7975 <= local133.anIntArray335[local170] || local133.anIntArray336[local170] < 0 || local133.anIntArray336[local170] >= Static284.anInt7916) {
								local168 = false;
							}
						}
						if (local168) {
							Static483.anIntArray525[Static252.anInt5066++] = local133.anInt5567;
						} else {
							local133.method4928((Class247) null);
							local106 = true;
							local128.method9043();
						}
					} else {
						local133.method4928((Class247) null);
						local128.method9043();
						local106 = true;
					}
				}
			}
			if (local106) {
				Static273.anInt5420 = Static347.aClass128_23.method3554();
				Static347.aClass128_23.method3561(Static1.aClass6_Sub46Array5);
			}
		}
		for (local279 = 0; local279 < 2048; local279++) {
			@Pc(344) Class20_Sub2_Sub2_Sub1_Sub1 local344 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local279];
			if (local344 != null) {
				for (local120 = 0; local120 < 10; local120++) {
					local344.anIntArray335[local120] -= local94;
					local344.anIntArray336[local120] -= local99;
				}
				local344.anInt10729 -= local99 * 512;
				local344.anInt10725 -= local94 * 512;
			}
		}
		@Pc(396) Class19[] local396 = Static325.aClass19Array1;
		for (local120 = 0; local120 < local396.length; local120++) {
			@Pc(404) Class19 local404 = local396[local120];
			if (local404 != null) {
				local404.anInt339 -= local99 * 512;
				local404.anInt333 -= local94 * 512;
			}
		}
		@Pc(434) Class6_Sub6 local434;
		for (local434 = (Class6_Sub6) Static26.aClass8_7.method149(); local434 != null; local434 = (Class6_Sub6) Static26.aClass8_7.method155()) {
			local434.anInt1250 -= local99;
			local434.anInt1247 -= local94;
			if (Static152.anInt5122 != 4 && (local434.anInt1247 < 0 || local434.anInt1250 < 0 || Static442.anInt7975 <= local434.anInt1247 || local434.anInt1250 >= Static284.anInt7916)) {
				local434.method9043();
			}
		}
		for (local434 = (Class6_Sub6) Static69.aClass8_9.method149(); local434 != null; local434 = (Class6_Sub6) Static69.aClass8_9.method155()) {
			local434.anInt1247 -= local94;
			local434.anInt1250 -= local99;
			if (Static152.anInt5122 != 4 && (local434.anInt1247 < 0 || local434.anInt1250 < 0 || Static442.anInt7975 <= local434.anInt1247 || Static284.anInt7916 <= local434.anInt1250)) {
				local434.method9043();
			}
		}
		if (Static152.anInt5122 != 4) {
			for (@Pc(541) Class6_Sub41 local541 = (Class6_Sub41) Static333.aClass128_46.method3556(); local541 != null; local541 = (Class6_Sub41) Static333.aClass128_46.method3555()) {
				@Pc(549) int local549 = (int) (local541.aLong278 & 0x3FFFL);
				@Pc(553) int local553 = local549 - Static606.anInt8651;
				local170 = (int) (local541.aLong278 >> 14 & 0x3FFFL);
				@Pc(565) int local565 = local170 - Static195.anInt3961;
				if (local553 < 0 || local565 < 0 || Static442.anInt7975 <= local553 || local565 >= Static284.anInt7916) {
					local541.method9043();
				}
			}
		}
		if (Static106.anInt2100 != 0) {
			Static51.anInt935 -= local99;
			Static106.anInt2100 -= local94;
		}
		Static551.method7994();
		if (arg3 != 11) {
			Static80.anInt1683 -= local94;
			Static636.anInt10648 -= local94;
			Static580.anInt9662 -= local94 * 512;
			Static524.anInt9123 -= local99 * 512;
			Static16.anInt283 -= local99;
			Static81.anInt1699 -= local99;
			if (Math.abs(local94) > Static442.anInt7975 || Math.abs(local99) > Static284.anInt7916) {
				Static245.method5548();
			}
		} else if (Static334.anInt6354 == 4) {
			Static359.anInt6657 -= local99 * 512;
			Static96.anInt1900 -= local94 * 512;
			Static559.anInt9491 -= local99 * 512;
			Static614.anInt10099 -= local94 * 512;
		} else {
			Static624.anInt10280 = -1;
			Static160.anInt3352 = -1;
			Static334.anInt6354 = 1;
		}
		Static497.method7422();
		Static147.method2345();
		Static576.aClass8_29.method154();
		Static364.aClass8_36.method154();
		Static78.aClass81_1.method2122();
		Static517.method7742();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLclient!rg;)Lclient!jv;")
	public static Class167 method5376(@OriginalArg(1) Class6_Sub40 arg0) {
		@Pc(7) int local7 = arg0.method8571();
		@Pc(14) Class238 local14 = Static613.method8515()[arg0.method8604()];
		@Pc(30) Class79 local30 = Static23.method3614()[arg0.method8604()];
		@Pc(34) int local34 = arg0.method8615();
		@Pc(38) int local38 = arg0.method8615();
		return new Class167(local7, local14, local30, local34, local38);
	}
}
