import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gm")
public final class Class32_Sub2_Sub1 extends Class32_Sub2 {

	@OriginalMember(owner = "client!gm", name = "H", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!gm", name = "<init>", descriptor = "()V")
	public Class32_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(III)[B")
	public byte[] method1675() {
		this.aByteArray17 = new byte[524288];
		this.method1659();
		return this.aByteArray17;
	}

	@OriginalMember(owner = "client!gm", name = "b", descriptor = "(IB)V")
	@Override
	protected void method1674(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray17[local15] = local12;
		this.aByteArray17[local16] = local12;
	}
}
