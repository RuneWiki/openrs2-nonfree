import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class17_Sub2_Sub1 extends Class17_Sub2 {

	@OriginalMember(owner = "client!hk", name = "K", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V")
	public Class17_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IBII)[B")
	public byte[] method3450() {
		this.aByteArray34 = new byte[524288];
		this.method6650();
		return this.aByteArray34;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZIB)V")
	@Override
	protected void method6657(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(19) int local19 = arg1 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray34[local22] = -1;
		this.aByteArray34[local23] = (byte) (local19 * 3 >> 5);
	}
}
