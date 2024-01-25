import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 {

	@OriginalMember(owner = "client!nh", name = "F", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "()V")
	public Class25_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III)[B")
	public byte[] method3651() {
		this.aByteArray48 = new byte[524288];
		this.method3639();
		return this.aByteArray48;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
	@Override
	protected void method3650(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(3) int local3 = arg0 * 2;
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(15) int local15 = local3;
		@Pc(16) int local16 = local3 + 1;
		this.aByteArray48[local15] = local12;
		this.aByteArray48[local16] = local12;
	}
}
