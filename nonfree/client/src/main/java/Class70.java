import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class70 {

	@OriginalMember(owner = "client!i", name = "b", descriptor = "[B")
	public static byte[] aByteArray27;

	static {
		@Pc(1) int local1 = 0;
		aByteArray27 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(11) int local11 = 0; local11 <= local6; local11++) {
				aByteArray27[local1++] = (byte) (255.0D / Math.sqrt((double) ((float) (local6 * local6 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}
}
