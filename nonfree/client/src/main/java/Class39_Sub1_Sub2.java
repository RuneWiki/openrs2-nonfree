import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jo")
public final class Class39_Sub1_Sub2 extends Class39_Sub1 {

	@OriginalMember(owner = "client!jo", name = "D", descriptor = "[B")
	private byte[] aByteArray43;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "()V")
	public Class39_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIII)[B")
	public byte[] method4083() {
		this.aByteArray43 = new byte[524288];
		this.method6746();
		return this.aByteArray43;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(BII)V")
	@Override
	protected void method4078(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray43[local19] = local16;
		this.aByteArray43[local20] = local16;
	}
}
