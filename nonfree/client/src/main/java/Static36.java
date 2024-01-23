import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
	public static int anInt639 = -1;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
	public static int[] anIntArray56 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
	public static int anInt642 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLclient!rn;)Z")
	public static boolean method539(@OriginalArg(1) Class155 arg0) {
		return arg0.method4133(Static129.anInt2459);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
	public static void method541(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg1) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg1) / 2;
		@Pc(12) int local12 = arg1;
		@Pc(16) long local16 = arg2[local10];
		arg2[local10] = arg2[arg3];
		arg2[arg3] = local16;
		@Pc(30) Object local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		for (@Pc(42) int local42 = arg1; local42 < arg3; local42++) {
			if (local16 + (long) (local42 & 0x1) > arg2[local42]) {
				@Pc(65) long local65 = arg2[local42];
				arg2[local42] = arg2[local12];
				arg2[local12] = local65;
				@Pc(79) Object local79 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12++] = local79;
			}
		}
		arg2[arg3] = arg2[local12];
		arg2[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method541(arg0, arg1, arg2, local12 - 1);
		method541(arg0, local12 + 1, arg2, arg3);
	}
}
