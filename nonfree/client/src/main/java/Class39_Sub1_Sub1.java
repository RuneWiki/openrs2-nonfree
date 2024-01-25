import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public final class Class39_Sub1_Sub1 extends Class39_Sub1 {

	@OriginalMember(owner = "client!n", name = "C", descriptor = "[B")
	private byte[] aByteArray51;

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
	public Class39_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
	@Override
	protected void method3565(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray51[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray51[local11] = (byte) (local7 * 3 >> 5);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(III)[B")
	public byte[] method3568() {
		this.aByteArray51 = new byte[524288];
		this.method3561();
		return this.aByteArray51;
	}
}
