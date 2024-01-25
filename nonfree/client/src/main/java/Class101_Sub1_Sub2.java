import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rj")
public final class Class101_Sub1_Sub2 extends Class101_Sub1 {

	@OriginalMember(owner = "client!rj", name = "I", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!rj", name = "<init>", descriptor = "()V")
	public Class101_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(BIII)[B")
	public byte[] method6333() {
		this.aByteArray101 = new byte[524288];
		this.method7243();
		return this.aByteArray101;
	}

	@OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZB)V")
	@Override
	protected void method6330(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local11;
		@Pc(24) int local24 = local11 + 1;
		this.aByteArray101[local23] = local20;
		this.aByteArray101[local24] = local20;
	}
}
