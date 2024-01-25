import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pga")
public final class Class255 {

	@OriginalMember(owner = "client!pga", name = "a", descriptor = "[B")
	public static final byte[] aByteArray68;

	static {
		@Pc(3) int local3 = 0;
		aByteArray68 = new byte[32896];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray68[local3++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}
}
