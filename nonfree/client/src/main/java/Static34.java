import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!hc;")
	public static Class25 aClass25_20;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_8;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BZ)V", line = 6)
	public static void method636(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Class41.anInt1800; local12++) {
			@Pc(20) Class2_Sub2_Sub12_Sub1_Sub2 local20 = Class3.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Class2_Sub2_Sub13.anIntArray326[local12]];
			@Pc(29) int local29 = (Class2_Sub2_Sub13.anIntArray326[local12] << 14) + 536870912;
			if (local20 != null && local20.method1544() && local20.aClass2_Sub2_Sub7_1.aBoolean57 == arg0 && local20.aClass2_Sub2_Sub7_1.method606()) {
				@Pc(50) int local50 = local20.anInt2275 >> 7;
				@Pc(55) int local55 = local20.anInt2284 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local20.anInt2278 == 1 && (local20.anInt2275 & 0x7F) == 64 && (local20.anInt2284 & 0x7F) == 64) {
						if (Class2_Sub3.anInt2587 == RuntimeException_Sub1.anIntArrayArray7[local50][local55]) {
							continue;
						}
						RuntimeException_Sub1.anIntArrayArray7[local50][local55] = Class2_Sub3.anInt2587;
					}
					if (!local20.aClass2_Sub2_Sub7_1.aBoolean58) {
						local29 += Integer.MIN_VALUE;
					}
					Static85.aClass55_1.method1425(Static1.anInt8, local20.anInt2275, local20.anInt2284, Static78.method1383(Static1.anInt8, local20.anInt2275, local20.anInt2284), local20.anInt2278 * 64 + 60 - 64, local20, local20.anInt2305, local29, local20.aBoolean172);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V", line = 56)
	public static void method637() {
		for (@Pc(7) int local7 = 0; local7 < Class5_Sub1.anInt131; local7++) {
			@Pc(13) int local13 = Class2_Sub2_Sub1.anIntArray36[local7]--;
			if (Class2_Sub2_Sub1.anIntArray36[local7] >= -10) {
				@Pc(72) Class43 local72 = Class44.aClass43Array1[local7];
				if (local72 == null) {
					local72 = Static110.method1214(Static33.aClass5_Sub1_7, Class2_Sub2_Sub12_Sub1_Sub2.anIntArray497[local7]);
					if (local72 == null) {
						continue;
					}
					Class2_Sub2_Sub1.anIntArray36[local7] += local72.method1215();
					Class44.aClass43Array1[local7] = local72;
				}
				if (Class2_Sub2_Sub1.anIntArray36[local7] < 0) {
					@Pc(109) Class2_Sub4_Sub1 local109 = local72.method1216().method491(Static10.aClass56_1);
					@Pc(114) Class2_Sub10_Sub1 local114 = Static108.method1032(local109, Class60.anInt2372);
					local114.method1027(Class11.anIntArray79[local7] - 1);
					Static80.aClass2_Sub10_Sub2_1.method1289(local114);
					Class2_Sub2_Sub1.anIntArray36[local7] = -100;
				}
			} else {
				Class5_Sub1.anInt131--;
				for (@Pc(27) int local27 = local7; local27 < Class5_Sub1.anInt131; local27++) {
					Class2_Sub2_Sub12_Sub1_Sub2.anIntArray497[local27] = Class2_Sub2_Sub12_Sub1_Sub2.anIntArray497[local27 + 1];
					Class44.aClass43Array1[local27] = Class44.aClass43Array1[local27 + 1];
					Class11.anIntArray79[local27] = Class11.anIntArray79[local27 + 1];
					Class2_Sub2_Sub1.anIntArray36[local27] = Class2_Sub2_Sub1.anIntArray36[local27 + 1];
				}
				local7--;
			}
		}
		if (Class18_Sub1.anInt470 <= 0) {
			return;
		}
		Class18_Sub1.anInt470 -= 20;
		if (Class18_Sub1.anInt470 < 0) {
			Class18_Sub1.anInt470 = 0;
		}
		if (Class18_Sub1.anInt470 == 0 && Class6.anInt239 != 0 && Class52.anInt1977 != -1) {
			Static86.method1499(0, Class52.anInt1977, Static77.aClass5_Sub1_17, Class6.anInt239);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ud;Lclient!o;Lclient!o;)[Lclient!vb;", line = 155)
	public static Class2_Sub2_Sub2_Sub4[] method638(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(12) int local12 = arg0.method80(arg1);
		@Pc(18) int local18 = arg0.method72(arg2, local12);
		return Static91.method79(arg0, local18, local12);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mc;I)Z", line = 173)
	public static boolean method639(@OriginalArg(0) Class2_Sub2_Sub13 arg0) {
		@Pc(6) int local6 = arg0.anInt1610;
		if (Class2_Sub2_Sub10.anInt1038 == 2) {
			if (local6 == 201) {
				Class34.aClass40_453 = Class2_Sub2_Sub3.aClass40_79;
				Class61.anInt2399 = 0;
				Class58.anInt2180 = 1;
				Class41.aBoolean144 = true;
				Class34.aClass40_447 = Class34.aClass40_445;
				Class42.aBoolean146 = true;
			}
			if (local6 == 202) {
				Class58.anInt2180 = 2;
				Class42.aBoolean146 = true;
				Class34.aClass40_447 = Class34.aClass40_445;
				Class34.aClass40_453 = Class17.aClass40_122;
				Class61.anInt2399 = 0;
				Class41.aBoolean144 = true;
			}
		}
		if (local6 == 205) {
			Class38.anInt1672 = 250;
			return true;
		}
		if (local6 == 501) {
			Class61.anInt2399 = 0;
			Class58.anInt2180 = 4;
			Class34.aClass40_453 = Class14.aClass40_113;
			Class42.aBoolean146 = true;
			Class34.aClass40_447 = Class34.aClass40_445;
			Class41.aBoolean144 = true;
		}
		if (local6 == 502) {
			Class61.anInt2399 = 0;
			Class41.aBoolean144 = true;
			Class34.aClass40_447 = Class34.aClass40_445;
			Class42.aBoolean146 = true;
			Class34.aClass40_453 = Class11.aClass40_82;
			Class58.anInt2180 = 5;
		}
		@Pc(98) int local98;
		@Pc(92) int local92;
		if (local6 >= 300 && local6 <= 313) {
			local92 = local6 & 0x1;
			local98 = (local6 - 300) / 2;
			Class25.aClass33_1.method1004(local92 == 1, local98);
		}
		if (local6 >= 314 && local6 <= 323) {
			local98 = (local6 - 314) / 2;
			local92 = local6 & 0x1;
			Class25.aClass33_1.method1009(local98, local92 == 1);
		}
		if (local6 == 324) {
			Class25.aClass33_1.method1002(false);
		}
		if (local6 == 325) {
			Class25.aClass33_1.method1002(true);
		}
		if (local6 == 326) {
			Class47.aClass2_Sub3_Sub1_4.method1736(12);
			Class25.aClass33_1.method1007(Class47.aClass2_Sub3_Sub1_4);
			return true;
		}
		if (local6 == 620) {
			Class2_Sub2_Sub12_Sub1_Sub1.aBoolean103 = !Class2_Sub2_Sub12_Sub1_Sub1.aBoolean103;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static55.method998();
			if (Class34.aClass40_448.method1169() > 0) {
				Class47.aClass2_Sub3_Sub1_4.method1736(72);
				Class47.aClass2_Sub3_Sub1_4.method1680(Class34.aClass40_448.method1179());
				Class47.aClass2_Sub3_Sub1_4.method1703(local6 - 601);
				Class47.aClass2_Sub3_Sub1_4.method1703(Class2_Sub2_Sub12_Sub1_Sub1.aBoolean103 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!gb;", line = 295)
	public static Class2_Sub2_Sub7 method640(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub7 local18 = (Class2_Sub2_Sub7) Class34.aClass47_14.method1325((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static32.aClass5_11.method68(arg0, 9);
		local18 = new Class2_Sub2_Sub7();
		local18.anInt762 = arg0;
		if (local28 != null) {
			local18.method608(new Class2_Sub3(local28));
		}
		local18.method612();
		Class34.aClass47_14.method1332((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V", line = 323)
	public static void method641(@OriginalArg(1) int arg0) {
		if (!Static64.method1110()) {
			return;
		}
		if (Class12_Sub1.aBoolean151) {
			Static64.anInt1696 = arg0;
		} else {
			Static33.method632(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V", line = 349)
	public static void method642() {
		aClass25_20 = null;
		Class23.aClass40_258 = null;
		aClass5_Sub1_8 = null;
		Class23.aClass40_256 = null;
		anIntArray162 = null;
		Class23.anIntArray164 = null;
		Class23.anIntArray166 = null;
		Class23.aClass40_257 = null;
		Class23.aClass6_2 = null;
		Class23.anIntArray163 = null;
		Class23.anIntArray165 = null;
	}
}
