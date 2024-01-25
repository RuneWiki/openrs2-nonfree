import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ig")
public final class Class25_Sub2_Sub2 extends Class25_Sub2 {

	@OriginalMember(owner = "client!ig", name = "K", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
	public Class25_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)[B")
	public byte[] method4071() {
		this.aByteArray55 = new byte[524288];
		this.method4064();
		return this.aByteArray55;
	}

	@OriginalMember(owner = "client!ig", name = "b", descriptor = "(BII)V")
	@Override
	protected void method4067(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray55[local19] = local12;
		this.aByteArray55[local20] = local12;
	}
}
