import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ffa")
public final class Class5_Sub2_Sub1 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ffa", name = "S", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BZI)V")
	@Override
	protected void method2408(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray30[local19] = -1;
		this.aByteArray30[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ffa", name = "c", descriptor = "(IIII)[B")
	public byte[] method2064() {
		this.aByteArray30 = new byte[524288];
		this.method5028();
		return this.aByteArray30;
	}
}
