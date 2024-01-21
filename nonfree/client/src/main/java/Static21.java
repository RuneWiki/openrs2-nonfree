import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
	public static int anInt2493;

	@OriginalMember(owner = "client!dc", name = "lb", descriptor = "Lclient!k;")
	public static Class33 aClass33_39;

	@OriginalMember(owner = "client!dc", name = "qb", descriptor = "I")
	public static int anInt2500;

	@OriginalMember(owner = "client!dc", name = "rb", descriptor = "Lclient!k;")
	public static Class33 aClass33_40;

	@OriginalMember(owner = "client!dc", name = "Z", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1122 = Static24.method441("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!dc", name = "bb", descriptor = "[Z")
	public static boolean[] aBooleanArray22 = new boolean[5];

	@OriginalMember(owner = "client!dc", name = "db", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1123 = Static24.method441("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!dc", name = "eb", descriptor = "I")
	public static int anInt2494 = -1;

	@OriginalMember(owner = "client!dc", name = "hb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1124 = Static24.method441("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!dc", name = "ib", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1125 = Static24.method441("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!dc", name = "jb", descriptor = "[I")
	public static int[] anIntArray325 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

	@OriginalMember(owner = "client!dc", name = "kb", descriptor = "Lclient!ge;")
	public static Class21 aClass21_32 = new Class21(64);

	@OriginalMember(owner = "client!dc", name = "mb", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1126 = Static24.method441("*6n");

	@OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
	public static volatile int anInt2498 = 0;

	@OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
	public static int anInt2499 = 127;

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)V")
	public static void method1509() {
		Static6.aClass21_3.method743();
		Static60.aClass21_24.method743();
		Static13.aClass21_5.method743();
		Static62.aClass21_25.method743();
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)V")
	public static void method1510() {
		aClass65_1125 = null;
		aClass33_40 = null;
		aClass65_1126 = null;
		aClass65_1122 = null;
		anIntArray325 = null;
		aClass33_39 = null;
		aClass65_1124 = null;
		aClass21_32 = null;
		aClass65_1123 = null;
		aBooleanArray22 = null;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I")
	public static int method1513(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 <= 0 || local6 >= 256) {
			local6 = -1;
		}
		return local6;
	}
}
