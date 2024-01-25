import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public final class Class61 {

	@OriginalMember(owner = "client!dt", name = "d", descriptor = "[B")
	public static final byte[] aByteArray14;

	static {
		new Class36("", 73);
		aByteArray14 = new byte[32896];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray14[local10++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}
}
