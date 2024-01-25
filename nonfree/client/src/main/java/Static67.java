import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public static int anInt1397;

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
	public static int anInt1402 = 0;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLjava/lang/String;Lclient!hia;Lclient!da;BLclient!ha;)V")
	public static void method1169(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(3) Class50 arg3, @OriginalArg(5) Class100 arg4) {
		@Pc(17) boolean local17 = !Static531.aBoolean616 || Static385.method6201();
		if (!local17) {
			return;
		}
		@Pc(31) int local31;
		@Pc(40) int local40;
		if (Static531.aBoolean616 && local17) {
			@Pc(143) Class133 local143 = Static510.aClass133_41;
			@Pc(149) Class50 local149 = arg4.method8808(local143, Static368.aClass98Array1);
			local31 = local143.method3639(250, (Class32[]) null, arg1);
			local40 = local143.method3646((Class32[]) null, arg1, 250, local143.anInt4195);
			@Pc(170) int local170 = Static431.aClass98_26.anInt2796;
			@Pc(174) int local174 = local170 + 4;
			local31 += local174 * 2;
			local40 += local174 * 2;
			if (local40 < Static247.anInt4938) {
				local40 = Static247.anInt4938;
			}
			if (Static446.anInt8019 > local31) {
				local31 = Static446.anInt8019;
			}
			@Pc(205) int local205 = Static242.aClass238_7.method6456(Static507.anInt8741, local31) + Static289.anInt5726;
			@Pc(214) int local214 = Static242.aClass79_12.method2054(local40, Static106.anInt2101) + Static384.anInt7275;
			if (Static389.aBoolean497) {
				local205 += Static240.method4161();
				local214 += Static452.method6945();
			}
			arg4.method8773(Static639.aClass98_34, false).method5083(local205 + Static176.aClass98_35.anInt2796, local214 + Static176.aClass98_35.anInt2799, local31 - Static176.aClass98_35.anInt2796 * 2, local40 - Static176.aClass98_35.anInt2799 * 2, 1, 0, 0);
			arg4.method8773(Static176.aClass98_35, true).method5071(local205, local214);
			Static176.aClass98_35.method2399();
			arg4.method8773(Static176.aClass98_35, true).method5071(local205 + local31 - local170, local214);
			Static176.aClass98_35.method2402();
			arg4.method8773(Static176.aClass98_35, true).method5071(local31 + local205 - local170, local214 - (-local40 + local170));
			Static176.aClass98_35.method2399();
			arg4.method8773(Static176.aClass98_35, true).method5071(local205, local40 + local214 - local170);
			Static176.aClass98_35.method2402();
			arg4.method8773(Static431.aClass98_26, true).method5092(local205, local214 + Static176.aClass98_35.anInt2799, local170, local40 - Static176.aClass98_35.anInt2799 * 2);
			Static431.aClass98_26.method2395();
			arg4.method8773(Static431.aClass98_26, true).method5092(local205 + Static176.aClass98_35.anInt2796, local214, local31 - Static176.aClass98_35.anInt2796 * 2, local170);
			Static431.aClass98_26.method2395();
			arg4.method8773(Static431.aClass98_26, true).method5092(local31 + local205 - local170, Static176.aClass98_35.anInt2799 + local214, local170, local40 - Static176.aClass98_35.anInt2799 * 2);
			Static431.aClass98_26.method2395();
			arg4.method8773(Static431.aClass98_26, true).method5092(local205 + Static176.aClass98_35.anInt2796, local40 + local214 + -local170, local31 - Static176.aClass98_35.anInt2796 * 2, local170);
			Static431.aClass98_26.method2395();
			local149.method5742(0, (int[]) null, local214 + local174, Static210.anInt4131 | 0xFF000000, 0, (Class1) null, 1, arg1, 0, 1, local40 - local174 * 2, local31 - local174 * 2, local174 + local205, -1, (Class32[]) null);
			Static143.method2301(local40, local205, local31, local214);
		} else {
			local31 = arg2.method3639(250, (Class32[]) null, arg1);
			local40 = arg2.method3648(250, (Class32[]) null, arg1) * 13;
			arg4.aa(6, 6, local31 + 4 + 4, local40 + 4 + 4, -16777216, 0);
			arg4.method8845(6, 6, local31 + 4 + 4, local40 + 8, -1, 0);
			arg3.method5742(0, (int[]) null, 10, -1, 0, (Class1) null, 1, arg1, 0, 1, local40, local31, 10, -1, (Class32[]) null);
			Static143.method2301(local40 + 4 + 4, 6, local31 + 4 + 4, 6);
		}
		if (!arg0) {
			return;
		}
		try {
			if (Static389.aBoolean497) {
				Static132.method2138();
			} else {
				arg4.method8772();
			}
		} catch (@Pc(451) Exception_Sub1 local451) {
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)[Lclient!hc;")
	public static Class125[] method1170() {
		if (Static35.aClass125Array1 == null) {
			@Pc(7) Class125[] local7 = Static510.method7558(Static529.aClass112_6);
			@Pc(11) Class125[] local11 = new Class125[local7.length];
			@Pc(13) int local13 = 0;
			@Pc(18) int local18 = Static348.aClass6_Sub22_19.aClass15_Sub16_1.method5372();
			@Pc(77) int local77;
			@Pc(83) Class125 local83;
			label70: for (@Pc(20) int local20 = 0; local20 < local7.length; local20++) {
				@Pc(26) Class125 local26 = local7[local20];
				if ((local26.anInt4047 <= 0 || local26.anInt4047 >= 24) && local26.anInt4044 >= 800 && local26.anInt4045 >= 600 && (local18 != 2 || local26.anInt4044 <= 800 && local26.anInt4045 <= 600) && (local18 != 1 || local26.anInt4044 <= 1024 && local26.anInt4045 <= 768)) {
					for (local77 = 0; local77 < local13; local77++) {
						local83 = local11[local77];
						if (local83.anInt4044 == local26.anInt4044 && local83.anInt4045 == local26.anInt4045) {
							if (local26.anInt4047 > local83.anInt4047) {
								local11[local77] = local26;
							}
							continue label70;
						}
					}
					local11[local13] = local26;
					local13++;
				}
			}
			Static35.aClass125Array1 = new Class125[local13];
			Static655.method5831(local11, 0, Static35.aClass125Array1, 0, local13);
			@Pc(143) int[] local143 = new int[Static35.aClass125Array1.length];
			for (local77 = 0; local77 < Static35.aClass125Array1.length; local77++) {
				local83 = Static35.aClass125Array1[local77];
				local143[local77] = local83.anInt4045 * local83.anInt4044;
			}
			Static610.method8505(local143, Static35.aClass125Array1);
		}
		return Static35.aClass125Array1;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Z")
	public static boolean method1171(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(BII)Z")
	public static boolean method1172(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!s;)V")
	public static void method1173(@OriginalArg(0) int arg0, @OriginalArg(1) Class199 arg1) {
		Static195.aClass199Array1[arg0] = arg1;
	}
}
