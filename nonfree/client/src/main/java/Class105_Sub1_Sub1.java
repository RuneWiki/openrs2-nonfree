import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class105_Sub1_Sub1 extends Class105_Sub1 {

	@OriginalMember(owner = "client!jj", name = "D", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class105_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(BIII)[B")
	public byte[] method4223() {
		this.aByteArray64 = new byte[524288];
		this.method8368();
		return this.aByteArray64;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method4735(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray64[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray64[local15] = (byte) (local11 * 3 >> 5);
	}
}
