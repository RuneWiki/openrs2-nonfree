import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_15;

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public static int anInt2967;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString2;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
	public static int anInt2964 = 0;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1247 = Static59.method1195("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1244 = aClass60_1247;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1245 = Static59.method1195("skill)2");

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1246 = Static59.method1195("New User");

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1248 = Static59.method1195("Login");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1249 = aClass60_1246;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1250 = aClass60_1245;

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1251 = aClass60_1248;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)Lclient!jc;")
	public static Class3_Sub1_Sub10 method1993(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub1_Sub10 local12 = (Class3_Sub1_Sub10) Static91.aClass17_46.method643((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(27) byte[] local27 = Static117.aClass25_Sub1_19.method931(0, arg0);
		if (local27 == null) {
			return null;
		}
		local12 = new Class3_Sub1_Sub10();
		@Pc(40) Class3_Sub12 local40 = new Class3_Sub12(local27);
		local40.anInt2886 = local40.aByteArray77.length - 12;
		@Pc(49) int local49 = 0;
		@Pc(53) int local53 = local40.method1920();
		local12.anInt1723 = local40.method1963();
		local12.anInt1722 = local40.method1963();
		local12.anInt1718 = local40.method1963();
		local12.anInt1714 = local40.method1963();
		local40.anInt2886 = 0;
		local12.aClass60_762 = local40.method1945();
		local12.aClass60Array5 = new Class60[local53];
		local12.anIntArray194 = new int[local53];
		local12.anIntArray195 = new int[local53];
		while (local40.aByteArray77.length - 12 > local40.anInt2886) {
			@Pc(99) int local99 = local40.method1963();
			if (local99 == 3) {
				local12.aClass60Array5[local49] = local40.method1943();
			} else if (local99 >= 100 || local99 == 21 || local99 == 38 || local99 == 39) {
				local12.anIntArray194[local49] = local40.method1936();
			} else {
				local12.anIntArray194[local49] = local40.method1920();
			}
			local12.anIntArray195[local49++] = local99;
		}
		Static91.aClass17_46.method644((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
	public static void method1994() {
		if (Static101.anInt2962 != 0 || Static100.anInt2955 != -1) {
			return;
		}
		@Pc(22) int local22 = Static112.anInt3110;
		if (Static72.aBoolean85 && Static130.anInt3486 >= 516 && Static84.anInt2576 >= 160 && Static130.anInt3486 <= 765 && Static84.anInt2576 <= 205) {
			local22 = 0;
		}
		@Pc(53) int local53;
		@Pc(55) int local55;
		@Pc(124) int local124;
		if (!Static67.aBoolean69) {
			if (local22 == 1 && Static22.anInt872 > 0) {
				local53 = Static2.anIntArray22[Static22.anInt872 - 1];
				if (local53 == 36 || local53 == 12 || local53 == 19 || local53 == 8 || local53 == 34 || local53 == 50 || local53 == 39 || local53 == 54 || local53 == 57 || local53 == 58 || local53 == 6 || local53 == 1002) {
					local55 = Static89.anIntArray279[Static22.anInt872 - 1];
					local124 = Static115.anIntArray339[Static22.anInt872 - 1];
					@Pc(296) Class3_Sub15 local296 = Static86.method1067(local124);
					if (Static17.method505(Static33.method751(local296)) || Static115.method2118(Static33.method751(local296))) {
						Static69.anInt2144 = local124;
						Static69.anInt2150 = local55;
						Static52.anInt1715 = 0;
						Static101.anInt2962 = 2;
						Static91.aBoolean97 = false;
						Static11.anInt350 = Static84.anInt2576;
						if (local124 >> 16 == Static79.anInt2467) {
							Static101.anInt2962 = 1;
						}
						if (local124 >> 16 == Static78.anInt2429) {
							Static101.anInt2962 = 3;
						}
						Static89.anInt2622 = Static130.anInt3486;
						return;
					}
				}
			}
			if (local22 == 1 && (Static36.anInt1213 == 1 || Static89.method1693(Static22.anInt872 - 1)) && Static22.anInt872 > 2) {
				local22 = 2;
			}
			if (local22 == 1 && Static22.anInt872 > 0) {
				Static73.method1528(Static22.anInt872 - 1);
			}
			if (local22 != 2 || Static22.anInt872 <= 0) {
				return;
			}
			Static73.method1527();
			return;
		}
		if (local22 != 1) {
			local53 = Static122.anInt720;
			local55 = Static12.anInt374;
			if (Static19.anInt3405 == 0) {
				local53 -= 4;
				local55 -= 4;
			}
			if (Static19.anInt3405 == 1) {
				local53 -= 553;
				local55 -= 205;
			}
			if (Static19.anInt3405 == 2) {
				local53 -= 17;
				local55 -= 357;
			}
			if (local53 < Static125.anInt3381 - 10 || local53 > Static125.anInt3381 + Static45.anInt1441 + 10 || local55 < Static119.anInt3240 - 10 || local55 > Static119.anInt3240 + Static71.anInt1516 + 10) {
				if (Static19.anInt3405 == 1) {
					Static118.aBoolean115 = true;
				}
				Static67.aBoolean69 = false;
				if (Static19.anInt3405 == 2) {
					Static71.aBoolean49 = true;
				}
			}
		}
		if (local22 != 1) {
			return;
		}
		local53 = Static125.anInt3381;
		local124 = Static45.anInt1441;
		local55 = Static119.anInt3240;
		@Pc(128) int local128 = Static84.anInt2576;
		@Pc(130) int local130 = Static130.anInt3486;
		@Pc(132) int local132 = -1;
		if (Static19.anInt3405 == 0) {
			local130 -= 4;
			local128 -= 4;
		}
		if (Static19.anInt3405 == 1) {
			local130 -= 553;
			local128 -= 205;
		}
		if (Static19.anInt3405 == 2) {
			local128 -= 357;
			local130 -= 17;
		}
		for (@Pc(153) int local153 = 0; local153 < Static22.anInt872; local153++) {
			@Pc(167) int local167 = (Static22.anInt872 - local153 - 1) * 15 + local55 + 31;
			if (local130 > local53 && local53 + local124 > local130 && local128 > local167 - 13 && local128 < local167 + 3) {
				local132 = local153;
			}
		}
		if (local132 != -1) {
			Static73.method1528(local132);
		}
		Static67.aBoolean69 = false;
		if (Static19.anInt3405 == 1) {
			Static118.aBoolean115 = true;
		}
		if (Static19.anInt3405 == 2) {
			Static71.aBoolean49 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
	public static void method1995() {
		aClass60_1246 = null;
		aClass60_1250 = null;
		aClass60_1248 = null;
		aClass60_1244 = null;
		aString2 = null;
		aClass60_1251 = null;
		aClass60_1245 = null;
		aClass60_1247 = null;
		aClass3_Sub1_Sub2_Sub4_15 = null;
		aClass60_1249 = null;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)J")
	public static synchronized long method1996() {
		@Pc(10) long local10 = System.currentTimeMillis();
		if (local10 < Static71.aLong49) {
			Static51.aLong45 += Static71.aLong49 - local10;
		}
		Static71.aLong49 = local10;
		return Static51.aLong45 + local10;
	}
}
