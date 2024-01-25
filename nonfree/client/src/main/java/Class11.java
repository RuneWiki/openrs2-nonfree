import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aia")
public final class Class11 {

	@OriginalMember(owner = "client!aia", name = "c", descriptor = "[B")
	public static final byte[] aByteArray4;

	static {
		@Pc(1) int local1 = 0;
		aByteArray4 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray4[local1++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}
}
