import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!kt", name = "j", descriptor = "[I")
	public static final int[] anIntArray374 = new int[3];

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "Lclient!dka;")
	public static final Class85 aClass85_39 = new Class85(128, 4);

	@OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
	public static final int[] anIntArray375 = new int[2048];

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!et;B)Lclient!nda;")
	public static Class255 method4805(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(16) Class255 local16 = new Class255();
		local16.anInt6827 = arg0.method8575();
		local16.aClass2_Sub6_Sub8_1 = Static645.aClass180_2.method3843(local16.anInt6827);
		return local16;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IC)C")
	public static char method4806(@OriginalArg(1) char arg0) {
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

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(II)Z")
	public static boolean method4807(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class2_Sub6_Sub20 local18 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1226(7); local18 != null; local18 = (Class2_Sub6_Sub20) Static273.aClass60_88.method1228()) {
			if (Static690.method9315(local18.anInt9603) && (long) arg0 == local18.aLong302) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method4808(@OriginalArg(0) Class145 arg0) {
		Static497.aClass173Array1 = new Class173[Static167.anIntArray217.length];
		for (@Pc(11) int local11 = 0; local11 < Static167.anIntArray217.length; local11++) {
			@Pc(26) int local26 = Static167.anIntArray217[local11];
			@Pc(31) Class289 local31 = Static597.method8191(Static246.aClass254_84, local26);
			@Pc(39) Class68 local39 = arg0.method9707(local31, Static737.method8361(Static695.aClass254_165, local26), true);
			Static497.aClass173Array1[local11] = new Class173(local39, local31);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
	public static void method4811(@OriginalArg(1) int arg0) {
		Static537.anInt5296 = -1;
		Static657.anInt10294 = -1;
		Static681.anInt10509 = arg0;
		Static360.method5164();
	}
}
