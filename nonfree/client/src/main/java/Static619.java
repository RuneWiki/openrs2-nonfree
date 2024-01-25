import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static619 {

	@OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
	public static int anInt10222;

	@OriginalMember(owner = "client!waa", name = "f", descriptor = "Lclient!ga;")
	public static final Class107 aClass107_6 = new Class107("WTQA", "office", "_qa", 2);

	@OriginalMember(owner = "client!waa", name = "g", descriptor = "Z")
	public static boolean aBoolean862 = false;

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I[BIIIIII[B)V")
	public static void method8393(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(14) int local14 = -(arg3 >> 2);
		@Pc(19) int local19 = -(arg3 & 0x3);
		for (@Pc(22) int local22 = -arg0; local22 < 0; local22++) {
			@Pc(30) int local30;
			for (@Pc(26) int local26 = local14; local26 < 0; local26++) {
				local30 = arg6++;
				arg7[local30] = (byte) (arg7[local30] - arg1[arg2++]);
				@Pc(43) int local43 = arg6++;
				arg7[local43] = (byte) (arg7[local43] - arg1[arg2++]);
				@Pc(56) int local56 = arg6++;
				arg7[local56] = (byte) (arg7[local56] - arg1[arg2++]);
				@Pc(69) int local69 = arg6++;
				arg7[local69] = (byte) (arg7[local69] - arg1[arg2++]);
			}
			for (@Pc(88) int local88 = local19; local88 < 0; local88++) {
				local30 = arg6++;
				arg7[local30] = (byte) (arg7[local30] - arg1[arg2++]);
			}
			arg2 += arg5;
			arg6 += arg4;
		}
	}
}
