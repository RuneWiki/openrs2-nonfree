import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class30_Sub2_Sub2 extends Class30_Sub2 {

	@OriginalMember(owner = "client!vd", name = "L", descriptor = "[B")
	private byte[] aByteArray106;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class30_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method7997(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(23) int local23 = local16;
		@Pc(24) int local24 = local16 + 1;
		this.aByteArray106[local23] = local12;
		this.aByteArray106[local24] = local12;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIBI)[B")
	public byte[] method8000() {
		this.aByteArray106 = new byte[524288];
		this.method7989();
		return this.aByteArray106;
	}
}
