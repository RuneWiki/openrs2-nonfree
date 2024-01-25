import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class18_Sub1_Sub2 extends Class18_Sub1 {

	@OriginalMember(owner = "client!pw", name = "F", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "()V")
	public Class18_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method6840(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local7;
		@Pc(28) int local28 = local7 + 1;
		this.aByteArray83[local27] = local16;
		this.aByteArray83[local28] = local16;
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IIII)[B")
	public byte[] method6844() {
		this.aByteArray83 = new byte[524288];
		this.method7247();
		return this.aByteArray83;
	}
}
