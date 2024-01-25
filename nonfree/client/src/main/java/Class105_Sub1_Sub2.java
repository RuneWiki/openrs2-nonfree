import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kma")
public final class Class105_Sub1_Sub2 extends Class105_Sub1 {

	@OriginalMember(owner = "client!kma", name = "D", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!kma", name = "<init>", descriptor = "()V")
	public Class105_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!kma", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray72[local19] = -1;
		this.aByteArray72[local20] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!kma", name = "b", descriptor = "(BIII)[B")
	public byte[] method4737() {
		this.aByteArray72 = new byte[524288];
		this.method8368();
		return this.aByteArray72;
	}
}
