import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!np", name = "r", descriptor = "I")
	public static int anInt6176;

	@OriginalMember(owner = "client!np", name = "w", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray18;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "[I")
	public static final int[] anIntArray610 = new int[4];

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)V")
	public static void method5605() {
		Static144.anInt2851 = 0;
		Static253.anInt4946 = 0;
		Static342.anInt6315 = 0;
		Static23.anInt670 = 0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(II)Z")
	public static boolean method5606(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)V")
	public static void method5607() {
		for (@Pc(3) int local3 = 0; local3 < Static482.anInt8558; local3++) {
			@Pc(9) Class182 local9 = Static314.aClass182Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(127) int local127;
			if (local9.aClass1_Sub4_Sub1_1 == null) {
				local9.anInt5555--;
				if (local9.anInt5555 < (local9.aByte70 == 2 ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte70 == 1 && local9.aClass233_1 == null) {
						local9.aClass233_1 = Static552.method6179(Static339.aClass69_66, local9.anInt5560, 0);
						if (local9.aClass233_1 == null) {
							continue;
						}
						local9.anInt5555 += local9.aClass233_1.method6180();
					} else if (local9.aByte70 == 2 && (local9.aClass1_Sub21_1 == null || local9.aClass1_Sub30_Sub1_1 == null)) {
						if (local9.aClass1_Sub21_1 == null) {
							local9.aClass1_Sub21_1 = Static195.method3723(Static479.aClass69_93, local9.anInt5560);
						}
						if (local9.aClass1_Sub21_1 == null) {
							continue;
						}
						if (local9.aClass1_Sub30_Sub1_1 == null) {
							local9.aClass1_Sub30_Sub1_1 = local9.aClass1_Sub21_1.method3725(new int[] { 22050 });
							if (local9.aClass1_Sub30_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local9.anInt5555 < 0) {
						if (local9.anInt5554 == 0) {
							local127 = local9.anInt5557 * Static286.aClass1_Sub15_Sub1_1.anInt7030 >> 8;
						} else {
							@Pc(121) int local121 = local9.anInt5554 >> 24 & 0x3;
							if (Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108 == local121) {
								@Pc(136) int local136 = (local9.anInt5554 & 0xFF) << 7;
								@Pc(143) int local143 = local9.anInt5554 >> 16 & 0xFF;
								@Pc(152) int local152 = (local143 << 7) + 64 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954;
								if (local152 < 0) {
									local152 = -local152;
								}
								@Pc(167) int local167 = local9.anInt5554 >> 8 & 0xFF;
								@Pc(176) int local176 = (local167 << 7) + 64 - Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949;
								if (local176 < 0) {
									local176 = -local176;
								}
								@Pc(191) int local191 = local152 + local176 - 128;
								if (local136 < local191) {
									local9.anInt5555 = -99999;
									continue;
								}
								if (local191 < 0) {
									local191 = 0;
								}
								local127 = Static286.aClass1_Sub15_Sub1_1.anInt7037 * (local136 - local191) * local9.anInt5557 / local136 >> 8;
							} else {
								local127 = 0;
							}
						}
						if (local127 > 0) {
							@Pc(234) Class1_Sub30_Sub1 local234 = null;
							if (local9.aByte70 == 1) {
								local234 = local9.aClass233_1.method6178().method5375(Static407.aClass254_1);
							} else if (local9.aByte70 == 2) {
								local234 = local9.aClass1_Sub30_Sub1_1;
							}
							@Pc(262) Class1_Sub4_Sub1 local262 = local9.aClass1_Sub4_Sub1_1 = Static546.method1207(local234, local127);
							local262.method1201(local9.anInt5558 - 1);
							Static475.aClass1_Sub4_Sub2_2.method3189(local262);
						}
					}
				}
			} else if (!local9.aClass1_Sub4_Sub1_1.method8241()) {
				local11 = true;
			}
			if (local11) {
				Static482.anInt8558--;
				for (local127 = local3; local127 < Static482.anInt8558; local127++) {
					Static314.aClass182Array1[local127] = Static314.aClass182Array1[local127 + 1];
				}
				local3--;
			}
		}
		if (Static410.aBoolean568 && !Static344.method5746()) {
			if (Static286.aClass1_Sub15_Sub1_1.anInt7042 != 0 && Static261.anInt5068 != -1) {
				Static127.method2441(Static286.aClass1_Sub15_Sub1_1.anInt7042, Static261.anInt5068, Static521.aClass69_96);
			}
			Static410.aBoolean568 = false;
		} else if (Static286.aClass1_Sub15_Sub1_1.anInt7042 != 0 && Static261.anInt5068 != -1 && !Static344.method5746()) {
			Static216.method3997(Static399.aClass252_102);
			Static259.aClass1_Sub17_Sub2_1.method4489(Static261.anInt5068);
			Static261.anInt5068 = -1;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZI)I")
	public static int method5608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static224.anInt4343 < 100) {
			return -2;
		}
		@Pc(17) int local17 = -2;
		@Pc(19) int local19 = Integer.MAX_VALUE;
		@Pc(24) int local24 = arg2 - Static335.anInt4941;
		@Pc(29) int local29 = arg0 - Static335.anInt4935;
		for (@Pc(34) Class1_Sub51 local34 = (Class1_Sub51) Static335.aClass295_19.method7543(); local34 != null; local34 = (Class1_Sub51) Static335.aClass295_19.method7540()) {
			if (local34.anInt9566 == arg1) {
				@Pc(43) int local43 = local34.anInt9571;
				@Pc(46) int local46 = local34.anInt9569;
				@Pc(57) int local57 = local46 + Static335.anInt4935 | local43 + Static335.anInt4941 << 14;
				@Pc(76) int local76 = (local29 - local46) * (local29 - local46) + (local24 - local43) * (-local43 + local24);
				if (local17 < 0 || local19 > local76) {
					local17 = local57;
					local19 = local76;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)Lclient!f;")
	public static Class93 method5610() {
		try {
			return new Class93_Sub3();
		} catch (@Pc(8) Throwable local8) {
			try {
				return (Class93) Class.forName("Class93_Sub2").getDeclaredConstructor().newInstance();
			} catch (@Pc(19) Throwable local19) {
				return new Class93_Sub1();
			}
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!et;III)V")
	public static void method5611(@OriginalArg(0) Class91 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static52.anInt4671 = arg2;
		Static193.anInt3949 = arg1;
		Static134.aClass91_5 = arg0;
	}
}
