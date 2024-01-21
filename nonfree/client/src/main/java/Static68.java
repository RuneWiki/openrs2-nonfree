import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!m", name = "m", descriptor = "Lclient!re;")
	public static Class9 aClass9_32;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "Lclient!g;")
	public static Class26 aClass26_14;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Lclient!u;")
	private static Class74 aClass74_1046 = Static72.method1077("To");

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_1047 = Static72.method1077("title)3jpg");

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	public static int anInt1490 = 0;

	@OriginalMember(owner = "client!m", name = "d", descriptor = "Lclient!u;")
	public static Class74 aClass74_1048 = Static72.method1077("(U5");

	@OriginalMember(owner = "client!m", name = "i", descriptor = "Lclient!u;")
	private static Class74 aClass74_1052 = Static72.method1077("This computers address has been blocked");

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1049 = aClass74_1052;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_1050 = Static72.method1077("Bitte laden Sie die Seite neu)3");

	@OriginalMember(owner = "client!m", name = "n", descriptor = "Lclient!u;")
	private static Class74 aClass74_1055 = Static72.method1077("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!m", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1051 = aClass74_1055;

	@OriginalMember(owner = "client!m", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_1053 = aClass74_1046;

	@OriginalMember(owner = "client!m", name = "r", descriptor = "Lclient!u;")
	private static Class74 aClass74_1056 = Static72.method1077("Your account has been disabled)3");

	@OriginalMember(owner = "client!m", name = "l", descriptor = "Lclient!u;")
	public static Class74 aClass74_1054 = aClass74_1056;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	public static int anInt1493 = 0;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "I")
	public static int anInt1494 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method1033() {
		aClass74_1048 = null;
		aClass74_1047 = null;
		aClass9_32 = null;
		aClass74_1051 = null;
		aClass74_1055 = null;
		aClass74_1056 = null;
		aClass74_1049 = null;
		aClass26_14 = null;
		aClass74_1054 = null;
		aClass74_1050 = null;
		aClass74_1053 = null;
		aClass74_1046 = null;
		aClass74_1052 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
	public static void method1034() {
		try {
			@Pc(10) Graphics local10 = Static51.aCanvas2.getGraphics();
			Static107.aClass9_52.method1585(4, local10, 4);
		} catch (@Pc(18) Exception local18) {
			Static51.aCanvas2.repaint();
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V")
	public static void method1035() {
		try {
			@Pc(2) Graphics local2 = Static51.aCanvas2.getGraphics();
			Static78.aClass9_38.method1585(205, local2, 553);
		} catch (@Pc(10) Exception local10) {
			Static51.aCanvas2.repaint();
		}
	}
}
