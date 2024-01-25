import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!rk", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray71;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "[I")
	public static final int[] anIntArray562 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIIB)I")
	public static int method6419(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg2;
		@Pc(31) int local31 = local17 * (arg1 & 0x7F) + (arg0 & 0x7F) * arg2 >> 7;
		@Pc(45) int local45 = (arg1 & 0x380) * local17 + (arg0 & 0x380) * arg2 >> 7;
		@Pc(59) int local59 = (arg0 & 0xFC00) * arg2 + local17 * (arg1 & 0xFC00) >> 7;
		return local31 & 0x7F | local45 & 0x380 | local59 & 0xFC00;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIZB)I")
	public static int method6420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(8) Class6_Sub49 local8 = Static84.method1640(arg0, arg2);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray697.length) {
			return local8.anIntArray697[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB[ILclient!jaa;[II)Lclient!up;")
	public static Class86_Sub3 method6422(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class14_Sub3 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg0 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg0; local12++) {
			@Pc(26) int local26 = local12 * arg4 + arg3[local12];
			for (@Pc(28) int local28 = 0; local28 < arg1[local12]; local28++) {
				local10[local26++] = -1;
			}
		}
		return new Class86_Sub3(arg2, arg4, arg0, local10);
	}
}
