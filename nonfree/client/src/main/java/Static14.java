import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "Lclient!jc;")
	public static Class145 aClass145_2;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "J")
	public static long aLong11;

	@OriginalMember(owner = "client!ai", name = "p", descriptor = "F")
	public static float aFloat45;

	@OriginalMember(owner = "client!ai", name = "m", descriptor = "Lclient!h;")
	public static final Class114 aClass114_3 = new Class114("Loading HW3D - ", "Lade HW3D - ", "Chargement HW3D - ", "Carregando HW3D - ");

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "[C")
	public static final char[] aCharArray1 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILjava/lang/Object;II)[B")
	public static byte[] method719(@OriginalArg(0) int arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return Static31.method1231(arg0, local13);
		} else if (arg1 instanceof Class68) {
			@Pc(25) Class68 local25 = (Class68) arg1;
			return local25.method2196(arg0);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method721(@OriginalArg(0) String arg0) {
		System.exit(1);
	}
}
