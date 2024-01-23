import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	public static int anInt3010;

	@OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
	public static int anInt3012;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!hc;")
	public static Class51 aClass51_38;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
	public static int anInt3016;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "Z")
	public static boolean aBoolean165 = false;

	@OriginalMember(owner = "client!ji", name = "s", descriptor = "[S")
	public static short[] aShortArray45 = new short[256];

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
	public static void method2300() {
		Static206.anInt4551 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static217.anInt4761; local3++) {
			@Pc(8) Class2 local8 = Static255.aClass2Array2[local3];
			@Pc(12) int local12;
			if (Static96.anIntArray197 != null) {
				for (local12 = 0; local12 < Static96.anIntArray197.length; local12++) {
					if (Static96.anIntArray197[local12] != -1000000 && (local8.anInt45 <= Static96.anIntArray197[local12] || local8.anInt40 <= Static96.anIntArray197[local12]) && (local8.anInt36 <= Static182.anIntArray309[local12] || local8.anInt33 <= Static182.anIntArray309[local12]) && (local8.anInt36 >= Static142.anIntArray259[local12] || local8.anInt33 >= Static142.anIntArray259[local12]) && (local8.anInt31 <= Static265.anIntArray469[local12] || local8.anInt49 <= Static265.anIntArray469[local12]) && (local8.anInt31 >= Static222.anIntArray428[local12] || local8.anInt49 >= Static222.anIntArray428[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt42 == 1) {
				local12 = local8.anInt52 + Static187.anInt4201 - Static153.anInt3688;
				if (local12 >= 0 && local12 <= Static187.anInt4201 + Static187.anInt4201) {
					local110 = local8.anInt30 + Static187.anInt4201 - Static148.anInt446;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt53 + Static187.anInt4201 - Static148.anInt446;
					if (local121 > Static187.anInt4201 + Static187.anInt4201) {
						local121 = Static187.anInt4201 + Static187.anInt4201;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static77.aBooleanArrayArray1[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static68.anInt1403 - local8.anInt36;
						if (local153 > 32) {
							local8.anInt50 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt50 = 2;
							local153 = -local153;
						}
						local8.anInt51 = (local8.anInt31 - Static112.anInt2954 << 8) / local153;
						local8.anInt54 = (local8.anInt49 - Static112.anInt2954 << 8) / local153;
						local8.anInt47 = (local8.anInt45 - Static24.anInt815 << 8) / local153;
						local8.anInt39 = (local8.anInt40 - Static24.anInt815 << 8) / local153;
						Static217.aClass2Array1[Static206.anInt4551++] = local8;
					}
				}
			} else if (local8.anInt42 == 2) {
				local12 = local8.anInt30 + Static187.anInt4201 - Static148.anInt446;
				if (local12 >= 0 && local12 <= Static187.anInt4201 + Static187.anInt4201) {
					local110 = local8.anInt52 + Static187.anInt4201 - Static153.anInt3688;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt48 + Static187.anInt4201 - Static153.anInt3688;
					if (local121 > Static187.anInt4201 + Static187.anInt4201) {
						local121 = Static187.anInt4201 + Static187.anInt4201;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static77.aBooleanArrayArray1[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static112.anInt2954 - local8.anInt31;
						if (local153 > 32) {
							local8.anInt50 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt50 = 4;
							local153 = -local153;
						}
						local8.anInt46 = (local8.anInt36 - Static68.anInt1403 << 8) / local153;
						local8.anInt34 = (local8.anInt33 - Static68.anInt1403 << 8) / local153;
						local8.anInt47 = (local8.anInt45 - Static24.anInt815 << 8) / local153;
						local8.anInt39 = (local8.anInt40 - Static24.anInt815 << 8) / local153;
						Static217.aClass2Array1[Static206.anInt4551++] = local8;
					}
				}
			} else if (local8.anInt42 == 4) {
				local12 = local8.anInt45 - Static24.anInt815;
				if (local12 > 128) {
					local110 = local8.anInt30 + Static187.anInt4201 - Static148.anInt446;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt53 + Static187.anInt4201 - Static148.anInt446;
					if (local121 > Static187.anInt4201 + Static187.anInt4201) {
						local121 = Static187.anInt4201 + Static187.anInt4201;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt52 + Static187.anInt4201 - Static153.anInt3688;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt48 + Static187.anInt4201 - Static153.anInt3688;
						if (local153 > Static187.anInt4201 + Static187.anInt4201) {
							local153 = Static187.anInt4201 + Static187.anInt4201;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static77.aBooleanArrayArray1[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt50 = 5;
							local8.anInt46 = (local8.anInt36 - Static68.anInt1403 << 8) / local12;
							local8.anInt34 = (local8.anInt33 - Static68.anInt1403 << 8) / local12;
							local8.anInt51 = (local8.anInt31 - Static112.anInt2954 << 8) / local12;
							local8.anInt54 = (local8.anInt49 - Static112.anInt2954 << 8) / local12;
							Static217.aClass2Array1[Static206.anInt4551++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
	public static void method2301(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = Static238.anInt5146;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(167) int local167;
		@Pc(173) int local173;
		@Pc(197) int local197;
		@Pc(201) int local201;
		@Pc(98) int local98;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(29) Class9_Sub1_Sub1 local29;
			if (arg0 == 0) {
				local29 = Static83.aClass9_Sub1_Sub1_1;
			} else {
				local29 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local16]];
			}
			if (local29 != null && local29.method219()) {
				@Pc(43) int local43 = local29.method208();
				if (arg0 == 0 || local43 == arg0) {
					@Pc(72) int local72;
					@Pc(77) int local77;
					if (local43 == 1) {
						if ((local29.anInt427 & 0x7F) == 64 && (local29.anInt479 & 0x7F) == 64) {
							local72 = local29.anInt427 >> 7;
							local77 = local29.anInt479 >> 7;
							if (local72 >= 0 && local72 < 104 && local77 >= 0 && local77 < 104) {
								local98 = Static265.anIntArrayArray40[local72][local77]++;
							}
						}
					} else if (((local43 & 0x1) != 0 || (local29.anInt427 & 0x7F) == 0 && (local29.anInt479 & 0x7F) == 0) && ((local43 & 0x1) != 1 || (local29.anInt427 & 0x7F) == 64 && (local29.anInt479 & 0x7F) == 64)) {
						local77 = local29.anInt479 - local43 * 64 >> 7;
						local72 = local29.anInt427 - local43 * 64 >> 7;
						local167 = local29.method208() + local72;
						local173 = local29.method208() + local77;
						if (local173 > 104) {
							local173 = 104;
						}
						if (local167 > 104) {
							local167 = 104;
						}
						if (local77 < 0) {
							local77 = 0;
						}
						if (local72 < 0) {
							local72 = 0;
						}
						for (local197 = local72; local197 < local167; local197++) {
							for (local201 = local77; local201 < local173; local201++) {
								local98 = Static265.anIntArrayArray40[local197][local201]++;
							}
						}
					}
				}
			}
		}
		label210: for (@Pc(234) int local234 = 0; local234 < local7; local234++) {
			@Pc(251) Class9_Sub1_Sub1 local251;
			@Pc(245) long local245;
			if (arg0 == 0) {
				local245 = 8791798054912L;
				local251 = Static83.aClass9_Sub1_Sub1_1;
			} else {
				local245 = (long) Static237.anIntArray447[local234] << 32;
				local251 = Static147.aClass9_Sub1_Sub1Array1[Static237.anIntArray447[local234]];
			}
			if (local251 != null && local251.method219()) {
				local167 = local251.method208();
				if (arg0 == 0 || arg0 == local167) {
					local251.aBoolean21 = false;
					local251.aBoolean28 = true;
					if ((Static109.aBoolean156 && Static238.anInt5146 > 200 || Static238.anInt5146 > 50) && arg0 != 0 && local251.anInt451 == local251.method207().anInt2744) {
						local251.aBoolean21 = true;
					}
					if (local167 == 1) {
						if ((local251.anInt427 & 0x7F) == 64 && (local251.anInt479 & 0x7F) == 64) {
							local173 = local251.anInt427 >> 7;
							local197 = local251.anInt479 >> 7;
							if (local173 < 0 || local173 >= 104 || local197 < 0 || local197 >= 104) {
								continue;
							}
							if (Static265.anIntArrayArray40[local173][local197] > 1) {
								local98 = Static265.anIntArrayArray40[local173][local197]--;
								continue;
							}
						}
					} else if ((local167 & 0x1) == 0 && (local251.anInt427 & 0x7F) == 0 && (local251.anInt479 & 0x7F) == 0 || (local167 & 0x1) == 1 && (local251.anInt427 & 0x7F) == 64 && (local251.anInt479 & 0x7F) == 0) {
						local173 = local251.anInt427 - local167 * 64 >> 7;
						local197 = local251.anInt479 - local167 * 64 >> 7;
						local201 = local173 + local167;
						if (local201 > 104) {
							local201 = 104;
						}
						if (local173 < 0) {
							local173 = 0;
						}
						@Pc(453) int local453 = local197 + local167;
						if (local453 > 104) {
							local453 = 104;
						}
						if (local197 < 0) {
							local197 = 0;
						}
						@Pc(467) boolean local467 = true;
						@Pc(473) int local473;
						for (@Pc(469) int local469 = local173; local469 < local201; local469++) {
							for (local473 = local197; local473 < local453; local473++) {
								if (Static265.anIntArrayArray40[local469][local473] <= 1) {
									local467 = false;
									break;
								}
							}
						}
						if (local467) {
							local473 = local173;
							while (true) {
								if (local473 >= local201) {
									continue label210;
								}
								for (@Pc(508) int local508 = local197; local508 < local453; local508++) {
									local98 = Static265.anIntArrayArray40[local473][local508]--;
								}
								local473++;
							}
						}
					}
					if (local251.anObject3 == null || local251.anInt441 > Static156.anInt3722 || local251.anInt473 <= Static156.anInt3722) {
						local251.aBoolean28 = false;
						local251.anInt401 = Static200.method3326(Static137.anInt3321, local251.anInt479, local251.anInt427);
						Static164.method2853(Static137.anInt3321, local251.anInt427, local251.anInt479, local251.anInt401, (local167 - 1) * 64 + 60, local251, local251.anInt419, local245, local251.aBoolean23);
					} else {
						local251.aBoolean28 = false;
						local251.aBoolean21 = false;
						local251.anInt401 = Static200.method3326(Static137.anInt3321, local251.anInt479, local251.anInt427);
						Static143.method2608(Static137.anInt3321, local251.anInt427, local251.anInt479, local251.anInt401, local251, local251.anInt419, local245, local251.anInt440, local251.anInt442, local251.anInt452, local251.anInt477);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lclient!vi;")
	public static Class144 method2302(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub16 local7 = Static142.aClass1_Sub16ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass144_1;
	}
}
