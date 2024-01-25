import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static370 {

	@OriginalMember(owner = "client!mia", name = "L", descriptor = "I")
	public static int anInt10370;

	@OriginalMember(owner = "client!mia", name = "J", descriptor = "[I")
	public static int[] anIntArray579;

	@OriginalMember(owner = "client!mia", name = "D", descriptor = "I")
	public static int anInt10364 = 0;

	@OriginalMember(owner = "client!mia", name = "E", descriptor = "Lclient!cn;")
	public static Class73 aClass73_22 = null;

	@OriginalMember(owner = "client!mia", name = "M", descriptor = "[I")
	public static final int[] anIntArray580 = new int[25];

	@OriginalMember(owner = "client!mia", name = "H", descriptor = "I")
	public static int anInt10373 = 0;

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(I[IB[Ljava/lang/Object;I)V")
	public static void method8913(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) Object[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(23) int local23 = (arg3 + arg0) / 2;
		@Pc(25) int local25 = arg0;
		@Pc(29) int local29 = arg1[local23];
		arg1[local23] = arg1[arg3];
		arg1[arg3] = local29;
		@Pc(43) Object local43 = arg2[local23];
		arg2[local23] = arg2[arg3];
		arg2[arg3] = local43;
		@Pc(63) int local63 = ~local29 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(65) int local65 = arg0; local65 < arg3; local65++) {
			if (arg1[local65] < (local63 & local65) + local29) {
				@Pc(82) int local82 = arg1[local65];
				arg1[local65] = arg1[local25];
				arg1[local25] = local82;
				@Pc(96) Object local96 = arg2[local65];
				arg2[local65] = arg2[local25];
				arg2[local25++] = local96;
			}
		}
		arg1[arg3] = arg1[local25];
		arg1[local25] = local29;
		arg2[arg3] = arg2[local25];
		arg2[local25] = local43;
		method8913(arg0, arg1, arg2, local25 - 1);
		method8913(local25 + 1, arg1, arg2, arg3);
	}
}
