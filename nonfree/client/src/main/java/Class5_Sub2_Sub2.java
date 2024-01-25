import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public final class Class5_Sub2_Sub2 extends Class5_Sub2 {

	@OriginalMember(owner = "client!gj", name = "L", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
	public Class5_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(BZI)V")
	@Override
	protected void method2408(@OriginalArg(0) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray40[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray40[local15] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "(IIII)[B")
	public byte[] method2412() {
		this.aByteArray40 = new byte[524288];
		this.method5028();
		return this.aByteArray40;
	}
}
