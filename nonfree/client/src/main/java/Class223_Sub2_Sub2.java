import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qk")
public final class Class223_Sub2_Sub2 extends Class223_Sub2 {

	@OriginalMember(owner = "client!qk", name = "K", descriptor = "[B")
	private byte[] aByteArray80;

	@OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
	public Class223_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIIB)[B")
	public byte[] method6905() {
		this.aByteArray80 = new byte[524288];
		this.method6924();
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method6904(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray80[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray80[local15] = (byte) (local11 * 3 >> 5);
	}
}
