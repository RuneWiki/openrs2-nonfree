import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
	public static int anInt4194;

	@OriginalMember(owner = "client!lf", name = "c", descriptor = "S")
	public static short aShort69 = 1;

	@OriginalMember(owner = "client!lf", name = "e", descriptor = "Z")
	public static boolean aBoolean359 = true;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V")
	public static void method3355() {
		for (@Pc(7) int local7 = 0; local7 < Static319.anInt1933; local7++) {
			@Pc(13) Class219 local13 = Static25.aClass219Array1[local7];
			@Pc(15) boolean local15 = false;
			@Pc(238) int local238;
			if (local13.aClass3_Sub5_Sub2_4 == null) {
				local13.anInt6082--;
				if ((local13.aByte97 == 2 ? -1500 : -10) > local13.anInt6082) {
					local15 = true;
				} else {
					if (local13.aByte97 == 1 && local13.aClass175_1 == null) {
						local13.aClass175_1 = Static460.method4047(Static69.aClass32_30, local13.anInt6081, 0);
						if (local13.aClass175_1 == null) {
							continue;
						}
						local13.anInt6082 += local13.aClass175_1.method4044();
					} else if (local13.aByte97 == 2 && (local13.aClass3_Sub43_1 == null || local13.aClass3_Sub6_Sub1_2 == null)) {
						if (local13.aClass3_Sub43_1 == null) {
							local13.aClass3_Sub43_1 = Static427.method5460(Static9.aClass32_3, local13.anInt6081);
						}
						if (local13.aClass3_Sub43_1 == null) {
							continue;
						}
						if (local13.aClass3_Sub6_Sub1_2 == null) {
							local13.aClass3_Sub6_Sub1_2 = local13.aClass3_Sub43_1.method5461(new int[] { 22050 });
							if (local13.aClass3_Sub6_Sub1_2 == null) {
								continue;
							}
						}
					}
					if (local13.anInt6082 < 0) {
						if (local13.anInt6083 == 0) {
							local238 = local13.anInt6084 * Static374.aClass20_Sub1_1.anInt2360 >> 8;
						} else {
							@Pc(134) int local134 = local13.anInt6083 >> 24 & 0x3;
							if (local134 == Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77) {
								@Pc(149) int local149 = (local13.anInt6083 & 0xFF) << 7;
								@Pc(156) int local156 = local13.anInt6083 >> 16 & 0xFF;
								@Pc(166) int local166 = (local156 << 7) + 64 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318;
								if (local166 < 0) {
									local166 = -local166;
								}
								@Pc(181) int local181 = local13.anInt6083 >> 8 & 0xFF;
								@Pc(190) int local190 = (local181 << 7) + 64 - Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321;
								if (local190 < 0) {
									local190 = -local190;
								}
								@Pc(204) int local204 = local190 + local166 - 128;
								if (local204 > local149) {
									local13.anInt6082 = -99999;
									continue;
								}
								if (local204 < 0) {
									local204 = 0;
								}
								local238 = (local149 - local204) * Static374.aClass20_Sub1_1.anInt2349 * local13.anInt6084 / local149 >> 8;
							} else {
								local238 = 0;
							}
						}
						if (local238 > 0) {
							@Pc(259) Class3_Sub6_Sub1 local259 = null;
							if (local13.aByte97 == 1) {
								local259 = local13.aClass175_1.method4046().method743(Static262.aClass174_1);
							} else if (local13.aByte97 == 2) {
								local259 = local13.aClass3_Sub6_Sub1_2;
							}
							@Pc(287) Class3_Sub5_Sub2 local287 = local13.aClass3_Sub5_Sub2_4 = Static458.method2085(local259, local238);
							local287.method2100(local13.anInt6087 - 1);
							Static331.aClass3_Sub5_Sub1_42.method889(local287);
						}
					}
				}
			} else if (!local13.aClass3_Sub5_Sub2_4.method5978()) {
				local15 = true;
			}
			if (local15) {
				Static319.anInt1933--;
				for (local238 = local7; local238 < Static319.anInt1933; local238++) {
					Static25.aClass219Array1[local238] = Static25.aClass219Array1[local238 + 1];
				}
				local7--;
			}
		}
		if (Static24.aBoolean64 && !Static282.method3508()) {
			if (Static374.aClass20_Sub1_1.anInt2341 != 0 && Static120.anInt2586 != -1) {
				Static73.method1426(Static374.aClass20_Sub1_1.anInt2341, Static120.anInt2586, Static149.aClass32_43);
			}
			Static24.aBoolean64 = false;
		} else if (Static374.aClass20_Sub1_1.anInt2341 != 0 && Static120.anInt2586 != -1 && !Static282.method3508()) {
			Static30.method641(Static136.aClass217_50);
			Static302.aClass3_Sub7_Sub1_2.method2636(Static120.anInt2586);
			Static120.anInt2586 = -1;
		}
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IBIZZ)Lclient!bu;")
	public static Class32 method3356(@OriginalArg(2) int arg0, @OriginalArg(3) boolean arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class228 local5 = null;
		if (Static136.aClass103_1 != null) {
			local5 = new Class228(arg0, Static136.aClass103_1, Static148.aClass103Array1[arg0], 1000000);
		}
		Static438.aClass25_Sub1Array2[arg0] = Static430.aClass198_2.method4349(arg0, Static94.aClass228_4, local5);
		if (arg2) {
			Static438.aClass25_Sub1Array2[arg0].method671();
		}
		return new Class32(Static438.aClass25_Sub1Array2[arg0], arg1, 1);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIBI)V")
	public static void method3357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 > Static309.anInt5495 || arg4 < Static341.anInt5789) {
			return;
		}
		@Pc(27) boolean local27;
		if (Static452.anInt7626 > arg1) {
			local27 = false;
			arg1 = Static452.anInt7626;
		} else if (arg1 <= Static82.anInt3956) {
			local27 = true;
		} else {
			arg1 = Static82.anInt3956;
			local27 = false;
		}
		@Pc(51) boolean local51;
		if (arg3 < Static452.anInt7626) {
			local51 = false;
			arg3 = Static452.anInt7626;
		} else if (Static82.anInt3956 >= arg3) {
			local51 = true;
		} else {
			local51 = false;
			arg3 = Static82.anInt3956;
		}
		if (Static341.anInt5789 > arg0) {
			arg0 = Static341.anInt5789;
		} else {
			Static412.method5293(Static262.anIntArrayArray31[arg0++], arg2, arg1, arg3);
		}
		if (arg4 > Static309.anInt5495) {
			arg4 = Static309.anInt5495;
		} else {
			Static412.method5293(Static262.anIntArrayArray31[arg4--], arg2, arg1, arg3);
		}
		@Pc(111) int local111;
		if (local27 && local51) {
			for (local111 = arg0; local111 <= arg4; local111++) {
				@Pc(155) int[] local155 = Static262.anIntArrayArray31[local111];
				local155[arg1] = local155[arg3] = arg2;
			}
		} else if (local27) {
			for (local111 = arg0; local111 <= arg4; local111++) {
				Static262.anIntArrayArray31[local111][arg1] = arg2;
			}
		} else if (local51) {
			for (local111 = arg0; local111 <= arg4; local111++) {
				Static262.anIntArrayArray31[local111][arg3] = arg2;
			}
		}
	}
}
