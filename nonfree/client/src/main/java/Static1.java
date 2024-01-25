import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static1 {

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "J")
	public static final long aLong189 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "Lclient!kka;")
	public static final Class205 aClass205_12 = new Class205();

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qga;III)V")
	public static void method6045(@OriginalArg(0) Class299 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static649.aClass299_12 != null || Static455.aBoolean533 || (arg0 == null || Static117.method1833(arg0) == null)) {
			return;
		}
		Static649.aClass299_12 = arg0;
		Static530.aClass299_9 = Static117.method1833(arg0);
		Static614.aBoolean702 = false;
		Static109.anInt1855 = arg1;
		Static611.anInt10054 = arg2;
		Static207.anInt3640 = 0;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IC)C")
	public static char method6047(@OriginalArg(1) char arg0) {
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
