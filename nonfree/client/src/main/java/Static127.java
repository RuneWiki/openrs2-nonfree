import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static127 {

	@OriginalMember(owner = "client!hs", name = "D", descriptor = "I")
	public static int anInt2772;

	@OriginalMember(owner = "client!hs", name = "x", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_99 = new Class106("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!hs", name = "A", descriptor = "Lclient!bn;")
	public static final Class18 aClass18_94 = new Class18(47, -1);

	@OriginalMember(owner = "client!hs", name = "B", descriptor = "[I")
	public static int[] anIntArray207 = new int[2];

	@OriginalMember(owner = "client!hs", name = "C", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_100 = new Class106("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(Ljava/lang/String;IB)V")
	public static void method2640(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		Static280.method5009(Static337.aClass18_216);
		Static339.aClass1_Sub7_Sub2_4.method2121(Static131.method2688(arg0) + 1);
		Static339.aClass1_Sub7_Sub2_4.method2121(arg1);
		Static339.aClass1_Sub7_Sub2_4.method2106(arg0);
	}

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IBI)V")
	public static void method2641(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static272.method4850(arg1)) {
			Static319.method5494(arg0, Static341.aClass112ArrayArray1[arg1]);
		}
	}
}
