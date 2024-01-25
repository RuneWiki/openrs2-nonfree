import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static422 {

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "[I")
	public static int[] anIntArray560;

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "I")
	public static int anInt7840;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BLclient!iaa;)Lclient!hs;")
	public static Class77_Sub3 method6535(@OriginalArg(1) Class6_Sub26 arg0) {
		return new Class77_Sub3(arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4974(), arg0.method4949(), arg0.method4966());
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BII[I[ILclient!ap;)Lclient!eca;")
	public static Class19_Sub2 method6537(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class9_Sub2 arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg0];
		for (@Pc(17) int local17 = 0; local17 < arg0; local17++) {
			@Pc(27) int local27 = arg2[local17] + arg1 * local17;
			for (@Pc(29) int local29 = 0; local29 < arg3[local17]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class19_Sub2(arg4, arg1, arg0, local10);
	}
}
