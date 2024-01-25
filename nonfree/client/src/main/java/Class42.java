import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class42 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray5[local6] = local10;
		}
	}
}
