import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray80;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "Lclient!af;")
	public static Class5 aClass5_1276 = Static45.method1937("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_1277 = Static45.method1937("<br>(X100(U(Y");

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "[Lclient!fd;")
	public static Class1_Sub3_Sub1_Sub2[] aClass1_Sub3_Sub1_Sub2Array9 = new Class1_Sub3_Sub1_Sub2[1000];

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_1278 = Static45.method1937("Hierhin gehen");

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "Lclient!af;")
	public static Class5 aClass5_1279 = Static45.method1937("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V")
	public static void method1926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static108.anInt2662 == arg3 && Static42.anInt1066 == arg1 && (Static42.anInt1065 == arg0 || !Static79.aBoolean64)) {
			return;
		}
		Static108.anInt2662 = arg3;
		Static42.anInt1066 = arg1;
		Static42.anInt1065 = arg0;
		if (!Static79.aBoolean64) {
			Static42.anInt1065 = 0;
		}
		Static97.method1636(25);
		Static40.method783(Static12.aClass5_1454, true);
		@Pc(48) int local48 = Static32.anInt927;
		@Pc(50) int local50 = Static129.anInt3262;
		Static32.anInt927 = (arg1 - 6) * 8;
		Static129.anInt3262 = (arg3 - 6) * 8;
		@Pc(67) int local67 = Static129.anInt3262 - local50;
		@Pc(72) int local72 = Static32.anInt927 - local48;
		for (@Pc(78) int local78 = 0; local78 < 32768; local78++) {
			@Pc(84) Class1_Sub3_Sub4_Sub2_Sub2 local84 = Static104.aClass1_Sub3_Sub4_Sub2_Sub2Array1[local78];
			if (local84 != null) {
				for (@Pc(88) int local88 = 0; local88 < 10; local88++) {
					local84.anIntArray443[local88] -= local67;
					local84.anIntArray446[local88] -= local72;
				}
				local84.anInt3079 -= local72 * 128;
				local84.anInt3089 -= local67 * 128;
			}
		}
		for (@Pc(136) int local136 = 0; local136 < 2048; local136++) {
			@Pc(142) Class1_Sub3_Sub4_Sub2_Sub1 local142 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local136];
			if (local142 != null) {
				for (@Pc(146) int local146 = 0; local146 < 10; local146++) {
					local142.anIntArray443[local146] -= local67;
					local142.anIntArray446[local146] -= local72;
				}
				local142.anInt3089 -= local67 * 128;
				local142.anInt3079 -= local72 * 128;
			}
		}
		Static7.anInt213 = arg0;
		Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.method2151(arg4, arg2, false);
		@Pc(198) byte local198 = 0;
		@Pc(200) byte local200 = 0;
		@Pc(202) byte local202 = 1;
		@Pc(204) byte local204 = 104;
		@Pc(206) byte local206 = 104;
		if (local67 < 0) {
			local198 = 103;
			local202 = -1;
			local206 = -1;
		}
		@Pc(219) byte local219 = 1;
		if (local72 < 0) {
			local200 = 103;
			local204 = -1;
			local219 = -1;
		}
		for (@Pc(229) int local229 = local198; local229 != local206; local229 += local202) {
			for (@Pc(233) int local233 = local200; local233 != local204; local233 += local219) {
				@Pc(239) int local239 = local67 + local229;
				@Pc(244) int local244 = local233 + local72;
				for (@Pc(246) int local246 = 0; local246 < 4; local246++) {
					if (local239 >= 0 && local244 >= 0 && local239 < 104 && local244 < 104) {
						Static8.aClass53ArrayArrayArray1[local246][local229][local233] = Static8.aClass53ArrayArrayArray1[local246][local239][local244];
					} else {
						Static8.aClass53ArrayArrayArray1[local246][local229][local233] = null;
					}
				}
			}
		}
		for (@Pc(318) Class1_Sub22 local318 = (Class1_Sub22) Static66.aClass53_17.method1442(); local318 != null; local318 = (Class1_Sub22) Static66.aClass53_17.method1450()) {
			local318.anInt2743 -= local67;
			local318.anInt2722 -= local72;
			if (local318.anInt2743 < 0 || local318.anInt2722 < 0 || local318.anInt2743 >= 104 || local318.anInt2722 >= 104) {
				local318.method2220();
			}
		}
		Static104.aBoolean102 = false;
		if (Static39.anInt1037 != 0) {
			Static75.anInt1750 -= local72;
			Static39.anInt1037 -= local67;
		}
		Static109.anInt2695 = -1;
		Static39.anInt1036 = 0;
		Static45.aClass53_15.method1446();
		Static26.aClass53_6.method1446();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V")
	public static void method1927() {
		aClass1_Sub3_Sub1_Sub2Array9 = null;
		aClass5_1277 = null;
		aClass5_1278 = null;
		aClass5_1279 = null;
		anIntArrayArray80 = null;
		aClass5_1276 = null;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!kb;ILclient!kb;)V")
	public static void method1928(@OriginalArg(0) Class41 arg0, @OriginalArg(2) Class41 arg1) {
		Static21.aClass41_1 = arg0;
		Static69.aClass41_11 = arg1;
		Static109.anInt2692 = Static69.aClass41_11.method1700(3);
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public static void method1929() {
		Static103.anInt2537 = 0;
		Static86.anInt2184 = 0;
		Static98.method1646();
		Static52.method904();
		Static99.method1690();
		Static19.method483();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static103.anInt2537; local26++) {
			local32 = Static75.anIntArray289[local26];
			if (Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local32].anInt3066 != Static131.anInt3270) {
				Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local32] = null;
			}
		}
		if (Static79.aClass1_Sub20_Sub1_2.anInt2951 != Static77.anInt1803) {
			throw new RuntimeException("gpp1 pos:" + Static79.aClass1_Sub20_Sub1_2.anInt2951 + " psize:" + Static77.anInt1803);
		}
		for (local32 = 0; local32 < Static111.anInt2739; local32++) {
			if (Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[Static77.anIntArray299[local32]] == null) {
				throw new RuntimeException("gpp2 pos:" + local32 + " size:" + Static111.anInt2739);
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)V")
	public static void method1930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class1_Sub3_Sub14 local7 = Static13.method298(arg0);
		@Pc(10) int local10 = local7.anInt2227;
		@Pc(13) int local13 = local7.anInt2223;
		@Pc(16) int local16 = local7.anInt2222;
		@Pc(23) int local23 = Class1_Sub3_Sub12.anIntArray323[local16 - local13];
		if (arg1 < 0 || arg1 > local23) {
			arg1 = 0;
		}
		local23 <<= local13;
		Static40.anIntArray182[local10] = Static40.anIntArray182[local10] & ~local23 | arg1 << local13 & local23;
	}
}
