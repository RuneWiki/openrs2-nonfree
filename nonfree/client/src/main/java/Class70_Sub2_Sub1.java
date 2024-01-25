import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public final class Class70_Sub2_Sub1 extends Class70_Sub2 {

	@OriginalMember(owner = "client!us", name = "G", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V")
	public Class70_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!us", name = "b", descriptor = "(IIII)[B")
	public byte[] method5674() {
		this.aByteArray87 = new byte[524288];
		this.method5668();
		return this.aByteArray87;
	}

	@OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5672(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(17) int local17 = arg0 * 2;
		@Pc(26) byte local26 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local17;
		@Pc(30) int local30 = local17 + 1;
		this.aByteArray87[local29] = local26;
		this.aByteArray87[local30] = local26;
	}
}
