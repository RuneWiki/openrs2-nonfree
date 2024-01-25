import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class381 {

	@OriginalMember(owner = "client!vu", name = "h", descriptor = "[I")
	public static final int[] anIntArray698 = new int[256];

	static {
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			@Pc(15) int local15 = local12;
			for (@Pc(17) int local17 = 0; local17 < 8; local17++) {
				if ((local15 & 0x1) == 1) {
					local15 = local15 >>> 1 ^ 0xEDB88320;
				} else {
					local15 >>>= 0x1;
				}
			}
			anIntArray698[local12] = local15;
		}
	}
}
