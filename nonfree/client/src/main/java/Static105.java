import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1438 = Static106.method1849("purple:");

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1434 = aClass66_1438;

	@OriginalMember(owner = "client!sc", name = "W", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1442 = Static106.method1849("Loaded update list");

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1435 = aClass66_1442;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1436 = Static106.method1849("cyan:");

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1437 = aClass66_1436;

	@OriginalMember(owner = "client!sc", name = "s", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1439 = aClass66_1438;

	@OriginalMember(owner = "client!sc", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1440 = Static106.method1849("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!sc", name = "kb", descriptor = "Lclient!sc;")
	private static Class66 aClass66_1444 = Static106.method1849("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!sc", name = "V", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1441 = aClass66_1444;

	@OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
	public static int anInt2597 = 0;

	@OriginalMember(owner = "client!sc", name = "cb", descriptor = "I")
	public static int anInt2602 = 0;

	@OriginalMember(owner = "client!sc", name = "hb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1443 = Static106.method1849("null");

	@OriginalMember(owner = "client!sc", name = "pb", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1445 = aClass66_1436;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(II[Lclient!he;)V")
	public static void method1804(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub10[] arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.length; local7++) {
			@Pc(13) Class1_Sub10 local13 = arg1[local7];
			if (local13 != null) {
				if (local13.anInt1359 == 0) {
					if (local13.aClass1_Sub10Array2 != null) {
						method1804(arg0, local13.aClass1_Sub10Array2);
					}
					@Pc(36) Class1_Sub22 local36 = (Class1_Sub22) Static52.aClass65_22.method1802((long) local13.anInt1348);
					if (local36 != null) {
						Static99.method905(arg0, local36.anInt2781);
					}
				}
				@Pc(52) Class1_Sub5 local52;
				if (arg0 == 0 && local13.anObjectArray12 != null) {
					local52 = new Class1_Sub5();
					local52.aClass1_Sub10_1 = local13;
					local52.anObjectArray3 = local13.anObjectArray12;
					Static38.method2005(local52);
				}
				if (arg0 == 1 && local13.anObjectArray27 != null) {
					if (local13.anInt1371 >= 0) {
						@Pc(79) Class1_Sub10 local79 = Static38.method2002(local13.anInt1348);
						if (local79 == null || local79.aClass1_Sub10Array2 == null || local79.aClass1_Sub10Array2.length <= local13.anInt1371 || local13 != local79.aClass1_Sub10Array2[local13.anInt1371]) {
							continue;
						}
					}
					local52 = new Class1_Sub5();
					local52.anObjectArray3 = local13.anObjectArray27;
					local52.aClass1_Sub10_1 = local13;
					Static38.method2005(local52);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "(B)Lclient!ff;")
	public static Class3 method1813() {
		try {
			return (Class3) Class.forName("Class3_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(ZLclient!sc;)I")
	public static int method1817(@OriginalArg(1) Class66 arg0) {
		if (Static129.anInt2913 == 1) {
			return 7;
		} else if (arg0.method1829(Static8.aClass66_217)) {
			return 1;
		} else if (arg0.method1829(Static39.aClass66_619)) {
			return 1;
		} else if (arg0.method1829(Static60.aClass66_968)) {
			return 2;
		} else if (arg0.method1829(Static87.aClass66_1278)) {
			return 2;
		} else if (arg0.method1829(Static86.aClass66_1261)) {
			return 3;
		} else if (arg0.method1829(Static133.aClass66_1739)) {
			return 4;
		} else if (arg0.method1829(Static104.aClass66_1432)) {
			return 4;
		} else if (arg0.method1829(Static108.aClass66_129)) {
			return 5;
		} else if (arg0.method1829(Static118.aClass66_1590)) {
			return 6;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
	public static void method1818() {
		try {
			if (Static20.anInt622 == 1) {
				@Pc(13) int local13 = Static38.aClass1_Sub9_Sub1_33.method821();
				if (local13 > 0 && Static38.aClass1_Sub9_Sub1_33.method843()) {
					local13 -= Static16.anInt490;
					if (local13 < 0) {
						local13 = 0;
					}
					Static38.aClass1_Sub9_Sub1_33.method829(local13);
				} else {
					Static38.aClass1_Sub9_Sub1_33.method848();
					Static38.aClass1_Sub9_Sub1_33.method828();
					if (Static15.aClass5_93 == null) {
						Static20.anInt622 = 0;
					} else {
						Static20.anInt622 = 2;
					}
					Static67.aClass1_Sub23_2 = null;
					Static90.aClass54_2 = null;
				}
			}
		} catch (@Pc(52) Exception local52) {
			local52.printStackTrace();
			Static38.aClass1_Sub9_Sub1_33.method848();
			Static20.anInt622 = 0;
			Static90.aClass54_2 = null;
			Static15.aClass5_93 = null;
			Static67.aClass1_Sub23_2 = null;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZI)Lclient!sc;")
	public static Class66 method1838(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13 = 1;
		@Pc(21) int local21 = arg0 / 10;
		while (local21 != 0) {
			local21 /= 10;
			local13++;
		}
		@Pc(32) int local32 = local13;
		if (arg0 < 0 || arg1) {
			local32 = local13 + 1;
		}
		@Pc(43) byte[] local43 = new byte[local32];
		if (arg0 < 0) {
			local43[0] = 45;
		} else if (arg1) {
			local43[0] = 43;
		}
		for (@Pc(64) int local64 = 0; local64 < local13; local64++) {
			@Pc(70) int local70 = arg0 % 10;
			arg0 /= 10;
			if (local70 < 0) {
				local70 = -local70;
			}
			if (local70 > 9) {
				local70 += 39;
			}
			local43[local32 - local64 - 1] = (byte) (local70 + 48);
		}
		@Pc(111) Class66 local111 = new Class66();
		local111.aByteArray29 = local43;
		local111.anInt2583 = local32;
		return local111;
	}

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "(I)V")
	public static void method1842() {
		aClass66_1443 = null;
		aClass66_1445 = null;
		aClass66_1436 = null;
		aClass66_1441 = null;
		aClass66_1438 = null;
		aClass66_1434 = null;
		aClass66_1435 = null;
		aClass66_1444 = null;
		aClass66_1437 = null;
		aClass66_1440 = null;
		aClass66_1439 = null;
		aClass66_1442 = null;
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!fa;ILclient!ae;B)V")
	public static void method1845(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1 arg2) {
		@Pc(7) Class1_Sub18 local7 = new Class1_Sub18();
		local7.anInt2185 = 1;
		local7.aClass5_Sub1_22 = arg2;
		local7.aLong130 = arg1;
		local7.aClass22_12 = arg0;
		@Pc(27) Class61 local27 = Static108.aClass61_3;
		synchronized (Static108.aClass61_3) {
			Static108.aClass61_3.method1754(local7);
		}
		Static94.method1713();
	}
}
