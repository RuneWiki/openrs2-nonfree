import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
	public static boolean aBoolean430 = false;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_185 = new Class221("Loading fonts - ", "Lade Schriftsätze - ", "Chargement des polices - ", "Carregando fontes - ");

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "[B")
	public static final byte[] aByteArray85 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "Lclient!tm;")
	public static final Class221 aClass221_186 = new Class221("wave:", "welle:", "ondulation:", "onda:");

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "Lclient!sm;")
	public static final Class210 aClass210_43 = new Class210();

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	public static int anInt5488 = -1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(II)I")
	public static int method4780(@OriginalArg(1) int arg0) {
		@Pc(18) int local18 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local32 * local18 >> 12;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "([I[JB)V")
	public static void method4791(@OriginalArg(0) int[] arg0, @OriginalArg(1) long[] arg1) {
		Static365.method2197(arg0, 0, arg1.length - 1, arg1);
	}
}
