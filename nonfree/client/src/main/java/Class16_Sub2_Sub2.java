import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class16_Sub2_Sub2 extends Class16_Sub2 {

	@OriginalMember(owner = "client!sa", name = "F", descriptor = "[B")
	private byte[] aByteArray76;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
	public Class16_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)[B")
	public byte[] method7190() {
		this.aByteArray76 = new byte[524288];
		this.method7182();
		return this.aByteArray76;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method7188(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(18) int local18 = local7;
		@Pc(19) int local19 = local7 + 1;
		this.aByteArray76[local18] = (byte) (local11 * 3 >> 5);
		this.aByteArray76[local19] = (byte) (local11 * 3 >> 5);
	}
}
