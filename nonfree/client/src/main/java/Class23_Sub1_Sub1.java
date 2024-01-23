import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!ii", name = "G", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class23_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB)V")
	@Override
	protected void method1935(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray28[local15] = local12;
		this.aByteArray28[local16] = local12;
	}

	@OriginalMember(owner = "client!ii", name = "b", descriptor = "(III)[B")
	public byte[] method1938() {
		this.aByteArray28 = new byte[524288];
		this.method2500();
		return this.aByteArray28;
	}
}
