import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!g")
public final class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!g", name = "r", descriptor = "[I")
	public static final int[] anIntArray164 = new int[256];

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "I")
	public int anInt1871;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray164[local4] = local7;
		}
	}
}
