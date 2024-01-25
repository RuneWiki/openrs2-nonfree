import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class74_Sub1_Sub2 extends Class74_Sub1 {

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "[B")
	private byte[] aByteArray136;

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
	public Class74_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBII)[B")
	public byte[] method9055() {
		this.aByteArray136 = new byte[524288];
		this.method9043();
		return this.aByteArray136;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIB)V")
	@Override
	protected void method9051(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray136[local19] = local12;
		this.aByteArray136[local20] = local12;
	}
}
