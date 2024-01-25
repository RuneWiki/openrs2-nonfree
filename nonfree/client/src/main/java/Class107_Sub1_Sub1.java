import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gv")
public final class Class107_Sub1_Sub1 extends Class107_Sub1 {

	@OriginalMember(owner = "client!gv", name = "D", descriptor = "[B")
	private byte[] aByteArray26;

	@OriginalMember(owner = "client!gv", name = "<init>", descriptor = "()V")
	public Class107_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIZ)[B")
	public byte[] method2093() {
		this.aByteArray26 = new byte[524288];
		this.method2820();
		return this.aByteArray26;
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method2090(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(29) int local29 = arg0 * 2;
		@Pc(38) byte local38 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(41) int local41 = local29;
		@Pc(42) int local42 = local29 + 1;
		this.aByteArray26[local41] = local38;
		this.aByteArray26[local42] = local38;
	}
}
