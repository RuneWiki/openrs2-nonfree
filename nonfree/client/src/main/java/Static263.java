import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static263 {

	@OriginalMember(owner = "client!it", name = "l", descriptor = "Lclient!el;")
	public static final Class109 aClass109_100 = new Class109(57, -1);

	@OriginalMember(owner = "client!it", name = "m", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_50 = new Class387(3, -1);

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([BIIIBI[BII)V")
	public static void method3859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg3 >> 2);
		@Pc(15) int local15 = -(arg3 & 0x3);
		for (@Pc(25) int local25 = -arg6; local25 < 0; local25++) {
			@Pc(33) int local33;
			for (@Pc(29) int local29 = local10; local29 < 0; local29++) {
				local33 = arg2++;
				arg0[local33] = (byte) (arg0[local33] - arg5[arg7++]);
				@Pc(46) int local46 = arg2++;
				arg0[local46] = (byte) (arg0[local46] - arg5[arg7++]);
				@Pc(59) int local59 = arg2++;
				arg0[local59] = (byte) (arg0[local59] - arg5[arg7++]);
				@Pc(72) int local72 = arg2++;
				arg0[local72] = (byte) (arg0[local72] - arg5[arg7++]);
			}
			for (@Pc(90) int local90 = local15; local90 < 0; local90++) {
				local33 = arg2++;
				arg0[local33] = (byte) (arg0[local33] - arg5[arg7++]);
			}
			arg2 += arg1;
			arg7 += arg4;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)Z")
	public static boolean method3861(@OriginalArg(0) int arg0) {
		return arg0 != 1 && arg0 != 7;
	}
}
