import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class139_Sub1_Sub2 extends Class139_Sub1 {

	@OriginalMember(owner = "client!js", name = "J", descriptor = "[B")
	private byte[] aByteArray44;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "()V")
	public Class139_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method4015(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(18) byte local18 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(22) int local22 = arg1 * 2;
		@Pc(25) int local25 = local22;
		@Pc(26) int local26 = local22 + 1;
		this.aByteArray44[local25] = local18;
		this.aByteArray44[local26] = local18;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZII)[B")
	public byte[] method4018() {
		this.aByteArray44 = new byte[524288];
		this.method6519();
		return this.aByteArray44;
	}
}
