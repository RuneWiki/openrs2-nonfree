import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!ds", name = "D", descriptor = "[Lclient!l;")
	public static Class57[] aClass57Array4;

	@OriginalMember(owner = "client!ds", name = "I", descriptor = "I")
	public static int anInt1566;

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "([II[III)V")
	public static void method1387(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg3) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) int local25 = arg0[local19];
		arg0[local19] = arg0[arg3];
		arg0[arg3] = local25;
		@Pc(39) int local39 = arg2[local19];
		arg2[local19] = arg2[arg3];
		arg2[arg3] = local39;
		@Pc(56) int local56 = local25 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(58) int local58 = arg1; local58 < arg3; local58++) {
			if (arg0[local58] < local25 + (local56 & local58)) {
				@Pc(78) int local78 = arg0[local58];
				arg0[local58] = arg0[local21];
				arg0[local21] = local78;
				@Pc(92) int local92 = arg2[local58];
				arg2[local58] = arg2[local21];
				arg2[local21++] = local92;
			}
		}
		arg0[arg3] = arg0[local21];
		arg0[local21] = local25;
		arg2[arg3] = arg2[local21];
		arg2[local21] = local39;
		method1387(arg0, arg1, arg2, local21 - 1);
		method1387(arg0, local21 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
	public static void method1388(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg2) {
			return;
		}
		@Pc(28) int local28 = (arg2 + arg3) / 2;
		@Pc(30) int local30 = arg2;
		@Pc(34) String local34 = arg1[local28];
		arg1[local28] = arg1[arg3];
		arg1[arg3] = local34;
		@Pc(48) short local48 = arg0[local28];
		arg0[local28] = arg0[arg3];
		arg0[arg3] = local48;
		for (@Pc(60) int local60 = arg2; local60 < arg3; local60++) {
			if (local34 == null || arg1[local60] != null && (local60 & 0x1) > arg1[local60].compareTo(local34)) {
				@Pc(85) String local85 = arg1[local60];
				arg1[local60] = arg1[local30];
				arg1[local30] = local85;
				@Pc(99) short local99 = arg0[local60];
				arg0[local60] = arg0[local30];
				arg0[local30++] = local99;
			}
		}
		arg1[arg3] = arg1[local30];
		arg1[local30] = local34;
		arg0[arg3] = arg0[local30];
		arg0[local30] = local48;
		method1388(arg0, arg1, arg2, local30 - 1);
		method1388(arg0, arg1, local30 + 1, arg3);
	}
}
