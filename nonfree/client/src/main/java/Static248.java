import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "F")
	public static float aFloat48;

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "[Lclient!tl;")
	public static Class4_Sub2[] aClass4_Sub2Array4;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
	public static final int[] anIntArray294 = new int[8];

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!jm;Z[[B)V")
	public static void method3459(@OriginalArg(0) Class199_Sub1 arg0, @OriginalArg(2) byte[][] arg1) {
		for (@Pc(14) int local14 = 0; local14 < arg0.anInt4694; local14++) {
			Static165.method2505();
			for (@Pc(22) int local22 = 0; local22 < Static426.anInt6942 >> 3; local22++) {
				for (@Pc(26) int local26 = 0; local26 < Static280.anInt6752 >> 3; local26++) {
					@Pc(36) int local36 = Static675.anIntArrayArrayArray26[local14][local22][local26];
					if (local36 != -1) {
						@Pc(45) int local45 = local36 >> 24 & 0x3;
						if (!arg0.aBoolean406 || local45 == 0) {
							@Pc(58) int local58 = local36 >> 1 & 0x3;
							@Pc(64) int local64 = local36 >> 14 & 0x3FF;
							@Pc(70) int local70 = local36 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static148.anIntArray187.length; local82++) {
								if (local80 == Static148.anIntArray187[local82] && arg1[local82] != null) {
									arg0.method4280(local58, local45, local22 * 8, local26 * 8, (local70 & 0x7) * 8, (local64 & 0x7) * 8, local14, Static626.aClass226Array1, Static396.aClass145_6, arg1[local82]);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public static void method3462() {
		Static433.aClass231_36.method5328();
		Static101.aClass100_12.method2139();
		Static91.aClass7_1.method202();
		Static148.aClass153_3.method3340();
		Static192.aClass41_1.method752();
		Static543.aClass37_2.method596();
		Static89.aClass274_1.method6620();
		Static119.aClass209_1.method4567();
		Static153.aClass79_3.method1608();
		Static13.aClass119_1.method2610();
		Static80.aClass90_1.method1862();
		Static202.aClass31_1.method561();
		Static378.aClass314_2.method7457();
		Static591.aClass351_6.method8333();
		Static117.aClass196_2.method4187();
		Static412.aClass344_1.method8183();
		Static97.aClass328_2.method7805();
		Static120.aClass232_1.method5478();
		Static271.aClass25_1.method432();
		Static298.aClass266_1.method6367();
		Static506.aClass327_2.method7803();
		Static481.aClass280_1.method6724();
		Static159.aClass346_1.method8209();
		Static647.method8755();
		Static327.method8984();
		Static706.method9434();
		Static609.method8328();
		if (Static229.aClass386_6 != Static661.aClass386_10) {
			for (@Pc(101) int local101 = 0; local101 < Static648.aByteArrayArray25.length; local101++) {
				Static648.aByteArrayArray25[local101] = null;
			}
			Static276.anInt8866 = 0;
		}
		Static250.method3481();
		Static538.method7528();
		Static460.method8926();
		Static76.method1179();
		Static171.method2548();
		Static484.aClass85_51.method1748();
		Static396.aClass145_6.method9712();
		Static29.method431();
		Static262.method3709();
		Static703.aClass254_168.method6096();
		Static102.aClass254_44.method6096();
		Static1.aClass254_144.method6096();
		Static282.aClass254_91.method6096();
		Static157.aClass254_60.method6096();
		Static311.aClass254_96.method6096();
		Static177.aClass254_66.method6096();
		Static700.aClass254_167.method6096();
		Static117.aClass254_47.method6096();
		Static380.aClass254_109.method6096();
		Static455.aClass254_122.method6096();
		Static727.aClass254_174.method6096();
		Static680.aClass254_169.method6096();
		Static335.aClass254_99.method6096();
		Static514.aClass254_129.method6096();
		Static614.aClass254_153.method6096();
		Static529.aClass254_132.method6096();
		Static566.aClass254_142.method6096();
		Static307.aClass254_95.method6096();
		Static625.aClass254_156.method6096();
		Static565.aClass254_141.method6096();
		Static191.aClass254_69.method6096();
		Static18.aClass254_14.method6096();
		Static394.aClass254_113.method6096();
		Static263.aClass254_87.method6096();
		Static327.aClass254_161.method6096();
		Static55.aClass254_32.method6096();
		Static35.aClass254_20.method6096();
		Static50.aClass254_29.method6096();
		Static560.aClass254_138.method6096();
		Static228.aClass254_120.method6096();
		Static96.aClass254_42.method6096();
		Static554.aClass254_136.method6096();
		Static161.aClass254_61.method6096();
		Static126.aClass85_16.method1748();
		Static444.aClass85_47.method1748();
		Static408.aClass85_44.method1748();
		Static288.aClass85_33.method1748();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(III)Z")
	public static boolean method3464(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static406.method6007(arg0, arg1) | (arg1 & 0x70000) != 0 || Static409.method6022(arg1, arg0);
	}
}
