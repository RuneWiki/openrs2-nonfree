import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sb")
public final class Class74_Sub2_Sub1 extends Class74_Sub2 {

	@OriginalMember(owner = "client!sb", name = "E", descriptor = "[B")
	private byte[] aByteArray105;

	@OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
	public Class74_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(IBI)V")
	@Override
	protected void method5126(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = arg0 * 2;
		@Pc(22) int local22 = local19;
		@Pc(23) int local23 = local19 + 1;
		this.aByteArray105[local22] = local12;
		this.aByteArray105[local23] = local12;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BIII)[B")
	public byte[] method5130() {
		this.aByteArray105 = new byte[524288];
		this.method5121();
		return this.aByteArray105;
	}
}
