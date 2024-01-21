import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "I")
	public static int anInt2143 = 0;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!qf;")
	private static Class60 aClass60_938 = Static59.method1195("Error connecting to server)3");

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_937 = aClass60_938;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public static int anInt2144 = 0;

	@OriginalMember(owner = "client!m", name = "i", descriptor = "I")
	public static int anInt2150 = 0;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "[I")
	public static int[] anIntArray219 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public static int anInt2153 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ZBLclient!jb;ILclient!jb;)Lclient!g;")
	public static Class3_Sub1_Sub7 method1395(@OriginalArg(2) Class25 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) Class25 arg2) {
		@Pc(15) boolean local15 = true;
		@Pc(20) int[] local20 = arg2.method930(arg1);
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(32) byte[] local32 = arg2.method913(arg1, local20[local22]);
			if (local32 == null) {
				local15 = false;
			} else {
				@Pc(52) int local52 = (local32[0] & 0xFF) << 8 | local32[1] & 0xFF;
				@Pc(68) byte[] local68 = arg0.method913(local52, 0);
				if (local68 == null) {
					local15 = false;
				}
			}
		}
		if (!local15) {
			return null;
		}
		try {
			return new Class3_Sub1_Sub7(arg2, arg0, arg1, false);
		} catch (@Pc(94) Exception local94) {
			return null;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!v;Z)V")
	public static void method1396(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static112.anInt3110 != 1) {
			return;
		}
		if (Static130.anInt3486 >= 280 && Static130.anInt3486 <= 294 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(0, 0);
			return;
		}
		if (Static130.anInt3486 >= 295 && Static130.anInt3486 <= 360 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(0, 1);
			return;
		}
		if (Static130.anInt3486 >= 390 && Static130.anInt3486 <= 404 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(1, 0);
			return;
		}
		if (Static130.anInt3486 >= 405 && Static130.anInt3486 <= 470 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(1, 1);
			return;
		}
		if (Static130.anInt3486 >= 500 && Static130.anInt3486 <= 514 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(2, 0);
			return;
		}
		if (Static130.anInt3486 >= 515 && Static130.anInt3486 <= 580 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(2, 1);
			return;
		}
		if (Static130.anInt3486 >= 610 && Static130.anInt3486 <= 624 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(3, 0);
			return;
		}
		if (Static130.anInt3486 >= 625 && Static130.anInt3486 <= 690 && Static84.anInt2576 >= 4 && Static84.anInt2576 <= 18) {
			Static35.method782(3, 1);
			return;
		}
		if (Static130.anInt3486 >= 708 && Static84.anInt2576 >= 4 && Static130.anInt3486 <= 758 && Static84.anInt2576 <= 20) {
			Static21.aBoolean27 = false;
			Static82.aClass3_Sub1_Sub2_Sub3_4.method1455(0, 0);
			Static62.aClass3_Sub1_Sub2_Sub3_2.method1455(382, 0);
			Static113.aClass3_Sub1_Sub2_Sub4_19.method1903(382 - Static113.aClass3_Sub1_Sub2_Sub4_19.anInt2860 / 2, 18);
			return;
		}
		if (Static55.anInt1754 == -1) {
			return;
		}
		@Pc(261) Class18 local261 = Static14.aClass18Array1[Static55.anInt1754];
		if (Static124.aBoolean117 == local261.aBoolean31) {
			@Pc(289) byte[] local289 = Static60.method1211(new Class60[] { local261.aClass60_379, Static4.aClass60_74 }).method1861();
			Static102.aString2 = new String(local289, 0, local289.length);
			Static21.aBoolean27 = false;
			Static46.anInt1445 = local261.anInt998;
			if (Static72.anInt2292 != 0) {
				Static70.anInt2201 = 43594;
				Static104.anInt3005 = 43594;
				Static72.anInt2292 = 0;
				Static11.anInt347 = 443;
			}
			Static82.aClass3_Sub1_Sub2_Sub3_4.method1455(0, 0);
			Static62.aClass3_Sub1_Sub2_Sub3_2.method1455(382, 0);
			Static113.aClass3_Sub1_Sub2_Sub4_19.method1903(382 - Static113.aClass3_Sub1_Sub2_Sub4_19.anInt2860 / 2, 18);
			return;
		}
		@Pc(386) Class60 local386 = Static60.method1211(new Class60[] { Static111.aClass60_1313, local261.aClass60_379, Static4.aClass60_74, Static120.aClass60_1378, Static48.aClass60_670, Static65.method1341(Static14.aBoolean15 ? 1 : 0), Static52.aClass60_766, Static65.method1341(Static13.anInt403), Static86.aClass60_715, Static65.method1341(Static24.anInt917) });
		try {
			arg0.getAppletContext().showDocument(local386.method1837(), "_self");
			return;
		} catch (@Pc(395) Exception local395) {
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1397() {
		anIntArray219 = null;
		aClass60_937 = null;
		aClass60_938 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1398() {
		for (@Pc(7) int local7 = 0; local7 < Static74.anInt2399; local7++) {
			@Pc(13) int local13 = Static46.anIntArray170[local7];
			@Pc(17) Class3_Sub1_Sub1_Sub3_Sub2 local17 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local13];
			@Pc(21) int local21 = Static79.aClass3_Sub12_Sub1_1.method1936();
			@Pc(34) int local34;
			if ((local21 & 0x40) != 0) {
				local17.anInt1536 = Static79.aClass3_Sub12_Sub1_1.method1955();
				local34 = Static79.aClass3_Sub12_Sub1_1.method1938();
				local17.anInt1504 = Static34.anInt1183 + (local34 & 0xFFFF);
				local17.anInt1507 = 0;
				if (local17.anInt1536 == 65535) {
					local17.anInt1536 = -1;
				}
				local17.anInt1510 = local34 >> 16;
				local17.anInt1495 = 0;
				if (local17.anInt1504 > Static34.anInt1183) {
					local17.anInt1495 = -1;
				}
			}
			if ((local21 & 0x80) != 0) {
				local17.aClass3_Sub1_Sub16_1 = Static81.method1638(Static79.aClass3_Sub12_Sub1_1.method1963());
				local17.anInt1539 = local17.aClass3_Sub1_Sub16_1.anInt3162;
				local17.anInt1484 = local17.aClass3_Sub1_Sub16_1.anInt3155;
				local17.anInt1492 = local17.aClass3_Sub1_Sub16_1.anInt3159;
				local17.anInt1490 = local17.aClass3_Sub1_Sub16_1.anInt3145;
				local17.anInt1532 = local17.aClass3_Sub1_Sub16_1.anInt3167;
				local17.anInt1520 = local17.aClass3_Sub1_Sub16_1.anInt3170;
				local17.anInt1505 = local17.aClass3_Sub1_Sub16_1.anInt3165;
				local17.anInt1511 = local17.aClass3_Sub1_Sub16_1.anInt3166;
				local17.anInt1503 = local17.aClass3_Sub1_Sub16_1.anInt3150;
			}
			if ((local21 & 0x20) != 0) {
				local17.anInt1542 = Static79.aClass3_Sub12_Sub1_1.method1955();
				local17.anInt1514 = Static79.aClass3_Sub12_Sub1_1.method1963();
			}
			@Pc(153) int local153;
			if ((local21 & 0x4) != 0) {
				local34 = Static79.aClass3_Sub12_Sub1_1.method1925();
				local153 = Static79.aClass3_Sub12_Sub1_1.method1925();
				local17.method1018(local153, Static34.anInt1183, local34);
				local17.anInt1519 = Static34.anInt1183 + 300;
				local17.anInt1513 = Static79.aClass3_Sub12_Sub1_1.method1936();
				local17.anInt1483 = Static79.aClass3_Sub12_Sub1_1.method1962();
			}
			if ((local21 & 0x10) != 0) {
				local17.anInt1523 = Static79.aClass3_Sub12_Sub1_1.method1953();
				if (local17.anInt1523 == 65535) {
					local17.anInt1523 = -1;
				}
			}
			if ((local21 & 0x8) != 0) {
				local34 = Static79.aClass3_Sub12_Sub1_1.method1917();
				local153 = Static79.aClass3_Sub12_Sub1_1.method1917();
				local17.method1018(local153, Static34.anInt1183, local34);
				local17.anInt1519 = Static34.anInt1183 + 300;
				local17.anInt1513 = Static79.aClass3_Sub12_Sub1_1.method1925();
				local17.anInt1483 = Static79.aClass3_Sub12_Sub1_1.method1917();
			}
			if ((local21 & 0x2) != 0) {
				local17.aClass60_656 = Static79.aClass3_Sub12_Sub1_1.method1943();
				local17.anInt1527 = 100;
			}
			if ((local21 & 0x1) != 0) {
				local34 = Static79.aClass3_Sub12_Sub1_1.method1940();
				local153 = Static79.aClass3_Sub12_Sub1_1.method1925();
				if (local34 == 65535) {
					local34 = -1;
				}
				if (local34 == local17.anInt1538 && local34 != -1) {
					@Pc(329) int local329 = Static109.method2054(local34).anInt2469;
					if (local329 == 1) {
						local17.anInt1533 = 0;
						local17.anInt1521 = local153;
						local17.anInt1537 = 0;
						local17.anInt1489 = 0;
					}
					if (local329 == 2) {
						local17.anInt1533 = 0;
					}
				} else if (local34 == -1 || local17.anInt1538 == -1 || Static109.method2054(local34).anInt2484 >= Static109.method2054(local17.anInt1538).anInt2484) {
					local17.anInt1489 = 0;
					local17.anInt1491 = local17.anInt1497;
					local17.anInt1521 = local153;
					local17.anInt1537 = 0;
					local17.anInt1538 = local34;
					local17.anInt1533 = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIII)I")
	public static int method1399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = 65536 - Class3_Sub1_Sub2_Sub1.anIntArray39[arg3 * 1024 / arg2] >> 1;
		return (local12 * arg1 >> 16) + (arg0 * (65536 - local12) >> 16);
	}
}
