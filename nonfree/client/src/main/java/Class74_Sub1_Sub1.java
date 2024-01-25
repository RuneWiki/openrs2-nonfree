import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class74_Sub1_Sub1 extends Class74_Sub1 {

	@OriginalMember(owner = "client!rr", name = "K", descriptor = "[B")
	private byte[] aByteArray102;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	public Class74_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZII)[B")
	public byte[] method5071() {
		this.aByteArray102 = new byte[524288];
		this.method5121();
		return this.aByteArray102;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method5070(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray102[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray102[local15] = (byte) (local11 * 3 >> 5);
	}
}
