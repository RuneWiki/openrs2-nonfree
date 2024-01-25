import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!be", name = "A", descriptor = "Lclient!pq;")
	public static Class251 aClass251_82;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "[I")
	public static final int[] anIntArray453 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!be", name = "w", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(II[Ljava/lang/String;B[S)V")
	public static void method4028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String[] arg2, @OriginalArg(4) short[] arg3) {
		if (arg1 <= arg0) {
			return;
		}
		@Pc(20) int local20 = (arg0 + arg1) / 2;
		@Pc(22) int local22 = arg0;
		@Pc(26) String local26 = arg2[local20];
		arg2[local20] = arg2[arg1];
		arg2[arg1] = local26;
		@Pc(40) short local40 = arg3[local20];
		arg3[local20] = arg3[arg1];
		arg3[arg1] = local40;
		for (@Pc(52) int local52 = arg0; local52 < arg1; local52++) {
			if (local26 == null || arg2[local52] != null && (local52 & 0x1) > arg2[local52].compareTo(local26)) {
				@Pc(77) String local77 = arg2[local52];
				arg2[local52] = arg2[local22];
				arg2[local22] = local77;
				@Pc(91) short local91 = arg3[local52];
				arg3[local52] = arg3[local22];
				arg3[local22++] = local91;
			}
		}
		arg2[arg1] = arg2[local22];
		arg2[local22] = local26;
		arg3[arg1] = arg3[local22];
		arg3[local22] = local40;
		method4028(arg0, local22 - 1, arg2, arg3);
		method4028(local22 + 1, arg1, arg2, arg3);
	}
}
