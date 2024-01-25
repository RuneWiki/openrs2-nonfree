import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class6_Sub1_Sub2 extends Class6_Sub1 {

	@OriginalMember(owner = "client!mn", name = "G", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(IIII)[B")
	public byte[] method4854() {
		this.aByteArray55 = new byte[524288];
		this.method6635();
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(BII)V")
	@Override
	protected void method4847(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray55[local19] = local12;
		this.aByteArray55[local20] = local12;
	}
}
