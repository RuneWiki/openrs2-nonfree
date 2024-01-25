import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class8_Sub2_Sub2 extends Class8_Sub2 {

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "[B")
	private byte[] aByteArray99;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)V")
	@Override
	protected void method7604(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray99[local19] = -1;
		this.aByteArray99[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)[B")
	public byte[] method7607() {
		this.aByteArray99 = new byte[524288];
		this.method7598();
		return this.aByteArray99;
	}
}
