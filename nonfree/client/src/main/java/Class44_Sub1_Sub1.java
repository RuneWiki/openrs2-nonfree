import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cq")
public final class Class44_Sub1_Sub1 extends Class44_Sub1 {

	@OriginalMember(owner = "client!cq", name = "O", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "()V")
	public Class44_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(IIII)[B")
	public byte[] method1788() {
		this.aByteArray27 = new byte[524288];
		this.method4573();
		return this.aByteArray27;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(ZBI)V")
	@Override
	protected void method4577(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray27[local22] = (byte) (local11 * 3 >> 5);
		this.aByteArray27[local23] = (byte) (local11 * 3 >> 5);
	}
}
