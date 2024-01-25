import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public final class Class35_Sub1_Sub1 extends Class35_Sub1 {

	@OriginalMember(owner = "client!ca", name = "I", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V")
	public Class35_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)[B")
	public byte[] method623() {
		this.aByteArray15 = new byte[524288];
		this.method2275();
		return this.aByteArray15;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V")
	@Override
	protected void method616(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray15[local15] = local12;
		this.aByteArray15[local16] = local12;
	}
}
