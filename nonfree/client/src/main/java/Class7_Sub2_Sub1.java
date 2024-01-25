import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 {

	@OriginalMember(owner = "client!ke", name = "C", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!ke", name = "<init>", descriptor = "()V")
	public Class7_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)[B")
	public byte[] method4486() {
		this.aByteArray45 = new byte[524288];
		this.method5797();
		return this.aByteArray45;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method5806(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(24) int local24 = local16;
		@Pc(25) int local25 = local16 + 1;
		this.aByteArray45[local24] = local12;
		this.aByteArray45[local25] = local12;
	}
}
