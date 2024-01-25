import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class9_Sub1_Sub1 extends Class9_Sub1 {

	@OriginalMember(owner = "client!al", name = "H", descriptor = "[B")
	private byte[] aByteArray7;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V")
	public Class9_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(III)[B")
	public byte[] method419() {
		this.aByteArray7 = new byte[524288];
		this.method844();
		return this.aByteArray7;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IB)V")
	@Override
	protected void method412(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray7[local15] = local12;
		this.aByteArray7[local16] = local12;
	}
}
