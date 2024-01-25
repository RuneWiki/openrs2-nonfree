import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class61_Sub1_Sub2 extends Class61_Sub1 {

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "[B")
	private byte[] aByteArray114;

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class61_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(IBZ)V")
	@Override
	protected void method7347(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(11) int local11 = arg0 * 2;
		@Pc(14) int local14 = local11;
		@Pc(15) int local15 = local11 + 1;
		this.aByteArray114[local14] = -1;
		@Pc(21) int local21 = arg1 & 0xFF;
		this.aByteArray114[local15] = (byte) (local21 * 3 >> 5);
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(IIII)[B")
	public byte[] method7350() {
		this.aByteArray114 = new byte[524288];
		this.method7939();
		return this.aByteArray114;
	}
}
