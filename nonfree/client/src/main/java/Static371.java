import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static371 {

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "[I")
	public static final int[] anIntArray415 = new int[6];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I[BIZ)I")
	public static int method5084(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(16) int local16 = arg0; local16 < arg2; local16++) {
			local7 = Class25_Sub1.anIntArray62[(local7 ^ arg1[local16]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
