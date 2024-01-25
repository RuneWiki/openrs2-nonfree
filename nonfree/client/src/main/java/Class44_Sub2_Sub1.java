import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public final class Class44_Sub2_Sub1 extends Class44_Sub2 {

	@OriginalMember(owner = "client!pn", name = "C", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V")
	public Class44_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "(IIII)[B")
	public byte[] method6361() {
		this.aByteArray77 = new byte[524288];
		this.method8024();
		return this.aByteArray77;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method8030(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray77[local19] = local12;
		this.aByteArray77[local20] = local12;
	}
}
