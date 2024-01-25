import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
	public static int anInt1109;

	@OriginalMember(owner = "client!ca", name = "x", descriptor = "Lclient!ig;")
	public static final Class133 aClass133_26 = new Class133(11, 7);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIZ)V")
	public static void method1038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg1 == Static429.anInt7899 && Static34.anInt888 == arg0 && (Static420.anInt7829 == Static445.anInt8174 || Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091))) {
			return;
		}
		Static429.anInt7899 = arg1;
		Static445.anInt8174 = Static420.anInt7829;
		Static34.anInt888 = arg0;
		if (Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091)) {
			Static445.anInt8174 = 0;
		}
		Static333.method5283(arg2);
		Static141.method2464(true, Static164.aClass59_1, Static157.aClass67_50.method1934(Static193.anInt7803));
		@Pc(57) int local57 = Static223.anInt4827;
		Static223.anInt4827 = (Static429.anInt7899 - (Static118.anInt2527 >> 4)) * 8;
		@Pc(68) int local68 = Static150.anInt3027;
		Static150.anInt3027 = (Static34.anInt888 - (Static549.anInt9482 >> 4)) * 8;
		Static496.aClass3_Sub10_Sub5_3 = Static55.method1837(Static429.anInt7899 * 8, Static34.anInt888 * 8);
		Static267.aClass82_3 = null;
		@Pc(92) int local92 = Static223.anInt4827 - local57;
		@Pc(97) int local97 = Static150.anInt3027 - local68;
		@Pc(118) int local118;
		@Pc(120) int local120;
		@Pc(169) int local169;
		@Pc(278) int local278;
		if (arg2 == 10) {
			for (local278 = 0; local278 < Static183.anInt5938; local278++) {
				@Pc(284) Class3_Sub3 local284 = Static47.aClass3_Sub3Array4[local278];
				if (local284 != null) {
					@Pc(289) Class6_Sub1_Sub2_Sub2 local289 = local284.aClass6_Sub1_Sub2_Sub2_1;
					for (local120 = 0; local120 < 10; local120++) {
						local289.anIntArray733[local120] -= local92;
						local289.anIntArray734[local120] -= local97;
					}
					local289.anInt8813 -= local97 * 512;
					local289.anInt8811 -= local92 * 512;
				}
			}
		} else {
			@Pc(104) boolean local104 = false;
			Static221.anInt4798 = 0;
			@Pc(112) int local112 = Static118.anInt2527 * 512 - 512;
			local118 = Static549.anInt9482 * 512 - 512;
			for (local120 = 0; local120 < Static183.anInt5938; local120++) {
				@Pc(126) Class3_Sub3 local126 = Static47.aClass3_Sub3Array4[local120];
				if (local126 != null) {
					@Pc(131) Class6_Sub1_Sub2_Sub2 local131 = local126.aClass6_Sub1_Sub2_Sub2_1;
					local131.anInt8811 -= local92 * 512;
					local131.anInt8813 -= local97 * 512;
					if (local131.anInt8811 >= 0 && local131.anInt8811 <= local112 && local131.anInt8813 >= 0 && local118 >= local131.anInt8813) {
						@Pc(167) boolean local167 = true;
						for (local169 = 0; local169 < 10; local169++) {
							local131.anIntArray733[local169] -= local92;
							local131.anIntArray734[local169] -= local97;
							if (local131.anIntArray733[local169] < 0 || Static118.anInt2527 <= local131.anIntArray733[local169] || local131.anIntArray734[local169] < 0 || local131.anIntArray734[local169] >= Static549.anInt9482) {
								local167 = false;
							}
						}
						if (local167) {
							Static3.anIntArray80[Static221.anInt4798++] = local131.anInt8587;
						} else {
							local131.method7096(null);
							local104 = true;
							local126.method7820();
						}
					} else {
						local131.method7096(null);
						local104 = true;
						local126.method7820();
					}
				}
			}
			if (local104) {
				Static183.anInt5938 = Static240.aClass267_20.method6641();
				Static240.aClass267_20.method6639(Static47.aClass3_Sub3Array4);
			}
		}
		for (local278 = 0; local278 < 2048; local278++) {
			@Pc(345) Class6_Sub1_Sub2_Sub1 local345 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local278];
			if (local345 != null) {
				for (local118 = 0; local118 < 10; local118++) {
					local345.anIntArray733[local118] -= local92;
					local345.anIntArray734[local118] -= local97;
				}
				local345.anInt8811 -= local92 * 512;
				local345.anInt8813 -= local97 * 512;
			}
		}
		@Pc(397) Class296[] local397 = Static518.aClass296Array2;
		for (local118 = 0; local118 < local397.length; local118++) {
			@Pc(405) Class296 local405 = local397[local118];
			if (local405 != null) {
				local405.anInt8739 -= local97 * 512;
				local405.anInt8743 -= local92 * 512;
			}
		}
		for (@Pc(437) Class3_Sub8 local437 = (Class3_Sub8) Static536.aClass71_67.method2089(); local437 != null; local437 = (Class3_Sub8) Static536.aClass71_67.method2086()) {
			local437.anInt791 -= local97;
			local437.anInt789 -= local92;
			if (Static318.anInt5230 != 4 && (local437.anInt789 < 0 || local437.anInt791 < 0 || local437.anInt789 >= Static118.anInt2527 || Static549.anInt9482 <= local437.anInt791)) {
				local437.method7820();
			}
		}
		if (Static318.anInt5230 != 4) {
			for (@Pc(501) Class3_Sub12 local501 = (Class3_Sub12) Static476.aClass267_37.method6643(); local501 != null; local501 = (Class3_Sub12) Static476.aClass267_37.method6650()) {
				@Pc(509) int local509 = (int) (local501.aLong285 & 0x3FFFL);
				@Pc(513) int local513 = local509 - Static223.anInt4827;
				local169 = (int) (local501.aLong285 >> 14 & 0x3FFFL);
				@Pc(525) int local525 = local169 - Static150.anInt3027;
				if (local513 < 0 || local525 < 0 || Static118.anInt2527 <= local513 || Static549.anInt9482 <= local525) {
					local501.method7820();
				}
			}
		}
		if (Static407.anInt7473 != 0) {
			Static303.anInt5982 -= local97;
			Static407.anInt7473 -= local92;
		}
		Static208.method3830();
		if (arg2 != 10) {
			Static329.anInt6297 -= local97 * 512;
			Static311.anInt6050 -= local92 * 512;
			Static22.anInt8153 -= local92;
			Static347.anInt6621 -= local97;
			Static192.anInt4400 -= local92;
			Static346.anInt6595 -= local97;
			if (Math.abs(local92) > Static118.anInt2527 || Math.abs(local97) > Static549.anInt9482) {
				Static245.method4229();
			}
		} else if (Static305.anInt5998 == 4) {
			Static8.anInt583 -= local92 * 512;
			Static366.anInt6836 -= local97 * 512;
			Static40.anInt1002 -= local92 * 512;
			Static157.anInt3699 -= local97 * 512;
		} else {
			Static305.anInt5998 = 1;
		}
		Static59.method1189();
		Static370.method5843();
		Static422.aClass71_65.method2088();
		Static436.aClass71_60.method2088();
		Static226.aClass90_10.method2324();
		Static283.method4851();
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZIZII)I")
	public static int method1040(@OriginalArg(0) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		@Pc(10) Class3_Sub5 local10 = Static480.method7117(false, arg1);
		if (local10 == null) {
			return 0;
		}
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < local10.anIntArray120.length; local23++) {
			if (local10.anIntArray120[local23] >= 0 && Static99.aClass96_7.anInt2928 > local10.anIntArray120[local23]) {
				@Pc(48) Class27 local48 = Static99.aClass96_7.method2508(local10.anIntArray120[local23]);
				@Pc(58) int local58 = local48.method830(Static37.aClass121_1.method3431(arg2).anInt7213, arg2);
				if (arg0) {
					local21 += local10.anIntArray117[local23] * local58;
				} else {
					local21 += local58;
				}
			}
		}
		return local21;
	}
}
