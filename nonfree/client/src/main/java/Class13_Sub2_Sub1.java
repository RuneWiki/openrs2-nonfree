import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class13_Sub2_Sub1 extends Class13_Sub2 {

	@OriginalMember(owner = "client!pb", name = "F", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class13_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7337(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray73[local22] = (byte) (local11 * 3 >> 5);
		this.aByteArray73[local23] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIII)[B")
	public byte[] method6396() {
		this.aByteArray73 = new byte[524288];
		this.method7333();
		return this.aByteArray73;
	}
}
