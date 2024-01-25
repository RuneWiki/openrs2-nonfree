import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!maa")
public final class Class45_Sub2_Sub2 extends Class45_Sub2 {

	@OriginalMember(owner = "client!maa", name = "Q", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!maa", name = "<init>", descriptor = "()V")
	public Class45_Sub2_Sub2() {
		super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method5058(@OriginalArg(1) byte arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 * 2;
		@Pc(11) int local11 = arg0 & 0xFF;
		@Pc(24) int local24 = local7;
		@Pc(25) int local25 = local7 + 1;
		this.aByteArray67[local24] = (byte) (local11 * 3 >> 5);
		this.aByteArray67[local25] = (byte) (local11 * 3 >> 5);
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZIII)[B")
	public byte[] method5061() {
		this.aByteArray67 = new byte[524288];
		this.method7178();
		return this.aByteArray67;
	}
}
