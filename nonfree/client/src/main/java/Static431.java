import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
	public static boolean aBoolean568;

	@OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
	public static final int[] anIntArray473 = new int[13];

	@OriginalMember(owner = "client!qd", name = "e", descriptor = "Z")
	public static boolean aBoolean567 = true;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIB)Z")
	public static boolean method5688(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static313.aClass25_5.method5881(arg0, arg2, arg1, Static422.anIntArray451);
		@Pc(13) int local13 = Static422.anIntArray451[2];
		if (local13 < 50) {
			return false;
		} else {
			Static422.anIntArray451[0] = Static491.anInt7778 * Static422.anIntArray451[0] / local13 + Static519.anInt1794;
			Static422.anIntArray451[2] = local13;
			Static422.anIntArray451[1] = Static249.anInt4134 * Static422.anIntArray451[1] / local13 + Static394.anInt6526;
			return true;
		}
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V")
	public static void method5689(@OriginalArg(0) boolean arg0) {
		if (Static280.aString57.length() == 0) {
			return;
		}
		Static144.method1990("--> " + Static280.aString57);
		Static66.method1101(false, arg0, Static280.aString57);
		Static27.anInt452 = 0;
		Static306.anInt5072 = 0;
		Static280.aString57 = "";
	}
}
