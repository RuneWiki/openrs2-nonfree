import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
	public static int anInt1500;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!ud;")
	public static Class5 aClass5_20;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt1505;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 6)
	public static void method994() {
		aClass5_20 = null;
		Class32.aClass2_Sub3Array1 = null;
		Class32.anIntArray312 = null;
		Class32.aClass40_430 = null;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I", line = 18)
	public static int method995() {
		@Pc(12) int local12 = 3;
		if (Static33.anInt824 < 310) {
			@Pc(21) int local21 = Static44.anInt1114 >> 7;
			@Pc(25) int local25 = Static14.anInt1863 >> 7;
			@Pc(30) int local30 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7;
			if ((Class34.aByteArrayArrayArray7[Static1.anInt8][local21][local25] & 0x4) != 0) {
				local12 = Static1.anInt8;
			}
			@Pc(50) int local50 = Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7;
			@Pc(62) int local62;
			if (local30 > local21) {
				local62 = local30 - local21;
			} else {
				local62 = local21 - local30;
			}
			@Pc(77) int local77;
			if (local50 > local25) {
				local77 = local50 - local25;
			} else {
				local77 = local25 - local50;
			}
			@Pc(92) int local92;
			@Pc(94) int local94;
			if (local62 <= local77) {
				local92 = local62 * 65536 / local77;
				local94 = 32768;
				while (local50 != local25) {
					if (local25 < local50) {
						local25++;
					} else if (local50 < local25) {
						local25--;
					}
					if ((Class34.aByteArrayArrayArray7[Static1.anInt8][local21][local25] & 0x4) != 0) {
						local12 = Static1.anInt8;
					}
					local94 += local92;
					if (local94 >= 65536) {
						local94 -= 65536;
						if (local21 < local30) {
							local21++;
						} else if (local21 > local30) {
							local21--;
						}
						if ((Class34.aByteArrayArrayArray7[Static1.anInt8][local21][local25] & 0x4) != 0) {
							local12 = Static1.anInt8;
						}
					}
				}
			} else {
				local94 = 32768;
				local92 = local77 * 65536 / local62;
				while (local21 != local30) {
					local94 += local92;
					if (local21 < local30) {
						local21++;
					} else if (local30 < local21) {
						local21--;
					}
					if ((Class34.aByteArrayArrayArray7[Static1.anInt8][local21][local25] & 0x4) != 0) {
						local12 = Static1.anInt8;
					}
					if (local94 >= 65536) {
						if (local50 > local25) {
							local25++;
						} else if (local25 > local50) {
							local25--;
						}
						if ((Class34.aByteArrayArrayArray7[Static1.anInt8][local21][local25] & 0x4) != 0) {
							local12 = Static1.anInt8;
						}
						local94 -= 65536;
					}
				}
			}
		}
		if ((Class34.aByteArrayArrayArray7[Static1.anInt8][Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2275 >> 7][Static80.aClass2_Sub2_Sub12_Sub1_Sub1_1.anInt2284 >> 7] & 0x4) != 0) {
			local12 = Static1.anInt8;
		}
		return local12;
	}

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 156)
	public static void method996() {
		Class62.aClass47_22.method1330();
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!ud;ILjava/awt/Component;)V", line = 180)
	public static void method997(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Component arg1) {
		if (Class18.aBoolean152) {
			return;
		}
		Static14.aClass2_Sub2_Sub2_Sub3_19 = Static91.method77(arg0, client.aClass40_110, Class22.aClass40_223);
		Static48.aClass2_Sub2_Sub2_Sub3_13 = Static91.method77(arg0, client.aClass40_110, Class18.aClass40_544);
		Static16.aClass2_Sub2_Sub2_Sub3_6 = Static91.method77(arg0, client.aClass40_110, Class2_Sub2_Sub6.aClass40_191);
		Static46.aClass2_Sub2_Sub2_Sub3_11 = Static91.method77(arg0, client.aClass40_110, Class2_Sub3.aClass40_734);
		Static14.aClass2_Sub2_Sub2_Sub3_18 = Static91.method77(arg0, client.aClass40_110, Class9.aClass40_64);
		Static94.aClass2_Sub2_Sub2_Sub3_23 = Static91.method77(arg0, client.aClass40_110, Class22.aClass40_220);
		Static56.aClass45_23 = Static75.method1351(479, arg1, 96);
		Static48.aClass2_Sub2_Sub2_Sub3_13.method1320(0, 0);
		Static11.aClass45_6 = Static75.method1351(172, arg1, 156);
		Static25.method1610();
		Static16.aClass2_Sub2_Sub2_Sub3_6.method1320(0, 0);
		Static7.aClass45_5 = Static75.method1351(190, arg1, 261);
		Static14.aClass2_Sub2_Sub2_Sub3_19.method1320(0, 0);
		Static2.aClass45_2 = Static75.method1351(512, arg1, 334);
		Static25.method1610();
		Static4.aClass45_4 = Static75.method1351(496, arg1, 50);
		Static63.aClass45_8 = Static75.method1351(269, arg1, 37);
		Static24.aClass45_12 = Static75.method1351(249, arg1, 45);
		@Pc(110) Class2_Sub2_Sub2_Sub4 local110 = Static95.method1644(Class64.aClass40_725, client.aClass40_110, arg0);
		Static38.aClass45_20 = Static75.method1351(local110.anInt2446, arg1, local110.anInt2442);
		local110.method1619(0, 0);
		@Pc(128) Class2_Sub2_Sub2_Sub4 local128 = Static95.method1644(Class24.aClass40_718, client.aClass40_110, arg0);
		Static28.aClass45_15 = Static75.method1351(local128.anInt2446, arg1, local128.anInt2442);
		local128.method1619(0, 0);
		@Pc(148) Class2_Sub2_Sub2_Sub4 local148 = Static95.method1644(Class2_Sub2.aClass40_707, client.aClass40_110, arg0);
		Static72.aClass45_28 = Static75.method1351(local148.anInt2446, arg1, local148.anInt2442);
		local148.method1619(0, 0);
		@Pc(166) Class2_Sub2_Sub2_Sub4 local166 = Static95.method1644(Class5_Sub1.aClass40_29, client.aClass40_110, arg0);
		Static27.aClass45_13 = Static75.method1351(local166.anInt2446, arg1, local166.anInt2442);
		local166.method1619(0, 0);
		@Pc(184) Class2_Sub2_Sub2_Sub4 local184 = Static95.method1644(Class2_Sub2_Sub10.aClass40_319, client.aClass40_110, arg0);
		Static84.aClass45_29 = Static75.method1351(local184.anInt2446, arg1, local184.anInt2442);
		local184.method1619(0, 0);
		@Pc(204) Class2_Sub2_Sub2_Sub4 local204 = Static95.method1644(Class59.aClass40_632, client.aClass40_110, arg0);
		Static19.aClass45_10 = Static75.method1351(local204.anInt2446, arg1, local204.anInt2442);
		local204.method1619(0, 0);
		@Pc(222) Class2_Sub2_Sub2_Sub4 local222 = Static95.method1644(Class38.aClass40_487, client.aClass40_110, arg0);
		Static1.aClass45_1 = Static75.method1351(local222.anInt2446, arg1, local222.anInt2442);
		local222.method1619(0, 0);
		@Pc(240) Class2_Sub2_Sub2_Sub4 local240 = Static95.method1644(Class2_Sub2_Sub8.aClass40_288, client.aClass40_110, arg0);
		Static41.aClass45_21 = Static75.method1351(local240.anInt2446, arg1, local240.anInt2442);
		local240.method1619(0, 0);
		@Pc(258) Class2_Sub2_Sub2_Sub4 local258 = Static95.method1644(Class23.aClass40_256, client.aClass40_110, arg0);
		Static18.aClass45_9 = Static75.method1351(local258.anInt2446, arg1, local258.anInt2442);
		local258.method1619(0, 0);
		Static2.aClass2_Sub2_Sub2_Sub3_1 = Static91.method77(arg0, client.aClass40_110, Class1.aClass40_3);
		Static14.aClass2_Sub2_Sub2_Sub3_17 = Static91.method77(arg0, client.aClass40_110, Class24.aClass40_720);
		Static46.aClass2_Sub2_Sub2_Sub3_10 = Static91.method77(arg0, client.aClass40_110, Class19.aClass40_136);
		Static75.aClass2_Sub2_Sub2_Sub3_20 = Static2.aClass2_Sub2_Sub2_Sub3_1.method1319();
		Static75.aClass2_Sub2_Sub2_Sub3_20.method1318();
		Static89.aClass2_Sub2_Sub2_Sub3_22 = Static14.aClass2_Sub2_Sub2_Sub3_17.method1319();
		Static89.aClass2_Sub2_Sub2_Sub3_22.method1318();
		Static30.aClass2_Sub2_Sub2_Sub3_7 = Static2.aClass2_Sub2_Sub2_Sub3_1.method1319();
		Static30.aClass2_Sub2_Sub2_Sub3_7.method1322();
		Static95.aClass2_Sub2_Sub2_Sub3_24 = Static14.aClass2_Sub2_Sub2_Sub3_17.method1319();
		Static95.aClass2_Sub2_Sub2_Sub3_24.method1322();
		Static48.aClass2_Sub2_Sub2_Sub3_12 = Static46.aClass2_Sub2_Sub2_Sub3_10.method1319();
		Static48.aClass2_Sub2_Sub2_Sub3_12.method1322();
		Static31.aClass2_Sub2_Sub2_Sub3_9 = Static2.aClass2_Sub2_Sub2_Sub3_1.method1319();
		Static31.aClass2_Sub2_Sub2_Sub3_9.method1318();
		Static31.aClass2_Sub2_Sub2_Sub3_9.method1322();
		Static3.aClass2_Sub2_Sub2_Sub3_2 = Static14.aClass2_Sub2_Sub2_Sub3_17.method1319();
		Static3.aClass2_Sub2_Sub2_Sub3_2.method1318();
		Static3.aClass2_Sub2_Sub2_Sub3_2.method1322();
		Static73.aClass2_Sub2_Sub2_Sub3Array10 = Static4.method85(arg0, Class2_Sub2_Sub3.aClass40_78, client.aClass40_110);
		Static2.anIntArray3 = new int[151];
		Static67.anIntArray407 = new int[151];
		Static94.anIntArray544 = new int[33];
		Static42.anIntArray225 = new int[33];
		@Pc(353) int local353;
		@Pc(351) int local351;
		@Pc(355) int local355;
		for (@Pc(347) int local347 = 0; local347 < 33; local347++) {
			local351 = 0;
			local353 = 999;
			for (local355 = 0; local355 < 34; local355++) {
				if (Static16.aClass2_Sub2_Sub2_Sub3_6.aByteArray16[local347 * Static16.aClass2_Sub2_Sub2_Sub3_6.anInt1905 + local355] == 0) {
					if (local353 == 999) {
						local353 = local355;
					}
				} else if (local353 != 999) {
					local351 = local355;
					break;
				}
			}
			Static94.anIntArray544[local347] = local353;
			Static42.anIntArray225[local347] = local351 - local353;
		}
		for (local353 = 5; local353 < 156; local353++) {
			local351 = 999;
			local355 = 0;
			for (@Pc(419) int local419 = 25; local419 < 172; local419++) {
				if (Static16.aClass2_Sub2_Sub2_Sub3_6.aByteArray16[local353 * Static16.aClass2_Sub2_Sub2_Sub3_6.anInt1905 + local419] == 0 && (local419 > 34 || local353 > 34)) {
					if (local351 == 999) {
						local351 = local419;
					}
				} else if (local351 != 999) {
					local355 = local419;
					break;
				}
			}
			Static67.anIntArray407[local353 - 5] = local351 - 25;
			Static2.anIntArray3[local353 - 5] = local355 - local351;
		}
		Class18.aBoolean152 = true;
	}
}
