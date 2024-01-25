import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class44_Sub2_Sub2 extends Class44_Sub2 {

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "[B")
	private byte[] aByteArray100;

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class44_Sub2_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)[B")
	public byte[] method3339() {
		this.aByteArray100 = new byte[524288];
		this.method4573();
		return this.aByteArray100;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method3337(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(19) int local19 = local16;
		@Pc(20) int local20 = local16 + 1;
		this.aByteArray100[local19] = local12;
		this.aByteArray100[local20] = local12;
	}
}
