import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class77_Sub2_Sub1 extends Class77_Sub2 {

	@OriginalMember(owner = "client!tb", name = "G", descriptor = "[B")
	private byte[] aByteArray85;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class77_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5144(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(21) byte local21 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray85[local24] = local21;
		this.aByteArray85[local25] = local21;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIB)[B")
	public byte[] method5152() {
		this.aByteArray85 = new byte[524288];
		this.method5142();
		return this.aByteArray85;
	}
}
