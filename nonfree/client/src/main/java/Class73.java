import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class73 {

	@OriginalMember(owner = "client!q", name = "A", descriptor = "[I")
	public static final int[] anIntArray399 = new int[256];

	@OriginalMember(owner = "client!q", name = "a", descriptor = "I")
	public int anInt3463;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	public int anInt3464;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "I")
	public int anInt3466;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public int anInt3467;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	public int anInt3468;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "I")
	public int anInt3469;

	@OriginalMember(owner = "client!q", name = "h", descriptor = "I")
	public int anInt3470;

	@OriginalMember(owner = "client!q", name = "i", descriptor = "I")
	public int anInt3471;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "I")
	public int anInt3472;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "I")
	public int anInt3473;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "I")
	public int anInt3474;

	@OriginalMember(owner = "client!q", name = "m", descriptor = "I")
	public int anInt3475;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "I")
	public int anInt3476;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	public int anInt3478;

	@OriginalMember(owner = "client!q", name = "q", descriptor = "I")
	public int anInt3479;

	@OriginalMember(owner = "client!q", name = "s", descriptor = "I")
	public int anInt3480;

	@OriginalMember(owner = "client!q", name = "x", descriptor = "I")
	public int anInt3482;

	@OriginalMember(owner = "client!q", name = "z", descriptor = "I")
	public int anInt3484;

	static {
		for (@Pc(169) int local169 = 0; local169 < 256; local169++) {
			@Pc(172) int local172 = local169;
			for (@Pc(174) int local174 = 0; local174 < 8; local174++) {
				if ((local172 & 0x1) == 1) {
					local172 = local172 >>> 1 ^ 0xEDB88320;
				} else {
					local172 >>>= 0x1;
				}
			}
			anIntArray399[local169] = local172;
		}
	}
}
