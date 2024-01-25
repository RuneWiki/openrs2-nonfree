import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static373 {

	@OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
	public static int anInt6594;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIB[BIII[BI)V")
	public static void method5168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(23) int local23 = -(arg1 & 0x3);
		for (@Pc(26) int local26 = -arg0; local26 < 0; local26++) {
			@Pc(34) int local34;
			for (@Pc(30) int local30 = local10; local30 < 0; local30++) {
				local34 = arg7++;
				arg2[local34] = (byte) (arg2[local34] - arg6[arg4++]);
				@Pc(47) int local47 = arg7++;
				arg2[local47] = (byte) (arg2[local47] - arg6[arg4++]);
				@Pc(60) int local60 = arg7++;
				arg2[local60] = (byte) (arg2[local60] - arg6[arg4++]);
				@Pc(73) int local73 = arg7++;
				arg2[local73] = (byte) (arg2[local73] - arg6[arg4++]);
			}
			for (@Pc(89) int local89 = local23; local89 < 0; local89++) {
				local34 = arg7++;
				arg2[local34] = (byte) (arg2[local34] - arg6[arg4++]);
			}
			arg4 += arg3;
			arg7 += arg5;
		}
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
	public static void method5169() {
		Static139.aBoolean248 = true;
	}

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lclient!oa;ZLjava/lang/String;I)V")
	public static void method5170(@OriginalArg(0) Class65 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2) {
		@Pc(25) int local25 = Static230.aClass179_11.method4392(250, arg2, null);
		@Pc(34) int local34 = Static230.aClass179_11.method4389(arg2, null, 250) * 13;
		Static266.aClass75_7.NA(6, 6, local25 + 4 + 4, local34 + 4 - -4, -16777216, 0);
		Static266.aClass75_7.method2637(6, 6, local25 + 8, 4 + 4 + local34, -1, 0);
		arg0.method5809(null, arg2, -1, -1, 10, null, 0, 10, local25, null, 1, local34, 0);
		Static63.method5248(local34 + 4 + 4, 6, 6, local25 + 4 + 4);
		if (arg1) {
			Static266.aClass75_7.method2594();
		}
	}
}
