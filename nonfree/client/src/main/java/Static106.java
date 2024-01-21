import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!ud", name = "xb", descriptor = "I")
	public static int anInt2734;

	@OriginalMember(owner = "client!ud", name = "Ab", descriptor = "Lclient!va;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!ud", name = "Fb", descriptor = "Z")
	public static boolean aBoolean147;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lclient!bd;")
	public static Class9 aClass9_26 = new Class9(50);

	@OriginalMember(owner = "client!ud", name = "ob", descriptor = "I")
	public static final int anInt2732 = 2301979;

	@OriginalMember(owner = "client!ud", name = "Ib", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1241 = Static56.method972("Please reload this page)3");

	@OriginalMember(owner = "client!ud", name = "pb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1230 = aClass5_1241;

	@OriginalMember(owner = "client!ud", name = "qb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1231 = Static56.method972("Mem:");

	@OriginalMember(owner = "client!ud", name = "rb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1232 = Static56.method972("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ud", name = "sb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1233 = Static56.method972(" more options");

	@OriginalMember(owner = "client!ud", name = "tb", descriptor = "J")
	public static long aLong80 = 0L;

	@OriginalMember(owner = "client!ud", name = "ub", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1234 = Static56.method972("Enter name:");

	@OriginalMember(owner = "client!ud", name = "yb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1235 = Static56.method972("Absender:");

	@OriginalMember(owner = "client!ud", name = "Bb", descriptor = "I")
	public static int anInt2736 = -1;

	@OriginalMember(owner = "client!ud", name = "Cb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1236 = Static56.method972("titlebutton");

	@OriginalMember(owner = "client!ud", name = "Db", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1237 = aClass5_1234;

	@OriginalMember(owner = "client!ud", name = "Eb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1238 = Static56.method972("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!ud", name = "Nb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1244 = Static56.method972("Close");

	@OriginalMember(owner = "client!ud", name = "Gb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1239 = aClass5_1244;

	@OriginalMember(owner = "client!ud", name = "Hb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1240 = Static56.method972("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!ud", name = "Jb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1242 = aClass5_1233;

	@OriginalMember(owner = "client!ud", name = "Lb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1243 = Static56.method972("Stufe)2");

	@OriginalMember(owner = "client!ud", name = "Ob", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1245 = Static56.method972("Loading ignore list");

	@OriginalMember(owner = "client!ud", name = "Qb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1246 = aClass5_1245;

	@OriginalMember(owner = "client!ud", name = "b", descriptor = "(II)V")
	public static void method1772(@OriginalArg(1) int arg0) {
		if (arg0 == -1 || (!Static36.aBooleanArray21[arg0] || Static31.aClass3_Sub1_Sub17ArrayArray3[arg0] == null)) {
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < Static31.aClass3_Sub1_Sub17ArrayArray3[arg0].length; local29++) {
			@Pc(37) Class3_Sub1_Sub17 local37 = Static31.aClass3_Sub1_Sub17ArrayArray3[arg0][local29];
			if (local37 != null) {
				local37.anInt2620 = local37.anInt2587;
			}
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V")
	public static void method1773() {
		aClass5_1233 = null;
		aClass5_1242 = null;
		aClass5_1238 = null;
		aClass5_1246 = null;
		aClass5_1231 = null;
		aClass5_1230 = null;
		aClass5_1232 = null;
		aClass5_1240 = null;
		aClass5_1245 = null;
		aClass5_1235 = null;
		aClass5_1239 = null;
		aClass3_Sub1_Sub2_Sub4_16 = null;
		aClass5_1237 = null;
		aClass5_1243 = null;
		aClass5_1244 = null;
		aClass9_26 = null;
		aClass5_1241 = null;
		aClass5_1236 = null;
		aClass5_1234 = null;
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	public static void method1775() {
		Static75.aClass3_Sub6_Sub1_2.method1639();
		@Pc(11) int local11 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
		if (local11 == 0) {
			return;
		}
		@Pc(31) int local31 = Static75.aClass3_Sub6_Sub1_2.method1646(2);
		if (local31 == 0) {
			Static78.anIntArray224[Static83.anInt2051++] = 2047;
			return;
		}
		@Pc(55) int local55;
		@Pc(67) int local67;
		if (local31 == 1) {
			local55 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
			Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1001(local55, false);
			local67 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
			if (local67 == 1) {
				Static78.anIntArray224[Static83.anInt2051++] = 2047;
			}
			return;
		}
		@Pc(109) int local109;
		if (local31 == 2) {
			local55 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
			Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1001(local55, true);
			local67 = Static75.aClass3_Sub6_Sub1_2.method1646(3);
			Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method1001(local67, true);
			local109 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
			if (local109 == 1) {
				Static78.anIntArray224[Static83.anInt2051++] = 2047;
			}
		} else if (local31 == 3) {
			local55 = Static75.aClass3_Sub6_Sub1_2.method1646(7);
			local67 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
			if (local67 == 1) {
				Static78.anIntArray224[Static83.anInt2051++] = 2047;
			}
			Static12.anInt480 = Static75.aClass3_Sub6_Sub1_2.method1646(2);
			local109 = Static75.aClass3_Sub6_Sub1_2.method1646(7);
			@Pc(162) int local162 = Static75.aClass3_Sub6_Sub1_2.method1646(1);
			Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method991(local109, local162 == 1, local55);
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
	public static void method1776() {
		while (true) {
			@Pc(10) Class51 local10 = Static18.aClass51_5;
			@Pc(17) Class3_Sub9 local17;
			synchronized (Static18.aClass51_5) {
				local17 = (Class3_Sub9) Static23.aClass51_7.method1312();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass11_Sub1_72.method1890(local17.aByteArray14, (int) local17.aLong85, false, local17.aClass8_2);
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)V")
	public static void method1777(@OriginalArg(1) int arg0) {
		Static108.anInt2860 = arg0;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(ILclient!m;I)Lclient!ae;")
	public static Class5 method1778(@OriginalArg(1) Class3_Sub6 arg0) {
		try {
			@Pc(7) Class5 local7 = new Class5();
			local7.anInt311 = arg0.method1629();
			if (local7.anInt311 > 32767) {
				local7.anInt311 = 32767;
			}
			local7.aByteArray1 = new byte[local7.anInt311];
			arg0.anInt2416 += Static35.aClass43_1.method1067(0, local7.aByteArray1, local7.anInt311, arg0.anInt2416, arg0.aByteArray17);
			return local7;
		} catch (@Pc(54) Exception local54) {
			return Static72.aClass5_865;
		}
	}
}
