import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static332 {

	@OriginalMember(owner = "client!qg", name = "S", descriptor = "I")
	public static int anInt5976;

	@OriginalMember(owner = "client!qg", name = "f", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_101 = new Class231("glow1:", "leuchten1:", "brillant1:", "brilho1:");

	@OriginalMember(owner = "client!qg", name = "p", descriptor = "J")
	public static long aLong306 = 0L;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!gi;I)Ljava/lang/String;")
	public static String method4735(@OriginalArg(0) Class93 arg0) {
		if (Static53.method860(arg0).method5901() == 0) {
			return null;
		} else if (arg0.aString22 == null || arg0.aString22.trim().length() == 0) {
			return Static464.aBoolean176 ? "Hidden-use" : null;
		} else {
			return arg0.aString22;
		}
	}
}
