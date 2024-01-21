import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!la;")
	public static Class17 aClass17_26;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
	public static int anInt2015;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "[S")
	public static short[] aShortArray19;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!la;")
	public static Class17 aClass17_27;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!v;")
	private static Class76 aClass76_882 = Static134.method2017("slide:");

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!v;")
	public static Class76 aClass76_883 = Static134.method2017(" zuerst von Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "Lclient!v;")
	private static Class76 aClass76_884 = Static134.method2017(" is already on your friend list");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!v;")
	public static Class76 aClass76_885 = Static134.method2017("Lade Benutzeroberfl-=che )2 ");

	@OriginalMember(owner = "client!oa", name = "i", descriptor = "Lclient!v;")
	public static Class76 aClass76_886 = Static134.method2017("Zu viele Anmelde)2Versuche von Ihrer Adresse");

	@OriginalMember(owner = "client!oa", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_887 = aClass76_882;

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!ua;")
	public static Class72 aClass72_21 = new Class72(64);

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!v;")
	public static Class76 aClass76_888 = aClass76_884;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_889 = aClass76_882;

	@OriginalMember(owner = "client!oa", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_891 = Static134.method2017(" from your ignore list first");

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!v;")
	public static Class76 aClass76_890 = aClass76_891;

	@OriginalMember(owner = "client!oa", name = "t", descriptor = "Lclient!v;")
	public static Class76 aClass76_892 = Static134.method2017("(Udns");

	@OriginalMember(owner = "client!oa", name = "w", descriptor = "[I")
	public static int[] anIntArray280 = new int[50];

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1421() {
		@Pc(11) int local11 = Static42.anInt1164;
		@Pc(13) int local13 = Static36.anInt1035;
		@Pc(15) int local15 = Static9.anInt175;
		@Pc(17) int local17 = Static13.anInt230;
		Static46.method1823(local11, local15, local13, local17, 6116423);
		Static46.method1823(local11 + 1, local15 + 1, local13 - 2, 16, 0);
		Static46.method1832(local11 + 1, local15 + 18, local13 - 2, local17 - 19, 0);
		Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1334(Static60.aClass76_656, local11 + 3, local15 - -14, 6116423, -1);
		@Pc(64) int local64 = Static2.anInt31;
		@Pc(66) int local66 = Static126.anInt2734;
		for (@Pc(68) int local68 = 0; local68 < Static10.anInt206; local68++) {
			@Pc(82) int local82 = local15 + (Static10.anInt206 - local68 - 1) * 15 + 31;
			@Pc(84) int local84 = 16777215;
			if (local11 < local64 && local64 < local11 + local13 && local82 - 13 < local66 && local82 + 3 > local66) {
				local84 = 16776960;
			}
			Static126.aClass4_Sub4_Sub5_Sub3_Sub1_6.method1334(Static34.method616(local68), local11 + 3, local82, local84, 0);
		}
		Static127.method1917(Static42.anInt1164, Static13.anInt230, Static36.anInt1035, Static9.anInt175);
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static void method1422() {
		aClass76_890 = null;
		aClass76_883 = null;
		aShortArray19 = null;
		aClass17_27 = null;
		aClass76_886 = null;
		aClass76_882 = null;
		aClass76_892 = null;
		aClass72_21 = null;
		aClass17_26 = null;
		aClass76_888 = null;
		aClass76_887 = null;
		aClass76_885 = null;
		aClass76_891 = null;
		aClass76_889 = null;
		anIntArray280 = null;
		aClass76_884 = null;
	}
}
