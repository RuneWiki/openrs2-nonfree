import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public final class Class101_Sub2_Sub2 extends Class101_Sub2 {

	@OriginalMember(owner = "client!up", name = "I", descriptor = "[B")
	private byte[] aByteArray108;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V")
	public Class101_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(IIBI)[B")
	public byte[] method7256() {
		this.aByteArray108 = new byte[524288];
		this.method7243();
		return this.aByteArray108;
	}

	@OriginalMember(owner = "client!up", name = "a", descriptor = "(BII)V")
	@Override
	protected void method7251(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray108[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray108[local15] = (byte) (local11 * 3 >> 5);
	}
}
