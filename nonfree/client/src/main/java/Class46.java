import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public final class Class46 {

	@OriginalMember(owner = "client!en", name = "c", descriptor = "[I")
	public static int[] anIntArray135 = new int[256];

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(11) int local11 = local4;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray135[local4] = local11;
		}
	}
}
