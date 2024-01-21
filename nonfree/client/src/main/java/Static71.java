import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray6;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "[I")
	public static int[] anIntArray216;

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "Lclient!a;")
	private static Class1 aClass1_2032 = Static94.method1596(" has logged in)3");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!a;")
	public static Class1 aClass1_2029 = aClass1_2032;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!a;")
	private static Class1 aClass1_2030 = Static94.method1596("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!a;")
	private static Class1 aClass1_2031 = Static94.method1596("Unable to connect)3");

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_2033 = aClass1_2031;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!cb;")
	public static Class11 aClass11_16 = new Class11(100);

	@OriginalMember(owner = "client!oa", name = "r", descriptor = "Lclient!a;")
	private static Class1 aClass1_2038 = Static94.method1596("Loaded config");

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2034 = aClass1_2038;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!a;")
	public static Class1 aClass1_2035 = aClass1_2030;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_2036 = aClass1_2031;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "Lclient!a;")
	public static Class1 aClass1_2037 = Static94.method1596("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
	public static int anInt1966 = 0;

	@OriginalMember(owner = "client!oa", name = "u", descriptor = "I")
	public static int anInt1968 = 0;

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "I")
	public static int anInt1970 = 2;

	@OriginalMember(owner = "client!oa", name = "y", descriptor = "Lclient!a;")
	private static Class1 aClass1_2040 = Static94.method1596("Existing user");

	@OriginalMember(owner = "client!oa", name = "x", descriptor = "Lclient!a;")
	public static Class1 aClass1_2039 = aClass1_2040;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V")
	public static void method1360(@OriginalArg(1) int arg0) {
		if (!Static113.method1524(arg0)) {
			return;
		}
		@Pc(14) Class2_Sub1_Sub14[] local14 = Static98.aClass2_Sub1_Sub14ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class2_Sub1_Sub14 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt2183 = 0;
				local22.anInt2179 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)I")
	public static int method1361(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 * 57 + arg0;
		@Pc(20) int local20 = local14 ^ local14 << 13;
		@Pc(34) int local34 = (local20 * local20 * 15731 + 789221) * local20 + 1376312589 & Integer.MAX_VALUE;
		return local34 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!bd;ZLclient!bd;I)V")
	public static void method1362(@OriginalArg(0) Class8 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8 arg2) {
		Static79.aBoolean117 = arg1;
		Static12.aClass8_26 = arg2;
		Static47.aClass8_17 = arg0;
		Static54.anInt1773 = Static47.aClass8_17.method1702(10);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ[BI)V")
	public static void method1363(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (Static8.aClass14_1 == null) {
			return;
		}
		if (Static103.anInt2605 >= 0) {
			Static7.anInt1200 = arg3;
			if (Static103.anInt2605 == 0) {
				Static53.anInt1751 = 1;
			} else {
				@Pc(39) int local39 = Static56.method1238(Static103.anInt2605);
				@Pc(43) int local43 = local39 - Static68.anInt1945;
				Static53.anInt1751 = (local43 + 3600) / arg3;
				if (Static53.anInt1751 < 1) {
					Static53.anInt1751 = 1;
				}
			}
			Static31.anInt1223 = arg0;
			Static2.aByteArray2 = arg2;
			Static57.aBoolean98 = arg1;
		} else if (Static53.anInt1751 == 0) {
			Static1.method7(arg1, arg2, arg0);
		} else {
			Static31.anInt1223 = arg0;
			Static2.aByteArray2 = arg2;
			Static57.aBoolean98 = arg1;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1364() {
		aClass1_2029 = null;
		aClass1_2037 = null;
		aClass1_2035 = null;
		aClass1_2030 = null;
		aClass1_2040 = null;
		aClass11_16 = null;
		anIntArray216 = null;
		aByteArrayArrayArray6 = null;
		aClass1_2032 = null;
		aClass1_2031 = null;
		aClass1_2038 = null;
		aClass1_2033 = null;
		aClass1_2039 = null;
		aClass1_2036 = null;
		aClass1_2034 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBI)I")
	public static int method1365(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(37) int local37 = Static6.method212(arg0 + 45365, 4, arg1 + 91923) + (Static6.method212(arg0 - -10294, 2, arg1 + 37821) - 128 >> 1) + (Static6.method212(arg0, 1, arg1) + -128 >> 2) - 128;
		local37 = (int) ((double) local37 * 0.3D) + 35;
		if (local37 < 10) {
			local37 = 10;
		} else if (local37 > 60) {
			local37 = 60;
		}
		return local37;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1366() {
		while (true) {
			if (Static13.aClass2_Sub3_Sub1_1.method833(Static83.anInt2224) >= 27) {
				@Pc(22) int local22 = Static13.aClass2_Sub3_Sub1_1.method838(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					if (Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local22] == null) {
						Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local22] = new Class2_Sub1_Sub1_Sub1_Sub2();
						local29 = true;
					}
					@Pc(45) Class2_Sub1_Sub1_Sub1_Sub2 local45 = Static101.aClass2_Sub1_Sub1_Sub1_Sub2Array1[local22];
					Static20.anIntArray89[Static44.anInt1516++] = local22;
					local45.anInt2755 = Static69.anInt2806;
					@Pc(63) int local63 = Static18.anIntArray88[Static13.aClass2_Sub3_Sub1_1.method838(3)];
					if (local29) {
						local45.anInt2741 = local63;
					}
					@Pc(73) int local73 = Static13.aClass2_Sub3_Sub1_1.method838(5);
					if (local73 > 15) {
						local73 -= 32;
					}
					@Pc(82) int local82 = Static13.aClass2_Sub3_Sub1_1.method838(5);
					@Pc(87) int local87 = Static13.aClass2_Sub3_Sub1_1.method838(1);
					if (local82 > 15) {
						local82 -= 32;
					}
					if (local87 == 1) {
						Static45.anIntArray156[Static67.anInt2767++] = local22;
					}
					@Pc(111) int local111 = Static13.aClass2_Sub3_Sub1_1.method838(1);
					local45.aClass2_Sub1_Sub7_1 = Static84.method1529(Static13.aClass2_Sub3_Sub1_1.method838(13));
					local45.anInt2753 = local45.aClass2_Sub1_Sub7_1.anInt1356;
					local45.anInt2747 = local45.aClass2_Sub1_Sub7_1.anInt1339;
					local45.anInt2714 = local45.aClass2_Sub1_Sub7_1.anInt1342;
					local45.anInt2752 = local45.aClass2_Sub1_Sub7_1.anInt1365;
					local45.anInt2722 = local45.aClass2_Sub1_Sub7_1.anInt1335;
					local45.anInt2710 = local45.aClass2_Sub1_Sub7_1.anInt1351;
					local45.anInt2762 = local45.aClass2_Sub1_Sub7_1.anInt1362;
					local45.anInt2737 = local45.aClass2_Sub1_Sub7_1.anInt1344;
					if (local45.anInt2737 == 0) {
						local45.anInt2741 = 0;
					}
					local45.anInt2706 = local45.aClass2_Sub1_Sub7_1.anInt1359;
					local45.method1786(Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray343[0] + local82, local111 == 1, Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anIntArray341[0] + local73);
					continue;
				}
			}
			Static13.aClass2_Sub3_Sub1_1.method834();
			return;
		}
	}
}
