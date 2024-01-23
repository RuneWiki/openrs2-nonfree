import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class13_Sub2_Sub1 extends Class13_Sub2 {

	@OriginalMember(owner = "client!jj", name = "N", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
	public Class13_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)V")
	@Override
	protected void method2240(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray35[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray35[local11] = (byte) (local7 >> 2);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)[B")
	public byte[] method2243() {
		this.aByteArray35 = new byte[524288];
		this.method2226();
		return this.aByteArray35;
	}
}
