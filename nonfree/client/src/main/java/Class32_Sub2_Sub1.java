import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class32_Sub2_Sub1 extends Class32_Sub2 {

	@OriginalMember(owner = "client!nn", name = "H", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "()V")
	public Class32_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray87[local19] = local16;
		this.aByteArray87[local20] = local16;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIII)[B")
	public byte[] method5310() {
		this.aByteArray87 = new byte[524288];
		this.method6958();
		return this.aByteArray87;
	}
}
