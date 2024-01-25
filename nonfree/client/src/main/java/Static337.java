import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "Z")
	public static boolean aBoolean522 = false;

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_119 = new Class256("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "J")
	public static long aLong163 = 0L;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
	public static int anInt5964 = 0;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!vj;")
	public static final Class256 aClass256_120 = new Class256("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!pc;IZ)Lclient!re;")
	public static Class210 method4762(@OriginalArg(0) Class188 arg0, @OriginalArg(1) int arg1) {
		@Pc(13) byte[] local13 = arg0.method4282(arg1);
		return local13 == null ? null : new Class210(local13);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method4763() {
		Static210.aClass41Array2 = null;
		Static439.method5943(0, -1, 0, Static216.anInt4171, Static108.anInt2264, 0, 0, Static96.anInt2175);
		if (Static210.aClass41Array2 != null) {
			Static79.method1388(0, Static216.anInt4171, Static96.anInt2175, -1412584499, Static252.anInt4784, 0, Static107.anInt2235, Static309.aClass41_11.anInt1653, Static210.aClass41Array2);
			Static210.aClass41Array2 = null;
		}
	}
}
