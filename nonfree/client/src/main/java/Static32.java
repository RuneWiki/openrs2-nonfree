import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!bj", name = "N", descriptor = "Lclient!sn;")
	public static Class224 aClass224_1;

	@OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
	public static int anInt526 = 20;

	@OriginalMember(owner = "client!bj", name = "k", descriptor = "(I)V")
	public static void method423() {
		Static105.method1613(false);
		Static391.anInt6531 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static163.aByteArrayArray24.length; local14++) {
			if (Static139.anIntArray166[local14] != -1 && Static163.aByteArrayArray24[local14] == null) {
				Static163.aByteArrayArray24[local14] = Static206.aClass82_50.method1817(Static139.anIntArray166[local14], 0);
				if (Static163.aByteArrayArray24[local14] == null) {
					local12 = false;
					Static391.anInt6531++;
				}
			}
			if (Static118.anIntArray145[local14] != -1 && Static333.aByteArrayArray22[local14] == null) {
				Static333.aByteArrayArray22[local14] = Static206.aClass82_50.method1845(0, Static337.anIntArrayArray50[local14], Static118.anIntArray145[local14]);
				if (Static333.aByteArrayArray22[local14] == null) {
					Static391.anInt6531++;
					local12 = false;
				}
			}
			if (Static354.anIntArray417[local14] != -1 && Static266.aByteArrayArray18[local14] == null) {
				Static266.aByteArrayArray18[local14] = Static206.aClass82_50.method1817(Static354.anIntArray417[local14], 0);
				if (Static266.aByteArrayArray18[local14] == null) {
					Static391.anInt6531++;
					local12 = false;
				}
			}
			if (Static385.anIntArray429[local14] != -1 && Static407.aByteArrayArray29[local14] == null) {
				Static407.aByteArrayArray29[local14] = Static206.aClass82_50.method1817(Static385.anIntArray429[local14], 0);
				if (Static407.aByteArrayArray29[local14] == null) {
					Static391.anInt6531++;
					local12 = false;
				}
			}
			if (Static208.anIntArray226 != null && Static151.aByteArrayArray9[local14] == null && Static208.anIntArray226[local14] != -1) {
				Static151.aByteArrayArray9[local14] = Static206.aClass82_50.method1845(0, Static337.anIntArrayArray50[local14], Static208.anIntArray226[local14]);
				if (Static151.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static391.anInt6531++;
				}
			}
		}
		if (Static72.aClass100_1 == null) {
			if (Static436.aClass1_Sub5_Sub18_3 == null || !Static160.aClass82_43.method1843(Static436.aClass1_Sub5_Sub18_3.aString70 + "_staticelements")) {
				Static72.aClass100_1 = new Class100(0);
			} else if (Static160.aClass82_43.method1844(Static436.aClass1_Sub5_Sub18_3.aString70 + "_staticelements")) {
				Static72.aClass100_1 = Static368.method4883(Static160.aClass82_43, Static337.aBoolean654, Static436.aClass1_Sub5_Sub18_3.aString70 + "_staticelements");
			} else {
				Static391.anInt6531++;
				local12 = false;
			}
		}
		if (!local12) {
			Static42.anInt717 = 1;
			return;
		}
		Static368.anInt6205 = 0;
		local12 = true;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static163.aByteArrayArray24.length; local251++) {
			@Pc(257) byte[] local257 = Static333.aByteArrayArray22[local251];
			if (local257 != null) {
				local270 = (Static248.anIntArray298[local251] >> 8) * 64 - Static199.anInt3480;
				local281 = (Static248.anIntArray298[local251] & 0xFF) * 64 - Static164.anInt2731;
				if (Static226.anInt4010 != 0) {
					local270 = 10;
					local281 = 10;
				}
				local12 &= Static210.method3090(local270, local281, Static206.anInt3607, local257, Static296.anInt5187);
			}
			local257 = Static407.aByteArrayArray29[local251];
			if (local257 != null) {
				local270 = (Static248.anIntArray298[local251] >> 8) * 64 - Static199.anInt3480;
				local281 = (Static248.anIntArray298[local251] & 0xFF) * 64 - Static164.anInt2731;
				if (Static226.anInt4010 != 0) {
					local281 = 10;
					local270 = 10;
				}
				local12 &= Static210.method3090(local270, local281, Static206.anInt3607, local257, Static296.anInt5187);
			}
		}
		if (!local12) {
			Static42.anInt717 = 2;
			return;
		}
		if (Static42.anInt717 != 0) {
			Static163.method4683(true, Static437.aClass76_4, Static277.aClass119_130.method2673(Static394.anInt6582) + "<br>(100%)");
		}
		Static111.method1777();
		Static417.method5509();
		@Pc(381) boolean local381 = false;
		if (Static185.aClass34_7.method5770() && Static453.aClass136_Sub1_1.aBoolean501) {
			for (local270 = 0; local270 < Static163.aByteArrayArray24.length; local270++) {
				if (Static407.aByteArrayArray29[local270] != null || Static266.aByteArrayArray18[local270] != null) {
					local381 = true;
					break;
				}
			}
		}
		if (Static453.aClass136_Sub1_1.aBoolean496) {
			local270 = Static248.anIntArray297[Static222.anInt3997];
		} else {
			local270 = Static84.anIntArray47[Static222.anInt3997];
		}
		if (Static185.aClass34_7.method5739()) {
			local270++;
		}
		Static321.method4321(Static296.anInt5187, Static206.anInt3607, local270, local381, Static185.aClass34_7.method5800() > 0);
		for (local281 = 0; local281 < 4; local281++) {
			Static447.aClass14Array3[local281].method288();
		}
		Static336.method4509();
		Static282.method3895(false);
		Static156.method2287();
		Static187.aClass5_1 = null;
		Static111.method1777();
		System.gc();
		Static105.method1613(true);
		Static202.method2880();
		Static321.anInt5491 = Static453.aClass136_Sub1_1.method3516(Static14.anInt293);
		Static53.aBoolean106 = Static270.anInt4858 >= 96;
		Static51.aBoolean99 = Static453.aClass136_Sub1_1.aBoolean501;
		Static194.aBoolean809 = Static453.aClass136_Sub1_1.method3519(Static14.anInt293);
		Static261.aBoolean534 = !Static453.aClass136_Sub1_1.aBoolean506;
		Static84.anInt959 = Static453.aClass136_Sub1_1.method3522(Static14.anInt293) ? -1 : Static456.anInt7534;
		Static350.aBoolean683 = Static453.aClass136_Sub1_1.aBoolean505;
		Static256.aBoolean530 = Static14.anInt293 == 1 || Static453.aClass136_Sub1_1.aBoolean510;
		Static369.aClass195_Sub1_2 = new Class195_Sub1(4, Static296.anInt5187, Static206.anInt3607, false);
		if (Static226.anInt4010 == 0) {
			Static351.method4745(Static163.aByteArrayArray24, Static369.aClass195_Sub1_2);
		} else {
			Static378.method2419(Static369.aClass195_Sub1_2, Static163.aByteArrayArray24);
		}
		Static269.method3794(Static296.anInt5187 >> 4, Static206.anInt3607 >> 4);
		Static1.method9();
		if (local381) {
			Static253.method3631(true);
			Static264.aClass195_Sub1_1 = new Class195_Sub1(1, Static296.anInt5187, Static206.anInt3607, true);
			if (Static226.anInt4010 == 0) {
				Static351.method4745(Static266.aByteArrayArray18, Static264.aClass195_Sub1_1);
				Static105.method1613(true);
			} else {
				Static378.method2419(Static264.aClass195_Sub1_1, Static266.aByteArrayArray18);
				Static105.method1613(true);
			}
			Static264.aClass195_Sub1_1.method4992(Static369.aClass195_Sub1_2.anIntArrayArrayArray12[0]);
			Static264.aClass195_Sub1_1.method4998(Static185.aClass34_7, null, null);
			Static253.method3631(false);
		}
		Static369.aClass195_Sub1_2.method4998(Static185.aClass34_7, local381 ? Static264.aClass195_Sub1_1.anIntArrayArrayArray12 : null, Static447.aClass14Array3);
		if (Static226.anInt4010 == 0) {
			Static105.method1613(true);
			Static446.method5854(Static333.aByteArrayArray22, Static369.aClass195_Sub1_2);
			if (Static151.aByteArrayArray9 != null) {
				Static158.method1898();
			}
		} else {
			Static105.method1613(true);
			Static249.method3537(Static369.aClass195_Sub1_2, Static333.aByteArrayArray22);
		}
		Static417.method5509();
		Static105.method1613(true);
		Static369.aClass195_Sub1_2.method5003(local381 ? Static343.aClass157Array3[0] : null, null, Static185.aClass34_7);
		Static369.aClass195_Sub1_2.method5007(Static185.aClass34_7);
		Static105.method1613(true);
		if (local381) {
			Static253.method3631(true);
			Static105.method1613(true);
			if (Static226.anInt4010 == 0) {
				Static446.method5854(Static407.aByteArrayArray29, Static264.aClass195_Sub1_1);
			} else {
				Static249.method3537(Static264.aClass195_Sub1_1, Static407.aByteArrayArray29);
			}
			Static417.method5509();
			Static105.method1613(true);
			Static264.aClass195_Sub1_1.method5003(null, Static330.aClass157Array2[0], Static185.aClass34_7);
			Static264.aClass195_Sub1_1.method5007(Static185.aClass34_7);
			Static105.method1613(true);
			Static253.method3631(false);
		}
		Static50.method828();
		@Pc(712) int local712 = Static369.aClass195_Sub1_2.anInt6375;
		if (Static265.anInt4807 < local712) {
			local712 = Static265.anInt4807;
		}
		if (local712 < Static265.anInt4807 - 1) {
			local712 = Static265.anInt4807 - 1;
		}
		if (Static453.aClass136_Sub1_1.method3522(Static14.anInt293)) {
			Static101.method1557(0);
		} else {
			Static101.method1557(local712);
		}
		@Pc(751) int local751;
		@Pc(755) int local755;
		for (@Pc(747) int local747 = 0; local747 < 4; local747++) {
			for (local751 = 0; local751 < Static296.anInt5187; local751++) {
				for (local755 = 0; local755 < Static206.anInt3607; local755++) {
					Static133.method2055(local747, local755, local751);
				}
			}
		}
		Static319.method4282();
		Static111.method1777();
		Static145.method1626();
		Static417.method5509();
		Static50.aBoolean95 = false;
		Static294.method4023();
		if (Static411.aFrame2 != null && Static395.aClass131_3 != null && Static312.anInt5414 == 10) {
			Static52.method867(Static80.aClass103_65);
			Static18.aClass1_Sub28_Sub1_1.method5347(1057001181);
		}
		if (Static226.anInt4010 == 0) {
			local751 = (Static432.anInt7295 - (Static296.anInt5187 >> 4)) / 8;
			local755 = (Static432.anInt7295 + (Static296.anInt5187 >> 4)) / 8;
			@Pc(842) int local842 = (Static414.anInt6796 - (Static206.anInt3607 >> 4)) / 8;
			@Pc(850) int local850 = (Static414.anInt6796 + (Static206.anInt3607 >> 4)) / 8;
			for (@Pc(854) int local854 = local751 - 1; local854 <= local755 + 1; local854++) {
				for (@Pc(860) int local860 = local842 - 1; local860 <= local850 + 1; local860++) {
					if (local854 < local751 || local755 < local854 || local860 < local842 || local860 > local850) {
						Static206.aClass82_50.method1838("m" + local854 + "_" + local860);
						Static206.aClass82_50.method1838("l" + local854 + "_" + local860);
					}
				}
			}
		}
		if (Static312.anInt5414 == 3) {
			Static203.method4783(2);
		} else if (Static312.anInt5414 == 7) {
			Static203.method4783(6);
		} else {
			Static203.method4783(9);
			if (Static395.aClass131_3 != null) {
				Static52.method867(Static134.aClass103_102);
			}
		}
		Static323.method4354();
		Static111.method1777();
		Static376.method4979();
	}

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "(I)Lclient!ql;")
	public static Class1_Sub36 method424() {
		if (Static167.aClass227_15 == null || Static88.aClass149_1 == null) {
			return null;
		}
		Static88.aClass149_1.method3483(Static167.aClass227_15);
		@Pc(23) Class1_Sub36 local23 = (Class1_Sub36) Static88.aClass149_1.method3487();
		if (local23 == null) {
			return null;
		} else {
			@Pc(33) Class205 local33 = Static167.aClass178_2.method3963(local23.anInt5632);
			return local33 != null && local33.aBoolean655 && local33.method4516(Static167.anInterface9_2) ? local23 : Static223.method4588();
		}
	}
}
