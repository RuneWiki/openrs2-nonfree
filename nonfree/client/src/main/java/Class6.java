import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class6 {

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "[J")
	public static final long[] aLongArray1 = new long[256];

	static {
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			@Pc(21) long local21 = (long) local17;
			for (@Pc(23) int local23 = 0; local23 < 8; local23++) {
				if ((local21 & 0x1L) == 1L) {
					local21 = local21 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local21 >>>= 0x1;
				}
			}
			aLongArray1[local17] = local21;
		}
	}
}
