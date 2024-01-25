import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!va", name = "w", descriptor = "[F")
	public static final float[] aFloatArray93 = new float[4];

	@OriginalMember(owner = "client!va", name = "y", descriptor = "[I")
	public static final int[] anIntArray553 = new int[1000];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;")
	public static String[] method8408(@OriginalArg(1) String[] arg0) {
		@Pc(6) String[] local6 = new String[5];
		for (@Pc(16) int local16 = 0; local16 < 5; local16++) {
			local6[local16] = local16 + ": ";
			if (arg0 != null && arg0[local16] != null) {
				local6[local16] = local6[local16] + arg0[local16];
			}
		}
		return local6;
	}
}
