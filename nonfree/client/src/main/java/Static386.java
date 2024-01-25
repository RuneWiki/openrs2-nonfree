import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static386 {

	@OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
	public static int anInt6383;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_80 = new Class154(8, -1);

	@OriginalMember(owner = "client!oi", name = "d", descriptor = "[Lclient!oda;")
	public static final Class2_Sub34[] aClass2_Sub34Array1 = new Class2_Sub34[300];

	@OriginalMember(owner = "client!oi", name = "i", descriptor = "Lclient!iba;")
	public static final Class154 aClass154_81 = new Class154(60, 5);

	@OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
	public static int anInt6384 = 0;

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILclient!nb;)Z")
	public static boolean method5337(@OriginalArg(1) Class232 arg0) {
		return Static225.aClass232_9 == arg0 || Static580.aClass232_20 == arg0 || Static295.aClass232_12 == arg0 || Static140.aClass232_11 == arg0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Z)V")
	public static void method5338() {
		if (!Static219.method2676()) {
			return;
		}
		if (Static311.aStringArray28 == null) {
			Static523.method6733();
		}
		Static493.aBoolean661 = true;
		Static240.anInt9590 = 0;
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lclient!mv;I)V")
	public static void method5339(@OriginalArg(0) Class229 arg0) {
		Static249.anInt4135 = arg0.method4955("hitmarks");
		Static92.anInt1637 = arg0.method4955("hitbar_default");
		Static394.anInt6517 = arg0.method4955("timerbar_default");
		Static162.anInt2513 = arg0.method4955("headicons_pk");
		anInt6383 = arg0.method4955("headicons_prayer");
		Static203.anInt2985 = arg0.method4955("hint_headicons");
		Static178.anInt2663 = arg0.method4955("hint_mapmarkers");
		Static482.anInt7692 = arg0.method4955("mapflag");
		Static528.anInt8478 = arg0.method4955("cross");
		Static288.anInt4884 = arg0.method4955("mapdots");
		Static489.anInt7750 = arg0.method4955("scrollbar");
		Static359.anInt3111 = arg0.method4955("name_icons");
		Static350.anInt5992 = arg0.method4955("floorshadows");
		Static314.anInt7786 = arg0.method4955("compass");
		Static176.anInt2649 = arg0.method4955("otherlevel");
		Static375.anInt6286 = arg0.method4955("hint_mapedge");
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "([[II)V")
	public static void method5340(@OriginalArg(0) int[][] arg0) {
		Static238.anIntArrayArray36 = arg0;
	}
}
