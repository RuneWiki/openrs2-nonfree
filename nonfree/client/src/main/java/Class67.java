import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class67 {

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "[I")
	public static int[] anIntArray340 = new int[256];

	static {
		for (@Pc(19) int local19 = 0; local19 < 256; local19++) {
			@Pc(22) int local22 = local19;
			for (@Pc(24) int local24 = 0; local24 < 8; local24++) {
				if ((local22 & 0x1) == 1) {
					local22 = local22 >>> 1 ^ 0xEDB88320;
				} else {
					local22 >>>= 0x1;
				}
			}
			anIntArray340[local19] = local22;
		}
	}
}
