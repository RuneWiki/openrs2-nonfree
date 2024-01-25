import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public final class Class67_Sub1_Sub2 extends Class67_Sub1 {

	@OriginalMember(owner = "client!it", name = "L", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!it", name = "<init>", descriptor = "()V")
	public Class67_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method4402(@OriginalArg(1) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(23) byte local23 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = arg0 * 2;
		@Pc(30) int local30 = local27;
		@Pc(31) int local31 = local27 + 1;
		this.aByteArray59[local30] = local23;
		this.aByteArray59[local31] = local23;
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(IIII)[B")
	public byte[] method4406() {
		this.aByteArray59 = new byte[524288];
		this.method6687();
		return this.aByteArray59;
	}
}
