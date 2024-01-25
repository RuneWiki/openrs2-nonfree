import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static32 {

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "Lclient!b;")
	public static Class20 aClass20_14;

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString10;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "Lclient!b;")
	public static Class20 aClass20_15;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "Lclient!vp;")
	public static final Class240 aClass240_7 = new Class240("", 13);

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(I[BI)I")
	public static int method487(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		return Static319.method4846(arg1, arg0, 0);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(BLclient!b;Lclient!np;)V")
	public static void method489(@OriginalArg(1) Class20 arg0, @OriginalArg(2) Class155 arg1) {
		if (Static13.aBoolean407) {
			return;
		}
		arg1.method4921(0);
		Static364.aClass110_20 = arg1.method4869(Static402.method2804(arg0, Static317.anInt4553));
		Static364.aClass110_20.method5094((Static199.anInt3567 - Static364.aClass110_20.method5101()) / 2, (Static207.anInt2251 - Static364.aClass110_20.method5097()) / 2);
		Static69.aClass110_2 = arg1.method4869(Static402.method2804(arg0, Static363.anInt6167));
		Static69.aClass110_2.method5094((Static199.anInt3567 - Static69.aClass110_2.method5101()) / 2, 18);
		Static13.aBoolean407 = true;
	}
}
