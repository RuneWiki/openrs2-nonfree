import java.io.IOException;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "Lclient!oa;")
	public static Class56 aClass56_3;

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "Z")
	public static boolean aBoolean313;

	@OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
	public static int anInt3787 = 0;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method3018() {
		for (@Pc(6) Class2_Sub24 local6 = (Class2_Sub24) Static382.aClass265_46.method6005(); local6 != null; local6 = (Class2_Sub24) Static382.aClass265_46.method6001()) {
			if (Static176.aClass113ArrayArrayArray3 == null) {
				local6.method6072();
			} else {
				@Pc(28) int local28;
				@Pc(250) Class4_Sub1 local250;
				@Pc(286) Class4_Sub1_Sub1 local286;
				@Pc(107) Class4_Sub2 local107;
				@Pc(213) Class4_Sub3 local213;
				@Pc(38) Class4_Sub4 local38;
				@Pc(232) Class4_Sub3_Sub2 local232;
				@Pc(74) Class4_Sub4_Sub1 local74;
				if (local6.anInt3898 <= Static164.anInt3206) {
					local28 = Static104.anIntArray128[local6.anInt3883];
					if (local28 == 0) {
						local38 = Static334.method4742(local6.anInt3889, local6.anInt3888, local6.anInt3885);
						if (local38 instanceof Class4_Sub4_Sub1) {
							Static41.method779(local6.anInt3889, local6.anInt3888, local6.anInt3885);
							local74 = (Class4_Sub4_Sub1) local38;
							if (local74.aClass4_Sub4_3 != null) {
								Static400.method5461(local6.anInt3889, local6.anInt3888, local6.anInt3885, local74.aClass4_Sub4_3, null);
							}
						}
					} else if (local28 == 1) {
						local250 = Static242.method3661(local6.anInt3889, local6.anInt3888, local6.anInt3885);
						if (local250 instanceof Class4_Sub1_Sub1) {
							Static121.method1758(local6.anInt3889, local6.anInt3888, local6.anInt3885);
							local286 = (Class4_Sub1_Sub1) local250;
							if (local286.aClass4_Sub1_1 != null) {
								Static151.method2322(local6.anInt3889, local6.anInt3888, local6.anInt3885, local286.aClass4_Sub1_1, null);
							}
						}
					} else if (local28 == 2) {
						local107 = Static80.method1405(local6.anInt3889, local6.anInt3888, local6.anInt3885, np.class);
						if (local107 instanceof Class4_Sub2_Sub4) {
							Static409.method5548(local6.anInt3889, local6.anInt3888, local6.anInt3885, np.class);
							@Pc(388) Class4_Sub2_Sub4 local388 = (Class4_Sub2_Sub4) local107;
							if (local388.aClass4_Sub2_2 != null) {
								Static317.method4544(local388.aClass4_Sub2_2, false);
							}
						}
					} else if (local28 == 3) {
						local213 = Static325.method4667(local6.anInt3889, local6.anInt3888, local6.anInt3885);
						if (local213 instanceof Class4_Sub3_Sub2) {
							Static16.method241(local6.anInt3889, local6.anInt3888, local6.anInt3885);
							local232 = (Class4_Sub3_Sub2) local213;
							if (local232.aClass4_Sub3_2 != null) {
								Static49.method986(local6.anInt3889, local6.anInt3888, local6.anInt3885, local232.aClass4_Sub3_2);
							}
						}
					}
					local6.method6072();
				} else if (local6.anInt3890 == Static164.anInt3206) {
					local28 = Static104.anIntArray128[local6.anInt3883];
					if (local28 == 0) {
						local38 = Static334.method4742(local6.anInt3889, local6.anInt3888, local6.anInt3885);
						if (local38 instanceof Class4_Sub4_Sub1) {
							local6.method6072();
						} else if (Static2.method51(local6.anInt3889, local6.anInt3888, local6.anInt3885) == null) {
							local74 = new Class4_Sub4_Sub1(local6.anInt3883, local6.anInt3887, local6.anInt3886, local6.anInt3892, local6.anInt3891, local38);
							Static400.method5461(local6.anInt3889, local6.anInt3888, local6.anInt3885, local74, null);
						} else {
							local6.method6072();
						}
					} else if (local28 == 1) {
						local250 = Static242.method3661(local6.anInt3889, local6.anInt3888, local6.anInt3885);
						if (local250 instanceof Class4_Sub1_Sub1) {
							local6.method6072();
						} else if (Static84.method1476(local6.anInt3889, local6.anInt3888, local6.anInt3885) == null) {
							local286 = new Class4_Sub1_Sub1(local6.anInt3883, local6.anInt3887, local6.anInt3886, local6.anInt3892, local6.anInt3891, local250);
							Static151.method2322(local6.anInt3889, local6.anInt3888, local6.anInt3885, local286, null);
						} else {
							local6.method6072();
						}
					} else if (local28 == 2) {
						local107 = Static80.method1405(local6.anInt3889, local6.anInt3888, local6.anInt3885, np.class);
						if (local107 instanceof Class4_Sub2_Sub4) {
							local6.method6072();
						} else {
							Static409.method5548(local6.anInt3889, local6.anInt3888, local6.anInt3885, np.class);
							@Pc(138) Class250 local138 = Static406.aClass150_3.method3508(local6.anInt3896);
							@Pc(151) int local151;
							@Pc(154) int local154;
							if (local6.anInt3887 == 1 || local6.anInt3887 == 3) {
								local151 = local138.anInt7150;
								local154 = local138.anInt7185;
							} else {
								local151 = local138.anInt7185;
								local154 = local138.anInt7150;
							}
							@Pc(196) Class4_Sub2_Sub4 local196 = new Class4_Sub2_Sub4(local6.anInt3883, local6.anInt3887, local6.anInt3889, local6.anInt3886, local6.anInt3892, local6.anInt3891, local6.anInt3888, local6.anInt3888 + local151 - 1, local6.anInt3885, local154 + local6.anInt3885 - 1, local107);
							Static317.method4544(local196, false);
						}
					} else if (local28 == 3) {
						local213 = Static325.method4667(local6.anInt3889, local6.anInt3888, local6.anInt3885);
						if (local213 instanceof Class4_Sub3_Sub2) {
							local6.method6072();
						} else {
							local232 = new Class4_Sub3_Sub2(local6.anInt3886, local6.anInt3892, local6.anInt3891, local213);
							Static49.method986(local6.anInt3889, local6.anInt3888, local6.anInt3885, local232);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Z")
	public static boolean method3019() {
		try {
			return Static331.method4712();
		} catch (@Pc(14) IOException local14) {
			Static83.method1461();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(77) String local77 = "T2 - " + (Static141.aClass81_59 == null ? -1 : Static141.aClass81_59.method1697()) + "," + (Static356.aClass81_160 == null ? -1 : Static356.aClass81_160.method1697()) + "," + (Static106.aClass81_49 == null ? -1 : Static106.aClass81_49.method1697()) + " - " + anInt3787 + "," + (Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray436[0] + Static173.anInt3340) + "," + (Static379.anInt6721 + Static231.aClass4_Sub2_Sub2_Sub1_2.anIntArray437[0]) + " - ";
			for (@Pc(79) int local79 = 0; anInt3787 > local79 && local79 < 50; local79++) {
				local77 = local77 + Static426.aClass2_Sub20_Sub1_2.aByteArray136[local79] + ",";
			}
			Static80.method1410(local19, local77);
			Static89.method1492();
			return true;
		}
	}
}
