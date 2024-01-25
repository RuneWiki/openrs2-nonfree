import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class40_Sub2_Sub2 extends Class40_Sub2 {

	@OriginalMember(owner = "client!ua", name = "K", descriptor = "[B")
	private byte[] aByteArray101;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V")
	public Class40_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII)[B")
	public byte[] method8460() {
		this.aByteArray101 = new byte[524288];
		this.method8830((byte) -92);
		return this.aByteArray101;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method8455(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(21) int local21 = local7;
		@Pc(22) int local22 = local7 + 1;
		this.aByteArray101[local21] = (byte) (local11 * 3 >> 5);
		this.aByteArray101[local22] = (byte) (local11 * 3 >> 5);
	}
}
