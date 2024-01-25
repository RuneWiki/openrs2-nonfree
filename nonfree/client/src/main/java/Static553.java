import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!ve", name = "B", descriptor = "Lclient!rea;")
	public static Class288 aClass288_4;

	@OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
	public static int anInt9268 = 0;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[BIIIII[B)V")
	public static void method7631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(22) int local22 = -arg3; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg6++;
				arg2[local30] = (byte) (arg2[local30] - arg7[arg1++]);
				@Pc(43) int local43 = arg6++;
				arg2[local43] = (byte) (arg2[local43] - arg7[arg1++]);
				@Pc(56) int local56 = arg6++;
				arg2[local56] = (byte) (arg2[local56] - arg7[arg1++]);
				@Pc(69) int local69 = arg6++;
				arg2[local69] = (byte) (arg2[local69] - arg7[arg1++]);
			}
			for (@Pc(85) int local85 = local15; local85 < 0; local85++) {
				local30 = arg6++;
				arg2[local30] = (byte) (arg2[local30] - arg7[arg1++]);
			}
			arg1 += arg5;
			arg6 += arg0;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)I")
	public static int method7633(@OriginalArg(1) int arg0) {
		return arg0 >>> 10;
	}
}
