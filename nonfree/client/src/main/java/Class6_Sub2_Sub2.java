import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "[B")
	private byte[] aByteArray98;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method5193(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 * 2;
		@Pc(15) int local15 = arg0 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray98[local18] = -1;
		this.aByteArray98[local19] = (byte) (local15 * 3 >> 5);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(IIII)[B")
	public byte[] method5198() {
		this.aByteArray98 = new byte[524288];
		this.method6047();
		return this.aByteArray98;
	}
}
