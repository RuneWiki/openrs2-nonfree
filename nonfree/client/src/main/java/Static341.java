import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static341 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
	public static int anInt5936 = 0;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III[B)I")
	public static int method4805(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local7 = Class67.anIntArray154[(local7 ^ arg2[local14]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}
}
