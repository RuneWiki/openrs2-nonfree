import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static654 {

	@OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
	public static int anInt10323;

	@OriginalMember(owner = "client!wc", name = "G", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_150 = new Class216(51, 3);

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)Z")
	public static boolean method8725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)V")
	public static void method8727() {
		@Pc(12) Class4_Sub48 local12 = Static335.method4615(Static162.aClass216_55, Static669.aClass196_2);
		local12.aClass4_Sub11_Sub1_2.method8822(Static324.method4462());
		local12.aClass4_Sub11_Sub1_2.method8838(Static632.anInt9867);
		local12.aClass4_Sub11_Sub1_2.method8838(Static357.anInt5421);
		local12.aClass4_Sub11_Sub1_2.method8822(Static124.aClass4_Sub20_4.aClass8_Sub27_2.method7983());
		Static410.method5170(local12);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(CB)C")
	public static char method8728(@OriginalArg(0) char arg0) {
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
