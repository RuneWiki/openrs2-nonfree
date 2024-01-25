import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static557 {

	@OriginalMember(owner = "client!vj", name = "ud", descriptor = "[I")
	public static final int[] anIntArray581 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "([SIB)[S")
	public static short[] method7483(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(14) short[] local14 = new short[arg1];
		Static601.method2815(arg0, 0, local14, 0, arg1);
		return local14;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIFIFFI[BFFLclient!vaa;I)V")
	public static void method7502(@OriginalArg(1) int arg0, @OriginalArg(3) float arg1, @OriginalArg(5) float arg2, @OriginalArg(6) float arg3, @OriginalArg(8) byte[] arg4, @OriginalArg(9) float arg5, @OriginalArg(10) float arg6, @OriginalArg(11) Class182 arg7) {
		for (@Pc(8) int local8 = 0; local8 < 16; local8++) {
			Static561.method2426(arg5, arg2, arg4, arg1, arg6, arg3, arg7, arg0, local8);
			arg0 += 16384;
		}
	}
}
