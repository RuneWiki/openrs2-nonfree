import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public final class Class83_Sub2_Sub1 extends Class83_Sub2 {

	@OriginalMember(owner = "client!rk", name = "O", descriptor = "[B")
	private byte[] aByteArray86;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V")
	public Class83_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)[B")
	public byte[] method4790() {
		this.aByteArray86 = new byte[524288];
		this.method4775();
		return this.aByteArray86;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(IB)V")
	@Override
	protected void method4785(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray86[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray86[local11] = (byte) (local7 * 3 >> 5);
	}
}
