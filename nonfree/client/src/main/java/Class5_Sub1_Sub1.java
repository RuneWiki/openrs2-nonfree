import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class5_Sub1_Sub1 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ad", name = "F", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method5030(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(20) int local20 = arg0 * 2;
		@Pc(23) int local23 = local20;
		@Pc(24) int local24 = local20 + 1;
		this.aByteArray4[local23] = local12;
		this.aByteArray4[local24] = local12;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBII)[B")
	public byte[] method94() {
		this.aByteArray4 = new byte[524288];
		this.method5028();
		return this.aByteArray4;
	}
}
