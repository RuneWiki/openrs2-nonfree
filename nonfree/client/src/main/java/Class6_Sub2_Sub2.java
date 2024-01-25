import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public final class Class6_Sub2_Sub2 extends Class6_Sub2 {

	@OriginalMember(owner = "client!rw", name = "F", descriptor = "[B")
	private byte[] aByteArray83;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
	public Class6_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)[B")
	public byte[] method6634() {
		this.aByteArray83 = new byte[524288];
		this.method6624();
		return this.aByteArray83;
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method6633(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local11;
		@Pc(19) int local19 = local11 + 1;
		this.aByteArray83[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray83[local19] = (byte) (local15 * 3 >> 5);
	}
}
