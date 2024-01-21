import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_841 = Static108.method1915("au");

	@OriginalMember(owner = "client!ke", name = "g", descriptor = "Lclient!ta;")
	public static Class70 aClass70_7 = new Class70(4096);

	@OriginalMember(owner = "client!ke", name = "i", descriptor = "Z")
	public static boolean aBoolean145 = false;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!kd;")
	private static Class39 aClass39_842 = Static108.method1915("Your profile will be transferred in:");

	@OriginalMember(owner = "client!ke", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_843 = Static108.method1915("Gegenstand konnte nicht gefunden werden)1 verk-Urzen Sie den Suchbegriff)3");

	@OriginalMember(owner = "client!ke", name = "l", descriptor = "Z")
	public static boolean aBoolean146 = false;

	@OriginalMember(owner = "client!ke", name = "m", descriptor = "Lclient!a;")
	public static Class1_Sub1_Sub1 aClass1_Sub1_Sub1_3 = null;

	@OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
	public static int anInt1726 = 0;

	@OriginalMember(owner = "client!ke", name = "o", descriptor = "Lclient!kd;")
	public static Class39 aClass39_844 = Static108.method1915("::fpsoff");

	@OriginalMember(owner = "client!ke", name = "p", descriptor = "Lclient!kd;")
	public static Class39 aClass39_845 = Static108.method1915("Spieler");

	@OriginalMember(owner = "client!ke", name = "q", descriptor = "[I")
	public static int[] anIntArray246 = new int[500];

	@OriginalMember(owner = "client!ke", name = "r", descriptor = "Lclient!kd;")
	public static Class39 aClass39_846 = Static108.method1915(" )2> <col=ff9040>");

	@OriginalMember(owner = "client!ke", name = "s", descriptor = "Lclient!kd;")
	public static Class39 aClass39_847 = aClass39_842;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
	public static void method1187() {
		aClass39_844 = null;
		aClass1_Sub1_Sub1_3 = null;
		aClass39_843 = null;
		aClass70_7 = null;
		aClass39_847 = null;
		aClass39_841 = null;
		aClass39_842 = null;
		anIntArray246 = null;
		aClass39_846 = null;
		aClass39_845 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
	public static void method1188(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = arg1; local8 <= arg1 + arg2; local8++) {
			for (@Pc(12) int local12 = arg0; local12 <= arg0 + arg3; local12++) {
				if (local12 >= 0 && local12 < 104 && local8 >= 0 && local8 < 104) {
					Static55.aByteArrayArrayArray5[0][local12][local8] = 127;
					if (arg0 == local12 && local12 > 0) {
						Static51.anIntArrayArrayArray6[0][local12][local8] = Static51.anIntArrayArrayArray6[0][local12 - 1][local8];
					}
					if (local12 == arg3 + arg0 && local12 < 103) {
						Static51.anIntArrayArrayArray6[0][local12][local8] = Static51.anIntArrayArrayArray6[0][local12 + 1][local8];
					}
					if (arg1 == local8 && local8 > 0) {
						Static51.anIntArrayArrayArray6[0][local12][local8] = Static51.anIntArrayArrayArray6[0][local12][local8 - 1];
					}
					if (local8 == arg1 + arg2 && local8 < 103) {
						Static51.anIntArrayArrayArray6[0][local12][local8] = Static51.anIntArrayArrayArray6[0][local12][local8 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(BLclient!kd;Lclient!kd;I)V")
	public static void method1189(@OriginalArg(1) Class39 arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2) {
		if (Static110.anInt2786 == -1) {
			Static113.aBoolean226 = true;
		}
		if (arg2 == 0 && Static9.anInt2991 != -1) {
			Static91.anInt2130 = 0;
			Static122.aClass39_1434 = arg1;
		}
		for (@Pc(32) int local32 = 99; local32 > 0; local32--) {
			Static94.anIntArray338[local32] = Static94.anIntArray338[local32 - 1];
			Static16.aClass39Array25[local32] = Static16.aClass39Array25[local32 - 1];
			Static67.aClass39Array19[local32] = Static67.aClass39Array19[local32 - 1];
		}
		Static16.aClass39Array25[0] = arg0;
		Static67.aClass39Array19[0] = arg1;
		Static94.anIntArray338[0] = arg2;
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V")
	public static void method1190() {
		Static110.aFontMetrics1 = null;
		Static36.anImage3 = null;
		Static116.aFont1 = null;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)V")
	public static void method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static34.anInt1064 == 0 || arg1 == 0 || Static56.anInt1518 >= 50) {
			return;
		}
		Static18.anIntArray103[Static56.anInt1518] = arg0;
		Static127.anIntArray481[Static56.anInt1518] = arg1;
		Static35.anIntArray155[Static56.anInt1518] = arg2;
		Static2.aClass51Array1[Static56.anInt1518] = null;
		Static38.anIntArray166[Static56.anInt1518] = 0;
		Static56.anInt1518++;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
	public static void method1192() {
		Static81.method1387();
		Static20.aBoolean62 = true;
		Static92.method1547();
		@Pc(28) boolean local28;
		if (Static91.anInt2131 != -1) {
			local28 = Static89.method1478(1, 261, Static91.anInt2131, 190);
			if (!local28) {
				Static35.aBoolean96 = true;
			}
		} else if (Static23.anIntArray117[Static120.anInt3073] != -1) {
			local28 = Static89.method1478(1, 261, Static23.anIntArray117[Static120.anInt3073], 190);
			if (!local28) {
				Static35.aBoolean96 = true;
			}
		}
		if (Static13.aBoolean47 && Static46.anInt2774 == 1) {
			if (Static122.anInt2972 == 1) {
				Static75.method1294();
			} else {
				Static124.method2080();
			}
		}
		Static64.method1144();
	}
}
