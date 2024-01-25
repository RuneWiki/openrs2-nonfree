import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!vda", name = "X", descriptor = "[[Lclient!in;")
	public static Class160[][] aClass160ArrayArray2;

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "I")
	public static int anInt9183 = 0;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)V")
	public static void method7480() {
		Static73.aClass239Array1 = new Class239[50];
		Static439.anInt8379 = 0;
	}

	@OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V")
	public static void method7482() {
		for (@Pc(10) Class1_Sub4 local10 = (Class1_Sub4) Static592.aClass111_65.method2547(); local10 != null; local10 = (Class1_Sub4) Static592.aClass111_65.method2554()) {
			if (local10.aBoolean7) {
				local10.method210();
			}
		}
		for (@Pc(35) Class1_Sub4 local35 = (Class1_Sub4) Static452.aClass111_52.method2547(); local35 != null; local35 = (Class1_Sub4) Static452.aClass111_52.method2554()) {
			if (local35.aBoolean7) {
				local35.method210();
			}
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IIZII)V")
	public static void method7484(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && arg1 == Static276.anInt5046 && arg0 == Static518.anInt9329 && (Static398.anInt7155 == Static240.anInt4414 || Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239))) {
			return;
		}
		Static398.anInt7155 = Static240.anInt4414;
		Static276.anInt5046 = arg1;
		Static518.anInt9329 = arg0;
		if (Static86.aClass1_Sub30_Sub1_1.method5029(Static286.anInt5239)) {
			Static398.anInt7155 = 0;
		}
		Static318.method4726(arg3);
		Static307.method6069(Static375.aClass253_16.method5453(Static161.anInt3095), Static339.aClass96_9, true, Static31.aClass78_18, Static552.aClass352_20);
		@Pc(54) int local54 = Static539.anInt9045;
		Static539.anInt9045 = (Static276.anInt5046 - (Static458.anInt9736 >> 4)) * 8;
		@Pc(65) int local65 = Static311.anInt5708;
		Static311.anInt5708 = (Static518.anInt9329 - (Static378.anInt6747 >> 4)) * 8;
		Static225.aClass1_Sub8_Sub11_3 = Static287.method3143(Static276.anInt5046 * 8, Static518.anInt9329 * 8);
		Static114.aClass267_1 = null;
		@Pc(92) int local92 = Static539.anInt9045 - local54;
		@Pc(97) int local97 = Static311.anInt5708 - local65;
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(181) int local181;
		@Pc(272) int local272;
		if (arg3 == 11) {
			for (local272 = 0; local272 < Static547.anInt9151; local272++) {
				@Pc(278) Class1_Sub33 local278 = Static501.aClass1_Sub33Array1[local272];
				if (local278 != null) {
					@Pc(283) Class11_Sub1_Sub1_Sub3_Sub2 local283 = local278.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					for (local118 = 0; local118 < 10; local118++) {
						local283.anIntArray455[local118] -= local92;
						local283.anIntArray454[local118] -= local97;
					}
					local283.anInt8902 -= local92 * 512;
					local283.anInt8906 -= local97 * 512;
				}
			}
		} else {
			Static306.anInt4911 = 0;
			@Pc(104) boolean local104 = false;
			@Pc(110) int local110 = (Static458.anInt9736 - 1) * 512;
			local116 = Static378.anInt6747 * 512 - 512;
			for (local118 = 0; local118 < Static547.anInt9151; local118++) {
				@Pc(124) Class1_Sub33 local124 = Static501.aClass1_Sub33Array1[local118];
				if (local124 != null) {
					@Pc(129) Class11_Sub1_Sub1_Sub3_Sub2 local129 = local124.aClass11_Sub1_Sub1_Sub3_Sub2_2;
					local129.anInt8906 -= local97 * 512;
					local129.anInt8902 -= local92 * 512;
					if (local129.anInt8902 >= 0 && local110 >= local129.anInt8902 && local129.anInt8906 >= 0 && local129.anInt8906 <= local116) {
						@Pc(179) boolean local179 = true;
						for (local181 = 0; local181 < 10; local181++) {
							local129.anIntArray455[local181] -= local92;
							local129.anIntArray454[local181] -= local97;
							if (local129.anIntArray455[local181] < 0 || local129.anIntArray455[local181] >= Static458.anInt9736 || local129.anIntArray454[local181] < 0 || local129.anIntArray454[local181] >= Static378.anInt6747) {
								local179 = false;
							}
						}
						if (local179) {
							Static11.anIntArray12[Static306.anInt4911++] = local129.anInt7524;
						} else {
							local129.method6080(null);
							local104 = true;
							local124.method7908();
						}
					} else {
						local129.method6080(null);
						local124.method7908();
						local104 = true;
					}
				}
			}
			if (local104) {
				Static547.anInt9151 = Static372.aClass91_30.method2273();
				Static372.aClass91_30.method2272(Static501.aClass1_Sub33Array1);
			}
		}
		for (local272 = 0; local272 < 2048; local272++) {
			@Pc(341) Class11_Sub1_Sub1_Sub3_Sub1 local341 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[local272];
			if (local341 != null) {
				for (local116 = 0; local116 < 10; local116++) {
					local341.anIntArray455[local116] -= local92;
					local341.anIntArray454[local116] -= local97;
				}
				local341.anInt8902 -= local92 * 512;
				local341.anInt8906 -= local97 * 512;
			}
		}
		@Pc(389) Class358[] local389 = Static243.aClass358Array1;
		for (local116 = 0; local116 < local389.length; local116++) {
			@Pc(397) Class358 local397 = local389[local116];
			if (local397 != null) {
				local397.anInt9534 -= local92 * 512;
				local397.anInt9532 -= local97 * 512;
			}
		}
		for (@Pc(429) Class1_Sub43 local429 = (Class1_Sub43) Static64.aClass111_5.method2547(); local429 != null; local429 = (Class1_Sub43) Static64.aClass111_5.method2554()) {
			local429.anInt8102 -= local97;
			local429.anInt8101 -= local92;
			if (Static339.anInt6245 != 4 && (local429.anInt8101 < 0 || local429.anInt8102 < 0 || local429.anInt8101 >= Static458.anInt9736 || Static378.anInt6747 <= local429.anInt8102)) {
				local429.method7908();
			}
		}
		if (Static339.anInt6245 != 4) {
			for (@Pc(482) Class1_Sub20 local482 = (Class1_Sub20) Static365.aClass91_29.method2278(); local482 != null; local482 = (Class1_Sub20) Static365.aClass91_29.method2276()) {
				@Pc(490) int local490 = (int) (local482.aLong268 & 0x3FFFL);
				@Pc(495) int local495 = local490 - Static539.anInt9045;
				local181 = (int) (local482.aLong268 >> 14 & 0x3FFFL);
				@Pc(508) int local508 = local181 - Static311.anInt5708;
				if (local495 < 0 || local508 < 0 || Static458.anInt9736 <= local495 || local508 >= Static378.anInt6747) {
					local482.method7908();
				}
			}
		}
		if (Static258.anInt4724 != 0) {
			Static345.anInt9498 -= local97;
			Static258.anInt4724 -= local92;
		}
		method7480();
		if (arg3 != 11) {
			Static375.anInt6733 -= local92;
			Static57.anInt1083 -= local97;
			Static393.anInt6978 -= local92 * 512;
			Static78.anInt1534 -= local97 * 512;
			Static506.anInt8778 -= local92;
			Static123.anInt2518 -= local97;
			if (Math.abs(local92) > Static458.anInt9736 || Math.abs(local97) > Static378.anInt6747) {
				Static585.method7837();
			}
		} else if (Static358.anInt9363 == 4) {
			Static173.anInt3244 -= local97 * 512;
			Static576.anInt4080 -= local92 * 512;
			Static183.anInt3630 -= local92 * 512;
			Static273.anInt1191 -= local97 * 512;
		} else {
			Static358.anInt9363 = 1;
			Static434.anInt7761 = -1;
			Static469.anInt8080 = -1;
		}
		Static202.method3101();
		Static339.method5062();
		Static297.aClass111_25.method2555();
		Static241.aClass111_21.method2555();
		Static337.aClass196_5.method4031();
		Static367.method5659();
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(IBIIII)V")
	public static void method7489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg0;
		@Pc(13) int local13 = arg1 * arg1;
		@Pc(17) int local17 = arg0 * arg0;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg0 << 1;
		@Pc(38) int local38 = (1 - local29) * local13 + local21;
		@Pc(47) int local47 = local17 - (local29 - 1) * local25;
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(75) int local75 = local25 * ((arg0 << 1) - 3);
		@Pc(81) int local81 = local55;
		@Pc(87) int local87 = (arg0 - 1) * local51;
		Static329.method4871(arg3 - arg1, arg1 + arg3, Static280.anIntArrayArray25[arg4], arg2);
		while (local9 > 0) {
			if (local38 < 0) {
				while (local38 < 0) {
					local38 += local63;
					local47 += local81;
					local63 += local55;
					local81 += local55;
					local7++;
				}
			}
			if (local47 < 0) {
				local47 += local81;
				local38 += local63;
				local81 += local55;
				local7++;
				local63 += local55;
			}
			local38 += -local87;
			local47 += -local75;
			local75 -= local51;
			local9--;
			local87 -= local51;
			@Pc(174) int local174 = arg4 - local9;
			@Pc(179) int local179 = arg4 + local9;
			@Pc(183) int local183 = local7 + arg3;
			@Pc(188) int local188 = arg3 - local7;
			Static329.method4871(local188, local183, Static280.anIntArrayArray25[local174], arg2);
			Static329.method4871(local188, local183, Static280.anIntArrayArray25[local179], arg2);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BC)Z")
	public static boolean method7493(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
