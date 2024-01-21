import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!b", name = "X", descriptor = "Ljava/lang/String;")
	public static String aString1;

	@OriginalMember(owner = "client!b", name = "cb", descriptor = "I")
	public static int anInt236;

	@OriginalMember(owner = "client!b", name = "S", descriptor = "Lclient!wa;")
	public static Class87 aClass87_3 = null;

	@OriginalMember(owner = "client!b", name = "T", descriptor = "I")
	public static int anInt232 = 0;

	@OriginalMember(owner = "client!b", name = "W", descriptor = "[Lclient!ai;")
	public static Class6[] aClass6Array2 = new Class6[100];

	@OriginalMember(owner = "client!b", name = "ab", descriptor = "Lclient!ai;")
	public static Class6 aClass6_88 = Static38.method685("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!b", name = "bb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_89 = Static38.method685("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!b", name = "yb", descriptor = "Lclient!ai;")
	private static Class6 aClass6_93 = Static38.method685("Could not complete login)3");

	@OriginalMember(owner = "client!b", name = "hb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_90 = aClass6_93;

	@OriginalMember(owner = "client!b", name = "mb", descriptor = "I")
	public static volatile int anInt245 = 0;

	@OriginalMember(owner = "client!b", name = "pb", descriptor = "I")
	public static int anInt248 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!b", name = "qb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_91 = Static38.method685("leuchten2:");

	@OriginalMember(owner = "client!b", name = "wb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_92 = Static38.method685("Fps:");

	@OriginalMember(owner = "client!b", name = "e", descriptor = "(I)V")
	public static void method157() {
		aClass87_3 = null;
		aClass6_92 = null;
		aClass6_91 = null;
		aClass6_89 = null;
		aClass6_93 = null;
		aClass6Array2 = null;
		aString1 = null;
		aClass6_90 = null;
		aClass6_88 = null;
	}

	@OriginalMember(owner = "client!b", name = "f", descriptor = "(I)V")
	public static void method158() {
		try {
			if (Static65.anInt1613 == 1) {
				@Pc(17) int local17 = Static89.aClass2_Sub10_Sub3_1.method2027();
				if (local17 > 0 && Static89.aClass2_Sub10_Sub3_1.method2001()) {
					local17 -= Static141.anInt3309;
					if (local17 < 0) {
						local17 = 0;
					}
					Static89.aClass2_Sub10_Sub3_1.method2006(local17);
				} else {
					Static89.aClass2_Sub10_Sub3_1.method2030();
					Static89.aClass2_Sub10_Sub3_1.method2014();
					Static35.aClass13_1 = null;
					if (Static19.aClass10_21 == null) {
						Static65.anInt1613 = 0;
					} else {
						Static65.anInt1613 = 2;
					}
					Static140.aClass2_Sub4_1 = null;
				}
			}
		} catch (@Pc(58) Exception local58) {
			local58.printStackTrace();
			Static89.aClass2_Sub10_Sub3_1.method2030();
			Static140.aClass2_Sub4_1 = null;
			Static35.aClass13_1 = null;
			Static65.anInt1613 = 0;
			Static19.aClass10_21 = null;
		}
	}

	@OriginalMember(owner = "client!b", name = "g", descriptor = "(I)V")
	public static void method159() {
		Static112.anInt2717 = 0;
		@Pc(12) int local12 = Static2.anInt66 + (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2674 >> 7);
		@Pc(19) int local19 = Static176.anInt4061 + (Static131.aClass2_Sub3_Sub5_Sub1_Sub1_1.anInt2672 >> 7);
		if (local12 >= 3053 && local12 <= 3156 && local19 >= 3056 && local19 <= 3136) {
			Static112.anInt2717 = 1;
		}
		if (local12 >= 3072 && local12 <= 3118 && local19 >= 9492 && local19 <= 9535) {
			Static112.anInt2717 = 1;
		}
		if (Static112.anInt2717 == 1 && local12 >= 3139 && local12 <= 3199 && local19 >= 3008 && local19 <= 3062) {
			Static112.anInt2717 = 0;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;")
	public static Object method161(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static12.aBoolean13) {
			try {
				@Pc(18) Class28 local18 = (Class28) Class.forName("Class28_Sub1").getDeclaredConstructor().newInstance();
				local18.method923(arg0);
				return local18;
			} catch (@Pc(25) Throwable local25) {
				Static12.aBoolean13 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!b", name = "i", descriptor = "(I)V")
	public static void method162() {
		@Pc(20) int local20;
		for (@Pc(12) int local12 = -1; local12 < Static167.anInt3925; local12++) {
			if (local12 == -1) {
				local20 = 2047;
			} else {
				local20 = Static156.anIntArray358[local12];
			}
			@Pc(30) Class2_Sub3_Sub5_Sub1_Sub1 local30 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local20];
			if (local30 != null && local30.anInt2701 > 0) {
				local30.anInt2701--;
				if (local30.anInt2701 == 0) {
					local30.aClass6_776 = null;
				}
			}
		}
		for (local20 = 0; local20 < Static81.anInt1985; local20++) {
			@Pc(65) int local65 = Static149.anIntArray312[local20];
			@Pc(69) Class2_Sub3_Sub5_Sub1_Sub2 local69 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[local65];
			if (local69 != null && local69.anInt2701 > 0) {
				local69.anInt2701--;
				if (local69.anInt2701 == 0) {
					local69.aClass6_776 = null;
				}
			}
		}
	}
}
