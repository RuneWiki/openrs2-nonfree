import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!nq", name = "g", descriptor = "J")
	public static long aLong130;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)Z", line = 7)
	public static boolean method4191(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 20 || arg0 == 12 || arg0 == 17 || arg0 == 1004) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1010;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!oe;ZZ)V", line = 26)
	public static void method4192(@OriginalArg(0) Class11_Sub5_Sub2_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		if (Class2_Sub3_Sub24.anInt4949 >= 400) {
			return;
		}
		@Pc(16) Class71 local16 = arg0.aClass71_1;
		if (local16.anIntArray129 != null) {
			local16 = local16.method2095(Static199.aClass226_1);
			if (local16 == null) {
				return;
			}
		}
		if (!local16.aBoolean145) {
			return;
		}
		@Pc(34) String local34 = local16.aString19;
		if (local16.anInt2037 != 0) {
			@Pc(50) String local50 = Class226.aClass50_4 == Class2_Sub3_Sub12.aClass50_1 ? Class2_Sub2_Sub17.aClass79_142.method2269(Class197.anInt5569) : Class12_Sub1.aClass79_96.method2269(Class197.anInt5569);
			local34 = local34 + Static166.method2345(Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173, local16.anInt2037) + " (" + local50 + local16.anInt2037 + ")";
		}
		if (!Class2_Sub2_Sub10_Sub2.aBoolean419) {
			if (!arg1) {
				@Pc(80) String[] local80 = local16.aStringArray14;
				if (Class2_Sub2.aBoolean465) {
					local80 = Static90.method2097(local80);
				}
				@Pc(90) int local90;
				if (local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && (Class2_Sub26.aClass50_3 != Class226.aClass50_4 || !local80[local90].equalsIgnoreCase(Class245.aClass79_146.method2269(Class197.anInt5569)))) {
							@Pc(110) byte local110 = 0;
							@Pc(112) int local112 = Class67.anInt1908;
							if (local90 == 0) {
								local110 = 5;
							}
							if (local90 == 1) {
								local110 = 25;
							}
							if (local90 == 2) {
								local110 = 4;
							}
							if (local90 == 3) {
								local110 = 3;
							}
							if (local90 == 4) {
								local110 = 8;
							}
							if (local90 == local16.anInt2015) {
								local112 = local16.anInt2009;
							}
							if (local90 == local16.anInt2033) {
								local112 = local16.anInt2018;
							}
							Static1.method3(-1, true, 0, false, local80[local90], 0, local110, "<col=ffff00>" + local34, local112, (long) arg0.anInt4610);
						}
					}
				}
				if (Class226.aClass50_4 == Class2_Sub26.aClass50_3 && local80 != null) {
					for (local90 = 4; local90 >= 0; local90--) {
						if (local80[local90] != null && local80[local90].equalsIgnoreCase(Class245.aClass79_146.method2269(Class197.anInt5569))) {
							@Pc(211) short local211 = 0;
							if (Static17.aClass11_Sub5_Sub2_Sub1_3.anInt4173 < local16.anInt2037) {
								local211 = 2000;
							}
							@Pc(224) short local224 = 0;
							if (local90 == 0) {
								local224 = 5;
							}
							if (local90 == 1) {
								local224 = 25;
							}
							if (local90 == 2) {
								local224 = 4;
							}
							if (local90 == 3) {
								local224 = 3;
							}
							if (local90 == 4) {
								local224 = 8;
							}
							if (local224 != 0) {
								local224 += local211;
							}
							Static1.method3(-1, true, 0, false, local80[local90], 0, local224, "<col=ffff00>" + local34, local16.anInt2021, (long) arg0.anInt4610);
						}
					}
				}
			}
			Static1.method3(-1, true, 0, arg1, Class2_Sub3_Sub36.aClass79_143.method2269(Class197.anInt5569), 0, 1006, "<col=ffff00>" + local34, Class2_Sub3_Sub13.anInt2520, (long) arg0.anInt4610);
		} else if (!arg1) {
			@Pc(335) Class240 local335 = Static161.anInt3294 == -1 ? null : Static338.aClass18_2.method565(Static161.anInt3294);
			if ((Static108.anInt3833 & 0x2) != 0) {
				if (local335 == null || local16.method2100(local335.anInt7010, Static161.anInt3294) != local335.anInt7010) {
					Static1.method3(-1, true, 0, false, Class67.aString18, 0, 10, Class173_Sub4.aString68 + " -> <col=ffff00>" + local34, Static38.anInt1043, (long) arg0.anInt4610);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZI)V", line = 195)
	public static void method4193(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static321.aClass2_Sub2_Sub17_3 != null) {
			Static90.anInt2032 = Static321.aClass2_Sub2_Sub17_3.anInt6856;
		} else {
			Static90.anInt2032 = -1;
		}
		Static211.aClass161_11 = null;
		Static321.aClass2_Sub2_Sub17_3 = null;
		Class235.anInt6569 = 0;
		Static184.aClass135_24 = null;
		Static321.method5514();
		Class216.aClass135_36.method3545();
		Static26.aClass113_2 = null;
		Static230.aClass113_8 = null;
		Static29.aClass113_3 = null;
		Class2_Sub10.anInt1761 = -1;
		Static70.aClass113_4 = null;
		Static321.aClass103_5 = null;
		Static2.aClass113_1 = null;
		Class163.anInt4321 = -1;
		Static344.aClass113_9 = null;
		Static164.aClass113_6 = null;
		Static100.aClass113_5 = null;
		Static346.aClass13_20 = null;
		Static321.aClass125_4.method3381();
		Static321.aClass104_4.method2704(64, 64);
		Static321.aClass125_4.method3378(64, 128);
		Static321.aClass202_3.method5162(64);
		Static299.aClass128_1.method3393(64);
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V", line = 241)
	public static void method4195() {
		Static189.anIntArray220 = Static298.method5480(0.4F);
	}
}
