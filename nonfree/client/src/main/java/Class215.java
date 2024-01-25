import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oj")
public final class Class215 {

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "[J")
	public static final long[] aLongArray11 = new long[256];

	static {
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(11) long local11 = (long) local7;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1L) == 1L) {
					local11 = local11 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local11 >>>= 0x1;
				}
			}
			aLongArray11[local7] = local11;
		}
	}
}
