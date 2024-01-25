import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static163 {

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "Lclient!rp;")
	public static Class212 aClass212_1;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "[Lclient!uh;")
	public static final Class240[] aClass240Array1 = new Class240[4];

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!ne;")
	public static final Class170 aClass170_6 = new Class170("WTWIP", 3);

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_50 = new Class198("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!hr", name = "n", descriptor = "Lclient!pn;")
	public static final Class194 aClass194_43 = new Class194(2, -1);

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(B)I")
	public static int method2299() {
		return Static369.anInt6043;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(III)Z")
	public static boolean method2300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x100) != 0;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I")
	public static int method2301(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
