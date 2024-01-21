import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static22 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!ge;")
	public static Class7 aClass7_12;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "[I")
	public static int[] anIntArray65;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!rd;")
	private static Class63 aClass63_444 = Static80.method1463("Login server offline)3");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!rd;")
	public static Class63 aClass63_443 = aClass63_444;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!rd;")
	private static Class63 aClass63_447 = Static80.method1463("Enter your username (V password)3");

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!rd;")
	public static Class63 aClass63_445 = aClass63_447;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!rd;")
	public static Class63 aClass63_446 = Static80.method1463("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!db", name = "g", descriptor = "I")
	public static int anInt687 = 0;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public static int anInt689 = 0;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!rd;")
	public static Class63 aClass63_448 = Static80.method1463("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
	public static void method530() {
		aClass7_12 = null;
		aClass63_447 = null;
		aClass63_444 = null;
		aClass63_443 = null;
		aClass63_448 = null;
		anIntArray65 = null;
		aClass63_446 = null;
		aClass63_445 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(BIILclient!ge;)Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3 method531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2) {
		return Static76.method1433(arg1, arg2, arg0) ? Static36.method868() : null;
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
	public static void method532() {
		if (Static65.aClass65_1 != null) {
			@Pc(3) Class65 local3 = Static65.aClass65_1;
			synchronized (Static65.aClass65_1) {
				Static65.aClass65_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "c", descriptor = "(I)V")
	public static void method533() {
		Static57.aClass29_9.method1431();
		Static17.aClass6_Sub3_Sub3_Sub3_23.method1768(0, 0);
		Static99.anIntArray295 = Static107.method1987(Static99.anIntArray295);
	}
}
