import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class41_Sub2_Sub1 extends Class41_Sub2 {

	@OriginalMember(owner = "client!oe", name = "B", descriptor = "[B")
	private byte[] aByteArray49;

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class41_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)[B")
	public byte[] method3169() {
		this.aByteArray49 = new byte[524288];
		this.method3155();
		return this.aByteArray49;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)V")
	@Override
	protected void method3164(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray49[local15] = local12;
		this.aByteArray49[local16] = local12;
	}
}
