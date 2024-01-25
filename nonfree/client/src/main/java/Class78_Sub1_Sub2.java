import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class78_Sub1_Sub2 extends Class78_Sub1 {

	@OriginalMember(owner = "client!tb", name = "J", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class78_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZIII)[B")
	public byte[] method7626() {
		this.aByteArray87 = new byte[524288];
		this.method7619();
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7621(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray87[local19] = local12;
		this.aByteArray87[local20] = local12;
	}
}
