import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class39_Sub2_Sub1 extends Class39_Sub2 {

	@OriginalMember(owner = "client!kt", name = "J", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V")
	public Class39_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)[B")
	public byte[] method4536() {
		this.aByteArray52 = new byte[524288];
		this.method6746();
		return this.aByteArray52;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray52[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray52[local15] = (byte) (local11 * 3 >> 5);
	}
}
