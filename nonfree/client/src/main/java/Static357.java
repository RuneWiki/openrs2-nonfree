import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static357 {

	@OriginalMember(owner = "client!mv", name = "K", descriptor = "I")
	public static int anInt5961;

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IILclient!ei;B)V")
	public static void method5305(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub5_Sub4 arg2) {
		if (!Static142.aBoolean190) {
			return;
		}
		@Pc(10) int local10 = 0;
		@Pc(30) int local30;
		for (@Pc(24) Class5_Sub5_Sub15 local24 = (Class5_Sub5_Sub15) arg2.aClass368_2.method8702(); local24 != null; local24 = (Class5_Sub5_Sub15) arg2.aClass368_2.method8710()) {
			local30 = Static235.method3913(local24);
			if (local30 > local10) {
				local10 = local30;
			}
		}
		local10 += 8;
		Static239.anInt4414 = (Static186.aBoolean231 ? 26 : 22) + arg2.anInt2287 * 16;
		local30 = arg2.anInt2287 * 16 + 21;
		@Pc(70) int local70 = Static115.anInt2157 + Static346.anInt4654;
		if (local10 + local70 > Static345.anInt5827) {
			local70 = Static346.anInt4654 - local10;
		}
		if (local70 < 0) {
			local70 = 0;
		}
		@Pc(89) int local89 = Static186.aBoolean231 ? 33 : 31;
		@Pc(96) int local96 = arg0 + 13 - local89;
		if (Static408.anInt7118 < local30 + local96) {
			local96 = Static408.anInt7118 - local30;
		}
		if (local96 < 0) {
			local96 = 0;
		}
		Static129.anInt2304 = local70;
		Static565.anInt9564 = local10;
		Static14.anInt240 = local96;
		Static281.aClass5_Sub5_Sub4_1 = arg2;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method5307(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static174.anInt3117 = 0;
		Static590.anInt9893 = 0;
		Static28.anInt364++;
		@Pc(21) Class4_Sub2 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static79.aClass4_Sub2Array1[local5]; local21 != null; local21 = local21.aClass4_Sub2_23) {
				if (!Static532.method7866(local21, arg0, arg1, arg2, arg3)) {
					Static155.method1873(local21);
					if (local21.anInt10234 != -1) {
						Static535.aClass4_Sub2Array5[Static174.anInt3117++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static457.aClass4_Sub2Array4[local5]; local21 != null; local21 = local21.aClass4_Sub2_23) {
				if (!Static532.method7866(local21, arg0, arg1, arg2, arg3)) {
					Static155.method1873(local21);
					if (local21.anInt10234 != -1) {
						Static427.aClass4_Sub2Array3[Static590.anInt9893++] = local21;
					}
				}
			}
			for (@Pc(87) Class4_Sub2 local87 = Static243.aClass4_Sub2Array2[local5]; local87 != null; local87 = local87.aClass4_Sub2_23) {
				if (!Static532.method7866(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8727()) {
						Static155.method1873(local87);
						if (local87.anInt10234 != -1) {
							Static427.aClass4_Sub2Array3[Static590.anInt9893++] = local87;
						}
					} else {
						Static155.method1873(local87);
						if (local87.anInt10234 != -1) {
							Static535.aClass4_Sub2Array5[Static174.anInt3117++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static454.anInt7719; local137++) {
					if (!Static532.method7866(Static210.aClass4_Sub2_Sub1Array1[local137], arg0, arg1, arg2, arg3)) {
						Static155.method1873(Static210.aClass4_Sub2_Sub1Array1[local137]);
						if (Static210.aClass4_Sub2_Sub1Array1[local137].anInt10234 != -1) {
							if (Static210.aClass4_Sub2_Sub1Array1[local137].method8727()) {
								Static427.aClass4_Sub2Array3[Static590.anInt9893++] = Static210.aClass4_Sub2_Sub1Array1[local137];
							} else {
								Static535.aClass4_Sub2Array5[Static174.anInt3117++] = Static210.aClass4_Sub2_Sub1Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static174.anInt3117 > 0) {
			Static351.method5256(Static535.aClass4_Sub2Array5, 0, Static174.anInt3117 - 1);
			for (local198 = 0; local198 < Static174.anInt3117; local198++) {
				Static47.method825(Static535.aClass4_Sub2Array5[local198], arg6);
			}
		}
		if (Static348.aBoolean425) {
			Static517.aClass133_13.method7286(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static37.anInt600; local198 < Static68.anInt1380; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static475.aBooleanArrayArray8.length;
					if (Static306.anInt5332 + Static475.aBooleanArrayArray8.length > anInt5961) {
						local230 -= Static306.anInt5332 + Static475.aBooleanArrayArray8.length - anInt5961;
					}
					local137 = Static475.aBooleanArrayArray8[0].length;
					if (Static177.anInt3154 + Static475.aBooleanArrayArray8[0].length > Static429.anInt7422) {
						local137 -= Static177.anInt3154 + Static475.aBooleanArrayArray8[0].length - Static429.anInt7422;
					}
					local271 = Static431.aBooleanArrayArray6;
					if (Static154.aBoolean202) {
						if (Static576.aBoolean696) {
							local271 = Static448.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static20.anInt282; local281 < local230; local281++) {
							local288 = local281 + Static306.anInt5332 - Static20.anInt282;
							for (local290 = Static320.anInt5432; local290 < local137; local290++) {
								if (Static475.aBooleanArrayArray8[local281][local290] && !Static463.method6855(local198, local288, local290 + Static177.anInt3154 - Static320.anInt5432)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static576.aBoolean696) {
						if (arg4 >= 0) {
							Static11.aClass61Array1[local198].method8586(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static11.aClass61Array1[local198].method8583(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static106.anInt2025; local281++) {
							Static288.aClass175Array1[local281].method4190(new Class4_Sub5(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static11.aClass61Array1[local198].method8586(Static260.anInt4712, Static598.anInt10044, Static51.anInt1064, Static431.aBooleanArrayArray6, true, arg4, arg5);
					} else {
						Static11.aClass61Array1[local198].method8583(Static260.anInt4712, Static598.anInt10044, Static51.anInt1064, Static431.aBooleanArrayArray6, true, arg5);
					}
				} else {
					local230 = Static475.aBooleanArrayArray8.length;
					if (Static306.anInt5332 + Static475.aBooleanArrayArray8.length > anInt5961) {
						local230 -= Static306.anInt5332 + Static475.aBooleanArrayArray8.length - anInt5961;
					}
					local137 = Static475.aBooleanArrayArray8[0].length;
					if (Static177.anInt3154 + Static475.aBooleanArrayArray8[0].length > Static429.anInt7422) {
						local137 -= Static177.anInt3154 + Static475.aBooleanArrayArray8[0].length - Static429.anInt7422;
					}
					local271 = Static431.aBooleanArrayArray6;
					if (Static154.aBoolean202) {
						if (Static576.aBoolean696) {
							local271 = Static448.aBooleanArrayArrayArray1[local198];
						}
						for (local281 = Static20.anInt282; local281 < local230; local281++) {
							local288 = local281 + Static306.anInt5332 - Static20.anInt282;
							for (local290 = Static320.anInt5432; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static475.aBooleanArrayArray8[local281][local290]) {
									@Pc(309) int local309 = local290 + Static177.anInt3154 - Static320.anInt5432;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static421.aClass217ArrayArrayArray5[local311][local288][local309] != null && Static421.aClass217ArrayArrayArray5[local311][local288][local309].aByte80 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static463.method6855(local198, local288, local309)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static576.aBoolean696) {
						if (arg4 >= 0) {
							Static11.aClass61Array1[local198].method8586(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static11.aClass61Array1[local198].method8583(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static106.anInt2025; local281++) {
							Static288.aClass175Array1[local281].method4190(new Class4_Sub5(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static11.aClass61Array1[local198].method8586(Static260.anInt4712, Static598.anInt10044, Static51.anInt1064, Static431.aBooleanArrayArray6, false, arg4, arg5);
					} else {
						Static11.aClass61Array1[local198].method8583(Static260.anInt4712, Static598.anInt10044, Static51.anInt1064, Static431.aBooleanArrayArray6, false, arg5);
					}
				}
			}
		}
		if (Static590.anInt9893 > 0) {
			Static429.method6565(Static427.aClass4_Sub2Array3, 0, Static590.anInt9893 - 1);
			for (local198 = 0; local198 < Static590.anInt9893; local198++) {
				Static47.method825(Static427.aClass4_Sub2Array3[local198], arg6);
			}
		}
	}
}
