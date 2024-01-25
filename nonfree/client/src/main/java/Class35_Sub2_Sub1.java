import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gh")
public final class Class35_Sub2_Sub1 extends Class35_Sub2 {

	@OriginalMember(owner = "client!gh", name = "J", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!gh", name = "<init>", descriptor = "()V")
	public Class35_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gh", name = "b", descriptor = "(IIII)[B")
	public byte[] method2851() {
		this.aByteArray43 = new byte[524288];
		this.method5904();
		return this.aByteArray43;
	}

	@OriginalMember(owner = "client!gh", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method5907(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 * 2;
		@Pc(18) int local18 = local15;
		@Pc(19) int local19 = local15 + 1;
		this.aByteArray43[local18] = -1;
		@Pc(25) int local25 = arg0 & 0xFF;
		this.aByteArray43[local19] = (byte) (local25 * 3 >> 5);
	}
}
