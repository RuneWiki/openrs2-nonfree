import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tk")
public final class Class80_Sub2_Sub1 extends Class80_Sub2 {

	@OriginalMember(owner = "client!tk", name = "B", descriptor = "[B")
	private byte[] aByteArray94;

	@OriginalMember(owner = "client!tk", name = "<init>", descriptor = "()V")
	public Class80_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8204(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray94[local19] = local16;
		this.aByteArray94[local20] = local16;
	}

	@OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIBI)[B")
	public byte[] method7648() {
		this.aByteArray94 = new byte[524288];
		this.method8200();
		return this.aByteArray94;
	}
}
