import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!we;")
	public static Class62 aClass62_3;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "Lclient!na;")
	private static Class53 aClass53_267 = Static109.method1737("Offline");

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_265 = aClass53_267;

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
	public static int anInt706 = 99;

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_266 = Static109.method1737("(U4");

	@OriginalMember(owner = "client!dc", name = "m", descriptor = "Lclient!na;")
	public static Class53 aClass53_268 = Static109.method1737("FULL");

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	public static final int anInt712 = 20;

	@OriginalMember(owner = "client!dc", name = "p", descriptor = "[J")
	public static long[] aLongArray3 = new long[32];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method383() {
		aClass53_266 = null;
		aClass53_268 = null;
		aClass62_3 = null;
		aClass53_267 = null;
		aLongArray3 = null;
		aClass53_265 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)Lclient!na;")
	public static Class53 method384(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static120.aClass53_1386;
		} else if (local7 < -6) {
			return Static61.aClass53_713;
		} else if (local7 < -3) {
			return Static72.aClass53_819;
		} else if (local7 < 0) {
			return Static114.aClass53_1306;
		} else if (local7 > 9) {
			return Static105.aClass53_1211;
		} else if (local7 > 6) {
			return Static100.aClass53_1141;
		} else if (local7 > 3) {
			return Static15.aClass53_133;
		} else if (local7 > 0) {
			return Static16.aClass53_144;
		} else {
			return Static66.aClass53_746;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method385(@OriginalArg(1) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static127.method202(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
	public static int method386(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(III)V")
	public static void method387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local11[0] = arg1;
		@Pc(17) int local17 = 1;
		local8[0] = arg0;
		for (@Pc(23) int local23 = 0; local23 < 4; local23++) {
			if (arg1 != Static93.anIntArray300[local23]) {
				local11[local17] = Static93.anIntArray300[local23];
				local8[local17] = Static77.anIntArray259[local23];
				local17++;
			}
		}
		Static93.anIntArray300 = local11;
		Static77.anIntArray259 = local8;
		Static111.method1784(Static10.aClass49Array1.length - 1, Static93.anIntArray300, Static77.anIntArray259, 0, Static10.aClass49Array1);
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIII)V")
	public static void method388(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == Static15.anInt339 && Static101.anInt2381 == arg0 && (Static90.anInt2123 == arg3 || !Static45.aBoolean47)) {
			return;
		}
		Static101.anInt2381 = arg0;
		Static15.anInt339 = arg4;
		Static90.anInt2123 = arg3;
		if (!Static45.aBoolean47) {
			Static90.anInt2123 = 0;
		}
		Static103.method1692(25);
		Static18.method295(Static42.aClass53_538, null, false);
		@Pc(37) int local37 = Static80.anInt2029;
		@Pc(39) int local39 = Static4.anInt145;
		Static80.anInt2029 = (arg4 - 6) * 8;
		@Pc(50) int local50 = Static80.anInt2029 - local37;
		Static4.anInt145 = (arg0 - 6) * 8;
		@Pc(62) int local62 = Static4.anInt145 - local39;
		for (@Pc(66) int local66 = 0; local66 < 32768; local66++) {
			@Pc(72) Class3_Sub1_Sub4_Sub1_Sub1 local72 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local66];
			if (local72 != null) {
				for (@Pc(76) int local76 = 0; local76 < 10; local76++) {
					local72.anIntArray185[local76] -= local50;
					local72.anIntArray181[local76] -= local62;
				}
				local72.anInt1427 -= local62 * 128;
				local72.anInt1424 -= local50 * 128;
			}
		}
		for (@Pc(122) int local122 = 0; local122 < 2048; local122++) {
			@Pc(128) Class3_Sub1_Sub4_Sub1_Sub2 local128 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local122];
			if (local128 != null) {
				for (@Pc(132) int local132 = 0; local132 < 10; local132++) {
					local128.anIntArray185[local132] -= local50;
					local128.anIntArray181[local132] -= local62;
				}
				local128.anInt1424 -= local50 * 128;
				local128.anInt1427 -= local62 * 128;
			}
		}
		Static72.anInt1813 = arg3;
		Static98.aClass3_Sub1_Sub4_Sub1_Sub2_1.method1032(arg1, false, arg2);
		@Pc(186) byte local186 = 0;
		@Pc(188) byte local188 = 1;
		@Pc(190) byte local190 = 0;
		@Pc(200) byte local200 = 104;
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 104;
		if (local62 < 0) {
			local190 = 103;
			local202 = -1;
			local204 = -1;
		}
		if (local50 < 0) {
			local200 = -1;
			local188 = -1;
			local186 = 103;
		}
		for (@Pc(222) int local222 = local186; local222 != local200; local222 += local188) {
			for (@Pc(226) int local226 = local190; local226 != local204; local226 += local202) {
				@Pc(233) int local233 = local222 + local50;
				@Pc(237) int local237 = local226 + local62;
				for (@Pc(239) int local239 = 0; local239 < 4; local239++) {
					if (local233 >= 0 && local237 >= 0 && local233 < 104 && local237 < 104) {
						Static95.aClass11ArrayArrayArray1[local239][local222][local226] = Static95.aClass11ArrayArrayArray1[local239][local233][local237];
					} else {
						Static95.aClass11ArrayArrayArray1[local239][local222][local226] = null;
					}
				}
			}
		}
		for (@Pc(303) Class3_Sub16 local303 = (Class3_Sub16) Static49.aClass11_7.method189(); local303 != null; local303 = (Class3_Sub16) Static49.aClass11_7.method187()) {
			local303.anInt2507 -= local50;
			local303.anInt2496 -= local62;
			if (local303.anInt2507 < 0 || local303.anInt2496 < 0 || local303.anInt2507 >= 104 || local303.anInt2496 >= 104) {
				local303.method1962();
			}
		}
		Static70.aBoolean65 = false;
		Static40.anInt1185 = 0;
		Static122.anInt2837 = -1;
		if (Static68.anInt1730 != 0) {
			Static59.anInt1551 -= local62;
			Static68.anInt1730 -= local50;
		}
		Static105.aClass11_12.method201();
		Static31.aClass11_3.method201();
	}
}
