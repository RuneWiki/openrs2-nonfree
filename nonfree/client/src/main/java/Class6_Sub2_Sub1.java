import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mv")
public final class Class6_Sub2_Sub1 extends Class6_Sub2 {

	@OriginalMember(owner = "client!mv", name = "H", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!mv", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray67[local14] = -1;
		this.aByteArray67[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIII)[B")
	public byte[] method5036() {
		this.aByteArray67 = new byte[524288];
		this.method6624();
		return this.aByteArray67;
	}
}
