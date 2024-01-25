import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Lclient!eo;")
	public static final Class102 aClass102_2 = new Class102();

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_51 = new Class187(63, -1);

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BIIIIII[B[B)V")
	public static void method3622(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg0 >> 2);
		@Pc(19) int local19 = -(arg0 & 0x3);
		for (@Pc(22) int local22 = -arg4; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg5++;
				arg6[local30] = (byte) (arg6[local30] - arg7[arg3++]);
				@Pc(43) int local43 = arg5++;
				arg6[local43] = (byte) (arg6[local43] - arg7[arg3++]);
				@Pc(56) int local56 = arg5++;
				arg6[local56] = (byte) (arg6[local56] - arg7[arg3++]);
				@Pc(69) int local69 = arg5++;
				arg6[local69] = (byte) (arg6[local69] - arg7[arg3++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg5++;
				arg6[local30] = (byte) (arg6[local30] - arg7[arg3++]);
			}
			arg3 += arg1;
			arg5 += arg2;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method3623(@OriginalArg(1) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(18) int local18 = 0; local18 < 5; local18++) {
			local8[local18] = local18 + ": ";
			if (arg0 != null && arg0[local18] != null) {
				local8[local18] = local8[local18] + arg0[local18];
			}
		}
		return local8;
	}
}
