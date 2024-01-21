import java.awt.Component;
import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "Ljava/awt/Font;")
	public static Font aFont47;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2 aClass3_Sub1_Sub4_Sub2_52;

	@OriginalMember(owner = "client!be", name = "n", descriptor = "Lclient!sb;")
	public static Class25 aClass25_154;

	@OriginalMember(owner = "client!be", name = "p", descriptor = "Lclient!sb;")
	public static Class25 aClass25_155;

	@OriginalMember(owner = "client!be", name = "x", descriptor = "Lclient!rd;")
	public static Class64 aClass64_82;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1589 = Static75.method1216("level)2");

	@OriginalMember(owner = "client!be", name = "c", descriptor = "I")
	public static int anInt2841 = 0;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1590 = Static75.method1216("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!be", name = "l", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1591 = Static75.method1216("(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

	@OriginalMember(owner = "client!be", name = "m", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1592 = Static75.method1216("::noclip");

	@OriginalMember(owner = "client!be", name = "o", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1593 = Static75.method1216("No reply from loginserver)3");

	@OriginalMember(owner = "client!be", name = "q", descriptor = "I")
	public static int anInt2846 = 0;

	@OriginalMember(owner = "client!be", name = "s", descriptor = "I")
	public static int anInt2847 = 0;

	@OriginalMember(owner = "client!be", name = "u", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1594 = aClass4_1589;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1595 = Static75.method1216("wishes to trade with you)3");

	@OriginalMember(owner = "client!be", name = "y", descriptor = "Z")
	public static boolean aBoolean251 = false;

	@OriginalMember(owner = "client!be", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray55 = new byte[4][104][104];

	@OriginalMember(owner = "client!be", name = "B", descriptor = "I")
	public static int anInt2850 = 0;

	@OriginalMember(owner = "client!be", name = "C", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1596 = Static75.method1216("@gr2@");

	@OriginalMember(owner = "client!be", name = "D", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1597 = aClass4_1593;

	@OriginalMember(owner = "client!be", name = "E", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1598 = aClass4_1595;

	@OriginalMember(owner = "client!be", name = "F", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1599 = Static75.method1216("Nehmen");

	@OriginalMember(owner = "client!be", name = "G", descriptor = "Z")
	public static boolean aBoolean252 = false;

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(I)Z")
	public static boolean method1927() {
		return Static8.aClass30_1 != null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLjava/awt/Component;II)Lclient!sb;")
	public static Class25 method1928(@OriginalArg(1) Component arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class25_Sub1");
			@Pc(16) Class25 local16 = (Class25) local6.getDeclaredConstructor().newInstance();
			local16.method1160(arg2, arg1, arg0);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class25_Sub2 local29 = new Class25_Sub2();
			local29.method1160(arg2, arg1, arg0);
			return local29;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
	public static void method1929() {
		aClass4_1593 = null;
		aClass4_1595 = null;
		aClass25_154 = null;
		aClass4_1594 = null;
		aClass4_1599 = null;
		aClass4_1598 = null;
		aClass3_Sub1_Sub4_Sub2_52 = null;
		aClass64_82 = null;
		aClass25_155 = null;
		aClass4_1590 = null;
		aClass4_1589 = null;
		aClass4_1597 = null;
		aFont47 = null;
		aClass4_1592 = null;
		aClass4_1591 = null;
		aClass4_1596 = null;
		aByteArrayArrayArray55 = null;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method1931(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static100.aClass60_1);
		arg0.addMouseMotionListener(Static100.aClass60_1);
		arg0.addFocusListener(Static100.aClass60_1);
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)V")
	public static void method1932() {
		while (true) {
			if (Static32.aClass3_Sub4_Sub1_2.method461(Static65.anInt1630) >= 11) {
				@Pc(18) int local18 = Static32.aClass3_Sub4_Sub1_2.method462(11);
				if (local18 != 2047) {
					@Pc(25) boolean local25 = false;
					if (Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18] == null) {
						Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18] = new Class3_Sub1_Sub1_Sub1_Sub2();
						if (Static74.aClass3_Sub4Array1[local18] != null) {
							Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18].method1554(Static74.aClass3_Sub4Array1[local18]);
						}
						local25 = true;
					}
					Static92.anIntArray270[anInt2841++] = local18;
					@Pc(61) Class3_Sub1_Sub1_Sub1_Sub2 local61 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local18];
					local61.anInt2343 = Static60.anInt1489;
					@Pc(69) int local69 = Static32.aClass3_Sub4_Sub1_2.method462(1);
					@Pc(74) int local74 = Static32.aClass3_Sub4_Sub1_2.method462(5);
					@Pc(81) int local81 = Static95.anIntArray284[Static32.aClass3_Sub4_Sub1_2.method462(3)];
					if (local25) {
						local61.anInt2293 = local81;
					}
					if (local74 > 15) {
						local74 -= 32;
					}
					@Pc(97) int local97 = Static32.aClass3_Sub4_Sub1_2.method462(5);
					@Pc(102) int local102 = Static32.aClass3_Sub4_Sub1_2.method462(1);
					if (local102 == 1) {
						Static12.anIntArray13[Static95.anInt2230++] = local18;
					}
					if (local97 > 15) {
						local97 -= 32;
					}
					local61.method1553(local97 + Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray286[0], local69 == 1, Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anIntArray289[0] + local74);
					continue;
				}
			}
			Static32.aClass3_Sub4_Sub1_2.method467();
			return;
		}
	}
}
