import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class69_Sub2_Sub1 extends Class69_Sub2 {

	@OriginalMember(owner = "client!si", name = "G", descriptor = "[B")
	private byte[] aByteArray72;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
	public Class69_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)[B")
	public byte[] method4746() {
		this.aByteArray72 = new byte[524288];
		this.method4734();
		return this.aByteArray72;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method4741(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray72[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray72[local15] = (byte) (local11 * 3 >> 5);
	}
}
