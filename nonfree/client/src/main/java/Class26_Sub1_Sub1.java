import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cj")
public final class Class26_Sub1_Sub1 extends Class26_Sub1 {

	@OriginalMember(owner = "client!cj", name = "K", descriptor = "[B")
	private byte[] aByteArray31;

	@OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
	public Class26_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(III)[B")
	public byte[] method721() {
		this.aByteArray31 = new byte[524288];
		this.method4617();
		return this.aByteArray31;
	}

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "(IB)V")
	@Override
	protected void method718(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray31[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray31[local11] = (byte) (local7 >> 2);
	}
}
