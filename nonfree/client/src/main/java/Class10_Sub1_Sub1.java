import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class10_Sub1_Sub1 extends Class10_Sub1 {

	@OriginalMember(owner = "client!fw", name = "L", descriptor = "[B")
	private byte[] aByteArray66;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "()V")
	public Class10_Sub1_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(BII)V")
	@Override
	protected void method3915(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray66[local10] = -1;
		@Pc(17) int local17 = arg0 & 0xFF;
		this.aByteArray66[local11] = (byte) (local17 * 3 >> 5);
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(IIII)[B")
	public byte[] method2534() {
		this.aByteArray66 = new byte[524288];
		this.method3913();
		return this.aByteArray66;
	}
}
