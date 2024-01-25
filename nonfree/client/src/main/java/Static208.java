import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[I")
	public static int[] anIntArray276;

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "[[F")
	public static final float[][] aFloatArrayArray10 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_93 = new Class150(78, -1);

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!bv;")
	public static final Class40 aClass40_62 = new Class40("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Lclient!lu;")
	public static Class192 method3363() {
		try {
			return (Class192) Class.forName("Class192_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(17) Throwable local17) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)I")
	public static int method3364(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
