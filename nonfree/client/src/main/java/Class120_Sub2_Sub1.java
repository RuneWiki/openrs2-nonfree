import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class120_Sub2_Sub1 extends Class120_Sub2 {

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class120_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(III)[B")
	public byte[] method4269() {
		this.aByteArray74 = new byte[524288];
		this.method4257();
		return this.aByteArray74;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IB)V")
	@Override
	protected void method4267(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray74[local15] = local12;
		this.aByteArray74[local16] = local12;
	}
}
