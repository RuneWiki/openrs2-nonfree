import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eaa")
public final class Class73_Sub1_Sub2 extends Class73_Sub1 {

	@OriginalMember(owner = "client!eaa", name = "L", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!eaa", name = "<init>", descriptor = "()V")
	public Class73_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!eaa", name = "b", descriptor = "(IIII)[B")
	public byte[] method2216() {
		this.aByteArray35 = new byte[524288];
		this.method7238();
		return this.aByteArray35;
	}

	@OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method2214(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) int local12 = arg0 * 2;
		@Pc(16) int local16 = arg1 & 0xFF;
		@Pc(19) int local19 = local12;
		@Pc(20) int local20 = local12 + 1;
		this.aByteArray35[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray35[local20] = (byte) (local16 * 3 >> 5);
	}
}
