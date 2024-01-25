import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class23_Sub1_Sub1 extends Class23_Sub1 {

	@OriginalMember(owner = "client!he", name = "E", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
	public Class23_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(III)[B")
	public byte[] method2273() {
		this.aByteArray35 = new byte[524288];
		this.method4275();
		return this.aByteArray35;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2272(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray35[local15] = local12;
		this.aByteArray35[local16] = local12;
	}
}
