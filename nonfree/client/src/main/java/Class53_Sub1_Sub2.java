import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wk")
public final class Class53_Sub1_Sub2 extends Class53_Sub1 {

	@OriginalMember(owner = "client!wk", name = "J", descriptor = "[B")
	private byte[] aByteArray126;

	@OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
	public Class53_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIBI)[B")
	public byte[] method7342() {
		this.aByteArray126 = new byte[524288];
		this.method7334();
		return this.aByteArray126;
	}

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7338(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray126[local10] = -1;
		@Pc(25) int local25 = arg0 & 0xFF;
		this.aByteArray126[local11] = (byte) (local25 * 3 >> 5);
	}
}
