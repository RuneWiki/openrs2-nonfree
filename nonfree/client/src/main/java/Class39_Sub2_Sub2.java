import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tca")
public final class Class39_Sub2_Sub2 extends Class39_Sub2 {

	@OriginalMember(owner = "client!tca", name = "P", descriptor = "[B")
	private byte[] aByteArray97;

	@OriginalMember(owner = "client!tca", name = "<init>", descriptor = "()V")
	public Class39_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIII)[B")
	public byte[] method6759() {
		this.aByteArray97 = new byte[524288];
		this.method6746();
		return this.aByteArray97;
	}

	@OriginalMember(owner = "client!tca", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(18) int local18 = arg1 & 0xFF;
		@Pc(21) int local21 = local7;
		@Pc(22) int local22 = local7 + 1;
		this.aByteArray97[local21] = -1;
		this.aByteArray97[local22] = (byte) (local18 * 3 >> 5);
	}
}
