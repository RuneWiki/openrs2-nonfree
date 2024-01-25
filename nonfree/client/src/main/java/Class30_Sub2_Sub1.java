import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pca")
public final class Class30_Sub2_Sub1 extends Class30_Sub2 {

	@OriginalMember(owner = "client!pca", name = "I", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!pca", name = "<init>", descriptor = "()V")
	public Class30_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIBI)[B")
	public byte[] method6251() {
		this.aByteArray88 = new byte[524288];
		this.method7989();
		return this.aByteArray88;
	}

	@OriginalMember(owner = "client!pca", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method7997(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray88[local19] = local16;
		this.aByteArray88[local20] = local16;
	}
}
