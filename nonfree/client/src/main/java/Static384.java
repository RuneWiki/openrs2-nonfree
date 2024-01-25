import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!pv", name = "f", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_97 = new Class252(77, 0);

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)Lclient!et;")
	public static Class91 method6156(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 >> 16;
		@Pc(16) int local16 = arg0 & 0xFFFF;
		if (Static511.aClass91ArrayArray2[local12] == null || Static511.aClass91ArrayArray2[local12][local16] == null) {
			@Pc(30) boolean local30 = Static278.method4887(local12);
			if (!local30) {
				return null;
			}
		}
		return Static511.aClass91ArrayArray2[local12][local16];
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII[B[BII)V")
	public static void method6159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(22) int local22 = -arg3; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local10; local26 < 0; local26++) {
				local30 = arg7++;
				arg5[local30] += arg6[arg4++];
				@Pc(42) int local42 = arg7++;
				arg5[local42] += arg6[arg4++];
				@Pc(54) int local54 = arg7++;
				arg5[local54] += arg6[arg4++];
				@Pc(66) int local66 = arg7++;
				arg5[local66] += arg6[arg4++];
			}
			for (@Pc(81) int local81 = local15; local81 < 0; local81++) {
				local30 = arg7++;
				arg5[local30] += arg6[arg4++];
			}
			arg7 += arg0;
			arg4 += arg2;
		}
	}
}
