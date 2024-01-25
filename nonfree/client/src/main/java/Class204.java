import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class204 {

	@OriginalMember(owner = "client!qq", name = "g", descriptor = "[B")
	public static final byte[] aByteArray72 = new byte[32896];

	static {
		@Pc(14) int local14 = 0;
		for (@Pc(16) int local16 = 0; local16 < 256; local16++) {
			for (@Pc(19) int local19 = 0; local19 <= local16; local19++) {
				aByteArray72[local14++] = (byte) (255.0D / Math.sqrt((double) ((float) (local16 * local16 + local19 * local19 + 65535) / 65535.0F)));
			}
		}
	}
}
