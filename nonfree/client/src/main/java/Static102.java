import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "Lclient!md;")
	public static Class46 aClass46_1;

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!la;")
	public static Class17 aClass17_30;

	@OriginalMember(owner = "client!rd", name = "t", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "Lclient!v;")
	private static Class76 aClass76_1080 = Static134.method2017("M");

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!v;")
	public static Class76 aClass76_1070 = aClass76_1080;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "Lclient!v;")
	private static Class76 aClass76_1071 = Static134.method2017("K");

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "Lclient!v;")
	public static Class76 aClass76_1072 = aClass76_1080;

	@OriginalMember(owner = "client!rd", name = "z", descriptor = "Lclient!v;")
	private static Class76 aClass76_1084 = Static134.method2017("button near the top of that page)3");

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Lclient!v;")
	public static Class76 aClass76_1073 = aClass76_1084;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "Lclient!v;")
	public static Class76 aClass76_1074 = aClass76_1071;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Lclient!v;")
	public static Class76 aClass76_1075 = aClass76_1071;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "Lclient!v;")
	private static Class76 aClass76_1076 = Static134.method2017("Loaded title screen");

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
	public static final int anInt2311 = 7759444;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Lclient!v;")
	private static Class76 aClass76_1077 = Static134.method2017("wave:");

	@OriginalMember(owner = "client!rd", name = "q", descriptor = "Lclient!v;")
	public static Class76 aClass76_1078 = Static134.method2017("Ung-Ultiger Benutzername");

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "Lclient!v;")
	public static Class76 aClass76_1079 = Static134.method2017("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!rd", name = "u", descriptor = "Lclient!v;")
	public static Class76 aClass76_1081 = Static134.method2017(": ");

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "Lclient!v;")
	public static Class76 aClass76_1082 = aClass76_1077;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "Lclient!v;")
	public static Class76 aClass76_1083 = aClass76_1076;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "Lclient!v;")
	public static Class76 aClass76_1085 = aClass76_1077;

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "Lclient!v;")
	public static Class76 aClass76_1086 = null;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!ke;Lclient!la;Lclient!la;Lclient!la;)Z")
	public static boolean method1592(@OriginalArg(1) Class4_Sub12_Sub2 arg0, @OriginalArg(2) Class17 arg1, @OriginalArg(3) Class17 arg2, @OriginalArg(4) Class17 arg3) {
		Static30.aClass4_Sub12_Sub2_4 = arg0;
		Static3.aClass17_29 = arg2;
		Static123.aClass17_40 = arg1;
		Static118.aClass17_38 = arg3;
		return true;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method1593(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(5) String local5 = "";
			if (arg1 != null) {
				local5 = Static68.method1139(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local5 = local5 + " | ";
				}
				local5 = local5 + arg0;
			}
			System.out.println("Error: " + local5);
			local5 = local5.replace(':', '.');
			local5 = local5.replace('@', '_');
			local5 = local5.replace('&', '_');
			local5 = local5.replace('#', '_');
			if (Static38.aClass14_1.anApplet1 != null) {
				@Pc(99) Class24 local99 = Static38.aClass14_1.method187(new URL(Static38.aClass14_1.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static120.anInt2590 + "&u=" + Static6.aLong11 + "&v1=" + Static16.aString2 + "&v2=" + Static16.aString3 + "&e=" + local5));
				while (local99.anInt814 == 0) {
					Static6.method84(1L);
				}
				if (local99.anInt814 == 1) {
					@Pc(122) DataInputStream local122 = (DataInputStream) local99.anObject10;
					local122.read();
					local122.close();
				}
			}
		} catch (@Pc(129) Exception local129) {
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	public static void method1594() {
		aClass76_1074 = null;
		aClass76_1082 = null;
		aClass76_1073 = null;
		anIntArray321 = null;
		aClass76_1080 = null;
		aClass76_1070 = null;
		aClass76_1072 = null;
		aClass76_1085 = null;
		aClass76_1075 = null;
		aClass46_1 = null;
		aClass76_1084 = null;
		aClass76_1083 = null;
		aClass76_1086 = null;
		aClass76_1078 = null;
		aClass76_1071 = null;
		aClass76_1081 = null;
		aClass76_1076 = null;
		aClass76_1079 = null;
		aClass76_1077 = null;
		aClass17_30 = null;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Lclient!of;")
	public static Class2 method1595() {
		try {
			return (Class2) Class.forName("Class2_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return new Class2_Sub1();
		}
	}
}
