import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	public static int anInt5096;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[JI[II)V")
	public static void method4234(@OriginalArg(0) int arg0, @OriginalArg(1) long[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) long local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg3];
		arg2[arg3] = local34;
		@Pc(54) int local54 = ~local20 == Long.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg3; local56++) {
			if (arg1[local56] < local20 + (long) (local56 & local54)) {
				@Pc(77) long local77 = arg1[local56];
				arg1[local56] = arg1[local16];
				arg1[local16] = local77;
				@Pc(91) int local91 = arg2[local56];
				arg2[local56] = arg2[local16];
				arg2[local16++] = local91;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg2[arg3] = arg2[local16];
		arg2[local16] = local34;
		method4234(arg0, arg1, arg2, local16 - 1);
		method4234(local16 + 1, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIII)V")
	public static void method4235(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub2_Sub6 local8 = Static371.method5808(10, arg1);
		local8.method1778();
		local8.anInt2056 = arg0;
		local8.anInt2059 = arg3;
		local8.anInt2055 = arg2;
	}
}
