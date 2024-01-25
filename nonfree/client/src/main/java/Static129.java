import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!ev", name = "t", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!ev", name = "c", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_52 = new Class298(15, 8);

	@OriginalMember(owner = "client!ev", name = "p", descriptor = "Lclient!tf;")
	public static final Class319 aClass319_2 = new Class319();

	@OriginalMember(owner = "client!ev", name = "s", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_77 = new Class272(60, 0);

	@OriginalMember(owner = "client!ev", name = "v", descriptor = "[Lclient!lb;")
	public static Class197[] aClass197Array1 = null;

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(I)V")
	public static void method2556() {
		for (@Pc(3) int local3 = 0; local3 < Static407.anInt6912; local3++) {
			@Pc(14) Class232 local14 = Static567.aClass232Array1[local3];
			@Pc(16) boolean local16 = false;
			@Pc(147) int local147;
			if (local14.aClass3_Sub6_Sub2_4 == null) {
				local14.anInt6298--;
				if (local14.anInt6298 < (local14.method5456() ? -1500 : -10)) {
					local16 = true;
				} else {
					if (local14.aByte83 == 1 && local14.aClass358_1 == null) {
						local14.aClass358_1 = Static607.method7640(Static35.aClass246_28, local14.anInt6297, 0);
						if (local14.aClass358_1 == null) {
							continue;
						}
						local14.anInt6298 += local14.aClass358_1.method7643();
					} else if (local14.method5456() && (local14.aClass3_Sub36_3 == null || local14.aClass3_Sub20_Sub1_4 == null)) {
						if (local14.aClass3_Sub36_3 == null) {
							local14.aClass3_Sub36_3 = Static362.method5453(Static437.aClass246_205, local14.anInt6297);
						}
						if (local14.aClass3_Sub36_3 == null) {
							continue;
						}
						if (local14.aClass3_Sub20_Sub1_4 == null) {
							local14.aClass3_Sub20_Sub1_4 = local14.aClass3_Sub36_3.method5442(new int[] { 22050 });
							if (local14.aClass3_Sub20_Sub1_4 == null) {
								continue;
							}
						}
					}
					if (local14.anInt6298 < 0) {
						if (local14.anInt6293 == 0) {
							local147 = local14.anInt6292 * (local14.aByte83 == 3 ? Static278.aClass3_Sub13_Sub1_1.anInt5135 : Static278.aClass3_Sub13_Sub1_1.anInt5153) >> 8;
						} else {
							@Pc(156) int local156 = local14.anInt6293 >> 24 & 0x3;
							if (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126 == local156) {
								@Pc(171) int local171 = (local14.anInt6293 & 0xFF) << 9;
								@Pc(178) int local178 = local14.anInt6293 >> 16 & 0xFF;
								@Pc(187) int local187 = (local178 << 9) + 256 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975;
								if (local187 < 0) {
									local187 = -local187;
								}
								@Pc(199) int local199 = local14.anInt6293 >> 8 & 0xFF;
								@Pc(209) int local209 = (local199 << 9) + 256 - Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980;
								if (local209 < 0) {
									local209 = -local209;
								}
								@Pc(223) int local223 = local209 + local187 - 512;
								if (local171 < local223) {
									local14.anInt6298 = -99999;
									continue;
								}
								if (local223 < 0) {
									local223 = 0;
								}
								local147 = local14.anInt6292 * (local171 - local223) * Static278.aClass3_Sub13_Sub1_1.anInt5139 / local171 >> 8;
							} else {
								local147 = 0;
							}
						}
						if (local147 > 0) {
							@Pc(260) Class3_Sub20_Sub1 local260 = null;
							if (local14.aByte83 == 1) {
								local260 = local14.aClass358_1.method7641().method2362(Static568.aClass154_1);
							} else if (local14.method5456()) {
								local260 = local14.aClass3_Sub20_Sub1_4;
							}
							@Pc(288) Class3_Sub6_Sub2 local288 = local14.aClass3_Sub6_Sub2_4 = Static598.method1588(local260, local147);
							local288.method1582(local14.anInt6294 - 1);
							Static164.aClass3_Sub6_Sub1_1.method285(local288);
						}
					}
				}
			} else if (!local14.aClass3_Sub6_Sub2_4.method7813()) {
				local16 = true;
			}
			if (local16) {
				Static407.anInt6912--;
				for (local147 = local3; local147 < Static407.anInt6912; local147++) {
					Static567.aClass232Array1[local147] = Static567.aClass232Array1[local147 + 1];
				}
				local3--;
			}
		}
		if (Static127.aBoolean238 && !Static345.method5246()) {
			if (Static278.aClass3_Sub13_Sub1_1.anInt5154 != 0 && Static380.anInt6546 != -1) {
				Static437.method6178(Static576.aClass246_267, Static278.aClass3_Sub13_Sub1_1.anInt5154, Static380.anInt6546);
			}
			Static127.aBoolean238 = false;
		} else if (Static278.aClass3_Sub13_Sub1_1.anInt5154 != 0 && Static380.anInt6546 != -1 && !Static345.method5246()) {
			@Pc(379) Class3_Sub34 local379 = Static374.method5522(Static442.aClass298_169, Static220.aClass287_2);
			local379.aClass3_Sub11_Sub1_2.method3101(Static380.anInt6546);
			Static131.method2572(local379);
			Static380.anInt6546 = -1;
		}
	}

	@OriginalMember(owner = "client!ev", name = "a", descriptor = "(IIIZII)V")
	public static void method2557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg2;
		@Pc(19) int local19 = arg0 - arg3;
		if (local10 == 0) {
			if (local19 != 0) {
				Static102.method755(arg2, arg1, arg3, arg0);
			}
		} else if (local19 == 0) {
			Static451.method6278(arg2, arg1, arg3, arg4);
		} else {
			@Pc(45) int local45 = (local19 << 12) / local10;
			@Pc(54) int local54 = arg3 - (arg2 * local45 >> 12);
			@Pc(68) int local68;
			@Pc(66) int local66;
			if (arg4 < Static110.anInt2597) {
				local68 = Static110.anInt2597;
				local66 = local54 + (local45 * Static110.anInt2597 >> 12);
			} else if (arg4 <= Static459.anInt7524) {
				local66 = arg0;
				local68 = arg4;
			} else {
				local66 = local54 + (Static459.anInt7524 * local45 >> 12);
				local68 = Static459.anInt7524;
			}
			@Pc(98) int local98;
			@Pc(106) int local106;
			if (arg2 < Static110.anInt2597) {
				local98 = Static110.anInt2597;
				local106 = local54 + (local45 * Static110.anInt2597 >> 12);
			} else if (Static459.anInt7524 >= arg2) {
				local98 = arg2;
				local106 = arg3;
			} else {
				local106 = (Static459.anInt7524 * local45 >> 12) + local54;
				local98 = Static459.anInt7524;
			}
			if (local66 < Static385.anInt6630) {
				local68 = (Static385.anInt6630 - local54 << 12) / local45;
				local66 = Static385.anInt6630;
			} else if (Static69.anInt1918 < local66) {
				local68 = (Static69.anInt1918 - local54 << 12) / local45;
				local66 = Static69.anInt1918;
			}
			if (local106 < Static385.anInt6630) {
				local106 = Static385.anInt6630;
				local98 = (Static385.anInt6630 - local54 << 12) / local45;
			} else if (local106 > Static69.anInt1918) {
				local98 = (Static69.anInt1918 - local54 << 12) / local45;
				local106 = Static69.anInt1918;
			}
			Static93.method2063(local98, local66, arg1, local106, local68);
		}
	}
}
