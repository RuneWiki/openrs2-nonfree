import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "Lclient!l;")
	public static Class11 aClass11_20;

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "Lclient!dk;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "[I")
	public static final int[] anIntArray621 = new int[25];

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	public static int anInt7362 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)I")
	public static int method5664(@OriginalArg(1) int arg0) {
		return arg0 >> 11 & 0x7F;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)Z")
	public static boolean method5667(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if ((Static347.aByteArrayArrayArray16[0][arg3][arg1] & 0x2) != 0) {
			return true;
		} else if ((Static347.aByteArrayArrayArray16[arg0][arg3][arg1] & 0x10) == 0) {
			return arg2 == Static181.method2634(arg3, arg1, arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(B)V")
	public static void method5668() {
		for (@Pc(3) int local3 = 0; local3 < Static225.anInt4941; local3++) {
			@Pc(9) Class252 local9 = Static205.aClass252Array1[local3];
			@Pc(11) boolean local11 = false;
			@Pc(144) int local144;
			if (local9.aClass7_Sub8_Sub4_4 == null) {
				local9.anInt6620--;
				if (local9.anInt6620 < (local9.aByte90 == 2 ? -1500 : -10)) {
					local11 = true;
				} else {
					if (local9.aByte90 == 1 && local9.aClass23_1 == null) {
						local9.aClass23_1 = Static461.method295(Static32.aClass178_12, local9.anInt6616, 0);
						if (local9.aClass23_1 == null) {
							continue;
						}
						local9.anInt6620 += local9.aClass23_1.method294();
					} else if (local9.aByte90 == 2 && (local9.aClass7_Sub35_1 == null || local9.aClass7_Sub31_Sub1_2 == null)) {
						if (local9.aClass7_Sub35_1 == null) {
							local9.aClass7_Sub35_1 = Static306.method4050(Static282.aClass178_86, local9.anInt6616);
						}
						if (local9.aClass7_Sub35_1 == null) {
							continue;
						}
						if (local9.aClass7_Sub31_Sub1_2 == null) {
							local9.aClass7_Sub31_Sub1_2 = local9.aClass7_Sub35_1.method4059(new int[] { 22050 });
							if (local9.aClass7_Sub31_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local9.anInt6620 < 0) {
						if (local9.anInt6619 == 0) {
							local144 = Static130.aClass153_Sub1_1.anInt5237 * local9.anInt6621 >> 8;
						} else {
							@Pc(138) int local138 = local9.anInt6619 >> 24 & 0x3;
							if (local138 == Static104.aClass26_Sub2_Sub4_Sub2_2.aByte102) {
								@Pc(153) int local153 = (local9.anInt6619 & 0xFF) << 7;
								@Pc(160) int local160 = local9.anInt6619 >> 16 & 0xFF;
								@Pc(169) int local169 = (local160 << 7) + 64 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7388;
								if (local169 < 0) {
									local169 = -local169;
								}
								@Pc(184) int local184 = local9.anInt6619 >> 8 & 0xFF;
								@Pc(194) int local194 = (local184 << 7) + 64 - Static104.aClass26_Sub2_Sub4_Sub2_2.anInt7383;
								if (local194 < 0) {
									local194 = -local194;
								}
								@Pc(208) int local208 = local169 + local194 - 128;
								if (local208 > local153) {
									local9.anInt6620 = -99999;
									continue;
								}
								if (local208 < 0) {
									local208 = 0;
								}
								local144 = local9.anInt6621 * (local153 - local208) * Static130.aClass153_Sub1_1.anInt5246 / local153 >> 8;
							} else {
								local144 = 0;
							}
						}
						if (local144 > 0) {
							@Pc(259) Class7_Sub31_Sub1 local259 = null;
							if (local9.aByte90 == 1) {
								local259 = local9.aClass23_1.method297().method3286(Static97.aClass257_1);
							} else if (local9.aByte90 == 2) {
								local259 = local9.aClass7_Sub31_Sub1_2;
							}
							@Pc(287) Class7_Sub8_Sub4 local287 = local9.aClass7_Sub8_Sub4_4 = Static467.method4875(local259, local144);
							local287.method4883(local9.anInt6618 - 1);
							Static452.aClass7_Sub8_Sub1_2.method2432(local287);
						}
					}
				}
			} else if (!local9.aClass7_Sub8_Sub4_4.method5801()) {
				local11 = true;
			}
			if (local11) {
				Static225.anInt4941--;
				for (local144 = local3; local144 < Static225.anInt4941; local144++) {
					Static205.aClass252Array1[local144] = Static205.aClass252Array1[local144 + 1];
				}
				local3--;
			}
		}
		if (Static226.aBoolean244 && !Static422.method5396()) {
			if (Static130.aClass153_Sub1_1.anInt5240 != 0 && Static128.anInt2476 != -1) {
				Static96.method1689(Static128.anInt2476, Static122.aClass178_39, Static130.aClass153_Sub1_1.anInt5240);
			}
			Static226.aBoolean244 = false;
		} else if (Static130.aClass153_Sub1_1.anInt5240 != 0 && Static128.anInt2476 != -1 && !Static422.method5396()) {
			Static81.method1414(Static225.aClass2_76);
			Static255.aClass7_Sub14_Sub1_2.method3933(Static128.anInt2476);
			Static128.anInt2476 = -1;
		}
	}
}
