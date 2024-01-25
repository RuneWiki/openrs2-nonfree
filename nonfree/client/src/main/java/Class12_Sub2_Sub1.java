import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tka")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!tka", name = "F", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!tka", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method8802(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray99[local19] = local16;
		this.aByteArray99[local20] = local16;
	}

	@OriginalMember(owner = "client!tka", name = "a", descriptor = "(IIBI)[B")
	public byte[] method8421() {
		this.aByteArray99 = new byte[524288];
		this.method8927();
		return this.aByteArray99;
	}
}
