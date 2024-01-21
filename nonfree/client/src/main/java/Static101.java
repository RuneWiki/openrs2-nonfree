import java.awt.Component;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_40;

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "I")
	public static int anInt2509;

	@OriginalMember(owner = "client!td", name = "Wb", descriptor = "[I")
	public static int[] anIntArray311;

	@OriginalMember(owner = "client!td", name = "fc", descriptor = "Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 aClass3_Sub1_Sub4_Sub3_41;

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "I")
	public static int anInt2505 = 0;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1383 = Static75.method1216("Accept challenge");

	@OriginalMember(owner = "client!td", name = "Db", descriptor = "Lclient!bb;")
	public static Class8 aClass8_30 = new Class8(500);

	@OriginalMember(owner = "client!td", name = "Eb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1384 = Static75.method1216("The server is being updated)3");

	@OriginalMember(owner = "client!td", name = "Rb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1386 = Static75.method1216("This world is full)3");

	@OriginalMember(owner = "client!td", name = "Hb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1385 = aClass4_1386;

	@OriginalMember(owner = "client!td", name = "Jb", descriptor = "I")
	public static int anInt2512 = 0;

	@OriginalMember(owner = "client!td", name = "Kb", descriptor = "[Lclient!bd;")
	public static Class9[] aClass9Array1 = new Class9[50];

	@OriginalMember(owner = "client!td", name = "Ub", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1387 = aClass4_1384;

	@OriginalMember(owner = "client!td", name = "Vb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1388 = Static75.method1216(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!td", name = "Zb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1389 = aClass4_1383;

	@OriginalMember(owner = "client!td", name = "gc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1391 = Static75.method1216("@lre@");

	@OriginalMember(owner = "client!td", name = "hc", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1392 = Static75.method1216("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!td", name = "ic", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rd;B)I")
	public static int method1673(@OriginalArg(0) Class64 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1614(Static43.aClass4_578, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static56.aClass4_719, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static69.aClass4_1271, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static83.aClass4_1096, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static83.aClass4_1094, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static51.aClass4_661, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static94.aClass4_1233, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static53.aClass4_1359, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static103.aClass4_1400, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static70.aClass4_876, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static93.aClass4_1340, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static19.aClass4_237, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static79.aClass4_1058, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static3.aClass4_1295, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static87.aClass4_744, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static4.aClass4_107, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static7.aClass4_133, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static51.aClass4_667, Static44.aClass4_580)) {
			local5++;
		}
		if (arg0.method1614(Static10.aClass4_178, Static44.aClass4_580)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILjava/awt/Component;Lclient!aa;)V")
	public static void method1674(@OriginalArg(1) Component arg0, @OriginalArg(2) Class2 arg1) {
		try {
			@Pc(12) Class22_Sub1 local12 = (Class22_Sub1) Class.forName("Class22_Sub1_Sub2").getDeclaredConstructor().newInstance();
			local12.method1002(arg1, 2048);
			Static85.aClass22_1 = local12;
		} catch (@Pc(20) Throwable local20) {
			try {
				Static85.aClass22_1 = new Class22_Sub1_Sub1(arg1, arg0);
			} catch (@Pc(28) Throwable local28) {
				if (Static2.aString5.toLowerCase().indexOf("microsoft") >= 0) {
					try {
						Static85.aClass22_1 = new Class22_Sub2();
						return;
					} catch (@Pc(42) Throwable local42) {
					}
				}
				Static85.aClass22_1 = new Class22(8000);
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
	public static void method1675(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		try {
			@Pc(3) String local3 = "";
			if (arg0 != null) {
				local3 = Static68.method1114(arg0);
			}
			if (arg1 != null) {
				if (arg0 != null) {
					local3 = local3 + " | ";
				}
				local3 = local3 + arg1;
			}
			System.out.println("Error: " + local3);
			local3 = local3.replace(':', '.');
			local3 = local3.replace('@', '_');
			local3 = local3.replace('&', '_');
			local3 = local3.replace('#', '_');
			@Pc(93) Class42 local93 = Static74.aClass2_3.method14(new URL(Static74.aClass2_3.anApplet1.getCodeBase(), "clienterror.ws?c=" + anInt2509 + "&u=" + Static31.aLong36 + "&v1=" + Static2.aString5 + "&v2=" + Static2.aString1 + "&e=" + local3));
			while (local93.anInt1395 == 0) {
				Static104.method1701(1L);
			}
			if (local93.anInt1395 == 1) {
				@Pc(109) DataInputStream local109 = (DataInputStream) local93.anObject2;
				local109.read();
				local109.close();
			}
		} catch (@Pc(116) Exception local116) {
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(BLclient!rd;)V")
	public static void method1678(@OriginalArg(1) Class64 arg0) {
		Static9.aClass64_11 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "(I)V")
	public static void method1679() {
		aClass8_30 = null;
		anIntArray311 = null;
		aClass4_1387 = null;
		aClass4_1389 = null;
		aClass4_1388 = null;
		aClass4_1383 = null;
		aClass3_Sub1_Sub4_Sub3_40 = null;
		aClass3_Sub1_Sub4_Sub3_41 = null;
		aClass4_1392 = null;
		aClass9Array1 = null;
		aClass4_1386 = null;
		anObject4 = null;
		aClass4_1384 = null;
		aClass4_1385 = null;
		aClass4_1391 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!rd;ILclient!rd;)V")
	public static void method1682(@OriginalArg(0) Class64 arg0, @OriginalArg(2) Class64 arg1) {
		Static63.aClass64_47 = arg0;
		Static98.aClass64_68 = arg1;
	}
}
