import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fq")
public final class Class64 {

	@OriginalMember(owner = "client!fq", name = "e", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray5[local4] = local8;
		}
	}
}
