import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!gb", name = "Ub", descriptor = "Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 aClass1_Sub1_Sub6_Sub1_2;

	@OriginalMember(owner = "client!gb", name = "Bb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_523 = Static15.method178("Too many connections from your address)3");

	@OriginalMember(owner = "client!gb", name = "Jb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_524 = aClass23_523;

	@OriginalMember(owner = "client!gb", name = "Qb", descriptor = "I")
	public static int anInt960 = 0;

	@OriginalMember(owner = "client!gb", name = "Rb", descriptor = "Lclient!ba;")
	public static Class5 aClass5_25 = new Class5(64);

	@OriginalMember(owner = "client!gb", name = "Sb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_525 = Static15.method178("runes");

	@OriginalMember(owner = "client!gb", name = "Tb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_526 = Static15.method178("null");

	@OriginalMember(owner = "client!gb", name = "Vb", descriptor = "I")
	public static int anInt961 = 0;

	@OriginalMember(owner = "client!gb", name = "Wb", descriptor = "Lclient!de;")
	public static Class14 aClass14_6 = new Class14(32);

	@OriginalMember(owner = "client!gb", name = "Xb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_527 = Static15.method178("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!gb", name = "Yb", descriptor = "J")
	public static long aLong24 = 0L;

	@OriginalMember(owner = "client!gb", name = "Zb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_528 = Static15.method178("");

	@OriginalMember(owner = "client!gb", name = "ac", descriptor = "[Lclient!rd;")
	public static Class56[] aClass56Array1 = new Class56[50];

	@OriginalMember(owner = "client!gb", name = "bc", descriptor = "Lclient!ba;")
	public static Class5 aClass5_26 = new Class5(64);

	@OriginalMember(owner = "client!gb", name = "cc", descriptor = "Lclient!gd;")
	public static Class23 aClass23_529 = Static15.method178("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(III)V")
	public static void method505(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < 100; local7++) {
			if (Static26.aClass23Array8[local7] != null) {
				@Pc(16) int local16 = Static43.anIntArray172[local7];
				@Pc(26) int local26 = Static108.anInt2806 + 70 + 4 - local5 * 14;
				if (local26 < -20) {
					break;
				}
				@Pc(35) Class23 local35 = Static7.aClass23Array3[local7];
				if (local35 != null && local35.method546(Static8.aClass23_159)) {
					local35 = local35.method510(5);
				}
				if (local16 == 0) {
					local5++;
				}
				if (local35 != null && local35.method546(Static46.aClass23_850)) {
					local35 = local35.method510(5);
				}
				if ((local16 == 1 || local16 == 2) && (local16 == 1 || Static2.anInt2292 == 0 || Static2.anInt2292 == 1 && Static57.method1100(local35))) {
					local5++;
					if (local26 - 14 < arg1 && arg1 <= local26 && !local35.method539(Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass23_1260)) {
						if (Static90.anInt2422 >= 1) {
							Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static107.aClass23_1586, 58, 0);
						}
						Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static89.aClass23_1338, 9, 0);
						Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static47.aClass23_858, 27, 0);
					}
				}
				if ((local16 == 3 || local16 == 7) && Static61.anInt1884 == 0 && (local16 == 7 || Static77.anInt2097 == 0 || Static77.anInt2097 == 1 && Static57.method1100(local35))) {
					if (arg1 > local26 - 14 && arg1 <= local26) {
						if (Static90.anInt2422 >= 1) {
							Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static107.aClass23_1586, 58, 0);
						}
						Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static89.aClass23_1338, 9, 0);
						Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static47.aClass23_858, 27, 0);
					}
					local5++;
				}
				if (local16 == 4 && (Static62.anInt1905 == 0 || Static62.anInt1905 == 1 && Static57.method1100(local35))) {
					if (local26 - 14 < arg1 && arg1 <= local26) {
						Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static75.aClass23_1207, 44, 0);
					}
					local5++;
				}
				if ((local16 == 5 || local16 == 6) && Static61.anInt1884 == 0 && Static77.anInt2097 < 2) {
					local5++;
				}
				if (local16 == 8 && (Static62.anInt1905 == 0 || Static62.anInt1905 == 1 && Static57.method1100(local35))) {
					if (local26 - 14 < arg1 && arg1 <= local26) {
						Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local35 }), Static69.aClass23_1170, 23, 0);
					}
					local5++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
	public static void method506() {
		for (@Pc(5) int local5 = 0; local5 < Static37.anInt1299; local5++) {
			@Pc(10) int local10 = Static88.anIntArray151[local5];
			@Pc(14) Class1_Sub1_Sub2_Sub1_Sub1 local14 = Static108.aClass1_Sub1_Sub2_Sub1_Sub1Array1[local10];
			@Pc(18) int local18 = Static83.aClass1_Sub5_Sub1_3.method716();
			if ((local18 & 0x8) != 0) {
				local14.aClass23_1257 = Static83.aClass1_Sub5_Sub1_3.method683();
				local14.anInt2216 = 100;
			}
			@Pc(44) int local44;
			@Pc(48) int local48;
			if ((local18 & 0x1) != 0) {
				local44 = Static83.aClass1_Sub5_Sub1_3.method718();
				local48 = Static83.aClass1_Sub5_Sub1_3.method716();
				local14.method1386(Static7.anInt176, local44, local48);
				local14.anInt2172 = Static7.anInt176 + 300;
				local14.anInt2228 = Static83.aClass1_Sub5_Sub1_3.method713();
				local14.anInt2173 = Static83.aClass1_Sub5_Sub1_3.method716();
			}
			if ((local18 & 0x20) != 0) {
				local44 = Static83.aClass1_Sub5_Sub1_3.method713();
				local48 = Static83.aClass1_Sub5_Sub1_3.method716();
				local14.method1386(Static7.anInt176, local44, local48);
				local14.anInt2172 = Static7.anInt176 + 300;
				local14.anInt2228 = Static83.aClass1_Sub5_Sub1_3.method718();
				local14.anInt2173 = Static83.aClass1_Sub5_Sub1_3.method676();
			}
			if ((local18 & 0x80) != 0) {
				local14.anInt2174 = Static83.aClass1_Sub5_Sub1_3.method675();
				if (local14.anInt2174 == 65535) {
					local14.anInt2174 = -1;
				}
			}
			if ((local18 & 0x40) != 0) {
				local14.anInt2222 = Static83.aClass1_Sub5_Sub1_3.method728();
				local44 = Static83.aClass1_Sub5_Sub1_3.method673();
				local14.anInt2198 = local44 >> 16;
				local14.anInt2206 = 0;
				if (local14.anInt2222 == 65535) {
					local14.anInt2222 = -1;
				}
				local14.anInt2226 = 0;
				local14.anInt2183 = (local44 & 0xFFFF) + Static7.anInt176;
				if (local14.anInt2183 > Static7.anInt176) {
					local14.anInt2206 = -1;
				}
			}
			if ((local18 & 0x4) != 0) {
				local14.anInt2189 = Static83.aClass1_Sub5_Sub1_3.method675();
				local14.anInt2181 = Static83.aClass1_Sub5_Sub1_3.method715();
			}
			if ((local18 & 0x10) != 0) {
				local14.aClass1_Sub1_Sub16_1 = Static65.method1251(Static83.aClass1_Sub5_Sub1_3.method675());
				local14.anInt2214 = local14.aClass1_Sub1_Sub16_1.anInt2762;
				local14.anInt2197 = local14.aClass1_Sub1_Sub16_1.anInt2749;
				local14.anInt2225 = local14.aClass1_Sub1_Sub16_1.anInt2771;
				local14.anInt2211 = local14.aClass1_Sub1_Sub16_1.anInt2746;
				local14.anInt2208 = local14.aClass1_Sub1_Sub16_1.anInt2764;
				local14.anInt2220 = local14.aClass1_Sub1_Sub16_1.anInt2757;
				local14.anInt2231 = local14.aClass1_Sub1_Sub16_1.anInt2759;
				local14.anInt2199 = local14.aClass1_Sub1_Sub16_1.anInt2773;
				local14.anInt2190 = local14.aClass1_Sub1_Sub16_1.anInt2754;
			}
			if ((local18 & 0x2) != 0) {
				local44 = Static83.aClass1_Sub5_Sub1_3.method728();
				if (local44 == 65535) {
					local44 = -1;
				}
				local48 = Static83.aClass1_Sub5_Sub1_3.method676();
				if (local44 == local14.anInt2213 && local44 != -1) {
					@Pc(322) int local322 = Static18.method249(local44).anInt1086;
					if (local322 == 1) {
						local14.anInt2205 = local48;
						local14.anInt2201 = 0;
						local14.anInt2215 = 0;
						local14.anInt2219 = 0;
					}
					if (local322 == 2) {
						local14.anInt2219 = 0;
					}
				} else if (local44 == -1 || local14.anInt2213 == -1 || Static18.method249(local44).anInt1067 >= Static18.method249(local14.anInt2213).anInt1067) {
					local14.anInt2205 = local48;
					local14.anInt2219 = 0;
					local14.anInt2201 = 0;
					local14.anInt2215 = 0;
					local14.anInt2213 = local44;
					local14.anInt2177 = local14.anInt2195;
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "(I)V")
	public static void method507() {
		Static29.aClass5_22.method99();
		Static33.aClass5_30.method99();
		Static2.aClass5_49.method99();
	}

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "(I)V")
	public static void method508() {
		aClass23_523 = null;
		aClass14_6 = null;
		aClass56Array1 = null;
		aClass23_524 = null;
		aClass23_529 = null;
		aClass23_527 = null;
		aClass23_528 = null;
		aClass23_525 = null;
		aClass1_Sub1_Sub6_Sub1_2 = null;
		aClass5_26 = null;
		aClass5_25 = null;
		aClass23_526 = null;
	}
}
