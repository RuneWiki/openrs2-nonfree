import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class12_Sub2_Sub2 extends Class12_Sub2 {

	@OriginalMember(owner = "client!hg", name = "S", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray35[local24] = local16;
		this.aByteArray35[local25] = local16;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBII)[B")
	public byte[] method4069() {
		this.aByteArray35 = new byte[524288];
		this.method7640();
		return this.aByteArray35;
	}
}
