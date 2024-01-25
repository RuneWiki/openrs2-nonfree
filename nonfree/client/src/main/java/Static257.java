import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static257 {

	@OriginalMember(owner = "client!jq", name = "Uh", descriptor = "I")
	public static int anInt4912;

	@OriginalMember(owner = "client!jq", name = "ii", descriptor = "Lclient!kea;")
	public static Class182 aClass182_1;

	@OriginalMember(owner = "client!jq", name = "Fh", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_151 = new Class272(88, 6);

	@OriginalMember(owner = "client!jq", name = "ci", descriptor = "[I")
	public static final int[] anIntArray373 = new int[1];

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II[BIIIII[B)V")
	public static void method4309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg5 >> 2);
		@Pc(15) int local15 = -(arg5 & 0x3);
		for (@Pc(18) int local18 = -arg6; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg1++;
				arg7[local26] += arg2[arg3++];
				@Pc(38) int local38 = arg1++;
				arg7[local38] += arg2[arg3++];
				@Pc(50) int local50 = arg1++;
				arg7[local50] += arg2[arg3++];
				@Pc(62) int local62 = arg1++;
				arg7[local62] += arg2[arg3++];
			}
			for (@Pc(77) int local77 = local15; local77 < 0; local77++) {
				local26 = arg1++;
				arg7[local26] += arg2[arg3++];
			}
			arg1 += arg0;
			arg3 += arg4;
		}
	}
}
