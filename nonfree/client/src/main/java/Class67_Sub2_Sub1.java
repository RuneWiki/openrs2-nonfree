import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class67_Sub2_Sub1 extends Class67_Sub2 {

	@OriginalMember(owner = "client!qf", name = "F", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "()V")
	public Class67_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)[B")
	public byte[] method4690() {
		this.aByteArray66 = new byte[524288];
		this.method4680();
		return this.aByteArray66;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BII)V")
	@Override
	protected void method4687(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray66[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray66[local15] = (byte) (local11 * 3 >> 5);
	}
}
