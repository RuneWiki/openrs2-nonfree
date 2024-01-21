import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "[Lclient!gb;")
	public static Class3_Sub10[] aClass3_Sub10Array1;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!mf;")
	public static Class3_Sub15 aClass3_Sub15_2;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
	public static int anInt2429 = -1;

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "[I")
	public static int[] anIntArray241 = new int[50];

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1032 = Static59.method1195("(U3");

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1033 = Static59.method1195("Message");

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	public static int anInt2431 = 0;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1034 = Static59.method1195("swe");

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1035 = Static59.method1195("Hidden)2use");

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1040 = Static59.method1195("Malformed login packet)3");

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1036 = aClass60_1040;

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
	public static int anInt2433 = 10;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
	public static int anInt2435 = 0;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1037 = aClass60_1033;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1038 = Static59.method1195("Lade Spiel)2Fenster )2 ");

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1039 = Static59.method1195("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public static void method1571() {
		aClass60_1039 = null;
		anIntArray241 = null;
		aClass3_Sub15_2 = null;
		aClass60_1040 = null;
		aClass60_1036 = null;
		aClass60_1034 = null;
		aClass60_1037 = null;
		aClass3_Sub10Array1 = null;
		aClass60_1032 = null;
		aClass60_1035 = null;
		aClass60_1038 = null;
		aClass60_1033 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	public static void method1572() {
		if (!Static12.aBoolean13) {
			return;
		}
		Static63.aClass16_68 = null;
		Static80.aClass3_Sub1_Sub2_Sub4Array6 = null;
		Static107.aClass3_Sub1_Sub2_Sub4_17 = null;
		Static27.aClass16_24 = null;
		Static72.aClass3_Sub1_Sub2_Sub4_7 = null;
		Static43.aClass3_Sub1_Sub2_Sub4_3 = null;
		Static13.aClass16_14 = null;
		Static130.aClass3_Sub1_Sub2_Sub4_21 = null;
		Static55.aClass16_42 = null;
		Static12.aClass16_12 = null;
		Static98.aClass3_Sub1_Sub2_Sub4_12 = null;
		Static13.anIntArray54 = null;
		Static105.aClass3_Sub1_Sub2_Sub4_16 = null;
		Static126.aClass16_76 = null;
		Static65.aClass3_Sub1_Sub2_Sub4_6 = null;
		Static74.aClass16_58 = null;
		Static70.aClass16_53 = null;
		Static85.aClass16_62 = null;
		Static12.aBoolean13 = false;
		Static33.anIntArray139 = null;
		Static113.aClass16_72 = null;
		Static85.aClass3_Sub1_Sub2_Sub4_10 = null;
		Static81.aClass3_Sub1_Sub2_Sub4_9 = null;
		Static100.aClass3_Sub1_Sub2_Sub4_14 = null;
		Static61.aClass16_46 = null;
		Static27.aClass16_25 = null;
		Static62.aClass16_47 = null;
		Static119.aClass3_Sub1_Sub2_Sub4_20 = null;
		Static85.anIntArray270 = null;
		Static3.aClass16_5 = null;
		Static51.aClass3_Sub1_Sub2_Sub4_2 = null;
		Static43.aClass16_37 = null;
		Static112.aClass3_Sub1_Sub2_Sub4_18 = null;
		Static107.anIntArray323 = null;
		Static130.aClass3_Sub1_Sub2_Sub4_22 = null;
		Static57.aClass16_75 = null;
		Static63.aClass3_Sub1_Sub2_Sub4_13 = null;
		Static62.aClass3_Sub1_Sub2_Sub4_4 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIII)Z")
	public static boolean method1573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int local11 = arg0 >> 14 & 0x7FFF;
		@Pc(18) int local18 = Static13.aClass58_1.method1747(Static119.anInt3243, arg1, arg2, arg0);
		if (local18 == -1) {
			return false;
		}
		@Pc(35) int local35 = local18 >> 6 & 0x3;
		@Pc(39) int local39 = local18 & 0x1F;
		if (local39 == 10 || local39 == 11 || local39 == 22) {
			@Pc(80) Class3_Sub1_Sub17 local80 = Static18.method517(local11);
			@Pc(93) int local93;
			@Pc(96) int local96;
			if (local35 == 0 || local35 == 2) {
				local93 = local80.anInt3449;
				local96 = local80.anInt3441;
			} else {
				local96 = local80.anInt3449;
				local93 = local80.anInt3441;
			}
			@Pc(107) int local107 = local80.anInt3439;
			if (local35 != 0) {
				local107 = (local107 << local35 & 0xF) + (local107 >> 4 - local35);
			}
			Static67.method1378(arg1, true, 0, local96, 2, local93, 0, local107, arg2, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
		} else {
			Static67.method1378(arg1, true, local39 + 1, 0, 2, 0, local35, 0, arg2, Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0], Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0]);
		}
		Static3.anInt127 = Static84.anInt2576;
		Static11.anInt354 = 0;
		Static103.anInt2993 = Static130.anInt3486;
		Static49.anInt1594 = 2;
		return true;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	public static void method1574() {
		Static16.aClass82_1 = new Class82(32);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IBI)V")
	public static void method1575(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 100; local9++) {
			if (Static126.aClass60Array23[local9] != null) {
				@Pc(31) int local31 = Static55.anInt1760 + 4 + 70 - local7 * 14;
				@Pc(35) int local35 = Static57.anIntArray384[local9];
				if (local31 < -20) {
					break;
				}
				if (local35 == 0) {
					local7++;
				}
				@Pc(45) Class60 local45 = Static99.aClass60Array18[local9];
				if (local45 != null && local45.method1853(Static43.aClass60_624)) {
					local45 = local45.method1829(5);
				}
				if (local45 != null && local45.method1853(Static103.aClass60_1258)) {
					local45 = local45.method1829(5);
				}
				if ((local35 == 1 || local35 == 2) && (local35 == 1 || Static27.anInt997 == 0 || Static27.anInt997 == 1 && Static67.method1384(local45))) {
					local7++;
					if (arg0 > local31 - 14 && local31 >= arg0 && !local45.method1839(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass60_245)) {
						if (Static97.anInt2774 >= 1) {
							Static118.method2137(0, 15, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static86.aClass60_719, 0);
						}
						Static118.method2137(0, 38, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static20.aClass60_313, 0);
						Static118.method2137(0, 10, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static100.aClass60_1241, 0);
					}
				}
				if ((local35 == 3 || local35 == 7) && Static36.anInt1216 == 0 && (local35 == 7 || Static57.anInt3392 == 0 || Static57.anInt3392 == 1 && Static67.method1384(local45))) {
					local7++;
					if (local31 - 14 < arg0 && local31 >= arg0) {
						if (Static97.anInt2774 >= 1) {
							Static118.method2137(0, 15, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static86.aClass60_719, 0);
						}
						Static118.method2137(0, 38, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static20.aClass60_313, 0);
						Static118.method2137(0, 10, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static100.aClass60_1241, 0);
					}
				}
				if (local35 == 4 && (Static61.anInt1942 == 0 || Static61.anInt1942 == 1 && Static67.method1384(local45))) {
					local7++;
					if (arg0 > local31 - 14 && arg0 <= local31) {
						Static118.method2137(0, 51, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static114.aClass60_1333, 0);
					}
				}
				if ((local35 == 5 || local35 == 6) && Static36.anInt1216 == 0 && Static57.anInt3392 < 2) {
					local7++;
				}
				if (local35 == 8 && (Static61.anInt1942 == 0 || Static61.anInt1942 == 1 && Static67.method1384(local45))) {
					if (local31 - 14 < arg0 && local31 >= arg0) {
						Static118.method2137(0, 55, Static60.method1211(new Class60[] { Static57.aClass60_1411, local45 }), 0, Static128.aClass60_1433, 0);
					}
					local7++;
				}
			}
		}
	}
}
