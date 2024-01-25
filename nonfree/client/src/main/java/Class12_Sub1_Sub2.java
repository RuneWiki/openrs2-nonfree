import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class12_Sub1_Sub2 extends Class12_Sub1 {

	@OriginalMember(owner = "client!r", name = "O", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
	public Class12_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)[B")
	public byte[] method6187() {
		this.aByteArray89 = new byte[524288];
		this.method6173();
		return this.aByteArray89;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method6180(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray89[local10] = -1;
		@Pc(21) int local21 = arg1 & 0xFF;
		this.aByteArray89[local11] = (byte) (local21 * 3 >> 5);
	}
}
