import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!caa")
public final class Class25_Sub2_Sub1 extends Class25_Sub2 {

	@OriginalMember(owner = "client!caa", name = "A", descriptor = "[B")
	private byte[] aByteArray21;

	@OriginalMember(owner = "client!caa", name = "<init>", descriptor = "()V")
	public Class25_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!caa", name = "b", descriptor = "(BII)V")
	@Override
	protected void method4067(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray21[local19] = local16;
		this.aByteArray21[local20] = local16;
	}

	@OriginalMember(owner = "client!caa", name = "a", descriptor = "(IIII)[B")
	public byte[] method1113() {
		this.aByteArray21 = new byte[524288];
		this.method4064();
		return this.aByteArray21;
	}
}
