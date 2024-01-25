import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class105_Sub2_Sub1 extends Class105_Sub2 {

	@OriginalMember(owner = "client!he", name = "H", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class105_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8375(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray49[local19] = local12;
		this.aByteArray49[local20] = local12;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIII)[B")
	public byte[] method3316() {
		this.aByteArray49 = new byte[524288];
		this.method8368();
		return this.aByteArray49;
	}
}
