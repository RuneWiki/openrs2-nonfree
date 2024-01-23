import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!th", name = "Xc", descriptor = "Lclient!e;")
	public static Class45 aClass45_4;

	@OriginalMember(owner = "client!th", name = "Lc", descriptor = "Lclient!fa;")
	public static Class53 aClass53_11 = new Class53(64);

	@OriginalMember(owner = "client!th", name = "ed", descriptor = "Lclient!di;")
	public static Class41 aClass41_1 = new Class41();

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!mn;II)I")
	public static int method4106(@OriginalArg(0) Class115 arg0, @OriginalArg(2) int arg1) {
		if (!Static35.method708(arg0).method1315(arg1) && arg0.anObjectArray18 == null) {
			return -1;
		} else if (arg0.anIntArray281 == null || arg1 >= arg0.anIntArray281.length) {
			return -1;
		} else {
			return arg0.anIntArray281[arg1];
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I[Ljava/lang/String;IB[S)V")
	public static void method4107(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(10) int local10 = arg0;
		@Pc(17) int local17 = (arg0 + arg2) / 2;
		@Pc(21) String local21 = arg1[local17];
		arg1[local17] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) short local35 = arg3[local17];
		arg3[local17] = arg3[arg2];
		arg3[arg2] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg2; local47++) {
			if (local21 == null || arg1[local47] != null && arg1[local47].compareTo(local21) < (local47 & 0x1)) {
				@Pc(78) String local78 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10] = local78;
				@Pc(92) short local92 = arg3[local47];
				arg3[local47] = arg3[local10];
				arg3[local10++] = local92;
			}
		}
		arg1[arg2] = arg1[local10];
		arg1[local10] = local21;
		arg3[arg2] = arg3[local10];
		arg3[local10] = local35;
		method4107(arg0, arg1, local10 - 1, arg3);
		method4107(local10 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IZ)V")
	public static void method4108(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static17.anInt427 != -1) {
				Static299.method2237(Static17.anInt427);
			}
			for (@Pc(24) Class2_Sub15 local24 = (Class2_Sub15) Static152.aClass79_14.method1992(); local24 != null; local24 = (Class2_Sub15) Static152.aClass79_14.method1991()) {
				Static119.method2202(local24, true);
			}
			Static17.anInt427 = -1;
			Static152.aClass79_14 = new Class79(8);
			Static155.method4932();
			Static17.anInt427 = Static57.anInt1998;
			Static208.method3526(false);
			Static55.method1085();
			Static95.method1829(Static17.anInt427);
		}
		Static260.anInt5409 = -1;
		Static15.method319(Static139.anInt3000);
		Static111.aClass36_Sub3_Sub2_1 = new Class36_Sub3_Sub2();
		Static111.aClass36_Sub3_Sub2_1.anInt5109 = 3000;
		Static111.aClass36_Sub3_Sub2_1.anInt5093 = 3000;
		if (!Static60.aBoolean106 && Static84.anInt825 == 0) {
			Static155.method4928(Static201.aClass84_85);
			Static21.method453(10);
			return;
		}
		if (Static101.anInt6027 == 2) {
			Static255.anInt5182 = Static131.anInt2690 << 7;
			Static271.anInt5632 = Static216.anInt4483 << 7;
		} else {
			Static19.method418();
		}
		if (Static60.aBoolean106) {
			Static152.method2618();
		}
		Static199.method3365();
		Static21.method453(28);
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!ma;ILclient!ma;)V")
	public static void method4111(@OriginalArg(0) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg0.aClass2_230 != null) {
			arg0.method4926();
		}
		arg0.aClass2_230 = arg1.aClass2_230;
		arg0.aClass2_231 = arg1;
		arg0.aClass2_230.aClass2_231 = arg0;
		arg0.aClass2_231.aClass2_230 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!jd;)V")
	public static void method4115(@OriginalArg(1) Class84 arg0) {
		Static290.aClass84_126 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4116(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(9) int local9 = 0; local9 < Static37.aClass113_1.anInt3429; local9++) {
			if (Static37.aClass113_1.method2821(local9)) {
				@Pc(50) int[] local50 = Static197.aClass2_Sub3_Sub18_2.method2981(Static37.aClass113_1.anIntArray261[local9] >> 14 & 0x3FFF, Static37.aClass113_1.anIntArray261[local9] >> 28 & 0x3, Static37.aClass113_1.anIntArray261[local9] & 0x3FFF);
				if (local50 != null) {
					@Pc(62) int local62 = local50[1] - Static115.anInt2461;
					@Pc(73) int local73 = Static52.anInt1205 + Static239.anInt4870 - local50[2] - 1;
					@Pc(90) int local90 = arg4 + (arg7 - arg4) * (local62 - arg3) / (arg0 - arg3);
					@Pc(95) int local95 = Static37.aClass113_1.method2826(local9);
					@Pc(112) int local112 = arg5 + (arg6 - arg5) * (-arg1 + local73) / (arg2 - arg1);
					@Pc(114) int local114 = 16777215;
					@Pc(116) Class61 local116 = null;
					if (local95 == 0) {
						if ((double) Static280.aFloat55 == 3.0D) {
							local116 = Static1.aClass61_1;
						}
						if ((double) Static280.aFloat55 == 4.0D) {
							local116 = Static187.aClass61_6;
						}
						if ((double) Static280.aFloat55 == 6.0D) {
							local116 = Static101.aClass61_12;
						}
						if ((double) Static280.aFloat55 >= 8.0D) {
							local116 = Static7.aClass61_2;
						}
					}
					if (local95 == 1) {
						if ((double) Static280.aFloat55 == 3.0D) {
							local116 = Static101.aClass61_12;
						}
						if ((double) Static280.aFloat55 == 4.0D) {
							local116 = Static7.aClass61_2;
						}
						if ((double) Static280.aFloat55 == 6.0D) {
							local116 = Static214.aClass61_7;
						}
						if ((double) Static280.aFloat55 >= 8.0D) {
							local116 = Static152.aClass61_5;
						}
					}
					if (local95 == 2) {
						if ((double) Static280.aFloat55 == 3.0D) {
							local116 = Static214.aClass61_7;
						}
						if ((double) Static280.aFloat55 == 4.0D) {
							local116 = Static152.aClass61_5;
						}
						if ((double) Static280.aFloat55 == 6.0D) {
							local116 = Static56.aClass61_3;
						}
						local114 = 16755200;
						if ((double) Static280.aFloat55 >= 8.0D) {
							local116 = Static234.aClass61_8;
						}
					}
					if (Static37.aClass113_1.anIntArray260[local9] != -1) {
						local114 = Static37.aClass113_1.anIntArray260[local9];
					}
					if (local116 != null) {
						@Pc(244) int local244 = Static162.aClass2_Sub3_Sub5_2.method3302(Static37.aClass113_1.aStringArray15[local9], null, Static255.aStringArray30);
						local112 -= local116.method1599() * (local244 - 1) / 2;
						local112 += local116.method1606() / 2;
						for (@Pc(264) int local264 = 0; local264 < local244; local264++) {
							@Pc(271) String local271 = Static255.aStringArray30[local264];
							if (local244 - 1 > local264) {
								local271 = local271.substring(0, local271.length() - 4);
							}
							local116.method1602(local271, local90, local112, local114);
							local112 += local116.method1599();
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "h", descriptor = "(I)V")
	public static void method4117() {
		Static185.aClass115Array2 = null;
		Static11.method252(0, Static20.anInt1235, 0, Static257.anInt5343, 0, Static17.anInt427, -1, 0);
		if (Static185.aClass115Array2 != null) {
			Static269.method4488(Static156.anInt5522, Static257.anInt5343, -1412584499, Static150.anInt3182, Static20.anInt1235, 0, Static185.aClass115Array2, Static11.aClass115_1.anInt3471, 0);
			Static185.aClass115Array2 = null;
		}
	}
}
