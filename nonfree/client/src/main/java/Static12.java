import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ag", name = "S", descriptor = "J")
	public static long aLong7;

	@OriginalMember(owner = "client!ag", name = "W", descriptor = "[I")
	public static final int[] anIntArray18 = new int[4];

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(III[BII[BII)V")
	public static void method231(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg0; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg5[local26] = (byte) (arg5[local26] - arg3[arg2++]);
				@Pc(39) int local39 = arg6++;
				arg5[local39] = (byte) (arg5[local39] - arg3[arg2++]);
				@Pc(52) int local52 = arg6++;
				arg5[local52] = (byte) (arg5[local52] - arg3[arg2++]);
				@Pc(65) int local65 = arg6++;
				arg5[local65] = (byte) (arg5[local65] - arg3[arg2++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg6++;
				arg5[local26] = (byte) (arg5[local26] - arg3[arg2++]);
			}
			arg6 += arg1;
			arg2 += arg7;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ZII)V")
	public static void method232(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class5_Sub4_Sub13 local8 = Static506.method2916(arg1, 6);
		local8.method4140();
		local8.anInt4508 = arg0;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IZB)Ljava/lang/String;")
	public static String method233(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		return arg1 && arg0 >= 0 ? Static371.method4031(arg1, arg0) : Integer.toString(arg0);
	}
}
