import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static138 {

	@OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
	public static int anInt2625;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray22;

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
	public static int anInt2623 = 0;

	@OriginalMember(owner = "client!hl", name = "e", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_47 = new Class57("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!hl", name = "h", descriptor = "Lclient!us;")
	public static final Class234 aClass234_57 = new Class234(60, -1);

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "Lclient!us;")
	public static final Class234 aClass234_58 = new Class234(45, 12);

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "[I")
	public static final int[] anIntArray275 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hl", name = "k", descriptor = "[I")
	public static final int[] anIntArray276 = new int[50];

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIII[[[BIIILclient!np;IIII)V")
	public static void method2196(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class155 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(12) int arg11) {
		if (arg10 == 0 || arg3 == 0) {
			return;
		}
		if (arg10 == 9) {
			arg0 = arg0 + 1 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 10) {
			arg0 = arg0 + 3 & 0x3;
			arg10 = 1;
		}
		if (arg10 == 11) {
			arg10 = 8;
			arg0 = arg0 + 3 & 0x3;
		}
		arg8.method4863(arg1, arg7, arg5, arg11, arg9, arg6, arg4[arg10 - 1][arg0], arg3, arg2);
	}
}
