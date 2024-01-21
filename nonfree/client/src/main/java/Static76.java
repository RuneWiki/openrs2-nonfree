import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "Lclient!u;")
	public static Class62 aClass62_37;

	@OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
	public static int anInt2082;

	@OriginalMember(owner = "client!pc", name = "A", descriptor = "Lclient!oc;")
	public static Class34 aClass34_57;

	@OriginalMember(owner = "client!pc", name = "j", descriptor = "Lclient!hb;")
	public static Class1_Sub5_Sub1 aClass1_Sub5_Sub1_2 = new Class1_Sub5_Sub1(5000);

	@OriginalMember(owner = "client!pc", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1213 = Static15.method178("");

	@OriginalMember(owner = "client!pc", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1211 = aClass23_1213;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	public static int anInt2078 = 0;

	@OriginalMember(owner = "client!pc", name = "m", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1212 = aClass23_1213;

	@OriginalMember(owner = "client!pc", name = "n", descriptor = "[I")
	public static int[] anIntArray239 = new int[5];

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
	public static int anInt2079 = 0;

	@OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
	public static int anInt2080 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1214 = aClass23_1213;

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "[I")
	public static int[] anIntArray240 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!pc", name = "z", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1215 = Static15.method178("Passwort: ");

	@OriginalMember(owner = "client!pc", name = "B", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1216 = aClass23_1213;

	@OriginalMember(owner = "client!pc", name = "C", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1217 = aClass23_1213;

	@OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
	public static int anInt2084 = 0;

	@OriginalMember(owner = "client!pc", name = "F", descriptor = "[Z")
	public static boolean[] aBooleanArray6 = new boolean[5];

	@OriginalMember(owner = "client!pc", name = "G", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1218 = aClass23_1213;

	@OriginalMember(owner = "client!pc", name = "N", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1219 = Static15.method178("Hidden");

	@OriginalMember(owner = "client!pc", name = "P", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1220 = aClass23_1219;

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
	public static void method1333() {
		if (Static61.anInt1884 == 0) {
			return;
		}
		@Pc(8) int local8 = 0;
		if (Static66.anInt1971 != 0) {
			local8 = 1;
		}
		for (@Pc(17) int local17 = 0; local17 < 100; local17++) {
			if (Static26.aClass23Array8[local17] != null) {
				@Pc(26) int local26 = Static43.anIntArray172[local17];
				@Pc(30) Class23 local30 = Static7.aClass23Array3[local17];
				if (local30 != null && local30.method546(Static8.aClass23_159)) {
					local30 = local30.method510(5);
				}
				if (local30 != null && local30.method546(Static46.aClass23_850)) {
					local30 = local30.method510(5);
				}
				if ((local26 == 3 || local26 == 7) && (local26 == 7 || Static77.anInt2097 == 0 || Static77.anInt2097 == 1 && Static57.method1100(local30))) {
					@Pc(83) int local83 = 329 - local8 * 13;
					if (Static32.anInt1007 > 4 && Static110.anInt2872 - 4 > local83 + -10 && Static110.anInt2872 - 4 <= local83 + 3) {
						@Pc(133) int local133 = Static112.aClass1_Sub1_Sub6_Sub2_14.method850(Static17.method233(new Class23[] { Static83.aClass23_1304, Static72.aClass23_1186, local30, Static26.aClass23Array8[local17] })) + 25;
						if (local133 > 450) {
							local133 = 450;
						}
						if (local133 + 4 > Static32.anInt1007) {
							if (Static90.anInt2422 >= 1) {
								Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local30 }), Static107.aClass23_1586, 2058, 0);
							}
							Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local30 }), Static89.aClass23_1338, 2009, 0);
							Static82.method1457(0, 0, Static17.method233(new Class23[] { Static95.aClass23_1406, local30 }), Static47.aClass23_858, 2027, 0);
						}
					}
					local8++;
					if (local8 >= 5) {
						return;
					}
				}
				if ((local26 == 5 || local26 == 6) && Static77.anInt2097 < 2) {
					local8++;
					if (local8 >= 5) {
						return;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IBLclient!rb;II)[B")
	public static byte[] method1335(@OriginalArg(0) int arg0, @OriginalArg(2) Class55 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) long local22 = (long) (arg0 + arg2 * 37 & 0xFFFF) + (long) (arg2 << 16) + ((long) arg3 << 32);
		if (Static108.aClass5_61 != null) {
			@Pc(30) Class1_Sub1_Sub3 local30 = (Class1_Sub1_Sub3) Static108.aClass5_61.method98(local22);
			if (local30 != null) {
				return local30.aByteArray1;
			}
		}
		@Pc(41) byte[] local41 = arg1.method1867(arg0, arg2);
		if (local41 == null) {
			return null;
		} else {
			if (Static108.aClass5_61 != null) {
				Static108.aClass5_61.method97(new Class1_Sub1_Sub3(local41), local22);
			}
			return local41;
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILclient!rb;B)Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1 method1337(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class55 arg2) {
		return Static106.method1796(arg0, arg2, arg1) ? Static114.method1931() : null;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
	public static void method1338() {
		aClass23_1215 = null;
		anIntArray239 = null;
		aClass62_37 = null;
		aClass1_Sub5_Sub1_2 = null;
		aClass23_1220 = null;
		aClass23_1219 = null;
		aClass23_1214 = null;
		aBooleanArray6 = null;
		aClass23_1216 = null;
		anIntArray240 = null;
		aClass23_1211 = null;
		aClass23_1213 = null;
		aClass23_1217 = null;
		aClass23_1218 = null;
		aClass23_1212 = null;
		aClass34_57 = null;
	}
}
