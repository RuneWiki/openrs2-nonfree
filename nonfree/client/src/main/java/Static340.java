import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static340 {

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!mu;")
	public static Class196 aClass196_6;

	@OriginalMember(owner = "client!o", name = "f", descriptor = "Lclient!fv;")
	public static Class98 aClass98_2;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_84 = new Class158(52, -1);

	@OriginalMember(owner = "client!o", name = "g", descriptor = "I")
	public static int anInt6417 = -1;

	@OriginalMember(owner = "client!o", name = "h", descriptor = "I")
	public static int anInt6418 = 0;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "I")
	public static final int anInt6419 = 328;

	@OriginalMember(owner = "client!o", name = "j", descriptor = "Z")
	public static volatile boolean aBoolean409 = false;

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ZZB)V")
	public static void method5406(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static17.anInt4281++;
			Static316.method5112();
		}
		if (arg0) {
			Static387.anInt9439++;
			Static211.method3879();
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(ILclient!ew;BLclient!ba;II)V")
	public static void method5407(@OriginalArg(0) int arg0, @OriginalArg(1) Class81 arg1, @OriginalArg(3) Class2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 != null) {
			arg1.method2217(arg2.K(), arg2.EA(), arg0, arg4, arg2.ZA(), arg2.ha(), arg2.DA(), arg3, arg2.LA(), arg2.M());
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IC)C")
	public static char method5408(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
