import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static51 {

	@OriginalMember(owner = "client!gd", name = "l", descriptor = "Lclient!ah;")
	public static Class7 aClass7_24;

	@OriginalMember(owner = "client!gd", name = "q", descriptor = "B")
	public static byte aByte4;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Lclient!gf;")
	public static Class33 aClass33_6;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "Lclient!eh;")
	private static Class28 aClass28_440 = Static170.method3101("Close");

	@OriginalMember(owner = "client!gd", name = "A", descriptor = "Lclient!eh;")
	private static Class28 aClass28_445 = Static170.method3101("Prepared visibility map");

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "Lclient!eh;")
	public static Class28 aClass28_441 = aClass28_445;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Lclient!eh;")
	public static Class28 aClass28_442 = Static170.method3101("null");

	@OriginalMember(owner = "client!gd", name = "r", descriptor = "Lclient!eh;")
	public static Class28 aClass28_443 = aClass28_440;

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "I")
	public static int anInt1446 = 0;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "I")
	public static int anInt1448 = 127;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!eh;")
	public static Class28 aClass28_444 = Static170.method3101("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Lclient!ib;")
	public static Class3_Sub8_Sub1 aClass3_Sub8_Sub1_2 = new Class3_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "Lclient!eh;")
	public static Class28 aClass28_446 = Static170.method3101("<col=ffff00>");

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!eh;")
	public static Class28 aClass28_447 = Static170.method3101("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V")
	public static void method1191() {
		Static179.aBoolean202 = true;
		Static92.aBoolean194 = true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ILclient!eh;ILclient!eh;)V")
	public static void method1192(@OriginalArg(1) Class28 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class28 arg2) {
		Static115.method2299(arg1, arg0, arg2, null);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	public static void method1193() {
		aClass33_6 = null;
		aClass28_446 = null;
		aClass28_442 = null;
		aClass28_443 = null;
		aClass28_444 = null;
		aClass28_445 = null;
		aClass28_440 = null;
		aClass3_Sub8_Sub1_2 = null;
		aClass7_24 = null;
		aClass28_441 = null;
		aClass28_447 = null;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!ah;B)V")
	public static void method1194(@OriginalArg(0) Class7 arg0) {
		Static17.aClass7_10 = arg0;
	}
}
