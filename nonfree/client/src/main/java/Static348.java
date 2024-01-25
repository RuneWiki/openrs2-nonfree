import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static348 {

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Lclient!sq;")
	public static Class237 aClass237_1;

	@OriginalMember(owner = "client!rf", name = "V", descriptor = "Lclient!mj;")
	public static Class159 aClass159_3;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "[I")
	public static final int[] anIntArray498 = new int[14];

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public static void method5081(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static65.anInt1626 >= 100 && !Static445.aBoolean558 || Static65.anInt1626 >= 200) {
			Static200.method3529(Static309.aClass21_93.method362(Static168.anInt3290));
			return;
		}
		@Pc(29) String local29 = Static315.method4358(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static65.anInt1626; local34++) {
			@Pc(42) String local42 = Static315.method4358(Static75.aStringArray9[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static200.method3529(arg0 + Static268.aClass21_75.method362(Static168.anInt3290));
				return;
			}
			if (Static108.aStringArray10[local34] != null) {
				local72 = Static315.method4358(Static108.aStringArray10[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static200.method3529(arg0 + Static268.aClass21_75.method362(Static168.anInt3290));
					return;
				}
			}
		}
		for (@Pc(98) int local98 = 0; local98 < Static401.anInt7085; local98++) {
			local72 = Static315.method4358(Static225.aStringArray20[local98]);
			if (local72 != null && local72.equals(local29)) {
				Static200.method3529(Static364.aClass21_103.method362(Static168.anInt3290) + arg0 + Static193.aClass21_48.method362(Static168.anInt3290));
				return;
			}
			if (Static244.aStringArray22[local98] != null) {
				@Pc(141) String local141 = Static315.method4358(Static244.aStringArray22[local98]);
				if (local141 != null && local141.equals(local29)) {
					Static200.method3529(Static364.aClass21_103.method362(Static168.anInt3290) + arg0 + Static193.aClass21_48.method362(Static168.anInt3290));
					return;
				}
			}
		}
		if (Static315.method4358(Static52.aClass11_Sub5_Sub2_Sub1_2.aString31).equals(local29)) {
			Static200.method3529(Static268.aClass21_76.method362(Static168.anInt3290));
		} else {
			Static448.method6134(Static410.aClass212_92);
			Static457.aClass4_Sub20_Sub1_5.method4590(Static316.method4760(arg0));
			Static457.aClass4_Sub20_Sub1_5.method4599(arg0);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!qa;I)V")
	public static void method5083(@OriginalArg(0) Class30 arg0) {
		@Pc(7) int local7 = Static22.anInt426;
		@Pc(9) int local9 = Static223.anInt4455;
		@Pc(11) int local11 = Static177.anInt3637;
		@Pc(15) int local15 = Static153.anInt3164 - 3;
		if (Static242.aClass2_24 == null || Static455.aClass2_28 == null) {
			if (Static143.aClass38_30.method1037(Static236.anInt4669) && Static143.aClass38_30.method1037(Static256.anInt4943)) {
				Static242.aClass2_24 = arg0.method2031(Static472.method2850(Static143.aClass38_30, Static236.anInt4669, 0));
				@Pc(61) Class98 local61 = Static472.method2850(Static143.aClass38_30, Static256.anInt4943, 0);
				Static455.aClass2_28 = arg0.method2031(local61);
				local61.method2838();
				Static65.aClass2_8 = arg0.method2031(local61);
			} else {
				arg0.M(local7, local9, local11, 20, 255 - Static68.anInt1676 << 24 | Static162.anInt1714, 1);
			}
		}
		@Pc(90) int local90;
		@Pc(88) int local88;
		if (Static242.aClass2_24 != null && Static455.aClass2_28 != null) {
			local88 = (local11 - Static455.aClass2_28.TA() * 2) / Static242.aClass2_24.TA();
			for (local90 = 0; local90 < local88; local90++) {
				Static242.aClass2_24.method5921(local7 + Static455.aClass2_28.TA() + Static242.aClass2_24.TA() * local90, local9);
			}
			Static455.aClass2_28.method5921(local7, local9);
			Static65.aClass2_8.method5921(local7 + local11 - Static65.aClass2_8.TA(), local9);
		}
		Static247.aClass18_2.method5769(Static311.aClass21_95.method362(Static168.anInt3290), local7 + 3, -1, local9 + 14, Static133.anInt2730 | 0xFF000000);
		arg0.M(local7, local9 + 20, local11, local15 - 20, -Static68.anInt1676 + 255 << 24 | Static162.anInt1714, 1);
		local88 = Static329.aClass95_1.method5170();
		local90 = Static329.aClass95_1.method5175();
		@Pc(172) int local172 = 0;
		@Pc(194) int local194;
		for (@Pc(177) Class4_Sub14 local177 = (Class4_Sub14) Static289.aClass91_31.method2584(); local177 != null; local177 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			local194 = (Static352.anInt6233 - local172 - 1) * 16 + local9 + 13 + 20;
			if (local88 > local7 && local88 < local7 + local11 && local194 - 13 < local90 && local90 < local194 + 4 && local177.aBoolean149) {
				arg0.M(local7, local194 - 12, local11, 16, 255 - Static229.anInt4567 << 24 | Static334.anInt5864, 1);
			}
			local172++;
		}
		if ((Static388.aClass2_25 == null || Static163.aClass2_29 == null || Static140.aClass2_14 == null) && Static143.aClass38_30.method1037(Static207.anInt4223) && Static143.aClass38_30.method1037(Static364.anInt6346) && Static143.aClass38_30.method1037(Static382.anInt3953)) {
			@Pc(273) Class98 local273 = Static472.method2850(Static143.aClass38_30, Static364.anInt6346, 0);
			Static163.aClass2_29 = arg0.method2031(local273);
			local273.method2838();
			Static450.aClass2_18 = arg0.method2031(local273);
			Static388.aClass2_25 = arg0.method2031(Static472.method2850(Static143.aClass38_30, Static207.anInt4223, 0));
			@Pc(298) Class98 local298 = Static472.method2850(Static143.aClass38_30, Static382.anInt3953, 0);
			Static140.aClass2_14 = arg0.method2031(local298);
			local298.method2838();
			Static114.aClass2_12 = arg0.method2031(local298);
		}
		local172 = 0;
		@Pc(367) int local367;
		@Pc(331) int local331;
		if (Static388.aClass2_25 != null && Static163.aClass2_29 != null && Static140.aClass2_14 != null) {
			local194 = (local11 - Static140.aClass2_14.TA() * 2) / Static388.aClass2_25.TA();
			for (local331 = 0; local331 < local194; local331++) {
				Static388.aClass2_25.method5921(Static140.aClass2_14.TA() + local7 + Static388.aClass2_25.TA() * local331, -Static388.aClass2_25.V() + local15 + local9);
			}
			local367 = (local15 - Static140.aClass2_14.V() - 20) / Static163.aClass2_29.V();
			for (@Pc(369) int local369 = 0; local369 < local367; local369++) {
				Static163.aClass2_29.method5921(local7, local369 * Static163.aClass2_29.V() + local9 + 20);
				Static450.aClass2_18.method5921(local11 + local7 - Static450.aClass2_18.TA(), local369 * Static163.aClass2_29.V() + (local9 - -20));
			}
			Static140.aClass2_14.method5921(local7, local15 + local9 - Static140.aClass2_14.V());
			Static114.aClass2_12.method5921(local11 + local7 - Static140.aClass2_14.TA(), -Static140.aClass2_14.V() + local15 + local9);
		}
		for (@Pc(438) Class4_Sub14 local438 = (Class4_Sub14) Static289.aClass91_31.method2584(); local438 != null; local438 = (Class4_Sub14) Static289.aClass91_31.method2586()) {
			local331 = (Static352.anInt6233 - local172 - 1) * 16 + local9 + 33;
			local367 = Static133.anInt2730 | 0xFF000000;
			if (local88 > local7 && local7 + local11 > local88 && local90 > local331 - 13 && local90 < local331 + 4 && local438.aBoolean149) {
				local367 = Static224.anInt4457 | 0xFF000000;
			}
			@Pc(499) int[] local499 = null;
			if (Static383.method5405(local438.anInt2132)) {
				local499 = Static139.aClass193_1.method4650((int) local438.aLong69).anIntArray625;
			} else if (local438.anInt2130 != -1) {
				local499 = Static139.aClass193_1.method4650(local438.anInt2130).anIntArray625;
			} else if (Static258.method3303(local438.anInt2132)) {
				@Pc(577) Class4_Sub44 local577 = (Class4_Sub44) Static80.aClass96_8.method2797((long) local438.aLong69);
				if (local577 != null) {
					@Pc(582) Class11_Sub5_Sub2_Sub2 local582 = local577.aClass11_Sub5_Sub2_Sub2_2;
					@Pc(585) Class241 local585 = local582.aClass241_1;
					if (local585.anIntArray565 != null) {
						local585 = local585.method5593(Static67.aClass224_1);
					}
					if (local585 != null) {
						local499 = local585.anIntArray562;
					}
				}
			} else if (Static463.method6261(local438.anInt2132)) {
				@Pc(542) Class139 local542;
				if (local438.anInt2132 == 1007) {
					local542 = Static146.aClass228_1.method5203((int) local438.aLong69);
				} else {
					local542 = Static146.aClass228_1.method5203((int) (local438.aLong69 >>> 32 & 0x7FFFFFFFL));
				}
				if (local542.anIntArray344 != null) {
					local542 = local542.method3751(Static67.aClass224_1);
				}
				if (local542 != null) {
					local499 = local542.anIntArray343;
				}
			}
			@Pc(611) String local611 = Static311.method4739(local438);
			if (local499 != null) {
				local611 = local611 + Static418.method2688(local499);
			}
			Static247.aClass18_2.method5764(Static171.aClass2Array26, local367, local611, local7 + 3, Static104.anIntArray195, local331);
			if (local438.aBoolean150) {
				Static151.aClass2_17.method5921(local7 + Static296.aClass84_10.method2381(local611) + 5, local331 + -12);
			}
			local172++;
		}
		Static92.method1817(Static153.anInt3164, Static177.anInt3637, Static22.anInt426, Static223.anInt4455);
	}
}
