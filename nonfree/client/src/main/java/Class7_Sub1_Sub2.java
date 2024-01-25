import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class7_Sub1_Sub2 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ff", name = "H", descriptor = "[B")
	private byte[] aByteArray22;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
	public Class7_Sub1_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZB)V")
	@Override
	protected void method2181(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray22[local19] = -1;
		this.aByteArray22[local20] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZIII)[B")
	public byte[] method2185() {
		this.aByteArray22 = new byte[524288];
		this.method5797();
		return this.aByteArray22;
	}
}
