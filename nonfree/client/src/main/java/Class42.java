import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class42 {

	@OriginalMember(owner = "client!kd", name = "g", descriptor = "[I")
	public static int[] anIntArray359 = new int[256];

	static {
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(18) int local18 = local15;
			for (@Pc(20) int local20 = 0; local20 < 8; local20++) {
				if ((local18 & 0x1) == 1) {
					local18 = local18 >>> 1 ^ 0xEDB88320;
				} else {
					local18 >>>= 0x1;
				}
			}
			anIntArray359[local15] = local18;
		}
	}
}
