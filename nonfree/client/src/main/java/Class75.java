import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class75 {

	@OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
	public static int[] anIntArray283 = new int[256];

	static {
		for (@Pc(30) int local30 = 0; local30 < 256; local30++) {
			@Pc(33) int local33 = local30;
			for (@Pc(35) int local35 = 0; local35 < 8; local35++) {
				if ((local33 & 0x1) == 1) {
					local33 = local33 >>> 1 ^ 0xEDB88320;
				} else {
					local33 >>>= 0x1;
				}
			}
			anIntArray283[local30] = local33;
		}
	}
}
