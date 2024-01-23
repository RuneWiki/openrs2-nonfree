import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!va")
public final class Class104 {

	@OriginalMember(owner = "client!va", name = "o", descriptor = "[B")
	public static byte[] aByteArray53 = new byte[32896];

	@OriginalMember(owner = "client!va", name = "a", descriptor = "I")
	public int anInt4643;

	@OriginalMember(owner = "client!va", name = "c", descriptor = "I")
	public int anInt4644;

	@OriginalMember(owner = "client!va", name = "e", descriptor = "I")
	public int anInt4645;

	@OriginalMember(owner = "client!va", name = "f", descriptor = "I")
	public int anInt4646;

	@OriginalMember(owner = "client!va", name = "i", descriptor = "I")
	public int anInt4648;

	@OriginalMember(owner = "client!va", name = "j", descriptor = "I")
	public int anInt4649;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!qf;")
	public Class5 aClass5_9;

	@OriginalMember(owner = "client!va", name = "n", descriptor = "I")
	public int anInt4651;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!qf;")
	public Class5 aClass5_10;

	@OriginalMember(owner = "client!va", name = "m", descriptor = "J")
	public long aLong175 = 0L;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			for (@Pc(11) int local11 = 0; local11 <= local8; local11++) {
				aByteArray53[local6++] = (byte) (255.0D / Math.sqrt((double) ((float) (local11 * local11 + local8 * local8 + 65535) / 65535.0F)));
			}
		}
	}
}
