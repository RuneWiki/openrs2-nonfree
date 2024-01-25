import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
	public static int anInt1283;

	@OriginalMember(owner = "client!cu", name = "q", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method1238(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static422.anInt7927 = 0;
		Static106.anInt2410 = 0;
		Static431.anInt8105++;
		for (@Pc(15) int local15 = 0; local15 < Static156.anIntArray148[local5]; local15++) {
			if (!Static53.method686(Static124.aClass1_Sub4ArrayArray4[local5][local15], arg0, arg1, arg2, arg3)) {
				Static180.method3233(Static124.aClass1_Sub4ArrayArray4[local5][local15]);
				if (Static124.aClass1_Sub4ArrayArray4[local5][local15].anInt9938 != -1) {
					Static321.aClass1_Sub4Array2[Static422.anInt7927++] = Static124.aClass1_Sub4ArrayArray4[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static291.anIntArray291[local5]; local61++) {
			if (!Static53.method686(Static343.aClass1_Sub4ArrayArray3[local5][local61], arg0, arg1, arg2, arg3)) {
				Static180.method3233(Static343.aClass1_Sub4ArrayArray3[local5][local61]);
				if (Static343.aClass1_Sub4ArrayArray3[local5][local61].anInt9938 != -1) {
					Static158.aClass1_Sub4Array1[Static106.anInt2410++] = Static343.aClass1_Sub4ArrayArray3[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static2.anIntArray3[local5]; local107++) {
			if (!Static53.method686(Static27.aClass1_Sub4ArrayArray1[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static27.aClass1_Sub4ArrayArray1[local5][local107].method8128()) {
					Static180.method3233(Static27.aClass1_Sub4ArrayArray1[local5][local107]);
					if (Static27.aClass1_Sub4ArrayArray1[local5][local107].anInt9938 != -1) {
						Static158.aClass1_Sub4Array1[Static106.anInt2410++] = Static27.aClass1_Sub4ArrayArray1[local5][local107];
					}
				} else {
					Static180.method3233(Static27.aClass1_Sub4ArrayArray1[local5][local107]);
					if (Static27.aClass1_Sub4ArrayArray1[local5][local107].anInt9938 != -1) {
						Static321.aClass1_Sub4Array2[Static422.anInt7927++] = Static27.aClass1_Sub4ArrayArray1[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static375.anInt7259; local190++) {
				if (!Static53.method686(Static384.aClass1_Sub4_Sub2Array1[local190], arg0, arg1, arg2, arg3)) {
					Static180.method3233(Static384.aClass1_Sub4_Sub2Array1[local190]);
					if (Static384.aClass1_Sub4_Sub2Array1[local190].anInt9938 != -1) {
						if (Static384.aClass1_Sub4_Sub2Array1[local190].method8128()) {
							Static158.aClass1_Sub4Array1[Static106.anInt2410++] = Static384.aClass1_Sub4_Sub2Array1[local190];
						} else {
							Static321.aClass1_Sub4Array2[Static422.anInt7927++] = Static384.aClass1_Sub4_Sub2Array1[local190];
						}
					}
				}
			}
		}
		if (Static422.anInt7927 > 0) {
			Static340.method5550(Static321.aClass1_Sub4Array2, 0, Static422.anInt7927 - 1);
			for (local190 = 0; local190 < Static422.anInt7927; local190++) {
				Static310.method5263(Static321.aClass1_Sub4Array2[local190]);
			}
		}
		if (Static541.aBoolean678) {
			Static468.aClass44_7.method5000(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static381.anInt7743; local190 < Static345.anInt6662; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static522.aBooleanArrayArray18.length;
				if (Static354.anInt6889 + Static522.aBooleanArrayArray18.length > Static182.anInt3633) {
					local278 -= Static354.anInt6889 + Static522.aBooleanArrayArray18.length - Static182.anInt3633;
				}
				local298 = Static522.aBooleanArrayArray18[0].length;
				if (Static309.anInt6179 + Static522.aBooleanArrayArray18[0].length > Static253.anInt4651) {
					local298 -= Static309.anInt6179 + Static522.aBooleanArrayArray18[0].length - Static253.anInt4651;
				}
				local319 = Static593.aBooleanArrayArray16;
				if (Static516.aBoolean643) {
					if (Static175.aBoolean289) {
						local319 = Static320.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static49.anInt690; local329 < local278; local329++) {
						local336 = local329 + Static354.anInt6889 - Static49.anInt690;
						for (local338 = Static397.anInt7610; local338 < local298; local338++) {
							if (Static522.aBooleanArrayArray18[local329][local338] && !Static181.method3235(local338 + Static309.anInt6179 - Static397.anInt7610, local190, local336)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static175.aBoolean289) {
					Static499.aClass83Array3[local190].method7216(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static468.anInt2399; local329++) {
						Static526.aClass124Array2[local329].method3120(new Class1_Sub7(local190 + 1));
					}
				} else if (Static68.aBoolean55) {
					Static499.aClass83Array3[local190].method7215(Static26.anInt403, Static528.anInt9392, Static579.anInt10075, Static593.aBooleanArrayArray16, true, Static368.anInt7168);
				} else {
					Static499.aClass83Array3[local190].method7216(Static26.anInt403, Static528.anInt9392, Static579.anInt10075, Static593.aBooleanArrayArray16, true);
				}
			} else {
				local278 = Static522.aBooleanArrayArray18.length;
				if (Static354.anInt6889 + Static522.aBooleanArrayArray18.length > Static182.anInt3633) {
					local278 -= Static354.anInt6889 + Static522.aBooleanArrayArray18.length - Static182.anInt3633;
				}
				local298 = Static522.aBooleanArrayArray18[0].length;
				if (Static309.anInt6179 + Static522.aBooleanArrayArray18[0].length > Static253.anInt4651) {
					local298 -= Static309.anInt6179 + Static522.aBooleanArrayArray18[0].length - Static253.anInt4651;
				}
				local319 = Static593.aBooleanArrayArray16;
				if (Static516.aBoolean643) {
					if (Static175.aBoolean289) {
						local319 = Static320.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static49.anInt690; local329 < local278; local329++) {
						local336 = local329 + Static354.anInt6889 - Static49.anInt690;
						for (local338 = Static397.anInt7610; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static522.aBooleanArrayArray18[local329][local338]) {
								@Pc(357) int local357 = local338 + Static309.anInt6179 - Static397.anInt7610;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static60.aClass53ArrayArrayArray1[local359][local336][local357] != null && Static60.aClass53ArrayArrayArray1[local359][local336][local357].aByte13 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static181.method3235(local357, local190, local336)) {
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
				if (Static175.aBoolean289) {
					Static499.aClass83Array3[local190].method7216(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static468.anInt2399; local329++) {
						Static526.aClass124Array2[local329].method3120(new Class1_Sub7(local190 + 1));
					}
				} else if (Static68.aBoolean55) {
					Static499.aClass83Array3[local190].method7215(Static26.anInt403, Static528.anInt9392, Static579.anInt10075, Static593.aBooleanArrayArray16, false, Static368.anInt7168);
				} else {
					Static499.aClass83Array3[local190].method7216(Static26.anInt403, Static528.anInt9392, Static579.anInt10075, Static593.aBooleanArrayArray16, false);
				}
			}
		}
		if (Static106.anInt2410 > 0) {
			Static164.method2976(Static158.aClass1_Sub4Array1, 0, Static106.anInt2410 - 1);
			for (local278 = 0; local278 < Static106.anInt2410; local278++) {
				Static310.method5263(Static158.aClass1_Sub4Array1[local278]);
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
	public static int method1242() {
		@Pc(7) Class44 local7 = Static440.aClass44_12;
		@Pc(9) boolean local9 = false;
		if (Static495.anInt9000 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static441.method4987(0, null, local18, 0, null);
			local9 = true;
		}
		@Pc(35) long local35 = Static574.method8210();
		for (@Pc(45) int local45 = 0; local45 < 10000; local45++) {
			local7.method4998();
		}
		@Pc(70) int local70 = (int) (Static574.method8210() - local35);
		local7.method5006(0, 100, 0, -16777216, 100);
		if (local9) {
			local7.method5033();
		}
		return local70;
	}
}
