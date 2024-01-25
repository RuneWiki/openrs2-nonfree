import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static365 {

	@OriginalMember(owner = "client!sk", name = "n", descriptor = "Lclient!l;")
	public static Class95 aClass95_19;

	@OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
	public static int anInt6046;

	@OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
	public static int anInt6047;

	@OriginalMember(owner = "client!sk", name = "q", descriptor = "[I")
	public static int[] anIntArray475;

	@OriginalMember(owner = "client!sk", name = "l", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_85 = new Class146(61, 7);

	@OriginalMember(owner = "client!sk", name = "m", descriptor = "[I")
	public static final int[] anIntArray474 = new int[14];

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "([Ljava/lang/Object;I[III)V")
	public static void method4856(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 <= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg3 + arg1) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) int local20 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local20;
		@Pc(34) Object local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg3; local55 < arg1; local55++) {
			if (local20 + (local53 & local55) > arg2[local55]) {
				@Pc(70) int local70 = arg2[local55];
				arg2[local55] = arg2[local16];
				arg2[local16] = local70;
				@Pc(84) Object local84 = arg0[local55];
				arg0[local55] = arg0[local16];
				arg0[local16++] = local84;
			}
		}
		arg2[arg1] = arg2[local16];
		arg2[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method4856(arg0, local16 - 1, arg2, arg3);
		method4856(arg0, arg1, arg2, local16 + 1);
	}
}
