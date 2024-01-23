import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class104 {

	@OriginalMember(owner = "client!se", name = "a", descriptor = "[B")
	public static byte[] aByteArray43 = new byte[32896];

	@OriginalMember(owner = "client!se", name = "b", descriptor = "I")
	public int anInt3999;

	@OriginalMember(owner = "client!se", name = "c", descriptor = "I")
	public int anInt4000;

	@OriginalMember(owner = "client!se", name = "d", descriptor = "I")
	public int anInt4001;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	public int anInt4002;

	@OriginalMember(owner = "client!se", name = "f", descriptor = "I")
	public int anInt4003;

	@OriginalMember(owner = "client!se", name = "l", descriptor = "I")
	public int anInt4009;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	public int anInt4012;

	@OriginalMember(owner = "client!se", name = "s", descriptor = "I")
	public int anInt4014;

	@OriginalMember(owner = "client!se", name = "u", descriptor = "I")
	public int anInt4015 = -1;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray43[local6++] = (byte) (255.0D / Math.sqrt((double) ((float) (local8 * local8 + local11 * local11 + 65535) / 65535.0F)));
			}
		}
	}
}
