import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fh")
public final class Class23_Sub2_Sub1 extends Class23_Sub2 {

	@OriginalMember(owner = "client!fh", name = "G", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V")
	public Class23_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(III)[B")
	public byte[] method1607() {
		this.aByteArray18 = new byte[524288];
		this.method4622();
		return this.aByteArray18;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1606(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray18[local15] = local12;
		this.aByteArray18[local16] = local12;
	}
}
