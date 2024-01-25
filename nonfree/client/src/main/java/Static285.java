import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Lclient!gga;")
	public static Class124 aClass124_61;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "J")
	public static volatile long aLong143 = 0L;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
	public static void method4766() {
		if (!Static358.aBoolean520) {
			Static561.aBoolean715 = true;
			Static584.aFloat89 += (24.0F - Static584.aFloat89) / 2.0F;
			Static358.aBoolean520 = true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIZ)V")
	public static void method4770(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg2 == Static194.anInt4134 && Static587.anInt10249 == arg1 && (Static547.anInt9550 == Static578.anInt6963 || Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 1)) {
			return;
		}
		Static578.anInt6963 = Static547.anInt9550;
		Static587.anInt10249 = arg1;
		Static194.anInt4134 = arg2;
		if (Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 1) {
			Static578.anInt6963 = 0;
		}
		Static248.method4408(arg0);
		Static543.method8319(Static205.aClass134_12.method3906(Static204.anInt8130), Static607.aClass101_15, Static455.aClass324_11, Static230.aClass59_3, true);
		@Pc(64) int local64 = Static640.anInt11085;
		Static640.anInt11085 = (Static194.anInt4134 - (Static222.anInt4533 >> 4)) * 8;
		@Pc(75) int local75 = Static490.anInt8763;
		Static490.anInt8763 = (Static587.anInt10249 - (Static668.anInt11370 >> 4)) * 8;
		Static465.aClass2_Sub1_Sub9_2 = Static331.method9074(Static194.anInt4134 * 8, Static587.anInt10249 * 8);
		Static638.aClass75_3 = null;
		@Pc(97) int local97 = Static640.anInt11085 - local64;
		@Pc(102) int local102 = Static490.anInt8763 - local75;
		@Pc(123) int local123;
		@Pc(125) int local125;
		@Pc(173) int local173;
		@Pc(278) int local278;
		if (arg0 == 11) {
			for (local278 = 0; local278 < Static487.anInt8726; local278++) {
				@Pc(284) Class2_Sub6 local284 = Static275.aClass2_Sub6Array1[local278];
				if (local284 != null) {
					@Pc(289) Class15_Sub3_Sub3_Sub1_Sub2 local289 = local284.aClass15_Sub3_Sub3_Sub1_Sub2_1;
					for (local125 = 0; local125 < 10; local125++) {
						local289.anIntArray189[local125] -= local97;
						local289.anIntArray188[local125] -= local102;
					}
					local289.anInt11022 -= local97 * 512;
					local289.anInt11024 -= local102 * 512;
				}
			}
		} else {
			@Pc(109) boolean local109 = false;
			Static532.anInt9330 = 0;
			@Pc(117) int local117 = Static222.anInt4533 * 512 - 512;
			local123 = (Static668.anInt11370 - 1) * 512;
			for (local125 = 0; local125 < Static487.anInt8726; local125++) {
				@Pc(131) Class2_Sub6 local131 = Static275.aClass2_Sub6Array1[local125];
				if (local131 != null) {
					@Pc(136) Class15_Sub3_Sub3_Sub1_Sub2 local136 = local131.aClass15_Sub3_Sub3_Sub1_Sub2_1;
					local136.anInt11024 -= local102 * 512;
					local136.anInt11022 -= local97 * 512;
					if (local136.anInt11022 >= 0 && local136.anInt11022 <= local117 && local136.anInt11024 >= 0 && local136.anInt11024 <= local123) {
						@Pc(171) boolean local171 = true;
						for (local173 = 0; local173 < 10; local173++) {
							local136.anIntArray189[local173] -= local97;
							local136.anIntArray188[local173] -= local102;
							if (local136.anIntArray189[local173] < 0 || local136.anIntArray189[local173] >= Static222.anInt4533 || local136.anIntArray188[local173] < 0 || local136.anIntArray188[local173] >= Static668.anInt11370) {
								local171 = false;
							}
						}
						if (local171) {
							Static84.anIntArray73[Static532.anInt9330++] = local136.anInt3977;
						} else {
							local136.method3698((Class312) null);
							local131.method9825();
							local109 = true;
						}
					} else {
						local136.method3698((Class312) null);
						local109 = true;
						local131.method9825();
					}
				}
			}
			if (local109) {
				Static487.anInt8726 = Static630.aClass335_29.method8361();
				Static630.aClass335_29.method8360(Static275.aClass2_Sub6Array1);
			}
		}
		for (local278 = 0; local278 < 2048; local278++) {
			@Pc(341) Class15_Sub3_Sub3_Sub1_Sub1 local341 = Static28.aClass15_Sub3_Sub3_Sub1_Sub1Array1[local278];
			if (local341 != null) {
				for (local123 = 0; local123 < 10; local123++) {
					local341.anIntArray189[local123] -= local97;
					local341.anIntArray188[local123] -= local102;
				}
				local341.anInt11022 -= local97 * 512;
				local341.anInt11024 -= local102 * 512;
			}
		}
		@Pc(393) Class326[] local393 = Static382.aClass326Array3;
		for (local123 = 0; local123 < local393.length; local123++) {
			@Pc(401) Class326 local401 = local393[local123];
			if (local401 != null) {
				local401.anInt9318 -= local97 * 512;
				local401.anInt9317 -= local102 * 512;
			}
		}
		@Pc(429) Class2_Sub49 local429;
		for (local429 = (Class2_Sub49) Static338.aClass271_39.method7177(); local429 != null; local429 = (Class2_Sub49) Static338.aClass271_39.method7175()) {
			local429.anInt10499 -= local97;
			local429.anInt10505 -= local102;
			if (Static389.anInt7373 != 4 && (local429.anInt10499 < 0 || local429.anInt10505 < 0 || local429.anInt10499 >= Static222.anInt4533 || local429.anInt10505 >= Static668.anInt11370)) {
				local429.method9825();
			}
		}
		for (local429 = (Class2_Sub49) Static545.aClass271_58.method7177(); local429 != null; local429 = (Class2_Sub49) Static545.aClass271_58.method7175()) {
			local429.anInt10505 -= local102;
			local429.anInt10499 -= local97;
			if (Static389.anInt7373 != 4 && (local429.anInt10499 < 0 || local429.anInt10505 < 0 || local429.anInt10499 >= Static222.anInt4533 || Static668.anInt11370 <= local429.anInt10505)) {
				local429.method9825();
			}
		}
		if (Static389.anInt7373 != 4) {
			for (@Pc(538) Class2_Sub47 local538 = (Class2_Sub47) Static18.aClass335_2.method8358(); local538 != null; local538 = (Class2_Sub47) Static18.aClass335_2.method8355()) {
				@Pc(546) int local546 = (int) (local538.aLong313 & 0x3FFFL);
				@Pc(551) int local551 = local546 - Static640.anInt11085;
				local173 = (int) (local538.aLong313 >> 14 & 0x3FFFL);
				@Pc(564) int local564 = local173 - Static490.anInt8763;
				if (local551 < 0 || local564 < 0 || local551 >= Static222.anInt4533 || local564 >= Static668.anInt11370) {
					local538.method9825();
				}
			}
		}
		if (Static587.anInt10248 != 0) {
			Static472.anInt8440 -= local102;
			Static587.anInt10248 -= local97;
		}
		Static335.method5520();
		if (arg0 != 11) {
			Static99.anInt1769 -= local97;
			Static598.anInt10387 -= local102 * 512;
			Static46.anInt958 -= local102;
			Static108.anInt1987 -= local97 * 512;
			Static483.anInt8676 -= local97;
			Static362.anInt9575 -= local102;
			if (Math.abs(local97) > Static222.anInt4533 || Math.abs(local102) > Static668.anInt11370) {
				Static593.method7276();
			}
		} else if (Static484.anInt8685 == 4) {
			Static461.anInt8253 -= local97 * 512;
			Static106.anInt1972 -= local102 * 512;
			Static293.anInt7589 -= local97 * 512;
			Static386.anInt7301 -= local102 * 512;
		} else {
			Static533.anInt9359 = -1;
			Static5.anInt83 = -1;
			Static484.anInt8685 = 1;
		}
		Static591.method8905();
		Static218.method4047();
		Static36.aClass271_4.method7181();
		Static370.aClass271_42.method7181();
		Static183.aClass60_5.method1548();
		Static269.method6331();
	}
}
