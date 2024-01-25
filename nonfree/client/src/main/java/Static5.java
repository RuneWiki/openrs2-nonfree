import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_2 = new Class163(25, 15);

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
	public static void method67() {
		for (@Pc(7) int local7 = 0; local7 < Static139.anInt2476; local7++) {
			@Pc(13) Class216 local13 = Static342.aClass216Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(226) int local226;
			if (local13.aClass3_Sub1_Sub3_4 == null) {
				local13.anInt6181--;
				if ((local13.aByte75 == 2 ? -1500 : -10) > local13.anInt6181) {
					local15 = true;
				} else {
					if (local13.aByte75 == 1 && local13.aClass204_1 == null) {
						local13.aClass204_1 = Static472.method4861(Static156.aClass250_45, local13.anInt6182, 0);
						if (local13.aClass204_1 == null) {
							continue;
						}
						local13.anInt6181 += local13.aClass204_1.method4860();
					} else if (local13.aByte75 == 2 && (local13.aClass3_Sub27_1 == null || local13.aClass3_Sub28_Sub1_2 == null)) {
						if (local13.aClass3_Sub27_1 == null) {
							local13.aClass3_Sub27_1 = Static196.method3054(Static72.aClass250_24, local13.anInt6182);
						}
						if (local13.aClass3_Sub27_1 == null) {
							continue;
						}
						if (local13.aClass3_Sub28_Sub1_2 == null) {
							local13.aClass3_Sub28_Sub1_2 = local13.aClass3_Sub27_1.method3050(new int[] { 22050 });
							if (local13.aClass3_Sub28_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt6181 < 0) {
						if (local13.anInt6180 == 0) {
							local226 = local13.anInt6179 * Static39.aClass79_Sub1_1.anInt2158 >> 8;
						} else {
							@Pc(126) int local126 = local13.anInt6180 >> 24 & 0x3;
							if (Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 == local126) {
								@Pc(137) int local137 = (local13.anInt6180 & 0xFF) << 7;
								@Pc(144) int local144 = local13.anInt6180 >> 16 & 0xFF;
								@Pc(154) int local154 = (local144 << 7) + 64 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560;
								if (local154 < 0) {
									local154 = -local154;
								}
								@Pc(169) int local169 = local13.anInt6180 >> 8 & 0xFF;
								@Pc(178) int local178 = (local169 << 7) + 64 - Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557;
								if (local178 < 0) {
									local178 = -local178;
								}
								@Pc(192) int local192 = local178 + local154 - 128;
								if (local137 < local192) {
									local13.anInt6181 = -99999;
									continue;
								}
								if (local192 < 0) {
									local192 = 0;
								}
								local226 = local13.anInt6179 * (local137 - local192) * Static39.aClass79_Sub1_1.anInt2163 / local137 >> 8;
							} else {
								local226 = 0;
							}
						}
						if (local226 > 0) {
							@Pc(247) Class3_Sub28_Sub1 local247 = null;
							if (local13.aByte75 == 1) {
								local247 = local13.aClass204_1.method4862().method3073(Static459.aClass164_2);
							} else if (local13.aByte75 == 2) {
								local247 = local13.aClass3_Sub28_Sub1_2;
							}
							@Pc(277) Class3_Sub1_Sub3 local277 = local13.aClass3_Sub1_Sub3_4 = Static474.method5372(local247, local226);
							local277.method5358(local13.anInt6178 - 1);
							Static440.aClass3_Sub1_Sub2_2.method5094(local277);
						}
					}
				}
			} else if (!local13.aClass3_Sub1_Sub3_4.method6287()) {
				local15 = true;
			}
			if (local15) {
				Static139.anInt2476--;
				for (local226 = local7; local226 < Static139.anInt2476; local226++) {
					Static342.aClass216Array1[local226] = Static342.aClass216Array1[local226 + 1];
				}
				local7--;
			}
		}
		if (Static240.aBoolean428 && !Static358.method5007()) {
			if (Static39.aClass79_Sub1_1.anInt2147 != 0 && Static81.anInt1464 != -1) {
				Static84.method4994(Static81.anInt1464, Static28.aClass250_12, Static39.aClass79_Sub1_1.anInt2147);
			}
			Static240.aBoolean428 = false;
		} else if (Static39.aClass79_Sub1_1.anInt2147 != 0 && Static81.anInt1464 != -1 && !Static358.method5007()) {
			Static307.method4633(Static381.aClass163_162);
			Static243.aClass3_Sub25_Sub1_7.method4082(Static81.anInt1464);
			Static81.anInt1464 = -1;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)Z")
	public static boolean method68(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static225.method3255(arg0, arg1)) {
			return (arg1 & 0xB000) != 0 | Static408.method5631(arg1, arg0) | Static229.method3308(arg0, arg1) ? true : (Static359.method5020(arg0, arg1) | Static327.method4523(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}
}
