import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "[I")
	public static int[] anIntArray190;

	@OriginalMember(owner = "client!jf", name = "bb", descriptor = "[[B")
	public static byte[][] aByteArrayArray6;

	@OriginalMember(owner = "client!jf", name = "lb", descriptor = "Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 aClass6_Sub3_Sub3_Sub3_12;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "Lclient!rd;")
	private static Class63 aClass63_971 = Static80.method1463("To play on this world move to a free area first");

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "Lclient!rd;")
	private static Class63 aClass63_972 = Static80.method1463("Loading title screen )2 ");

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "Lclient!rd;")
	public static Class63 aClass63_973 = aClass63_972;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "Lclient!rd;")
	public static Class63 aClass63_974 = aClass63_971;

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
	public static int anInt1802 = 0;

	@OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
	public static int anInt1804 = 0;

	@OriginalMember(owner = "client!jf", name = "S", descriptor = "I")
	public static int anInt1806 = 0;

	@OriginalMember(owner = "client!jf", name = "T", descriptor = "Lclient!rd;")
	private static Class63 aClass63_975 = Static80.method1463("Checking for updates )2 ");

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_976 = aClass63_975;

	@OriginalMember(owner = "client!jf", name = "fb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_977 = Static80.method1463("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!jf", name = "gb", descriptor = "Z")
	public static boolean aBoolean98 = false;

	@OriginalMember(owner = "client!jf", name = "kb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_978 = Static80.method1463("::fpsoff");

	@OriginalMember(owner = "client!jf", name = "nb", descriptor = "[I")
	public static int[] anIntArray193 = new int[500];

	@OriginalMember(owner = "client!jf", name = "pb", descriptor = "Lclient!rd;")
	public static Class63 aClass63_979 = Static80.method1463("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
	public static void method1187() {
		Class6_Sub10.anIntArray191 = null;
		anIntArray190 = null;
		aClass63_972 = null;
		aClass63_976 = null;
		aClass63_974 = null;
		aClass63_971 = null;
		aClass63_975 = null;
		aClass63_973 = null;
		aClass63_977 = null;
		anIntArray193 = null;
		aByteArrayArray6 = null;
		aClass6_Sub3_Sub3_Sub3_12 = null;
		aClass63_978 = null;
		aClass63_979 = null;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method1188() {
		Static15.aClass29_5.method1431();
		Static2.anIntArray3 = Static107.method1987(Static2.anIntArray3);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method1189(@OriginalArg(1) int arg0) {
		@Pc(6) Class6_Sub7 local6 = (Class6_Sub7) Static72.aClass2_8.method20((long) arg0);
		if (local6 != null) {
			local6.method2123();
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!ge;III)[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] method1190(@OriginalArg(0) Class7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static76.method1433(arg2, arg0, arg1) ? Static92.method1677() : null;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method1192() {
		Static113.aClass49_7.method1389();
	}
}
