import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!mf", name = "L", descriptor = "[I")
	public static int[] anIntArray302;

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "[I")
	public static int[] anIntArray303;

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "I")
	public static int anInt1877;

	@OriginalMember(owner = "client!mf", name = "G", descriptor = "Lclient!af;")
	public static Class5 aClass5_945 = Static45.method1937("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!mf", name = "I", descriptor = "Lclient!af;")
	private static Class5 aClass5_946 = Static45.method1937("glow2:");

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "Lclient!af;")
	public static Class5 aClass5_947 = aClass5_946;

	@OriginalMember(owner = "client!mf", name = "S", descriptor = "Lclient!bd;")
	public static Class7 aClass7_9 = new Class7(4096);

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "Lclient!af;")
	public static Class5 aClass5_948 = aClass5_946;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "I")
	public static int anInt1873 = 0;

	@OriginalMember(owner = "client!mf", name = "Z", descriptor = "I")
	public static int anInt1874 = -1;

	@OriginalMember(owner = "client!mf", name = "bb", descriptor = "Lclient!af;")
	private static Class5 aClass5_949 = Static45.method1937("New User");

	@OriginalMember(owner = "client!mf", name = "cb", descriptor = "I")
	public static int anInt1875 = 0;

	@OriginalMember(owner = "client!mf", name = "db", descriptor = "Lclient!af;")
	public static Class5 aClass5_950 = Static45.method1937("Mitglieder)2Welt");

	@OriginalMember(owner = "client!mf", name = "eb", descriptor = "Lclient!af;")
	public static Class5 aClass5_951 = aClass5_949;

	@OriginalMember(owner = "client!mf", name = "fb", descriptor = "I")
	public static int anInt1876 = -1;

	@OriginalMember(owner = "client!mf", name = "hb", descriptor = "I")
	public static int anInt1878 = 0;

	@OriginalMember(owner = "client!mf", name = "ib", descriptor = "Lclient!af;")
	public static Class5 aClass5_952 = Static45.method1937(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)V")
	public static void method1364() {
		if (!Static69.aBoolean48) {
			Static124.anIntArray455[0] = 1003;
			Static124.aClass5Array24[0] = Static70.aClass5_819;
			Static75.aClass5Array12[0] = Static49.aClass5_612;
			Static18.anInt3043 = 1;
		}
		if (Static8.anInt266 != -1) {
			Static123.method2177(Static8.anInt266);
		}
		for (@Pc(25) int local25 = 0; local25 < Static74.anInt1725; local25++) {
			if (Static1.aBooleanArray1[local25]) {
				Static113.aBooleanArray25[local25] = true;
			}
			Static64.aBooleanArray18[local25] = Static1.aBooleanArray1[local25];
			Static1.aBooleanArray1[local25] = false;
		}
		Static89.anInt3028 = Static131.anInt3270;
		Static8.aClass1_Sub17_11 = null;
		Static18.anInt3093 = -1;
		anInt1874 = -1;
		if (Static8.anInt266 != -1) {
			Static74.anInt1725 = 0;
			Static58.method1053(0, 765, 503, 0, Static8.anInt266, 0, -1, 0);
		}
		Static89.method2144();
		if (Static69.aBoolean48) {
			Static109.method1891();
		} else if (anInt1874 != -1) {
			Static66.method2200(anInt1874, Static18.anInt3093);
		}
		if (Static108.anInt2660 == 3) {
			Static33.method1982();
			for (@Pc(102) int local102 = 0; local102 < Static74.anInt1725; local102++) {
				if (Static64.aBooleanArray18[local102]) {
					Static33.method1983(Static76.anIntArray294[local102], Static84.anIntArray330[local102], Static92.anIntArray352[local102], Static28.anIntArray100[local102], 16711935, 128);
				} else if (Static113.aBooleanArray25[local102]) {
					Static33.method1983(Static76.anIntArray294[local102], Static84.anIntArray330[local102], Static92.anIntArray352[local102], Static28.anIntArray100[local102], 16711680, 128);
				}
			}
		}
		Static22.method524(Static7.anInt213, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3089, Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anInt3079, Static95.anInt2359);
		Static95.anInt2359 = 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!of;)V")
	public static void method1365(@OriginalArg(1) Class1_Sub17 arg0) {
		@Pc(2) int local2 = arg0.anInt2291;
		if (local2 == 324) {
			if (Static47.anInt1126 == -1) {
				Static23.anInt755 = arg0.anInt2290;
				Static47.anInt1126 = arg0.anInt2274;
			}
			if (Static100.aClass74_2.aBoolean115) {
				arg0.anInt2274 = Static47.anInt1126;
			} else {
				arg0.anInt2274 = Static23.anInt755;
			}
		} else if (local2 == 325) {
			if (Static47.anInt1126 == -1) {
				Static23.anInt755 = arg0.anInt2290;
				Static47.anInt1126 = arg0.anInt2274;
			}
			if (Static100.aClass74_2.aBoolean115) {
				arg0.anInt2274 = Static23.anInt755;
			} else {
				arg0.anInt2274 = Static47.anInt1126;
			}
		} else if (local2 == 327) {
			arg0.anInt2242 = 150;
			arg0.anInt2304 = (int) (Math.sin((double) Static131.anInt3270 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2313 = 0;
			arg0.anInt2300 = 5;
		} else if (local2 == 328) {
			arg0.anInt2242 = 150;
			arg0.anInt2304 = (int) (Math.sin((double) Static131.anInt3270 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2313 = 1;
			arg0.anInt2300 = 5;
		}
	}

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	public static void method1368() {
		aClass5_946 = null;
		aClass5_949 = null;
		aClass5_952 = null;
		aClass5_948 = null;
		aClass5_951 = null;
		anIntArray302 = null;
		aClass5_947 = null;
		anIntArray303 = null;
		aClass7_9 = null;
		aClass5_950 = null;
		aClass5_945 = null;
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(BI)Z")
	public static boolean method1369(@OriginalArg(1) int arg0) {
		return (arg0 >> 20 & 0x1) != 0;
	}
}
