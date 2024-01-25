import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!laa")
public final class Class6_Sub1_Sub1 extends Class6_Sub1 {

	@OriginalMember(owner = "client!laa", name = "H", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!laa", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(BIZ)V")
	@Override
	protected void method5136(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray55[local19] = local16;
		this.aByteArray55[local20] = local16;
	}

	@OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIZ)[B")
	public byte[] method4554() {
		this.aByteArray55 = new byte[524288];
		this.method6624();
		return this.aByteArray55;
	}
}
