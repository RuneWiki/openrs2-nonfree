import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!rg", name = "E", descriptor = "Lclient!cq;")
	public static Class42 aClass42_5;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_132 = new Class7("Loading title screen - ", "Lade Titelbild - ", "Chargement de l'écran-titre - ", "Carregando tela título - ");

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "[Lclient!up;")
	public static final Class250[] aClass250Array1 = new Class250[128];

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
	public static void method4826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(6) int local6 = arg0 * Static38.aClass135_Sub1_1.anInt5109 >> 8;
		if (local6 != 0 && arg2 != -1) {
			Static328.method4657(Static243.aClass246_136, local6, arg2);
			Static176.aBoolean196 = true;
		}
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IILclient!kk;IIIB)V")
	public static void method4827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31_Sub2_Sub1 arg2, @OriginalArg(5) int arg3) {
		Static208.method3310(arg2.anInt7298, arg1, arg2.aByte100, arg0, arg2.anInt7300, arg3, 0);
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)Ljava/lang/String;")
	public static String method4829(@OriginalArg(1) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static336.aClass7_131.method331(Static341.anInt5770) + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static81.aClass7_43.method331(Static341.anInt5770) + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}
}
