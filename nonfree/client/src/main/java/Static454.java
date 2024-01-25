import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static454 {

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_120 = new Class252(40, 2);

	@OriginalMember(owner = "client!sp", name = "w", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_401 = new Class305(89, 19);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[BIIII[BBI)V")
	public static void method6989(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = -(arg0 >> 2);
		@Pc(19) int local19 = -(arg0 & 0x3);
		for (@Pc(22) int local22 = -arg5; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg2++;
				arg1[local30] += arg6[arg3++];
				@Pc(42) int local42 = arg2++;
				arg1[local42] += arg6[arg3++];
				@Pc(54) int local54 = arg2++;
				arg1[local54] += arg6[arg3++];
				@Pc(66) int local66 = arg2++;
				arg1[local66] += arg6[arg3++];
			}
			for (@Pc(81) int local81 = local19; local81 < 0; local81++) {
				local30 = arg2++;
				arg1[local30] += arg6[arg3++];
			}
			arg2 += arg4;
			arg3 += arg7;
		}
	}
}
