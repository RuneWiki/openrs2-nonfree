import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public final class Class60_Sub2_Sub1 extends Class60_Sub2 {

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "[B")
	private byte[] aByteArray111;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V")
	public Class60_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(BII)V")
	@Override
	protected void method8980(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(23) int local23 = local16;
		@Pc(24) int local24 = local16 + 1;
		this.aByteArray111[local23] = local12;
		this.aByteArray111[local24] = local12;
	}

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIBI)[B")
	public byte[] method8930() {
		this.aByteArray111 = new byte[524288];
		this.method8976((byte) 123);
		return this.aByteArray111;
	}
}
