import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gr", name = "i", descriptor = "Lclient!mc;")
	public static Class59 aClass59_2;

	@OriginalMember(owner = "client!gr", name = "h", descriptor = "Lclient!pg;")
	public static final Class186 aClass186_81 = new Class186(81, 8);

	@OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
	public static int anInt2663 = -1;

	@OriginalMember(owner = "client!gr", name = "l", descriptor = "I")
	public static int anInt2664 = 0;

	@OriginalMember(owner = "client!gr", name = "n", descriptor = "I")
	public static int anInt2666 = 0;

	@OriginalMember(owner = "client!gr", name = "o", descriptor = "Lclient!bn;")
	public static final Class24 aClass24_1 = new Class24(16);

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)Lclient!mj;")
	public static Class6_Sub1 method1998(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static40.aClass53ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass6_Sub1_1;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBIIIII)I")
	public static int method2001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg2 & 0x3;
		if ((arg1 & 0x1) == 1) {
			@Pc(14) int local14 = arg3;
			arg3 = arg0;
			arg0 = local14;
		}
		if (local7 == 0) {
			return arg4;
		} else if (local7 == 1) {
			return arg5;
		} else if (local7 == 2) {
			return 7 + 1 - arg4 - arg3;
		} else {
			return 1 + 7 - arg0 - arg5;
		}
	}
}
