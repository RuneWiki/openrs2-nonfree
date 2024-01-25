import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lh")
public final class Class80_Sub1_Sub1 extends Class80_Sub1 {

	@OriginalMember(owner = "client!lh", name = "F", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V")
	public Class80_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(IIII)[B")
	public byte[] method4853() {
		this.aByteArray61 = new byte[524288];
		this.method8200();
		return this.aByteArray61;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method7314(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray61[local10] = -1;
		@Pc(17) int local17 = arg1 & 0xFF;
		this.aByteArray61[local11] = (byte) (local17 * 3 >> 5);
	}
}
