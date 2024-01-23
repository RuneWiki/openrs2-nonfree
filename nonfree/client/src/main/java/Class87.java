import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class87 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[B")
	public static byte[] aByteArray33 = new byte[32896];

	static {
		@Pc(2091) int local2091 = 0;
		for (@Pc(2093) int local2093 = 0; local2093 < 256; local2093++) {
			for (@Pc(2098) int local2098 = 0; local2098 <= local2093; local2098++) {
				aByteArray33[local2091++] = (byte) (255.0D / Math.sqrt((double) ((float) (local2098 * local2098 + local2093 * local2093 + 65535) / 65535.0F)));
			}
		}
	}
}
