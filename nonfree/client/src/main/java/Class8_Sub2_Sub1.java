import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class8_Sub2_Sub1 extends Class8_Sub2 {

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "[B")
	private byte[] aByteArray73;

	@OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB)V")
	@Override
	protected void method4255(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray73[local15] = local12;
		this.aByteArray73[local16] = local12;
	}

	@OriginalMember(owner = "client!sg", name = "c", descriptor = "(III)[B")
	public byte[] method4264() {
		this.aByteArray73 = new byte[524288];
		this.method4253();
		return this.aByteArray73;
	}
}
