import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class12_Sub2_Sub1 extends Class12_Sub2 {

	@OriginalMember(owner = "client!ds", name = "N", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	public Class12_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method4063(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(18) byte local18 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(22) int local22 = arg0 * 2;
		@Pc(25) int local25 = local22;
		@Pc(26) int local26 = local22 + 1;
		this.aByteArray26[local25] = local18;
		this.aByteArray26[local26] = local18;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBII)[B")
	public byte[] method2044() {
		this.aByteArray26 = new byte[524288];
		this.method7640();
		return this.aByteArray26;
	}
}
