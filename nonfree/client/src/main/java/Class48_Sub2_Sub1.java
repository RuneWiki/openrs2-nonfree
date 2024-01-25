import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class48_Sub2_Sub1 extends Class48_Sub2 {

	@OriginalMember(owner = "client!qi", name = "G", descriptor = "[B")
	private byte[] aByteArray74;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
	public Class48_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(BBI)V")
	@Override
	protected void method4408(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(20) byte local20 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(24) int local24 = arg1 * 2;
		@Pc(27) int local27 = local24;
		@Pc(28) int local28 = local24 + 1;
		this.aByteArray74[local27] = local20;
		this.aByteArray74[local28] = local20;
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(BIII)[B")
	public byte[] method4412() {
		this.aByteArray74 = new byte[524288];
		this.method4400();
		return this.aByteArray74;
	}
}
