import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
	public static int anInt2110;

	@OriginalMember(owner = "client!nf", name = "W", descriptor = "Lclient!tb;")
	public static Class44 aClass44_47;

	@OriginalMember(owner = "client!nf", name = "ab", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
	public static int anInt2113;

	@OriginalMember(owner = "client!nf", name = "mb", descriptor = "Lclient!id;")
	public static Class3_Sub1_Sub1_Sub2 aClass3_Sub1_Sub1_Sub2_4;

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
	public static int anInt2102 = 0;

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "Lclient!n;")
	public static Class52 aClass52_40 = new Class52(30);

	@OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
	public static int anInt2107 = -1;

	@OriginalMember(owner = "client!nf", name = "S", descriptor = "Z")
	public static boolean aBoolean96 = false;

	@OriginalMember(owner = "client!nf", name = "lb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1141 = Static33.method650("Enter name of friend to delete from list");

	@OriginalMember(owner = "client!nf", name = "U", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1131 = aClass56_1141;

	@OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
	public static int anInt2111 = -1;

	@OriginalMember(owner = "client!nf", name = "X", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1132 = Static33.method650("flash1:");

	@OriginalMember(owner = "client!nf", name = "Z", descriptor = "[I")
	public static int[] anIntArray186 = new int[2048];

	@OriginalMember(owner = "client!nf", name = "cb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1133 = Static33.method650("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!nf", name = "db", descriptor = "I")
	public static int anInt2114 = 0;

	@OriginalMember(owner = "client!nf", name = "eb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1134 = aClass56_1132;

	@OriginalMember(owner = "client!nf", name = "fb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1135 = Static33.method650("(Y");

	@OriginalMember(owner = "client!nf", name = "gb", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1136 = Static33.method650("scroll:");

	@OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1137 = Static33.method650("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1138 = aClass56_1136;

	@OriginalMember(owner = "client!nf", name = "jb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1139 = aClass56_1132;

	@OriginalMember(owner = "client!nf", name = "kb", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1140 = aClass56_1136;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLclient!oa;Lclient!oa;I)V")
	public static void method1391(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(2) Class56 arg2) {
		if (Static80.aBoolean98) {
			Static18.method349();
			Static80.aBoolean98 = false;
			Static102.method2054();
			Static99.method613();
			Static5.method43();
			Static47.method875();
			Static8.method173(Static66.anInt541, Static46.anInt2266, Static56.anInt1592, Static80.aClass3_Sub1_Sub1_Sub1_4);
			Static69.method1278(Static44.anIntArray79, Static27.anInt798, -1, Static111.anInt2804 == -1);
			Static94.aBoolean116 = true;
			Static65.aBoolean83 = true;
			Static59.aBoolean79 = true;
		}
		@Pc(40) short local40 = 151;
		@Pc(45) int local45 = local40 - 3;
		Static86.method1601();
		Static80.aClass3_Sub1_Sub1_Sub1_4.method735(arg1, 257, 148, 0);
		Static80.aClass3_Sub1_Sub1_Sub1_4.method735(arg1, 256, 147, 16777215);
		if (arg2 != null) {
			local45 += 15;
			if (arg0) {
				@Pc(76) int local76 = Static80.aClass3_Sub1_Sub1_Sub1_4.method745(arg2) + 4;
				Static6.method1487(257 - local76 / 2, 152, local76, 11, 0);
			}
			Static80.aClass3_Sub1_Sub1_Sub1_4.method735(arg2, 257, 163, 0);
			Static80.aClass3_Sub1_Sub1_Sub1_4.method735(arg2, 256, 162, 16777215);
		}
		Static68.method1234();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILclient!tb;Lclient!tb;)V")
	public static void method1392(@OriginalArg(1) Class44 arg0, @OriginalArg(2) Class44 arg1) {
		Static110.aClass44_61 = arg1;
		Static48.aClass44_31 = arg0;
		Static92.anInt2430 = Static110.aClass44_61.method1151(3);
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)V")
	public static void method1393(@OriginalArg(1) int arg0) {
		if (arg0 == Static44.anInt1156) {
			return;
		}
		if (Static44.anInt1156 == 0) {
			Static83.method1513();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static94.anInt2472 = 0;
			Static95.anInt2479 = 0;
			Static69.anInt1922 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static48.aClass17_2 != null) {
			Static48.aClass17_2.method498();
			Static48.aClass17_2 = null;
		}
		if (Static44.anInt1156 == 25 || Static44.anInt1156 == 40) {
			Static86.method1601();
			Static6.method1486();
		}
		if (Static44.anInt1156 == 25) {
			Static93.anInt2440 = 0;
			Static53.anInt1526 = 1;
			Static113.anInt2871 = 1;
			Static1.anInt5 = 0;
			Static32.anInt951 = 0;
		}
		if (arg0 == 35) {
			Static68.method1247();
			Static64.method1215();
			if (Static51.aClass30_9 == null) {
				Static51.aClass30_9 = Static11.method235(503, Static59.aCanvas1, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static51.aClass30_9 = null;
			Static68.method1247();
			Static123.method1975(Static114.aClass44_Sub1_75, Static59.aCanvas1, Static111.aClass44_Sub1_73);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static51.aClass30_9 = null;
			Static64.method1215();
			Static5.method50(Static59.aCanvas1, Static114.aClass44_Sub1_75);
		}
		Static80.aBoolean98 = true;
		Static44.anInt1156 = arg0;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)I")
	public static int method1394(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 0) {
				arg1 = 0;
			} else if (arg1 > 127) {
				arg1 = 127;
			}
			return 127 - arg1;
		} else {
			arg1 = (arg0 & 0x7F) * arg1 / 128;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1 + (arg0 & 0xFF80);
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public static void method1395() {
		anIntArray186 = null;
		aFrame1 = null;
		aClass56_1141 = null;
		aClass56_1138 = null;
		aClass56_1136 = null;
		aClass56_1133 = null;
		aClass52_40 = null;
		aClass56_1137 = null;
		aClass3_Sub1_Sub1_Sub2_4 = null;
		aClass56_1132 = null;
		aClass56_1140 = null;
		aClass56_1139 = null;
		aClass44_47 = null;
		aClass56_1135 = null;
		aClass56_1131 = null;
		aClass56_1134 = null;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)V")
	public static void method1396() {
		Static50.anInt1424 = 0;
		Static60.anInt1776 = 0;
		Static43.method803();
		Static83.method1509();
		Static119.method1925();
		@Pc(23) int local23;
		for (@Pc(17) int local17 = 0; local17 < Static50.anInt1424; local17++) {
			local23 = Static7.anIntArray28[local17];
			if (Static98.anInt2566 != Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local23].anInt3147) {
				Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local23].aClass3_Sub1_Sub17_1 = null;
				Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[local23] = null;
			}
		}
		if (Static31.aClass3_Sub2_Sub1_3.anInt413 != Static73.anInt2013) {
			throw new RuntimeException("gnp1 pos:" + Static31.aClass3_Sub2_Sub1_3.anInt413 + " psize:" + Static73.anInt2013);
		}
		for (local23 = 0; local23 < Static109.anInt1678; local23++) {
			if (Static33.aClass3_Sub1_Sub2_Sub4_Sub2Array1[Static75.anIntArray176[local23]] == null) {
				throw new RuntimeException("gnp2 pos:" + local23 + " size:" + Static109.anInt1678);
			}
		}
	}
}
