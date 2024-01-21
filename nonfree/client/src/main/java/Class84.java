import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class84 {

	@OriginalMember(owner = "client!ug", name = "i", descriptor = "[J")
	public static long[] aLongArray9 = new long[256];

	static {
		for (@Pc(27) int local27 = 0; local27 < 256; local27++) {
			@Pc(31) long local31 = (long) local27;
			for (@Pc(33) int local33 = 0; local33 < 8; local33++) {
				if ((local31 & 0x1L) == 1L) {
					local31 = local31 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local31 >>>= 0x1;
				}
			}
			aLongArray9[local27] = local31;
		}
	}
}
