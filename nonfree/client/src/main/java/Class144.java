import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class144 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "[J")
	public static long[] aLongArray11 = new long[256];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(14) long local14 = (long) local6;
			for (@Pc(16) int local16 = 0; local16 < 8; local16++) {
				if ((local14 & 0x1L) == 1L) {
					local14 = local14 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local14 >>>= 0x1;
				}
			}
			aLongArray11[local6] = local14;
		}
	}
}
