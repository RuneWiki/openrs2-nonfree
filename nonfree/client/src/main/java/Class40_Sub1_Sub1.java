import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ii")
public final class Class40_Sub1_Sub1 extends Class40_Sub1 {

	@OriginalMember(owner = "client!ii", name = "L", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ii", name = "<init>", descriptor = "()V")
	public Class40_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8837(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray30[local24] = local16;
		this.aByteArray30[local25] = local16;
	}

	@OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIII)[B")
	public byte[] method3703() {
		this.aByteArray30 = new byte[524288];
		this.method8830((byte) -100);
		return this.aByteArray30;
	}
}
