import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static384 {

	@OriginalMember(owner = "client!oga", name = "d", descriptor = "F")
	public static float aFloat180;

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_105 = new Class349(19, 11);

	@OriginalMember(owner = "client!oga", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray32 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(IIZI)I")
	public static int method5328(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class2_Sub16 local13 = Static261.method3663(arg0, arg1);
		if (local13 == null) {
			return -1;
		} else if (arg2 >= 0 && local13.anIntArray215.length > arg2) {
			return local13.anIntArray215[arg2];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!oga", name = "a", descriptor = "(I[B[BIIIIII)V")
	public static void method5330(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg6++;
				arg2[local26] += arg1[arg5++];
				@Pc(38) int local38 = arg6++;
				arg2[local38] += arg1[arg5++];
				@Pc(50) int local50 = arg6++;
				arg2[local50] += arg1[arg5++];
				@Pc(62) int local62 = arg6++;
				arg2[local62] += arg1[arg5++];
			}
			for (@Pc(80) int local80 = local15; local80 < 0; local80++) {
				local26 = arg6++;
				arg2[local26] += arg1[arg5++];
			}
			arg5 += arg0;
			arg6 += arg3;
		}
	}
}
