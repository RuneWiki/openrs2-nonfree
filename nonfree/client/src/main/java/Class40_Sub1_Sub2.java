import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vga")
public final class Class40_Sub1_Sub2 extends Class40_Sub1 {

	@OriginalMember(owner = "client!vga", name = "L", descriptor = "[B")
	private byte[] aByteArray104;

	@OriginalMember(owner = "client!vga", name = "<init>", descriptor = "()V")
	public Class40_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method8837(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(29) int local29 = local7;
		@Pc(30) int local30 = local7 + 1;
		this.aByteArray104[local29] = local16;
		this.aByteArray104[local30] = local16;
	}

	@OriginalMember(owner = "client!vga", name = "a", descriptor = "(IIII)[B")
	public byte[] method8842() {
		this.aByteArray104 = new byte[524288];
		this.method8830((byte) -120);
		return this.aByteArray104;
	}
}
