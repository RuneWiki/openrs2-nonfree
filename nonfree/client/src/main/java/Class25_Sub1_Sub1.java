import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 {

	@OriginalMember(owner = "client!av", name = "O", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V")
	public Class25_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBII)[B")
	public byte[] method523() {
		this.aByteArray8 = new byte[524288];
		this.method4064();
		return this.aByteArray8;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method1164(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) int local16 = arg0 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray8[local19] = (byte) (local16 * 3 >> 5);
		this.aByteArray8[local20] = (byte) (local16 * 3 >> 5);
	}
}
