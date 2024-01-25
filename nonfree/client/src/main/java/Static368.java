import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!dg;")
	public static final Class70 aClass70_64 = new Class70(46, 1);

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString61 = "";

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static void method4956() {
		for (@Pc(7) int local7 = 0; local7 < Static507.anInt8646; local7++) {
			@Pc(13) Class104 local13 = Static150.aClass104Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(144) int local144;
			if (local13.aClass1_Sub7_Sub4_1 == null) {
				local13.anInt2640--;
				if (local13.anInt2640 < (local13.method2091() ? -1500 : -10)) {
					local15 = true;
				} else {
					if (local13.aByte59 == 1 && local13.aClass90_1 == null) {
						local13.aClass90_1 = Static600.method1812(Static71.aClass270_14, local13.anInt2642, 0);
						if (local13.aClass90_1 == null) {
							continue;
						}
						local13.anInt2640 += local13.aClass90_1.method1813();
					} else if (local13.method2091() && (local13.aClass1_Sub50_1 == null || local13.aClass1_Sub17_Sub1_1 == null)) {
						if (local13.aClass1_Sub50_1 == null) {
							local13.aClass1_Sub50_1 = Static582.method7788(Static360.aClass270_68, local13.anInt2642);
						}
						if (local13.aClass1_Sub50_1 == null) {
							continue;
						}
						if (local13.aClass1_Sub17_Sub1_1 == null) {
							local13.aClass1_Sub17_Sub1_1 = local13.aClass1_Sub50_1.method7787(new int[] { 22050 });
							if (local13.aClass1_Sub17_Sub1_1 == null) {
								continue;
							}
						}
					}
					if (local13.anInt2640 < 0) {
						if (local13.anInt2638 == 0) {
							local144 = (local13.aByte59 == 3 ? Static348.aClass1_Sub30_Sub1_1.anInt4861 : Static348.aClass1_Sub30_Sub1_1.anInt4863) * local13.anInt2644 >> 8;
						} else {
							@Pc(153) int local153 = local13.anInt2638 >> 24 & 0x3;
							if (local153 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123) {
								@Pc(172) int local172 = (local13.anInt2638 & 0xFF) << 9;
								@Pc(179) int local179 = local13.anInt2638 >> 16 & 0xFF;
								@Pc(189) int local189 = (local179 << 9) - (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 - 256);
								if (local189 < 0) {
									local189 = -local189;
								}
								@Pc(204) int local204 = local13.anInt2638 >> 8 & 0xFF;
								@Pc(214) int local214 = (local204 << 9) + 256 - Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370;
								if (local214 < 0) {
									local214 = -local214;
								}
								@Pc(229) int local229 = local189 + local214 - 512;
								if (local229 > local172) {
									local13.anInt2640 = -99999;
									continue;
								}
								if (local229 < 0) {
									local229 = 0;
								}
								local144 = local13.anInt2644 * Static348.aClass1_Sub30_Sub1_1.anInt4858 * (local172 - local229) / local172 >> 8;
							} else {
								local144 = 0;
							}
						}
						if (local144 > 0) {
							@Pc(270) Class1_Sub17_Sub1 local270 = null;
							if (local13.aByte59 == 1) {
								local270 = local13.aClass90_1.method1814().method4526(Static205.aClass80_5);
							} else if (local13.method2091()) {
								local270 = local13.aClass1_Sub17_Sub1_1;
							}
							@Pc(298) Class1_Sub7_Sub4 local298 = local13.aClass1_Sub7_Sub4_1 = Static606.method6168(local270, local144);
							local298.method6178(local13.anInt2636 - 1);
							Static309.aClass1_Sub7_Sub1_2.method470(local298);
						}
					}
				}
			} else if (!local13.aClass1_Sub7_Sub4_1.method7856()) {
				local15 = true;
			}
			if (local15) {
				Static507.anInt8646--;
				for (local144 = local7; local144 < Static507.anInt8646; local144++) {
					Static150.aClass104Array1[local144] = Static150.aClass104Array1[local144 + 1];
				}
				local7--;
			}
		}
		if (Static340.aBoolean451 && !Static550.method7492()) {
			if (Static348.aClass1_Sub30_Sub1_1.anInt4865 != 0 && Static300.anInt5153 != -1) {
				Static381.method5109(Static348.aClass1_Sub30_Sub1_1.anInt4865, Static358.aClass270_69, Static300.anInt5153);
			}
			Static340.aBoolean451 = false;
		} else if (Static348.aClass1_Sub30_Sub1_1.anInt4865 != 0 && Static300.anInt5153 != -1 && !Static550.method7492()) {
			@Pc(386) Class1_Sub11 local386 = Static276.method3885(Static137.aClass70_25, Static481.aClass276_2);
			local386.aClass1_Sub35_Sub2_1.method5792(Static300.anInt5153);
			Static48.method743(local386);
			Static300.anInt5153 = -1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method4957(@OriginalArg(1) String arg0) {
		return Static228.method3475(arg0);
	}
}
