import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!q", name = "g", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!q", name = "C", descriptor = "I")
	public static int anInt2210;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1052 = Static87.method1648("Classic");

	@OriginalMember(owner = "client!q", name = "c", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1053 = Static87.method1648("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!q", name = "e", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1054 = Static87.method1648(": ");

	@OriginalMember(owner = "client!q", name = "f", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1055 = Static87.method1648("Absender:");

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Lclient!he;")
	public static Class28 aClass28_10 = new Class28();

	@OriginalMember(owner = "client!q", name = "j", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1056 = Static87.method1648("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!q", name = "l", descriptor = "I")
	public static int anInt2201 = 0;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1057 = Static87.method1648("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!q", name = "r", descriptor = "[I")
	public static int[] anIntArray335 = new int[2048];

	@OriginalMember(owner = "client!q", name = "s", descriptor = "[J")
	public static long[] aLongArray11 = new long[100];

	@OriginalMember(owner = "client!q", name = "v", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1058 = Static87.method1648(" @whi@(X");

	@OriginalMember(owner = "client!q", name = "B", descriptor = "[I")
	public static int[] anIntArray336 = new int[500];

	@OriginalMember(owner = "client!q", name = "E", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1059 = Static87.method1648(" )2> @cya@");

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
	public static void method1553() {
		if (Static50.aClass35_1 != null) {
			@Pc(3) Class35 local3 = Static50.aClass35_1;
			synchronized (Static50.aClass35_1) {
				Static50.aClass35_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "(I)V")
	public static void method1555() {
		aClass27_1053 = null;
		aClass27_1054 = null;
		aClass27_1055 = null;
		anIntArray336 = null;
		aClass27_1058 = null;
		anIntArray335 = null;
		aClass27_1056 = null;
		aClass27_1059 = null;
		aByteArrayArrayArray7 = null;
		aLongArray11 = null;
		aClass27_1057 = null;
		aClass27_1052 = null;
		aClass28_10 = null;
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "(I)V")
	public static void method1556() {
		try {
			@Pc(2) Graphics local2 = Static19.aCanvas1.getGraphics();
			Static61.aClass12_46.method671(550, local2, 4);
		} catch (@Pc(10) Exception local10) {
			Static19.aCanvas1.repaint();
		}
	}
}
