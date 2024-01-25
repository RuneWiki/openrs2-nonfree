import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!os")
public final class Class261 {

	@OriginalMember(owner = "client!os", name = "g", descriptor = "[B")
	public static final byte[] aByteArray83;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "[S")
	public short[] aShortArray96;

	@OriginalMember(owner = "client!os", name = "f", descriptor = "[B")
	public byte[] aByteArray82;

	@OriginalMember(owner = "client!os", name = "h", descriptor = "[S")
	public short[] aShortArray97;

	@OriginalMember(owner = "client!os", name = "j", descriptor = "[S")
	public short[] aShortArray98;

	static {
		@Pc(1) int local1 = 0;
		aByteArray83 = new byte[32896];
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			for (@Pc(9) int local9 = 0; local9 <= local6; local9++) {
				aByteArray83[local1++] = (byte) (int) (255.0D / Math.sqrt((double) ((float) (local9 * local9 + local6 * local6 + 65535) / 65535.0F)));
			}
		}
	}
}
