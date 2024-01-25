import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!rm", name = "c", descriptor = "Lclient!rm;")
	public static Class290 aClass290_1;

	@OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
	public static boolean aBoolean595;

	@OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
	public static int anInt7522 = -1;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	public static int anInt7524 = 100;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(CI)C")
	public static char method6375(@OriginalArg(0) char arg0) {
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

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(ILclient!an;)I")
	public static int method6379(@OriginalArg(1) Class9_Sub1_Sub1_Sub2_Sub1 arg0) {
		@Pc(8) Class294 local8 = arg0.aClass294_1;
		if (local8.anIntArray588 != null) {
			local8 = local8.method6429(Static427.aClass56_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(30) int local30 = local8.anInt7598;
		@Pc(34) Class267 local34 = arg0.method5573();
		if (arg0.aBoolean528) {
			local30 = local8.anInt7593;
		} else if (arg0.anInt6461 == local34.anInt7022 || arg0.anInt6461 == local34.anInt7026 || arg0.anInt6461 == local34.anInt7028 || arg0.anInt6461 == local34.anInt7037) {
			local30 = local8.anInt7612;
		} else if (local34.anInt7013 == arg0.anInt6461 || arg0.anInt6461 == local34.anInt7034 || arg0.anInt6461 == local34.anInt7018 || local34.anInt7010 == arg0.anInt6461) {
			local30 = local8.anInt7603;
		}
		return local30;
	}
}
