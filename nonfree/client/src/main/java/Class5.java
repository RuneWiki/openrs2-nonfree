import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5 {

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "[B")
	public static final byte[] aByteArray4;

	static {
		@Pc(5) int local5 = 0;
		aByteArray4 = new byte[32896];
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			for (@Pc(13) int local13 = 0; local13 <= local10; local13++) {
				aByteArray4[local5++] = (byte) (255.0D / Math.sqrt((double) ((float) (local13 * local13 + local10 * local10 + 65535) / 65535.0F)));
			}
		}
	}
}
