import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tr")
public final class Class342 {

	@OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
	public static final int[] anIntArray623 = new int[256];

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
	public int anInt9092;

	@OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
	public int anInt9093;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
	public int anInt9095;

	@OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
	public int anInt9097;

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
			anIntArray623[local4] = local7;
		}
	}
}
