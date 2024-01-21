import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!te", name = "P", descriptor = "[Lclient!qd;")
	public static Class2_Sub1_Sub9_Sub3[] aClass2_Sub1_Sub9_Sub3Array8;

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!te", name = "db", descriptor = "I")
	public static int anInt2909;

	@OriginalMember(owner = "client!te", name = "Q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1091 = Static2.method59("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!te", name = "R", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1092 = Static2.method59("Invalid username or password)3");

	@OriginalMember(owner = "client!te", name = "S", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1093 = Static2.method59(" )2> ");

	@OriginalMember(owner = "client!te", name = "T", descriptor = "[I")
	public static int[] anIntArray378 = new int[100];

	@OriginalMember(owner = "client!te", name = "U", descriptor = "I")
	public static int anInt2904 = -1;

	@OriginalMember(owner = "client!te", name = "V", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1094 = Static2.method59("No reply from loginserver)3");

	@OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
	public static int anInt2906 = -1;

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1095 = Static2.method59("Prepared sound engine");

	@OriginalMember(owner = "client!te", name = "eb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1096 = Static2.method59("Passwort: ");

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "[I")
	public static int[] anIntArray379 = new int[50];

	@OriginalMember(owner = "client!te", name = "gb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1097 = aClass80_1095;

	@OriginalMember(owner = "client!te", name = "hb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1098 = aClass80_1094;

	@OriginalMember(owner = "client!te", name = "lb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1099 = Static2.method59("@red@");

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1100 = aClass80_1092;

	@OriginalMember(owner = "client!te", name = "b", descriptor = "(Z)V")
	public static void method1840() {
		aClass2_Sub1_Sub9_Sub3Array8 = null;
		aClass80_1096 = null;
		anIntArray379 = null;
		aClass80_1097 = null;
		aFontMetrics1 = null;
		aClass80_1098 = null;
		aClass80_1100 = null;
		aClass80_1094 = null;
		aClass80_1099 = null;
		aClass80_1095 = null;
		aClass80_1093 = null;
		aClass80_1091 = null;
		anIntArray378 = null;
		aClass80_1092 = null;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IZ)V")
	public static void method1841(@OriginalArg(1) boolean arg0) {
		if (Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2370 >> 7 == Static119.anInt1678 && Static2.anInt121 == Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anInt2324 >> 7) {
			Static119.anInt1678 = 0;
		}
		@Pc(29) int local29 = Static92.anInt2273;
		if (arg0) {
			local29 = 1;
		}
		for (@Pc(35) int local35 = 0; local35 < local29; local35++) {
			@Pc(41) Class2_Sub1_Sub1_Sub4_Sub2 local41;
			@Pc(43) int local43;
			if (arg0) {
				local41 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1;
				local43 = 33538048;
			} else {
				local43 = Static53.anIntArray208[local35] << 14;
				local41 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local35]];
			}
			if (local41 != null && local41.method1431()) {
				@Pc(68) int local68 = local41.anInt2370 >> 7;
				@Pc(73) int local73 = local41.anInt2324 >> 7;
				local41.aBoolean170 = false;
				if ((Static18.aBoolean51 && Static92.anInt2273 > 50 || Static92.anInt2273 > 200) && !arg0 && local41.anInt2352 == local41.anInt2351) {
					local41.aBoolean170 = true;
				}
				if (local68 >= 0 && local68 < 104 && local73 >= 0 && local73 < 104) {
					if (local41.aClass2_Sub1_Sub1_Sub2_3 == null || local41.anInt2391 > Static10.anInt300 || Static10.anInt300 >= local41.anInt2393) {
						if ((local41.anInt2370 & 0x7F) == 64 && (local41.anInt2324 & 0x7F) == 64) {
							if (Static98.anIntArrayArray27[local68][local73] == Static48.anInt1498) {
								continue;
							}
							Static98.anIntArrayArray27[local68][local73] = Static48.anInt1498;
						}
						local41.anInt2402 = Static24.method513(local41.anInt2370, Static16.anInt444, local41.anInt2324);
						Static93.aClass64_1.method1633(Static16.anInt444, local41.anInt2370, local41.anInt2324, local41.anInt2402, 60, local41, local41.anInt2347, local43, local41.aBoolean169);
					} else {
						local41.aBoolean170 = false;
						local41.anInt2402 = Static24.method513(local41.anInt2370, Static16.anInt444, local41.anInt2324);
						Static93.aClass64_1.method1612(Static16.anInt444, local41.anInt2370, local41.anInt2324, local41.anInt2402, local41, local41.anInt2347, local43, local41.anInt2388, local41.anInt2407, local41.anInt2400, local41.anInt2390);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(B)V")
	public static void method1842() {
		@Pc(7) Class57 local7 = Static5.aClass57_1;
		synchronized (Static5.aClass57_1) {
			Static102.anInt2669 = Static29.anInt1065;
			@Pc(23) int local23;
			if (Static23.anInt868 < 0) {
				for (local23 = 0; local23 < 112; local23++) {
					Static10.aBooleanArray2[local23] = false;
				}
				Static23.anInt868 = Static111.anInt3003;
			} else {
				while (Static111.anInt3003 != Static23.anInt868) {
					local23 = Static127.anIntArray411[Static111.anInt3003];
					Static111.anInt3003 = Static111.anInt3003 + 1 & 0x7F;
					if (local23 >= 0) {
						Static10.aBooleanArray2[local23] = true;
					} else {
						Static10.aBooleanArray2[~local23] = false;
					}
				}
			}
			Static29.anInt1065 = Static43.anInt1291;
		}
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public static void method1843() {
		Static101.aBoolean198 = true;
		Static18.aBoolean51 = true;
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!wd;Z)Z")
	public static boolean method1844(@OriginalArg(0) Class80 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static45.anInt2090; local11++) {
			if (arg0.method2006(Static123.aClass80Array20[local11])) {
				return true;
			}
		}
		return arg0.method2006(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.aClass80_924);
	}
}
