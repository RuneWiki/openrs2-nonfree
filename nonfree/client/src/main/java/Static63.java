import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "Lclient!vc;")
	public static Class3_Sub8_Sub1 aClass3_Sub8_Sub1_6 = new Class3_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	public static int anInt2365 = 0;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[[I")
	public static int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!mb", name = "I", descriptor = "I")
	public static int anInt2386 = 0;

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "Lclient!v;")
	public static Class62 aClass62_1065 = Static45.method753("@gr2@");

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1073 = Static45.method753("Ok");

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "Lclient!v;")
	public static Class62 aClass62_1066 = aClass62_1073;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "[J")
	public static long[] aLongArray30 = new long[32];

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1070 = Static45.method753("Loaded config");

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "Lclient!v;")
	public static Class62 aClass62_1067 = aClass62_1070;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "Lclient!v;")
	private static Class62 aClass62_1068 = Static45.method753("Choose Option");

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "Z")
	public static boolean aBoolean147 = false;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_1069 = Static45.method753("Versteckt");

	@OriginalMember(owner = "client!mb", name = "kb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1078 = Static45.method753("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!mb", name = "cb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1071 = aClass62_1078;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1074 = Static45.method753("Please close the interface you have open before using (Wreport abuse(W");

	@OriginalMember(owner = "client!mb", name = "db", descriptor = "Lclient!v;")
	public static Class62 aClass62_1072 = aClass62_1074;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	public static int anInt2394 = -1;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "Lclient!v;")
	private static Class62 aClass62_1075 = Static45.method753("RuneScape is loading )2 please wait)3)3)3");

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "Lclient!v;")
	public static Class62 aClass62_1076 = null;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1077 = Static45.method753("headicons_prayer");

	@OriginalMember(owner = "client!mb", name = "lb", descriptor = "[I")
	public static int[] anIntArray264 = new int[5];

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1079 = Static45.method753("@red@");

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "Lclient!v;")
	public static Class62 aClass62_1080 = aClass62_1068;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "Lclient!v;")
	public static Class62 aClass62_1081 = aClass62_1075;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!mb;)V")
	public static void method1500(@OriginalArg(1) Class42 arg0) {
		Static20.aClass42_19 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/awt/Component;III)Lclient!kb;")
	public static Class9 method1509(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class9_Sub1");
			@Pc(10) Class9 local10 = (Class9) local6.getDeclaredConstructor().newInstance();
			local10.method685(arg0, arg2, arg1);
			return local10;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class9_Sub2 local29 = new Class9_Sub2();
			local29.method685(arg0, arg2, arg1);
			return local29;
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method1511() {
		@Pc(9) Object local9 = Static76.anObject2;
		synchronized (Static76.anObject2) {
			if (Static48.anInt1375 == 0) {
				Static2.aClass35_1.method770(5, new Class59());
			}
			Static48.anInt1375 = 600;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public static void method1515() {
		if (!Static17.aBoolean172) {
			return;
		}
		Static46.aClass9_26 = null;
		Static15.anIntArray46 = null;
		Static72.anIntArray204 = null;
		Static64.aClass3_Sub1_Sub1_Sub1_17 = null;
		Static38.aClass9_21 = null;
		Static16.aClass9_10 = null;
		Static96.aClass9_50 = null;
		Static106.aClass9_54 = null;
		Static75.anIntArray229 = null;
		Static2.aClass3_Sub1_Sub1_Sub1_2 = null;
		Static21.aClass3_Sub1_Sub1_Sub1Array1 = null;
		Static78.aClass3_Sub1_Sub1_Sub4_3 = null;
		Static21.aClass9_12 = null;
		Static80.aClass3_Sub1_Sub1_Sub4_4 = null;
		Static55.aClass9_29 = null;
		Static102.anIntArray292 = null;
		Static85.aClass9_44 = null;
		Static99.anIntArray284 = null;
		Static65.anIntArray184 = null;
		Static72.anIntArray206 = null;
		Static2.aClass9_1 = null;
		Static93.anIntArray274 = null;
		Static92.method1555();
		Static45.method752(true);
		Static17.aBoolean172 = false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BIILclient!mb;)[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] method1518(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class42 arg2) {
		return Static16.method442(arg2, arg1, arg0) ? Static81.method1318() : null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public static void method1519() {
		aClass62_1070 = null;
		aClass62_1080 = null;
		aClass62_1081 = null;
		aClass62_1069 = null;
		aClass62_1067 = null;
		aClass62_1074 = null;
		aClass62_1079 = null;
		aClass62_1065 = null;
		aClass62_1068 = null;
		aClass62_1072 = null;
		aLongArray30 = null;
		anIntArray264 = null;
		aClass62_1073 = null;
		aClass62_1078 = null;
		anIntArrayArray24 = null;
		aClass3_Sub8_Sub1_6 = null;
		aClass62_1066 = null;
		anIntArray265 = null;
		aClass62_1075 = null;
		aClass62_1076 = null;
		aClass62_1077 = null;
		aClass62_1071 = null;
	}
}
