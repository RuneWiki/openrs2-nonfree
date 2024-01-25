import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class43_Sub2_Sub1 extends Class43_Sub2 {

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "[B")
	private byte[] aByteArray59;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V")
	public Class43_Sub2_Sub1() {
		super(12, 5, 16, 2, 2, 0.45F);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII)[B")
	public byte[] method4551() {
		this.aByteArray59 = new byte[524288];
		this.method8278();
		return this.aByteArray59;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBI)V")
	@Override
	protected void method8284(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		@Pc(7) int local7 = arg0 * 2;
		@Pc(16) byte local16 = (byte) ((arg1 >> 1 & 0x7F) + 127);
		@Pc(19) int local19 = local7;
		@Pc(20) int local20 = local7 + 1;
		this.aByteArray59[local19] = local16;
		this.aByteArray59[local20] = local16;
	}
}
