import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lj")
public final class Class55_Sub2_Sub1 extends Class55_Sub2 {

	@OriginalMember(owner = "client!lj", name = "I", descriptor = "[B")
	private byte[] aByteArray64;

	@OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V")
	public Class55_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)[B")
	public byte[] method2441() {
		this.aByteArray64 = new byte[524288];
		this.method2429();
		return this.aByteArray64;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IB)V")
	@Override
	protected void method2438(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray64[local15] = local12;
		this.aByteArray64[local16] = local12;
	}
}
