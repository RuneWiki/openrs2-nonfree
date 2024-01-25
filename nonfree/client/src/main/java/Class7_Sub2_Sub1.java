import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 {

	@OriginalMember(owner = "client!js", name = "G", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class7_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(III)[B")
	public byte[] method2932() {
		this.aByteArray47 = new byte[524288];
		this.method2924();
		return this.aByteArray47;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2928(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray47[local15] = local12;
		this.aByteArray47[local16] = local12;
	}
}
