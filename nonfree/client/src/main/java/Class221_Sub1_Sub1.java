import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qca")
public final class Class221_Sub1_Sub1 extends Class221_Sub1 {

	@OriginalMember(owner = "client!qca", name = "G", descriptor = "[B")
	private byte[] aByteArray69;

	@OriginalMember(owner = "client!qca", name = "<init>", descriptor = "()V")
	public Class221_Sub1_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!qca", name = "b", descriptor = "(IIII)[B")
	public byte[] method6753() {
		this.aByteArray69 = new byte[524288];
		this.method7471();
		return this.aByteArray69;
	}

	@OriginalMember(owner = "client!qca", name = "a", descriptor = "(IZB)V")
	@Override
	protected void method7174(@OriginalArg(0) int arg0, @OriginalArg(2) byte arg1) {
		@Pc(12) byte local12 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(16) int local16 = arg0 * 2;
		@Pc(24) int local24 = local16;
		@Pc(25) int local25 = local16 + 1;
		this.aByteArray69[local24] = local12;
		this.aByteArray69[local25] = local12;
	}
}
