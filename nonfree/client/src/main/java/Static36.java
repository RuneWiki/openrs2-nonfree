import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fb", name = "p", descriptor = "Lclient!dd;")
	public static Class14 aClass14_12;

	@OriginalMember(owner = "client!fb", name = "u", descriptor = "Lclient!md;")
	public static Class14_Sub1 aClass14_Sub1_6;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "[I")
	public static int[] anIntArray126 = new int[50];

	@OriginalMember(owner = "client!fb", name = "s", descriptor = "Lclient!ic;")
	private static Class34 aClass34_496 = Static56.method816("yellow:");

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_493 = aClass34_496;

	@OriginalMember(owner = "client!fb", name = "d", descriptor = "Lclient!ic;")
	public static Class34 aClass34_494 = aClass34_496;

	@OriginalMember(owner = "client!fb", name = "j", descriptor = "Lclient!ic;")
	public static Class34 aClass34_495 = Static56.method816("titlebox");

	@OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
	public static int anInt922 = 0;

	@OriginalMember(owner = "client!fb", name = "r", descriptor = "J")
	public static volatile long aLong31 = 0L;

	@OriginalMember(owner = "client!fb", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_497 = Static56.method816("(U3");

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!ic;")
	private static Class34 aClass34_498 = Static56.method816("green:");

	@OriginalMember(owner = "client!fb", name = "w", descriptor = "Lclient!ic;")
	public static Class34 aClass34_499 = aClass34_498;

	@OriginalMember(owner = "client!fb", name = "B", descriptor = "Lclient!ic;")
	public static Class34 aClass34_504 = Static56.method816("");

	@OriginalMember(owner = "client!fb", name = "x", descriptor = "Lclient!ic;")
	public static Class34 aClass34_500 = aClass34_504;

	@OriginalMember(owner = "client!fb", name = "z", descriptor = "Lclient!ic;")
	private static Class34 aClass34_502 = Static56.method816("Loaded wordpack");

	@OriginalMember(owner = "client!fb", name = "y", descriptor = "Lclient!ic;")
	public static Class34 aClass34_501 = aClass34_502;

	@OriginalMember(owner = "client!fb", name = "A", descriptor = "Lclient!ic;")
	public static Class34 aClass34_503 = Static56.method816(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!fb", name = "C", descriptor = "Lclient!ic;")
	public static Class34 aClass34_505 = aClass34_498;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)[Lclient!ce;")
	public static Class8_Sub1_Sub3_Sub2[] method570() {
		@Pc(6) Class8_Sub1_Sub3_Sub2[] local6 = new Class8_Sub1_Sub3_Sub2[Static58.anInt1530];
		for (@Pc(8) int local8 = 0; local8 < Static58.anInt1530; local8++) {
			@Pc(13) Class8_Sub1_Sub3_Sub2 local13 = new Class8_Sub1_Sub3_Sub2();
			local13.anInt487 = Static5.anInt70;
			local13.anInt483 = Static92.anInt2205;
			local13.anInt482 = Static92.anIntArray307[local8];
			local13.anInt486 = Static13.anIntArray47[local8];
			local13.anInt484 = Static42.anIntArray135[local8];
			local13.anInt485 = Static19.anIntArray65[local8];
			local13.anIntArray62 = Static32.anIntArray110;
			local13.aByteArray3 = Static115.aByteArrayArray57[local8];
			local6[local8] = local13;
		}
		Static2.method10();
		return local6;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
	public static void method571() {
		Static40.method608(Static93.aClass8_Sub24_7);
		Static69.anInt1682++;
		if (Static58.aBoolean60 && Static24.aBoolean71) {
			@Pc(24) int local24 = Static121.anInt2909;
			@Pc(26) int local26 = Static14.anInt366;
			local26 -= Static96.anInt547;
			if (local26 < Static109.anInt2498) {
				local26 = Static109.anInt2498;
			}
			local24 -= Static68.anInt1678;
			if (Static93.aClass8_Sub24_7.anInt3154 + local26 > Static15.aClass8_Sub24_3.anInt3154 + Static109.anInt2498) {
				local26 = Static15.aClass8_Sub24_3.anInt3154 + Static109.anInt2498 - Static93.aClass8_Sub24_7.anInt3154;
			}
			if (local24 < Static52.anInt1351) {
				local24 = Static52.anInt1351;
			}
			@Pc(69) int local69 = Static93.aClass8_Sub24_7.anInt3113;
			@Pc(77) int local77 = local26 + Static15.aClass8_Sub24_3.anInt3115 - Static109.anInt2498;
			@Pc(82) int local82 = local26 - Static68.anInt1676;
			if (Static15.aClass8_Sub24_3.anInt3111 + Static52.anInt1351 < local24 - -Static93.aClass8_Sub24_7.anInt3111) {
				local24 = Static15.aClass8_Sub24_3.anInt3111 + Static52.anInt1351 - Static93.aClass8_Sub24_7.anInt3111;
			}
			@Pc(110) int local110 = local24 - Static42.anInt1025;
			@Pc(118) int local118 = Static15.aClass8_Sub24_3.anInt3103 + local24 - Static52.anInt1351;
			if (Static93.aClass8_Sub24_7.anInt3097 < Static69.anInt1682 && (local69 < local82 || -local69 > local82 || local110 > local69 || local110 < -local69)) {
				Static20.aBoolean31 = true;
			}
			@Pc(159) Class8_Sub19 local159;
			if (Static93.aClass8_Sub24_7.anObjectArray23 != null && Static20.aBoolean31) {
				local159 = new Class8_Sub19();
				local159.anInt2650 = local118;
				local159.aClass8_Sub24_13 = Static93.aClass8_Sub24_7;
				local159.anInt2644 = local77;
				local159.anObjectArray3 = Static93.aClass8_Sub24_7.anObjectArray23;
				Static106.method1497(local159);
			}
			if (Static134.anInt3170 == 0) {
				if (Static20.aBoolean31) {
					if (Static93.aClass8_Sub24_7.anObjectArray26 != null) {
						local159 = new Class8_Sub19();
						local159.aClass8_Sub24_13 = Static93.aClass8_Sub24_7;
						local159.aClass8_Sub24_12 = Static107.aClass8_Sub24_9;
						local159.anObjectArray3 = Static93.aClass8_Sub24_7.anObjectArray26;
						local159.anInt2650 = local118;
						local159.anInt2644 = local77;
						Static106.method1497(local159);
					}
					if (Static107.aClass8_Sub24_9 != null && Static44.method674(Static93.aClass8_Sub24_7) != null) {
						Static106.aClass8_Sub20_Sub1_3.method1907(72);
						Static106.aClass8_Sub20_Sub1_3.method1876(Static93.aClass8_Sub24_7.anInt3124);
						Static106.aClass8_Sub20_Sub1_3.method1843(Static107.aClass8_Sub24_9.anInt3122);
						Static106.aClass8_Sub20_Sub1_3.method1843(Static93.aClass8_Sub24_7.anInt3122);
						Static106.aClass8_Sub20_Sub1_3.method1841(Static107.aClass8_Sub24_9.anInt3124);
					}
				} else if ((Static113.anInt2574 == 1 || Static76.method1106(Static96.anInt552 - 1)) && Static96.anInt552 > 2) {
					Static22.method1612();
				} else if (Static96.anInt552 > 0) {
					Static28.method499(Static96.anInt552 - 1);
				}
				Static93.aClass8_Sub24_7 = null;
			}
		} else if (Static69.anInt1682 > 1) {
			Static93.aClass8_Sub24_7 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BLclient!wd;)Lclient!ic;")
	public static Class34 method572(@OriginalArg(1) Class8_Sub20 arg0) {
		return Static123.method1941(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
	public static void method573() {
		anIntArray126 = null;
		aClass34_503 = null;
		aClass34_505 = null;
		aClass34_494 = null;
		aClass14_12 = null;
		aClass34_493 = null;
		aClass34_496 = null;
		Class23.anIntArray127 = null;
		aClass34_499 = null;
		aClass34_500 = null;
		aClass34_502 = null;
		aClass34_497 = null;
		aClass14_Sub1_6 = null;
		aClass34_501 = null;
		aClass34_498 = null;
		aClass34_504 = null;
		aClass34_495 = null;
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)V")
	public static void method574() {
		if (Static115.aClass8_Sub24_10 != null || Static93.aClass8_Sub24_7 != null) {
			return;
		}
		@Pc(17) int local17 = Static39.anInt964;
		@Pc(30) int local30;
		@Pc(90) int local90;
		@Pc(96) int local96;
		if (Static90.aBoolean14) {
			if (local17 != 1) {
				local30 = Static14.anInt366;
				local90 = Static121.anInt2909;
				if (local30 < Static134.anInt3164 - 10 || Static134.anInt3164 + Static117.anInt2629 + 10 < local30 || Static109.anInt2499 - 10 > local90 || Static28.anInt802 + Static109.anInt2499 + 10 < local90) {
					Static90.aBoolean14 = false;
					Static125.method1974(Static28.anInt802, Static117.anInt2629, Static109.anInt2499, Static134.anInt3164);
				}
			}
			if (local17 != 1) {
				return;
			}
			local30 = Static134.anInt3164;
			local96 = Static117.anInt2629;
			local90 = Static109.anInt2499;
			@Pc(243) int local243 = Static3.anInt51;
			@Pc(245) int local245 = Static74.anInt1781;
			@Pc(247) int local247 = -1;
			for (@Pc(249) int local249 = 0; local249 < Static96.anInt552; local249++) {
				@Pc(264) int local264 = (Static96.anInt552 - local249 - 1) * 15 + local90 + 31;
				if (local243 > local30 && local243 < local30 + local96 && local245 > local264 - 13 && local245 < local264 + 3) {
					local247 = local249;
				}
			}
			if (local247 != -1) {
				Static28.method499(local247);
			}
			Static90.aBoolean14 = false;
			Static125.method1974(Static28.anInt802, Static117.anInt2629, Static109.anInt2499, Static134.anInt3164);
			return;
		}
		if (local17 == 1 && Static96.anInt552 > 0) {
			local30 = Static50.anIntArray166[Static96.anInt552 - 1];
			if (local30 == 32 || local30 == 1 || local30 == 42 || local30 == 48 || local30 == 3 || local30 == 34 || local30 == 30 || local30 == 24 || local30 == 8 || local30 == 16 || local30 == 51 || local30 == 1007) {
				local90 = Static104.anIntArray328[Static96.anInt552 - 1];
				local96 = Static21.anIntArray71[Static96.anInt552 - 1];
				@Pc(100) Class8_Sub24 local100 = Static113.method1614(local96);
				if (Static95.method1354(Static99.method1445(local100)) || Static72.method1077(Static99.method1445(local100))) {
					Static27.aBoolean39 = false;
					Static27.anInt796 = 0;
					if (Static115.aClass8_Sub24_10 != null) {
						Static40.method608(Static115.aClass8_Sub24_10);
					}
					Static115.aClass8_Sub24_10 = Static113.method1614(local96);
					Static86.anInt2181 = local90;
					Static60.anInt1579 = Static74.anInt1781;
					Static86.anInt2180 = Static3.anInt51;
					Static40.method608(Static115.aClass8_Sub24_10);
					return;
				}
			}
		}
		if (local17 == 1 && (Static113.anInt2574 == 1 && Static96.anInt552 > 2 || Static76.method1106(Static96.anInt552 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static96.anInt552 > 0) {
			Static28.method499(Static96.anInt552 - 1);
		}
		if (local17 == 2 && Static96.anInt552 > 0) {
			Static22.method1612();
			return;
		}
	}
}
