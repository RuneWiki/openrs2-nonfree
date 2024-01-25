import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class38_Sub2_Sub2 extends Class38_Sub2 {

	@OriginalMember(owner = "client!li", name = "x", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V")
	public Class38_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4311(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(24) byte local24 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local7;
		@Pc(28) int local28 = local7 + 1;
		this.aByteArray63[local27] = local24;
		this.aByteArray63[local28] = local24;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(IIII)[B")
	public byte[] method4313() {
		this.aByteArray63 = new byte[524288];
		this.method5557();
		return this.aByteArray63;
	}
}
