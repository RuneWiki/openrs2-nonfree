import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!au", name = "r", descriptor = "I")
	public static int anInt529;

	@OriginalMember(owner = "client!au", name = "v", descriptor = "Lclient!cea;")
	public static Class48 aClass48_1;

	@OriginalMember(owner = "client!au", name = "x", descriptor = "J")
	public static long aLong18;

	@OriginalMember(owner = "client!au", name = "y", descriptor = "I")
	public static int anInt534;

	@OriginalMember(owner = "client!au", name = "p", descriptor = "[Lclient!is;")
	public static final Class172[] aClass172Array1 = new Class172[16];

	@OriginalMember(owner = "client!au", name = "q", descriptor = "[F")
	public static final float[] aFloatArray1 = new float[2];

	@OriginalMember(owner = "client!au", name = "s", descriptor = "I")
	public static int anInt530 = 0;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII[BI[BII)V")
	public static void method524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15 = -(arg6 >> 2);
		@Pc(20) int local20 = -(arg6 & 0x3);
		for (@Pc(23) int local23 = -arg7; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local15; local27 < 0; local27++) {
				local31 = arg1++;
				arg4[local31] += arg5[arg3++];
				@Pc(43) int local43 = arg1++;
				arg4[local43] += arg5[arg3++];
				@Pc(55) int local55 = arg1++;
				arg4[local55] += arg5[arg3++];
				@Pc(67) int local67 = arg1++;
				arg4[local67] += arg5[arg3++];
			}
			for (@Pc(82) int local82 = local20; local82 < 0; local82++) {
				local31 = arg1++;
				arg4[local31] += arg5[arg3++];
			}
			arg1 += arg0;
			arg3 += arg2;
		}
	}
}
