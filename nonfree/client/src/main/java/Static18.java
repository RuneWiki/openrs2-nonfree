import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!bh", name = "vb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
	public static int anInt454 = 0;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Lclient!ia;")
	public static Class51 aClass51_155 = Static64.method1101(" weitere Optionen");

	@OriginalMember(owner = "client!bh", name = "V", descriptor = "Lclient!ia;")
	private static Class51 aClass51_157 = Static64.method1101("Loading wordpack )2 ");

	@OriginalMember(owner = "client!bh", name = "Q", descriptor = "Lclient!ia;")
	public static Class51 aClass51_156 = aClass51_157;

	@OriginalMember(owner = "client!bh", name = "cb", descriptor = "Z")
	public static boolean aBoolean16 = true;

	@OriginalMember(owner = "client!bh", name = "rb", descriptor = "Lclient!ia;")
	public static Class51 aClass51_158 = Static64.method1101("blinken2:");

	@OriginalMember(owner = "client!bh", name = "tb", descriptor = "Z")
	public static boolean aBoolean17 = true;

	@OriginalMember(owner = "client!bh", name = "f", descriptor = "(I)V")
	public static void method365() {
		Static228.method3749(false);
		@Pc(6) boolean local6 = true;
		Static11.anInt235 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static43.aByteArrayArray1.length; local10++) {
			if (Static143.anIntArray209[local10] != -1 && Static43.aByteArrayArray1[local10] == null) {
				Static43.aByteArrayArray1[local10] = Static199.aClass70_Sub1_59.method3509(0, Static143.anIntArray209[local10]);
				if (Static43.aByteArrayArray1[local10] == null) {
					Static11.anInt235++;
					local6 = false;
				}
			}
			if (Static67.anIntArray100[local10] != -1 && Static55.aByteArrayArray2[local10] == null) {
				Static55.aByteArrayArray2[local10] = Static199.aClass70_Sub1_59.method3522(0, Static67.anIntArray100[local10], Static8.anIntArrayArray1[local10]);
				if (Static55.aByteArrayArray2[local10] == null) {
					local6 = false;
					Static11.anInt235++;
				}
			}
			if (Static199.anIntArray325 != null && Static163.aByteArrayArray10[local10] == null && Static199.anIntArray325[local10] != -1) {
				Static163.aByteArrayArray10[local10] = Static199.aClass70_Sub1_59.method3522(0, Static199.anIntArray325[local10], Static8.anIntArrayArray1[local10]);
				if (Static163.aByteArrayArray10[local10] == null) {
					Static11.anInt235++;
					local6 = false;
				}
			}
		}
		if (!local6) {
			Static50.anInt1201 = 1;
			return;
		}
		Static98.anInt2136 = 0;
		local6 = true;
		@Pc(153) int local153;
		@Pc(164) int local164;
		for (@Pc(134) int local134 = 0; local134 < Static43.aByteArrayArray1.length; local134++) {
			@Pc(140) byte[] local140 = Static55.aByteArrayArray2[local134];
			if (local140 != null) {
				local153 = (Static164.anIntArray240[local134] >> 8) * 64 - Static198.anInt4217;
				local164 = (Static164.anIntArray240[local134] & 0xFF) * 64 - Static118.anInt2541;
				if (Static65.aBoolean70) {
					local153 = 10;
					local164 = 10;
				}
				local6 &= Static120.method2107(local153, local164, local140);
			}
		}
		if (!local6) {
			Static50.anInt1201 = 2;
			return;
		}
		if (Static50.anInt1201 != 0) {
			Static211.method3502(Static150.method2574(new Class51[] { Static30.aClass51_737, Static200.aClass51_1457 }), true);
		}
		Static208.method3447();
		Static150.method2572();
		Static3.method66();
		for (@Pc(214) int local214 = 0; local214 < 4; local214++) {
			Static228.aClass90Array1[local214].method2703();
		}
		@Pc(235) int local235;
		for (local153 = 0; local153 < 4; local153++) {
			for (local164 = 0; local164 < 104; local164++) {
				for (local235 = 0; local235 < 104; local235++) {
					Static150.aByteArrayArrayArray9[local153][local164][local235] = 0;
				}
			}
		}
		Static122.method2152(false);
		Static208.method3447();
		System.gc();
		Static208.method3447();
		Static228.method3749(true);
		Static33.method582();
		if (!Static65.aBoolean70) {
			Static143.method2488();
			Static228.method3749(true);
			Static72.method1263();
			if (Static163.aByteArrayArray10 != null) {
				Static66.method1130();
			}
		}
		if (Static65.aBoolean70) {
			Static152.method2617();
			Static228.method3749(true);
			Static159.method2690();
		}
		Static150.method2572();
		Static228.method3749(true);
		Static208.method3447();
		Static6.method98(Static228.aClass90Array1);
		Static228.method3749(true);
		Static208.method3447();
		local164 = Static185.anInt4013;
		if (Static197.anInt2422 < local164) {
			local164 = Static197.anInt2422;
		}
		if (Static197.anInt2422 - 1 > local164) {
		}
		if (Static112.method1883()) {
			Static144.method2490(0);
		} else {
			Static144.method2490(Static185.anInt4013);
		}
		Static60.method1062();
		@Pc(362) int local362;
		for (local235 = 0; local235 < 104; local235++) {
			for (local362 = 0; local362 < 104; local362++) {
				Static211.method3499(local362, local235);
			}
		}
		Static208.method3447();
		Static206.method3411();
		Static150.method2572();
		if (Static95.aFrame1 != null && Static192.aClass11_36 != null) {
			Static167.aClass1_Sub16_Sub1_2.method3823(62);
			Static167.aClass1_Sub16_Sub1_2.method3808(1057001181);
		}
		if (!Static65.aBoolean70) {
			local362 = (Static57.anInt1354 - 6) / 8;
			@Pc(418) int local418 = (Static39.anInt965 - 6) / 8;
			@Pc(424) int local424 = (Static57.anInt1354 + 6) / 8;
			@Pc(430) int local430 = (Static39.anInt965 + 6) / 8;
			for (@Pc(434) int local434 = local362 - 1; local434 <= local424 + 1; local434++) {
				for (@Pc(440) int local440 = local418 - 1; local440 <= local430 + 1; local440++) {
					if (local434 < local362 || local424 < local434 || local440 < local418 || local430 < local440) {
						Static199.aClass70_Sub1_59.method3536(Static150.method2574(new Class51[] { Static115.aClass51_850, Static27.method511(local434), Static176.aClass51_1316, Static27.method511(local440) }));
						Static199.aClass70_Sub1_59.method3536(Static150.method2574(new Class51[] { Static21.aClass51_191, Static27.method511(local434), Static176.aClass51_1316, Static27.method511(local440) }));
					}
				}
			}
		}
		if (Static47.anInt1142 == 28) {
			Static142.method2482(10);
		} else {
			Static142.method2482(30);
		}
		Static208.method3447();
		if (Static192.aClass11_36 != null) {
			Static167.aClass1_Sub16_Sub1_2.method3823(178);
		}
		Static160.method2700();
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(III)Z")
	public static boolean method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class82 local7 = Static9.method132(arg1);
		if (arg0 == 11) {
			arg0 = 10;
		}
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local7.method2586(arg0);
	}

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)V")
	public static void method383() {
		Static7.aByteArrayArrayArray1 = null;
		Static82.anIntArray115 = null;
		Static82.anIntArrayArrayArray3 = null;
		Static129.anInt2903 = 0;
		Static203.aByteArrayArrayArray11 = null;
		Static218.aClass71_21 = null;
		Static71.aByteArrayArrayArray6 = null;
		Static50.aByteArrayArrayArray5 = null;
		Static201.aByteArrayArrayArray12 = null;
		Static72.aByteArrayArrayArray7 = null;
		Static198.anIntArrayArrayArray10 = null;
		Static5.aClass105_18.method3114();
		Static212.aClass105_23.method3114();
		Static142.aClass67_5 = null;
		Static200.aClass67_8 = null;
		Static201.aClass67_9 = null;
		Static5.aClass67_6 = null;
		Static164.aClass67_7 = null;
		Static11.aClass1_Sub2_Sub1_1 = null;
		Static206.aClass67_10 = null;
		Static62.aClass67_3 = null;
		Static50.aClass67_2 = null;
	}
}
