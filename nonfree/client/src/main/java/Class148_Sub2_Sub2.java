import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class148_Sub2_Sub2 extends Class148_Sub2 {

	@OriginalMember(owner = "client!ub", name = "D", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
	public Class148_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(IIII)[B")
	public byte[] method7957() {
		this.aByteArray104 = new byte[524288];
		this.method7949();
		return this.aByteArray104;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method7953(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray104[local19] = local16;
		this.aByteArray104[local20] = local16;
	}
}
