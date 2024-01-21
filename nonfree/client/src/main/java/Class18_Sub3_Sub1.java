import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class18_Sub3_Sub1 extends Class18_Sub3 {

	@OriginalMember(owner = "client!td", name = "B", descriptor = "[B")
	public static final byte[] aByteArray46 = new byte[32896];

	static {
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray46[local10++] = (byte) (255.0D / Math.sqrt((double) ((float) (local15 * local15 + local12 * local12 + 65535) / 65535.0F)));
			}
		}
	}
}
