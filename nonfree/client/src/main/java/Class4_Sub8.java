import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public abstract class Class4_Sub8 extends Class4 {

	@OriginalMember(owner = "client!e", name = "p", descriptor = "[B")
	public static final byte[] aByteArray72;

	static {
		@Pc(7) int local7 = 0;
		aByteArray72 = new byte[32896];
		for (@Pc(12) int local12 = 0; local12 < 256; local12++) {
			for (@Pc(15) int local15 = 0; local15 <= local12; local15++) {
				aByteArray72[local7++] = (byte) (255.0D / Math.sqrt((double) ((float) (local12 * local12 + local15 * local15 + 65535) / 65535.0F)));
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	protected Class4_Sub8() {
	}
}
