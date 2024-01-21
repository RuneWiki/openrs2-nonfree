import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray162;

	@OriginalMember(owner = "client!h", name = "n", descriptor = "Lclient!hc;")
	public static Class25 aClass25_20;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!ad;")
	public static Class5_Sub1 aClass5_Sub1_8;

	@OriginalMember(owner = "client!h", name = "t", descriptor = "I")
	public static int anInt840;

	@OriginalMember(owner = "client!h", name = "d", descriptor = "Lclient!ba;")
	public static Class6 aClass6_2 = new Class6(4096);

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!o;")
	public static Class40 aClass40_256 = Static13.method257("backhmid2");

	@OriginalMember(owner = "client!h", name = "f", descriptor = "Lclient!o;")
	public static Class40 aClass40_257 = Static13.method257("Malformed login packet)3");

	@OriginalMember(owner = "client!h", name = "g", descriptor = "Lclient!o;")
	public static Class40 aClass40_258 = Static13.method257("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!h", name = "l", descriptor = "[I")
	public static int[] anIntArray163 = new int[4000];

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[I")
	public static int[] anIntArray164 = new int[5];

	@OriginalMember(owner = "client!h", name = "p", descriptor = "[I")
	public static int[] anIntArray165 = new int[500];

	@OriginalMember(owner = "client!h", name = "q", descriptor = "[I")
	public static int[] anIntArray166 = new int[100];

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Z")
	public static final boolean aBoolean60 = false;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BZ)V")
	public static void method636(@OriginalArg(1) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static73.anInt1800; local12++) {
			@Pc(20) Class2_Sub2_Sub12_Sub1_Sub2 local20 = Static2.aClass2_Sub2_Sub12_Sub1_Sub2Array1[Static63.anIntArray326[local12]];
			@Pc(29) int local29 = (Static63.anIntArray326[local12] << 14) + 536870912;
			if (local20 != null && local20.method1544() && local20.aClass2_Sub2_Sub7_1.aBoolean57 == arg0 && local20.aClass2_Sub2_Sub7_1.method606()) {
				@Pc(50) int local50 = local20.anInt2275 >> 7;
				@Pc(55) int local55 = local20.anInt2284 >> 7;
				if (local50 >= 0 && local50 < 104 && local55 >= 0 && local55 < 104) {
					if (local20.anInt2278 == 1 && (local20.anInt2275 & 0x7F) == 64 && (local20.anInt2284 & 0x7F) == 64) {
						if (Static22.anInt2587 == Static14.anIntArrayArray7[local50][local55]) {
							continue;
						}
						Static14.anIntArrayArray7[local50][local55] = Static22.anInt2587;
					}
					if (!local20.aClass2_Sub2_Sub7_1.aBoolean58) {
						local29 += Integer.MIN_VALUE;
					}
					Static93.aClass55_1.method1425(Static1.anInt8, local20.anInt2275, local20.anInt2284, Static86.method1383(Static1.anInt8, local20.anInt2275, local20.anInt2284), local20.anInt2278 * 64 + 60 - 64, local20, local20.anInt2305, local29, local20.aBoolean172);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
	public static void method637() {
		for (@Pc(7) int local7 = 0; local7 < Static4.anInt131; local7++) {
			@Pc(13) int local13 = Static5.anIntArray36[local7]--;
			if (Static5.anIntArray36[local7] >= -10) {
				@Pc(72) Class43 local72 = Static75.aClass43Array1[local7];
				if (local72 == null) {
					local72 = Static112.method1214(Static35.aClass5_Sub1_7, Static96.anIntArray497[local7]);
					if (local72 == null) {
						continue;
					}
					Static5.anIntArray36[local7] += local72.method1215();
					Static75.aClass43Array1[local7] = local72;
				}
				if (Static5.anIntArray36[local7] < 0) {
					@Pc(109) Class2_Sub4_Sub1 local109 = local72.method1216().method491(Static11.aClass56_1);
					@Pc(114) Class2_Sub10_Sub1 local114 = Static111.method1032(local109, Static98.anInt2372);
					local114.method1027(Static13.anIntArray79[local7] - 1);
					Static88.aClass2_Sub10_Sub2_1.method1289(local114);
					Static5.anIntArray36[local7] = -100;
				}
			} else {
				Static4.anInt131--;
				for (@Pc(27) int local27 = local7; local27 < Static4.anInt131; local27++) {
					Static96.anIntArray497[local27] = Static96.anIntArray497[local27 + 1];
					Static75.aClass43Array1[local27] = Static75.aClass43Array1[local27 + 1];
					Static13.anIntArray79[local27] = Static13.anIntArray79[local27 + 1];
					Static5.anIntArray36[local27] = Static5.anIntArray36[local27 + 1];
				}
				local7--;
			}
		}
		if (Static20.anInt470 <= 0) {
			return;
		}
		Static20.anInt470 -= 20;
		if (Static20.anInt470 < 0) {
			Static20.anInt470 = 0;
		}
		if (Static20.anInt470 == 0 && Static7.anInt239 != 0 && Static84.anInt1977 != -1) {
			Static94.method1499(0, Static84.anInt1977, Static85.aClass5_Sub1_17, Static7.anInt239);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ud;Lclient!o;Lclient!o;)[Lclient!vb;")
	public static Class2_Sub2_Sub2_Sub4[] method638(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class40 arg2) {
		@Pc(12) int local12 = arg0.method80(arg1);
		@Pc(18) int local18 = arg0.method72(arg2, local12);
		return Static99.method79(arg0, local18, local12);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!mc;I)Z")
	public static boolean method639(@OriginalArg(0) Class2_Sub2_Sub13 arg0) {
		@Pc(6) int local6 = arg0.anInt1610;
		if (Static42.anInt1038 == 2) {
			if (local6 == 201) {
				Static61.aClass40_453 = Static12.aClass40_79;
				Static101.anInt2399 = 0;
				Static93.anInt2180 = 1;
				Static73.aBoolean144 = true;
				Static61.aClass40_447 = Static61.aClass40_445;
				Static74.aBoolean146 = true;
			}
			if (local6 == 202) {
				Static93.anInt2180 = 2;
				Static74.aBoolean146 = true;
				Static61.aClass40_447 = Static61.aClass40_445;
				Static61.aClass40_453 = Static19.aClass40_122;
				Static101.anInt2399 = 0;
				Static73.aBoolean144 = true;
			}
		}
		if (local6 == 205) {
			Static67.anInt1672 = 250;
			return true;
		}
		if (local6 == 501) {
			Static101.anInt2399 = 0;
			Static93.anInt2180 = 4;
			Static61.aClass40_453 = Static17.aClass40_113;
			Static74.aBoolean146 = true;
			Static61.aClass40_447 = Static61.aClass40_445;
			Static73.aBoolean144 = true;
		}
		if (local6 == 502) {
			Static101.anInt2399 = 0;
			Static73.aBoolean144 = true;
			Static61.aClass40_447 = Static61.aClass40_445;
			Static74.aBoolean146 = true;
			Static61.aClass40_453 = Static13.aClass40_82;
			Static93.anInt2180 = 5;
		}
		@Pc(98) int local98;
		@Pc(92) int local92;
		if (local6 >= 300 && local6 <= 313) {
			local92 = local6 & 0x1;
			local98 = (local6 - 300) / 2;
			Static38.aClass33_1.method1004(local92 == 1, local98);
		}
		if (local6 >= 314 && local6 <= 323) {
			local98 = (local6 - 314) / 2;
			local92 = local6 & 0x1;
			Static38.aClass33_1.method1009(local98, local92 == 1);
		}
		if (local6 == 324) {
			Static38.aClass33_1.method1002(false);
		}
		if (local6 == 325) {
			Static38.aClass33_1.method1002(true);
		}
		if (local6 == 326) {
			Static80.aClass2_Sub3_Sub1_4.method1736(12);
			Static38.aClass33_1.method1007(Static80.aClass2_Sub3_Sub1_4);
			return true;
		}
		if (local6 == 620) {
			Static54.aBoolean103 = !Static54.aBoolean103;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static60.method998();
			if (Static61.aClass40_448.method1169() > 0) {
				Static80.aClass2_Sub3_Sub1_4.method1736(72);
				Static80.aClass2_Sub3_Sub1_4.method1680(Static61.aClass40_448.method1179());
				Static80.aClass2_Sub3_Sub1_4.method1703(local6 - 601);
				Static80.aClass2_Sub3_Sub1_4.method1703(Static54.aBoolean103 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(II)Lclient!gb;")
	public static Class2_Sub2_Sub7 method640(@OriginalArg(1) int arg0) {
		@Pc(18) Class2_Sub2_Sub7 local18 = (Class2_Sub2_Sub7) Static61.aClass47_14.method1325((long) arg0);
		if (local18 != null) {
			return local18;
		}
		@Pc(28) byte[] local28 = Static34.aClass5_11.method68(arg0, 9);
		local18 = new Class2_Sub2_Sub7();
		local18.anInt762 = arg0;
		if (local28 != null) {
			local18.method608(new Class2_Sub3(local28));
		}
		local18.method612();
		Static61.aClass47_14.method1332((long) arg0, local18);
		return local18;
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(II)V")
	public static void method641(@OriginalArg(1) int arg0) {
		if (!Static70.method1110()) {
			return;
		}
		if (Static15.aBoolean151) {
			Static70.anInt1696 = arg0;
		} else {
			Static35.method632(arg0);
		}
	}

	@OriginalMember(owner = "client!h", name = "b", descriptor = "(B)V")
	public static void method642() {
		aClass25_20 = null;
		aClass40_258 = null;
		aClass5_Sub1_8 = null;
		aClass40_256 = null;
		anIntArray162 = null;
		anIntArray164 = null;
		anIntArray166 = null;
		aClass40_257 = null;
		aClass6_2 = null;
		anIntArray163 = null;
		anIntArray165 = null;
	}
}
