import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lf")
public final class Class103_Sub2_Sub1 extends Class103_Sub2 {

	@OriginalMember(owner = "client!lf", name = "L", descriptor = "[B")
	private byte[] aByteArray48;

	@OriginalMember(owner = "client!lf", name = "<init>", descriptor = "()V")
	public Class103_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7644(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(19) int local19 = arg1 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray48[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray48[local23] = (byte) (local19 * 3 >> 5);
	}

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)[B")
	public byte[] method5061() {
		this.aByteArray48 = new byte[524288];
		this.method7633();
		return this.aByteArray48;
	}
}
