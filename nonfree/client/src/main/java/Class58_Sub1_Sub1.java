import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!el")
public final class Class58_Sub1_Sub1 extends Class58_Sub1 {

	@OriginalMember(owner = "client!el", name = "F", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V")
	public Class58_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(III)[B")
	public byte[] method1663() {
		this.aByteArray29 = new byte[524288];
		this.method3998();
		return this.aByteArray29;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1662(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray29[local15] = local12;
		this.aByteArray29[local16] = local12;
	}
}
