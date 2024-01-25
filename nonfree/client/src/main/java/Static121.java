import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static121 {

	@OriginalMember(owner = "client!ft", name = "h", descriptor = "Lclient!qa;")
	public static Class172 aClass172_3;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "Lclient!qj;")
	public static Class204 aClass204_3;

	@OriginalMember(owner = "client!ft", name = "g", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_83 = new Class189("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "Z")
	public static boolean aBoolean227 = false;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "Lclient!op;")
	public static final Class182 aClass182_5 = new Class182("WTI", 5);

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(B[I[J)V")
	public static void method1959(@OriginalArg(1) int[] arg0, @OriginalArg(2) long[] arg1) {
		Static249.method3736(arg0, 0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(II)I")
	public static int method1960(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static419.aByteArrayArray22 == null ? 0 : Static419.aByteArrayArray22[arg0][arg1] & 0xFF;
	}
}
