import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hg")
public final class Class139_Sub1_Sub1 extends Class139_Sub1 {

	@OriginalMember(owner = "client!hg", name = "G", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
	public Class139_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IZII)[B")
	public byte[] method3132() {
		this.aByteArray32 = new byte[524288];
		this.method6519();
		return this.aByteArray32;
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method4015(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(12) byte local12 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg1 * 2;
		@Pc(25) int local25 = local16;
		@Pc(26) int local26 = local16 + 1;
		this.aByteArray32[local25] = local12;
		this.aByteArray32[local26] = local12;
	}
}
