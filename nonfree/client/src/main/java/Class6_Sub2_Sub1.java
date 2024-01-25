import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!gda", name = "ab", descriptor = "[B")
	private byte[] aByteArray42;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method5193(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(19) int local19 = arg0 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray42[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray42[local23] = (byte) (local19 * 3 >> 5);
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(IIII)[B")
	public byte[] method2463() {
		this.aByteArray42 = new byte[524288];
		this.method6047();
		return this.aByteArray42;
	}
}
