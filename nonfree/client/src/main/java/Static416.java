import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!nw", name = "k", descriptor = "[[[Lclient!vda;")
	public static Class368[][][] aClass368ArrayArrayArray3;

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
	public static int anInt6762 = 0;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(CI)I")
	public static int method5660(@OriginalArg(0) char arg0) {
		return arg0 >= '\u0000' && Class18.anIntArray546.length > arg0 ? Class18.anIntArray546[arg0] : -1;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "([[B[I[IIZI[[B[B)I")
	public static int method5663(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[][] arg5, @OriginalArg(7) byte[] arg6) {
		@Pc(14) int local14 = arg2[arg4];
		@Pc(21) int local21 = local14 + arg1[arg4];
		@Pc(25) int local25 = arg2[arg3];
		@Pc(31) int local31 = arg1[arg3] + local25;
		@Pc(33) int local33 = local14;
		if (local25 > local14) {
			local33 = local25;
		}
		@Pc(40) int local40 = local21;
		if (local21 > local31) {
			local40 = local31;
		}
		@Pc(55) int local55 = arg6[arg4] & 0xFF;
		if (local55 > (arg6[arg3] & 0xFF)) {
			local55 = arg6[arg3] & 0xFF;
		}
		@Pc(72) byte[] local72 = arg5[arg4];
		@Pc(76) byte[] local76 = arg0[arg3];
		@Pc(80) int local80 = local33 - local14;
		@Pc(85) int local85 = local33 - local25;
		for (@Pc(87) int local87 = local33; local87 < local40; local87++) {
			@Pc(99) int local99 = local76[local85++] + local72[local80++];
			if (local99 < local55) {
				local55 = local99;
			}
		}
		return -local55;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5665(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			@Pc(22) Class3_Sub37 local22 = Static90.method1509(Static558.aClass240_98, Static226.aClass144_2);
			local22.aClass3_Sub4_Sub1_2.method7948(Static345.method5022(arg0));
			local22.aClass3_Sub4_Sub1_2.method7901(arg0);
			Static301.method2678(local22);
		}
	}
}
