import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class77 {

	@OriginalMember(owner = "client!w", name = "j", descriptor = "[I")
	public static int[] anIntArray407 = new int[256];

	static {
		for (@Pc(42) int local42 = 0; local42 < 256; local42++) {
			@Pc(45) int local45 = local42;
			for (@Pc(47) int local47 = 0; local47 < 8; local47++) {
				if ((local45 & 0x1) == 1) {
					local45 = local45 >>> 1 ^ 0xEDB88320;
				} else {
					local45 >>>= 0x1;
				}
			}
			anIntArray407[local42] = local45;
		}
	}
}
