import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class46 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "[I")
	public static final int[] anIntArray69 = new int[256];

	static {
		for (@Pc(21) int local21 = 0; local21 < 256; local21++) {
			@Pc(24) int local24 = local21;
			for (@Pc(26) int local26 = 0; local26 < 8; local26++) {
				if ((local24 & 0x1) == 1) {
					local24 = local24 >>> 1 ^ 0xEDB88320;
				} else {
					local24 >>>= 0x1;
				}
			}
			anIntArray69[local21] = local24;
		}
	}
}
