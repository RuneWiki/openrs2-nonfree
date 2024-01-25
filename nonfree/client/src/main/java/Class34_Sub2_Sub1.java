import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class34_Sub2_Sub1 extends Class34_Sub2 {

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "[B")
	private byte[] aByteArray140;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
	public Class34_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(BII)V")
	@Override
	protected void method3805(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(19) int local19 = arg0 & 0xFF;
		@Pc(22) int local22 = local15;
		@Pc(23) int local23 = local15 + 1;
		this.aByteArray140[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray140[local23] = (byte) (local19 * 3 >> 5);
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(IIII)[B")
	public byte[] method3809() {
		this.aByteArray140 = new byte[524288];
		this.method3796();
		return this.aByteArray140;
	}
}
