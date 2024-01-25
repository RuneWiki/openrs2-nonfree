import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qj")
public final class Class98_Sub2_Sub2 extends Class98_Sub2 {

	@OriginalMember(owner = "client!qj", name = "G", descriptor = "[B")
	private byte[] aByteArray90;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V")
	public Class98_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7055(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(20) byte local20 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local7;
		@Pc(24) int local24 = local7 + 1;
		this.aByteArray90[local23] = local20;
		this.aByteArray90[local24] = local20;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(IIII)[B")
	public byte[] method7058() {
		this.aByteArray90 = new byte[524288];
		this.method7054();
		return this.aByteArray90;
	}
}
