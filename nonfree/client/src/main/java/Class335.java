import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class335 {

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "[J")
	public static final long[] aLongArray16 = new long[256];

	static {
		for (@Pc(55) int local55 = 0; local55 < 256; local55++) {
			@Pc(59) long local59 = (long) local55;
			for (@Pc(61) int local61 = 0; local61 < 8; local61++) {
				if ((local59 & 0x1L) == 1L) {
					local59 = local59 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local59 >>>= 0x1;
				}
			}
			aLongArray16[local55] = local59;
		}
	}
}
