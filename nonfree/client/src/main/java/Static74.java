import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!la;")
	public static final Class136 aClass136_38 = new Class136(21, 3);

	@OriginalMember(owner = "client!dm", name = "c", descriptor = "I")
	public static int anInt1341 = 0;

	@OriginalMember(owner = "client!dm", name = "e", descriptor = "Lclient!pw;")
	public static final Class194 aClass194_1 = new Class194();

	@OriginalMember(owner = "client!dm", name = "f", descriptor = "Z")
	public static boolean aBoolean89 = false;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method1316(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = Static271.anInt4534;
		@Pc(9) int[] local9 = Static215.anIntArray267;
		@Pc(11) boolean local11 = false;
		for (@Pc(13) int local13 = 0; local13 < local7; local13++) {
			@Pc(21) Class1_Sub2_Sub6_Sub2 local21 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local9[local13]];
			if (local21 != null && local21 != Static203.aClass1_Sub2_Sub6_Sub2_1 && local21.aString69 != null && local21.aString69.equalsIgnoreCase(arg0)) {
				local11 = true;
				if (arg1 == 1) {
					Static307.method4633(Static443.aClass163_188);
					Static243.aClass3_Sub25_Sub1_7.method4093(local9[local13]);
					Static243.aClass3_Sub25_Sub1_7.method4084(0);
				} else if (arg1 == 4) {
					Static307.method4633(Static269.aClass163_87);
					Static243.aClass3_Sub25_Sub1_7.method4106(local9[local13]);
					Static243.aClass3_Sub25_Sub1_7.method4081(0);
				} else if (arg1 == 5) {
					Static307.method4633(Static141.aClass163_68);
					Static243.aClass3_Sub25_Sub1_7.method4084(0);
					Static243.aClass3_Sub25_Sub1_7.method4077(local9[local13]);
				} else if (arg1 == 6) {
					Static307.method4633(Static93.aClass163_53);
					Static243.aClass3_Sub25_Sub1_7.method4106(local9[local13]);
					Static243.aClass3_Sub25_Sub1_7.method4081(0);
				} else if (arg1 == 7) {
					Static307.method4633(Static304.aClass163_168);
					Static243.aClass3_Sub25_Sub1_7.method4090(0);
					Static243.aClass3_Sub25_Sub1_7.method4077(local9[local13]);
				}
				break;
			}
		}
		if (!local11) {
			Static370.method5160(Static85.aClass174_57.method4208(Static300.anInt5192) + arg0);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method1317(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static460.anInt7719++;
		Static146.anInt2678 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static425.anInt2154; local7 < Static174.anInt3263; local7++) {
			@Pc(12) Class227[][] local12 = Static389.aClass227ArrayArrayArray3[local7];
			for (local14 = Static266.anInt4437; local14 < Static33.anInt605; local14++) {
				for (@Pc(17) int local17 = Static423.anInt7132; local17 < Static439.anInt7312; local17++) {
					@Pc(24) Class227 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static39.aBooleanArrayArray1[local14 + Static24.anInt2908 - Static366.anInt6203][local17 + Static24.anInt2908 - Static465.anInt3909] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean433 = true;
							local24.aBoolean435 = true;
							if (local24.aClass114_2 == null) {
								local24.aBoolean434 = false;
							} else {
								local24.aBoolean434 = true;
							}
							Static146.anInt2678++;
						} else {
							local24.aBoolean433 = false;
							local24.aBoolean435 = false;
							local24.aByte78 = 0;
							if (local14 >= Static366.anInt6203 - 16 && local14 <= Static366.anInt6203 + 16 && local17 >= Static465.anInt3909 - 16 && local17 <= Static465.anInt3909 + 16 && (local24.aClass1_Sub3_3 != null || local24.aClass1_Sub3_2 != null || local24.aClass1_Sub1_1 != null || local24.aClass1_Sub1_2 != null || local24.aClass1_Sub4_2 != null || local24.aClass114_2 != null)) {
								Static316.aClass12_1.method3105(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static349.aClass55Array3 == Static178.aClass55Array1;
		for (local14 = Static425.anInt2154; local14 < Static174.anInt3263; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static157.aClass167_7.method6024() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static39.aBooleanArrayArray1.length;
				if (Static266.anInt4437 + Static39.aBooleanArrayArray1.length > Static459.anInt5916) {
					local172 -= Static266.anInt4437 + Static39.aBooleanArrayArray1.length - Static459.anInt5916;
				}
				@Pc(192) int local192 = Static39.aBooleanArrayArray1[0].length;
				if (Static423.anInt7132 + Static39.aBooleanArrayArray1[0].length > Static342.anInt5746) {
					local192 -= Static423.anInt7132 + Static39.aBooleanArrayArray1[0].length - Static342.anInt5746;
				}
				@Pc(213) int local213 = Static246.anInt4231;
				while (true) {
					if (local213 >= local172) {
						Static316.aClass12_1.method3110(true, local161, local14, Static178.aClass55Array1[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static266.anInt4437 - Static246.anInt4231;
					for (@Pc(222) int local222 = Static192.anInt3505; local222 < local192; local222++) {
						Static111.aBooleanArrayArray4[local213][local222] = false;
						if (Static39.aBooleanArrayArray1[local213][local222]) {
							@Pc(241) int local241 = local222 + Static423.anInt7132 - Static192.anInt3505;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static389.aClass227ArrayArrayArray3[local243][local220][local241] != null && Static389.aClass227ArrayArrayArray3[local243][local220][local241].aByte81 == local14) {
									Static111.aBooleanArrayArray4[local213][local222] = Static389.aClass227ArrayArrayArray3[local243][local220][local241].aBoolean433;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static316.aClass12_1.method3110(false, local161, local14, Static178.aClass55Array1[local14]);
			}
			Static316.aClass12_1.method3111();
		}
		if (!Static320.method1164(true)) {
			Static320.method1164(false);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIBIII)Z")
	public static boolean method1318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg3 + arg7 > arg0 && arg0 + arg1 > arg3) {
			return arg4 < arg6 + arg2 && arg5 + arg4 > arg6;
		} else {
			return false;
		}
	}
}
