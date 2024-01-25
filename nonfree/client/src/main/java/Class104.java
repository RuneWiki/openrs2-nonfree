import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class104 {

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[B")
	public static final byte[] aByteArray39 = new byte[32896];

	static {
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray39[local4++] = (byte) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}
}
