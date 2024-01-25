import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!ph", name = "n", descriptor = "Lclient!f;")
	public static Class38 aClass38_30;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "Z")
	public static final boolean aBoolean536 = false;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
	public static void method5553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static469.aClass228ArrayArrayArray6[0][arg1][arg2] != null && Static469.aClass228ArrayArrayArray6[0][arg1][arg2].aClass228_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static469.aClass228ArrayArrayArray6[local22][arg1][arg2] == null) {
				@Pc(44) Class228 local44 = Static469.aClass228ArrayArrayArray6[local22][arg1][arg2] = new Class228(local22);
				if (local20) {
					local44.aByte80++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
	public static void method5555() {
		for (@Pc(19) Class2_Sub2_Sub5 local19 = (Class2_Sub2_Sub5) Static380.aClass70_51.method1264(); local19 != null; local19 = (Class2_Sub2_Sub5) Static380.aClass70_51.method1261()) {
			@Pc(24) Class12_Sub2_Sub1_Sub5 local24 = local19.aClass12_Sub2_Sub1_Sub5_1;
			if (local24.aBoolean785) {
				local19.method7657();
				local24.method7520();
			} else if (local24.anInt9410 <= Static532.anInt8757) {
				local24.method7523(Static534.anInt8792);
				if (local24.aBoolean785) {
					local19.method7657();
				} else {
					Static526.method7745(local24, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIZ)V")
	public static void method5556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg2 == Static434.anInt6974 && Static79.anInt7835 == arg0 && (Static487.anInt7738 == Static402.anInt6620 || Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318))) {
			return;
		}
		Static434.anInt6974 = arg2;
		Static79.anInt7835 = arg0;
		Static487.anInt7738 = Static402.anInt6620;
		if (Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318)) {
			Static487.anInt7738 = 0;
		}
		Static115.method1686(arg1);
		Static96.method1453(Static322.aClass37_20, Static229.aClass159_14.method2776(Static261.anInt4297), Static417.aClass162_17, true, Static266.aClass112_7);
		@Pc(58) int local58 = Static485.anInt7725;
		Static485.anInt7725 = (Static434.anInt6974 - (Static281.anInt4822 >> 4)) * 8;
		@Pc(69) int local69 = Static310.anInt5129;
		Static310.anInt5129 = (Static79.anInt7835 - (Static29.anInt491 >> 4)) * 8;
		Static367.aClass2_Sub2_Sub9_1 = Static476.method6105(Static434.anInt6974 * 8, Static79.anInt7835 * 8);
		Static170.aClass214_1 = null;
		@Pc(93) int local93 = Static485.anInt7725 - local58;
		@Pc(98) int local98 = Static310.anInt5129 - local69;
		@Pc(122) int local122;
		@Pc(124) int local124;
		@Pc(175) int local175;
		@Pc(287) int local287;
		if (arg1 == 11) {
			for (local287 = 0; local287 < Static51.anInt912; local287++) {
				@Pc(293) Class2_Sub5 local293 = Static379.aClass2_Sub5Array1[local287];
				if (local293 != null) {
					@Pc(298) Class12_Sub2_Sub1_Sub4_Sub2 local298 = local293.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					for (local124 = 0; local124 < 10; local124++) {
						local298.anIntArray566[local124] -= local93;
						local298.anIntArray565[local124] -= local98;
					}
					local298.anInt9375 -= local98 * 512;
					local298.anInt9374 -= local93 * 512;
				}
			}
		} else {
			@Pc(108) boolean local108 = false;
			Static365.anInt6148 = 0;
			@Pc(116) int local116 = Static281.anInt4822 * 512 - 512;
			local122 = (Static29.anInt491 - 1) * 512;
			for (local124 = 0; local124 < Static51.anInt912; local124++) {
				@Pc(130) Class2_Sub5 local130 = Static379.aClass2_Sub5Array1[local124];
				if (local130 != null) {
					@Pc(135) Class12_Sub2_Sub1_Sub4_Sub2 local135 = local130.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					local135.anInt9374 -= local93 * 512;
					local135.anInt9375 -= local98 * 512;
					if (local135.anInt9374 >= 0 && local135.anInt9374 <= local116 && local135.anInt9375 >= 0 && local122 >= local135.anInt9375) {
						@Pc(173) boolean local173 = true;
						for (local175 = 0; local175 < 10; local175++) {
							local135.anIntArray566[local175] -= local93;
							local135.anIntArray565[local175] -= local98;
							if (local135.anIntArray566[local175] < 0 || Static281.anInt4822 <= local135.anIntArray566[local175] || local135.anIntArray565[local175] < 0 || local135.anIntArray565[local175] >= Static29.anInt491) {
								local173 = false;
							}
						}
						if (local173) {
							Static461.anIntArray562[Static365.anInt6148++] = local135.anInt8406;
						} else {
							local135.method6784(null);
							local108 = true;
							local130.method7657();
						}
					} else {
						local135.method6784(null);
						local130.method7657();
						local108 = true;
					}
				}
			}
			if (local108) {
				Static51.anInt912 = Static436.aClass90_26.method1679();
				Static436.aClass90_26.method1677(Static379.aClass2_Sub5Array1);
			}
		}
		for (local287 = 0; local287 < 2048; local287++) {
			@Pc(354) Class12_Sub2_Sub1_Sub4_Sub1 local354 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local287];
			if (local354 != null) {
				for (local122 = 0; local122 < 10; local122++) {
					local354.anIntArray566[local122] -= local93;
					local354.anIntArray565[local122] -= local98;
				}
				local354.anInt9374 -= local93 * 512;
				local354.anInt9375 -= local98 * 512;
			}
		}
		@Pc(404) Class80[] local404 = Static271.aClass80Array1;
		for (local122 = 0; local122 < local404.length; local122++) {
			@Pc(412) Class80 local412 = local404[local122];
			if (local412 != null) {
				local412.anInt1802 -= local98 * 512;
				local412.anInt1809 -= local93 * 512;
			}
		}
		for (@Pc(444) Class2_Sub21 local444 = (Class2_Sub21) Static246.aClass70_25.method1264(); local444 != null; local444 = (Class2_Sub21) Static246.aClass70_25.method1261()) {
			local444.anInt3030 -= local98;
			local444.anInt3036 -= local93;
			if (Static386.anInt6384 != 4 && (local444.anInt3036 < 0 || local444.anInt3030 < 0 || local444.anInt3036 >= Static281.anInt4822 || Static29.anInt491 <= local444.anInt3030)) {
				local444.method7657();
			}
		}
		if (Static386.anInt6384 != 4) {
			for (@Pc(499) Class2_Sub6 local499 = (Class2_Sub6) Static531.aClass90_39.method1676(); local499 != null; local499 = (Class2_Sub6) Static531.aClass90_39.method1680()) {
				@Pc(507) int local507 = (int) (local499.aLong268 & 0x3FFFL);
				@Pc(512) int local512 = local507 - Static485.anInt7725;
				local175 = (int) (local499.aLong268 >> 14 & 0x3FFFL);
				@Pc(525) int local525 = local175 - Static310.anInt5129;
				if (local512 < 0 || local525 < 0 || Static281.anInt4822 <= local512 || Static29.anInt491 <= local525) {
					local499.method7657();
				}
			}
		}
		if (Static484.anInt7716 != 0) {
			Static484.anInt7716 -= local93;
			Static143.anInt7433 -= local98;
		}
		Static505.method6537();
		if (arg1 != 11) {
			Static353.anInt6039 -= local93;
			Static259.anInt4284 -= local98;
			Static18.anInt4107 -= local98;
			Static469.anInt7519 -= local98 * 512;
			Static285.anInt2206 -= local93 * 512;
			Static388.anInt6396 -= local93;
			if (Math.abs(local93) > Static281.anInt4822 || Math.abs(local98) > Static29.anInt491) {
				Static113.method1669();
			}
		} else if (Static489.anInt7763 == 4) {
			Static47.anInt873 -= local98 * 512;
			Static504.anInt8012 -= local93 * 512;
			Static14.anInt328 -= local93 * 512;
			Static520.anInt8309 -= local98 * 512;
		} else {
			Static489.anInt7763 = 1;
			Static203.anInt2978 = -1;
			Static148.anInt2359 = -1;
		}
		Static136.method1879();
		Static429.method5683();
		Static380.aClass70_51.method1265();
		Static131.aClass70_5.method1265();
		Static71.aClass220_8.method4657();
		Static197.method2477();
	}
}
