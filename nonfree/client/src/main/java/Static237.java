import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static237 {

	@OriginalMember(owner = "client!ma", name = "b", descriptor = "Lclient!q;")
	public static Class204_Sub1 aClass204_Sub1_2;

	@OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
	public static int anInt4066;

	@OriginalMember(owner = "client!ma", name = "o", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!ma", name = "n", descriptor = "Lclient!sk;")
	public static final Class231 aClass231_72 = new Class231("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(II[S[Ljava/lang/String;B)V")
	public static void method3711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) String[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg1) / 2;
		@Pc(20) int local20 = arg0;
		@Pc(24) String local24 = arg3[local18];
		arg3[local18] = arg3[arg1];
		arg3[arg1] = local24;
		@Pc(38) short local38 = arg2[local18];
		arg2[local18] = arg2[arg1];
		arg2[arg1] = local38;
		for (@Pc(50) int local50 = arg0; local50 < arg1; local50++) {
			if (local24 == null || arg3[local50] != null && arg3[local50].compareTo(local24) < (local50 & 0x1)) {
				@Pc(71) String local71 = arg3[local50];
				arg3[local50] = arg3[local20];
				arg3[local20] = local71;
				@Pc(85) short local85 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local85;
			}
		}
		arg3[arg1] = arg3[local20];
		arg3[local20] = local24;
		arg2[arg1] = arg2[local20];
		arg2[local20] = local38;
		method3711(arg0, local20 - 1, arg2, arg3);
		method3711(local20 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BI)Z")
	public static boolean method3714(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
