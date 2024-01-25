import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!ol", name = "T", descriptor = "Lclient!pca;")
	public static Class251 aClass251_13;

	@OriginalMember(owner = "client!ol", name = "Sb", descriptor = "I")
	public static int anInt8541;

	@OriginalMember(owner = "client!ol", name = "xc", descriptor = "Lclient!cf;")
	public static final Class51 aClass51_16 = new Class51();

	@OriginalMember(owner = "client!ol", name = "yc", descriptor = "Lclient!or;")
	public static final Class244 aClass244_61 = new Class244();

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method6667(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static505.anInt8754 = 0;
		Static127.anInt2900 = 0;
		Static136.anInt3255++;
		for (@Pc(15) int local15 = 0; local15 < Static199.anIntArray186[local5]; local15++) {
			if (!Static78.method3297(Static530.aClass25_Sub2ArrayArray5[local5][local15], arg0, arg1, arg2, arg3)) {
				Static305.method4595(Static530.aClass25_Sub2ArrayArray5[local5][local15]);
				if (Static530.aClass25_Sub2ArrayArray5[local5][local15].anInt8478 != -1) {
					Static364.aClass25_Sub2Array2[Static505.anInt8754++] = Static530.aClass25_Sub2ArrayArray5[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static154.anIntArray135[local5]; local61++) {
			if (!Static78.method3297(Static468.aClass25_Sub2ArrayArray4[local5][local61], arg0, arg1, arg2, arg3)) {
				Static305.method4595(Static468.aClass25_Sub2ArrayArray4[local5][local61]);
				if (Static468.aClass25_Sub2ArrayArray4[local5][local61].anInt8478 != -1) {
					Static263.aClass25_Sub2Array1[Static127.anInt2900++] = Static468.aClass25_Sub2ArrayArray4[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static473.anIntArray482[local5]; local107++) {
			if (!Static78.method3297(Static69.aClass25_Sub2ArrayArray3[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static69.aClass25_Sub2ArrayArray3[local5][local107].method6655()) {
					Static305.method4595(Static69.aClass25_Sub2ArrayArray3[local5][local107]);
					if (Static69.aClass25_Sub2ArrayArray3[local5][local107].anInt8478 != -1) {
						Static263.aClass25_Sub2Array1[Static127.anInt2900++] = Static69.aClass25_Sub2ArrayArray3[local5][local107];
					}
				} else {
					Static305.method4595(Static69.aClass25_Sub2ArrayArray3[local5][local107]);
					if (Static69.aClass25_Sub2ArrayArray3[local5][local107].anInt8478 != -1) {
						Static364.aClass25_Sub2Array2[Static505.anInt8754++] = Static69.aClass25_Sub2ArrayArray3[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static283.anInt5319; local190++) {
				if (!Static78.method3297(Static34.aClass25_Sub2_Sub2Array2[local190], arg0, arg1, arg2, arg3)) {
					Static305.method4595(Static34.aClass25_Sub2_Sub2Array2[local190]);
					if (Static34.aClass25_Sub2_Sub2Array2[local190].anInt8478 != -1) {
						if (Static34.aClass25_Sub2_Sub2Array2[local190].method6655()) {
							Static263.aClass25_Sub2Array1[Static127.anInt2900++] = Static34.aClass25_Sub2_Sub2Array2[local190];
						} else {
							Static364.aClass25_Sub2Array2[Static505.anInt8754++] = Static34.aClass25_Sub2_Sub2Array2[local190];
						}
					}
				}
			}
		}
		if (Static505.anInt8754 > 0) {
			Static183.method3256(Static364.aClass25_Sub2Array2, 0, Static505.anInt8754 - 1);
			for (local190 = 0; local190 < Static505.anInt8754; local190++) {
				Static5.method58(Static364.aClass25_Sub2Array2[local190]);
			}
		}
		if (Static239.aBoolean310) {
			Static68.aClass31_4.method8038(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static289.anInt5399; local190 < Static590.anInt10277; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static209.aBooleanArrayArray11.length;
				if (Static61.anInt1673 + Static209.aBooleanArrayArray11.length > Static349.anInt6237) {
					local278 -= Static61.anInt1673 + Static209.aBooleanArrayArray11.length - Static349.anInt6237;
				}
				local298 = Static209.aBooleanArrayArray11[0].length;
				if (Static439.anInt7775 + Static209.aBooleanArrayArray11[0].length > Static414.anInt7451) {
					local298 -= Static439.anInt7775 + Static209.aBooleanArrayArray11[0].length - Static414.anInt7451;
				}
				local319 = Static290.aBooleanArrayArray6;
				if (Static189.aBoolean281) {
					if (Static538.aBoolean626) {
						local319 = Static205.aBooleanArrayArrayArray1[local190];
					}
					for (local329 = Static561.anInt9766; local329 < local278; local329++) {
						local336 = local329 + Static61.anInt1673 - Static561.anInt9766;
						for (local338 = Static288.anInt5391; local338 < local298; local338++) {
							if (Static209.aBooleanArrayArray11[local329][local338] && !Static258.method4012(local336, local338 + Static439.anInt7775 - Static288.anInt5391, local190)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static538.aBoolean626) {
					Static256.aClass127Array3[local190].method7864(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static553.anInt9663; local329++) {
						Static483.aClass311Array1[local329].method6757(new Class25_Sub8(local190 + 1));
					}
				} else if (Static188.aBoolean280) {
					Static256.aClass127Array3[local190].method7869(Static261.anInt5023, Static216.anInt4499, Static219.anInt4585, Static290.aBooleanArrayArray6, true, Static330.anInt6003);
				} else {
					Static256.aClass127Array3[local190].method7864(Static261.anInt5023, Static216.anInt4499, Static219.anInt4585, Static290.aBooleanArrayArray6, true);
				}
			} else {
				local278 = Static209.aBooleanArrayArray11.length;
				if (Static61.anInt1673 + Static209.aBooleanArrayArray11.length > Static349.anInt6237) {
					local278 -= Static61.anInt1673 + Static209.aBooleanArrayArray11.length - Static349.anInt6237;
				}
				local298 = Static209.aBooleanArrayArray11[0].length;
				if (Static439.anInt7775 + Static209.aBooleanArrayArray11[0].length > Static414.anInt7451) {
					local298 -= Static439.anInt7775 + Static209.aBooleanArrayArray11[0].length - Static414.anInt7451;
				}
				local319 = Static290.aBooleanArrayArray6;
				if (Static189.aBoolean281) {
					if (Static538.aBoolean626) {
						local319 = Static205.aBooleanArrayArrayArray1[local190];
					}
					for (local329 = Static561.anInt9766; local329 < local278; local329++) {
						local336 = local329 + Static61.anInt1673 - Static561.anInt9766;
						for (local338 = Static288.anInt5391; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static209.aBooleanArrayArray11[local329][local338]) {
								@Pc(357) int local357 = local338 + Static439.anInt7775 - Static288.anInt5391;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static189.aClass333ArrayArrayArray1[local359][local336][local357] != null && Static189.aClass333ArrayArrayArray1[local359][local336][local357].aByte127 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static258.method4012(local336, local357, local190)) {
											local319[local329][local338] = true;
											break;
										}
										local319[local329][local338] = false;
										break;
									}
								}
							}
						}
					}
				}
				if (Static538.aBoolean626) {
					Static256.aClass127Array3[local190].method7864(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static553.anInt9663; local329++) {
						Static483.aClass311Array1[local329].method6757(new Class25_Sub8(local190 + 1));
					}
				} else if (Static188.aBoolean280) {
					Static256.aClass127Array3[local190].method7869(Static261.anInt5023, Static216.anInt4499, Static219.anInt4585, Static290.aBooleanArrayArray6, false, Static330.anInt6003);
				} else {
					Static256.aClass127Array3[local190].method7864(Static261.anInt5023, Static216.anInt4499, Static219.anInt4585, Static290.aBooleanArrayArray6, false);
				}
			}
		}
		if (Static127.anInt2900 > 0) {
			Static567.method4400(Static263.aClass25_Sub2Array1, 0, Static127.anInt2900 - 1);
			for (local278 = 0; local278 < Static127.anInt2900; local278++) {
				Static5.method58(Static263.aClass25_Sub2Array1[local278]);
			}
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZIII)V")
	public static void method6669(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int local6 = arg1 * Static348.aClass3_Sub51_Sub1_5.anInt9952 >> 8;
		if (arg2 == -1 && !Static168.aBoolean262) {
			Static235.method3766();
		} else if (arg2 != -1 && (arg2 != Static526.anInt9227 || !Static369.method5225()) && local6 != 0 && !Static168.aBoolean262) {
			Static261.method4017(Static320.aClass284_98, arg2, local6, arg0);
			Static115.method2284();
		}
		if (arg2 != Static526.anInt9227) {
			Static483.aClass3_Sub16_Sub3_2 = null;
		}
		Static526.anInt9227 = arg2;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(B)V")
	public static void method6671() {
		Static20.method211();
		Static348.aClass123_128 = null;
		Static269.aClass123_174 = null;
		Static83.aClass123_63 = null;
		Static507.anInt8783 = 0;
		Static170.aClass123_284 = null;
		Static42.anInt1159 = 0;
		Static402.anInt7199 = 0;
		Static455.aClass3_Sub26_Sub1_2.anInt8703 = 0;
		Static501.method6728();
		Static246.method3901();
		for (@Pc(30) int local30 = 0; local30 < 2048; local30++) {
			Static410.aClass25_Sub2_Sub2_Sub5_Sub1Array1[local30] = null;
		}
		Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1 = null;
		for (@Pc(48) int local48 = 0; local48 < Static238.anInt4737; local48++) {
			@Pc(55) Class25_Sub2_Sub2_Sub5_Sub2 local55 = Static33.aClass3_Sub39Array1[local48].aClass25_Sub2_Sub2_Sub5_Sub2_2;
			if (local55 != null) {
				local55.anInt8536 = -1;
			}
		}
		Static505.method6838();
		Static188.anInt4080 = 1;
		Static481.anInt8356 = -1;
		Static357.anInt6345 = -1;
		Static27.method293(10);
		for (@Pc(77) int local77 = 0; local77 < 100; local77++) {
			Static544.aBooleanArray32[local77] = true;
		}
		Static339.method4964();
		Static321.aClass3_Sub28_3 = null;
		Static207.aLong102 = 0L;
	}

	@OriginalMember(owner = "client!ol", name = "m", descriptor = "(I)Z")
	public static boolean method6677() {
		try {
			@Pc(7) Class21 local7 = new Class21();
			@Pc(12) byte[] local12 = local7.method217(Static295.aByteArray136);
			Static576.method7814(local12);
			return true;
		} catch (@Pc(24) Exception local24) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "n", descriptor = "(I)[Lclient!eu;")
	public static Class95[] method6681() {
		return new Class95[] { Static138.aClass95_2, Static431.aClass95_7, Static337.aClass95_5, Static418.aClass95_6, Static591.aClass95_10, Static6.aClass95_1, Static590.aClass95_9, Static549.aClass95_8, Static150.aClass95_3, Static153.aClass95_4 };
	}
}
