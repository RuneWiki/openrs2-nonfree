import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_156 = new Class214(35, -1);

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt4983 = 0;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "[B")
	public static final byte[] aByteArray65 = new byte[2048];

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[Ljava/lang/String;II[S)V")
	public static void method4227(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(20) int local20 = (arg2 + arg0) / 2;
		@Pc(22) int local22 = arg0;
		@Pc(26) String local26 = arg1[local20];
		arg1[local20] = arg1[arg2];
		arg1[arg2] = local26;
		@Pc(40) short local40 = arg3[local20];
		arg3[local20] = arg3[arg2];
		arg3[arg2] = local40;
		for (@Pc(52) int local52 = arg0; local52 < arg2; local52++) {
			if (local26 == null || arg1[local52] != null && (local52 & 0x1) > arg1[local52].compareTo(local26)) {
				@Pc(73) String local73 = arg1[local52];
				arg1[local52] = arg1[local22];
				arg1[local22] = local73;
				@Pc(87) short local87 = arg3[local52];
				arg3[local52] = arg3[local22];
				arg3[local22++] = local87;
			}
		}
		arg1[arg2] = arg1[local22];
		arg1[local22] = local26;
		arg3[arg2] = arg3[local22];
		arg3[local22] = local40;
		method4227(arg0, arg1, local22 - 1, arg3);
		method4227(local22 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILclient!wn;)V")
	public static void method4231(@OriginalArg(1) Class4_Sub20 arg0) {
		if (arg0.aByteArray77.length - arg0.anInt5526 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method4614();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray77.length - arg0.anInt5526 < 2) {
			return;
		}
		@Pc(52) int local52 = arg0.method4560();
		if (local52 * 6 > arg0.aByteArray77.length - arg0.anInt5526) {
			return;
		}
		for (@Pc(65) int local65 = 0; local65 < local52; local65++) {
			@Pc(71) int local71 = arg0.method4560();
			@Pc(75) int local75 = arg0.method4595();
			if (Static355.anIntArray503.length > local71 && Static241.aBooleanArray89[local71] && (Static377.aClass45_3.method1431(local71).aChar5 != '1' || local75 >= -1 && local75 <= 1)) {
				Static355.anIntArray503[local71] = local75;
			}
		}
	}
}
