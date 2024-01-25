import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!id")
public final class Class76_Sub2_Sub1 extends Class76_Sub2 {

	@OriginalMember(owner = "client!id", name = "T", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
	public Class76_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!id", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method2438(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray34[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray34[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!id", name = "c", descriptor = "(IIII)[B")
	public byte[] method2441() {
		this.aByteArray34 = new byte[524288];
		this.method5035();
		return this.aByteArray34;
	}
}
