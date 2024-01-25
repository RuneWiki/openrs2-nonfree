import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
	public static int anInt8313;

	@OriginalMember(owner = "client!qe", name = "r", descriptor = "[I")
	public static final int[] anIntArray630 = new int[2];

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIII)I")
	public static int method6907(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(21) int local21 = 65536 - Class32.anIntArray77[arg3 * 8192 / arg2] >> 1;
		return (local21 * arg0 >> 16) + (arg1 * (65536 - local21) >> 16);
	}
}
