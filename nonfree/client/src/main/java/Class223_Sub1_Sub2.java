import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class223_Sub1_Sub2 extends Class223_Sub1 {

	@OriginalMember(owner = "client!qm", name = "H", descriptor = "[B")
	private byte[] aByteArray82;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V")
	public Class223_Sub1_Sub2() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "(IIII)[B")
	public byte[] method6931() {
		this.aByteArray82 = new byte[524288];
		this.method6924();
		return this.aByteArray82;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(BII)V")
	@Override
	protected void method6927(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(16) byte local16 = (byte) ((arg0 >> 1 & 0x7F) + 127);
		@Pc(27) int local27 = local7;
		@Pc(28) int local28 = local7 + 1;
		this.aByteArray82[local27] = local16;
		this.aByteArray82[local28] = local16;
	}
}
