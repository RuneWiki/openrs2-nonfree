import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!u", name = "r", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_17;

	@OriginalMember(owner = "client!u", name = "z", descriptor = "[I")
	public static int[] anIntArray333;

	@OriginalMember(owner = "client!u", name = "Q", descriptor = "Lclient!dd;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!u", name = "q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1254 = method1737("null");

	@OriginalMember(owner = "client!u", name = "s", descriptor = "I")
	public static int anInt2494 = 0;

	@OriginalMember(owner = "client!u", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_1255 = method1737("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!u", name = "x", descriptor = "[I")
	public static int[] anIntArray332 = new int[4000];

	@OriginalMember(owner = "client!u", name = "y", descriptor = "Lclient!na;")
	public static Class53 aClass53_1256 = method1737("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!u", name = "A", descriptor = "Lclient!na;")
	public static Class53 aClass53_1257 = method1737("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!u", name = "B", descriptor = "Lclient!na;")
	public static Class53 aClass53_1258 = method1737("Wen m-Ochten Sie der Liste hinzuf-Ugen?");

	@OriginalMember(owner = "client!u", name = "D", descriptor = "Z")
	public static boolean aBoolean105 = false;

	@OriginalMember(owner = "client!u", name = "F", descriptor = "Lclient!na;")
	private static Class53 aClass53_1260 = method1737("flash2:");

	@OriginalMember(owner = "client!u", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_1259 = aClass53_1260;

	@OriginalMember(owner = "client!u", name = "I", descriptor = "Lclient!na;")
	public static Class53 aClass53_1261 = method1737("_");

	@OriginalMember(owner = "client!u", name = "L", descriptor = "Lclient!na;")
	private static Class53 aClass53_1262 = method1737("Trade)4compete");

	@OriginalMember(owner = "client!u", name = "T", descriptor = "Lclient!na;")
	public static Class53 aClass53_1263 = method1737(",Zffentlicher Chat");

	@OriginalMember(owner = "client!u", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_1264 = aClass53_1260;

	@OriginalMember(owner = "client!u", name = "W", descriptor = "Lclient!na;")
	public static Class53 aClass53_1265 = aClass53_1262;

	@OriginalMember(owner = "client!u", name = "Z", descriptor = "Lclient!na;")
	public static Class53 aClass53_1266 = method1737("titlebox");

	@OriginalMember(owner = "client!u", name = "c", descriptor = "(I)V")
	public static void method1736() {
		if (!Static117.aBoolean119) {
			return;
		}
		@Pc(15) Class3_Sub1_Sub15 local15 = Static38.method782(Static113.anInt2603, Static77.anInt1947);
		if (local15 != null && local15.anObjectArray14 != null) {
			Static12.method188(0, 0, local15, 0, null, local15.anObjectArray14);
		}
		Static117.aBoolean119 = false;
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(ILjava/lang/String;)Lclient!na;")
	public static Class53 method1737(@OriginalArg(1) String arg0) {
		@Pc(2) byte[] local2 = arg0.getBytes();
		@Pc(5) int local5 = local2.length;
		@Pc(13) Class53 local13 = new Class53();
		local13.aByteArray43 = new byte[local5];
		@Pc(19) int local19 = 0;
		while (local5 > local19) {
			@Pc(27) int local27 = local2[local19++] & 0xFF;
			if (local27 <= 45 && local27 >= 40) {
				if (local5 <= local19) {
					break;
				}
				@Pc(47) int local47 = local2[local19++] & 0xFF;
				local13.aByteArray43[local13.anInt1890++] = (byte) (local47 + local27 * 43 - 48 - 1720);
			} else if (local27 != 0) {
				local13.aByteArray43[local13.anInt1890++] = (byte) local27;
			}
		}
		local13.method1278();
		return local13.method1264();
	}

	@OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
	public static void method1738() {
		aClass53_1266 = null;
		aClass53_1262 = null;
		aClass53_1254 = null;
		anIntArray333 = null;
		aClass53_1259 = null;
		aClass53_1257 = null;
		aClass53_1263 = null;
		aClass53_1256 = null;
		aClass53_1255 = null;
		aClass62_Sub1_17 = null;
		aClass53_1261 = null;
		anIntArray332 = null;
		aClass53_1264 = null;
		aClass17_4 = null;
		aClass53_1265 = null;
		aClass53_1260 = null;
		aClass53_1258 = null;
	}

	@OriginalMember(owner = "client!u", name = "b", descriptor = "(B)V")
	public static void method1739() {
		try {
			@Pc(2) Graphics local2 = Static87.aCanvas1.getGraphics();
			Static118.aClass27_44.method1536(205, local2, 553);
		} catch (@Pc(10) Exception local10) {
			Static87.aCanvas1.repaint();
		}
	}
}
