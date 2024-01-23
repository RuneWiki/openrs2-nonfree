import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString389 = "Your ignore list is full. Max of 100 users.";

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[Lclient!gk;")
	public static Class1_Sub2_Sub8[] aClass1_Sub2_Sub8Array107 = new Class1_Sub2_Sub8[14];

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "I")
	public static int anInt5511 = 1;

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public static int anInt5512 = 0;

	@OriginalMember(owner = "client!jg", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString390 = "Checking for updates - ";

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(I[Lclient!se;I)V")
	public static void method4185(@OriginalArg(1) Class122[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(11) Class122 local11 = arg0[local3];
			if (local11 != null && arg1 == local11.anInt4703 && (!local11.aBoolean228 || !Static39.method707(local11))) {
				if (local11.anInt4656 == 0) {
					if (!local11.aBoolean228 && Static39.method707(local11) && local11 != Static155.aClass122_11) {
						continue;
					}
					method4185(arg0, local11.anInt4686);
					if (local11.aClass122Array2 != null) {
						method4185(local11.aClass122Array2, local11.anInt4686);
					}
					@Pc(64) Class1_Sub5 local64 = (Class1_Sub5) Static204.aClass140_13.method4014((long) local11.anInt4686);
					if (local64 != null) {
						Static63.method1218(local64.anInt1358);
					}
				}
				if (local11.anInt4656 == 6) {
					@Pc(92) int local92;
					if (local11.anInt4680 != -1 || local11.anInt4655 != -1) {
						@Pc(87) boolean local87 = Static75.method1472(local11);
						if (local87) {
							local92 = local11.anInt4655;
						} else {
							local92 = local11.anInt4680;
						}
						if (local92 != -1) {
							@Pc(105) Class49 local105 = Static131.method697(local92);
							if (local105 != null) {
								local11.anInt4666 += Static37.anInt999;
								while (local11.anInt4666 > local105.anIntArray170[local11.anInt4675]) {
									local11.anInt4666 -= local105.anIntArray170[local11.anInt4675];
									local11.anInt4675++;
									if (local105.anIntArray168.length <= local11.anInt4675) {
										local11.anInt4675 -= local105.anInt2195;
										if (local11.anInt4675 < 0 || local105.anIntArray168.length <= local11.anInt4675) {
											local11.anInt4675 = 0;
										}
									}
									local11.anInt4647 = local11.anInt4675 + 1;
									if (local105.anIntArray168.length <= local11.anInt4647) {
										local11.anInt4647 -= local105.anInt2195;
										if (local11.anInt4647 < 0 || local11.anInt4647 >= local105.anIntArray168.length) {
											local11.anInt4647 = -1;
										}
									}
									Static257.method4146(local11);
								}
							}
						}
					}
					if (local11.anInt4690 != 0 && !local11.aBoolean228) {
						local92 = local11.anInt4690 << 16 >> 16;
						@Pc(230) int local230 = local11.anInt4690 >> 16;
						@Pc(234) int local234 = local230 * Static37.anInt999;
						local11.anInt4660 = local11.anInt4660 + local234 & 0x7FF;
						local92 *= Static37.anInt999;
						local11.anInt4661 = local92 + local11.anInt4661 & 0x7FF;
						Static257.method4146(local11);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIII)V")
	public static void method4189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg3 - arg1;
		@Pc(15) int local15 = arg4 - arg2;
		if (local10 == 0) {
			if (local15 != 0) {
				Static77.method1515(arg0, arg4, arg2, arg1);
			}
		} else if (local15 == 0) {
			Static155.method2759(arg0, arg3, arg2, arg1);
		} else {
			@Pc(51) int local51 = (local15 << 12) / local10;
			@Pc(60) int local60 = arg2 - (local51 * arg1 >> 12);
			@Pc(77) int local77;
			@Pc(75) int local75;
			if (Static167.anInt3907 > arg3) {
				local75 = (Static167.anInt3907 * local51 >> 12) + local60;
				local77 = Static167.anInt3907;
			} else if (Static150.anInt3860 >= arg3) {
				local77 = arg3;
				local75 = arg4;
			} else {
				local77 = Static150.anInt3860;
				local75 = local60 + (Static150.anInt3860 * local51 >> 12);
			}
			@Pc(107) int local107;
			@Pc(115) int local115;
			if (arg1 < Static167.anInt3907) {
				local107 = Static167.anInt3907;
				local115 = local60 + (local51 * Static167.anInt3907 >> 12);
			} else if (Static150.anInt3860 < arg1) {
				local107 = Static150.anInt3860;
				local115 = (local51 * Static150.anInt3860 >> 12) + local60;
			} else {
				local115 = arg2;
				local107 = arg1;
			}
			if (local75 < Static202.anInt4469) {
				local75 = Static202.anInt4469;
				local77 = (Static202.anInt4469 - local60 << 12) / local51;
			} else if (local75 > Static94.anInt4237) {
				local75 = Static94.anInt4237;
				local77 = (Static94.anInt4237 - local60 << 12) / local51;
			}
			if (local115 < Static202.anInt4469) {
				local107 = (Static202.anInt4469 - local60 << 12) / local51;
				local115 = Static202.anInt4469;
			} else if (local115 > Static94.anInt4237) {
				local115 = Static94.anInt4237;
				local107 = (Static94.anInt4237 - local60 << 12) / local51;
			}
			Static214.method3516(local77, arg0, local75, local115, local107);
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(I)V")
	public static void method4190() {
		Static9.anInt373 = -1;
		Static259.aBoolean280 = false;
		Static171.aClass1_Sub13_Sub1_3.anInt2395 = 0;
		Static230.anInt5417 = 0;
		Static196.anInt1185 = 0;
		Static117.anInt3040 = -1;
		Static69.anInt1874 = 0;
		Static121.anInt3108 = 0;
		Static58.aClass1_Sub13_Sub1_1.anInt2395 = 0;
		Static221.anInt4829 = -1;
		Static149.anInt3579 = 0;
		Static239.anInt5157 = 0;
		Static100.anInt2738 = -1;
		for (@Pc(43) int local43 = 0; local43 < Static147.aClass9_Sub1_Sub1Array1.length; local43++) {
			if (Static147.aClass9_Sub1_Sub1Array1[local43] != null) {
				Static147.aClass9_Sub1_Sub1Array1[local43].anInt423 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static36.aClass9_Sub1_Sub2Array2.length; local61++) {
			if (Static36.aClass9_Sub1_Sub2Array2[local61] != null) {
				Static36.aClass9_Sub1_Sub2Array2[local61].anInt423 = -1;
			}
		}
		Static148.method209();
		Static61.anInt1682 = 1;
		Static168.method2918(30);
		for (@Pc(86) int local86 = 0; local86 < 100; local86++) {
			Static198.aBooleanArray19[local86] = true;
		}
		Static181.method3122();
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method4191() {
		Static265.method4216();
		Static122.method2380();
		Static179.method3060();
		Static45.method948();
		Static194.method3277();
		Static216.method3549();
		Static211.method3591();
		Static21.method407();
		Static243.method3990();
		Static165.method2878();
		Static94.method3204();
		Static239.method3935();
		Static25.method505();
		Static73.method1455();
		Static7.method1523();
		Static7.method1522();
		Static211.method3590();
		Static35.method625();
		Static94.method3208();
		Static122.method2377();
		Static127.aClass79_18.method2479(5);
		Static158.aClass79_21.method2479(5);
	}

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "(I)V")
	public static void method4192() {
		for (@Pc(3) int local3 = 0; local3 < Static253.anInt3818; local3++) {
			@Pc(9) int local9 = Static126.anIntArray244[local3];
			@Pc(13) Class9_Sub1_Sub1 local13 = Static147.aClass9_Sub1_Sub1Array1[local9];
			@Pc(17) int local17 = Static58.aClass1_Sub13_Sub1_1.method1772();
			if ((local17 & 0x80) != 0) {
				local17 += Static58.aClass1_Sub13_Sub1_1.method1772() << 8;
			}
			Static262.method4181(local9, local17, local13);
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lclient!jg;ZLclient!jg;)V")
	public static void method4193(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_212 != null) {
			arg0.method4186();
		}
		arg0.aClass1_212 = arg1.aClass1_212;
		arg0.aClass1_213 = arg1;
		arg0.aClass1_212.aClass1_213 = arg0;
		arg0.aClass1_213.aClass1_212 = arg0;
	}
}
