import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static182 {

	@OriginalMember(owner = "client!it", name = "a", descriptor = "I")
	public static int anInt3699;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "F")
	public static float aFloat58;

	@OriginalMember(owner = "client!it", name = "m", descriptor = "[I")
	public static int[] anIntArray374;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "Lclient!s;")
	public static final Class217 aClass217_83 = new Class217(65, 3);

	@OriginalMember(owner = "client!it", name = "e", descriptor = "Z")
	public static boolean aBoolean240 = false;

	@OriginalMember(owner = "client!it", name = "f", descriptor = "I")
	public static int anInt3702 = 0;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "I")
	public static int anInt3704 = 0;

	@OriginalMember(owner = "client!it", name = "i", descriptor = "Lclient!os;")
	public static final Class182 aClass182_126 = new Class182("Loading wordpack - ", "Lade Wordpack - ", "Chargement du module texte - ", "Carregando pacote de palavras - ");

	@OriginalMember(owner = "client!it", name = "k", descriptor = "I")
	public static int anInt3705 = 0;

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!cd;")
	public static final Class36 aClass36_10 = new Class36("", 17);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IB)I")
	public static int method2974(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([Ljava/lang/Object;[JI)V")
	public static void method2975(@OriginalArg(0) Object[] arg0, @OriginalArg(1) long[] arg1) {
		Static370.method4960(arg1, arg0, 0, arg1.length - 1);
	}
}
