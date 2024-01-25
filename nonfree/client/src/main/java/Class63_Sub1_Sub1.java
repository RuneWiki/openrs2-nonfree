import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cw")
public final class Class63_Sub1_Sub1 extends Class63_Sub1 {

	@OriginalMember(owner = "client!cw", name = "I", descriptor = "[B")
	private byte[] aByteArray27;

	@OriginalMember(owner = "client!cw", name = "<init>", descriptor = "()V")
	public Class63_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method5837(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(24) byte local24 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local15;
		@Pc(28) int local28 = local15 + 1;
		this.aByteArray27[local27] = local24;
		this.aByteArray27[local28] = local24;
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(IIII)[B")
	public byte[] method1403() {
		this.aByteArray27 = new byte[524288];
		this.method5906();
		return this.aByteArray27;
	}
}
