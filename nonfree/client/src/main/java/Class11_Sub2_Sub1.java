import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class11_Sub2_Sub1 extends Class11_Sub2 {

	@OriginalMember(owner = "client!pf", name = "L", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(IIII)[B")
	public byte[] method5743() {
		this.aByteArray85 = new byte[524288];
		this.method7806();
		return this.aByteArray85;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7810(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray85[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray85[local20] = (byte) (local16 * 3 >> 5);
	}
}
