import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ae")
public final class Class7_Sub1_Sub1 extends Class7_Sub1 {

	@OriginalMember(owner = "client!ae", name = "F", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!ae", name = "<init>", descriptor = "()V")
	public Class7_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(ZIII)[B")
	public byte[] method148() {
		this.aByteArray3 = new byte[524288];
		this.method5797();
		return this.aByteArray3;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZB)V")
	@Override
	protected void method2181(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(11) int local11 = arg1 & 0xFF;
		@Pc(14) int local14 = local7;
		@Pc(15) int local15 = local7 + 1;
		this.aByteArray3[local14] = (byte) (local11 * 3 >> 5);
		this.aByteArray3[local15] = (byte) (local11 * 3 >> 5);
	}
}
