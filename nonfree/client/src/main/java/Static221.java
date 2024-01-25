import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!lh", name = "u", descriptor = "Lclient!di;")
	public static final Class54 aClass54_60 = new Class54(37, 3);

	@OriginalMember(owner = "client!lh", name = "E", descriptor = "Lclient!qp;")
	public static final Class209 aClass209_97 = new Class209("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

	@OriginalMember(owner = "client!lh", name = "G", descriptor = "[I")
	public static int[] anIntArray361 = new int[1];

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method3465(@OriginalArg(1) Class49 arg0) {
		@Pc(7) int local7 = Static237.anInt4550;
		@Pc(9) int local9 = Static19.anInt5290;
		@Pc(11) int local11 = Static296.anInt5305;
		@Pc(15) int local15 = Static372.anInt2931 - 3;
		if (Static55.aClass17_9 == null || Static440.aClass17_57 == null) {
			if (Static153.aClass160_25.method3716(Static290.anInt5205) && Static153.aClass160_25.method3716(Static26.anInt604)) {
				Static55.aClass17_9 = arg0.method4435(Static459.method2069(Static153.aClass160_25, Static290.anInt5205, 0));
				@Pc(60) Class85 local60 = Static459.method2069(Static153.aClass160_25, Static26.anInt604, 0);
				Static440.aClass17_57 = arg0.method4435(local60);
				local60.method2074();
				Static281.aClass17_58 = arg0.method4435(local60);
			} else {
				arg0.O(local7, local9, local11, 20, 255 - Static78.anInt1748 << 24 | Static79.anInt1765, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static55.aClass17_9 != null && Static440.aClass17_57 != null) {
			local87 = (local11 - Static440.aClass17_57.la() * 2) / Static55.aClass17_9.la();
			for (local89 = 0; local89 < local87; local89++) {
				Static55.aClass17_9.method5767(local7 + Static440.aClass17_57.la() + local89 * Static55.aClass17_9.la(), local9);
			}
			Static440.aClass17_57.method5767(local7, local9);
			Static281.aClass17_58.method5767(local11 + local7 - Static281.aClass17_58.la(), local9);
		}
		Static114.aClass116_1.method4814(local7 + 3, Static360.aClass209_156.method4562(Static388.anInt6533), -1, local9 + 14, Static62.anInt1369 | 0xFF000000);
		arg0.O(local7, local9 + 20, local11, local15 - 20, -Static78.anInt1748 + 255 << 24 | Static79.anInt1765, 1);
		local87 = Static109.aClass1_2.method702();
		local89 = Static109.aClass1_2.method698();
		@Pc(175) int local175 = 0;
		@Pc(197) int local197;
		for (@Pc(180) Class2_Sub22 local180 = (Class2_Sub22) Static248.aClass14_35.method309(); local180 != null; local180 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			local197 = (Static373.anInt4900 - local175 - 1) * 16 + local9 + 20 + 13;
			if (local87 > local7 && local87 < local11 + local7 && local89 > local197 - 13 && local197 + 4 > local89 && local180.aBoolean281) {
				arg0.O(local7, local197 - 12, local11, 16, Static141.anInt3017 | 255 - Static239.anInt4590 << 24, 1);
			}
			local175++;
		}
		if ((Static35.aClass17_5 == null || Static375.aClass17_44 == null || Static37.aClass17_6 == null) && Static153.aClass160_25.method3716(Static5.anInt143) && Static153.aClass160_25.method3716(Static234.anInt4530) && Static153.aClass160_25.method3716(Static230.anInt4439)) {
			@Pc(273) Class85 local273 = Static459.method2069(Static153.aClass160_25, Static234.anInt4530, 0);
			Static375.aClass17_44 = arg0.method4435(local273);
			local273.method2074();
			Static284.aClass17_39 = arg0.method4435(local273);
			Static35.aClass17_5 = arg0.method4435(Static459.method2069(Static153.aClass160_25, Static5.anInt143, 0));
			@Pc(298) Class85 local298 = Static459.method2069(Static153.aClass160_25, Static230.anInt4439, 0);
			Static37.aClass17_6 = arg0.method4435(local298);
			local298.method2074();
			Static249.aClass17_36 = arg0.method4435(local298);
		}
		@Pc(365) int local365;
		@Pc(328) int local328;
		if (Static35.aClass17_5 != null && Static375.aClass17_44 != null && Static37.aClass17_6 != null) {
			local197 = (local11 - Static37.aClass17_6.la() * 2) / Static35.aClass17_5.la();
			for (local328 = 0; local328 < local197; local328++) {
				Static35.aClass17_5.method5767(local7 + Static37.aClass17_6.la() + local328 * Static35.aClass17_5.la(), local15 + local9 + -Static35.aClass17_5.ma());
			}
			local365 = (local15 - Static37.aClass17_6.ma() - 20) / Static375.aClass17_44.ma();
			for (@Pc(367) int local367 = 0; local367 < local365; local367++) {
				Static375.aClass17_44.method5767(local7, Static375.aClass17_44.ma() * local367 + local9 + 20);
				Static284.aClass17_39.method5767(local11 + local7 - Static284.aClass17_39.la(), local9 + 20 + local367 * Static375.aClass17_44.ma());
			}
			Static37.aClass17_6.method5767(local7, local15 + local9 - Static37.aClass17_6.ma());
			Static249.aClass17_36.method5767(local7 + local11 - Static37.aClass17_6.la(), local9 - -local15 + -Static37.aClass17_6.ma());
		}
		local175 = 0;
		for (@Pc(440) Class2_Sub22 local440 = (Class2_Sub22) Static248.aClass14_35.method309(); local440 != null; local440 = (Class2_Sub22) Static248.aClass14_35.method311()) {
			local328 = local9 + (-local175 + Static373.anInt4900 + -1) * 16 + 13 + 20;
			local365 = Static62.anInt1369 | 0xFF000000;
			if (local7 < local87 && local7 + local11 > local87 && local328 - 13 < local89 && local328 + 4 > local89 && local440.aBoolean281) {
				local365 = Static164.anInt3277 | 0xFF000000;
			}
			@Pc(499) int[] local499 = null;
			if (Static16.method324(local440.anInt3716)) {
				local499 = Static318.aClass144_6.method3265((int) local440.aLong114).anIntArray81;
			} else if (local440.anInt3720 != -1) {
				local499 = Static318.aClass144_6.method3265(local440.anInt3720).anIntArray81;
			} else if (Static387.method5124(local440.anInt3716)) {
				@Pc(527) Class3_Sub2_Sub1_Sub1 local527 = Static174.aClass3_Sub2_Sub1_Sub1Array1[(int) local440.aLong114];
				if (local527 != null) {
					@Pc(532) Class65 local532 = local527.aClass65_1;
					if (local532.anIntArray155 != null) {
						local532 = local532.method1710(Static344.aClass108_1);
					}
					if (local532 != null) {
						local499 = local532.anIntArray158;
					}
				}
			} else if (Static429.method5145(local440.anInt3716)) {
				@Pc(568) Class134 local568;
				if (local440.anInt3716 == 1006) {
					local568 = Static118.aClass165_2.method3799((int) local440.aLong114);
				} else {
					local568 = Static118.aClass165_2.method3799((int) (local440.aLong114 >>> 32 & 0x7FFFFFFFL));
				}
				if (local568.anIntArray322 != null) {
					local568 = local568.method2969(Static344.aClass108_1);
				}
				if (local568 != null) {
					local499 = local568.anIntArray323;
				}
			}
			@Pc(604) String local604 = Static398.method5260(local440);
			if (local499 != null) {
				local604 = local604 + Static336.method4687(local499);
			}
			Static114.aClass116_1.method4807(local328, Static89.anIntArray160, Static90.aClass17Array3, local604, local7 + 3, local365);
			local175++;
			if (local440.aBoolean282) {
				Static31.aClass17_4.method5767(local7 + Static172.aClass58_5.method1340(local604) + 5, local328 + -12);
			}
		}
		Static138.method2345(Static296.anInt5305, Static372.anInt2931, Static19.anInt5290, Static237.anInt4550);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!mg;Lclient!mg;Lclient!mg;ZLclient!mg;)V")
	public static void method3468(@OriginalArg(0) Class160 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class160 arg2, @OriginalArg(4) Class160 arg3) {
		Static277.aClass160_56 = arg1;
		Static207.aClass160_38 = arg2;
		Static229.aClass160_45 = arg3;
		Static373.aClass160_55 = arg0;
		Static60.aClass68ArrayArray1 = new Class68[Static277.aClass160_56.method3715()][];
		Static214.aBooleanArray18 = new boolean[Static277.aClass160_56.method3715()];
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)V")
	public static void method3469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class163 local10 = new Class163(16);
		for (@Pc(23) Class2_Sub14 local23 = (Class2_Sub14) Static132.aClass163_13.method3771(); local23 != null; local23 = (Class2_Sub14) Static132.aClass163_13.method3770()) {
			local23.method5866();
			@Pc(34) int local34 = (int) (local23.aLong227 >> 28);
			@Pc(45) int local45 = (int) (local23.aLong227 >> 14 & 0x3FFFL) - arg1;
			@Pc(54) int local54 = (int) (local23.aLong227 & 0x3FFFL) - arg0;
			if (local54 >= 0 && local45 >= 0 && Static229.anInt4427 > local54 && local45 < Static379.anInt6422) {
				local10.method3764((long) (local34 << 28 | local45 << 14 | local54), local23);
			}
		}
		Static132.aClass163_13 = local10;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Lclient!ba;III[Z)V")
	public static void method3470(@OriginalArg(0) Class2_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static58.aClass64Array1 == Static440.aClass64Array3) {
			return;
		}
		@Pc(9) int local9 = Static263.aClass64Array2[arg1].a(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class64 local22 = Static263.aClass64Array2[local11];
				if (local22 != null) {
					local22.p(arg0, arg2, local9 - local22.a(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
