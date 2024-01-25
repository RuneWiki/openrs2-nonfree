import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static386 {

	@OriginalMember(owner = "client!wm", name = "u", descriptor = "Lclient!pc;")
	public static Class176 aClass176_3;

	@OriginalMember(owner = "client!wm", name = "y", descriptor = "Lclient!bg;")
	public static Class20 aClass20_3;

	@OriginalMember(owner = "client!wm", name = "n", descriptor = "[Lclient!aa;")
	public static final Class2_Sub1_Sub1[] aClass2_Sub1_Sub1Array4 = new Class2_Sub1_Sub1[14];

	@OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
	public static int anInt1406 = 0;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
	public static void method1336() {
		if (Static304.aClass82_4 == null) {
			return;
		}
		Static371.aClass56_7.method1255();
		Static115.method2164();
		Static383.method5696();
		Static172.method2808();
		Static37.method814();
		Static260.method4053();
		if (Static250.aClass248_1 != null) {
			Static250.aClass248_1.method5709();
		}
		Static353.method5356();
		Static382.method5683();
		Static191.method3068();
		Static140.method5082(false);
		Static216.method3640();
		for (@Pc(39) int local39 = 0; local39 < 2048; local39++) {
			@Pc(45) Class12_Sub1_Sub2_Sub2 local45 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local39];
			if (local45 != null) {
				local45.aClass2_Sub3_3 = null;
				for (@Pc(52) int local52 = 0; local52 < local45.aClass3Array3.length; local52++) {
					local45.aClass3Array3[local52] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static107.aClass12_Sub1_Sub2_Sub1Array1.length; local71++) {
			@Pc(77) Class12_Sub1_Sub2_Sub1 local77 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local71];
			if (local77 != null) {
				for (@Pc(81) int local81 = 0; local81 < local77.aClass3Array3.length; local81++) {
					local77.aClass3Array3[local81] = null;
				}
			}
		}
		Static304.aClass82_4.method4553();
		Static304.aClass82_4 = null;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lclient!vd;III)V")
	public static void method1337(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) long local7 = Static259.aLongArrayArrayArray1[arg1][arg2][arg3];
		@Pc(9) long local9 = 0L;
		arg0.anInt5141 = 0;
		@Pc(21) int local21;
		while (local9 <= 48L) {
			local21 = (int) (local7 >> (int) local9 & 0xFFFFL);
			if (local21 <= 0) {
				break;
			}
			arg0.aClass2_Sub14_Sub1Array4[arg0.anInt5141++] = Static305.aClass2_Sub14_Sub1Array2[local21 - 1];
			local9 += 16L;
		}
		for (local21 = arg0.anInt5141; local21 < 4; local21++) {
			arg0.aClass2_Sub14_Sub1Array4[local21] = null;
		}
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIII)V")
	public static void method1338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static302.anInt389 / (float) Static302.anInt393;
		@Pc(11) int local11 = arg2;
		@Pc(13) int local13 = arg0;
		if (local9 < 1.0F) {
			local13 = (int) ((float) arg2 * local9);
		} else {
			local11 = (int) ((float) arg0 / local9);
		}
		@Pc(44) int local44 = arg1 - (arg2 - local11) / 2;
		@Pc(53) int local53 = arg3 - (arg0 - local13) / 2;
		Static318.anInt4656 = Static302.anInt389 - local53 * Static302.anInt389 / local13;
		Static76.anInt1481 = -1;
		Static284.anInt5040 = local44 * Static302.anInt393 / local11;
		Static203.anInt3731 = -1;
		Static149.method2528();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIZIZ)V")
	public static void method1339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg0 == Static226.anInt4218 && Static306.anInt5451 == arg1 && (Static303.anInt5442 == Static331.anInt5804 || Static43.method900())) {
			return;
		}
		Static306.anInt5451 = arg1;
		Static226.anInt4218 = arg0;
		Static303.anInt5442 = Static331.anInt5804;
		if (Static43.method900()) {
			Static303.anInt5442 = 0;
		}
		if (arg2) {
			Static345.method5253(28);
		} else {
			Static345.method5253(25);
		}
		Static104.method1846(Static246.aClass13_4, Static303.aClass221_182.method5229(Static189.anInt5185), true);
		@Pc(74) int local74 = Static376.anInt6607;
		@Pc(76) int local76 = Static133.anInt2474;
		Static376.anInt6607 = (Static226.anInt4218 - (Static392.anInt6751 >> 4)) * 8;
		Static133.anInt2474 = (Static306.anInt5451 - (Static307.anInt5484 >> 4)) * 8;
		Static133.aClass2_Sub1_Sub17_3 = Static302.method469(Static226.anInt4218 * 8, Static306.anInt5451 * 8);
		Static156.aClass159_3 = null;
		@Pc(108) int local108 = Static376.anInt6607 - local74;
		@Pc(113) int local113 = Static133.anInt2474 - local76;
		@Pc(123) int local123;
		@Pc(131) int local131;
		if (arg2) {
			Static199.anInt3672 = 0;
			local123 = Static392.anInt6751 * 128 - 128;
			@Pc(129) int local129 = (Static307.anInt5484 - 1) * 128;
			for (local131 = 0; local131 < 32768; local131++) {
				@Pc(137) Class12_Sub1_Sub2_Sub1 local137 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local131];
				if (local137 != null) {
					local137.anInt6328 -= local108 * 128;
					local137.anInt6317 -= local113 * 128;
					if (local137.anInt6328 >= 0 && local123 >= local137.anInt6328 && local137.anInt6317 >= 0 && local137.anInt6317 <= local129) {
						@Pc(181) boolean local181 = true;
						for (@Pc(183) int local183 = 0; local183 < 10; local183++) {
							local137.anIntArray659[local183] -= local108;
							local137.anIntArray658[local183] -= local113;
							if (local137.anIntArray659[local183] < 0 || local137.anIntArray659[local183] >= Static392.anInt6751 || local137.anIntArray658[local183] < 0 || Static307.anInt5484 <= local137.anIntArray658[local183]) {
								local181 = false;
							}
						}
						if (local181) {
							Static346.anIntArray730[Static199.anInt3672++] = local131;
						} else {
							Static107.aClass12_Sub1_Sub2_Sub1Array1[local131].method3260(null);
							Static107.aClass12_Sub1_Sub2_Sub1Array1[local131] = null;
						}
					} else {
						Static107.aClass12_Sub1_Sub2_Sub1Array1[local131].method3260(null);
						Static107.aClass12_Sub1_Sub2_Sub1Array1[local131] = null;
					}
				}
			}
		} else {
			for (local123 = 0; local123 < 32768; local123++) {
				@Pc(279) Class12_Sub1_Sub2_Sub1 local279 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local123];
				if (local279 != null) {
					for (local131 = 0; local131 < 10; local131++) {
						local279.anIntArray659[local131] -= local108;
						local279.anIntArray658[local131] -= local113;
					}
					local279.anInt6317 -= local113 * 128;
					local279.anInt6328 -= local108 * 128;
				}
			}
		}
		for (local123 = 0; local123 < 2048; local123++) {
			@Pc(335) Class12_Sub1_Sub2_Sub2 local335 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local123];
			if (local335 != null) {
				for (local131 = 0; local131 < 10; local131++) {
					local335.anIntArray659[local131] -= local108;
					local335.anIntArray658[local131] -= local113;
				}
				local335.anInt6328 -= local108 * 128;
				local335.anInt6317 -= local113 * 128;
			}
		}
		Static55.method1068(local113, local108);
		for (@Pc(390) Class2_Sub22 local390 = (Class2_Sub22) Static230.aClass210_30.method5035(); local390 != null; local390 = (Class2_Sub22) Static230.aClass210_30.method5037()) {
			local390.anInt3087 -= local113;
			local390.anInt3082 -= local108;
			if (local390.anInt3082 < 0 || local390.anInt3087 < 0 || local390.anInt3082 >= Static392.anInt6751 || local390.anInt3087 >= Static307.anInt5484) {
				local390.method5745();
			}
		}
		Static98.anInt1946 = 0;
		if (Static292.anInt5161 != 0) {
			Static204.anInt3770 -= local113;
			Static292.anInt5161 -= local108;
		}
		if (arg2) {
			Static160.anInt2915 -= local108 * 128;
			Static22.anInt547 -= local113 * 128;
			Static276.anInt4908 -= local108;
			Static250.anInt4500 -= local113;
			Static239.anInt4366 -= local108;
			Static215.anInt3982 -= local113;
			if (Math.abs(local108) > Static392.anInt6751 || Math.abs(local113) > Static307.anInt5484) {
				Static150.method2531();
			}
		} else if (Static283.anInt5017 == 4) {
			Static243.anInt4394 -= local108 * 128;
			Static332.anInt5822 -= local108 * 128;
			Static301.anInt5428 -= local113 * 128;
			Static290.anInt5133 -= local113 * 128;
		} else {
			Static283.anInt5017 = 1;
		}
		Static106.method1854();
		Static383.method5696();
		Static237.aClass210_31.method5043();
		Static82.aClass210_14.method5043();
		Static55.aClass56_2.method1255();
		Static124.method5586();
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
	public static void method1340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub1_Sub2 local8 = Static323.method4982(0, 15);
		local8.method410();
		local8.anInt341 = arg0;
		local8.anInt348 = arg1;
	}
}
