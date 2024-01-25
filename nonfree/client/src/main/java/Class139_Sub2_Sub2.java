import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class139_Sub2_Sub2 extends Class139_Sub2 {

	@OriginalMember(owner = "client!qs", name = "K", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "()V")
	public Class139_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIII)[B")
	public byte[] method6527() {
		this.aByteArray82 = new byte[524288];
		this.method6519();
		return this.aByteArray82;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIB)V")
	@Override
	protected void method6521(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(15) int local15 = arg1 & 0xFF;
		@Pc(18) int local18 = local7;
		@Pc(19) int local19 = local7 + 1;
		this.aByteArray82[local18] = (byte) (local15 * 3 >> 5);
		this.aByteArray82[local19] = (byte) (local15 * 3 >> 5);
	}
}
