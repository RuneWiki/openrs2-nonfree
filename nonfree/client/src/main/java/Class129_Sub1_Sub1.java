import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class129_Sub1_Sub1 extends Class129_Sub1 {

	@OriginalMember(owner = "client!ps", name = "C", descriptor = "[B")
	private byte[] aByteArray80;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class129_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(III)[B")
	public byte[] method4380() {
		this.aByteArray80 = new byte[524288];
		this.method5190();
		return this.aByteArray80;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)V")
	@Override
	protected void method4378(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray80[local15] = local12;
		this.aByteArray80[local16] = local12;
	}
}
