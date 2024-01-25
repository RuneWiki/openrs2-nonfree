import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!aga", name = "e", descriptor = "[Lclient!nt;")
	public static final Class1_Sub3_Sub13[] aClass1_Sub3_Sub13Array1 = new Class1_Sub3_Sub13[14];

	@OriginalMember(owner = "client!aga", name = "q", descriptor = "[F")
	public static final float[] aFloatArray6 = new float[16];

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[Ljava/lang/Object;[I)V")
	public static void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg1) / 2;
		@Pc(24) int local24 = arg1;
		@Pc(28) int local28 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local28;
		@Pc(42) Object local42 = arg2[local22];
		arg2[local22] = arg2[arg0];
		arg2[arg0] = local42;
		@Pc(59) int local59 = local28 == Integer.MAX_VALUE ? 0 : 1;
		for (@Pc(61) int local61 = arg1; local61 < arg0; local61++) {
			if (local28 + (local61 & local59) > arg3[local61]) {
				@Pc(81) int local81 = arg3[local61];
				arg3[local61] = arg3[local24];
				arg3[local24] = local81;
				@Pc(95) Object local95 = arg2[local61];
				arg2[local61] = arg2[local24];
				arg2[local24++] = local95;
			}
		}
		arg3[arg0] = arg3[local24];
		arg3[local24] = local28;
		arg2[arg0] = arg2[local24];
		arg2[local24] = local42;
		method459(local24 - 1, arg1, arg2, arg3);
		method459(arg0, local24 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIBI)I")
	public static int method464(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub46 local8 = Static365.method5363(arg0, arg2);
		if (local8 == null) {
			return 0;
		} else if (arg1 >= 0 && local8.anIntArray576.length > arg1) {
			return local8.anIntArray576[arg1];
		} else {
			return 0;
		}
	}
}
