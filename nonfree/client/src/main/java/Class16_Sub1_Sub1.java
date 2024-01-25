import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aka")
public final class Class16_Sub1_Sub1 extends Class16_Sub1 {

	@OriginalMember(owner = "client!aka", name = "H", descriptor = "[B")
	private byte[] aByteArray4;

	@OriginalMember(owner = "client!aka", name = "<init>", descriptor = "()V")
	public Class16_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IIII)[B")
	public byte[] method295() {
		this.aByteArray4 = new byte[524288];
		this.method7182();
		return this.aByteArray4;
	}

	@OriginalMember(owner = "client!aka", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method1889(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray4[local19] = local16;
		this.aByteArray4[local20] = local16;
	}
}
