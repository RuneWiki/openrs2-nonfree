import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!sc;")
	private static Class66 aClass66_970 = Static106.method1849("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!la", name = "e", descriptor = "Lclient!sc;")
	private static Class66 aClass66_972 = Static106.method1849("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!la", name = "c", descriptor = "Lclient!sc;")
	public static Class66 aClass66_971 = aClass66_972;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "I")
	public static int anInt1866 = 0;

	@OriginalMember(owner = "client!la", name = "j", descriptor = "Lclient!sc;")
	public static Class66 aClass66_973 = aClass66_970;

	@OriginalMember(owner = "client!la", name = "m", descriptor = "Lclient!sc;")
	public static Class66 aClass66_974 = Static106.method1849("scrollbar");

	@OriginalMember(owner = "client!la", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_975 = Static106.method1849("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!la", name = "o", descriptor = "Lclient!sc;")
	public static Class66 aClass66_976 = Static106.method1849("Benutzen");

	@OriginalMember(owner = "client!la", name = "r", descriptor = "Lclient!sc;")
	public static Class66 aClass66_977 = Static106.method1849("sl_button");

	@OriginalMember(owner = "client!la", name = "t", descriptor = "I")
	public static int anInt1874 = 2;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!he;)I")
	public static int method1301(@OriginalArg(1) Class1_Sub10 arg0) {
		@Pc(18) Class1_Sub19 local18 = (Class1_Sub19) Static127.aClass65_44.method1802(((long) arg0.anInt1348 << 32) + ((long) arg0.anInt1371));
		return local18 == null ? arg0.anInt1389 : local18.anInt2306;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZLclient!sf;)V")
	public static void method1304(@OriginalArg(1) Class5 arg0) {
		Static43.aClass5_38 = arg0;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V")
	public static void method1305() {
		aClass66_977 = null;
		aClass66_972 = null;
		aClass66_971 = null;
		aClass66_970 = null;
		aClass66_974 = null;
		aClass66_975 = null;
		aClass66_973 = null;
		aClass66_976 = null;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!i;)V")
	public static void method1306(@OriginalArg(1) Class1_Sub1_Sub2_Sub3 arg0) {
		for (@Pc(9) int local9 = 0; local9 < Static6.anIntArray51.length; local9++) {
			Static6.anIntArray51[local9] = 0;
		}
		@Pc(37) int local37;
		for (@Pc(27) int local27 = 0; local27 < 5000; local27++) {
			local37 = (int) ((double) 256 * 128.0D * Math.random());
			Static6.anIntArray51[local37] = (int) (Math.random() * 256.0D);
		}
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(67) int local67;
		for (local37 = 0; local37 < 20; local37++) {
			for (local54 = 1; local54 < 255; local54++) {
				for (local58 = 1; local58 < 127; local58++) {
					local67 = local58 + (local54 << 7);
					Static42.anIntArray192[local67] = (Static6.anIntArray51[local67 + 1] + Static6.anIntArray51[local67 - 1] + Static6.anIntArray51[local67 + -128] + Static6.anIntArray51[local67 + 128]) / 4;
				}
			}
			@Pc(108) int[] local108 = Static6.anIntArray51;
			Static6.anIntArray51 = Static42.anIntArray192;
			Static42.anIntArray192 = local108;
		}
		if (arg0 == null) {
			return;
		}
		local54 = 0;
		for (local58 = 0; local58 < arg0.anInt1429; local58++) {
			for (local67 = 0; local67 < arg0.anInt1432; local67++) {
				if (arg0.aByteArray9[local54++] != 0) {
					@Pc(147) int local147 = local67 + arg0.anInt1433 + 16;
					@Pc(154) int local154 = local58 + arg0.anInt1434 + 16;
					@Pc(161) int local161 = local147 + (local154 << 7);
					Static6.anIntArray51[local161] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!he;I)Lclient!sc;")
	public static Class66 method1309(@OriginalArg(1) Class1_Sub10 arg0, @OriginalArg(2) int arg1) {
		if (!Static119.method1961(arg1, method1301(arg0)) && arg0.anObjectArray8 == null) {
			return null;
		} else if (arg0.aClass66Array6 == null || arg1 >= arg0.aClass66Array6.length || arg0.aClass66Array6[arg1] == null || arg0.aClass66Array6[arg1].method1808().method1847() == 0) {
			return Static3.aBoolean2 ? Static41.method897(new Class66[] { Static16.aClass66_311, Static88.method1632(arg1) }) : null;
		} else {
			return arg0.aClass66Array6[arg1];
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(II)V")
	public static void method1310(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static48.method1050(Static67.aClass66_909, Static129.aClass66_1715, Static109.aClass66_1495);
		} else if (arg0 == -2) {
			Static48.method1050(Static109.aClass66_1471, Static89.aClass66_1307, Static109.aClass66_1483);
		} else if (arg0 == -1) {
			Static48.method1050(Static94.aClass66_1336, Static129.aClass66_1712, Static109.aClass66_1493);
		} else if (arg0 == 3) {
			Static48.method1050(Static109.aClass66_1467, Static97.aClass66_1380, Static109.aClass66_1496);
		} else if (arg0 == 4) {
			Static48.method1050(Static63.aClass66_1015, Static105.aClass66_1441, Static109.aClass66_1480);
		} else if (arg0 == 5) {
			Static48.method1050(Static47.aClass66_796, aClass66_971, Static109.aClass66_1478);
		} else if (arg0 == 6) {
			Static48.method1050(Static15.aClass66_1748, Static111.aClass66_1515, Static109.aClass66_1461);
		} else if (arg0 == 7) {
			Static48.method1050(Static132.aClass66_1725, Static25.aClass66_437, Static109.aClass66_1487);
		} else if (arg0 == 8) {
			Static48.method1050(Static11.aClass66_244, Static108.aClass66_127, Static109.aClass66_1497);
		} else if (arg0 == 9) {
			Static48.method1050(Static49.aClass66_827, Static2.aClass66_96, Static109.aClass66_1481);
		} else if (arg0 == 10) {
			Static48.method1050(Static11.aClass66_238, Static120.aClass66_1616, Static109.aClass66_1460);
		} else if (arg0 == 11) {
			Static48.method1050(Static92.aClass66_1330, Static79.aClass66_1144, Static109.aClass66_1458);
		} else if (arg0 == 12) {
			Static48.method1050(Static65.aClass66_1053, Static128.aClass66_1701, Static109.aClass66_1465);
		} else if (arg0 == 13) {
			Static48.method1050(Static28.aClass66_459, Static129.aClass66_1716, Static109.aClass66_1473);
		} else if (arg0 == 14) {
			Static48.method1050(Static118.aClass66_1594, Static126.aClass66_1683, Static109.aClass66_1456);
		} else if (arg0 == 16) {
			Static48.method1050(Static15.aClass66_1752, aClass66_973, Static109.aClass66_1451);
		} else if (arg0 == 17) {
			Static48.method1050(Static9.aClass66_220, Static54.aClass66_922, Static109.aClass66_1454);
		} else if (arg0 == 18) {
			Static48.method1050(Static95.aClass66_1360, Static47.aClass66_799, Static109.aClass66_1476);
		} else if (arg0 == 19) {
			Static48.method1050(Static129.aClass66_1709, Static67.aClass66_911, Static25.aClass66_433);
		} else if (arg0 == 20) {
			Static48.method1050(Static59.aClass66_962, Static129.aClass66_1707, Static109.aClass66_1475);
		} else if (arg0 == 22) {
			Static48.method1050(Static63.aClass66_1021, Static76.aClass66_1129, Static109.aClass66_1486);
		} else if (arg0 == 23) {
			Static48.method1050(Static43.aClass66_735, Static126.aClass66_1689, Static109.aClass66_1468);
		} else if (arg0 == 24) {
			Static48.method1050(Static76.aClass66_1128, Static55.aClass66_928, Static109.aClass66_1485);
		} else if (arg0 == 25) {
			Static48.method1050(Static131.aClass66_1542, Static129.aClass66_1704, Static109.aClass66_1494);
		} else if (arg0 == 26) {
			Static48.method1050(Static19.aClass66_367, Static60.aClass66_964, Static109.aClass66_1469);
		} else if (arg0 == 27) {
			Static48.method1050(Static109.aClass66_1457, Static70.aClass66_441, Static109.aClass66_1466);
		} else {
			Static48.method1050(Static45.aClass66_772, Static129.aClass66_1706, Static109.aClass66_1474);
		}
		Static18.method468(10);
	}
}
