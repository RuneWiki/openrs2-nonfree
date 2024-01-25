import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "J")
	public static long aLong140;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "[I")
	public static final int[] anIntArray363 = new int[1];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BII)I")
	public static int method3726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 >>> 24;
		@Pc(17) int local17 = 255 - local7;
		@Pc(35) int local35 = ((arg0 & 0xFF00) * local7 & 0xFF0000 | (arg0 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return (((arg1 & 0xFF00FF) * local17 & 0xFF00FF00 | local17 * (arg1 & 0xFF00) & 0xFF0000) >>> 8) + local35;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIZIII)V")
	public static void method3727(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if ((arg1 ? Static348.aClass1_Sub30_Sub1_1.anInt4861 : Static348.aClass1_Sub30_Sub1_1.anInt4863) != 0 && arg3 != 0 && Static507.anInt8646 < 50 && arg4 != -1) {
			Static150.aClass104Array1[Static507.anInt8646++] = new Class104((byte) (arg1 ? 3 : 2), arg4, arg3, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZI)Z")
	public static boolean method3728(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x580) != 0;
	}
}
