import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class32_Sub2_Sub2 extends Class32_Sub2 {

	@OriginalMember(owner = "client!oq", name = "F", descriptor = "[B")
	private byte[] aByteArray89;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
	public Class32_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBB)V")
	@Override
	protected void method5623(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(24) int local24 = local16;
		@Pc(25) int local25 = local16 + 1;
		this.aByteArray89[local24] = local12;
		this.aByteArray89[local25] = local12;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IIII)[B")
	public byte[] method5625() {
		this.aByteArray89 = new byte[524288];
		this.method6958();
		return this.aByteArray89;
	}
}
