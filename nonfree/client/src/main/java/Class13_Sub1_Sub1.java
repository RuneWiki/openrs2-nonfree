import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class13_Sub1_Sub1 extends Class13_Sub1 {

	@OriginalMember(owner = "client!eb", name = "H", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
	public Class13_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIII)[B")
	public byte[] method2320() {
		this.aByteArray18 = new byte[524288];
		this.method7333();
		return this.aByteArray18;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method2933(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(20) byte local20 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg1 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray18[local27] = local20;
		this.aByteArray18[local28] = local20;
	}
}
