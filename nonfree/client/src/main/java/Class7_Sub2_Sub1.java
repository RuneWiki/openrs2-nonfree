import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 {

	@OriginalMember(owner = "client!rl", name = "J", descriptor = "[B")
	private byte[] aByteArray78;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V")
	public Class7_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4962(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(22) byte local22 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(25) int local25 = local7;
		@Pc(26) int local26 = local7 + 1;
		this.aByteArray78[local25] = local22;
		this.aByteArray78[local26] = local22;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIB)[B")
	public byte[] method4966() {
		this.aByteArray78 = new byte[524288];
		this.method4956();
		return this.aByteArray78;
	}
}
