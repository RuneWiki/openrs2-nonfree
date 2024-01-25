import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class73_Sub1_Sub1 extends Class73_Sub1 {

	@OriginalMember(owner = "client!dw", name = "J", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "()V")
	public Class73_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(IIII)[B")
	public byte[] method2182() {
		this.aByteArray33 = new byte[524288];
		this.method7238();
		return this.aByteArray33;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method2214(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray33[local18] = -1;
		this.aByteArray33[local19] = (byte) (local15 * 3 >> 5);
	}
}
