import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class63_Sub2_Sub1 extends Class63_Sub2 {

	@OriginalMember(owner = "client!jp", name = "K", descriptor = "[B")
	private byte[] aByteArray54;

	@OriginalMember(owner = "client!jp", name = "<init>", descriptor = "()V")
	public Class63_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII)[B")
	public byte[] method4250() {
		this.aByteArray54 = new byte[524288];
		this.method5906();
		return this.aByteArray54;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIB)V")
	@Override
	protected void method5910(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(17) int local17 = arg0 * 2;
		@Pc(21) int local21 = arg1 & 0xFF;
		@Pc(24) int local24 = local17;
		@Pc(25) int local25 = local17 + 1;
		this.aByteArray54[local24] = (byte) (local21 * 3 >> 5);
		this.aByteArray54[local25] = (byte) (local21 * 3 >> 5);
	}
}
