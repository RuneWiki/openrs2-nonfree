import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static206 {

	@OriginalMember(owner = "client!kl", name = "c", descriptor = "I")
	public static int anInt4215;

	@OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
	public static int anInt4217;

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!nf;")
	public static Class169 aClass169_2;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_57 = new Class21("rating: ", "Kampfstufe: ", "classement ", "qualificação: ");

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "[I")
	public static final int[] anIntArray320 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!kl", name = "e", descriptor = "[I")
	public static final int[] anIntArray321 = new int[250];

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IZZ)Ljava/lang/String;")
	public static String method3645(@OriginalArg(0) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static12.method4709(arg0);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method3647(@OriginalArg(1) Class30 arg0) {
		if (Static87.aBoolean142) {
			Static359.method5162(arg0);
		} else {
			Static261.method4241(arg0);
		}
	}
}
