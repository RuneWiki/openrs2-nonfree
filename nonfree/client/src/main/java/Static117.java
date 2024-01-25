import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_68 = new Class151("green:", "grün:", "vert:", "verde:");

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
	public static int anInt2020 = 0;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_91 = new Class137(52, 4);

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILclient!oq;)I")
	public static int method1606(@OriginalArg(1) Class20_Sub3_Sub3_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt4941;
		@Pc(14) Class51 local14 = arg0.method4676();
		if (arg0.aBoolean502) {
			local8 = arg0.anInt4966;
		} else if (arg0.anInt6037 == local14.anInt1321 || local14.anInt1322 == arg0.anInt6037 || local14.anInt1310 == arg0.anInt6037 || arg0.anInt6037 == local14.anInt1294) {
			local8 = arg0.anInt4973;
		} else if (arg0.anInt6037 == local14.anInt1317 || local14.anInt1303 == arg0.anInt6037 || arg0.anInt6037 == local14.anInt1291 || arg0.anInt6037 == local14.anInt1300) {
			local8 = arg0.anInt4971;
		}
		return local8;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!qa;B)V")
	public static void method1607(@OriginalArg(0) Class128 arg0) {
		@Pc(7) int local7 = Static351.anInt5784;
		@Pc(9) int local9 = Static430.anInt7189;
		@Pc(11) int local11 = Static163.anInt2682;
		@Pc(15) int local15 = Static360.anInt5991 - 3;
		if (Static415.aClass49_6 == null || Static453.aClass49_22 == null) {
			if (Static169.aClass113_55.method2253(Static452.anInt7407) && Static169.aClass113_55.method2253(Static249.anInt4071)) {
				Static415.aClass49_6 = arg0.method3540(Static458.method1922(Static169.aClass113_55, Static452.anInt7407, 0));
				@Pc(61) Class100 local61 = Static458.method1922(Static169.aClass113_55, Static249.anInt4071, 0);
				Static453.aClass49_22 = arg0.method3540(local61);
				local61.method1926();
				Static9.aClass49_1 = arg0.method3540(local61);
			} else {
				arg0.NA(local7, local9, local11, 20, 255 - Static28.anInt562 << 24 | Static439.anInt7305, 1);
			}
		}
		@Pc(88) int local88;
		if (Static415.aClass49_6 != null && Static453.aClass49_22 != null) {
			local88 = (local11 - Static453.aClass49_22.UA() * 2) / Static415.aClass49_6.UA();
			for (@Pc(90) int local90 = 0; local90 < local88; local90++) {
				Static415.aClass49_6.method5636(local7 + Static453.aClass49_22.UA() + local90 * Static415.aClass49_6.UA(), local9);
			}
			Static453.aClass49_22.method5636(local7, local9);
			Static9.aClass49_1.method5636(local7 + local11 - Static9.aClass49_1.UA(), local9);
		}
		Static227.aClass16_1.method5478(local7 + 3, local9 + 14, -1, Static328.aClass151_169.method3122(Static188.anInt3028), Static43.anInt5196 | 0xFF000000);
		arg0.NA(local7, local9 + 20, local11, local15 - 20, 255 - Static28.anInt562 << 24 | Static439.anInt7305, 1);
		local88 = Static210.aClass26_1.method576();
		@Pc(178) int local178 = Static210.aClass26_1.method574();
		@Pc(180) int local180 = 0;
		@Pc(202) int local202;
		for (@Pc(185) Class1_Sub45 local185 = (Class1_Sub45) Static50.aClass254_8.method5437(); local185 != null; local185 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			local202 = local9 + (-local180 + Static19.anInt396 + -1) * 16 + 20 + 13;
			if (local88 > local7 && local7 + local11 > local88 && local202 - 13 < local178 && local202 + 4 > local178 && local185.aBoolean607) {
				arg0.NA(local7, local202 - 12, local11, 16, 255 - Static277.anInt4385 << 24 | Static418.anInt6789, 1);
			}
			local180++;
		}
		if ((Static240.aClass49_11 == null || Static391.aClass49_20 == null || Static283.aClass49_12 == null) && Static169.aClass113_55.method2253(Static410.anInt6666) && Static169.aClass113_55.method2253(Static33.anInt675) && Static169.aClass113_55.method2253(Static396.anInt6483)) {
			@Pc(278) Class100 local278 = Static458.method1922(Static169.aClass113_55, Static33.anInt675, 0);
			Static391.aClass49_20 = arg0.method3540(local278);
			local278.method1926();
			Static316.aClass49_19 = arg0.method3540(local278);
			Static240.aClass49_11 = arg0.method3540(Static458.method1922(Static169.aClass113_55, Static410.anInt6666, 0));
			@Pc(303) Class100 local303 = Static458.method1922(Static169.aClass113_55, Static396.anInt6483, 0);
			Static283.aClass49_12 = arg0.method3540(local303);
			local303.method1926();
			Static26.aClass49_2 = arg0.method3540(local303);
		}
		@Pc(375) int local375;
		@Pc(334) int local334;
		if (Static240.aClass49_11 != null && Static391.aClass49_20 != null && Static283.aClass49_12 != null) {
			local202 = (local11 - Static283.aClass49_12.UA() * 2) / Static240.aClass49_11.UA();
			for (local334 = 0; local334 < local202; local334++) {
				Static240.aClass49_11.method5636(Static283.aClass49_12.UA() + local7 + Static240.aClass49_11.UA() * local334, local9 - (-local15 - -Static240.aClass49_11.qa()));
			}
			local375 = (local15 - Static283.aClass49_12.qa() - 20) / Static391.aClass49_20.qa();
			for (@Pc(377) int local377 = 0; local377 < local375; local377++) {
				Static391.aClass49_20.method5636(local7, local9 + Static391.aClass49_20.qa() * local377 + 20);
				Static316.aClass49_19.method5636(local11 + local7 - Static316.aClass49_19.UA(), Static391.aClass49_20.qa() * local377 + local9 - -20);
			}
			Static283.aClass49_12.method5636(local7, local9 + local15 - Static283.aClass49_12.qa());
			Static26.aClass49_2.method5636(local7 + local11 - Static283.aClass49_12.UA(), local15 + local9 + -Static283.aClass49_12.qa());
		}
		local180 = 0;
		for (@Pc(444) Class1_Sub45 local444 = (Class1_Sub45) Static50.aClass254_8.method5437(); local444 != null; local444 = (Class1_Sub45) Static50.aClass254_8.method5433()) {
			local334 = local9 + (-local180 + -1 + Static19.anInt396) * 16 + 20 + 13;
			local375 = Static43.anInt5196 | 0xFF000000;
			if (local7 < local88 && local88 < local7 + local11 && local334 - 13 < local178 && local178 < local334 + 4 && local444.aBoolean607) {
				local375 = Static269.anInt4263 | 0xFF000000;
			}
			@Pc(506) int[] local506 = null;
			if (Static97.method1391(local444.anInt7398)) {
				local506 = Static227.aClass65_2.method1327((int) local444.aLong225).anIntArray87;
			} else if (local444.anInt7396 != -1) {
				local506 = Static227.aClass65_2.method1327(local444.anInt7396).anIntArray87;
			} else if (Static109.method1524(local444.anInt7398)) {
				@Pc(588) Class20_Sub3_Sub3_Sub2 local588 = Static98.aClass20_Sub3_Sub3_Sub2Array1[(int) local444.aLong225];
				if (local588 != null) {
					@Pc(593) Class246 local593 = local588.aClass246_1;
					if (local593.anIntArray459 != null) {
						local593 = local593.method5255(Static364.aClass259_1);
					}
					if (local593 != null) {
						local506 = local593.anIntArray455;
					}
				}
			} else if (Static29.method506(local444.anInt7398)) {
				@Pc(560) Class141 local560;
				if (local444.anInt7398 == 1006) {
					local560 = Static259.aClass95_3.method1821((int) local444.aLong225);
				} else {
					local560 = Static259.aClass95_3.method1821((int) (local444.aLong225 >>> 32 & 0x7FFFFFFFL));
				}
				if (local560.anIntArray184 != null) {
					local560 = local560.method2832(Static364.aClass259_1);
				}
				if (local560 != null) {
					local506 = local560.anIntArray187;
				}
			}
			@Pc(610) String local610 = Static258.method3272(local444);
			if (local506 != null) {
				local610 = local610 + Static108.method1518(local506);
			}
			Static227.aClass16_1.method5496(local610, Static214.aClass49Array147, local334, local7 + 3, Static419.anIntArray454, local375);
			if (local444.aBoolean606) {
				Static238.aClass49_10.method5636(Static6.aClass122_1.method2464(local610) + local7 + 5, local334 + -12);
			}
			local180++;
		}
		Static319.method4119(Static360.anInt5991, Static430.anInt7189, Static163.anInt2682, Static351.anInt5784);
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!qa;)V")
	public static void method1608(@OriginalArg(0) Class128 arg0) {
		for (@Pc(1) int local1 = Static337.anInt1766; local1 < Static97.anInt1709; local1++) {
			for (@Pc(4) int local4 = 0; local4 < Static362.anInt6113; local4++) {
				for (@Pc(7) int local7 = 0; local7 < Static195.anInt3127; local7++) {
					@Pc(16) Class82 local16 = Static159.aClass82ArrayArrayArray2[local1][local4][local7];
					if (local16 != null) {
						@Pc(21) Class20_Sub1 local21 = local16.aClass20_Sub1_2;
						@Pc(24) Class20_Sub1 local24 = local16.aClass20_Sub1_3;
						if (local21 != null && local21.method5110()) {
							Static284.method3701(arg0, local21, local1, local4, local7, 1, 1);
							if (local24 != null && local24.method5110()) {
								Static284.method3701(arg0, local24, local1, local4, local7, 1, 1);
								local24.method5116(false, 0, 0, local21, arg0, 0);
								local24.method5111();
							}
							local21.method5111();
						}
						for (@Pc(70) Class146 local70 = local16.aClass146_1; local70 != null; local70 = local70.aClass146_3) {
							@Pc(74) Class20_Sub3 local74 = local70.aClass20_Sub3_1;
							if (local74 != null && local74.method5110()) {
								Static284.method3701(arg0, local74, local1, local4, local7, local74.aShort87 + 1 - local74.aShort85, local74.aShort86 - local74.aShort88 + 1);
								local74.method5111();
							}
						}
						@Pc(111) Class20_Sub2 local111 = local16.aClass20_Sub2_1;
						if (local111 != null && local111.method5110()) {
							Static338.method4295(arg0, local111, local1, local4, local7);
							local111.method5111();
						}
					}
				}
			}
		}
	}
}
