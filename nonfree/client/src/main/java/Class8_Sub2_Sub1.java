import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class8_Sub2_Sub1 extends Class8_Sub2 {

	@OriginalMember(owner = "client!pa", name = "A", descriptor = "[B")
	private byte[] aByteArray75;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	public Class8_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BII)V")
	@Override
	protected void method7604(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(19) int local19 = arg0 & 0xFF;
		@Pc(22) int local22 = local7;
		@Pc(23) int local23 = local7 + 1;
		this.aByteArray75[local22] = (byte) (local19 * 3 >> 5);
		this.aByteArray75[local23] = (byte) (local19 * 3 >> 5);
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBII)[B")
	public byte[] method6905() {
		this.aByteArray75 = new byte[524288];
		this.method7598();
		return this.aByteArray75;
	}
}
