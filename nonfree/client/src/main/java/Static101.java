import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gj", name = "e", descriptor = "Lclient!ct;")
	public static Class30 aClass30_30;

	@OriginalMember(owner = "client!gj", name = "m", descriptor = "Lclient!ct;")
	public static Class30 aClass30_31;

	@OriginalMember(owner = "client!gj", name = "o", descriptor = "I")
	public static int anInt2315;

	@OriginalMember(owner = "client!gj", name = "h", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_78 = new Class106("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!gj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString9 = null;

	@OriginalMember(owner = "client!gj", name = "n", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_79 = new Class106("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)I")
	public static int method2223(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!fp;IIILclient!eb;)V")
	public static void method2226(@OriginalArg(0) Class63 arg0, @OriginalArg(4) Class42 arg1) {
		Static164.aClass42_22.method1542();
		if (Static308.aBoolean441) {
			return;
		}
		for (@Pc(16) Class1_Sub17 local16 = (Class1_Sub17) arg1.method1543(); local16 != null; local16 = (Class1_Sub17) arg1.method1551()) {
			@Pc(25) Class194 local25 = Static226.method4184(local16.anInt1640);
			if (Static284.method5723(local25)) {
				@Pc(37) boolean local37 = Static234.method4344(local25, local16, arg0);
				if (local37) {
					Static24.method610(local25, local16, arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(ILclient!ct;)V")
	public static void method2228(@OriginalArg(1) Class30 arg0) {
		Static253.aClass30_76 = arg0;
	}
}
