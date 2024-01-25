import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sq")
public final class Class15_Sub2_Sub1 extends Class15_Sub2 {

	@OriginalMember(owner = "client!sq", name = "F", descriptor = "[B")
	private byte[] aByteArray88;

	@OriginalMember(owner = "client!sq", name = "<init>", descriptor = "()V")
	public Class15_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(IIII)[B")
	public byte[] method7564() {
		this.aByteArray88 = new byte[524288];
		this.method8197();
		return this.aByteArray88;
	}

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(ZBI)V")
	@Override
	protected void method8208(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(23) int local23 = local7;
		@Pc(24) int local24 = local7 + 1;
		this.aByteArray88[local23] = local16;
		this.aByteArray88[local24] = local16;
	}
}
