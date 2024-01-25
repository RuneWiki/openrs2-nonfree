import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "Lclient!vj;")
	public static Class58 aClass58_15;

	@OriginalMember(owner = "client!hg", name = "v", descriptor = "Lclient!tj;")
	public static Class193 aClass193_41;

	@OriginalMember(owner = "client!hg", name = "x", descriptor = "Lclient!t;")
	public static Class189 aClass189_4;

	@OriginalMember(owner = "client!hg", name = "p", descriptor = "Z")
	public static final boolean aBoolean201 = false;

	@OriginalMember(owner = "client!hg", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString26 = "";

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method2451(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static218.anInt4453++;
		Static189.anInt3960 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static346.anInt6569; local7 < Static327.anInt6252; local7++) {
			@Pc(12) Class128[][] local12 = Static273.aClass128ArrayArrayArray4[local7];
			for (local14 = Static22.anInt442; local14 < Static17.anInt349; local14++) {
				for (@Pc(17) int local17 = Static342.anInt6527; local17 < Static91.anInt5895; local17++) {
					@Pc(24) Class128 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static339.aBooleanArrayArray2[local14 + Static328.anInt6272 - Static61.anInt1578][local17 + Static328.anInt6272 - Static246.anInt5043] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean309 = true;
							local24.aBoolean308 = true;
							if (local24.aClass117_2 == null) {
								local24.aBoolean310 = false;
							} else {
								local24.aBoolean310 = true;
							}
							Static189.anInt3960++;
						} else {
							local24.aBoolean309 = false;
							local24.aBoolean308 = false;
							local24.aByte48 = 0;
							if (local14 >= Static61.anInt1578 - 16 && local14 <= Static61.anInt1578 + 16 && local17 >= Static246.anInt5043 - 16 && local17 <= Static246.anInt5043 + 16 && (local24.aClass8_Sub4_1 != null || local24.aClass8_Sub4_2 != null || local24.aClass8_Sub2_1 != null || local24.aClass8_Sub2_2 != null || local24.aClass8_Sub5_1 != null || local24.aClass117_2 != null)) {
								Static57.aClass45_1.method3947(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static77.aClass60Array1 == Static261.aClass60Array2;
		for (local14 = Static346.anInt6569; local14 < Static327.anInt6252; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static170.aClass47_5.method2712() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static339.aBooleanArrayArray2.length;
				if (Static22.anInt442 + Static339.aBooleanArrayArray2.length > Static198.anInt4128) {
					local172 -= Static22.anInt442 + Static339.aBooleanArrayArray2.length - Static198.anInt4128;
				}
				@Pc(192) int local192 = Static339.aBooleanArrayArray2[0].length;
				if (Static342.anInt6527 + Static339.aBooleanArrayArray2[0].length > Static15.anInt1162) {
					local192 -= Static342.anInt6527 + Static339.aBooleanArrayArray2[0].length - Static15.anInt1162;
				}
				@Pc(213) int local213 = Static268.anInt5370;
				while (true) {
					if (local213 >= local172) {
						Static57.aClass45_1.method3945(local161, local14, true, Static261.aClass60Array2[local14]);
						break;
					}
					@Pc(220) int local220 = local213 + Static22.anInt442 - Static268.anInt5370;
					for (@Pc(222) int local222 = Static149.anInt3924; local222 < local192; local222++) {
						Static229.aBooleanArrayArray6[local213][local222] = false;
						if (Static339.aBooleanArrayArray2[local213][local222]) {
							@Pc(241) int local241 = local222 + Static342.anInt6527 - Static149.anInt3924;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static273.aClass128ArrayArrayArray4[local243][local220][local241] != null && Static273.aClass128ArrayArrayArray4[local243][local220][local241].aByte49 == local14) {
									Static229.aBooleanArrayArray6[local213][local222] = Static273.aClass128ArrayArrayArray4[local243][local220][local241].aBoolean309;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static57.aClass45_1.method3945(local161, local14, false, Static261.aClass60Array2[local14]);
			}
			Static57.aClass45_1.method3950();
		}
		if (!Static15.method871(true)) {
			Static15.method871(false);
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BLclient!vq;)V")
	public static void method2452(@OriginalArg(1) Class47 arg0) {
		@Pc(12) int local12 = Static70.anInt1838;
		@Pc(14) int local14 = Static127.anInt3018;
		@Pc(16) int local16 = Static302.anInt5773;
		@Pc(18) int local18 = Static184.anInt3880;
		arg0.method2687(local12, -10660793, local16, local14, local18);
		arg0.method2687(local12 + 1, -16777216, local16 + -2, local14 + 1, 16);
		arg0.method2727(local14 + 18, local18 + -19, local16 - 2, -16777216, local12 + 1);
		Static282.aClass51_4.method4237(-10660793, -1, local12 + 3, Static212.aClass159_150.method4311(Static180.anInt3835), local14 + 14);
		@Pc(77) int local77 = Static258.aClass127_1.method3588();
		@Pc(81) int local81 = Static258.aClass127_1.method3595();
		@Pc(83) int local83 = 0;
		for (@Pc(88) Class4_Sub39 local88 = (Class4_Sub39) Static58.aClass116_7.method3270(); local88 != null; local88 = (Class4_Sub39) Static58.aClass116_7.method3272()) {
			@Pc(103) int local103 = local14 + (-local83 + -1 + Static105.anInt2645) * 16 + 31;
			@Pc(105) short local105 = -1;
			if (local12 < local77 && local16 + local12 > local77 && local81 > local103 - 13 && local103 + 3 > local81) {
				local105 = -256;
			}
			@Pc(135) int[] local135 = null;
			if (Static152.method3020(local88.anInt5716)) {
				local135 = Static177.method3465((int) local88.aLong184).anIntArray496;
			} else if (Static304.method4987(local88.anInt5716)) {
				@Pc(159) Class8_Sub1_Sub2_Sub2 local159 = Static169.aClass8_Sub1_Sub2_Sub2Array1[(int) local88.aLong184];
				if (local159 != null) {
					local135 = local159.aClass141_1.anIntArray377;
				}
			} else if (Static183.method3518(local88.anInt5716)) {
				if (local88.anInt5716 == 1004) {
					local135 = Static113.method2380((int) local88.aLong184).anIntArray21;
				} else {
					local135 = Static113.method2380((int) (local88.aLong184 >>> 32 & 0x7FFFFFFFL)).anIntArray21;
				}
			}
			@Pc(200) String local200 = Static218.method3959(local88);
			if (local135 != null) {
				local200 = local200 + Static184.method3524(local135);
			}
			Static282.aClass51_4.method4235(local103, local12 + 3, Static312.anIntArray475, Static225.aClass58Array87, local105, local200);
			local83++;
		}
		Static1.method4523(Static70.anInt1838, Static302.anInt5773, Static127.anInt3018, Static184.anInt3880);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BI)V")
	public static void method2454(@OriginalArg(1) int arg0) {
		Static289.anInt5645 = arg0;
		Static273.anInt5435 = 100;
		Static33.anInt820 = 3;
		Static138.anInt2999 = -1;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
	public static void method2455(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub29 local10 = (Class4_Sub29) Static292.aClass116_43.method3270(); local10 != null; local10 = (Class4_Sub29) Static292.aClass116_43.method3272()) {
			Static16.method293(arg3, arg1, local10, arg2, arg0);
		}
		for (@Pc(35) Class4_Sub29 local35 = (Class4_Sub29) Static114.aClass116_14.method3270(); local35 != null; local35 = (Class4_Sub29) Static114.aClass116_14.method3272()) {
			@Pc(39) byte local39 = 1;
			@Pc(44) Class40 local44 = local35.aClass8_Sub1_Sub2_Sub2_1.method4347();
			if (local35.aClass8_Sub1_Sub2_Sub2_1.aBoolean371) {
				local39 = 0;
			} else if (local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 == local44.anInt1443 || local44.anInt1450 == local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 || local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 == local44.anInt1452 || local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 == local44.anInt1466) {
				local39 = 2;
			} else if (local44.anInt1472 == local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 || local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 == local44.anInt1461 || local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 == local44.anInt1438 || local35.aClass8_Sub1_Sub2_Sub2_1.anInt4937 == local44.anInt1478) {
				local39 = 3;
			}
			if (local35.anInt4316 != local39) {
				@Pc(143) int local143 = Static232.method4120(local35.aClass8_Sub1_Sub2_Sub2_1);
				if (local143 != local35.anInt4304) {
					if (local35.aClass4_Sub1_Sub1_1 != null) {
						Static196.aClass4_Sub1_Sub3_3.method3510(local35.aClass4_Sub1_Sub1_1);
						local35.aClass4_Sub1_Sub1_1 = null;
					}
					local35.anInt4304 = local143;
				}
				local35.anInt4316 = local39;
			}
			local35.anInt4300 = local35.aClass8_Sub1_Sub2_Sub2_1.anInt6701;
			local35.anInt4299 = local35.aClass8_Sub1_Sub2_Sub2_1.anInt6701 + local35.aClass8_Sub1_Sub2_Sub2_1.method4349() * 64;
			local35.anInt4306 = local35.aClass8_Sub1_Sub2_Sub2_1.anInt6702;
			local35.anInt4313 = local35.aClass8_Sub1_Sub2_Sub2_1.anInt6702 + local35.aClass8_Sub1_Sub2_Sub2_1.method4349() * 64;
			Static16.method293(arg3, arg1, local35, arg2, arg0);
		}
		for (@Pc(216) Class4_Sub29 local216 = (Class4_Sub29) Static74.aClass43_11.method1283(); local216 != null; local216 = (Class4_Sub29) Static74.aClass43_11.method1278()) {
			@Pc(220) byte local220 = 1;
			@Pc(225) Class40 local225 = local216.aClass8_Sub1_Sub2_Sub1_2.method4347();
			if (local216.aClass8_Sub1_Sub2_Sub1_2.aBoolean371) {
				local220 = 0;
			} else if (local225.anInt1443 == local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 || local225.anInt1450 == local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 || local225.anInt1452 == local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 || local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 == local225.anInt1466) {
				local220 = 2;
			} else if (local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 == local225.anInt1472 || local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 == local225.anInt1461 || local225.anInt1438 == local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 || local216.aClass8_Sub1_Sub2_Sub1_2.anInt4937 == local225.anInt1478) {
				local220 = 3;
			}
			if (local216.anInt4316 != local220) {
				@Pc(312) int local312 = Static310.method5113(local216.aClass8_Sub1_Sub2_Sub1_2);
				if (local216.anInt4304 != local312) {
					if (local216.aClass4_Sub1_Sub1_1 != null) {
						Static196.aClass4_Sub1_Sub3_3.method3510(local216.aClass4_Sub1_Sub1_1);
						local216.aClass4_Sub1_Sub1_1 = null;
					}
					local216.anInt4304 = local312;
				}
				local216.anInt4316 = local220;
			}
			local216.anInt4300 = local216.aClass8_Sub1_Sub2_Sub1_2.anInt6701;
			local216.anInt4299 = local216.aClass8_Sub1_Sub2_Sub1_2.anInt6701 + local216.aClass8_Sub1_Sub2_Sub1_2.method4349() * 64;
			local216.anInt4306 = local216.aClass8_Sub1_Sub2_Sub1_2.anInt6702;
			local216.anInt4313 = local216.aClass8_Sub1_Sub2_Sub1_2.anInt6702 + local216.aClass8_Sub1_Sub2_Sub1_2.method4349() * 64;
			Static16.method293(arg3, arg1, local216, arg2, arg0);
		}
	}
}
