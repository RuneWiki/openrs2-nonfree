import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!at", name = "P", descriptor = "[I")
	public static final int[] anIntArray62 = new int[256];

	static {
		for (@Pc(31) int local31 = 0; local31 < 256; local31++) {
			@Pc(34) int local34 = local31;
			for (@Pc(36) int local36 = 0; local36 < 8; local36++) {
				if ((local34 & 0x1) == 1) {
					local34 = local34 >>> 1 ^ 0xEDB88320;
				} else {
					local34 >>>= 0x1;
				}
			}
			anIntArray62[local31] = local34;
		}
	}
}
