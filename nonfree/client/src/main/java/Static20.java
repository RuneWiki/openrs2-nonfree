import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!dc", name = "pb", descriptor = "Z")
	public static boolean aBoolean28;

	@OriginalMember(owner = "client!dc", name = "Mb", descriptor = "I")
	public static int anInt446;

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
	public static int anInt424 = 0;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lclient!v;")
	private static Class76 aClass76_178 = Static134.method2017("Please try using a different world)3");

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lclient!v;")
	public static Class76 aClass76_176 = aClass76_178;

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "Lclient!v;")
	public static Class76 aClass76_177 = aClass76_178;

	@OriginalMember(owner = "client!dc", name = "gb", descriptor = "I")
	public static int anInt427 = 0;

	@OriginalMember(owner = "client!dc", name = "ob", descriptor = "Lclient!v;")
	public static Class76 aClass76_179 = aClass76_178;

	@OriginalMember(owner = "client!dc", name = "sb", descriptor = "Lclient!v;")
	public static Class76 aClass76_180 = aClass76_178;

	@OriginalMember(owner = "client!dc", name = "yb", descriptor = "Lclient!v;")
	public static Class76 aClass76_181 = aClass76_178;

	@OriginalMember(owner = "client!dc", name = "Db", descriptor = "Lclient!v;")
	public static Class76 aClass76_182 = Static134.method2017("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!dc", name = "Eb", descriptor = "Lclient!ua;")
	public static Class72 aClass72_9 = new Class72(64);

	@OriginalMember(owner = "client!dc", name = "Ib", descriptor = "Lclient!v;")
	public static Class76 aClass76_183 = aClass76_178;

	@OriginalMember(owner = "client!dc", name = "Kb", descriptor = "I")
	public static int anInt445 = 0;

	@OriginalMember(owner = "client!dc", name = "Nb", descriptor = "[Lclient!t;")
	public static Class68[] aClass68Array1 = new Class68[16];

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZII)V")
	public static void method302(@OriginalArg(1) boolean arg0) {
		Static72.aBoolean117 = arg0;
		Static84.anInt2021 = 2;
		Static106.anInt2355 = 22050;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)V")
	public static void method303() {
		if (Static48.aClass75_4 != null) {
			Static48.aClass75_4.method1842();
			Static48.aClass75_4 = null;
		}
		Static12.method152();
		Static54.aClass81_10.method1978();
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			Static52.aClass50Array1[local22].method1380();
		}
		System.gc();
		Static121.method1838();
		Static118.anInt2556 = -1;
		Static18.aBoolean22 = false;
		Static17.method229();
		Static73.method1363(10);
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
	public static void method306() {
		aClass76_180 = null;
		aClass72_9 = null;
		aClass68Array1 = null;
		aClass76_183 = null;
		aClass76_181 = null;
		aClass76_178 = null;
		aClass76_182 = null;
		aClass76_176 = null;
		aClass76_177 = null;
		aClass76_179 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lclient!rb;I)V")
	public static void method307(@OriginalArg(0) Class4_Sub20 arg0) {
		@Pc(8) Object[] local8 = arg0.anObjectArray28;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(20) Class4_Sub4_Sub14 local20 = Static107.method1621(local14);
		if (local20 == null) {
			return;
		}
		Static100.anInt2293 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = -1;
		@Pc(34) int[] local34 = local20.anIntArray316;
		@Pc(37) int[] local37 = local20.anIntArray317;
		@Pc(39) byte local39 = -1;
		@Pc(57) int local57;
		@Pc(70) int local70;
		try {
			@Pc(41) int local41 = 0;
			Static19.aClass76Array9 = new Class76[local20.anInt2251];
			@Pc(51) int local51 = 0;
			Static18.anIntArray45 = new int[local20.anInt2255];
			for (local57 = 1; local57 < local8.length; local57++) {
				if (local8[local57] instanceof Integer) {
					local70 = (Integer) local8[local57];
					if (local70 == -2147483647) {
						local70 = arg0.anInt2288;
					}
					if (local70 == -2147483646) {
						local70 = arg0.anInt2295;
					}
					if (local70 == -2147483645) {
						local70 = arg0.aClass4_Sub8_14 == null ? -1 : arg0.aClass4_Sub8_14.anInt514;
					}
					if (local70 == -2147483644) {
						local70 = arg0.anInt2298;
					}
					if (local70 == -2147483643) {
						local70 = arg0.aClass4_Sub8_14 == null ? -1 : arg0.aClass4_Sub8_14.anInt466;
					}
					if (local70 == -2147483642) {
						local70 = arg0.aClass4_Sub8_13 == null ? -1 : arg0.aClass4_Sub8_13.anInt514;
					}
					if (local70 == -2147483641) {
						local70 = arg0.aClass4_Sub8_13 == null ? -1 : arg0.aClass4_Sub8_13.anInt466;
					}
					if (local70 == -2147483640) {
						local70 = arg0.anInt2294;
					}
					if (local70 == -2147483639) {
						local70 = arg0.anInt2290;
					}
					Static18.anIntArray45[local41++] = local70;
				} else if (local8[local57] instanceof Class76) {
					@Pc(173) Class76 local173 = (Class76) local8[local57];
					if (local173.method1878(Static75.aClass76_820)) {
						local173 = arg0.aClass76_1058;
					}
					Static19.aClass76Array9[local51++] = local173;
				}
			}
			local70 = 0;
			label1974: while (true) {
				local70++;
				if (local70 > 200000) {
					throw new RuntimeException("slow");
				}
				local31++;
				@Pc(209) int local209 = local37[local31];
				@Pc(648) int local648;
				@Pc(760) int local760;
				@Pc(772) int local772;
				@Pc(622) int local622;
				@Pc(580) Class76 local580;
				if (local209 < 100) {
					if (local209 == 0) {
						Static94.anIntArray306[local27++] = local34[local31];
						continue;
					}
					@Pc(232) int local232;
					if (local209 == 1) {
						local232 = local34[local31];
						Static94.anIntArray306[local27++] = Static124.anIntArray393[local232];
						continue;
					}
					if (local209 == 2) {
						local232 = local34[local31];
						local27--;
						Static124.anIntArray393[local232] = Static94.anIntArray306[local27];
						continue;
					}
					if (local209 == 3) {
						Static35.aClass76Array7[local29++] = local20.aClass76Array24[local31];
						continue;
					}
					if (local209 == 6) {
						local31 += local34[local31];
						continue;
					}
					if (local209 == 7) {
						local27 -= 2;
						if (Static94.anIntArray306[local27 + 1] != Static94.anIntArray306[local27]) {
							local31 += local34[local31];
						}
						continue;
					}
					if (local209 == 8) {
						local27 -= 2;
						if (Static94.anIntArray306[local27 + 1] == Static94.anIntArray306[local27]) {
							local31 += local34[local31];
						}
						continue;
					}
					if (local209 == 9) {
						local27 -= 2;
						if (Static94.anIntArray306[local27 + 1] > Static94.anIntArray306[local27]) {
							local31 += local34[local31];
						}
						continue;
					}
					if (local209 == 10) {
						local27 -= 2;
						if (Static94.anIntArray306[local27] > Static94.anIntArray306[local27 + 1]) {
							local31 += local34[local31];
						}
						continue;
					}
					if (local209 == 21) {
						if (Static100.anInt2293 == 0) {
							return;
						}
						@Pc(403) Class41 local403 = Static134.aClass41Array1[--Static100.anInt2293];
						local31 = local403.anInt1638;
						Static19.aClass76Array9 = local403.aClass76Array15;
						local20 = local403.aClass4_Sub4_Sub14_1;
						Static18.anIntArray45 = local403.anIntArray220;
						local34 = local20.anIntArray316;
						local37 = local20.anIntArray317;
						continue;
					}
					if (local209 == 25) {
						local232 = local34[local31];
						Static94.anIntArray306[local27++] = Static67.method1125(local232);
						continue;
					}
					if (local209 == 27) {
						local232 = local34[local31];
						local27--;
						Static35.method621(local232, Static94.anIntArray306[local27]);
						continue;
					}
					if (local209 == 31) {
						local27 -= 2;
						if (Static94.anIntArray306[local27] <= Static94.anIntArray306[local27 + 1]) {
							local31 += local34[local31];
						}
						continue;
					}
					if (local209 == 32) {
						local27 -= 2;
						if (Static94.anIntArray306[local27 + 1] <= Static94.anIntArray306[local27]) {
							local31 += local34[local31];
						}
						continue;
					}
					if (local209 == 33) {
						Static94.anIntArray306[local27++] = Static18.anIntArray45[local34[local31]];
						continue;
					}
					@Pc(524) int local524;
					if (local209 == 34) {
						local524 = local34[local31];
						local27--;
						Static18.anIntArray45[local524] = Static94.anIntArray306[local27];
						continue;
					}
					if (local209 == 35) {
						Static35.aClass76Array7[local29++] = Static19.aClass76Array9[local34[local31]];
						continue;
					}
					if (local209 == 36) {
						local524 = local34[local31];
						local29--;
						Static19.aClass76Array9[local524] = Static35.aClass76Array7[local29];
						continue;
					}
					if (local209 == 37) {
						local232 = local34[local31];
						local29 -= local232;
						local580 = Static8.method106(local232, local29, Static35.aClass76Array7);
						Static35.aClass76Array7[local29++] = local580;
						continue;
					}
					if (local209 == 38) {
						local27--;
						continue;
					}
					if (local209 == 39) {
						local29--;
						continue;
					}
					if (local209 == 40) {
						local232 = local34[local31];
						@Pc(612) Class4_Sub4_Sub14 local612 = Static107.method1621(local232);
						@Pc(616) Class76[] local616 = new Class76[local612.anInt2251];
						@Pc(620) int[] local620 = new int[local612.anInt2255];
						for (local622 = 0; local622 < local612.anInt2248; local622++) {
							local620[local622] = Static94.anIntArray306[local27 + local622 - local612.anInt2248];
						}
						for (local648 = 0; local648 < local612.anInt2249; local648++) {
							local616[local648] = Static35.aClass76Array7[local29 + local648 - local612.anInt2249];
						}
						local29 -= local612.anInt2249;
						local27 -= local612.anInt2248;
						@Pc(682) Class41 local682 = new Class41();
						local682.anIntArray220 = Static18.anIntArray45;
						local682.aClass76Array15 = Static19.aClass76Array9;
						local682.aClass4_Sub4_Sub14_1 = local20;
						local682.anInt1638 = local31;
						Static134.aClass41Array1[Static100.anInt2293++] = local682;
						local31 = -1;
						local20 = local612;
						Static19.aClass76Array9 = local616;
						local34 = local612.anIntArray316;
						local37 = local612.anIntArray317;
						Static18.anIntArray45 = local620;
						continue;
					}
					if (local209 == 42) {
						Static94.anIntArray306[local27++] = Static118.anIntArray384[local34[local31]];
						continue;
					}
					if (local209 == 43) {
						local524 = local34[local31];
						local27--;
						Static118.anIntArray384[local524] = Static94.anIntArray306[local27];
						continue;
					}
					if (local209 == 44) {
						local27--;
						local760 = Static94.anIntArray306[local27];
						local232 = local34[local31] >> 16;
						local772 = local34[local31] & 0xFFFF;
						if (local760 >= 0 && local760 <= 5000) {
							Static103.anIntArray322[local232] = local760;
							@Pc(787) byte local787 = -1;
							if (local772 == 105) {
								local787 = 0;
							}
							local622 = 0;
							while (true) {
								if (local622 >= local760) {
									continue label1974;
								}
								Static103.anIntArrayArray18[local232][local622] = local787;
								local622++;
							}
						}
						throw new RuntimeException();
					}
					if (local209 == 45) {
						local232 = local34[local31];
						local27--;
						local772 = Static94.anIntArray306[local27];
						if (local772 >= 0 && Static103.anIntArray322[local232] > local772) {
							Static94.anIntArray306[local27++] = Static103.anIntArrayArray18[local232][local772];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 46) {
						local232 = local34[local31];
						local27 -= 2;
						local772 = Static94.anIntArray306[local27];
						if (local772 >= 0 && local772 < Static103.anIntArray322[local232]) {
							Static103.anIntArrayArray18[local232][local772] = Static94.anIntArray306[local27 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 47) {
						@Pc(905) Class76 local905 = Static126.aClass76Array27[local34[local31]];
						if (local905 == null) {
							local905 = Static40.aClass76_480;
						}
						Static35.aClass76Array7[local29++] = local905;
						continue;
					}
					if (local209 == 48) {
						local524 = local34[local31];
						local29--;
						Static126.aClass76Array27[local524] = Static35.aClass76Array7[local29];
						continue;
					}
				}
				@Pc(937) boolean local937;
				if (local34[local31] == 1) {
					local937 = true;
				} else {
					local937 = false;
				}
				@Pc(973) Class4_Sub8 local973;
				@Pc(2586) Class4_Sub8 local2586;
				@Pc(2570) Class4_Sub8 local2570;
				@Pc(1872) int local1872;
				@Pc(1639) int local1639;
				if (local209 < 1000) {
					if (local209 == 100) {
						local27 -= 3;
						local772 = Static94.anIntArray306[local27];
						local1639 = Static94.anIntArray306[local27 + 2];
						local760 = Static94.anIntArray306[local27 + 1];
						if (local760 == 0) {
							throw new RuntimeException();
						}
						local2570 = Static52.method946(local772);
						if (local2570.aClass4_Sub8Array1 == null) {
							local2570.aClass4_Sub8Array1 = new Class4_Sub8[local1639 + 1];
						}
						if (local1639 >= local2570.aClass4_Sub8Array1.length) {
							@Pc(6912) Class4_Sub8[] local6912 = new Class4_Sub8[local1639 + 1];
							for (local1872 = 0; local1872 < local2570.aClass4_Sub8Array1.length; local1872++) {
								local6912[local1872] = local2570.aClass4_Sub8Array1[local1872];
							}
							local2570.aClass4_Sub8Array1 = local6912;
						}
						if (local1639 > 0 && local2570.aClass4_Sub8Array1[local1639 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1639 - 1));
						}
						@Pc(6961) Class4_Sub8 local6961 = new Class4_Sub8();
						local6961.aBoolean37 = true;
						local6961.anInt466 = local1639;
						local6961.anInt489 = local6961.anInt514 = local2570.anInt514;
						local6961.anInt473 = local760;
						local2570.aClass4_Sub8Array1[local1639] = local6961;
						if (local937) {
							Static42.aClass4_Sub8_9 = local6961;
						} else {
							Static48.aClass4_Sub8_10 = local6961;
						}
						Static63.method1095(local2570);
						continue;
					}
					if (local209 == 101) {
						local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
						@Pc(7011) Class4_Sub8 local7011 = Static52.method946(local973.anInt514);
						local7011.aClass4_Sub8Array1[local973.anInt466] = null;
						Static63.method1095(local7011);
						continue;
					}
					if (local209 == 102) {
						local27--;
						local973 = Static52.method946(Static94.anIntArray306[local27]);
						local973.aClass4_Sub8Array1 = null;
						Static63.method1095(local973);
						continue;
					}
					if (local209 == 200) {
						local27 -= 2;
						local772 = Static94.anIntArray306[local27];
						local760 = Static94.anIntArray306[local27 + 1];
						local2586 = Static62.method1079(local760, local772);
						if (local2586 != null && local760 != -1) {
							Static94.anIntArray306[local27++] = 1;
							if (local937) {
								Static42.aClass4_Sub8_9 = local2586;
							} else {
								Static48.aClass4_Sub8_10 = local2586;
							}
							continue;
						}
						Static94.anIntArray306[local27++] = 0;
						continue;
					}
				} else if ((local209 < 1000 || local209 >= 1100) && (local209 < 2000 || local209 >= 2100)) {
					@Pc(1407) Class76 local1407;
					if (local209 >= 1100 && local209 < 1200 || local209 >= 2100 && local209 < 2200) {
						if (local209 < 2000) {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
						} else {
							local27--;
							local973 = Static52.method946(Static94.anIntArray306[local27]);
							local209 -= 1000;
						}
						if (local209 == 1100) {
							local27 -= 2;
							local973.anInt492 = Static94.anIntArray306[local27];
							if (local973.anInt499 - local973.anInt513 < local973.anInt492) {
								local973.anInt492 = local973.anInt499 - local973.anInt513;
							}
							if (local973.anInt492 < 0) {
								local973.anInt492 = 0;
							}
							local973.anInt494 = Static94.anIntArray306[local27 + 1];
							if (local973.anInt494 > local973.anInt482 - local973.anInt498) {
								local973.anInt494 = local973.anInt482 - local973.anInt498;
							}
							if (local973.anInt494 < 0) {
								local973.anInt494 = 0;
							}
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1101) {
							local27--;
							local973.anInt532 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1102) {
							local27--;
							local973.aBoolean42 = Static94.anIntArray306[local27] == 1;
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1103) {
							local27--;
							local973.anInt465 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1104) {
							local27--;
							local973.anInt468 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1105) {
							local27--;
							local973.anInt511 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1106) {
							local27--;
							local973.anInt502 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1107) {
							local27--;
							local973.aBoolean31 = Static94.anIntArray306[local27] == 1;
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1108) {
							local973.anInt530 = 1;
							local27--;
							local973.anInt516 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1109) {
							local27 -= 6;
							local973.anInt510 = Static94.anIntArray306[local27];
							local973.anInt526 = Static94.anIntArray306[local27 + 1];
							local973.anInt509 = Static94.anIntArray306[local27 + 2];
							local973.anInt470 = Static94.anIntArray306[local27 + 3];
							local973.anInt478 = Static94.anIntArray306[local27 + 4];
							local973.anInt503 = Static94.anIntArray306[local27 + 5];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1110) {
							local27--;
							local760 = Static94.anIntArray306[local27];
							if (local973.anInt507 != local760) {
								local973.anInt527 = 0;
								local973.anInt519 = 0;
								local973.anInt507 = local760;
								Static63.method1095(local973);
							}
							continue;
						}
						if (local209 == 1111) {
							local27--;
							local973.aBoolean32 = Static94.anIntArray306[local27] == 1;
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1112) {
							local29--;
							local1407 = Static35.aClass76Array7[local29];
							if (!local1407.method1878(local973.aClass76_189)) {
								local973.aClass76_189 = local1407;
								Static63.method1095(local973);
							}
							continue;
						}
						if (local209 == 1113) {
							local27--;
							local973.anInt472 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1114) {
							local27 -= 3;
							local973.anInt524 = Static94.anIntArray306[local27];
							local973.anInt493 = Static94.anIntArray306[local27 + 1];
							local973.anInt481 = Static94.anIntArray306[local27 + 2];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1115) {
							local27--;
							local973.aBoolean40 = Static94.anIntArray306[local27] == 1;
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1116) {
							local27--;
							local973.anInt506 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1117) {
							local27--;
							local973.anInt505 = Static94.anIntArray306[local27];
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1118) {
							local27--;
							local973.aBoolean38 = Static94.anIntArray306[local27] == 1;
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1119) {
							local27--;
							local973.aBoolean35 = Static94.anIntArray306[local27] == 1;
							Static63.method1095(local973);
							continue;
						}
						if (local209 == 1120) {
							local27 -= 2;
							local973.anInt499 = Static94.anIntArray306[local27];
							local973.anInt482 = Static94.anIntArray306[local27 + 1];
							Static63.method1095(local973);
							continue;
						}
					} else if (local209 >= 1200 && local209 < 1300 || local209 >= 2200 && local209 < 2300) {
						if (local209 >= 2000) {
							local209 -= 1000;
							local27--;
							local973 = Static52.method946(Static94.anIntArray306[local27]);
						} else {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
						}
						Static63.method1095(local973);
						if (local209 == 1200) {
							local27 -= 2;
							local760 = Static94.anIntArray306[local27];
							local1639 = Static94.anIntArray306[local27 + 1];
							local973.anInt477 = local760;
							local973.anInt462 = local1639;
							@Pc(1649) Class4_Sub4_Sub7 local1649 = Static61.method1040(local760);
							local973.anInt478 = local1649.anInt1247;
							local973.anInt470 = local1649.anInt1248;
							local973.anInt526 = local1649.anInt1257;
							local973.anInt503 = local1649.anInt1266;
							local973.anInt509 = local1649.anInt1253;
							if (local973.anInt513 > 0) {
								local973.anInt503 = local973.anInt503 * 32 / local973.anInt513;
							}
							local973.anInt510 = local1649.anInt1249;
							continue;
						}
						if (local209 == 1201) {
							local973.anInt530 = 2;
							local27--;
							local973.anInt516 = Static94.anIntArray306[local27];
							continue;
						}
						if (local209 == 1202) {
							local973.anInt530 = 3;
							local973.anInt516 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass26_3.method634();
							continue;
						}
					} else if (local209 >= 1300 && local209 < 1400 || local209 >= 2300 && local209 < 2400) {
						if (local209 >= 2000) {
							local209 -= 1000;
							local27--;
							local973 = Static52.method946(Static94.anIntArray306[local27]);
						} else {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
						}
						if (local209 == 1300) {
							local27--;
							local760 = Static94.anIntArray306[local27] - 1;
							if (local760 >= 0 && local760 <= 9) {
								local29--;
								local973.method326(Static35.aClass76Array7[local29], local760);
								continue;
							}
							local29--;
							continue;
						}
						if (local209 == 1301) {
							local27 -= 2;
							local760 = Static94.anIntArray306[local27];
							local1639 = Static94.anIntArray306[local27 + 1];
							local973.aClass4_Sub8_6 = Static62.method1079(local1639, local760);
							continue;
						}
						if (local209 == 1302) {
							local27--;
							local973.aBoolean34 = Static94.anIntArray306[local27] == 1;
							continue;
						}
						if (local209 == 1303) {
							local27--;
							local973.anInt495 = Static94.anIntArray306[local27];
							continue;
						}
						if (local209 == 1304) {
							local27--;
							local973.anInt475 = Static94.anIntArray306[local27];
							continue;
						}
						if (local209 == 1305) {
							local29--;
							local973.aClass76_200 = Static35.aClass76Array7[local29];
							continue;
						}
						if (local209 == 1306) {
							local29--;
							local973.aClass76_194 = Static35.aClass76Array7[local29];
							continue;
						}
						if (local209 == 1307) {
							local973.aClass76Array3 = null;
							continue;
						}
					} else {
						if (local209 >= 1400 && local209 < 1500 || local209 >= 2400 && local209 < 2500) {
							if (local209 < 2000) {
								local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
							} else {
								local27--;
								local973 = Static52.method946(Static94.anIntArray306[local27]);
								local209 -= 1000;
							}
							@Pc(1768) int[] local1768 = null;
							local29--;
							local1407 = Static35.aClass76Array7[local29];
							if (local1407.method1851() > 0 && local1407.method1860(local1407.method1851() - 1) == 89) {
								local27--;
								local622 = Static94.anIntArray306[local27];
								if (local622 > 0) {
									local1768 = new int[local622];
									while (local622-- > 0) {
										local27--;
										local1768[local622] = Static94.anIntArray306[local27];
									}
								}
								local1407 = local1407.method1876(local1407.method1851() - 1, 0);
							}
							@Pc(1829) Object[] local1829 = new Object[local1407.method1851() + 1];
							for (local648 = local1829.length - 1; local648 >= 1; local648--) {
								if (local1407.method1860(local648 - 1) == 115) {
									local29--;
									local1829[local648] = Static35.aClass76Array7[local29];
								} else {
									local27--;
									local1829[local648] = Integer.valueOf(Static94.anIntArray306[local27]);
								}
							}
							local27--;
							local1872 = Static94.anIntArray306[local27];
							if (local1872 == -1) {
								local1829 = null;
							} else {
								local1829[0] = Integer.valueOf(local1872);
							}
							if (local209 == 1417) {
								local973.anObjectArray9 = local1829;
							}
							if (local209 == 1401) {
								local973.anObjectArray18 = local1829;
							}
							if (local209 == 1408) {
								local973.anObjectArray6 = local1829;
							}
							if (local209 == 1407) {
								local973.anObjectArray17 = local1829;
								local973.anIntArray72 = local1768;
							}
							if (local209 == 1409) {
								local973.anObjectArray23 = local1829;
							}
							if (local209 == 1410) {
								local973.anObjectArray15 = local1829;
							}
							if (local209 == 1423) {
								local973.anObjectArray22 = local1829;
							}
							if (local209 == 1412) {
								local973.anObjectArray7 = local1829;
							}
							if (local209 == 1414) {
								local973.anIntArray69 = local1768;
								local973.anObjectArray12 = local1829;
							}
							if (local209 == 1415) {
								local973.anIntArray75 = local1768;
								local973.anObjectArray27 = local1829;
							}
							if (local209 == 1403) {
								local973.anObjectArray21 = local1829;
							}
							if (local209 == 1424) {
								local973.anObjectArray20 = local1829;
							}
							if (local209 == 1420) {
								local973.anObjectArray3 = local1829;
							}
							if (local209 == 1411) {
								local973.anObjectArray8 = local1829;
							}
							if (local209 == 1406) {
								local973.anObjectArray16 = local1829;
							}
							if (local209 == 1400) {
								local973.anObjectArray4 = local1829;
							}
							if (local209 == 1419) {
								local973.anObjectArray19 = local1829;
							}
							if (local209 == 1404) {
								local973.anObjectArray10 = local1829;
							}
							if (local209 == 1402) {
								local973.anObjectArray5 = local1829;
							}
							local973.aBoolean36 = true;
							if (local209 == 1418) {
								local973.anObjectArray14 = local1829;
							}
							if (local209 == 1421) {
								local973.anObjectArray26 = local1829;
							}
							if (local209 == 1416) {
								local973.anObjectArray24 = local1829;
							}
							if (local209 == 1405) {
								local973.anObjectArray13 = local1829;
							}
							if (local209 == 1422) {
								local973.anObjectArray25 = local1829;
							}
							continue;
						}
						if (local209 < 1600) {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
							if (local209 == 1500) {
								Static94.anIntArray306[local27++] = local973.anInt457;
								continue;
							}
							if (local209 == 1501) {
								Static94.anIntArray306[local27++] = local973.anInt491;
								continue;
							}
							if (local209 == 1502) {
								Static94.anIntArray306[local27++] = local973.anInt513;
								continue;
							}
							if (local209 == 1503) {
								Static94.anIntArray306[local27++] = local973.anInt498;
								continue;
							}
							if (local209 == 1504) {
								Static94.anIntArray306[local27++] = local973.aBoolean39 ? 1 : 0;
								continue;
							}
							if (local209 == 1505) {
								Static94.anIntArray306[local27++] = local973.anInt489;
								continue;
							}
						} else if (local209 < 1700) {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
							if (local209 == 1600) {
								Static94.anIntArray306[local27++] = local973.anInt492;
								continue;
							}
							if (local209 == 1601) {
								Static94.anIntArray306[local27++] = local973.anInt494;
								continue;
							}
							if (local209 == 1602) {
								Static35.aClass76Array7[local29++] = local973.aClass76_189;
								continue;
							}
							if (local209 == 1603) {
								Static94.anIntArray306[local27++] = local973.anInt499;
								continue;
							}
							if (local209 == 1604) {
								Static94.anIntArray306[local27++] = local973.anInt482;
								continue;
							}
							if (local209 == 1605) {
								Static94.anIntArray306[local27++] = local973.anInt503;
								continue;
							}
							if (local209 == 1606) {
								Static94.anIntArray306[local27++] = local973.anInt509;
								continue;
							}
							if (local209 == 1607) {
								Static94.anIntArray306[local27++] = local973.anInt478;
								continue;
							}
							if (local209 == 1608) {
								Static94.anIntArray306[local27++] = local973.anInt470;
								continue;
							}
						} else if (local209 < 1800) {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
							if (local209 == 1700) {
								Static94.anIntArray306[local27++] = local973.anInt477;
								continue;
							}
							if (local209 == 1701) {
								if (local973.anInt477 == -1) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = local973.anInt462;
								}
								continue;
							}
							if (local209 == 1702) {
								Static94.anIntArray306[local27++] = local973.anInt466;
								continue;
							}
						} else if (local209 < 1900) {
							local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
							if (local209 == 1800) {
								Static94.anIntArray306[local27++] = Static122.method1889(Static35.method627(local973));
								continue;
							}
							if (local209 == 1801) {
								local27--;
								local760 = Static94.anIntArray306[local27];
								local760--;
								if (local973.aClass76Array3 != null && local973.aClass76Array3.length > local760 && local973.aClass76Array3[local760] != null) {
									Static35.aClass76Array7[local29++] = local973.aClass76Array3[local760];
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 1802) {
								if (local973.aClass76_200 == null) {
									Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								} else {
									Static35.aClass76Array7[local29++] = local973.aClass76_200;
								}
								continue;
							}
						} else if (local209 < 2600) {
							local27--;
							local973 = Static52.method946(Static94.anIntArray306[local27]);
							if (local209 == 2500) {
								Static94.anIntArray306[local27++] = local973.anInt457;
								continue;
							}
							if (local209 == 2501) {
								Static94.anIntArray306[local27++] = local973.anInt491;
								continue;
							}
							if (local209 == 2502) {
								Static94.anIntArray306[local27++] = local973.anInt513;
								continue;
							}
							if (local209 == 2503) {
								Static94.anIntArray306[local27++] = local973.anInt498;
								continue;
							}
							if (local209 == 2504) {
								Static94.anIntArray306[local27++] = local973.aBoolean39 ? 1 : 0;
								continue;
							}
							if (local209 == 2505) {
								Static94.anIntArray306[local27++] = local973.anInt489;
								continue;
							}
						} else if (local209 < 2700) {
							local27--;
							local973 = Static52.method946(Static94.anIntArray306[local27]);
							if (local209 == 2600) {
								Static94.anIntArray306[local27++] = local973.anInt492;
								continue;
							}
							if (local209 == 2601) {
								Static94.anIntArray306[local27++] = local973.anInt494;
								continue;
							}
							if (local209 == 2602) {
								Static35.aClass76Array7[local29++] = local973.aClass76_189;
								continue;
							}
							if (local209 == 2603) {
								Static94.anIntArray306[local27++] = local973.anInt499;
								continue;
							}
							if (local209 == 2604) {
								Static94.anIntArray306[local27++] = local973.anInt482;
								continue;
							}
							if (local209 == 2605) {
								Static94.anIntArray306[local27++] = local973.anInt503;
								continue;
							}
							if (local209 == 2606) {
								Static94.anIntArray306[local27++] = local973.anInt509;
								continue;
							}
							if (local209 == 2607) {
								Static94.anIntArray306[local27++] = local973.anInt478;
								continue;
							}
							if (local209 == 2608) {
								Static94.anIntArray306[local27++] = local973.anInt470;
								continue;
							}
						} else if (local209 < 2800) {
							if (local209 == 2700) {
								local27--;
								local973 = Static52.method946(Static94.anIntArray306[local27]);
								Static94.anIntArray306[local27++] = local973.anInt477;
								continue;
							}
							if (local209 == 2701) {
								local27--;
								local973 = Static52.method946(Static94.anIntArray306[local27]);
								if (local973.anInt477 == -1) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = local973.anInt462;
								}
								continue;
							}
							if (local209 == 2702) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								@Pc(6450) Class4_Sub14 local6450 = (Class4_Sub14) Static42.aClass28_3.method770((long) local772);
								if (local6450 == null) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = 1;
								}
								continue;
							}
						} else if (local209 < 2900) {
							local27--;
							local973 = Static52.method946(Static94.anIntArray306[local27]);
							if (local209 == 2800) {
								Static94.anIntArray306[local27++] = Static122.method1889(Static35.method627(local973));
								continue;
							}
							if (local209 == 2801) {
								local27--;
								local760 = Static94.anIntArray306[local27];
								local760--;
								if (local973.aClass76Array3 != null && local760 < local973.aClass76Array3.length && local973.aClass76Array3[local760] != null) {
									Static35.aClass76Array7[local29++] = local973.aClass76Array3[local760];
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 2802) {
								if (local973.aClass76_200 == null) {
									Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								} else {
									Static35.aClass76Array7[local29++] = local973.aClass76_200;
								}
								continue;
							}
						} else if (local209 < 3200) {
							if (local209 == 3100) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static21.method328(0, Static13.aClass76_101, local580);
								continue;
							}
							if (local209 == 3101) {
								local27 -= 2;
								Static24.method354(Static94.anIntArray306[local27 + 1], Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1, Static94.anIntArray306[local27]);
								continue;
							}
							if (local209 == 3103) {
								Static62.method1078();
								continue;
							}
							if (local209 == 3104) {
								local760 = 0;
								local29--;
								local580 = Static35.aClass76Array7[local29];
								if (local580.method1862()) {
									local760 = local580.method1884();
								}
								Static69.aClass4_Sub10_Sub1_2.method611(59);
								Static69.aClass4_Sub10_Sub1_2.method597(local760);
								continue;
							}
							if (local209 == 3105) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static69.aClass4_Sub10_Sub1_2.method611(30);
								Static69.aClass4_Sub10_Sub1_2.method555(local580.method1872());
								continue;
							}
							if (local209 == 3106) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static69.aClass4_Sub10_Sub1_2.method611(235);
								Static69.aClass4_Sub10_Sub1_2.method600(local580.method1851() + 1);
								Static69.aClass4_Sub10_Sub1_2.method571(local580);
								continue;
							}
							if (local209 == 3107) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								local29--;
								local1407 = Static35.aClass76Array7[local29];
								Static123.method1896(local1407, local772);
								continue;
							}
							if (local209 == 3108) {
								local27 -= 3;
								local772 = Static94.anIntArray306[local27];
								local1639 = Static94.anIntArray306[local27 + 2];
								local760 = Static94.anIntArray306[local27 + 1];
								local2570 = Static52.method946(local1639);
								Static31.method451(local2570, local772, local760);
								continue;
							}
							if (local209 == 3109) {
								local2586 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
								local27 -= 2;
								local760 = Static94.anIntArray306[local27 + 1];
								local772 = Static94.anIntArray306[local27];
								Static31.method451(local2586, local772, local760);
								continue;
							}
						} else if (local209 < 3300) {
							if (local209 == 3200) {
								local27 -= 3;
								Static92.method1498(Static94.anIntArray306[local27], Static94.anIntArray306[local27 + 2], Static94.anIntArray306[local27 + 1]);
								continue;
							}
							if (local209 == 3201) {
								local27--;
								Static127.method1922(Static94.anIntArray306[local27]);
								continue;
							}
							if (local209 == 3202) {
								local27 -= 2;
								Static3.method1519(Static94.anIntArray306[local27], Static94.anIntArray306[local27 + 1]);
								continue;
							}
						} else if (local209 < 3400) {
							if (local209 == 3300) {
								Static94.anIntArray306[local27++] = Static78.anInt1981;
								continue;
							}
							if (local209 == 3301) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27 + 1];
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static78.method1407(local772, local760);
								continue;
							}
							if (local209 == 3302) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = Static10.method133(local760, local772);
								continue;
							}
							if (local209 == 3303) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = Static30.method965(local772, local760);
								continue;
							}
							if (local209 == 3304) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static128.method1932(local772).anInt1221;
								continue;
							}
							if (local209 == 3305) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static78.anIntArray266[local772];
								continue;
							}
							if (local209 == 3306) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static8.anIntArray21[local772];
								continue;
							}
							if (local209 == 3307) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static52.anIntArray167[local772];
								continue;
							}
							if (local209 == 3308) {
								local760 = (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1393 >> 7) + Static51.anInt2080;
								local1639 = (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.anInt1416 >> 7) + Static64.anInt1649;
								local772 = Static124.anInt2712;
								Static94.anIntArray306[local27++] = (local760 << 14) + (local772 << 28) + local1639;
								continue;
							}
							if (local209 == 3309) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = local772 >> 14 & 0x3FFF;
								continue;
							}
							if (local209 == 3310) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = local772 >> 28;
								continue;
							}
							if (local209 == 3311) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = local772 & 0x3FFF;
								continue;
							}
							if (local209 == 3312) {
								Static94.anIntArray306[local27++] = Static68.aBoolean108 ? 1 : 0;
								continue;
							}
							if (local209 == 3313) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27] + 32768;
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = Static78.method1407(local772, local760);
								continue;
							}
							if (local209 == 3314) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27 + 1];
								local772 = Static94.anIntArray306[local27] + 32768;
								Static94.anIntArray306[local27++] = Static10.method133(local760, local772);
								continue;
							}
							if (local209 == 3315) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27] + 32768;
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = Static30.method965(local772, local760);
								continue;
							}
							if (local209 == 3316) {
								if (Static129.anInt2759 < 2) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = Static129.anInt2759;
								}
								continue;
							}
							if (local209 == 3317) {
								Static94.anIntArray306[local27++] = Static32.anInt812;
								continue;
							}
							if (local209 == 3318) {
								Static94.anIntArray306[local27++] = Static28.anInt591;
								continue;
							}
							if (local209 == 3321) {
								Static94.anIntArray306[local27++] = Static87.anInt1968;
								continue;
							}
							if (local209 == 3322) {
								Static94.anIntArray306[local27++] = Static39.anInt1126;
								continue;
							}
							if (local209 == 3323) {
								if (Static129.anInt2759 == 1) {
									Static94.anIntArray306[local27++] = 1;
								} else {
									Static94.anIntArray306[local27++] = 0;
								}
								continue;
							}
						} else if (local209 < 3500) {
							if (local209 == 3400) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								@Pc(6082) Class4_Sub4_Sub12 local6082 = Static118.method1799(local772);
								for (local622 = 0; local622 < local6082.anInt2007; local622++) {
									if (local6082.anIntArray279[local622] == local760) {
										Static35.aClass76Array7[local29++] = local6082.aClass76Array22[local622];
										local6082 = null;
										break;
									}
								}
								if (local6082 != null) {
									Static35.aClass76Array7[local29++] = local6082.aClass76_878;
								}
								continue;
							}
							if (local209 == 3408) {
								local27 -= 4;
								local772 = Static94.anIntArray306[local27];
								local1639 = Static94.anIntArray306[local27 + 2];
								local760 = Static94.anIntArray306[local27 + 1];
								local622 = Static94.anIntArray306[local27 + 3];
								@Pc(6148) Class4_Sub4_Sub12 local6148 = Static118.method1799(local1639);
								if (local772 == local6148.anInt2008 && local6148.anInt2001 == local760) {
									for (local1872 = 0; local1872 < local6148.anInt2007; local1872++) {
										if (local6148.anIntArray279[local1872] == local622) {
											if (local760 == 115) {
												Static35.aClass76Array7[local29++] = local6148.aClass76Array22[local1872];
											} else {
												Static94.anIntArray306[local27++] = local6148.anIntArray277[local1872];
											}
											local6148 = null;
											break;
										}
									}
									if (local6148 != null) {
										if (local760 == 115) {
											Static35.aClass76Array7[local29++] = local6148.aClass76_878;
										} else {
											Static94.anIntArray306[local27++] = local6148.anInt2011;
										}
									}
									continue;
								}
								if (local760 == 115) {
									Static35.aClass76Array7[local29++] = Static40.aClass76_480;
								} else {
									Static94.anIntArray306[local27++] = 0;
								}
								continue;
							}
						} else if (local209 < 3700) {
							if (local209 == 3600) {
								if (Static128.anInt2753 == 0) {
									Static94.anIntArray306[local27++] = -2;
								} else if (Static128.anInt2753 == 1) {
									Static94.anIntArray306[local27++] = -1;
								} else {
									Static94.anIntArray306[local27++] = Static104.anInt2337;
								}
								continue;
							}
							if (local209 == 3601) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static128.anInt2753 == 2 && local772 < Static104.anInt2337) {
									Static35.aClass76Array7[local29++] = Static51.aClass76Array23[local772];
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 3602) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static128.anInt2753 == 2 && local772 < Static104.anInt2337) {
									Static94.anIntArray306[local27++] = Static84.anIntArray281[local772];
									continue;
								}
								Static94.anIntArray306[local27++] = 0;
								continue;
							}
							if (local209 == 3603) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static128.anInt2753 == 2 && local772 < Static104.anInt2337) {
									Static94.anIntArray306[local27++] = Static93.anIntArray305[local772];
									continue;
								}
								Static94.anIntArray306[local27++] = 0;
								continue;
							}
							if (local209 == 3604) {
								local27--;
								local760 = Static94.anIntArray306[local27];
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static48.method839(local760, local580);
								continue;
							}
							if (local209 == 3605) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static28.method380(local580.method1872());
								continue;
							}
							if (local209 == 3606) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static5.method70(local580.method1872());
								continue;
							}
							if (local209 == 3607) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static3.method1520(local580.method1872());
								continue;
							}
							if (local209 == 3608) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static69.method1156(local580.method1872());
								continue;
							}
							if (local209 == 3609) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								if (local580.method1869(Static88.aClass76_929) || local580.method1869(Static3.aClass76_983)) {
									local580 = local580.method1874(7);
								}
								Static94.anIntArray306[local27++] = Static94.method1506(local580) ? 1 : 0;
								continue;
							}
							if (local209 == 3611) {
								if (Static59.aClass76_644 == null) {
									Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								} else {
									Static35.aClass76Array7[local29++] = Static59.aClass76_644.method1858();
								}
								continue;
							}
							if (local209 == 3612) {
								if (Static59.aClass76_644 == null) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = Static17.anInt340;
								}
								continue;
							}
							if (local209 == 3613) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static59.aClass76_644 != null && local772 < Static17.anInt340) {
									Static35.aClass76Array7[local29++] = Static27.aClass4_Sub22Array62[local772].aClass76_1144.method1858();
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 3614) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static59.aClass76_644 != null && local772 < Static17.anInt340) {
									Static94.anIntArray306[local27++] = Static27.aClass4_Sub22Array62[local772].anInt2436;
									continue;
								}
								Static94.anIntArray306[local27++] = 0;
								continue;
							}
							if (local209 == 3615) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static59.aClass76_644 != null && Static17.anInt340 > local772) {
									Static94.anIntArray306[local27++] = Static27.aClass4_Sub22Array62[local772].aByte6;
									continue;
								}
								Static94.anIntArray306[local27++] = 0;
								continue;
							}
							if (local209 == 3616) {
								Static94.anIntArray306[local27++] = Static60.aByte2;
								continue;
							}
							if (local209 == 3617) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static77.method1395(local580);
								continue;
							}
							if (local209 == 3618) {
								Static94.anIntArray306[local27++] = Static49.aByte1;
								continue;
							}
							if (local209 == 3619) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static31.method443(local580.method1872());
								continue;
							}
							if (local209 == 3620) {
								Static120.method1804();
								continue;
							}
							if (local209 == 3621) {
								if (Static128.anInt2753 == 0) {
									Static94.anIntArray306[local27++] = -1;
								} else {
									Static94.anIntArray306[local27++] = Static45.anInt1192;
								}
								continue;
							}
							if (local209 == 3622) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static128.anInt2753 != 0 && local772 < Static45.anInt1192) {
									Static35.aClass76Array7[local29++] = Static56.method983(Static31.aLongArray17[local772]).method1858();
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 3623) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								if (local580.method1869(Static88.aClass76_929) || local580.method1869(Static3.aClass76_983)) {
									local580 = local580.method1874(7);
								}
								Static94.anIntArray306[local27++] = Static45.method815(local580) ? 1 : 0;
								continue;
							}
							if (local209 == 3624) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (Static27.aClass4_Sub22Array62 != null && Static17.anInt340 > local772 && Static27.aClass4_Sub22Array62[local772].aClass76_1144.method1882(Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass76_612)) {
									Static94.anIntArray306[local27++] = 1;
									continue;
								}
								Static94.anIntArray306[local27++] = 0;
								continue;
							}
							if (local209 == 3625) {
								if (Static105.aClass76_1100 == null) {
									Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								} else {
									Static35.aClass76Array7[local29++] = Static105.aClass76_1100.method1858();
								}
								continue;
							}
						} else if (local209 < 4100) {
							if (local209 == 4000) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = local760 + local772;
								continue;
							}
							if (local209 == 4001) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = local772 - local760;
								continue;
							}
							if (local209 == 4002) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = local772 * local760;
								continue;
							}
							if (local209 == 4003) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27 + 1];
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = local772 / local760;
								continue;
							}
							if (local209 == 4004) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = (int) ((double) local772 * Math.random());
								continue;
							}
							if (local209 == 4005) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = (int) ((double) (local772 + 1) * Math.random());
								continue;
							}
							if (local209 == 4006) {
								local27 -= 5;
								local1639 = Static94.anIntArray306[local27 + 2];
								local760 = Static94.anIntArray306[local27 + 1];
								local622 = Static94.anIntArray306[local27 + 3];
								local772 = Static94.anIntArray306[local27];
								local648 = Static94.anIntArray306[local27 + 4];
								Static94.anIntArray306[local27++] = local772 + (local648 - local1639) * (local760 + -local772) / (local622 - local1639);
								continue;
							}
							if (local209 == 4007) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = local772 + local772 * local760 / 100;
								continue;
							}
							if (local209 == 4008) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = 0x1 << local760 | local772;
								continue;
							}
							if (local209 == 4009) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = -(0x1 << local760) - 1 & local772;
								continue;
							}
							if (local209 == 4010) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = (0x1 << local760 & local772) == 0 ? 0 : 1;
								continue;
							}
							if (local209 == 4011) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = local772 % local760;
								continue;
							}
							if (local209 == 4012) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								if (local772 == 0) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = (int) Math.pow((double) local772, (double) local760);
								}
								continue;
							}
							if (local209 == 4013) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								if (local772 == 0) {
									Static94.anIntArray306[local27++] = 0;
								} else if (local760 == 0) {
									Static94.anIntArray306[local27++] = Integer.MAX_VALUE;
								} else {
									Static94.anIntArray306[local27++] = (int) Math.pow((double) local772, 1.0D / (double) local760);
								}
								continue;
							}
							if (local209 == 4014) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27 + 1];
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = local772 & local760;
								continue;
							}
							if (local209 == 4015) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								Static94.anIntArray306[local27++] = local772 | local760;
								continue;
							}
						} else if (local209 < 4200) {
							if (local209 == 4100) {
								local27--;
								local760 = Static94.anIntArray306[local27];
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static35.aClass76Array7[local29++] = Static59.method1017(new Class76[] { local580, Static63.method1092(local760) });
								continue;
							}
							if (local209 == 4101) {
								local29 -= 2;
								local1407 = Static35.aClass76Array7[local29 + 1];
								local580 = Static35.aClass76Array7[local29];
								Static35.aClass76Array7[local29++] = Static59.method1017(new Class76[] { local580, local1407 });
								continue;
							}
							if (local209 == 4102) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local27--;
								local760 = Static94.anIntArray306[local27];
								Static35.aClass76Array7[local29++] = Static59.method1017(new Class76[] { local580, Static8.method108(local760) });
								continue;
							}
							if (local209 == 4103) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static35.aClass76Array7[local29++] = local580.method1854();
								continue;
							}
							if (local209 == 4104) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								@Pc(5533) long local5533 = ((long) local772 + 11745L) * 86400000L;
								Static19.aCalendar2.setTime(new Date(local5533));
								local622 = Static19.aCalendar2.get(5);
								local648 = Static19.aCalendar2.get(2);
								local1872 = Static19.aCalendar2.get(1);
								Static35.aClass76Array7[local29++] = Static59.method1017(new Class76[] { Static63.method1092(local622), Static72.aClass76_812, Static78.aClass76Array21[local648], Static72.aClass76_812, Static63.method1092(local1872) });
								continue;
							}
							if (local209 == 4105) {
								local29 -= 2;
								local580 = Static35.aClass76Array7[local29];
								local1407 = Static35.aClass76Array7[local29 + 1];
								if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass26_3 != null && Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass26_3.aBoolean57) {
									Static35.aClass76Array7[local29++] = local1407;
									continue;
								}
								Static35.aClass76Array7[local29++] = local580;
								continue;
							}
							if (local209 == 4106) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static35.aClass76Array7[local29++] = Static63.method1092(local772);
								continue;
							}
							if (local209 == 4107) {
								local29 -= 2;
								Static94.anIntArray306[local27++] = Static35.aClass76Array7[local29].method1863(Static35.aClass76Array7[local29 + 1]);
								continue;
							}
							@Pc(5699) Class4_Sub4_Sub5_Sub3_Sub1 local5699;
							@Pc(5694) byte[] local5694;
							if (local209 == 4108) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local27 -= 2;
								local760 = Static94.anIntArray306[local27];
								local1639 = Static94.anIntArray306[local27 + 1];
								local5694 = Static67.aClass17_Sub1_15.method290(local1639, 0);
								local5699 = new Class4_Sub4_Sub5_Sub3_Sub1(local5694);
								Static94.anIntArray306[local27++] = local5699.method1318(local580, local760);
								continue;
							}
							if (local209 == 4109) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27];
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local1639 = Static94.anIntArray306[local27 + 1];
								local5694 = Static67.aClass17_Sub1_15.method290(local1639, 0);
								local5699 = new Class4_Sub4_Sub5_Sub3_Sub1(local5694);
								Static94.anIntArray306[local27++] = local5699.method1329(local580, local760);
								continue;
							}
							if (local209 == 4110) {
								local29 -= 2;
								local580 = Static35.aClass76Array7[local29];
								local1407 = Static35.aClass76Array7[local29 + 1];
								local27--;
								if (Static94.anIntArray306[local27] == 1) {
									Static35.aClass76Array7[local29++] = local580;
								} else {
									Static35.aClass76Array7[local29++] = local1407;
								}
								continue;
							}
							if (local209 == 4111) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static35.aClass76Array7[local29++] = Static83.method1328(local580);
								continue;
							}
							if (local209 == 4112) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local27--;
								local760 = Static94.anIntArray306[local27];
								Static35.aClass76Array7[local29++] = local580.method1867(local760);
								continue;
							}
							if (local209 == 4113) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static74.method1365(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4114) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static100.method1585(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4115) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static70.method1169(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4116) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static38.method738(local772) ? 1 : 0;
								continue;
							}
							if (local209 == 4117) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								if (local580 == null) {
									Static94.anIntArray306[local27++] = 0;
								} else {
									Static94.anIntArray306[local27++] = local580.method1851();
								}
								continue;
							}
							if (local209 == 4118) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27];
								local1639 = Static94.anIntArray306[local27 + 1];
								local29--;
								local580 = Static35.aClass76Array7[local29];
								Static35.aClass76Array7[local29++] = local580.method1876(local1639, local760);
								continue;
							}
							if (local209 == 4119) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local1407 = Static52.method942(local580.method1851());
								@Pc(5982) boolean local5982 = false;
								for (local622 = 0; local580.method1851() > local622; local622++) {
									local648 = local580.method1860(local622);
									if (local648 == 60) {
										local5982 = true;
									} else if (local648 == 62) {
										local5982 = false;
									} else if (!local5982) {
										local1407.method1888(local648);
									}
								}
								local1407.method1855();
								Static35.aClass76Array7[local29++] = local1407;
								continue;
							}
							if (local209 == 4120) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local27--;
								local760 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = local580.method1859(local760);
								continue;
							}
						} else if (local209 < 4300) {
							if (local209 == 4200) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static35.aClass76Array7[local29++] = Static61.method1040(local772).aClass76_556;
								continue;
							}
							@Pc(4209) Class4_Sub4_Sub7 local4209;
							if (local209 == 4201) {
								local27 -= 2;
								local772 = Static94.anIntArray306[local27];
								local760 = Static94.anIntArray306[local27 + 1];
								local4209 = Static61.method1040(local772);
								if (local760 >= 1 && local760 <= 5 && local4209.aClass76Array11[local760 - 1] != null) {
									Static35.aClass76Array7[local29++] = local4209.aClass76Array11[local760 - 1];
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 4202) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27 + 1];
								local772 = Static94.anIntArray306[local27];
								local4209 = Static61.method1040(local772);
								if (local760 >= 1 && local760 <= 5 && local4209.aClass76Array10[local760 - 1] != null) {
									Static35.aClass76Array7[local29++] = local4209.aClass76Array10[local760 - 1];
									continue;
								}
								Static35.aClass76Array7[local29++] = Static13.aClass76_101;
								continue;
							}
							if (local209 == 4203) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static61.method1040(local772).anInt1291;
								continue;
							}
							if (local209 == 4204) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static61.method1040(local772).anInt1270 == 1 ? 1 : 0;
								continue;
							}
							@Pc(4350) Class4_Sub4_Sub7 local4350;
							if (local209 == 4205) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								local4350 = Static61.method1040(local772);
								if (local4350.anInt1262 == -1 && local4350.anInt1276 >= 0) {
									Static94.anIntArray306[local27++] = local4350.anInt1276;
									continue;
								}
								Static94.anIntArray306[local27++] = local772;
								continue;
							}
							if (local209 == 4206) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								local4350 = Static61.method1040(local772);
								if (local4350.anInt1262 >= 0 && local4350.anInt1276 >= 0) {
									Static94.anIntArray306[local27++] = local4350.anInt1276;
									continue;
								}
								Static94.anIntArray306[local27++] = local772;
								continue;
							}
							if (local209 == 4207) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								Static94.anIntArray306[local27++] = Static61.method1040(local772).aBoolean75 ? 1 : 0;
								continue;
							}
						} else if (local209 < 5100) {
							if (local209 == 5000) {
								Static94.anIntArray306[local27++] = Static21.anInt501;
								continue;
							}
							if (local209 == 5001) {
								local27 -= 3;
								Static21.anInt501 = Static94.anIntArray306[local27];
								Static45.anInt1195 = Static94.anIntArray306[local27 + 1];
								Static26.anInt573 = Static94.anIntArray306[local27 + 2];
								Static69.aClass4_Sub10_Sub1_2.method611(121);
								Static69.aClass4_Sub10_Sub1_2.method600(Static21.anInt501);
								Static69.aClass4_Sub10_Sub1_2.method600(Static45.anInt1195);
								Static69.aClass4_Sub10_Sub1_2.method600(Static26.anInt573);
								continue;
							}
							if (local209 == 5002) {
								local27 -= 2;
								local760 = Static94.anIntArray306[local27];
								local29--;
								local580 = Static35.aClass76Array7[local29];
								local1639 = Static94.anIntArray306[local27 + 1];
								Static69.aClass4_Sub10_Sub1_2.method611(147);
								Static69.aClass4_Sub10_Sub1_2.method555(local580.method1872());
								Static69.aClass4_Sub10_Sub1_2.method600(local760 - 1);
								Static69.aClass4_Sub10_Sub1_2.method600(local1639);
								continue;
							}
							if (local209 == 5003) {
								local1407 = null;
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (local772 < 100) {
									local1407 = Static64.aClass76Array16[local772];
								}
								if (local1407 == null) {
									local1407 = Static13.aClass76_101;
								}
								Static35.aClass76Array7[local29++] = local1407;
								continue;
							}
							if (local209 == 5004) {
								local760 = -1;
								local27--;
								local772 = Static94.anIntArray306[local27];
								if (local772 < 100 && Static64.aClass76Array16[local772] != null) {
									local760 = Static78.anIntArray267[local772];
								}
								Static94.anIntArray306[local27++] = local760;
								continue;
							}
							if (local209 == 5005) {
								Static94.anIntArray306[local27++] = Static45.anInt1195;
								continue;
							}
							if (local209 == 5008) {
								local29--;
								local580 = Static35.aClass76Array7[local29];
								if (local580.method1869(Static59.aClass76_643)) {
									Static104.method1604(local580);
								} else {
									local1407 = local580.method1854();
									@Pc(4642) byte local4642 = 0;
									@Pc(4644) byte local4644 = 0;
									if (local1407.method1869(Static69.aClass76_743)) {
										local4644 = 0;
										local580 = local580.method1874(Static69.aClass76_743.method1851());
									} else if (local1407.method1869(Static27.aClass76_1313)) {
										local580 = local580.method1874(Static27.aClass76_1313.method1851());
										local4644 = 1;
									} else if (local1407.method1869(Static90.aClass76_947)) {
										local580 = local580.method1874(Static90.aClass76_947.method1851());
										local4644 = 2;
									} else if (local1407.method1869(Static51.aClass76_920)) {
										local4644 = 3;
										local580 = local580.method1874(Static51.aClass76_920.method1851());
									} else if (local1407.method1869(Static51.aClass76_916)) {
										local580 = local580.method1874(Static51.aClass76_916.method1851());
										local4644 = 4;
									} else if (local1407.method1869(Static9.aClass76_73)) {
										local4644 = 5;
										local580 = local580.method1874(Static9.aClass76_73.method1851());
									} else if (local1407.method1869(Static63.aClass76_680)) {
										local4644 = 6;
										local580 = local580.method1874(Static63.aClass76_680.method1851());
									} else if (local1407.method1869(Static38.aClass76_466)) {
										local4644 = 7;
										local580 = local580.method1874(Static38.aClass76_466.method1851());
									} else if (local1407.method1869(Static14.aClass76_119)) {
										local4644 = 8;
										local580 = local580.method1874(Static14.aClass76_119.method1851());
									} else if (local1407.method1869(Static18.aClass76_156)) {
										local580 = local580.method1874(Static18.aClass76_156.method1851());
										local4644 = 9;
									} else if (local1407.method1869(Static45.aClass76_519)) {
										local4644 = 10;
										local580 = local580.method1874(Static45.aClass76_519.method1851());
									} else if (local1407.method1869(Static122.aClass76_1247)) {
										local580 = local580.method1874(Static122.aClass76_1247.method1851());
										local4644 = 11;
									} else if (Static55.anInt1445 != 0) {
										if (local1407.method1869(Static69.aClass76_744)) {
											local4644 = 0;
											local580 = local580.method1874(Static69.aClass76_744.method1851());
										} else if (local1407.method1869(Static27.aClass76_1315)) {
											local4644 = 1;
											local580 = local580.method1874(Static27.aClass76_1315.method1851());
										} else if (local1407.method1869(Static90.aClass76_941)) {
											local4644 = 2;
											local580 = local580.method1874(Static90.aClass76_941.method1851());
										} else if (local1407.method1869(Static51.aClass76_923)) {
											local580 = local580.method1874(Static51.aClass76_923.method1851());
											local4644 = 3;
										} else if (local1407.method1869(Static51.aClass76_921)) {
											local4644 = 4;
											local580 = local580.method1874(Static51.aClass76_921.method1851());
										} else if (local1407.method1869(Static9.aClass76_71)) {
											local580 = local580.method1874(Static9.aClass76_71.method1851());
											local4644 = 5;
										} else if (local1407.method1869(Static63.aClass76_679)) {
											local4644 = 6;
											local580 = local580.method1874(Static63.aClass76_679.method1851());
										} else if (local1407.method1869(Static38.aClass76_464)) {
											local4644 = 7;
											local580 = local580.method1874(Static38.aClass76_464.method1851());
										} else if (local1407.method1869(Static14.aClass76_116)) {
											local580 = local580.method1874(Static14.aClass76_116.method1851());
											local4644 = 8;
										} else if (local1407.method1869(Static18.aClass76_158)) {
											local4644 = 9;
											local580 = local580.method1874(Static18.aClass76_158.method1851());
										} else if (local1407.method1869(Static45.aClass76_523)) {
											local4644 = 10;
											local580 = local580.method1874(Static45.aClass76_523.method1851());
										} else if (local1407.method1869(Static122.aClass76_1241)) {
											local580 = local580.method1874(Static122.aClass76_1241.method1851());
											local4644 = 11;
										}
									}
									local1407 = local580.method1854();
									if (local1407.method1869(Static102.aClass76_1082)) {
										local4642 = 1;
										local580 = local580.method1874(Static102.aClass76_1082.method1851());
									} else if (local1407.method1869(Static13.aClass76_109)) {
										local4642 = 2;
										local580 = local580.method1874(Static13.aClass76_109.method1851());
									} else if (local1407.method1869(Static90.aClass76_945)) {
										local4642 = 3;
										local580 = local580.method1874(Static90.aClass76_945.method1851());
									} else if (local1407.method1869(Static87.aClass76_843)) {
										local4642 = 4;
										local580 = local580.method1874(Static87.aClass76_843.method1851());
									} else if (local1407.method1869(Static82.aClass76_889)) {
										local4642 = 5;
										local580 = local580.method1874(Static82.aClass76_889.method1851());
									} else if (Static55.anInt1445 != 0) {
										if (local1407.method1869(Static102.aClass76_1085)) {
											local580 = local580.method1874(Static102.aClass76_1085.method1851());
											local4642 = 1;
										} else if (local1407.method1869(Static13.aClass76_106)) {
											local4642 = 2;
											local580 = local580.method1874(Static13.aClass76_106.method1851());
										} else if (local1407.method1869(Static90.aClass76_939)) {
											local4642 = 3;
											local580 = local580.method1874(Static90.aClass76_939.method1851());
										} else if (local1407.method1869(Static87.aClass76_842)) {
											local4642 = 4;
											local580 = local580.method1874(Static87.aClass76_842.method1851());
										} else if (local1407.method1869(Static82.aClass76_887)) {
											local580 = local580.method1874(Static82.aClass76_887.method1851());
											local4642 = 5;
										}
									}
									Static69.aClass4_Sub10_Sub1_2.method611(226);
									Static69.aClass4_Sub10_Sub1_2.method600(0);
									local648 = Static69.aClass4_Sub10_Sub1_2.anInt931;
									Static69.aClass4_Sub10_Sub1_2.method600(local4644);
									Static69.aClass4_Sub10_Sub1_2.method600(local4642);
									Static39.method768(Static69.aClass4_Sub10_Sub1_2, local580);
									Static69.aClass4_Sub10_Sub1_2.method558(Static69.aClass4_Sub10_Sub1_2.anInt931 - local648);
								}
								continue;
							}
							if (local209 == 5009) {
								local29 -= 2;
								local580 = Static35.aClass76Array7[local29];
								local1407 = Static35.aClass76Array7[local29 + 1];
								Static69.aClass4_Sub10_Sub1_2.method611(179);
								Static69.aClass4_Sub10_Sub1_2.method600(0);
								local1639 = Static69.aClass4_Sub10_Sub1_2.anInt931;
								Static69.aClass4_Sub10_Sub1_2.method555(local580.method1872());
								Static39.method768(Static69.aClass4_Sub10_Sub1_2, local1407);
								Static69.aClass4_Sub10_Sub1_2.method558(Static69.aClass4_Sub10_Sub1_2.anInt931 - local1639);
								continue;
							}
							if (local209 == 5010) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								local1407 = null;
								if (local772 < 100) {
									local1407 = Static35.aClass76Array8[local772];
								}
								if (local1407 == null) {
									local1407 = Static13.aClass76_101;
								}
								Static35.aClass76Array7[local29++] = local1407;
								continue;
							}
							if (local209 == 5011) {
								local27--;
								local772 = Static94.anIntArray306[local27];
								local1407 = null;
								if (local772 < 100) {
									local1407 = Static110.aClass76Array25[local772];
								}
								if (local1407 == null) {
									local1407 = Static13.aClass76_101;
								}
								Static35.aClass76Array7[local29++] = local1407;
								continue;
							}
							if (local209 == 5015) {
								if (Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1 == null || Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass76_612 == null) {
									local580 = Static111.aClass76_1146;
								} else {
									local580 = Static96.aClass4_Sub4_Sub3_Sub1_Sub2_1.aClass76_612;
								}
								Static35.aClass76Array7[local29++] = local580;
								continue;
							}
							if (local209 == 5016) {
								Static94.anIntArray306[local27++] = Static26.anInt573;
								continue;
							}
							if (local209 == 5017) {
								Static94.anIntArray306[local27++] = Static73.anInt1892;
								continue;
							}
						}
					}
				} else {
					if (local209 >= 2000) {
						local209 -= 1000;
						local27--;
						local973 = Static52.method946(Static94.anIntArray306[local27]);
					} else {
						local973 = local937 ? Static42.aClass4_Sub8_9 : Static48.aClass4_Sub8_10;
					}
					if (local209 == 1000) {
						local27 -= 2;
						local973.anInt457 = Static94.anIntArray306[local27];
						local973.anInt491 = Static94.anIntArray306[local27 + 1];
						Static63.method1095(local973);
						continue;
					}
					if (local209 == 1001) {
						local27 -= 2;
						local973.anInt513 = Static94.anIntArray306[local27];
						local973.anInt498 = Static94.anIntArray306[local27 + 1];
						Static63.method1095(local973);
						continue;
					}
					if (local209 == 1003) {
						local27--;
						@Pc(1042) boolean local1042 = Static94.anIntArray306[local27] == 1;
						if (local1042 != local973.aBoolean39) {
							local973.aBoolean39 = local1042;
							Static63.method1095(local973);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(7098) Exception local7098) {
			if (local20.aClass76_1026 == null) {
				if (Static21.anInt508 != 0) {
					Static21.method328(0, Static13.aClass76_101, Static128.aClass76_1294);
				}
				Static102.method1593("CS2 - scr:" + local20.aLong99 + " op:" + local39, local7098);
			} else {
				@Pc(7131) Class76 local7131 = Static52.method942(30);
				local7131.method1856(Static69.aClass76_742).method1856(local20.aClass76_1026);
				for (local57 = Static100.anInt2293 - 1; local57 >= 0; local57--) {
					local7131.method1856(Static43.aClass76_140).method1856(Static134.aClass41Array1[local57].aClass4_Sub4_Sub14_1.aClass76_1026);
				}
				if (local39 == 40) {
					local70 = local34[local31];
					local7131.method1856(Static78.aClass76_855).method1856(Static63.method1092(local70));
				}
				if (Static21.anInt508 != 0) {
					Static21.method328(0, Static13.aClass76_101, Static59.method1017(new Class76[] { Static6.aClass76_51, local20.aClass76_1026 }));
				}
				Static102.method1593("CS2 - scr:" + local20.aLong99 + " op:" + local39 + new String(local7131.method1866()), local7098);
			}
		}
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(B)V")
	public static void method310() {
		if (Static74.aClass3_2 != null) {
			Static74.aClass3_2.method1532();
		}
		if (Static12.aClass3_1 != null) {
			Static12.aClass3_1.method1532();
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([BI)[B")
	public static byte[] method311(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static135.method111(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method313(@OriginalArg(1) Class4_Sub4_Sub3_Sub1 arg0) {
		if (arg0.anInt1431 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (arg0.anInt1405 != -1 && arg0.anInt1405 < 32768) {
			@Pc(25) Class4_Sub4_Sub3_Sub1_Sub1 local25 = Static29.aClass4_Sub4_Sub3_Sub1_Sub1Array1[arg0.anInt1405];
			if (local25 != null) {
				local34 = arg0.anInt1393 - local25.anInt1393;
				local41 = arg0.anInt1416 - local25.anInt1416;
				if (local34 != 0 || local41 != 0) {
					arg0.anInt1409 = (int) (Math.atan2((double) local34, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(71) int local71;
		if (arg0.anInt1405 >= 32768) {
			local71 = arg0.anInt1405 - 32768;
			if (local71 == Static41.anInt1148) {
				local71 = 2047;
			}
			@Pc(80) Class4_Sub4_Sub3_Sub1_Sub2 local80 = Static105.aClass4_Sub4_Sub3_Sub1_Sub2Array1[local71];
			if (local80 != null) {
				@Pc(89) int local89 = arg0.anInt1416 - local80.anInt1416;
				local41 = arg0.anInt1393 - local80.anInt1393;
				if (local41 != 0 || local89 != 0) {
					arg0.anInt1409 = (int) (Math.atan2((double) local41, (double) local89) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt1414 != 0 || arg0.anInt1418 != 0) && (arg0.anInt1434 == 0 || arg0.anInt1421 > 0)) {
			local71 = arg0.anInt1393 - (arg0.anInt1414 - Static51.anInt2080 - Static51.anInt2080) * 64;
			local34 = arg0.anInt1416 - (arg0.anInt1418 - Static64.anInt1649 - Static64.anInt1649) * 64;
			if (local71 != 0 || local34 != 0) {
				arg0.anInt1409 = (int) (Math.atan2((double) local71, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt1414 = 0;
			arg0.anInt1418 = 0;
		}
		local71 = arg0.anInt1409 - arg0.anInt1395 & 0x7FF;
		if (local71 == 0) {
			arg0.anInt1433 = 0;
			return;
		}
		arg0.anInt1433++;
		@Pc(222) boolean local222;
		if (local71 <= 1024) {
			arg0.anInt1395 += arg0.anInt1431;
			local222 = true;
			if (arg0.anInt1431 > local71 || 2048 - arg0.anInt1431 < local71) {
				local222 = false;
				arg0.anInt1395 = arg0.anInt1409;
			}
			if (arg0.anInt1432 == arg0.anInt1389 && (arg0.anInt1433 > 25 || local222)) {
				if (arg0.anInt1430 == -1) {
					arg0.anInt1432 = arg0.anInt1435;
				} else {
					arg0.anInt1432 = arg0.anInt1430;
				}
			}
		} else {
			arg0.anInt1395 -= arg0.anInt1431;
			local222 = true;
			if (local71 < arg0.anInt1431 || local71 > 2048 - arg0.anInt1431) {
				local222 = false;
				arg0.anInt1395 = arg0.anInt1409;
			}
			if (arg0.anInt1432 == arg0.anInt1389 && (arg0.anInt1433 > 25 || local222)) {
				if (arg0.anInt1384 == -1) {
					arg0.anInt1432 = arg0.anInt1435;
				} else {
					arg0.anInt1432 = arg0.anInt1384;
				}
			}
		}
		arg0.anInt1395 &= 0x7FF;
	}
}
