import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!kda", name = "c", descriptor = "Lclient!f;")
	public static Class14 aClass14_16;

	@OriginalMember(owner = "client!kda", name = "b", descriptor = "Lclient!ad;")
	public static final Class6 aClass6_29 = new Class6(5);

	@OriginalMember(owner = "client!kda", name = "a", descriptor = "(BIIZI)V")
	public static void method4138(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && arg1 == Static110.anInt2172 && Static132.anInt9449 == arg3 && (Static117.anInt2694 == Static364.anInt645 || Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312))) {
			return;
		}
		Static364.anInt645 = Static117.anInt2694;
		Static110.anInt2172 = arg1;
		Static132.anInt9449 = arg3;
		if (Static405.aClass3_Sub3_Sub1_1.method6312(Static60.anInt1312)) {
			Static364.anInt645 = 0;
		}
		Static25.method439(arg0);
		Static525.method7021(Static544.aClass343_16.method7222(Static256.anInt4535), Static505.aClass45_11, Static569.aClass54_9, Static521.aClass134_12, true);
		@Pc(54) int local54 = Static335.anInt5608;
		@Pc(56) int local56 = Static246.anInt4344;
		Static335.anInt5608 = (Static110.anInt2172 - (Static54.anInt1038 >> 4)) * 8;
		Static246.anInt4344 = (Static132.anInt9449 - (Static140.anInt3026 >> 4)) * 8;
		Static173.aClass3_Sub7_Sub17_2 = Static44.method7653(Static110.anInt2172 * 8, Static132.anInt9449 * 8);
		Static319.aClass355_2 = null;
		@Pc(88) int local88 = Static335.anInt5608 - local54;
		@Pc(98) int local98 = Static246.anInt4344 - local56;
		@Pc(103) int local103;
		@Pc(116) int local116;
		@Pc(236) int local236;
		@Pc(178) int local178;
		if (arg0 == 11) {
			for (local103 = 0; local103 < Static137.anInt2977; local103++) {
				@Pc(109) Class3_Sub34 local109 = Static441.aClass3_Sub34Array1[local103];
				if (local109 != null) {
					@Pc(114) Class41_Sub2_Sub1_Sub4_Sub1 local114 = local109.aClass41_Sub2_Sub1_Sub4_Sub1_2;
					for (local116 = 0; local116 < 10; local116++) {
						local114.anIntArray629[local116] -= local88;
						local114.anIntArray628[local116] -= local98;
					}
					local114.anInt9444 -= local88 * 512;
					local114.anInt9442 -= local98 * 512;
				}
			}
		} else {
			Static88.anInt1884 = 0;
			@Pc(166) boolean local166 = false;
			@Pc(172) int local172 = Static54.anInt1038 * 512 - 512;
			local178 = Static140.anInt3026 * 512 - 512;
			for (local116 = 0; local116 < Static137.anInt2977; local116++) {
				@Pc(186) Class3_Sub34 local186 = Static441.aClass3_Sub34Array1[local116];
				if (local186 != null) {
					@Pc(191) Class41_Sub2_Sub1_Sub4_Sub1 local191 = local186.aClass41_Sub2_Sub1_Sub4_Sub1_2;
					local191.anInt9442 -= local98 * 512;
					local191.anInt9444 -= local88 * 512;
					if (local191.anInt9444 >= 0 && local172 >= local191.anInt9444 && local191.anInt9442 >= 0 && local178 >= local191.anInt9442) {
						@Pc(234) boolean local234 = true;
						for (local236 = 0; local236 < 10; local236++) {
							local191.anIntArray629[local236] -= local88;
							local191.anIntArray628[local236] -= local98;
							if (local191.anIntArray629[local236] < 0 || Static54.anInt1038 <= local191.anIntArray629[local236] || local191.anIntArray628[local236] < 0 || Static140.anInt3026 <= local191.anIntArray628[local236]) {
								local234 = false;
							}
						}
						if (local234) {
							Static445.anIntArray470[Static88.anInt1884++] = local191.anInt9472;
						} else {
							local191.method5661(null);
							local166 = true;
							local186.method7825();
						}
					} else {
						local191.method5661(null);
						local186.method7825();
						local166 = true;
					}
				}
			}
			if (local166) {
				Static137.anInt2977 = Static213.aClass354_37.method7688();
				Static213.aClass354_37.method7695(Static441.aClass3_Sub34Array1);
			}
		}
		for (local103 = 0; local103 < 2048; local103++) {
			@Pc(342) Class41_Sub2_Sub1_Sub4_Sub2 local342 = Static220.aClass41_Sub2_Sub1_Sub4_Sub2Array1[local103];
			if (local342 != null) {
				for (local178 = 0; local178 < 10; local178++) {
					local342.anIntArray629[local178] -= local88;
					local342.anIntArray628[local178] -= local98;
				}
				local342.anInt9444 -= local88 * 512;
				local342.anInt9442 -= local98 * 512;
			}
		}
		@Pc(394) Class205[] local394 = Static283.aClass205Array1;
		for (local178 = 0; local178 < local394.length; local178++) {
			@Pc(402) Class205 local402 = local394[local178];
			if (local402 != null) {
				local402.anInt5481 -= local88 * 512;
				local402.anInt5474 -= local98 * 512;
			}
		}
		for (@Pc(434) Class3_Sub26 local434 = (Class3_Sub26) Static469.aClass112_27.method3088(); local434 != null; local434 = (Class3_Sub26) Static469.aClass112_27.method3084()) {
			local434.anInt3735 -= local98;
			local434.anInt3738 -= local88;
			if (Static39.anInt749 != 4 && (local434.anInt3738 < 0 || local434.anInt3735 < 0 || local434.anInt3738 >= Static54.anInt1038 || Static140.anInt3026 <= local434.anInt3735)) {
				local434.method7825();
			}
		}
		if (Static39.anInt749 != 4) {
			for (@Pc(487) Class3_Sub31 local487 = (Class3_Sub31) Static211.aClass354_17.method7694(); local487 != null; local487 = (Class3_Sub31) Static211.aClass354_17.method7692()) {
				@Pc(495) int local495 = (int) (local487.aLong273 & 0x3FFFL);
				@Pc(499) int local499 = local495 - Static335.anInt5608;
				local236 = (int) (local487.aLong273 >> 14 & 0x3FFFL);
				@Pc(512) int local512 = local236 - Static246.anInt4344;
				if (local499 < 0 || local512 < 0 || Static54.anInt1038 <= local499 || Static140.anInt3026 <= local512) {
					local487.method7825();
				}
			}
		}
		if (Static551.anInt8768 != 0) {
			Static125.anInt2831 -= local98;
			Static551.anInt8768 -= local88;
		}
		Static153.method2892();
		if (arg0 != 11) {
			Static92.anInt1927 -= local98;
			Static226.anInt3984 -= local88 * 512;
			Static379.anInt6484 -= local88;
			Static413.anInt7051 -= local88;
			Static350.anInt6080 -= local98 * 512;
			Static399.anInt6956 -= local98;
			if (Math.abs(local88) > Static54.anInt1038 || Math.abs(local98) > Static140.anInt3026) {
				Static428.method6060();
			}
		} else if (Static379.anInt6482 == 4) {
			Static28.anInt516 -= local88 * 512;
			Static18.anInt315 -= local98 * 512;
			Static205.anInt3767 -= local88 * 512;
			Static521.anInt8385 -= local98 * 512;
		} else {
			Static379.anInt6482 = 1;
			Static391.anInt6856 = -1;
			Static18.anInt314 = -1;
		}
		Static426.method6039();
		Static512.method6889();
		Static432.aClass112_51.method3092();
		Static103.aClass112_16.method3092();
		Static82.aClass178_21.method4162();
		Static324.method4692();
	}
}
