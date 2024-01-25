import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!qv", name = "d", descriptor = "Lclient!kp;")
	public static Class192 aClass192_4;

	@OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
	public static int anInt4098;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IIIIIII)V")
	public static void method3639(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = arg0 + arg5;
		@Pc(19) int local19 = arg2 - arg5;
		for (@Pc(21) int local21 = arg0; local21 < local10; local21++) {
			Static337.method5150(arg4, arg3, arg1, Static176.anIntArrayArray28[local21]);
		}
		for (@Pc(41) int local41 = arg2; local41 > local19; local41--) {
			Static337.method5150(arg4, arg3, arg1, Static176.anIntArrayArray28[local41]);
		}
		@Pc(64) int local64 = arg4 - arg5;
		@Pc(68) int local68 = arg5 + arg1;
		for (@Pc(70) int local70 = local10; local70 <= local19; local70++) {
			@Pc(76) int[] local76 = Static176.anIntArrayArray28[local70];
			Static337.method5150(local68, arg3, arg1, local76);
			Static337.method5150(arg4, arg3, local64, local76);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BI)S")
	public static short method3643(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(19) int local19 = arg0 & 0x7F;
		@Pc(39) int local39 = local19 > 64 ? (127 - local19) * local15 >> 7 : local19 * local15 >> 7;
		@Pc(43) int local43 = local19 + local39;
		@Pc(52) int local52;
		if (local43 == 0) {
			local52 = local39 << 1;
		} else {
			local52 = (local39 << 8) / local43;
		}
		return (short) (local43 | local52 >> 4 << 7 | local9 << 10);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(III)Z")
	public static boolean method3644(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
