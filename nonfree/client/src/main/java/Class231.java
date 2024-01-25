import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class231 {

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "[I")
	public static final int[] anIntArray451 = new int[256];

	static {
		for (@Pc(35) int local35 = 0; local35 < 256; local35++) {
			@Pc(38) int local38 = local35;
			for (@Pc(40) int local40 = 0; local40 < 8; local40++) {
				if ((local38 & 0x1) == 1) {
					local38 = local38 >>> 1 ^ 0xEDB88320;
				} else {
					local38 >>>= 0x1;
				}
			}
			anIntArray451[local35] = local38;
		}
	}
}
