import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public static int anInt9538;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "([BIIB)I")
	public static int method8021(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(14) int local14 = -1;
		for (@Pc(16) int local16 = arg1; local16 < arg2; local16++) {
			local14 = Class167_Sub1.anIntArray564[(local14 ^ arg0[local16]) & 0xFF] ^ local14 >>> 8;
		}
		return ~local14;
	}
}
