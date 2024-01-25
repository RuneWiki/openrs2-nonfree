import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lv")
public final class Class139_Sub2_Sub1 extends Class139_Sub2 {

	@OriginalMember(owner = "client!lv", name = "L", descriptor = "[B")
	private byte[] aByteArray52;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "()V")
	public Class139_Sub2_Sub1() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIII)[B")
	public byte[] method4882() {
		this.aByteArray52 = new byte[524288];
		this.method6519();
		return this.aByteArray52;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method6521(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(10) int local10 = local7;
		@Pc(11) int local11 = local7 + 1;
		this.aByteArray52[local10] = -1;
		@Pc(17) int local17 = arg1 & 0xFF;
		this.aByteArray52[local11] = (byte) (local17 * 3 >> 5);
	}
}
