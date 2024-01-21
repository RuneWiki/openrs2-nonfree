import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2 aClass4_Sub3_Sub6_Sub2_1;

	@OriginalMember(owner = "client!ad", name = "p", descriptor = "Lclient!jb;")
	public static Class37 aClass37_1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
	public static int anInt56 = 0;

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "Lclient!od;")
	public static Class60 aClass60_25 = Static41.method597("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!ad", name = "f", descriptor = "Lclient!od;")
	private static Class60 aClass60_27 = Static41.method597("Take");

	@OriginalMember(owner = "client!ad", name = "d", descriptor = "Lclient!od;")
	public static Class60 aClass60_26 = aClass60_27;

	@OriginalMember(owner = "client!ad", name = "g", descriptor = "Lclient!od;")
	public static Class60 aClass60_28 = Static41.method597("Lade Sprites )2 ");

	@OriginalMember(owner = "client!ad", name = "j", descriptor = "Lclient!od;")
	public static Class60 aClass60_29 = Static41.method597("Ausw-=hlen");

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!od;")
	public static Class60 aClass60_30 = Static41.method597("Neuer Benutzer");

	@OriginalMember(owner = "client!ad", name = "m", descriptor = "I")
	public static int anInt61 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
	public static void method46() {
		@Pc(7) int local7 = Static22.anInt800;
		@Pc(9) int local9 = Static60.anInt2966;
		@Pc(11) int local11 = Static25.anInt848;
		@Pc(13) int local13 = Static48.anInt1182;
		Static34.method1649(local9, local13, local7, local11, 6116423);
		Static34.method1649(local9 + 1, local13 + 1, local7 - 2, 16, 0);
		Static34.method1650(local9 + 1, local13 - -18, local7 - 2, local11 + -19, 0);
		Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1204(Static33.aClass60_335, local9 + 3, local13 - -14, 6116423, -1);
		@Pc(68) int local68 = Static85.anInt2015;
		@Pc(70) int local70 = Static36.anInt1006;
		for (@Pc(72) int local72 = 0; local72 < Static48.anInt1184; local72++) {
			@Pc(88) int local88 = local13 + (-local72 + (Static48.anInt1184 - 1)) * 15 + 31;
			@Pc(90) int local90 = 16777215;
			if (local70 > local9 && local9 + local7 > local70 && local88 - 13 < local68 && local68 < local88 + 3) {
				local90 = 16776960;
			}
			Static31.aClass4_Sub3_Sub6_Sub1_Sub1_3.method1204(Static48.method668(local72), local9 + 3, local88, local90, 0);
		}
		Static90.method1470(Static25.anInt848, Static48.anInt1182, Static22.anInt800, Static60.anInt2966);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V")
	public static void method47() {
		aClass60_25 = null;
		aClass4_Sub3_Sub6_Sub2_1 = null;
		aClass60_29 = null;
		aClass60_27 = null;
		aClass37_1 = null;
		aClass60_26 = null;
		aClass60_30 = null;
		aClass60_28 = null;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ia;B)V")
	public static void method48(@OriginalArg(0) Class4_Sub3_Sub1_Sub2 arg0) {
		arg0.aBoolean44 = false;
		@Pc(18) Class4_Sub3_Sub10 local18;
		if (arg0.anInt1389 != -1) {
			local18 = Static7.method63(arg0.anInt1389);
			if (local18 == null || local18.anIntArray216 == null) {
				arg0.anInt1389 = -1;
			} else {
				arg0.anInt1391++;
				if (local18.anIntArray216.length > arg0.anInt1421 && arg0.anInt1391 > local18.anIntArray218[arg0.anInt1421]) {
					arg0.anInt1421++;
					arg0.anInt1391 = 1;
					Static46.method643(arg0.anInt1407, arg0.anInt1421, arg0.anInt1440, local18);
				}
				if (local18.anIntArray216.length <= arg0.anInt1421) {
					arg0.anInt1421 = 0;
					arg0.anInt1391 = 0;
					Static46.method643(arg0.anInt1407, arg0.anInt1421, arg0.anInt1440, local18);
				}
			}
		}
		if (arg0.anInt1416 != -1 && arg0.anInt1436 <= Static118.anInt2741) {
			if (arg0.anInt1431 < 0) {
				arg0.anInt1431 = 0;
			}
			@Pc(120) int local120 = Static46.method642(arg0.anInt1416).anInt795;
			if (local120 == -1) {
				arg0.anInt1416 = -1;
			} else {
				@Pc(128) Class4_Sub3_Sub10 local128 = Static7.method63(local120);
				if (local128 == null || local128.anIntArray216 == null) {
					arg0.anInt1416 = -1;
				} else {
					arg0.anInt1420++;
					if (local128.anIntArray216.length > arg0.anInt1431 && local128.anIntArray218[arg0.anInt1431] < arg0.anInt1420) {
						arg0.anInt1431++;
						arg0.anInt1420 = 1;
						Static46.method643(arg0.anInt1407, arg0.anInt1431, arg0.anInt1440, local128);
					}
					if (local128.anIntArray216.length <= arg0.anInt1431 && (arg0.anInt1431 < 0 || local128.anIntArray216.length <= arg0.anInt1431)) {
						arg0.anInt1416 = -1;
					}
				}
			}
		}
		if (arg0.anInt1408 != -1 && arg0.anInt1411 <= 1) {
			local18 = Static7.method63(arg0.anInt1408);
			if (local18.anInt1868 == 1 && arg0.anInt1396 > 0 && arg0.anInt1425 <= Static118.anInt2741 && Static118.anInt2741 > arg0.anInt1446) {
				arg0.anInt1411 = 1;
				return;
			}
		}
		if (arg0.anInt1408 != -1 && arg0.anInt1411 == 0) {
			local18 = Static7.method63(arg0.anInt1408);
			if (local18 == null || local18.anIntArray216 == null) {
				arg0.anInt1408 = -1;
			} else {
				arg0.anInt1424++;
				if (arg0.anInt1409 < local18.anIntArray216.length && local18.anIntArray218[arg0.anInt1409] < arg0.anInt1424) {
					arg0.anInt1424 = 1;
					arg0.anInt1409++;
					Static46.method643(arg0.anInt1407, arg0.anInt1409, arg0.anInt1440, local18);
				}
				if (arg0.anInt1409 >= local18.anIntArray216.length) {
					arg0.anInt1383++;
					arg0.anInt1409 -= local18.anInt1873;
					if (local18.anInt1879 <= arg0.anInt1383) {
						arg0.anInt1408 = -1;
					} else if (arg0.anInt1409 >= 0 && local18.anIntArray216.length > arg0.anInt1409) {
						Static46.method643(arg0.anInt1407, arg0.anInt1409, arg0.anInt1440, local18);
					} else {
						arg0.anInt1408 = -1;
					}
				}
				arg0.aBoolean44 = local18.aBoolean66;
			}
		}
		if (arg0.anInt1411 > 0) {
			arg0.anInt1411--;
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method49() {
		Static35.aClass25_1.anInt1061 = 0;
		Static39.anInt1046 = 0;
		Static97.aBoolean83 = true;
		Static109.aLong85 = 0L;
		Static33.aBoolean38 = true;
		Static85.method1372();
		Static16.anInt552 = 0;
		Static48.anInt1184 = 0;
		Static28.anInt2006 = 0;
		Static12.aBoolean107 = false;
		Static98.anInt2287 = 0;
		Static28.anInt2004 = -1;
		Static79.anInt1904 = -1;
		Static40.anInt1058 = -1;
		Static14.aClass4_Sub9_Sub1_1.anInt1312 = 0;
		Static48.anInt1175 = 0;
		Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
		Static26.anInt855 = -1;
		Static22.method419(0);
		for (@Pc(1941) int local1941 = 0; local1941 < 100; local1941++) {
			Static62.aClass60Array8[local1941] = null;
		}
		Static116.anInt2704 = 0;
		Static125.anInt2830 = 0;
		Static79.anInt1896 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static50.anInt1418 = (int) (Math.random() * 110.0D) - 55;
		Static106.anInt2495 = 0;
		Static36.anInt1010 = 0;
		Static86.aBoolean71 = false;
		Static44.anInt2167 = 0;
		Static12.anInt2546 = (int) (Math.random() * 100.0D) - 50;
		Static29.anInt897 = 0;
		Static127.anInt1133 = 0;
		Static130.anInt2896 = (int) (Math.random() * 80.0D) - 40;
		Static62.anInt1585 = (int) (Math.random() * 120.0D) - 60;
		Static118.anInt2731 = 0;
		Static117.anInt2725 = -1;
		Static116.anInt2717 = (int) (Math.random() * 30.0D) - 20;
		for (@Pc(2025) int local2025 = 0; local2025 < 2048; local2025++) {
			Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local2025] = null;
			Static65.aClass4_Sub9Array1[local2025] = null;
		}
		for (@Pc(2041) int local2041 = 0; local2041 < 32768; local2041++) {
			Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local2041] = null;
		}
		Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[2047] = new Class4_Sub3_Sub1_Sub2_Sub1();
		Static69.aClass45_13.method984();
		Static66.aClass45_12.method984();
		@Pc(2071) int local2071;
		@Pc(2075) int local2075;
		for (@Pc(2067) int local2067 = 0; local2067 < 4; local2067++) {
			for (local2071 = 0; local2071 < 104; local2071++) {
				for (local2075 = 0; local2075 < 104; local2075++) {
					Static48.aClass45ArrayArrayArray1[local2067][local2071][local2075] = null;
				}
			}
		}
		Static14.aClass45_1 = new Class45();
		Static83.anInt1972 = 0;
		Static56.anInt1507 = 0;
		for (local2071 = 0; local2071 < Static129.anInt1200; local2071++) {
			@Pc(2117) Class4_Sub3_Sub5 local2117 = Static105.method1733(local2071);
			if (local2117 != null && local2117.anInt936 == 0) {
				Static84.anIntArray228[local2071] = 0;
				Static53.anIntArray141[local2071] = 0;
			}
		}
		for (local2075 = 0; local2075 < Static70.anIntArray194.length; local2075++) {
			Static70.anIntArray194[local2075] = -1;
		}
		if (Static52.anInt1452 != -1) {
			Static23.method426(Static52.anInt1452);
		}
		for (@Pc(2165) Class4_Sub18 local2165 = (Class4_Sub18) Static78.aClass75_10.method1897(); local2165 != null; local2165 = (Class4_Sub18) Static78.aClass75_10.method1891()) {
			Static48.method661(true, local2165);
		}
		Static52.anInt1452 = -1;
		Static78.aClass75_10 = new Class75(8);
		Static27.aClass4_Sub14_6 = null;
		Static12.aBoolean107 = false;
		Static48.anInt1184 = 0;
		Static71.aClass49_2.method1057(null, new int[5], -1, false);
		for (@Pc(2203) int local2203 = 0; local2203 < 8; local2203++) {
			Static79.aClass60Array13[local2203] = null;
			Static23.aBooleanArray3[local2203] = false;
		}
		Static26.method453();
		Static24.aBoolean35 = true;
		for (@Pc(2225) int local2225 = 0; local2225 < 100; local2225++) {
			Static105.aBooleanArray15[local2225] = true;
		}
		Static97.aClass4_Sub4Array1 = null;
		Static131.aClass60_1132 = null;
		Static117.anInt2727 = 0;
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
	public static void method50() {
		@Pc(16) int local16;
		for (@Pc(7) int local7 = -1; local7 < Static125.anInt2830; local7++) {
			if (local7 == -1) {
				local16 = 2047;
			} else {
				local16 = Static118.anIntArray336[local7];
			}
			@Pc(24) Class4_Sub3_Sub1_Sub2_Sub1 local24 = Static76.aClass4_Sub3_Sub1_Sub2_Sub1Array1[local16];
			if (local24 != null && local24.anInt1393 > 0) {
				local24.anInt1393--;
				if (local24.anInt1393 == 0) {
					local24.aClass60_506 = null;
				}
			}
		}
		for (local16 = 0; local16 < Static36.anInt1010; local16++) {
			@Pc(56) int local56 = Static59.anIntArray173[local16];
			@Pc(60) Class4_Sub3_Sub1_Sub2_Sub2 local60 = Static15.aClass4_Sub3_Sub1_Sub2_Sub2Array3[local56];
			if (local60 != null && local60.anInt1393 > 0) {
				local60.anInt1393--;
				if (local60.anInt1393 == 0) {
					local60.aClass60_506 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)V")
	public static void method51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static28.anInt2006 == 2) {
			Static65.method1056(Static106.anInt2491 * 2, Static102.anInt2439 + (Static79.anInt1897 - Static60.anInt2956 << 7), Static48.anInt1185 + (-Static49.anInt1207 + Static36.anInt1012 << 7));
			if (Static99.anInt611 > -1 && Static118.anInt2741 % 20 < 10) {
				Static129.aClass4_Sub3_Sub6_Sub3Array4[0].method1632(arg0 + Static99.anInt611 - 12, Static125.anInt2827 + -28 + arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BI)Z")
	public static boolean method52(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
