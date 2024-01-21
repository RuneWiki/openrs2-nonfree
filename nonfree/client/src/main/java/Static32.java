import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static32 {

	@OriginalMember(owner = "client!fd", name = "sb", descriptor = "[I")
	public static int[] anIntArray113 = new int[] { 32, 40, 15, 10, 34, 36, 51, 8 };

	@OriginalMember(owner = "client!fd", name = "Ab", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!fd", name = "Bb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_489 = Static106.method1849("<col=ffff00>");

	@OriginalMember(owner = "client!fd", name = "Eb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_490 = Static106.method1849("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!fd", name = "Fb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_491 = Static106.method1849("Mem:");

	@OriginalMember(owner = "client!fd", name = "Hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_492 = Static106.method1849("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!fd", name = "Kb", descriptor = "I")
	public static int anInt846 = 0;

	@OriginalMember(owner = "client!fd", name = "Nb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_493 = aClass66_490;

	@OriginalMember(owner = "client!fd", name = "Ob", descriptor = "J")
	public static long aLong35 = 0L;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Lclient!sc;")
	public static Class66 method621(@OriginalArg(1) int arg0) {
		return Static84.aClass66Array18[arg0].method1847() > 0 ? Static41.method897(new Class66[] { Static97.aClass66Array21[arg0], Static50.aClass66_846, Static84.aClass66Array18[arg0] }) : Static97.aClass66Array21[arg0];
	}

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V")
	public static void method622() {
		while (true) {
			if (Static133.aClass1_Sub12_Sub1_3.method1230(Static105.anInt2602) >= 27) {
				@Pc(12) int local12 = Static133.aClass1_Sub12_Sub1_3.method1232(15);
				if (local12 != 32767) {
					@Pc(19) boolean local19 = false;
					if (Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local12] == null) {
						local19 = true;
						Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local12] = new Class1_Sub1_Sub1_Sub5_Sub1();
					}
					@Pc(35) Class1_Sub1_Sub1_Sub5_Sub1 local35 = Static73.aClass1_Sub1_Sub1_Sub5_Sub1Array3[local12];
					Static54.anIntArray248[Static33.anInt854++] = local12;
					local35.anInt1285 = Static22.anInt636;
					@Pc(53) int local53 = Static80.anIntArray355[Static133.aClass1_Sub12_Sub1_3.method1232(3)];
					if (local19) {
						local35.anInt1269 = local35.anInt1290 = local53;
					}
					@Pc(66) int local66 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
					@Pc(71) int local71 = Static133.aClass1_Sub12_Sub1_3.method1232(1);
					if (local71 == 1) {
						Static44.anIntArray207[Static101.anInt2503++] = local12;
					}
					@Pc(87) int local87 = Static133.aClass1_Sub12_Sub1_3.method1232(5);
					if (local87 > 15) {
						local87 -= 32;
					}
					local35.aClass1_Sub1_Sub5_1 = Static55.method1238(Static133.aClass1_Sub12_Sub1_3.method1232(14));
					@Pc(104) int local104 = Static133.aClass1_Sub12_Sub1_3.method1232(5);
					if (local104 > 15) {
						local104 -= 32;
					}
					local35.anInt1289 = local35.aClass1_Sub1_Sub5_1.anInt1477;
					local35.anInt1296 = local35.aClass1_Sub1_Sub5_1.anInt1468;
					local35.anInt1248 = local35.aClass1_Sub1_Sub5_1.anInt1474;
					local35.anInt1250 = local35.aClass1_Sub1_Sub5_1.anInt1479;
					local35.anInt1276 = local35.aClass1_Sub1_Sub5_1.anInt1486;
					local35.anInt1243 = local35.aClass1_Sub1_Sub5_1.anInt1471;
					local35.anInt1288 = local35.aClass1_Sub1_Sub5_1.anInt1470;
					local35.anInt1262 = local35.aClass1_Sub1_Sub5_1.anInt1463;
					local35.anInt1291 = local35.aClass1_Sub1_Sub5_1.anInt1484;
					if (local35.anInt1243 == 0) {
						local35.anInt1290 = 0;
					}
					local35.method929(local104 + Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray191[0], local66 == 1, local87 + Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anIntArray189[0]);
					continue;
				}
			}
			Static133.aClass1_Sub12_Sub1_3.method1231();
			return;
		}
	}

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "(I)V")
	public static void method623() {
		aClass66_491 = null;
		aClass66_489 = null;
		aClass66_493 = null;
		aClass66_492 = null;
		aClass66_490 = null;
		anIntArray113 = null;
	}

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(B)V")
	public static void method624() {
		for (@Pc(12) int local12 = 0; local12 < Static44.anInt1408; local12++) {
			@Pc(18) int local18 = Static50.anIntArray237[local12]--;
			if (Static50.anIntArray237[local12] >= -10) {
				@Pc(89) Class11 local89 = Static74.aClass11Array1[local12];
				if (local89 == null) {
					local89 = Static137.method389(Static86.aClass5_Sub1_23, Static120.anIntArray482[local12], 0);
					if (local89 == null) {
						continue;
					}
					Static50.anIntArray237[local12] += local89.method387();
					Static74.aClass11Array1[local12] = local89;
				}
				if (Static50.anIntArray237[local12] < 0) {
					@Pc(123) int local123;
					if (Static87.anIntArray388[local12] == 0) {
						local123 = Static40.anInt1254;
					} else {
						@Pc(133) int local133 = (Static87.anIntArray388[local12] & 0xFF) * 128;
						@Pc(141) int local141 = Static87.anIntArray388[local12] >> 16 & 0xFF;
						@Pc(151) int local151 = local141 * 128 + 64 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1261;
						if (local151 < 0) {
							local151 = -local151;
						}
						@Pc(164) int local164 = Static87.anIntArray388[local12] >> 8 & 0xFF;
						@Pc(174) int local174 = local164 * 128 + 64 - Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.anInt1271;
						if (local174 < 0) {
							local174 = -local174;
						}
						@Pc(185) int local185 = local174 + local151 - 128;
						if (local133 < local185) {
							Static50.anIntArray237[local12] = -100;
							continue;
						}
						if (local185 < 0) {
							local185 = 0;
						}
						local123 = (local133 - local185) * Static119.anInt2780 / local133;
					}
					if (local123 > 0) {
						@Pc(218) Class1_Sub14_Sub1 local218 = local89.method388().method1932(Static58.aClass12_1);
						@Pc(223) Class1_Sub9_Sub4 local223 = Static140.method1568(local218, local123);
						local223.method1575(Static47.anIntArray225[local12] - 1);
						Static73.aClass1_Sub9_Sub2_3.method1016(local223);
					}
					Static50.anIntArray237[local12] = -100;
				}
			} else {
				Static44.anInt1408--;
				for (@Pc(32) int local32 = local12; local32 < Static44.anInt1408; local32++) {
					Static120.anIntArray482[local32] = Static120.anIntArray482[local32 + 1];
					Static74.aClass11Array1[local32] = Static74.aClass11Array1[local32 + 1];
					Static47.anIntArray225[local32] = Static47.anIntArray225[local32 + 1];
					Static50.anIntArray237[local32] = Static50.anIntArray237[local32 + 1];
					Static87.anIntArray388[local32] = Static87.anIntArray388[local32 + 1];
				}
				local12--;
			}
		}
		if (Static53.aBoolean68 && !Static39.method819()) {
			if (Static124.anInt2862 != 0 && Static117.anInt2749 != -1) {
				Static63.method1352(0, Static28.aClass5_Sub1_8, Static117.anInt2749, Static124.anInt2862);
			}
			Static53.aBoolean68 = false;
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
	public static void method625() {
		Static108.aClass60_13.method1747();
		Static51.aClass60_53.method1747();
		Static89.aClass60_71.method1747();
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method626(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class1_Sub4 local7 = null;
		for (@Pc(26) Class1_Sub4 local26 = (Class1_Sub4) Static71.aClass61_12.method1748(); local26 != null; local26 = (Class1_Sub4) Static71.aClass61_12.method1760()) {
			if (arg0 == local26.anInt443 && arg4 == local26.anInt437 && local26.anInt429 == arg6 && arg3 == local26.anInt441) {
				local7 = local26;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class1_Sub4();
			local7.anInt429 = arg6;
			local7.anInt443 = arg0;
			local7.anInt441 = arg3;
			local7.anInt437 = arg4;
			Static6.method271(local7);
			Static71.aClass61_12.method1754(local7);
		}
		local7.anInt440 = arg5;
		local7.anInt433 = arg1;
		local7.anInt436 = arg2;
		local7.anInt428 = arg8;
		local7.anInt434 = arg7;
	}
}
