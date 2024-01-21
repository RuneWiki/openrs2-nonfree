import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([B[I[BIII)V")
	public static void method354(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg4; local1++) {
			arg2[arg3++] = arg0[(arg1[local1] >> 8) + 32768];
		}
	}
}
