import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "[J")
	public static final long[] aLongArray4 = new long[256];

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(13) long local13 = (long) local9;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1L) == 1L) {
					local13 = local13 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local13 >>>= 0x1;
				}
			}
			aLongArray4[local9] = local13;
		}
	}
}
