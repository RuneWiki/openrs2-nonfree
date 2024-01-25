import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class103_Sub2_Sub2 extends Class103_Sub2 {

	@OriginalMember(owner = "client!tf", name = "O", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V")
	public Class103_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7644(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray85[local10] = -1;
		@Pc(21) int local21 = arg1 & 0xFF;
		this.aByteArray85[local11] = (byte) (local21 * 3 >> 5);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIII)[B")
	public byte[] method7650() {
		this.aByteArray85 = new byte[524288];
		this.method7633();
		return this.aByteArray85;
	}
}
