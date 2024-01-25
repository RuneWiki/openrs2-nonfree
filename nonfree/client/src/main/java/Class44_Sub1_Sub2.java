import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class44_Sub1_Sub2 extends Class44_Sub1 {

	@OriginalMember(owner = "client!ld", name = "I", descriptor = "[B")
	private byte[] aByteArray143;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
	public Class44_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ZBI)V")
	@Override
	protected void method4577(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray143[local19] = -1;
		this.aByteArray143[local20] = (byte) (local16 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(IIII)[B")
	public byte[] method4581() {
		this.aByteArray143 = new byte[524288];
		this.method4573();
		return this.aByteArray143;
	}
}
