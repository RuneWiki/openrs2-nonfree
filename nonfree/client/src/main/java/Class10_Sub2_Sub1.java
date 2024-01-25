import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class10_Sub2_Sub1 extends Class10_Sub2 {

	@OriginalMember(owner = "client!ob", name = "J", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "()V")
	public Class10_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BIII)[B")
	public byte[] method5244() {
		this.aByteArray61 = new byte[524288];
		this.method7696();
		return this.aByteArray61;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method7701(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray61[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray61[local19] = (byte) (local15 * 3 >> 5);
	}
}
