import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class63_Sub2_Sub2 extends Class63_Sub2 {

	@OriginalMember(owner = "client!pl", name = "N", descriptor = "[B")
	private byte[] aByteArray95;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	public Class63_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIII)[B")
	public byte[] method5913() {
		this.aByteArray95 = new byte[524288];
		this.method5906();
		return this.aByteArray95;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5910(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray95[local14] = -1;
		this.aByteArray95[local15] = (byte) (local11 * 3 >> 5);
	}
}
