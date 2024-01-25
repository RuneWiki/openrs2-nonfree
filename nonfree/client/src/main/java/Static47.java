import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bt", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "client!bt", name = "p", descriptor = "I")
	public static int anInt1133;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_1 = new Class42(1);

	@OriginalMember(owner = "client!bt", name = "d", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_2 = new Class42(2);

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_3 = new Class42(4);

	@OriginalMember(owner = "client!bt", name = "g", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_4 = new Class42(1);

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_5 = new Class42(2);

	@OriginalMember(owner = "client!bt", name = "i", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_6 = new Class42(4);

	@OriginalMember(owner = "client!bt", name = "j", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_7 = new Class42(2);

	@OriginalMember(owner = "client!bt", name = "k", descriptor = "Lclient!bt;")
	public static final Class42 aClass42_8 = new Class42(4);

	@OriginalMember(owner = "client!bt", name = "l", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_15 = new Class286(33, 3);

	@OriginalMember(owner = "client!bt", name = "n", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[520];

	@OriginalMember(owner = "client!bt", name = "o", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_16 = new Class286(3, -1);

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(B)V")
	public static void method795() {
		for (@Pc(15) int local15 = 0; local15 < Static245.anInt4559; local15++) {
			@Pc(21) Class351 local21 = Static515.aClass351Array1[local15];
			@Pc(23) boolean local23 = false;
			@Pc(149) int local149;
			if (local21.aClass2_Sub10_Sub4_4 == null) {
				local21.anInt9300--;
				if (local21.anInt9300 >= (local21.method7717() ? -1500 : -10)) {
					if (local21.aByte122 == 1 && local21.aClass331_1 == null) {
						local21.aClass331_1 = Static604.method7303(Static261.aClass259_146, local21.anInt9301, 0);
						if (local21.aClass331_1 == null) {
							continue;
						}
						local21.anInt9300 += local21.aClass331_1.method7304();
					} else if (local21.method7717() && (local21.aClass2_Sub20_3 == null || local21.aClass2_Sub7_Sub1_4 == null)) {
						if (local21.aClass2_Sub20_3 == null) {
							local21.aClass2_Sub20_3 = Static178.method3063(Static493.aClass259_155, local21.anInt9301);
						}
						if (local21.aClass2_Sub20_3 == null) {
							continue;
						}
						if (local21.aClass2_Sub7_Sub1_4 == null) {
							local21.aClass2_Sub7_Sub1_4 = local21.aClass2_Sub20_3.method3065(new int[] { 22050 });
							if (local21.aClass2_Sub7_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local21.anInt9300 < 0) {
						if (local21.anInt9297 == 0) {
							local149 = local21.anInt9303 * (local21.aByte122 == 3 ? Static72.aClass2_Sub12_Sub1_1.anInt1920 : Static72.aClass2_Sub12_Sub1_1.anInt1916) >> 8;
						} else {
							@Pc(158) int local158 = local21.anInt9297 >> 24 & 0x3;
							if (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 == local158) {
								@Pc(177) int local177 = (local21.anInt9297 & 0xFF) << 9;
								@Pc(184) int local184 = local21.anInt9297 >> 16 & 0xFF;
								@Pc(194) int local194 = (local184 << 9) + 256 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8761;
								if (local194 < 0) {
									local194 = -local194;
								}
								@Pc(206) int local206 = local21.anInt9297 >> 8 & 0xFF;
								@Pc(216) int local216 = (local206 << 9) + 256 - Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anInt8764;
								if (local216 < 0) {
									local216 = -local216;
								}
								@Pc(230) int local230 = local216 + local194 - 512;
								if (local230 > local177) {
									local21.anInt9300 = -99999;
									continue;
								}
								if (local230 < 0) {
									local230 = 0;
								}
								local149 = local21.anInt9303 * (local177 - local230) * Static72.aClass2_Sub12_Sub1_1.anInt1926 / local177 >> 8;
							} else {
								local149 = 0;
							}
						}
						if (local149 > 0) {
							@Pc(268) Class2_Sub7_Sub1 local268 = null;
							if (local21.aByte122 == 1) {
								local268 = local21.aClass331_1.method7305().method5536(Static275.aClass335_1);
							} else if (local21.method7717()) {
								local268 = local21.aClass2_Sub7_Sub1_4;
							}
							@Pc(294) Class2_Sub10_Sub4 local294 = local21.aClass2_Sub10_Sub4_4 = Static600.method3373(local268, local149);
							local294.method3403(local21.anInt9298 - 1);
							Static122.aClass2_Sub10_Sub1_2.method1013(local294);
						}
					}
				} else {
					local23 = true;
				}
			} else if (!local21.aClass2_Sub10_Sub4_4.method7968()) {
				local23 = true;
			}
			if (local23) {
				Static245.anInt4559--;
				for (local149 = local15; local149 < Static245.anInt4559; local149++) {
					Static515.aClass351Array1[local149] = Static515.aClass351Array1[local149 + 1];
				}
				local15--;
			}
		}
		if (Static242.aBoolean363 && !Static231.method3612()) {
			if (Static72.aClass2_Sub12_Sub1_1.anInt1918 != 0 && Static593.anInt9611 != -1) {
				Static24.method443(Static72.aClass2_Sub12_Sub1_1.anInt1918, Static343.aClass259_88, Static593.anInt9611);
			}
			Static242.aBoolean363 = false;
		} else if (Static72.aClass2_Sub12_Sub1_1.anInt1918 != 0 && Static593.anInt9611 != -1 && !Static231.method3612()) {
			@Pc(377) Class2_Sub42 local377 = Static249.method3910(Static127.aClass286_42, Static400.aClass145_2);
			local377.aClass2_Sub15_Sub2_2.method4288(Static593.anInt9611);
			Static531.method7296(local377);
			Static593.anInt9611 = -1;
		}
	}
}
