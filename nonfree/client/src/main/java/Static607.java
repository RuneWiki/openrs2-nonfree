import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static607 {

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "[I")
	public static int[] anIntArray658;

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "Lclient!jk;")
	public static Class173 aClass173_7;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "Lclient!qt;")
	public static Class282 aClass282_15;

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "[I")
	public static final int[] anIntArray659 = new int[14];

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(FFFI)F")
	public static float method8698(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		return (arg1 - arg2) * arg0 + arg2;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIZ)V")
	public static void method8701(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && Static482.anInt8390 == arg2 && arg0 == Static133.anInt2704 && (Static35.anInt1167 == Static549.anInt9262 || Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 1)) {
			return;
		}
		Static482.anInt8390 = arg2;
		Static35.anInt1167 = Static549.anInt9262;
		Static133.anInt2704 = arg0;
		if (Static262.aClass3_Sub27_12.aClass21_Sub8_2.method2406() == 1) {
			Static35.anInt1167 = 0;
		}
		Static256.method4279(arg1);
		Static301.method4799(Static256.aClass282_7, Static323.aClass5_9, Static187.aClass62_4, true, Static59.aClass43_12.method1598(Static325.anInt6083));
		@Pc(61) int local61 = Static299.anInt5307;
		Static299.anInt5307 = (Static482.anInt8390 - (Static634.anInt10129 >> 4)) * 8;
		@Pc(71) int local71 = Static171.anInt3340;
		Static171.anInt3340 = (Static133.anInt2704 - (Static638.anInt10172 >> 4)) * 8;
		Static76.aClass3_Sub4_Sub11_1 = Static110.method2789(Static482.anInt8390 * 8, Static133.anInt2704 * 8);
		Static531.aClass156_8 = null;
		@Pc(94) int local94 = Static299.anInt5307 - local61;
		@Pc(99) int local99 = Static171.anInt3340 - local71;
		@Pc(120) int local120;
		@Pc(122) int local122;
		@Pc(184) int local184;
		@Pc(275) int local275;
		if (arg1 == 11) {
			for (local275 = 0; local275 < Static294.anInt5193; local275++) {
				@Pc(281) Class3_Sub28 local281 = Static28.aClass3_Sub28Array1[local275];
				if (local281 != null) {
					@Pc(286) Class4_Sub1_Sub2_Sub1_Sub1 local286 = local281.aClass4_Sub1_Sub2_Sub1_Sub1_2;
					for (local122 = 0; local122 < 10; local122++) {
						local286.anIntArray310[local122] -= local94;
						local286.anIntArray309[local122] -= local99;
					}
					local286.anInt8911 -= local99 * 512;
					local286.anInt8916 -= local94 * 512;
				}
			}
		} else {
			Static94.anInt2209 = 0;
			@Pc(108) boolean local108 = false;
			@Pc(114) int local114 = Static634.anInt10129 * 512 - 512;
			local120 = Static638.anInt10172 * 512 - 512;
			for (local122 = 0; local122 < Static294.anInt5193; local122++) {
				@Pc(128) Class3_Sub28 local128 = Static28.aClass3_Sub28Array1[local122];
				if (local128 != null) {
					@Pc(133) Class4_Sub1_Sub2_Sub1_Sub1 local133 = local128.aClass4_Sub1_Sub2_Sub1_Sub1_2;
					local133.anInt8916 -= local94 * 512;
					local133.anInt8911 -= local99 * 512;
					if (local133.anInt8916 >= 0 && local114 >= local133.anInt8916 && local133.anInt8911 >= 0 && local133.anInt8911 <= local120) {
						@Pc(182) boolean local182 = true;
						for (local184 = 0; local184 < 10; local184++) {
							local133.anIntArray310[local184] -= local94;
							local133.anIntArray309[local184] -= local99;
							if (local133.anIntArray310[local184] < 0 || local133.anIntArray310[local184] >= Static634.anInt10129 || local133.anIntArray309[local184] < 0 || local133.anIntArray309[local184] >= Static638.anInt10172) {
								local182 = false;
							}
						}
						if (local182) {
							Static520.anIntArray594[Static94.anInt2209++] = local133.anInt5759;
						} else {
							local133.method3334(null);
							local128.method8769();
							local108 = true;
						}
					} else {
						local133.method3334(null);
						local128.method8769();
						local108 = true;
					}
				}
			}
			if (local108) {
				Static294.anInt5193 = Static551.aClass280_43.method7106();
				Static551.aClass280_43.method7104(Static28.aClass3_Sub28Array1);
			}
		}
		for (local275 = 0; local275 < 2048; local275++) {
			@Pc(342) Class4_Sub1_Sub2_Sub1_Sub2 local342 = Static42.aClass4_Sub1_Sub2_Sub1_Sub2Array1[local275];
			if (local342 != null) {
				for (local120 = 0; local120 < 10; local120++) {
					local342.anIntArray310[local120] -= local94;
					local342.anIntArray309[local120] -= local99;
				}
				local342.anInt8916 -= local94 * 512;
				local342.anInt8911 -= local99 * 512;
			}
		}
		@Pc(392) Class251[] local392 = Static82.aClass251Array1;
		for (local120 = 0; local120 < local392.length; local120++) {
			@Pc(400) Class251 local400 = local392[local120];
			if (local400 != null) {
				local400.anInt7487 -= local94 * 512;
				local400.anInt7477 -= local99 * 512;
			}
		}
		for (@Pc(434) Class3_Sub40 local434 = (Class3_Sub40) Static229.aClass223_18.method5874(); local434 != null; local434 = (Class3_Sub40) Static229.aClass223_18.method5870()) {
			local434.anInt7265 -= local99;
			local434.anInt7269 -= local94;
			if (Static402.anInt7435 != 4 && (local434.anInt7269 < 0 || local434.anInt7265 < 0 || Static634.anInt10129 <= local434.anInt7269 || Static638.anInt10172 <= local434.anInt7265)) {
				local434.method8769();
			}
		}
		if (Static402.anInt7435 != 4) {
			for (@Pc(483) Class3_Sub51 local483 = (Class3_Sub51) Static356.aClass280_28.method7110(); local483 != null; local483 = (Class3_Sub51) Static356.aClass280_28.method7108()) {
				@Pc(491) int local491 = (int) (local483.aLong276 & 0x3FFFL);
				@Pc(496) int local496 = local491 - Static299.anInt5307;
				local184 = (int) (local483.aLong276 >> 14 & 0x3FFFL);
				@Pc(509) int local509 = local184 - Static171.anInt3340;
				if (local496 < 0 || local509 < 0 || Static634.anInt10129 <= local496 || local509 >= Static638.anInt10172) {
					local483.method8769();
				}
			}
		}
		if (Static520.anInt9372 != 0) {
			Static300.anInt5337 -= local99;
			Static520.anInt9372 -= local94;
		}
		Static509.method7602();
		if (arg1 != 11) {
			Static22.anInt921 -= local99;
			Static611.anInt9892 -= local94 * 512;
			Static39.anInt1251 -= local94;
			Static20.anInt824 -= local99 * 512;
			Static221.anInt4220 -= local94;
			Static337.anInt6315 -= local99;
			if (Math.abs(local94) > Static634.anInt10129 || Math.abs(local99) > Static638.anInt10172) {
				Static175.method3056();
			}
		} else if (Static305.anInt5422 == 4) {
			Static410.anInt7502 -= local94 * 512;
			Static602.anInt9811 -= local94 * 512;
			Static528.anInt9022 -= local99 * 512;
			Static349.anInt6751 -= local99 * 512;
		} else {
			Static331.anInt6175 = -1;
			Static530.anInt9071 = -1;
			Static305.anInt5422 = 1;
		}
		Static209.method3563();
		Static628.method4779();
		Static108.aClass223_12.method5862();
		Static367.aClass223_42.method5862();
		Static543.aClass120_8.method2964();
		Static11.method8399();
	}

	@OriginalMember(owner = "client!vn", name = "f", descriptor = "(I)V")
	public static void method8702() {
		@Pc(18) int local18 = Static221.anInt4220 * 512 + 256;
		@Pc(24) int local24 = Static22.anInt921 * 512 + 256;
		@Pc(33) int local33 = Static192.method3263(local24, local18, Static549.anInt9262) - Static637.anInt10169;
		if (Static196.anInt3843 < 100) {
			if (Static611.anInt9892 < local18) {
				Static611.anInt9892 += Static196.anInt3843 * (local18 - Static611.anInt9892) / 1000 + Static551.anInt9268;
				if (Static611.anInt9892 > local18) {
					Static611.anInt9892 = local18;
				}
			}
			if (Static557.anInt9304 < local33) {
				Static557.anInt9304 += (local33 - Static557.anInt9304) * Static196.anInt3843 / 1000 + Static551.anInt9268;
				if (local33 < Static557.anInt9304) {
					Static557.anInt9304 = local33;
				}
			}
			if (local18 < Static611.anInt9892) {
				Static611.anInt9892 -= Static196.anInt3843 * (Static611.anInt9892 - local18) / 1000 + Static551.anInt9268;
				if (local18 > Static611.anInt9892) {
					Static611.anInt9892 = local18;
				}
			}
			if (local33 < Static557.anInt9304) {
				Static557.anInt9304 -= Static551.anInt9268 + Static196.anInt3843 * (Static557.anInt9304 - local33) / 1000;
				if (local33 > Static557.anInt9304) {
					Static557.anInt9304 = local33;
				}
			}
			if (local24 > Static20.anInt824) {
				Static20.anInt824 += Static551.anInt9268 + (local24 - Static20.anInt824) * Static196.anInt3843 / 1000;
				if (Static20.anInt824 > local24) {
					Static20.anInt824 = local24;
				}
			}
			if (Static20.anInt824 > local24) {
				Static20.anInt824 -= (Static20.anInt824 - local24) * Static196.anInt3843 / 1000 + Static551.anInt9268;
				if (local24 > Static20.anInt824) {
					Static20.anInt824 = local24;
				}
			}
		} else {
			Static20.anInt824 = Static22.anInt921 * 512 + 256;
			Static611.anInt9892 = Static221.anInt4220 * 512 + 256;
			Static557.anInt9304 = Static192.method3263(Static20.anInt824, Static611.anInt9892, Static549.anInt9262) - Static637.anInt10169;
		}
		local24 = Static337.anInt6315 * 512 + 256;
		local18 = Static39.anInt1251 * 512 + 256;
		local33 = Static192.method3263(local24, local18, Static549.anInt9262) - Static596.anInt9759;
		@Pc(228) int local228 = local18 - Static611.anInt9892;
		@Pc(233) int local233 = local33 - Static557.anInt9304;
		@Pc(238) int local238 = local24 - Static20.anInt824;
		@Pc(249) int local249 = (int) Math.sqrt((double) (local238 * local238 + local228 * local228));
		@Pc(260) int local260 = (int) (Math.atan2((double) local233, (double) local249) * 2607.5945876176133D) & 0x3FFF;
		@Pc(271) int local271 = (int) (Math.atan2((double) local228, (double) local238) * -2607.5945876176133D) & 0x3FFF;
		if (local260 < 1024) {
			local260 = 1024;
		}
		if (local260 > 3072) {
			local260 = 3072;
		}
		if (Static393.anInt7268 < local260) {
			Static393.anInt7268 += (local260 - Static393.anInt7268 >> 3) * Static490.anInt8498 / 1000 + Static176.anInt3420 << 3;
			if (local260 < Static393.anInt7268) {
				Static393.anInt7268 = local260;
			}
		}
		if (local260 < Static393.anInt7268) {
			Static393.anInt7268 -= Static490.anInt8498 * (Static393.anInt7268 - local260 >> 3) / 1000 + Static176.anInt3420 << 3;
			if (Static393.anInt7268 < local260) {
				Static393.anInt7268 = local260;
			}
		}
		@Pc(340) int local340 = local271 - Static185.anInt5215;
		if (local340 > 8192) {
			local340 -= 16384;
		}
		if (local340 < -8192) {
			local340 += 16384;
		}
		local340 >>= 0x3;
		if (local340 > 0) {
			Static185.anInt5215 += Static176.anInt3420 + local340 * Static490.anInt8498 / 1000 << 3;
			Static185.anInt5215 &= 0x3FFF;
		}
		if (local340 < 0) {
			Static185.anInt5215 -= Static176.anInt3420 + Static490.anInt8498 * -local340 / 1000 << 3;
			Static185.anInt5215 &= 0x3FFF;
		}
		@Pc(399) int local399 = local271 - Static185.anInt5215;
		if (local399 > 8192) {
			local399 -= 16384;
		}
		if (local399 < -8192) {
			local399 += 16384;
		}
		if (local399 < 0 && local340 > 0 || local399 > 0 && local340 < 0) {
			Static185.anInt5215 = local271;
		}
		Static72.anInt1723 = 0;
	}
}
