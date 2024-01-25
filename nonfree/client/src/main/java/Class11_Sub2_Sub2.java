import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public final class Class11_Sub2_Sub2 extends Class11_Sub2 {

	@OriginalMember(owner = "client!wn", name = "P", descriptor = "[B")
	private byte[] aByteArray126;

	@OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V")
	public Class11_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method7810(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray126[local18] = -1;
		this.aByteArray126[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(IIII)[B")
	public byte[] method7816() {
		this.aByteArray126 = new byte[524288];
		this.method7806();
		return this.aByteArray126;
	}
}
