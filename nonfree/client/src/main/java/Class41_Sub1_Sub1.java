import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class41_Sub1_Sub1 extends Class41_Sub1 {

	@OriginalMember(owner = "client!dl", name = "O", descriptor = "[B")
	private byte[] aByteArray9;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class41_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)[B")
	public byte[] method938() {
		this.aByteArray9 = new byte[524288];
		this.method3155();
		return this.aByteArray9;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IB)V")
	@Override
	protected void method934(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(7) int local7 = arg1 & 0xFF;
		@Pc(10) int local10 = local3;
		@Pc(11) int local11 = local3 + 1;
		this.aByteArray9[local10] = (byte) (local7 * 3 >> 5);
		this.aByteArray9[local11] = (byte) (local7 >> 2);
	}
}
