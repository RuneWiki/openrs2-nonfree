import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class17_Sub2_Sub2 extends Class17_Sub2 {

	@OriginalMember(owner = "client!lca", name = "J", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "()V")
	public Class17_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(IIII)[B")
	public byte[] method5104() {
		this.aByteArray72 = new byte[524288];
		this.method8415();
		return this.aByteArray72;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method5101(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray72[local19] = local16;
		this.aByteArray72[local20] = local16;
	}
}
