import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "[Lclient!ya;")
	public static Class154[] aClass154Array1;

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "Lclient!cq;")
	public static Class43 aClass43_5;

	@OriginalMember(owner = "client!ij", name = "h", descriptor = "Lclient!ph;")
	public static Class187 aClass187_70;

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!mf;")
	public static final Class163 aClass163_29 = new Class163();

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "Lclient!os;")
	public static final Class182 aClass182_121 = new Class182("flash1:", "blinken1:", "clignotant1:", "flash1:");

	@OriginalMember(owner = "client!ij", name = "i", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)Lclient!ti;")
	public static Class236 method2928(@OriginalArg(0) int arg0) {
		@Pc(10) Class236 local10 = (Class236) Static96.aClass267_16.method6014((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static448.aClass187_123.method4300(1, arg0);
		local10 = new Class236();
		local10.anInt6608 = arg0;
		if (local20 != null) {
			local10.method5178(new Class10_Sub8(local20));
		}
		local10.method5180();
		if (local10.anInt6616 == 2 && Static343.aClass167_23.method3709((long) arg0) == null) {
			Static343.aClass167_23.method3705(new Class10_Sub12(Static27.anInt443), (long) arg0);
			Static276.aClass236Array3[Static27.anInt443++] = local10;
		}
		Static96.aClass267_16.method6008(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public static void method2929() {
		Static106.aClass267_17.method6007(50);
		Static328.aClass267_81.method6007(50);
		Static127.aClass267_20.method6007(50);
		Static188.aClass267_33.method6007(50);
		Static250.aClass267_43.method6007(50);
	}
}
