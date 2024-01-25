import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "F")
	public static float aFloat90;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[Lclient!bq;")
	public static Class26[] aClass26Array2;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_220 = new Class92(1, -1);

	@OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
	public static final int[] anIntArray474 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI[BIIII)V")
	public static void method5202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg1 >> 2);
		@Pc(15) int local15 = -(arg1 & 0x3);
		for (@Pc(18) int local18 = -arg5; local18 < 0; local18++) {
			@Pc(28) int local28;
			for (@Pc(24) int local24 = local10; local24 < 0; local24++) {
				local28 = arg0++;
				arg2[local28] += arg4[arg3++];
				@Pc(40) int local40 = arg0++;
				arg2[local40] += arg4[arg3++];
				@Pc(52) int local52 = arg0++;
				arg2[local52] += arg4[arg3++];
				@Pc(64) int local64 = arg0++;
				arg2[local64] += arg4[arg3++];
			}
			for (@Pc(82) int local82 = local15; local82 < 0; local82++) {
				local28 = arg0++;
				arg2[local28] += arg4[arg3++];
			}
			arg3 += arg7;
			arg0 += arg6;
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)I")
	public static int method5203(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg1;
		}
	}
}
