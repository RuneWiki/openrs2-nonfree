import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static48 {

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "[I")
	public static int[] anIntArray181;

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!ta;")
	public static Class70 aClass70_3 = new Class70(512);

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "[[B")
	public static byte[][] aByteArrayArray5 = new byte[250][];

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
	public static int anInt1316 = 0;

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
	public static int anInt1317 = 0;

	@OriginalMember(owner = "client!hc", name = "j", descriptor = "Lclient!kd;")
	public static Class39 aClass39_632 = Static108.method1915("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "Lclient!kd;")
	public static Class39 aClass39_633 = Static108.method1915("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!hc", name = "l", descriptor = "Lclient!kd;")
	public static Class39 aClass39_634 = Static108.method1915("::gc");

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
	public static int anInt1318 = -1;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method831() {
		anIntArray181 = null;
		aClass39_632 = null;
		aClass39_634 = null;
		aClass70_3 = null;
		aByteArrayArray5 = null;
		aClass39_633 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lclient!q;Z)V")
	public static void method832(@OriginalArg(0) Class62 arg0) {
		Static25.aClass62_6 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Lclient!kd;")
	public static Class39 method833(@OriginalArg(0) int arg0) {
		return Static30.method601(new Class39[] { Static69.method1226(arg0 >> 24 & 0xFF), Static2.aClass39_50, Static69.method1226(arg0 >> 16 & 0xFF), Static2.aClass39_50, Static69.method1226(arg0 >> 8 & 0xFF), Static2.aClass39_50, Static69.method1226(arg0 & 0xFF) });
	}
}
