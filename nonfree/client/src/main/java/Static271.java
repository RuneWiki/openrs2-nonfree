import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static271 {

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	public static int anInt4923;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	public static int anInt4925;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_15 = new Class37(7, 0, 1, 1);

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
	public static int anInt4921 = 0;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "Lclient!ru;")
	public static final Class220 aClass220_24 = new Class220(16);

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_113 = new Class25(79, 10);

	@OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
	public static final int anInt4926 = 2;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(Z)V")
	public static void method3893() {
		Static284.aClass52_1 = new Class52(8);
		Static459.anInt7729 = 0;
		for (@Pc(17) Class28_Sub1 local17 = (Class28_Sub1) Static315.aClass97_4.method2145(); local17 != null; local17 = (Class28_Sub1) Static315.aClass97_4.method2148()) {
			local17.method540();
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(III)Z")
	public static boolean method3894(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public static void method3896() {
		for (@Pc(11) int local11 = 0; local11 < Static126.anInt2092; local11++) {
			@Pc(17) Class253 local17 = Static409.aClass253Array2[local11];
			@Pc(19) boolean local19 = false;
			@Pc(224) int local224;
			if (local17.aClass2_Sub8_Sub4_4 == null) {
				local17.anInt7201--;
				if (local17.anInt7201 < (local17.aByte90 == 2 ? -1500 : -10)) {
					local19 = true;
				} else {
					if (local17.aByte90 == 1 && local17.aClass149_1 == null) {
						local17.aClass149_1 = Static469.method3064(Static199.aClass171_46, local17.anInt7197, 0);
						if (local17.aClass149_1 == null) {
							continue;
						}
						local17.anInt7201 += local17.aClass149_1.method3062();
					} else if (local17.aByte90 == 2 && (local17.aClass2_Sub41_1 == null || local17.aClass2_Sub14_Sub1_2 == null)) {
						if (local17.aClass2_Sub41_1 == null) {
							local17.aClass2_Sub41_1 = Static403.method5635(Static284.aClass171_67, local17.anInt7197);
						}
						if (local17.aClass2_Sub41_1 == null) {
							continue;
						}
						if (local17.aClass2_Sub14_Sub1_2 == null) {
							local17.aClass2_Sub14_Sub1_2 = local17.aClass2_Sub41_1.method5631(new int[] { 22050 });
							if (local17.aClass2_Sub14_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local17.anInt7201 < 0) {
						if (local17.anInt7198 == 0) {
							local224 = local17.anInt7200 * Static434.aClass165_Sub1_1.anInt4205 >> 8;
						} else {
							@Pc(135) int local135 = local17.anInt7198 >> 24 & 0x3;
							if (Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101 == local135) {
								@Pc(146) int local146 = (local17.anInt7198 & 0xFF) << 7;
								@Pc(153) int local153 = local17.anInt7198 >> 16 & 0xFF;
								@Pc(162) int local162 = (local153 << 7) + 64 - Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626;
								if (local162 < 0) {
									local162 = -local162;
								}
								@Pc(177) int local177 = local17.anInt7198 >> 8 & 0xFF;
								@Pc(187) int local187 = (local177 << 7) - (Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 - 64);
								if (local187 < 0) {
									local187 = -local187;
								}
								@Pc(198) int local198 = local162 + local187 - 128;
								if (local146 < local198) {
									local17.anInt7201 = -99999;
									continue;
								}
								if (local198 < 0) {
									local198 = 0;
								}
								local224 = local17.anInt7200 * (local146 - local198) * Static434.aClass165_Sub1_1.anInt4202 / local146 >> 8;
							} else {
								local224 = 0;
							}
						}
						if (local224 > 0) {
							@Pc(242) Class2_Sub14_Sub1 local242 = null;
							if (local17.aByte90 == 1) {
								local242 = local17.aClass149_1.method3063().method3133(Static378.aClass148_5);
							} else if (local17.aByte90 == 2) {
								local242 = local17.aClass2_Sub14_Sub1_2;
							}
							@Pc(270) Class2_Sub8_Sub4 local270 = local17.aClass2_Sub8_Sub4_4 = Static473.method5301(local242, local224);
							local270.method5298(local17.anInt7199 - 1);
							Static414.aClass2_Sub8_Sub1_2.method1039(local270);
						}
					}
				}
			} else if (!local17.aClass2_Sub8_Sub4_4.method6258()) {
				local19 = true;
			}
			if (local19) {
				Static126.anInt2092--;
				for (local224 = local11; local224 < Static126.anInt2092; local224++) {
					Static409.aClass253Array2[local224] = Static409.aClass253Array2[local224 + 1];
				}
				local11--;
			}
		}
		if (Static235.aBoolean262 && !Static67.method1062()) {
			if (Static434.aClass165_Sub1_1.anInt4208 != 0 && Static323.anInt5772 != -1) {
				Static124.method1968(Static323.anInt5772, Static431.aClass171_95, Static434.aClass165_Sub1_1.anInt4208);
			}
			Static235.aBoolean262 = false;
		} else if (Static434.aClass165_Sub1_1.anInt4208 != 0 && Static323.anInt5772 != -1 && !Static67.method1062()) {
			Static164.method2403(Static84.aClass208_109);
			Static389.aClass2_Sub17_Sub1_2.method6170(Static323.anInt5772);
			Static323.anInt5772 = -1;
		}
	}
}
