import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qp")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!qp", name = "L", descriptor = "[B")
	private byte[] aByteArray77;

	@OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII)[B")
	public byte[] method6171() {
		this.aByteArray77 = new byte[524288];
		this.method6635();
		return this.aByteArray77;
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method6638(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray77[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray77[local19] = (byte) (local15 * 3 >> 5);
	}
}
