import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!bi", name = "q", descriptor = "[I")
	public static int[] anIntArray355 = new int[256];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(13) int local13 = local6;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray355[local6] = local13;
		}
	}
}
