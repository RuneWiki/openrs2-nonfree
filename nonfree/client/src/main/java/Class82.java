import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rb")
public final class Class82 {

	@OriginalMember(owner = "client!rb", name = "i", descriptor = "[J")
	public static long[] aLongArray11 = new long[256];

	static {
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(26) long local26 = (long) local22;
			for (@Pc(28) int local28 = 0; local28 < 8; local28++) {
				if ((local26 & 0x1L) == 1L) {
					local26 = local26 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local26 >>>= 0x1;
				}
			}
			aLongArray11[local22] = local26;
		}
	}
}
