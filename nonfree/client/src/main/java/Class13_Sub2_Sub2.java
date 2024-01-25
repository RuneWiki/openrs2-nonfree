import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class13_Sub2_Sub2 extends Class13_Sub2 {

	@OriginalMember(owner = "client!rm", name = "L", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V")
	public Class13_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7337(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray82[local14] = -1;
		this.aByteArray82[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII)[B")
	public byte[] method7340() {
		this.aByteArray82 = new byte[524288];
		this.method7333();
		return this.aByteArray82;
	}
}
