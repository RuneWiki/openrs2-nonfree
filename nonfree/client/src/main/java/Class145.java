import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class145 {

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "[I")
	public static int[] anIntArray400 = new int[256];

	static {
		for (@Pc(9) int local9 = 0; local9 < 256; local9++) {
			@Pc(16) int local16 = local9;
			for (@Pc(18) int local18 = 0; local18 < 8; local18++) {
				if ((local16 & 0x1) == 1) {
					local16 = local16 >>> 1 ^ 0xEDB88320;
				} else {
					local16 >>>= 0x1;
				}
			}
			anIntArray400[local9] = local16;
		}
	}
}
