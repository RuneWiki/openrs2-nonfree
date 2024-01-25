import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array10;

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
	public static int anInt4206;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString171 = "glow3:";

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "Ljava/lang/String;")
	public static String aString172 = "";

	@OriginalMember(owner = "client!nm", name = "T", descriptor = "I")
	public static int anInt4208 = 255;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
	public static void method3871() {
		Static267.aClass140_139.method3819();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZILclient!rg;)I")
	public static int method3872(@OriginalArg(1) int arg0, @OriginalArg(2) Class177 arg1) {
		if (arg1.anIntArrayArray53 == null || arg1.anIntArrayArray53.length <= arg0) {
			return -2;
		}
		try {
			@Pc(25) int[] local25 = arg1.anIntArrayArray53[arg0];
			@Pc(27) int local27 = 0;
			@Pc(29) int local29 = 0;
			@Pc(31) byte local31 = 0;
			while (true) {
				@Pc(36) int local36 = local25[local29++];
				@Pc(38) int local38 = 0;
				@Pc(40) byte local40 = 0;
				if (local36 == 0) {
					return local27;
				}
				if (local36 == 1) {
					local38 = Static333.anIntArray595[local25[local29++]];
				}
				if (local36 == 2) {
					local38 = Static343.anIntArray624[local25[local29++]];
				}
				if (local36 == 3) {
					local38 = Static291.anIntArray712[local25[local29++]];
				}
				@Pc(87) int local87;
				@Pc(98) Class177 local98;
				@Pc(103) int local103;
				@Pc(116) int local116;
				if (local36 == 4) {
					local87 = local25[local29++] << 16;
					@Pc(94) int local94 = local87 + local25[local29++];
					local98 = Static140.method2694(local94);
					local103 = local25[local29++];
					if (local103 != -1 && (!Static241.method4285(local103).aBoolean159 || Static220.aBoolean369)) {
						for (local116 = 0; local116 < local98.anIntArray668.length; local116++) {
							if (local103 + 1 == local98.anIntArray668[local116]) {
								local38 += local98.anIntArray667[local116];
							}
						}
					}
				}
				if (local36 == 5) {
					local38 = Static197.anIntArray793[local25[local29++]];
				}
				if (local36 == 6) {
					local38 = Class72.anIntArray260[Static343.anIntArray624[local25[local29++]] - 1];
				}
				if (local36 == 7) {
					local38 = Static197.anIntArray793[local25[local29++]] * 100 / 46875;
				}
				if (local36 == 8) {
					local38 = Static130.aClass5_Sub3_Sub3_Sub1_1.anInt3330;
				}
				if (local36 == 9) {
					for (local87 = 0; local87 < 25; local87++) {
						if (Static272.aBooleanArray28[local87]) {
							local38 += Static343.anIntArray624[local87];
						}
					}
				}
				if (local36 == 10) {
					local87 = local25[local29++] << 16;
					local87 += local25[local29++];
					local98 = Static140.method2694(local87);
					local103 = local25[local29++];
					if (local103 != -1 && (!Static241.method4285(local103).aBoolean159 || Static220.aBoolean369)) {
						for (local116 = 0; local116 < local98.anIntArray668.length; local116++) {
							if (local98.anIntArray668[local116] == local103 + 1) {
								local38 = 999999999;
								break;
							}
						}
					}
				}
				if (local36 == 11) {
					local38 = Static283.anInt5493;
				}
				if (local36 == 12) {
					local38 = Static186.anInt3867;
				}
				if (local36 == 13) {
					local87 = Static197.anIntArray793[local25[local29++]];
					@Pc(301) int local301 = local25[local29++];
					local38 = (local87 & 0x1 << local301) == 0 ? 0 : 1;
				}
				if (local36 == 14) {
					local87 = local25[local29++];
					local38 = Static323.method5414(local87);
				}
				if (local36 == 15) {
					local40 = 1;
				}
				if (local36 == 16) {
					local40 = 2;
				}
				if (local36 == 18) {
					local38 = Static182.anInt3775 + (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 >> 7);
				}
				if (local36 == 17) {
					local40 = 3;
				}
				if (local36 == 19) {
					local38 = (Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 >> 7) + Static161.anInt3315;
				}
				if (local36 == 20) {
					local38 = local25[local29++];
				}
				if (local40 == 0) {
					if (local31 == 0) {
						local27 += local38;
					}
					if (local31 == 1) {
						local27 -= local38;
					}
					if (local31 == 2 && local38 != 0) {
						local27 /= local38;
					}
					if (local31 == 3) {
						local27 *= local38;
					}
					local31 = 0;
				} else {
					local31 = local40;
				}
			}
		} catch (@Pc(416) Exception local416) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZB)V")
	public static void method3873(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static100.anInt2086 != -1) {
				Static300.method5114(Static100.anInt2086);
			}
			for (@Pc(15) Class1_Sub9 local15 = (Class1_Sub9) Static348.aClass26_20.method871(); local15 != null; local15 = (Class1_Sub9) Static348.aClass26_20.method878()) {
				if (!local15.method5711()) {
					local15 = (Class1_Sub9) Static348.aClass26_20.method871();
					if (local15 == null) {
						break;
					}
				}
				Static125.method2404(local15, false, true);
			}
			Static100.anInt2086 = -1;
			Static348.aClass26_20 = new Class26(8);
			Static158.method2982();
			Static100.anInt2086 = Static317.anInt6091;
			Static16.method370(false);
			Static228.method4134();
			Static98.method1798(Static100.anInt2086);
		}
		Static320.method5375();
		Static177.anInt3670 = -1;
		Static129.method2436(Static147.anInt2901);
		Static130.aClass5_Sub3_Sub3_Sub1_1 = new Class5_Sub3_Sub3_Sub1();
		Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050 = 6656;
		Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047 = 6656;
		Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] = 52;
		Static164.anInt3425 = 0;
		Static221.anInt4363 = 0;
		Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0] = 52;
		if (Static81.anInt1609 == 2) {
			Static164.anInt3425 = Static231.anInt4532 << 7;
			Static221.anInt4363 = Static93.anInt1786 << 7;
		} else {
			Static245.method4331();
		}
		Static190.method3667();
		if (Static221.anInt4363 == 0 || Static164.anInt3425 == 0) {
			Static72.method1427(10);
		} else {
			Static227.method4128();
			Static72.method1427(28);
		}
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(B)V")
	public static void method3874() {
		Static72.method1427(25);
		Static3.method170();
		System.gc();
	}
}
