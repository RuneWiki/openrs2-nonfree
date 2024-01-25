import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class73_Sub2_Sub1 extends Class73_Sub2 {

	@OriginalMember(owner = "client!jn", name = "L", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "()V")
	public Class73_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIB)[B")
	public byte[] method4494() {
		this.aByteArray63 = new byte[524288];
		this.method7238();
		return this.aByteArray63;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method7243(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray63[local19] = local16;
		this.aByteArray63[local20] = local16;
	}
}
