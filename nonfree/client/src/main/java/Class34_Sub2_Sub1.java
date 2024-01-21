import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class34_Sub2_Sub1 extends Class34_Sub2 {

	@OriginalMember(owner = "client!ga", name = "y", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[32896];

	static {
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < 256; local17++) {
			for (@Pc(20) int local20 = 0; local20 <= local17; local20++) {
				aByteArray8[local15++] = (byte) (255.0D / Math.sqrt((double) ((float) (local20 * local20 + local17 * local17 + 65535) / 65535.0F)));
			}
		}
	}
}
