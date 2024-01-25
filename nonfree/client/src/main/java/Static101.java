import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
	public static int anInt1574;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_22 = new Class208(27, 3);

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(III[BIZI[BI)V")
	public static void method1453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(22) int local22 = -arg1; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg4++;
				arg3[local30] += arg6[arg5++];
				@Pc(42) int local42 = arg4++;
				arg3[local42] += arg6[arg5++];
				@Pc(54) int local54 = arg4++;
				arg3[local54] += arg6[arg5++];
				@Pc(66) int local66 = arg4++;
				arg3[local66] += arg6[arg5++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg4++;
				arg3[local30] += arg6[arg5++];
			}
			arg4 += arg0;
			arg5 += arg7;
		}
	}
}
